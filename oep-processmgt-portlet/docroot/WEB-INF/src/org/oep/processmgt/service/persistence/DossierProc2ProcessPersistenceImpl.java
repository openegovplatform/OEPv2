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

package org.oep.processmgt.service.persistence;

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

import org.oep.processmgt.NoSuchDossierProc2ProcessException;
import org.oep.processmgt.model.DossierProc2Process;
import org.oep.processmgt.model.impl.DossierProc2ProcessImpl;
import org.oep.processmgt.model.impl.DossierProc2ProcessModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier proc2 process service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProc2ProcessPersistence
 * @see DossierProc2ProcessUtil
 * @generated
 */
public class DossierProc2ProcessPersistenceImpl extends BasePersistenceImpl<DossierProc2Process>
	implements DossierProc2ProcessPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierProc2ProcessUtil} to access the dossier proc2 process persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierProc2ProcessImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierProc2ProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2ProcessModelImpl.FINDER_CACHE_ENABLED,
			DossierProc2ProcessImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierProc2ProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2ProcessModelImpl.FINDER_CACHE_ENABLED,
			DossierProc2ProcessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierProc2ProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2ProcessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierProc2ProcessPersistenceImpl() {
		setModelClass(DossierProc2Process.class);
	}

	/**
	 * Caches the dossier proc2 process in the entity cache if it is enabled.
	 *
	 * @param dossierProc2Process the dossier proc2 process
	 */
	@Override
	public void cacheResult(DossierProc2Process dossierProc2Process) {
		EntityCacheUtil.putResult(DossierProc2ProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2ProcessImpl.class, dossierProc2Process.getPrimaryKey(),
			dossierProc2Process);

		dossierProc2Process.resetOriginalValues();
	}

	/**
	 * Caches the dossier proc2 processes in the entity cache if it is enabled.
	 *
	 * @param dossierProc2Processes the dossier proc2 processes
	 */
	@Override
	public void cacheResult(List<DossierProc2Process> dossierProc2Processes) {
		for (DossierProc2Process dossierProc2Process : dossierProc2Processes) {
			if (EntityCacheUtil.getResult(
						DossierProc2ProcessModelImpl.ENTITY_CACHE_ENABLED,
						DossierProc2ProcessImpl.class,
						dossierProc2Process.getPrimaryKey()) == null) {
				cacheResult(dossierProc2Process);
			}
			else {
				dossierProc2Process.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier proc2 processes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierProc2ProcessImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierProc2ProcessImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier proc2 process.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierProc2Process dossierProc2Process) {
		EntityCacheUtil.removeResult(DossierProc2ProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2ProcessImpl.class, dossierProc2Process.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierProc2Process> dossierProc2Processes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierProc2Process dossierProc2Process : dossierProc2Processes) {
			EntityCacheUtil.removeResult(DossierProc2ProcessModelImpl.ENTITY_CACHE_ENABLED,
				DossierProc2ProcessImpl.class,
				dossierProc2Process.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier proc2 process with the primary key. Does not add the dossier proc2 process to the database.
	 *
	 * @param dossierProc2ProcessId the primary key for the new dossier proc2 process
	 * @return the new dossier proc2 process
	 */
	@Override
	public DossierProc2Process create(long dossierProc2ProcessId) {
		DossierProc2Process dossierProc2Process = new DossierProc2ProcessImpl();

		dossierProc2Process.setNew(true);
		dossierProc2Process.setPrimaryKey(dossierProc2ProcessId);

		return dossierProc2Process;
	}

	/**
	 * Removes the dossier proc2 process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProc2ProcessId the primary key of the dossier proc2 process
	 * @return the dossier proc2 process that was removed
	 * @throws org.oep.processmgt.NoSuchDossierProc2ProcessException if a dossier proc2 process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Process remove(long dossierProc2ProcessId)
		throws NoSuchDossierProc2ProcessException, SystemException {
		return remove((Serializable)dossierProc2ProcessId);
	}

	/**
	 * Removes the dossier proc2 process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier proc2 process
	 * @return the dossier proc2 process that was removed
	 * @throws org.oep.processmgt.NoSuchDossierProc2ProcessException if a dossier proc2 process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Process remove(Serializable primaryKey)
		throws NoSuchDossierProc2ProcessException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierProc2Process dossierProc2Process = (DossierProc2Process)session.get(DossierProc2ProcessImpl.class,
					primaryKey);

			if (dossierProc2Process == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierProc2ProcessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierProc2Process);
		}
		catch (NoSuchDossierProc2ProcessException nsee) {
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
	protected DossierProc2Process removeImpl(
		DossierProc2Process dossierProc2Process) throws SystemException {
		dossierProc2Process = toUnwrappedModel(dossierProc2Process);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierProc2Process)) {
				dossierProc2Process = (DossierProc2Process)session.get(DossierProc2ProcessImpl.class,
						dossierProc2Process.getPrimaryKeyObj());
			}

			if (dossierProc2Process != null) {
				session.delete(dossierProc2Process);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierProc2Process != null) {
			clearCache(dossierProc2Process);
		}

		return dossierProc2Process;
	}

	@Override
	public DossierProc2Process updateImpl(
		org.oep.processmgt.model.DossierProc2Process dossierProc2Process)
		throws SystemException {
		dossierProc2Process = toUnwrappedModel(dossierProc2Process);

		boolean isNew = dossierProc2Process.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierProc2Process.isNew()) {
				session.save(dossierProc2Process);

				dossierProc2Process.setNew(false);
			}
			else {
				session.merge(dossierProc2Process);
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

		EntityCacheUtil.putResult(DossierProc2ProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2ProcessImpl.class, dossierProc2Process.getPrimaryKey(),
			dossierProc2Process);

		return dossierProc2Process;
	}

	protected DossierProc2Process toUnwrappedModel(
		DossierProc2Process dossierProc2Process) {
		if (dossierProc2Process instanceof DossierProc2ProcessImpl) {
			return dossierProc2Process;
		}

		DossierProc2ProcessImpl dossierProc2ProcessImpl = new DossierProc2ProcessImpl();

		dossierProc2ProcessImpl.setNew(dossierProc2Process.isNew());
		dossierProc2ProcessImpl.setPrimaryKey(dossierProc2Process.getPrimaryKey());

		dossierProc2ProcessImpl.setDossierProc2ProcessId(dossierProc2Process.getDossierProc2ProcessId());
		dossierProc2ProcessImpl.setUserId(dossierProc2Process.getUserId());
		dossierProc2ProcessImpl.setGroupId(dossierProc2Process.getGroupId());
		dossierProc2ProcessImpl.setCompanyId(dossierProc2Process.getCompanyId());
		dossierProc2ProcessImpl.setCreateDate(dossierProc2Process.getCreateDate());
		dossierProc2ProcessImpl.setModifiedDate(dossierProc2Process.getModifiedDate());
		dossierProc2ProcessImpl.setDossierProcId(dossierProc2Process.getDossierProcId());
		dossierProc2ProcessImpl.setGovAgencyId(dossierProc2Process.getGovAgencyId());
		dossierProc2ProcessImpl.setGovAgencyName(dossierProc2Process.getGovAgencyName());
		dossierProc2ProcessImpl.setDossierProcessId(dossierProc2Process.getDossierProcessId());
		dossierProc2ProcessImpl.setAaaa(dossierProc2Process.getAaaa());
		dossierProc2ProcessImpl.setBbb(dossierProc2Process.getBbb());
		dossierProc2ProcessImpl.setDaysDuration(dossierProc2Process.getDaysDuration());
		dossierProc2ProcessImpl.setPaymentFee(dossierProc2Process.getPaymentFee());
		dossierProc2ProcessImpl.setPaymentOneGate(dossierProc2Process.getPaymentOneGate());
		dossierProc2ProcessImpl.setPaymentEservice(dossierProc2Process.getPaymentEservice());
		dossierProc2ProcessImpl.setOrganizationId(dossierProc2Process.getOrganizationId());
		dossierProc2ProcessImpl.setEbPartnershipId(dossierProc2Process.getEbPartnershipId());

		return dossierProc2ProcessImpl;
	}

	/**
	 * Returns the dossier proc2 process with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc2 process
	 * @return the dossier proc2 process
	 * @throws org.oep.processmgt.NoSuchDossierProc2ProcessException if a dossier proc2 process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Process findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierProc2ProcessException, SystemException {
		DossierProc2Process dossierProc2Process = fetchByPrimaryKey(primaryKey);

		if (dossierProc2Process == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierProc2ProcessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierProc2Process;
	}

	/**
	 * Returns the dossier proc2 process with the primary key or throws a {@link org.oep.processmgt.NoSuchDossierProc2ProcessException} if it could not be found.
	 *
	 * @param dossierProc2ProcessId the primary key of the dossier proc2 process
	 * @return the dossier proc2 process
	 * @throws org.oep.processmgt.NoSuchDossierProc2ProcessException if a dossier proc2 process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Process findByPrimaryKey(long dossierProc2ProcessId)
		throws NoSuchDossierProc2ProcessException, SystemException {
		return findByPrimaryKey((Serializable)dossierProc2ProcessId);
	}

	/**
	 * Returns the dossier proc2 process with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc2 process
	 * @return the dossier proc2 process, or <code>null</code> if a dossier proc2 process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Process fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierProc2Process dossierProc2Process = (DossierProc2Process)EntityCacheUtil.getResult(DossierProc2ProcessModelImpl.ENTITY_CACHE_ENABLED,
				DossierProc2ProcessImpl.class, primaryKey);

		if (dossierProc2Process == _nullDossierProc2Process) {
			return null;
		}

		if (dossierProc2Process == null) {
			Session session = null;

			try {
				session = openSession();

				dossierProc2Process = (DossierProc2Process)session.get(DossierProc2ProcessImpl.class,
						primaryKey);

				if (dossierProc2Process != null) {
					cacheResult(dossierProc2Process);
				}
				else {
					EntityCacheUtil.putResult(DossierProc2ProcessModelImpl.ENTITY_CACHE_ENABLED,
						DossierProc2ProcessImpl.class, primaryKey,
						_nullDossierProc2Process);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierProc2ProcessModelImpl.ENTITY_CACHE_ENABLED,
					DossierProc2ProcessImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierProc2Process;
	}

	/**
	 * Returns the dossier proc2 process with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierProc2ProcessId the primary key of the dossier proc2 process
	 * @return the dossier proc2 process, or <code>null</code> if a dossier proc2 process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Process fetchByPrimaryKey(long dossierProc2ProcessId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierProc2ProcessId);
	}

	/**
	 * Returns all the dossier proc2 processes.
	 *
	 * @return the dossier proc2 processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc2Process> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier proc2 processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProc2ProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier proc2 processes
	 * @param end the upper bound of the range of dossier proc2 processes (not inclusive)
	 * @return the range of dossier proc2 processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc2Process> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier proc2 processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProc2ProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier proc2 processes
	 * @param end the upper bound of the range of dossier proc2 processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier proc2 processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc2Process> findAll(int start, int end,
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

		List<DossierProc2Process> list = (List<DossierProc2Process>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERPROC2PROCESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERPROC2PROCESS;

				if (pagination) {
					sql = sql.concat(DossierProc2ProcessModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierProc2Process>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc2Process>(list);
				}
				else {
					list = (List<DossierProc2Process>)QueryUtil.list(q,
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
	 * Removes all the dossier proc2 processes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierProc2Process dossierProc2Process : findAll()) {
			remove(dossierProc2Process);
		}
	}

	/**
	 * Returns the number of dossier proc2 processes.
	 *
	 * @return the number of dossier proc2 processes
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERPROC2PROCESS);

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
	 * Initializes the dossier proc2 process persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.processmgt.model.DossierProc2Process")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierProc2Process>> listenersList = new ArrayList<ModelListener<DossierProc2Process>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierProc2Process>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierProc2ProcessImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERPROC2PROCESS = "SELECT dossierProc2Process FROM DossierProc2Process dossierProc2Process";
	private static final String _SQL_COUNT_DOSSIERPROC2PROCESS = "SELECT COUNT(dossierProc2Process) FROM DossierProc2Process dossierProc2Process";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierProc2Process.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierProc2Process exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierProc2ProcessPersistenceImpl.class);
	private static DossierProc2Process _nullDossierProc2Process = new DossierProc2ProcessImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierProc2Process> toCacheModel() {
				return _nullDossierProc2ProcessCacheModel;
			}
		};

	private static CacheModel<DossierProc2Process> _nullDossierProc2ProcessCacheModel =
		new CacheModel<DossierProc2Process>() {
			@Override
			public DossierProc2Process toEntityModel() {
				return _nullDossierProc2Process;
			}
		};
}