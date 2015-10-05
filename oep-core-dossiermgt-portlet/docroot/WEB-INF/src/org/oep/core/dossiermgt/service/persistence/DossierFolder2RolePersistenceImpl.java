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

package org.oep.core.dossiermgt.service.persistence;

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

import org.oep.core.dossiermgt.NoSuchDossierFolder2RoleException;
import org.oep.core.dossiermgt.model.DossierFolder2Role;
import org.oep.core.dossiermgt.model.impl.DossierFolder2RoleImpl;
import org.oep.core.dossiermgt.model.impl.DossierFolder2RoleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier folder2 role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierFolder2RolePersistence
 * @see DossierFolder2RoleUtil
 * @generated
 */
public class DossierFolder2RolePersistenceImpl extends BasePersistenceImpl<DossierFolder2Role>
	implements DossierFolder2RolePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierFolder2RoleUtil} to access the dossier folder2 role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierFolder2RoleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierFolder2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolder2RoleModelImpl.FINDER_CACHE_ENABLED,
			DossierFolder2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierFolder2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolder2RoleModelImpl.FINDER_CACHE_ENABLED,
			DossierFolder2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierFolder2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolder2RoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierFolder2RolePersistenceImpl() {
		setModelClass(DossierFolder2Role.class);
	}

	/**
	 * Caches the dossier folder2 role in the entity cache if it is enabled.
	 *
	 * @param dossierFolder2Role the dossier folder2 role
	 */
	@Override
	public void cacheResult(DossierFolder2Role dossierFolder2Role) {
		EntityCacheUtil.putResult(DossierFolder2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolder2RoleImpl.class, dossierFolder2Role.getPrimaryKey(),
			dossierFolder2Role);

		dossierFolder2Role.resetOriginalValues();
	}

	/**
	 * Caches the dossier folder2 roles in the entity cache if it is enabled.
	 *
	 * @param dossierFolder2Roles the dossier folder2 roles
	 */
	@Override
	public void cacheResult(List<DossierFolder2Role> dossierFolder2Roles) {
		for (DossierFolder2Role dossierFolder2Role : dossierFolder2Roles) {
			if (EntityCacheUtil.getResult(
						DossierFolder2RoleModelImpl.ENTITY_CACHE_ENABLED,
						DossierFolder2RoleImpl.class,
						dossierFolder2Role.getPrimaryKey()) == null) {
				cacheResult(dossierFolder2Role);
			}
			else {
				dossierFolder2Role.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier folder2 roles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierFolder2RoleImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierFolder2RoleImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier folder2 role.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierFolder2Role dossierFolder2Role) {
		EntityCacheUtil.removeResult(DossierFolder2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolder2RoleImpl.class, dossierFolder2Role.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierFolder2Role> dossierFolder2Roles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierFolder2Role dossierFolder2Role : dossierFolder2Roles) {
			EntityCacheUtil.removeResult(DossierFolder2RoleModelImpl.ENTITY_CACHE_ENABLED,
				DossierFolder2RoleImpl.class, dossierFolder2Role.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier folder2 role with the primary key. Does not add the dossier folder2 role to the database.
	 *
	 * @param dossierFolder2RolePK the primary key for the new dossier folder2 role
	 * @return the new dossier folder2 role
	 */
	@Override
	public DossierFolder2Role create(DossierFolder2RolePK dossierFolder2RolePK) {
		DossierFolder2Role dossierFolder2Role = new DossierFolder2RoleImpl();

		dossierFolder2Role.setNew(true);
		dossierFolder2Role.setPrimaryKey(dossierFolder2RolePK);

		return dossierFolder2Role;
	}

	/**
	 * Removes the dossier folder2 role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierFolder2RolePK the primary key of the dossier folder2 role
	 * @return the dossier folder2 role that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolder2RoleException if a dossier folder2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder2Role remove(DossierFolder2RolePK dossierFolder2RolePK)
		throws NoSuchDossierFolder2RoleException, SystemException {
		return remove((Serializable)dossierFolder2RolePK);
	}

	/**
	 * Removes the dossier folder2 role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier folder2 role
	 * @return the dossier folder2 role that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolder2RoleException if a dossier folder2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder2Role remove(Serializable primaryKey)
		throws NoSuchDossierFolder2RoleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierFolder2Role dossierFolder2Role = (DossierFolder2Role)session.get(DossierFolder2RoleImpl.class,
					primaryKey);

			if (dossierFolder2Role == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierFolder2RoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierFolder2Role);
		}
		catch (NoSuchDossierFolder2RoleException nsee) {
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
	protected DossierFolder2Role removeImpl(
		DossierFolder2Role dossierFolder2Role) throws SystemException {
		dossierFolder2Role = toUnwrappedModel(dossierFolder2Role);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierFolder2Role)) {
				dossierFolder2Role = (DossierFolder2Role)session.get(DossierFolder2RoleImpl.class,
						dossierFolder2Role.getPrimaryKeyObj());
			}

			if (dossierFolder2Role != null) {
				session.delete(dossierFolder2Role);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierFolder2Role != null) {
			clearCache(dossierFolder2Role);
		}

		return dossierFolder2Role;
	}

	@Override
	public DossierFolder2Role updateImpl(
		org.oep.core.dossiermgt.model.DossierFolder2Role dossierFolder2Role)
		throws SystemException {
		dossierFolder2Role = toUnwrappedModel(dossierFolder2Role);

		boolean isNew = dossierFolder2Role.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierFolder2Role.isNew()) {
				session.save(dossierFolder2Role);

				dossierFolder2Role.setNew(false);
			}
			else {
				session.merge(dossierFolder2Role);
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

		EntityCacheUtil.putResult(DossierFolder2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolder2RoleImpl.class, dossierFolder2Role.getPrimaryKey(),
			dossierFolder2Role);

		return dossierFolder2Role;
	}

	protected DossierFolder2Role toUnwrappedModel(
		DossierFolder2Role dossierFolder2Role) {
		if (dossierFolder2Role instanceof DossierFolder2RoleImpl) {
			return dossierFolder2Role;
		}

		DossierFolder2RoleImpl dossierFolder2RoleImpl = new DossierFolder2RoleImpl();

		dossierFolder2RoleImpl.setNew(dossierFolder2Role.isNew());
		dossierFolder2RoleImpl.setPrimaryKey(dossierFolder2Role.getPrimaryKey());

		dossierFolder2RoleImpl.setDossierFolderId(dossierFolder2Role.getDossierFolderId());
		dossierFolder2RoleImpl.setRoleId(dossierFolder2Role.getRoleId());

		return dossierFolder2RoleImpl;
	}

	/**
	 * Returns the dossier folder2 role with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier folder2 role
	 * @return the dossier folder2 role
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolder2RoleException if a dossier folder2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder2Role findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierFolder2RoleException, SystemException {
		DossierFolder2Role dossierFolder2Role = fetchByPrimaryKey(primaryKey);

		if (dossierFolder2Role == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierFolder2RoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierFolder2Role;
	}

	/**
	 * Returns the dossier folder2 role with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierFolder2RoleException} if it could not be found.
	 *
	 * @param dossierFolder2RolePK the primary key of the dossier folder2 role
	 * @return the dossier folder2 role
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolder2RoleException if a dossier folder2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder2Role findByPrimaryKey(
		DossierFolder2RolePK dossierFolder2RolePK)
		throws NoSuchDossierFolder2RoleException, SystemException {
		return findByPrimaryKey((Serializable)dossierFolder2RolePK);
	}

	/**
	 * Returns the dossier folder2 role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier folder2 role
	 * @return the dossier folder2 role, or <code>null</code> if a dossier folder2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder2Role fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierFolder2Role dossierFolder2Role = (DossierFolder2Role)EntityCacheUtil.getResult(DossierFolder2RoleModelImpl.ENTITY_CACHE_ENABLED,
				DossierFolder2RoleImpl.class, primaryKey);

		if (dossierFolder2Role == _nullDossierFolder2Role) {
			return null;
		}

		if (dossierFolder2Role == null) {
			Session session = null;

			try {
				session = openSession();

				dossierFolder2Role = (DossierFolder2Role)session.get(DossierFolder2RoleImpl.class,
						primaryKey);

				if (dossierFolder2Role != null) {
					cacheResult(dossierFolder2Role);
				}
				else {
					EntityCacheUtil.putResult(DossierFolder2RoleModelImpl.ENTITY_CACHE_ENABLED,
						DossierFolder2RoleImpl.class, primaryKey,
						_nullDossierFolder2Role);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierFolder2RoleModelImpl.ENTITY_CACHE_ENABLED,
					DossierFolder2RoleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierFolder2Role;
	}

	/**
	 * Returns the dossier folder2 role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierFolder2RolePK the primary key of the dossier folder2 role
	 * @return the dossier folder2 role, or <code>null</code> if a dossier folder2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder2Role fetchByPrimaryKey(
		DossierFolder2RolePK dossierFolder2RolePK) throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierFolder2RolePK);
	}

	/**
	 * Returns all the dossier folder2 roles.
	 *
	 * @return the dossier folder2 roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFolder2Role> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier folder2 roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolder2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier folder2 roles
	 * @param end the upper bound of the range of dossier folder2 roles (not inclusive)
	 * @return the range of dossier folder2 roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFolder2Role> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier folder2 roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolder2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier folder2 roles
	 * @param end the upper bound of the range of dossier folder2 roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier folder2 roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFolder2Role> findAll(int start, int end,
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

		List<DossierFolder2Role> list = (List<DossierFolder2Role>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERFOLDER2ROLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERFOLDER2ROLE;

				if (pagination) {
					sql = sql.concat(DossierFolder2RoleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierFolder2Role>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierFolder2Role>(list);
				}
				else {
					list = (List<DossierFolder2Role>)QueryUtil.list(q,
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
	 * Removes all the dossier folder2 roles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierFolder2Role dossierFolder2Role : findAll()) {
			remove(dossierFolder2Role);
		}
	}

	/**
	 * Returns the number of dossier folder2 roles.
	 *
	 * @return the number of dossier folder2 roles
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERFOLDER2ROLE);

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
	 * Initializes the dossier folder2 role persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.DossierFolder2Role")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierFolder2Role>> listenersList = new ArrayList<ModelListener<DossierFolder2Role>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierFolder2Role>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierFolder2RoleImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERFOLDER2ROLE = "SELECT dossierFolder2Role FROM DossierFolder2Role dossierFolder2Role";
	private static final String _SQL_COUNT_DOSSIERFOLDER2ROLE = "SELECT COUNT(dossierFolder2Role) FROM DossierFolder2Role dossierFolder2Role";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierFolder2Role.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierFolder2Role exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierFolder2RolePersistenceImpl.class);
	private static DossierFolder2Role _nullDossierFolder2Role = new DossierFolder2RoleImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierFolder2Role> toCacheModel() {
				return _nullDossierFolder2RoleCacheModel;
			}
		};

	private static CacheModel<DossierFolder2Role> _nullDossierFolder2RoleCacheModel =
		new CacheModel<DossierFolder2Role>() {
			@Override
			public DossierFolder2Role toEntityModel() {
				return _nullDossierFolder2Role;
			}
		};
}