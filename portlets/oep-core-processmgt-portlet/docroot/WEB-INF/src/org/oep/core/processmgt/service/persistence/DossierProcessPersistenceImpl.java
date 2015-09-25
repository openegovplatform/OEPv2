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

import org.oep.core.processmgt.NoSuchDossierProcessException;
import org.oep.core.processmgt.model.DossierProcess;
import org.oep.core.processmgt.model.impl.DossierProcessImpl;
import org.oep.core.processmgt.model.impl.DossierProcessModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier process service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcessPersistence
 * @see DossierProcessUtil
 * @generated
 */
public class DossierProcessPersistenceImpl extends BasePersistenceImpl<DossierProcess>
	implements DossierProcessPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierProcessUtil} to access the dossier process persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierProcessImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessModelImpl.FINDER_CACHE_ENABLED,
			DossierProcessImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessModelImpl.FINDER_CACHE_ENABLED,
			DossierProcessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierProcessPersistenceImpl() {
		setModelClass(DossierProcess.class);
	}

	/**
	 * Caches the dossier process in the entity cache if it is enabled.
	 *
	 * @param dossierProcess the dossier process
	 */
	@Override
	public void cacheResult(DossierProcess dossierProcess) {
		EntityCacheUtil.putResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessImpl.class, dossierProcess.getPrimaryKey(),
			dossierProcess);

		dossierProcess.resetOriginalValues();
	}

	/**
	 * Caches the dossier processes in the entity cache if it is enabled.
	 *
	 * @param dossierProcesses the dossier processes
	 */
	@Override
	public void cacheResult(List<DossierProcess> dossierProcesses) {
		for (DossierProcess dossierProcess : dossierProcesses) {
			if (EntityCacheUtil.getResult(
						DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcessImpl.class, dossierProcess.getPrimaryKey()) == null) {
				cacheResult(dossierProcess);
			}
			else {
				dossierProcess.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier processes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierProcessImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierProcessImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier process.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierProcess dossierProcess) {
		EntityCacheUtil.removeResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessImpl.class, dossierProcess.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierProcess> dossierProcesses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierProcess dossierProcess : dossierProcesses) {
			EntityCacheUtil.removeResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcessImpl.class, dossierProcess.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier process with the primary key. Does not add the dossier process to the database.
	 *
	 * @param dossierProcessId the primary key for the new dossier process
	 * @return the new dossier process
	 */
	@Override
	public DossierProcess create(long dossierProcessId) {
		DossierProcess dossierProcess = new DossierProcessImpl();

		dossierProcess.setNew(true);
		dossierProcess.setPrimaryKey(dossierProcessId);

		return dossierProcess;
	}

	/**
	 * Removes the dossier process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProcessId the primary key of the dossier process
	 * @return the dossier process that was removed
	 * @throws org.oep.core.processmgt.NoSuchDossierProcessException if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess remove(long dossierProcessId)
		throws NoSuchDossierProcessException, SystemException {
		return remove((Serializable)dossierProcessId);
	}

	/**
	 * Removes the dossier process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier process
	 * @return the dossier process that was removed
	 * @throws org.oep.core.processmgt.NoSuchDossierProcessException if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess remove(Serializable primaryKey)
		throws NoSuchDossierProcessException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierProcess dossierProcess = (DossierProcess)session.get(DossierProcessImpl.class,
					primaryKey);

			if (dossierProcess == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierProcessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierProcess);
		}
		catch (NoSuchDossierProcessException nsee) {
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
	protected DossierProcess removeImpl(DossierProcess dossierProcess)
		throws SystemException {
		dossierProcess = toUnwrappedModel(dossierProcess);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierProcess)) {
				dossierProcess = (DossierProcess)session.get(DossierProcessImpl.class,
						dossierProcess.getPrimaryKeyObj());
			}

			if (dossierProcess != null) {
				session.delete(dossierProcess);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierProcess != null) {
			clearCache(dossierProcess);
		}

		return dossierProcess;
	}

	@Override
	public DossierProcess updateImpl(
		org.oep.core.processmgt.model.DossierProcess dossierProcess)
		throws SystemException {
		dossierProcess = toUnwrappedModel(dossierProcess);

		boolean isNew = dossierProcess.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierProcess.isNew()) {
				session.save(dossierProcess);

				dossierProcess.setNew(false);
			}
			else {
				session.merge(dossierProcess);
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

		EntityCacheUtil.putResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessImpl.class, dossierProcess.getPrimaryKey(),
			dossierProcess);

		return dossierProcess;
	}

	protected DossierProcess toUnwrappedModel(DossierProcess dossierProcess) {
		if (dossierProcess instanceof DossierProcessImpl) {
			return dossierProcess;
		}

		DossierProcessImpl dossierProcessImpl = new DossierProcessImpl();

		dossierProcessImpl.setNew(dossierProcess.isNew());
		dossierProcessImpl.setPrimaryKey(dossierProcess.getPrimaryKey());

		dossierProcessImpl.setDossierProcessId(dossierProcess.getDossierProcessId());
		dossierProcessImpl.setUserId(dossierProcess.getUserId());
		dossierProcessImpl.setGroupId(dossierProcess.getGroupId());
		dossierProcessImpl.setCompanyId(dossierProcess.getCompanyId());
		dossierProcessImpl.setCreateDate(dossierProcess.getCreateDate());
		dossierProcessImpl.setModifiedDate(dossierProcess.getModifiedDate());
		dossierProcessImpl.setDossierProcId(dossierProcess.getDossierProcId());
		dossierProcessImpl.setGovAgentNo(dossierProcess.getGovAgentNo());
		dossierProcessImpl.setGovAgentName(dossierProcess.getGovAgentName());
		dossierProcessImpl.setStartDossierStepId(dossierProcess.getStartDossierStepId());
		dossierProcessImpl.setDaysDuration(dossierProcess.getDaysDuration());

		return dossierProcessImpl;
	}

	/**
	 * Returns the dossier process with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier process
	 * @return the dossier process
	 * @throws org.oep.core.processmgt.NoSuchDossierProcessException if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierProcessException, SystemException {
		DossierProcess dossierProcess = fetchByPrimaryKey(primaryKey);

		if (dossierProcess == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierProcessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierProcess;
	}

	/**
	 * Returns the dossier process with the primary key or throws a {@link org.oep.core.processmgt.NoSuchDossierProcessException} if it could not be found.
	 *
	 * @param dossierProcessId the primary key of the dossier process
	 * @return the dossier process
	 * @throws org.oep.core.processmgt.NoSuchDossierProcessException if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess findByPrimaryKey(long dossierProcessId)
		throws NoSuchDossierProcessException, SystemException {
		return findByPrimaryKey((Serializable)dossierProcessId);
	}

	/**
	 * Returns the dossier process with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier process
	 * @return the dossier process, or <code>null</code> if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierProcess dossierProcess = (DossierProcess)EntityCacheUtil.getResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcessImpl.class, primaryKey);

		if (dossierProcess == _nullDossierProcess) {
			return null;
		}

		if (dossierProcess == null) {
			Session session = null;

			try {
				session = openSession();

				dossierProcess = (DossierProcess)session.get(DossierProcessImpl.class,
						primaryKey);

				if (dossierProcess != null) {
					cacheResult(dossierProcess);
				}
				else {
					EntityCacheUtil.putResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcessImpl.class, primaryKey,
						_nullDossierProcess);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
					DossierProcessImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierProcess;
	}

	/**
	 * Returns the dossier process with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierProcessId the primary key of the dossier process
	 * @return the dossier process, or <code>null</code> if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess fetchByPrimaryKey(long dossierProcessId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierProcessId);
	}

	/**
	 * Returns all the dossier processes.
	 *
	 * @return the dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier processes
	 * @param end the upper bound of the range of dossier processes (not inclusive)
	 * @return the range of dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier processes
	 * @param end the upper bound of the range of dossier processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> findAll(int start, int end,
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

		List<DossierProcess> list = (List<DossierProcess>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERPROCESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERPROCESS;

				if (pagination) {
					sql = sql.concat(DossierProcessModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierProcess>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProcess>(list);
				}
				else {
					list = (List<DossierProcess>)QueryUtil.list(q,
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
	 * Removes all the dossier processes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierProcess dossierProcess : findAll()) {
			remove(dossierProcess);
		}
	}

	/**
	 * Returns the number of dossier processes.
	 *
	 * @return the number of dossier processes
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERPROCESS);

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
	 * Initializes the dossier process persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.processmgt.model.DossierProcess")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierProcess>> listenersList = new ArrayList<ModelListener<DossierProcess>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierProcess>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierProcessImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERPROCESS = "SELECT dossierProcess FROM DossierProcess dossierProcess";
	private static final String _SQL_COUNT_DOSSIERPROCESS = "SELECT COUNT(dossierProcess) FROM DossierProcess dossierProcess";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierProcess.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierProcess exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierProcessPersistenceImpl.class);
	private static DossierProcess _nullDossierProcess = new DossierProcessImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierProcess> toCacheModel() {
				return _nullDossierProcessCacheModel;
			}
		};

	private static CacheModel<DossierProcess> _nullDossierProcessCacheModel = new CacheModel<DossierProcess>() {
			@Override
			public DossierProcess toEntityModel() {
				return _nullDossierProcess;
			}
		};
}