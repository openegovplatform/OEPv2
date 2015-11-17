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

import org.oep.processmgt.NoSuchDossierProc2RoleException;
import org.oep.processmgt.model.DossierProc2Role;
import org.oep.processmgt.model.impl.DossierProc2RoleImpl;
import org.oep.processmgt.model.impl.DossierProc2RoleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier proc2 role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProc2RolePersistence
 * @see DossierProc2RoleUtil
 * @generated
 */
public class DossierProc2RolePersistenceImpl extends BasePersistenceImpl<DossierProc2Role>
	implements DossierProc2RolePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierProc2RoleUtil} to access the dossier proc2 role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierProc2RoleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierProc2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2RoleModelImpl.FINDER_CACHE_ENABLED,
			DossierProc2RoleImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierProc2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2RoleModelImpl.FINDER_CACHE_ENABLED,
			DossierProc2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierProc2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2RoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierProc2RolePersistenceImpl() {
		setModelClass(DossierProc2Role.class);
	}

	/**
	 * Caches the dossier proc2 role in the entity cache if it is enabled.
	 *
	 * @param dossierProc2Role the dossier proc2 role
	 */
	@Override
	public void cacheResult(DossierProc2Role dossierProc2Role) {
		EntityCacheUtil.putResult(DossierProc2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2RoleImpl.class, dossierProc2Role.getPrimaryKey(),
			dossierProc2Role);

		dossierProc2Role.resetOriginalValues();
	}

	/**
	 * Caches the dossier proc2 roles in the entity cache if it is enabled.
	 *
	 * @param dossierProc2Roles the dossier proc2 roles
	 */
	@Override
	public void cacheResult(List<DossierProc2Role> dossierProc2Roles) {
		for (DossierProc2Role dossierProc2Role : dossierProc2Roles) {
			if (EntityCacheUtil.getResult(
						DossierProc2RoleModelImpl.ENTITY_CACHE_ENABLED,
						DossierProc2RoleImpl.class,
						dossierProc2Role.getPrimaryKey()) == null) {
				cacheResult(dossierProc2Role);
			}
			else {
				dossierProc2Role.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier proc2 roles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierProc2RoleImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierProc2RoleImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier proc2 role.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierProc2Role dossierProc2Role) {
		EntityCacheUtil.removeResult(DossierProc2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2RoleImpl.class, dossierProc2Role.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierProc2Role> dossierProc2Roles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierProc2Role dossierProc2Role : dossierProc2Roles) {
			EntityCacheUtil.removeResult(DossierProc2RoleModelImpl.ENTITY_CACHE_ENABLED,
				DossierProc2RoleImpl.class, dossierProc2Role.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier proc2 role with the primary key. Does not add the dossier proc2 role to the database.
	 *
	 * @param dossierProc2RoleId the primary key for the new dossier proc2 role
	 * @return the new dossier proc2 role
	 */
	@Override
	public DossierProc2Role create(long dossierProc2RoleId) {
		DossierProc2Role dossierProc2Role = new DossierProc2RoleImpl();

		dossierProc2Role.setNew(true);
		dossierProc2Role.setPrimaryKey(dossierProc2RoleId);

		return dossierProc2Role;
	}

	/**
	 * Removes the dossier proc2 role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProc2RoleId the primary key of the dossier proc2 role
	 * @return the dossier proc2 role that was removed
	 * @throws org.oep.processmgt.NoSuchDossierProc2RoleException if a dossier proc2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Role remove(long dossierProc2RoleId)
		throws NoSuchDossierProc2RoleException, SystemException {
		return remove((Serializable)dossierProc2RoleId);
	}

	/**
	 * Removes the dossier proc2 role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier proc2 role
	 * @return the dossier proc2 role that was removed
	 * @throws org.oep.processmgt.NoSuchDossierProc2RoleException if a dossier proc2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Role remove(Serializable primaryKey)
		throws NoSuchDossierProc2RoleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierProc2Role dossierProc2Role = (DossierProc2Role)session.get(DossierProc2RoleImpl.class,
					primaryKey);

			if (dossierProc2Role == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierProc2RoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierProc2Role);
		}
		catch (NoSuchDossierProc2RoleException nsee) {
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
	protected DossierProc2Role removeImpl(DossierProc2Role dossierProc2Role)
		throws SystemException {
		dossierProc2Role = toUnwrappedModel(dossierProc2Role);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierProc2Role)) {
				dossierProc2Role = (DossierProc2Role)session.get(DossierProc2RoleImpl.class,
						dossierProc2Role.getPrimaryKeyObj());
			}

			if (dossierProc2Role != null) {
				session.delete(dossierProc2Role);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierProc2Role != null) {
			clearCache(dossierProc2Role);
		}

		return dossierProc2Role;
	}

	@Override
	public DossierProc2Role updateImpl(
		org.oep.processmgt.model.DossierProc2Role dossierProc2Role)
		throws SystemException {
		dossierProc2Role = toUnwrappedModel(dossierProc2Role);

		boolean isNew = dossierProc2Role.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierProc2Role.isNew()) {
				session.save(dossierProc2Role);

				dossierProc2Role.setNew(false);
			}
			else {
				session.merge(dossierProc2Role);
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

		EntityCacheUtil.putResult(DossierProc2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2RoleImpl.class, dossierProc2Role.getPrimaryKey(),
			dossierProc2Role);

		return dossierProc2Role;
	}

	protected DossierProc2Role toUnwrappedModel(
		DossierProc2Role dossierProc2Role) {
		if (dossierProc2Role instanceof DossierProc2RoleImpl) {
			return dossierProc2Role;
		}

		DossierProc2RoleImpl dossierProc2RoleImpl = new DossierProc2RoleImpl();

		dossierProc2RoleImpl.setNew(dossierProc2Role.isNew());
		dossierProc2RoleImpl.setPrimaryKey(dossierProc2Role.getPrimaryKey());

		dossierProc2RoleImpl.setDossierProc2RoleId(dossierProc2Role.getDossierProc2RoleId());
		dossierProc2RoleImpl.setDossierProcId(dossierProc2Role.getDossierProcId());
		dossierProc2RoleImpl.setRoleId(dossierProc2Role.getRoleId());

		return dossierProc2RoleImpl;
	}

	/**
	 * Returns the dossier proc2 role with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc2 role
	 * @return the dossier proc2 role
	 * @throws org.oep.processmgt.NoSuchDossierProc2RoleException if a dossier proc2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Role findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierProc2RoleException, SystemException {
		DossierProc2Role dossierProc2Role = fetchByPrimaryKey(primaryKey);

		if (dossierProc2Role == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierProc2RoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierProc2Role;
	}

	/**
	 * Returns the dossier proc2 role with the primary key or throws a {@link org.oep.processmgt.NoSuchDossierProc2RoleException} if it could not be found.
	 *
	 * @param dossierProc2RoleId the primary key of the dossier proc2 role
	 * @return the dossier proc2 role
	 * @throws org.oep.processmgt.NoSuchDossierProc2RoleException if a dossier proc2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Role findByPrimaryKey(long dossierProc2RoleId)
		throws NoSuchDossierProc2RoleException, SystemException {
		return findByPrimaryKey((Serializable)dossierProc2RoleId);
	}

	/**
	 * Returns the dossier proc2 role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc2 role
	 * @return the dossier proc2 role, or <code>null</code> if a dossier proc2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Role fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierProc2Role dossierProc2Role = (DossierProc2Role)EntityCacheUtil.getResult(DossierProc2RoleModelImpl.ENTITY_CACHE_ENABLED,
				DossierProc2RoleImpl.class, primaryKey);

		if (dossierProc2Role == _nullDossierProc2Role) {
			return null;
		}

		if (dossierProc2Role == null) {
			Session session = null;

			try {
				session = openSession();

				dossierProc2Role = (DossierProc2Role)session.get(DossierProc2RoleImpl.class,
						primaryKey);

				if (dossierProc2Role != null) {
					cacheResult(dossierProc2Role);
				}
				else {
					EntityCacheUtil.putResult(DossierProc2RoleModelImpl.ENTITY_CACHE_ENABLED,
						DossierProc2RoleImpl.class, primaryKey,
						_nullDossierProc2Role);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierProc2RoleModelImpl.ENTITY_CACHE_ENABLED,
					DossierProc2RoleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierProc2Role;
	}

	/**
	 * Returns the dossier proc2 role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierProc2RoleId the primary key of the dossier proc2 role
	 * @return the dossier proc2 role, or <code>null</code> if a dossier proc2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Role fetchByPrimaryKey(long dossierProc2RoleId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierProc2RoleId);
	}

	/**
	 * Returns all the dossier proc2 roles.
	 *
	 * @return the dossier proc2 roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc2Role> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier proc2 roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProc2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier proc2 roles
	 * @param end the upper bound of the range of dossier proc2 roles (not inclusive)
	 * @return the range of dossier proc2 roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc2Role> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier proc2 roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProc2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier proc2 roles
	 * @param end the upper bound of the range of dossier proc2 roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier proc2 roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc2Role> findAll(int start, int end,
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

		List<DossierProc2Role> list = (List<DossierProc2Role>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERPROC2ROLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERPROC2ROLE;

				if (pagination) {
					sql = sql.concat(DossierProc2RoleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierProc2Role>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc2Role>(list);
				}
				else {
					list = (List<DossierProc2Role>)QueryUtil.list(q,
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
	 * Removes all the dossier proc2 roles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierProc2Role dossierProc2Role : findAll()) {
			remove(dossierProc2Role);
		}
	}

	/**
	 * Returns the number of dossier proc2 roles.
	 *
	 * @return the number of dossier proc2 roles
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERPROC2ROLE);

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
	 * Initializes the dossier proc2 role persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.processmgt.model.DossierProc2Role")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierProc2Role>> listenersList = new ArrayList<ModelListener<DossierProc2Role>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierProc2Role>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierProc2RoleImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERPROC2ROLE = "SELECT dossierProc2Role FROM DossierProc2Role dossierProc2Role";
	private static final String _SQL_COUNT_DOSSIERPROC2ROLE = "SELECT COUNT(dossierProc2Role) FROM DossierProc2Role dossierProc2Role";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierProc2Role.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierProc2Role exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierProc2RolePersistenceImpl.class);
	private static DossierProc2Role _nullDossierProc2Role = new DossierProc2RoleImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierProc2Role> toCacheModel() {
				return _nullDossierProc2RoleCacheModel;
			}
		};

	private static CacheModel<DossierProc2Role> _nullDossierProc2RoleCacheModel = new CacheModel<DossierProc2Role>() {
			@Override
			public DossierProc2Role toEntityModel() {
				return _nullDossierProc2Role;
			}
		};
}