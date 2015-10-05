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

import org.oep.core.processmgt.NoSuchProcessOrder2UserException;
import org.oep.core.processmgt.model.ProcessOrder2User;
import org.oep.core.processmgt.model.impl.ProcessOrder2UserImpl;
import org.oep.core.processmgt.model.impl.ProcessOrder2UserModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the process order2 user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ProcessOrder2UserPersistence
 * @see ProcessOrder2UserUtil
 * @generated
 */
public class ProcessOrder2UserPersistenceImpl extends BasePersistenceImpl<ProcessOrder2User>
	implements ProcessOrder2UserPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProcessOrder2UserUtil} to access the process order2 user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProcessOrder2UserImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserModelImpl.FINDER_CACHE_ENABLED,
			ProcessOrder2UserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserModelImpl.FINDER_CACHE_ENABLED,
			ProcessOrder2UserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ProcessOrder2UserPersistenceImpl() {
		setModelClass(ProcessOrder2User.class);
	}

	/**
	 * Caches the process order2 user in the entity cache if it is enabled.
	 *
	 * @param processOrder2User the process order2 user
	 */
	@Override
	public void cacheResult(ProcessOrder2User processOrder2User) {
		EntityCacheUtil.putResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserImpl.class, processOrder2User.getPrimaryKey(),
			processOrder2User);

		processOrder2User.resetOriginalValues();
	}

	/**
	 * Caches the process order2 users in the entity cache if it is enabled.
	 *
	 * @param processOrder2Users the process order2 users
	 */
	@Override
	public void cacheResult(List<ProcessOrder2User> processOrder2Users) {
		for (ProcessOrder2User processOrder2User : processOrder2Users) {
			if (EntityCacheUtil.getResult(
						ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
						ProcessOrder2UserImpl.class,
						processOrder2User.getPrimaryKey()) == null) {
				cacheResult(processOrder2User);
			}
			else {
				processOrder2User.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all process order2 users.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ProcessOrder2UserImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ProcessOrder2UserImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the process order2 user.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProcessOrder2User processOrder2User) {
		EntityCacheUtil.removeResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserImpl.class, processOrder2User.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ProcessOrder2User> processOrder2Users) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ProcessOrder2User processOrder2User : processOrder2Users) {
			EntityCacheUtil.removeResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
				ProcessOrder2UserImpl.class, processOrder2User.getPrimaryKey());
		}
	}

	/**
	 * Creates a new process order2 user with the primary key. Does not add the process order2 user to the database.
	 *
	 * @param processOrder2UserPK the primary key for the new process order2 user
	 * @return the new process order2 user
	 */
	@Override
	public ProcessOrder2User create(ProcessOrder2UserPK processOrder2UserPK) {
		ProcessOrder2User processOrder2User = new ProcessOrder2UserImpl();

		processOrder2User.setNew(true);
		processOrder2User.setPrimaryKey(processOrder2UserPK);

		return processOrder2User;
	}

	/**
	 * Removes the process order2 user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param processOrder2UserPK the primary key of the process order2 user
	 * @return the process order2 user that was removed
	 * @throws org.oep.core.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User remove(ProcessOrder2UserPK processOrder2UserPK)
		throws NoSuchProcessOrder2UserException, SystemException {
		return remove((Serializable)processOrder2UserPK);
	}

	/**
	 * Removes the process order2 user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the process order2 user
	 * @return the process order2 user that was removed
	 * @throws org.oep.core.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User remove(Serializable primaryKey)
		throws NoSuchProcessOrder2UserException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ProcessOrder2User processOrder2User = (ProcessOrder2User)session.get(ProcessOrder2UserImpl.class,
					primaryKey);

			if (processOrder2User == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProcessOrder2UserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(processOrder2User);
		}
		catch (NoSuchProcessOrder2UserException nsee) {
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
	protected ProcessOrder2User removeImpl(ProcessOrder2User processOrder2User)
		throws SystemException {
		processOrder2User = toUnwrappedModel(processOrder2User);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(processOrder2User)) {
				processOrder2User = (ProcessOrder2User)session.get(ProcessOrder2UserImpl.class,
						processOrder2User.getPrimaryKeyObj());
			}

			if (processOrder2User != null) {
				session.delete(processOrder2User);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (processOrder2User != null) {
			clearCache(processOrder2User);
		}

		return processOrder2User;
	}

	@Override
	public ProcessOrder2User updateImpl(
		org.oep.core.processmgt.model.ProcessOrder2User processOrder2User)
		throws SystemException {
		processOrder2User = toUnwrappedModel(processOrder2User);

		boolean isNew = processOrder2User.isNew();

		Session session = null;

		try {
			session = openSession();

			if (processOrder2User.isNew()) {
				session.save(processOrder2User);

				processOrder2User.setNew(false);
			}
			else {
				session.merge(processOrder2User);
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

		EntityCacheUtil.putResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrder2UserImpl.class, processOrder2User.getPrimaryKey(),
			processOrder2User);

		return processOrder2User;
	}

	protected ProcessOrder2User toUnwrappedModel(
		ProcessOrder2User processOrder2User) {
		if (processOrder2User instanceof ProcessOrder2UserImpl) {
			return processOrder2User;
		}

		ProcessOrder2UserImpl processOrder2UserImpl = new ProcessOrder2UserImpl();

		processOrder2UserImpl.setNew(processOrder2User.isNew());
		processOrder2UserImpl.setPrimaryKey(processOrder2User.getPrimaryKey());

		processOrder2UserImpl.setProcessOrderId(processOrder2User.getProcessOrderId());
		processOrder2UserImpl.setUserId(processOrder2User.getUserId());

		return processOrder2UserImpl;
	}

	/**
	 * Returns the process order2 user with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the process order2 user
	 * @return the process order2 user
	 * @throws org.oep.core.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProcessOrder2UserException, SystemException {
		ProcessOrder2User processOrder2User = fetchByPrimaryKey(primaryKey);

		if (processOrder2User == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProcessOrder2UserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return processOrder2User;
	}

	/**
	 * Returns the process order2 user with the primary key or throws a {@link org.oep.core.processmgt.NoSuchProcessOrder2UserException} if it could not be found.
	 *
	 * @param processOrder2UserPK the primary key of the process order2 user
	 * @return the process order2 user
	 * @throws org.oep.core.processmgt.NoSuchProcessOrder2UserException if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User findByPrimaryKey(
		ProcessOrder2UserPK processOrder2UserPK)
		throws NoSuchProcessOrder2UserException, SystemException {
		return findByPrimaryKey((Serializable)processOrder2UserPK);
	}

	/**
	 * Returns the process order2 user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the process order2 user
	 * @return the process order2 user, or <code>null</code> if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ProcessOrder2User processOrder2User = (ProcessOrder2User)EntityCacheUtil.getResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
				ProcessOrder2UserImpl.class, primaryKey);

		if (processOrder2User == _nullProcessOrder2User) {
			return null;
		}

		if (processOrder2User == null) {
			Session session = null;

			try {
				session = openSession();

				processOrder2User = (ProcessOrder2User)session.get(ProcessOrder2UserImpl.class,
						primaryKey);

				if (processOrder2User != null) {
					cacheResult(processOrder2User);
				}
				else {
					EntityCacheUtil.putResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
						ProcessOrder2UserImpl.class, primaryKey,
						_nullProcessOrder2User);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ProcessOrder2UserModelImpl.ENTITY_CACHE_ENABLED,
					ProcessOrder2UserImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return processOrder2User;
	}

	/**
	 * Returns the process order2 user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param processOrder2UserPK the primary key of the process order2 user
	 * @return the process order2 user, or <code>null</code> if a process order2 user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder2User fetchByPrimaryKey(
		ProcessOrder2UserPK processOrder2UserPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)processOrder2UserPK);
	}

	/**
	 * Returns all the process order2 users.
	 *
	 * @return the process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder2User> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the process order2 users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of process order2 users
	 * @param end the upper bound of the range of process order2 users (not inclusive)
	 * @return the range of process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder2User> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the process order2 users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of process order2 users
	 * @param end the upper bound of the range of process order2 users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of process order2 users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder2User> findAll(int start, int end,
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

		List<ProcessOrder2User> list = (List<ProcessOrder2User>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PROCESSORDER2USER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROCESSORDER2USER;

				if (pagination) {
					sql = sql.concat(ProcessOrder2UserModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ProcessOrder2User>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProcessOrder2User>(list);
				}
				else {
					list = (List<ProcessOrder2User>)QueryUtil.list(q,
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
	 * Removes all the process order2 users from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ProcessOrder2User processOrder2User : findAll()) {
			remove(processOrder2User);
		}
	}

	/**
	 * Returns the number of process order2 users.
	 *
	 * @return the number of process order2 users
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

				Query q = session.createQuery(_SQL_COUNT_PROCESSORDER2USER);

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
	 * Initializes the process order2 user persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.processmgt.model.ProcessOrder2User")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ProcessOrder2User>> listenersList = new ArrayList<ModelListener<ProcessOrder2User>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ProcessOrder2User>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ProcessOrder2UserImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PROCESSORDER2USER = "SELECT processOrder2User FROM ProcessOrder2User processOrder2User";
	private static final String _SQL_COUNT_PROCESSORDER2USER = "SELECT COUNT(processOrder2User) FROM ProcessOrder2User processOrder2User";
	private static final String _ORDER_BY_ENTITY_ALIAS = "processOrder2User.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProcessOrder2User exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ProcessOrder2UserPersistenceImpl.class);
	private static ProcessOrder2User _nullProcessOrder2User = new ProcessOrder2UserImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ProcessOrder2User> toCacheModel() {
				return _nullProcessOrder2UserCacheModel;
			}
		};

	private static CacheModel<ProcessOrder2User> _nullProcessOrder2UserCacheModel =
		new CacheModel<ProcessOrder2User>() {
			@Override
			public ProcessOrder2User toEntityModel() {
				return _nullProcessOrder2User;
			}
		};
}