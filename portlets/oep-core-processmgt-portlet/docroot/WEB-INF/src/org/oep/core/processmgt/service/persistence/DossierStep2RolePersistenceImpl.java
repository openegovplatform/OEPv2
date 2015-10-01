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

import org.oep.core.processmgt.NoSuchDossierStep2RoleException;
import org.oep.core.processmgt.model.DossierStep2Role;
import org.oep.core.processmgt.model.impl.DossierStep2RoleImpl;
import org.oep.core.processmgt.model.impl.DossierStep2RoleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier step2 role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierStep2RolePersistence
 * @see DossierStep2RoleUtil
 * @generated
 */
public class DossierStep2RolePersistenceImpl extends BasePersistenceImpl<DossierStep2Role>
	implements DossierStep2RolePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierStep2RoleUtil} to access the dossier step2 role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierStep2RoleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierStep2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierStep2RoleModelImpl.FINDER_CACHE_ENABLED,
			DossierStep2RoleImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierStep2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierStep2RoleModelImpl.FINDER_CACHE_ENABLED,
			DossierStep2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierStep2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierStep2RoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierStep2RolePersistenceImpl() {
		setModelClass(DossierStep2Role.class);
	}

	/**
	 * Caches the dossier step2 role in the entity cache if it is enabled.
	 *
	 * @param dossierStep2Role the dossier step2 role
	 */
	@Override
	public void cacheResult(DossierStep2Role dossierStep2Role) {
		EntityCacheUtil.putResult(DossierStep2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierStep2RoleImpl.class, dossierStep2Role.getPrimaryKey(),
			dossierStep2Role);

		dossierStep2Role.resetOriginalValues();
	}

	/**
	 * Caches the dossier step2 roles in the entity cache if it is enabled.
	 *
	 * @param dossierStep2Roles the dossier step2 roles
	 */
	@Override
	public void cacheResult(List<DossierStep2Role> dossierStep2Roles) {
		for (DossierStep2Role dossierStep2Role : dossierStep2Roles) {
			if (EntityCacheUtil.getResult(
						DossierStep2RoleModelImpl.ENTITY_CACHE_ENABLED,
						DossierStep2RoleImpl.class,
						dossierStep2Role.getPrimaryKey()) == null) {
				cacheResult(dossierStep2Role);
			}
			else {
				dossierStep2Role.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier step2 roles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierStep2RoleImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierStep2RoleImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier step2 role.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierStep2Role dossierStep2Role) {
		EntityCacheUtil.removeResult(DossierStep2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierStep2RoleImpl.class, dossierStep2Role.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierStep2Role> dossierStep2Roles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierStep2Role dossierStep2Role : dossierStep2Roles) {
			EntityCacheUtil.removeResult(DossierStep2RoleModelImpl.ENTITY_CACHE_ENABLED,
				DossierStep2RoleImpl.class, dossierStep2Role.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier step2 role with the primary key. Does not add the dossier step2 role to the database.
	 *
	 * @param dossierStep2RolePK the primary key for the new dossier step2 role
	 * @return the new dossier step2 role
	 */
	@Override
	public DossierStep2Role create(DossierStep2RolePK dossierStep2RolePK) {
		DossierStep2Role dossierStep2Role = new DossierStep2RoleImpl();

		dossierStep2Role.setNew(true);
		dossierStep2Role.setPrimaryKey(dossierStep2RolePK);

		return dossierStep2Role;
	}

	/**
	 * Removes the dossier step2 role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierStep2RolePK the primary key of the dossier step2 role
	 * @return the dossier step2 role that was removed
	 * @throws org.oep.core.processmgt.NoSuchDossierStep2RoleException if a dossier step2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierStep2Role remove(DossierStep2RolePK dossierStep2RolePK)
		throws NoSuchDossierStep2RoleException, SystemException {
		return remove((Serializable)dossierStep2RolePK);
	}

	/**
	 * Removes the dossier step2 role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier step2 role
	 * @return the dossier step2 role that was removed
	 * @throws org.oep.core.processmgt.NoSuchDossierStep2RoleException if a dossier step2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierStep2Role remove(Serializable primaryKey)
		throws NoSuchDossierStep2RoleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierStep2Role dossierStep2Role = (DossierStep2Role)session.get(DossierStep2RoleImpl.class,
					primaryKey);

			if (dossierStep2Role == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierStep2RoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierStep2Role);
		}
		catch (NoSuchDossierStep2RoleException nsee) {
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
	protected DossierStep2Role removeImpl(DossierStep2Role dossierStep2Role)
		throws SystemException {
		dossierStep2Role = toUnwrappedModel(dossierStep2Role);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierStep2Role)) {
				dossierStep2Role = (DossierStep2Role)session.get(DossierStep2RoleImpl.class,
						dossierStep2Role.getPrimaryKeyObj());
			}

			if (dossierStep2Role != null) {
				session.delete(dossierStep2Role);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierStep2Role != null) {
			clearCache(dossierStep2Role);
		}

		return dossierStep2Role;
	}

	@Override
	public DossierStep2Role updateImpl(
		org.oep.core.processmgt.model.DossierStep2Role dossierStep2Role)
		throws SystemException {
		dossierStep2Role = toUnwrappedModel(dossierStep2Role);

		boolean isNew = dossierStep2Role.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierStep2Role.isNew()) {
				session.save(dossierStep2Role);

				dossierStep2Role.setNew(false);
			}
			else {
				session.merge(dossierStep2Role);
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

		EntityCacheUtil.putResult(DossierStep2RoleModelImpl.ENTITY_CACHE_ENABLED,
			DossierStep2RoleImpl.class, dossierStep2Role.getPrimaryKey(),
			dossierStep2Role);

		return dossierStep2Role;
	}

	protected DossierStep2Role toUnwrappedModel(
		DossierStep2Role dossierStep2Role) {
		if (dossierStep2Role instanceof DossierStep2RoleImpl) {
			return dossierStep2Role;
		}

		DossierStep2RoleImpl dossierStep2RoleImpl = new DossierStep2RoleImpl();

		dossierStep2RoleImpl.setNew(dossierStep2Role.isNew());
		dossierStep2RoleImpl.setPrimaryKey(dossierStep2Role.getPrimaryKey());

		dossierStep2RoleImpl.setDossierStepId(dossierStep2Role.getDossierStepId());
		dossierStep2RoleImpl.setRoleId(dossierStep2Role.getRoleId());

		return dossierStep2RoleImpl;
	}

	/**
	 * Returns the dossier step2 role with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier step2 role
	 * @return the dossier step2 role
	 * @throws org.oep.core.processmgt.NoSuchDossierStep2RoleException if a dossier step2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierStep2Role findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierStep2RoleException, SystemException {
		DossierStep2Role dossierStep2Role = fetchByPrimaryKey(primaryKey);

		if (dossierStep2Role == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierStep2RoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierStep2Role;
	}

	/**
	 * Returns the dossier step2 role with the primary key or throws a {@link org.oep.core.processmgt.NoSuchDossierStep2RoleException} if it could not be found.
	 *
	 * @param dossierStep2RolePK the primary key of the dossier step2 role
	 * @return the dossier step2 role
	 * @throws org.oep.core.processmgt.NoSuchDossierStep2RoleException if a dossier step2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierStep2Role findByPrimaryKey(
		DossierStep2RolePK dossierStep2RolePK)
		throws NoSuchDossierStep2RoleException, SystemException {
		return findByPrimaryKey((Serializable)dossierStep2RolePK);
	}

	/**
	 * Returns the dossier step2 role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier step2 role
	 * @return the dossier step2 role, or <code>null</code> if a dossier step2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierStep2Role fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierStep2Role dossierStep2Role = (DossierStep2Role)EntityCacheUtil.getResult(DossierStep2RoleModelImpl.ENTITY_CACHE_ENABLED,
				DossierStep2RoleImpl.class, primaryKey);

		if (dossierStep2Role == _nullDossierStep2Role) {
			return null;
		}

		if (dossierStep2Role == null) {
			Session session = null;

			try {
				session = openSession();

				dossierStep2Role = (DossierStep2Role)session.get(DossierStep2RoleImpl.class,
						primaryKey);

				if (dossierStep2Role != null) {
					cacheResult(dossierStep2Role);
				}
				else {
					EntityCacheUtil.putResult(DossierStep2RoleModelImpl.ENTITY_CACHE_ENABLED,
						DossierStep2RoleImpl.class, primaryKey,
						_nullDossierStep2Role);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierStep2RoleModelImpl.ENTITY_CACHE_ENABLED,
					DossierStep2RoleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierStep2Role;
	}

	/**
	 * Returns the dossier step2 role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierStep2RolePK the primary key of the dossier step2 role
	 * @return the dossier step2 role, or <code>null</code> if a dossier step2 role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierStep2Role fetchByPrimaryKey(
		DossierStep2RolePK dossierStep2RolePK) throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierStep2RolePK);
	}

	/**
	 * Returns all the dossier step2 roles.
	 *
	 * @return the dossier step2 roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierStep2Role> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier step2 roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStep2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier step2 roles
	 * @param end the upper bound of the range of dossier step2 roles (not inclusive)
	 * @return the range of dossier step2 roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierStep2Role> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier step2 roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStep2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier step2 roles
	 * @param end the upper bound of the range of dossier step2 roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier step2 roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierStep2Role> findAll(int start, int end,
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

		List<DossierStep2Role> list = (List<DossierStep2Role>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERSTEP2ROLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERSTEP2ROLE;

				if (pagination) {
					sql = sql.concat(DossierStep2RoleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierStep2Role>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierStep2Role>(list);
				}
				else {
					list = (List<DossierStep2Role>)QueryUtil.list(q,
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
	 * Removes all the dossier step2 roles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierStep2Role dossierStep2Role : findAll()) {
			remove(dossierStep2Role);
		}
	}

	/**
	 * Returns the number of dossier step2 roles.
	 *
	 * @return the number of dossier step2 roles
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERSTEP2ROLE);

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
	 * Initializes the dossier step2 role persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.processmgt.model.DossierStep2Role")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierStep2Role>> listenersList = new ArrayList<ModelListener<DossierStep2Role>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierStep2Role>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierStep2RoleImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERSTEP2ROLE = "SELECT dossierStep2Role FROM DossierStep2Role dossierStep2Role";
	private static final String _SQL_COUNT_DOSSIERSTEP2ROLE = "SELECT COUNT(dossierStep2Role) FROM DossierStep2Role dossierStep2Role";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierStep2Role.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierStep2Role exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierStep2RolePersistenceImpl.class);
	private static DossierStep2Role _nullDossierStep2Role = new DossierStep2RoleImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierStep2Role> toCacheModel() {
				return _nullDossierStep2RoleCacheModel;
			}
		};

	private static CacheModel<DossierStep2Role> _nullDossierStep2RoleCacheModel = new CacheModel<DossierStep2Role>() {
			@Override
			public DossierStep2Role toEntityModel() {
				return _nullDossierStep2Role;
			}
		};
}