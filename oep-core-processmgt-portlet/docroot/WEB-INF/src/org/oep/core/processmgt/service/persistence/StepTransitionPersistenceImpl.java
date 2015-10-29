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

import org.oep.core.processmgt.NoSuchStepTransitionException;
import org.oep.core.processmgt.model.StepTransition;
import org.oep.core.processmgt.model.impl.StepTransitionImpl;
import org.oep.core.processmgt.model.impl.StepTransitionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the step transition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see StepTransitionPersistence
 * @see StepTransitionUtil
 * @generated
 */
public class StepTransitionPersistenceImpl extends BasePersistenceImpl<StepTransition>
	implements StepTransitionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StepTransitionUtil} to access the step transition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StepTransitionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StepTransitionModelImpl.ENTITY_CACHE_ENABLED,
			StepTransitionModelImpl.FINDER_CACHE_ENABLED,
			StepTransitionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StepTransitionModelImpl.ENTITY_CACHE_ENABLED,
			StepTransitionModelImpl.FINDER_CACHE_ENABLED,
			StepTransitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StepTransitionModelImpl.ENTITY_CACHE_ENABLED,
			StepTransitionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public StepTransitionPersistenceImpl() {
		setModelClass(StepTransition.class);
	}

	/**
	 * Caches the step transition in the entity cache if it is enabled.
	 *
	 * @param stepTransition the step transition
	 */
	@Override
	public void cacheResult(StepTransition stepTransition) {
		EntityCacheUtil.putResult(StepTransitionModelImpl.ENTITY_CACHE_ENABLED,
			StepTransitionImpl.class, stepTransition.getPrimaryKey(),
			stepTransition);

		stepTransition.resetOriginalValues();
	}

	/**
	 * Caches the step transitions in the entity cache if it is enabled.
	 *
	 * @param stepTransitions the step transitions
	 */
	@Override
	public void cacheResult(List<StepTransition> stepTransitions) {
		for (StepTransition stepTransition : stepTransitions) {
			if (EntityCacheUtil.getResult(
						StepTransitionModelImpl.ENTITY_CACHE_ENABLED,
						StepTransitionImpl.class, stepTransition.getPrimaryKey()) == null) {
				cacheResult(stepTransition);
			}
			else {
				stepTransition.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all step transitions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StepTransitionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StepTransitionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the step transition.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StepTransition stepTransition) {
		EntityCacheUtil.removeResult(StepTransitionModelImpl.ENTITY_CACHE_ENABLED,
			StepTransitionImpl.class, stepTransition.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<StepTransition> stepTransitions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StepTransition stepTransition : stepTransitions) {
			EntityCacheUtil.removeResult(StepTransitionModelImpl.ENTITY_CACHE_ENABLED,
				StepTransitionImpl.class, stepTransition.getPrimaryKey());
		}
	}

	/**
	 * Creates a new step transition with the primary key. Does not add the step transition to the database.
	 *
	 * @param stepTransitionId the primary key for the new step transition
	 * @return the new step transition
	 */
	@Override
	public StepTransition create(long stepTransitionId) {
		StepTransition stepTransition = new StepTransitionImpl();

		stepTransition.setNew(true);
		stepTransition.setPrimaryKey(stepTransitionId);

		return stepTransition;
	}

	/**
	 * Removes the step transition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param stepTransitionId the primary key of the step transition
	 * @return the step transition that was removed
	 * @throws org.oep.core.processmgt.NoSuchStepTransitionException if a step transition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepTransition remove(long stepTransitionId)
		throws NoSuchStepTransitionException, SystemException {
		return remove((Serializable)stepTransitionId);
	}

	/**
	 * Removes the step transition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the step transition
	 * @return the step transition that was removed
	 * @throws org.oep.core.processmgt.NoSuchStepTransitionException if a step transition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepTransition remove(Serializable primaryKey)
		throws NoSuchStepTransitionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			StepTransition stepTransition = (StepTransition)session.get(StepTransitionImpl.class,
					primaryKey);

			if (stepTransition == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStepTransitionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(stepTransition);
		}
		catch (NoSuchStepTransitionException nsee) {
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
	protected StepTransition removeImpl(StepTransition stepTransition)
		throws SystemException {
		stepTransition = toUnwrappedModel(stepTransition);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(stepTransition)) {
				stepTransition = (StepTransition)session.get(StepTransitionImpl.class,
						stepTransition.getPrimaryKeyObj());
			}

			if (stepTransition != null) {
				session.delete(stepTransition);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (stepTransition != null) {
			clearCache(stepTransition);
		}

		return stepTransition;
	}

	@Override
	public StepTransition updateImpl(
		org.oep.core.processmgt.model.StepTransition stepTransition)
		throws SystemException {
		stepTransition = toUnwrappedModel(stepTransition);

		boolean isNew = stepTransition.isNew();

		Session session = null;

		try {
			session = openSession();

			if (stepTransition.isNew()) {
				session.save(stepTransition);

				stepTransition.setNew(false);
			}
			else {
				session.merge(stepTransition);
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

		EntityCacheUtil.putResult(StepTransitionModelImpl.ENTITY_CACHE_ENABLED,
			StepTransitionImpl.class, stepTransition.getPrimaryKey(),
			stepTransition);

		return stepTransition;
	}

	protected StepTransition toUnwrappedModel(StepTransition stepTransition) {
		if (stepTransition instanceof StepTransitionImpl) {
			return stepTransition;
		}

		StepTransitionImpl stepTransitionImpl = new StepTransitionImpl();

		stepTransitionImpl.setNew(stepTransition.isNew());
		stepTransitionImpl.setPrimaryKey(stepTransition.getPrimaryKey());

		stepTransitionImpl.setStepTransitionId(stepTransition.getStepTransitionId());
		stepTransitionImpl.setUserId(stepTransition.getUserId());
		stepTransitionImpl.setGroupId(stepTransition.getGroupId());
		stepTransitionImpl.setCompanyId(stepTransition.getCompanyId());
		stepTransitionImpl.setCreateDate(stepTransition.getCreateDate());
		stepTransitionImpl.setModifiedDate(stepTransition.getModifiedDate());
		stepTransitionImpl.setDossierProcessId(stepTransition.getDossierProcessId());
		stepTransitionImpl.setPreDossierStepId(stepTransition.getPreDossierStepId());
		stepTransitionImpl.setPostDossierStepId(stepTransition.getPostDossierStepId());
		stepTransitionImpl.setAutoCondition(stepTransition.getAutoCondition());
		stepTransitionImpl.setTransitionName(stepTransition.getTransitionName());
		stepTransitionImpl.setDossierStatus(stepTransition.getDossierStatus());
		stepTransitionImpl.setSendResults(stepTransition.getSendResults());
		stepTransitionImpl.setUserAssignment(stepTransition.getUserAssignment());
		stepTransitionImpl.setNewProcessOrder(stepTransition.getNewProcessOrder());

		return stepTransitionImpl;
	}

	/**
	 * Returns the step transition with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the step transition
	 * @return the step transition
	 * @throws org.oep.core.processmgt.NoSuchStepTransitionException if a step transition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepTransition findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStepTransitionException, SystemException {
		StepTransition stepTransition = fetchByPrimaryKey(primaryKey);

		if (stepTransition == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStepTransitionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return stepTransition;
	}

	/**
	 * Returns the step transition with the primary key or throws a {@link org.oep.core.processmgt.NoSuchStepTransitionException} if it could not be found.
	 *
	 * @param stepTransitionId the primary key of the step transition
	 * @return the step transition
	 * @throws org.oep.core.processmgt.NoSuchStepTransitionException if a step transition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepTransition findByPrimaryKey(long stepTransitionId)
		throws NoSuchStepTransitionException, SystemException {
		return findByPrimaryKey((Serializable)stepTransitionId);
	}

	/**
	 * Returns the step transition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the step transition
	 * @return the step transition, or <code>null</code> if a step transition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepTransition fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		StepTransition stepTransition = (StepTransition)EntityCacheUtil.getResult(StepTransitionModelImpl.ENTITY_CACHE_ENABLED,
				StepTransitionImpl.class, primaryKey);

		if (stepTransition == _nullStepTransition) {
			return null;
		}

		if (stepTransition == null) {
			Session session = null;

			try {
				session = openSession();

				stepTransition = (StepTransition)session.get(StepTransitionImpl.class,
						primaryKey);

				if (stepTransition != null) {
					cacheResult(stepTransition);
				}
				else {
					EntityCacheUtil.putResult(StepTransitionModelImpl.ENTITY_CACHE_ENABLED,
						StepTransitionImpl.class, primaryKey,
						_nullStepTransition);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StepTransitionModelImpl.ENTITY_CACHE_ENABLED,
					StepTransitionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return stepTransition;
	}

	/**
	 * Returns the step transition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param stepTransitionId the primary key of the step transition
	 * @return the step transition, or <code>null</code> if a step transition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepTransition fetchByPrimaryKey(long stepTransitionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)stepTransitionId);
	}

	/**
	 * Returns all the step transitions.
	 *
	 * @return the step transitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StepTransition> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the step transitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.StepTransitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of step transitions
	 * @param end the upper bound of the range of step transitions (not inclusive)
	 * @return the range of step transitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StepTransition> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the step transitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.StepTransitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of step transitions
	 * @param end the upper bound of the range of step transitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of step transitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StepTransition> findAll(int start, int end,
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

		List<StepTransition> list = (List<StepTransition>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STEPTRANSITION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STEPTRANSITION;

				if (pagination) {
					sql = sql.concat(StepTransitionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StepTransition>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StepTransition>(list);
				}
				else {
					list = (List<StepTransition>)QueryUtil.list(q,
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
	 * Removes all the step transitions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (StepTransition stepTransition : findAll()) {
			remove(stepTransition);
		}
	}

	/**
	 * Returns the number of step transitions.
	 *
	 * @return the number of step transitions
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

				Query q = session.createQuery(_SQL_COUNT_STEPTRANSITION);

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
	 * Initializes the step transition persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.processmgt.model.StepTransition")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<StepTransition>> listenersList = new ArrayList<ModelListener<StepTransition>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<StepTransition>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(StepTransitionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_STEPTRANSITION = "SELECT stepTransition FROM StepTransition stepTransition";
	private static final String _SQL_COUNT_STEPTRANSITION = "SELECT COUNT(stepTransition) FROM StepTransition stepTransition";
	private static final String _ORDER_BY_ENTITY_ALIAS = "stepTransition.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StepTransition exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StepTransitionPersistenceImpl.class);
	private static StepTransition _nullStepTransition = new StepTransitionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<StepTransition> toCacheModel() {
				return _nullStepTransitionCacheModel;
			}
		};

	private static CacheModel<StepTransition> _nullStepTransitionCacheModel = new CacheModel<StepTransition>() {
			@Override
			public StepTransition toEntityModel() {
				return _nullStepTransition;
			}
		};
}