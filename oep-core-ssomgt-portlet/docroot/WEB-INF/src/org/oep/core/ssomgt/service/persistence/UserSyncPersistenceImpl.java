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

package org.oep.core.ssomgt.service.persistence;

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

import org.oep.core.ssomgt.NoSuchUserSyncException;
import org.oep.core.ssomgt.model.UserSync;
import org.oep.core.ssomgt.model.impl.UserSyncImpl;
import org.oep.core.ssomgt.model.impl.UserSyncModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user sync service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see UserSyncPersistence
 * @see UserSyncUtil
 * @generated
 */
public class UserSyncPersistenceImpl extends BasePersistenceImpl<UserSync>
	implements UserSyncPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserSyncUtil} to access the user sync persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserSyncImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncModelImpl.FINDER_CACHE_ENABLED, UserSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncModelImpl.FINDER_CACHE_ENABLED, UserSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UserSyncPersistenceImpl() {
		setModelClass(UserSync.class);
	}

	/**
	 * Caches the user sync in the entity cache if it is enabled.
	 *
	 * @param userSync the user sync
	 */
	@Override
	public void cacheResult(UserSync userSync) {
		EntityCacheUtil.putResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncImpl.class, userSync.getPrimaryKey(), userSync);

		userSync.resetOriginalValues();
	}

	/**
	 * Caches the user syncs in the entity cache if it is enabled.
	 *
	 * @param userSyncs the user syncs
	 */
	@Override
	public void cacheResult(List<UserSync> userSyncs) {
		for (UserSync userSync : userSyncs) {
			if (EntityCacheUtil.getResult(
						UserSyncModelImpl.ENTITY_CACHE_ENABLED,
						UserSyncImpl.class, userSync.getPrimaryKey()) == null) {
				cacheResult(userSync);
			}
			else {
				userSync.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user syncs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserSyncImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserSyncImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user sync.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserSync userSync) {
		EntityCacheUtil.removeResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncImpl.class, userSync.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserSync> userSyncs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserSync userSync : userSyncs) {
			EntityCacheUtil.removeResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
				UserSyncImpl.class, userSync.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user sync with the primary key. Does not add the user sync to the database.
	 *
	 * @param userSyncId the primary key for the new user sync
	 * @return the new user sync
	 */
	@Override
	public UserSync create(long userSyncId) {
		UserSync userSync = new UserSyncImpl();

		userSync.setNew(true);
		userSync.setPrimaryKey(userSyncId);

		return userSync;
	}

	/**
	 * Removes the user sync with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userSyncId the primary key of the user sync
	 * @return the user sync that was removed
	 * @throws org.oep.core.ssomgt.NoSuchUserSyncException if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync remove(long userSyncId)
		throws NoSuchUserSyncException, SystemException {
		return remove((Serializable)userSyncId);
	}

	/**
	 * Removes the user sync with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user sync
	 * @return the user sync that was removed
	 * @throws org.oep.core.ssomgt.NoSuchUserSyncException if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync remove(Serializable primaryKey)
		throws NoSuchUserSyncException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserSync userSync = (UserSync)session.get(UserSyncImpl.class,
					primaryKey);

			if (userSync == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserSyncException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userSync);
		}
		catch (NoSuchUserSyncException nsee) {
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
	protected UserSync removeImpl(UserSync userSync) throws SystemException {
		userSync = toUnwrappedModel(userSync);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userSync)) {
				userSync = (UserSync)session.get(UserSyncImpl.class,
						userSync.getPrimaryKeyObj());
			}

			if (userSync != null) {
				session.delete(userSync);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userSync != null) {
			clearCache(userSync);
		}

		return userSync;
	}

	@Override
	public UserSync updateImpl(org.oep.core.ssomgt.model.UserSync userSync)
		throws SystemException {
		userSync = toUnwrappedModel(userSync);

		boolean isNew = userSync.isNew();

		Session session = null;

		try {
			session = openSession();

			if (userSync.isNew()) {
				session.save(userSync);

				userSync.setNew(false);
			}
			else {
				session.merge(userSync);
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

		EntityCacheUtil.putResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
			UserSyncImpl.class, userSync.getPrimaryKey(), userSync);

		return userSync;
	}

	protected UserSync toUnwrappedModel(UserSync userSync) {
		if (userSync instanceof UserSyncImpl) {
			return userSync;
		}

		UserSyncImpl userSyncImpl = new UserSyncImpl();

		userSyncImpl.setNew(userSync.isNew());
		userSyncImpl.setPrimaryKey(userSync.getPrimaryKey());

		userSyncImpl.setUserSyncId(userSync.getUserSyncId());
		userSyncImpl.setApplicationId(userSync.getApplicationId());
		userSyncImpl.setEmployeeId(userSync.getEmployeeId());
		userSyncImpl.setUserId(userSync.getUserId());
		userSyncImpl.setAccessible(userSync.getAccessible());
		userSyncImpl.setCheckpoint(userSync.getCheckpoint());
		userSyncImpl.setSyncTime(userSync.getSyncTime());

		return userSyncImpl;
	}

	/**
	 * Returns the user sync with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user sync
	 * @return the user sync
	 * @throws org.oep.core.ssomgt.NoSuchUserSyncException if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserSyncException, SystemException {
		UserSync userSync = fetchByPrimaryKey(primaryKey);

		if (userSync == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserSyncException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userSync;
	}

	/**
	 * Returns the user sync with the primary key or throws a {@link org.oep.core.ssomgt.NoSuchUserSyncException} if it could not be found.
	 *
	 * @param userSyncId the primary key of the user sync
	 * @return the user sync
	 * @throws org.oep.core.ssomgt.NoSuchUserSyncException if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync findByPrimaryKey(long userSyncId)
		throws NoSuchUserSyncException, SystemException {
		return findByPrimaryKey((Serializable)userSyncId);
	}

	/**
	 * Returns the user sync with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user sync
	 * @return the user sync, or <code>null</code> if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserSync userSync = (UserSync)EntityCacheUtil.getResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
				UserSyncImpl.class, primaryKey);

		if (userSync == _nullUserSync) {
			return null;
		}

		if (userSync == null) {
			Session session = null;

			try {
				session = openSession();

				userSync = (UserSync)session.get(UserSyncImpl.class, primaryKey);

				if (userSync != null) {
					cacheResult(userSync);
				}
				else {
					EntityCacheUtil.putResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
						UserSyncImpl.class, primaryKey, _nullUserSync);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserSyncModelImpl.ENTITY_CACHE_ENABLED,
					UserSyncImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userSync;
	}

	/**
	 * Returns the user sync with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userSyncId the primary key of the user sync
	 * @return the user sync, or <code>null</code> if a user sync with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSync fetchByPrimaryKey(long userSyncId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)userSyncId);
	}

	/**
	 * Returns all the user syncs.
	 *
	 * @return the user syncs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserSync> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user syncs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user syncs
	 * @param end the upper bound of the range of user syncs (not inclusive)
	 * @return the range of user syncs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserSync> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user syncs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user syncs
	 * @param end the upper bound of the range of user syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user syncs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserSync> findAll(int start, int end,
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

		List<UserSync> list = (List<UserSync>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERSYNC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERSYNC;

				if (pagination) {
					sql = sql.concat(UserSyncModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserSync>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserSync>(list);
				}
				else {
					list = (List<UserSync>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user syncs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserSync userSync : findAll()) {
			remove(userSync);
		}
	}

	/**
	 * Returns the number of user syncs.
	 *
	 * @return the number of user syncs
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

				Query q = session.createQuery(_SQL_COUNT_USERSYNC);

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
	 * Initializes the user sync persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.ssomgt.model.UserSync")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserSync>> listenersList = new ArrayList<ModelListener<UserSync>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserSync>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserSyncImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERSYNC = "SELECT userSync FROM UserSync userSync";
	private static final String _SQL_COUNT_USERSYNC = "SELECT COUNT(userSync) FROM UserSync userSync";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userSync.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserSync exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserSyncPersistenceImpl.class);
	private static UserSync _nullUserSync = new UserSyncImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserSync> toCacheModel() {
				return _nullUserSyncCacheModel;
			}
		};

	private static CacheModel<UserSync> _nullUserSyncCacheModel = new CacheModel<UserSync>() {
			@Override
			public UserSync toEntityModel() {
				return _nullUserSync;
			}
		};
}