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

import org.oep.core.processmgt.NoSuchDossierStepException;
import org.oep.core.processmgt.model.DossierStep;
import org.oep.core.processmgt.model.impl.DossierStepImpl;
import org.oep.core.processmgt.model.impl.DossierStepModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier step service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierStepPersistence
 * @see DossierStepUtil
 * @generated
 */
public class DossierStepPersistenceImpl extends BasePersistenceImpl<DossierStep>
	implements DossierStepPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierStepUtil} to access the dossier step persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierStepImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierStepModelImpl.ENTITY_CACHE_ENABLED,
			DossierStepModelImpl.FINDER_CACHE_ENABLED, DossierStepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierStepModelImpl.ENTITY_CACHE_ENABLED,
			DossierStepModelImpl.FINDER_CACHE_ENABLED, DossierStepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierStepModelImpl.ENTITY_CACHE_ENABLED,
			DossierStepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierStepPersistenceImpl() {
		setModelClass(DossierStep.class);
	}

	/**
	 * Caches the dossier step in the entity cache if it is enabled.
	 *
	 * @param dossierStep the dossier step
	 */
	@Override
	public void cacheResult(DossierStep dossierStep) {
		EntityCacheUtil.putResult(DossierStepModelImpl.ENTITY_CACHE_ENABLED,
			DossierStepImpl.class, dossierStep.getPrimaryKey(), dossierStep);

		dossierStep.resetOriginalValues();
	}

	/**
	 * Caches the dossier steps in the entity cache if it is enabled.
	 *
	 * @param dossierSteps the dossier steps
	 */
	@Override
	public void cacheResult(List<DossierStep> dossierSteps) {
		for (DossierStep dossierStep : dossierSteps) {
			if (EntityCacheUtil.getResult(
						DossierStepModelImpl.ENTITY_CACHE_ENABLED,
						DossierStepImpl.class, dossierStep.getPrimaryKey()) == null) {
				cacheResult(dossierStep);
			}
			else {
				dossierStep.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier steps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierStepImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierStepImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier step.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierStep dossierStep) {
		EntityCacheUtil.removeResult(DossierStepModelImpl.ENTITY_CACHE_ENABLED,
			DossierStepImpl.class, dossierStep.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierStep> dossierSteps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierStep dossierStep : dossierSteps) {
			EntityCacheUtil.removeResult(DossierStepModelImpl.ENTITY_CACHE_ENABLED,
				DossierStepImpl.class, dossierStep.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier step with the primary key. Does not add the dossier step to the database.
	 *
	 * @param dossierStepId the primary key for the new dossier step
	 * @return the new dossier step
	 */
	@Override
	public DossierStep create(long dossierStepId) {
		DossierStep dossierStep = new DossierStepImpl();

		dossierStep.setNew(true);
		dossierStep.setPrimaryKey(dossierStepId);

		return dossierStep;
	}

	/**
	 * Removes the dossier step with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierStepId the primary key of the dossier step
	 * @return the dossier step that was removed
	 * @throws org.oep.core.processmgt.NoSuchDossierStepException if a dossier step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierStep remove(long dossierStepId)
		throws NoSuchDossierStepException, SystemException {
		return remove((Serializable)dossierStepId);
	}

	/**
	 * Removes the dossier step with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier step
	 * @return the dossier step that was removed
	 * @throws org.oep.core.processmgt.NoSuchDossierStepException if a dossier step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierStep remove(Serializable primaryKey)
		throws NoSuchDossierStepException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierStep dossierStep = (DossierStep)session.get(DossierStepImpl.class,
					primaryKey);

			if (dossierStep == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierStepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierStep);
		}
		catch (NoSuchDossierStepException nsee) {
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
	protected DossierStep removeImpl(DossierStep dossierStep)
		throws SystemException {
		dossierStep = toUnwrappedModel(dossierStep);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierStep)) {
				dossierStep = (DossierStep)session.get(DossierStepImpl.class,
						dossierStep.getPrimaryKeyObj());
			}

			if (dossierStep != null) {
				session.delete(dossierStep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierStep != null) {
			clearCache(dossierStep);
		}

		return dossierStep;
	}

	@Override
	public DossierStep updateImpl(
		org.oep.core.processmgt.model.DossierStep dossierStep)
		throws SystemException {
		dossierStep = toUnwrappedModel(dossierStep);

		boolean isNew = dossierStep.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierStep.isNew()) {
				session.save(dossierStep);

				dossierStep.setNew(false);
			}
			else {
				session.merge(dossierStep);
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

		EntityCacheUtil.putResult(DossierStepModelImpl.ENTITY_CACHE_ENABLED,
			DossierStepImpl.class, dossierStep.getPrimaryKey(), dossierStep);

		return dossierStep;
	}

	protected DossierStep toUnwrappedModel(DossierStep dossierStep) {
		if (dossierStep instanceof DossierStepImpl) {
			return dossierStep;
		}

		DossierStepImpl dossierStepImpl = new DossierStepImpl();

		dossierStepImpl.setNew(dossierStep.isNew());
		dossierStepImpl.setPrimaryKey(dossierStep.getPrimaryKey());

		dossierStepImpl.setDossierStepId(dossierStep.getDossierStepId());
		dossierStepImpl.setUserId(dossierStep.getUserId());
		dossierStepImpl.setGroupId(dossierStep.getGroupId());
		dossierStepImpl.setCompanyId(dossierStep.getCompanyId());
		dossierStepImpl.setCreateDate(dossierStep.getCreateDate());
		dossierStepImpl.setModifiedDate(dossierStep.getModifiedDate());
		dossierStepImpl.setDossierProcessId(dossierStep.getDossierProcessId());
		dossierStepImpl.setTitle(dossierStep.getTitle());
		dossierStepImpl.setSequenceNo(dossierStep.getSequenceNo());
		dossierStepImpl.setStepType(dossierStep.getStepType());
		dossierStepImpl.setDoForm(dossierStep.getDoForm());

		return dossierStepImpl;
	}

	/**
	 * Returns the dossier step with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier step
	 * @return the dossier step
	 * @throws org.oep.core.processmgt.NoSuchDossierStepException if a dossier step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierStep findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierStepException, SystemException {
		DossierStep dossierStep = fetchByPrimaryKey(primaryKey);

		if (dossierStep == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierStepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierStep;
	}

	/**
	 * Returns the dossier step with the primary key or throws a {@link org.oep.core.processmgt.NoSuchDossierStepException} if it could not be found.
	 *
	 * @param dossierStepId the primary key of the dossier step
	 * @return the dossier step
	 * @throws org.oep.core.processmgt.NoSuchDossierStepException if a dossier step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierStep findByPrimaryKey(long dossierStepId)
		throws NoSuchDossierStepException, SystemException {
		return findByPrimaryKey((Serializable)dossierStepId);
	}

	/**
	 * Returns the dossier step with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier step
	 * @return the dossier step, or <code>null</code> if a dossier step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierStep fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierStep dossierStep = (DossierStep)EntityCacheUtil.getResult(DossierStepModelImpl.ENTITY_CACHE_ENABLED,
				DossierStepImpl.class, primaryKey);

		if (dossierStep == _nullDossierStep) {
			return null;
		}

		if (dossierStep == null) {
			Session session = null;

			try {
				session = openSession();

				dossierStep = (DossierStep)session.get(DossierStepImpl.class,
						primaryKey);

				if (dossierStep != null) {
					cacheResult(dossierStep);
				}
				else {
					EntityCacheUtil.putResult(DossierStepModelImpl.ENTITY_CACHE_ENABLED,
						DossierStepImpl.class, primaryKey, _nullDossierStep);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierStepModelImpl.ENTITY_CACHE_ENABLED,
					DossierStepImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierStep;
	}

	/**
	 * Returns the dossier step with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierStepId the primary key of the dossier step
	 * @return the dossier step, or <code>null</code> if a dossier step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierStep fetchByPrimaryKey(long dossierStepId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierStepId);
	}

	/**
	 * Returns all the dossier steps.
	 *
	 * @return the dossier steps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierStep> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier steps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier steps
	 * @param end the upper bound of the range of dossier steps (not inclusive)
	 * @return the range of dossier steps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierStep> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier steps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier steps
	 * @param end the upper bound of the range of dossier steps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier steps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierStep> findAll(int start, int end,
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

		List<DossierStep> list = (List<DossierStep>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERSTEP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERSTEP;

				if (pagination) {
					sql = sql.concat(DossierStepModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierStep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierStep>(list);
				}
				else {
					list = (List<DossierStep>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the dossier steps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierStep dossierStep : findAll()) {
			remove(dossierStep);
		}
	}

	/**
	 * Returns the number of dossier steps.
	 *
	 * @return the number of dossier steps
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERSTEP);

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
	 * Initializes the dossier step persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.processmgt.model.DossierStep")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierStep>> listenersList = new ArrayList<ModelListener<DossierStep>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierStep>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierStepImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERSTEP = "SELECT dossierStep FROM DossierStep dossierStep";
	private static final String _SQL_COUNT_DOSSIERSTEP = "SELECT COUNT(dossierStep) FROM DossierStep dossierStep";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierStep.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierStep exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierStepPersistenceImpl.class);
	private static DossierStep _nullDossierStep = new DossierStepImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierStep> toCacheModel() {
				return _nullDossierStepCacheModel;
			}
		};

	private static CacheModel<DossierStep> _nullDossierStepCacheModel = new CacheModel<DossierStep>() {
			@Override
			public DossierStep toEntityModel() {
				return _nullDossierStep;
			}
		};
}