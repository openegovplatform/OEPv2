/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.oep.core.processmgt.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.core.processmgt.NoSuchTransitionHistoryException;
import org.oep.core.processmgt.model.TransitionHistory;
import org.oep.core.processmgt.model.impl.TransitionHistoryImpl;
import org.oep.core.processmgt.model.impl.TransitionHistoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the transition history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see TransitionHistoryPersistence
 * @see TransitionHistoryUtil
 * @generated
 */
public class TransitionHistoryPersistenceImpl extends BasePersistenceImpl<TransitionHistory>
	implements TransitionHistoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TransitionHistoryUtil} to access the transition history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TransitionHistoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TransitionHistoryModelImpl.ENTITY_CACHE_ENABLED,
			TransitionHistoryModelImpl.FINDER_CACHE_ENABLED,
			TransitionHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TransitionHistoryModelImpl.ENTITY_CACHE_ENABLED,
			TransitionHistoryModelImpl.FINDER_CACHE_ENABLED,
			TransitionHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TransitionHistoryModelImpl.ENTITY_CACHE_ENABLED,
			TransitionHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TransitionHistoryPersistenceImpl() {
		setModelClass(TransitionHistory.class);
	}

	/**
	 * Caches the transition history in the entity cache if it is enabled.
	 *
	 * @param transitionHistory the transition history
	 */
	@Override
	public void cacheResult(TransitionHistory transitionHistory) {
		EntityCacheUtil.putResult(TransitionHistoryModelImpl.ENTITY_CACHE_ENABLED,
			TransitionHistoryImpl.class, transitionHistory.getPrimaryKey(),
			transitionHistory);

		transitionHistory.resetOriginalValues();
	}

	/**
	 * Caches the transition histories in the entity cache if it is enabled.
	 *
	 * @param transitionHistories the transition histories
	 */
	@Override
	public void cacheResult(List<TransitionHistory> transitionHistories) {
		for (TransitionHistory transitionHistory : transitionHistories) {
			if (EntityCacheUtil.getResult(
						TransitionHistoryModelImpl.ENTITY_CACHE_ENABLED,
						TransitionHistoryImpl.class,
						transitionHistory.getPrimaryKey()) == null) {
				cacheResult(transitionHistory);
			}
			else {
				transitionHistory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all transition histories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TransitionHistoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TransitionHistoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the transition history.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TransitionHistory transitionHistory) {
		EntityCacheUtil.removeResult(TransitionHistoryModelImpl.ENTITY_CACHE_ENABLED,
			TransitionHistoryImpl.class, transitionHistory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TransitionHistory> transitionHistories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TransitionHistory transitionHistory : transitionHistories) {
			EntityCacheUtil.removeResult(TransitionHistoryModelImpl.ENTITY_CACHE_ENABLED,
				TransitionHistoryImpl.class, transitionHistory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new transition history with the primary key. Does not add the transition history to the database.
	 *
	 * @param transitionHistoryId the primary key for the new transition history
	 * @return the new transition history
	 */
	@Override
	public TransitionHistory create(long transitionHistoryId) {
		TransitionHistory transitionHistory = new TransitionHistoryImpl();

		transitionHistory.setNew(true);
		transitionHistory.setPrimaryKey(transitionHistoryId);

		return transitionHistory;
	}

	/**
	 * Removes the transition history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param transitionHistoryId the primary key of the transition history
	 * @return the transition history that was removed
	 * @throws org.oep.core.processmgt.NoSuchTransitionHistoryException if a transition history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TransitionHistory remove(long transitionHistoryId)
		throws NoSuchTransitionHistoryException, SystemException {
		return remove((Serializable)transitionHistoryId);
	}

	/**
	 * Removes the transition history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the transition history
	 * @return the transition history that was removed
	 * @throws org.oep.core.processmgt.NoSuchTransitionHistoryException if a transition history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TransitionHistory remove(Serializable primaryKey)
		throws NoSuchTransitionHistoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TransitionHistory transitionHistory = (TransitionHistory)session.get(TransitionHistoryImpl.class,
					primaryKey);

			if (transitionHistory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTransitionHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(transitionHistory);
		}
		catch (NoSuchTransitionHistoryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TransitionHistory removeImpl(TransitionHistory transitionHistory)
		throws SystemException {
		transitionHistory = toUnwrappedModel(transitionHistory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(transitionHistory)) {
				transitionHistory = (TransitionHistory)session.get(TransitionHistoryImpl.class,
						transitionHistory.getPrimaryKeyObj());
			}

			if (transitionHistory != null) {
				session.delete(transitionHistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (transitionHistory != null) {
			clearCache(transitionHistory);
		}

		return transitionHistory;
	}

	@Override
	public TransitionHistory updateImpl(
		org.oep.core.processmgt.model.TransitionHistory transitionHistory)
		throws SystemException {
		transitionHistory = toUnwrappedModel(transitionHistory);

		boolean isNew = transitionHistory.isNew();

		Session session = null;

		try {
			session = openSession();

			if (transitionHistory.isNew()) {
				session.save(transitionHistory);

				transitionHistory.setNew(false);
			}
			else {
				session.merge(transitionHistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(TransitionHistoryModelImpl.ENTITY_CACHE_ENABLED,
			TransitionHistoryImpl.class, transitionHistory.getPrimaryKey(),
			transitionHistory);

		return transitionHistory;
	}

	protected TransitionHistory toUnwrappedModel(
		TransitionHistory transitionHistory) {
		if (transitionHistory instanceof TransitionHistoryImpl) {
			return transitionHistory;
		}

		TransitionHistoryImpl transitionHistoryImpl = new TransitionHistoryImpl();

		transitionHistoryImpl.setNew(transitionHistory.isNew());
		transitionHistoryImpl.setPrimaryKey(transitionHistory.getPrimaryKey());

		transitionHistoryImpl.setTransitionHistoryId(transitionHistory.getTransitionHistoryId());
		transitionHistoryImpl.setUserId(transitionHistory.getUserId());
		transitionHistoryImpl.setGroupId(transitionHistory.getGroupId());
		transitionHistoryImpl.setCompanyId(transitionHistory.getCompanyId());
		transitionHistoryImpl.setCreateDate(transitionHistory.getCreateDate());
		transitionHistoryImpl.setDossierId(transitionHistory.getDossierId());
		transitionHistoryImpl.setProcessOrderId(transitionHistory.getProcessOrderId());
		transitionHistoryImpl.setDaysDoing(transitionHistory.getDaysDoing());
		transitionHistoryImpl.setDaysDelay(transitionHistory.getDaysDelay());
		transitionHistoryImpl.setStartDate(transitionHistory.getStartDate());
		transitionHistoryImpl.setStepTransitionId(transitionHistory.getStepTransitionId());
		transitionHistoryImpl.setPreDossierStepId(transitionHistory.getPreDossierStepId());
		transitionHistoryImpl.setPostDossierStepId(transitionHistory.getPostDossierStepId());
		transitionHistoryImpl.setTransitionName(transitionHistory.getTransitionName());
		transitionHistoryImpl.setNote(transitionHistory.getNote());

		return transitionHistoryImpl;
	}

	/**
	 * Returns the transition history with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the transition history
	 * @return the transition history
	 * @throws org.oep.core.processmgt.NoSuchTransitionHistoryException if a transition history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TransitionHistory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTransitionHistoryException, SystemException {
		TransitionHistory transitionHistory = fetchByPrimaryKey(primaryKey);

		if (transitionHistory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTransitionHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return transitionHistory;
	}

	/**
	 * Returns the transition history with the primary key or throws a {@link org.oep.core.processmgt.NoSuchTransitionHistoryException} if it could not be found.
	 *
	 * @param transitionHistoryId the primary key of the transition history
	 * @return the transition history
	 * @throws org.oep.core.processmgt.NoSuchTransitionHistoryException if a transition history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TransitionHistory findByPrimaryKey(long transitionHistoryId)
		throws NoSuchTransitionHistoryException, SystemException {
		return findByPrimaryKey((Serializable)transitionHistoryId);
	}

	/**
	 * Returns the transition history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the transition history
	 * @return the transition history, or <code>null</code> if a transition history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TransitionHistory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TransitionHistory transitionHistory = (TransitionHistory)EntityCacheUtil.getResult(TransitionHistoryModelImpl.ENTITY_CACHE_ENABLED,
				TransitionHistoryImpl.class, primaryKey);

		if (transitionHistory == _nullTransitionHistory) {
			return null;
		}

		if (transitionHistory == null) {
			Session session = null;

			try {
				session = openSession();

				transitionHistory = (TransitionHistory)session.get(TransitionHistoryImpl.class,
						primaryKey);

				if (transitionHistory != null) {
					cacheResult(transitionHistory);
				}
				else {
					EntityCacheUtil.putResult(TransitionHistoryModelImpl.ENTITY_CACHE_ENABLED,
						TransitionHistoryImpl.class, primaryKey,
						_nullTransitionHistory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TransitionHistoryModelImpl.ENTITY_CACHE_ENABLED,
					TransitionHistoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return transitionHistory;
	}

	/**
	 * Returns the transition history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param transitionHistoryId the primary key of the transition history
	 * @return the transition history, or <code>null</code> if a transition history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TransitionHistory fetchByPrimaryKey(long transitionHistoryId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)transitionHistoryId);
	}

	/**
	 * Returns all the transition histories.
	 *
	 * @return the transition histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TransitionHistory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the transition histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.TransitionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of transition histories
	 * @param end the upper bound of the range of transition histories (not inclusive)
	 * @return the range of transition histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TransitionHistory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the transition histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.TransitionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of transition histories
	 * @param end the upper bound of the range of transition histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of transition histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TransitionHistory> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<TransitionHistory> list = (List<TransitionHistory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TRANSITIONHISTORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRANSITIONHISTORY;

				if (pagination) {
					sql = sql.concat(TransitionHistoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TransitionHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TransitionHistory>(list);
				}
				else {
					list = (List<TransitionHistory>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the transition histories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TransitionHistory transitionHistory : findAll()) {
			remove(transitionHistory);
		}
	}

	/**
	 * Returns the number of transition histories.
	 *
	 * @return the number of transition histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TRANSITIONHISTORY);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the transition history persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.processmgt.model.TransitionHistory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TransitionHistory>> listenersList = new ArrayList<ModelListener<TransitionHistory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TransitionHistory>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(TransitionHistoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TRANSITIONHISTORY = "SELECT transitionHistory FROM TransitionHistory transitionHistory";
	private static final String _SQL_COUNT_TRANSITIONHISTORY = "SELECT COUNT(transitionHistory) FROM TransitionHistory transitionHistory";
	private static final String _ORDER_BY_ENTITY_ALIAS = "transitionHistory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TransitionHistory exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TransitionHistoryPersistenceImpl.class);
	private static TransitionHistory _nullTransitionHistory = new TransitionHistoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TransitionHistory> toCacheModel() {
				return _nullTransitionHistoryCacheModel;
			}
		};

	private static CacheModel<TransitionHistory> _nullTransitionHistoryCacheModel =
		new CacheModel<TransitionHistory>() {
			@Override
			public TransitionHistory toEntityModel() {
				return _nullTransitionHistory;
			}
		};
}