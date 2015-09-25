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

import org.oep.core.processmgt.NoSuchUserAssignmentException;
import org.oep.core.processmgt.model.UserAssignment;
import org.oep.core.processmgt.model.impl.UserAssignmentImpl;
import org.oep.core.processmgt.model.impl.UserAssignmentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user assignment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see UserAssignmentPersistence
 * @see UserAssignmentUtil
 * @generated
 */
public class UserAssignmentPersistenceImpl extends BasePersistenceImpl<UserAssignment>
	implements UserAssignmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserAssignmentUtil} to access the user assignment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserAssignmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			UserAssignmentModelImpl.FINDER_CACHE_ENABLED,
			UserAssignmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			UserAssignmentModelImpl.FINDER_CACHE_ENABLED,
			UserAssignmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			UserAssignmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UserAssignmentPersistenceImpl() {
		setModelClass(UserAssignment.class);
	}

	/**
	 * Caches the user assignment in the entity cache if it is enabled.
	 *
	 * @param userAssignment the user assignment
	 */
	@Override
	public void cacheResult(UserAssignment userAssignment) {
		EntityCacheUtil.putResult(UserAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			UserAssignmentImpl.class, userAssignment.getPrimaryKey(),
			userAssignment);

		userAssignment.resetOriginalValues();
	}

	/**
	 * Caches the user assignments in the entity cache if it is enabled.
	 *
	 * @param userAssignments the user assignments
	 */
	@Override
	public void cacheResult(List<UserAssignment> userAssignments) {
		for (UserAssignment userAssignment : userAssignments) {
			if (EntityCacheUtil.getResult(
						UserAssignmentModelImpl.ENTITY_CACHE_ENABLED,
						UserAssignmentImpl.class, userAssignment.getPrimaryKey()) == null) {
				cacheResult(userAssignment);
			}
			else {
				userAssignment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user assignments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserAssignmentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserAssignmentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user assignment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserAssignment userAssignment) {
		EntityCacheUtil.removeResult(UserAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			UserAssignmentImpl.class, userAssignment.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserAssignment> userAssignments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserAssignment userAssignment : userAssignments) {
			EntityCacheUtil.removeResult(UserAssignmentModelImpl.ENTITY_CACHE_ENABLED,
				UserAssignmentImpl.class, userAssignment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user assignment with the primary key. Does not add the user assignment to the database.
	 *
	 * @param userAssignmentId the primary key for the new user assignment
	 * @return the new user assignment
	 */
	@Override
	public UserAssignment create(long userAssignmentId) {
		UserAssignment userAssignment = new UserAssignmentImpl();

		userAssignment.setNew(true);
		userAssignment.setPrimaryKey(userAssignmentId);

		return userAssignment;
	}

	/**
	 * Removes the user assignment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userAssignmentId the primary key of the user assignment
	 * @return the user assignment that was removed
	 * @throws org.oep.core.processmgt.NoSuchUserAssignmentException if a user assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserAssignment remove(long userAssignmentId)
		throws NoSuchUserAssignmentException, SystemException {
		return remove((Serializable)userAssignmentId);
	}

	/**
	 * Removes the user assignment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user assignment
	 * @return the user assignment that was removed
	 * @throws org.oep.core.processmgt.NoSuchUserAssignmentException if a user assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserAssignment remove(Serializable primaryKey)
		throws NoSuchUserAssignmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserAssignment userAssignment = (UserAssignment)session.get(UserAssignmentImpl.class,
					primaryKey);

			if (userAssignment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserAssignmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userAssignment);
		}
		catch (NoSuchUserAssignmentException nsee) {
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
	protected UserAssignment removeImpl(UserAssignment userAssignment)
		throws SystemException {
		userAssignment = toUnwrappedModel(userAssignment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userAssignment)) {
				userAssignment = (UserAssignment)session.get(UserAssignmentImpl.class,
						userAssignment.getPrimaryKeyObj());
			}

			if (userAssignment != null) {
				session.delete(userAssignment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userAssignment != null) {
			clearCache(userAssignment);
		}

		return userAssignment;
	}

	@Override
	public UserAssignment updateImpl(
		org.oep.core.processmgt.model.UserAssignment userAssignment)
		throws SystemException {
		userAssignment = toUnwrappedModel(userAssignment);

		boolean isNew = userAssignment.isNew();

		Session session = null;

		try {
			session = openSession();

			if (userAssignment.isNew()) {
				session.save(userAssignment);

				userAssignment.setNew(false);
			}
			else {
				session.merge(userAssignment);
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

		EntityCacheUtil.putResult(UserAssignmentModelImpl.ENTITY_CACHE_ENABLED,
			UserAssignmentImpl.class, userAssignment.getPrimaryKey(),
			userAssignment);

		return userAssignment;
	}

	protected UserAssignment toUnwrappedModel(UserAssignment userAssignment) {
		if (userAssignment instanceof UserAssignmentImpl) {
			return userAssignment;
		}

		UserAssignmentImpl userAssignmentImpl = new UserAssignmentImpl();

		userAssignmentImpl.setNew(userAssignment.isNew());
		userAssignmentImpl.setPrimaryKey(userAssignment.getPrimaryKey());

		userAssignmentImpl.setUserAssignmentId(userAssignment.getUserAssignmentId());
		userAssignmentImpl.setUserId(userAssignment.getUserId());
		userAssignmentImpl.setGroupId(userAssignment.getGroupId());
		userAssignmentImpl.setCompanyId(userAssignment.getCompanyId());
		userAssignmentImpl.setCreateDate(userAssignment.getCreateDate());
		userAssignmentImpl.setProcessOrderId(userAssignment.getProcessOrderId());
		userAssignmentImpl.setDossierStepId(userAssignment.getDossierStepId());
		userAssignmentImpl.setAssignToUserId(userAssignment.getAssignToUserId());

		return userAssignmentImpl;
	}

	/**
	 * Returns the user assignment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user assignment
	 * @return the user assignment
	 * @throws org.oep.core.processmgt.NoSuchUserAssignmentException if a user assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserAssignment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserAssignmentException, SystemException {
		UserAssignment userAssignment = fetchByPrimaryKey(primaryKey);

		if (userAssignment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserAssignmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userAssignment;
	}

	/**
	 * Returns the user assignment with the primary key or throws a {@link org.oep.core.processmgt.NoSuchUserAssignmentException} if it could not be found.
	 *
	 * @param userAssignmentId the primary key of the user assignment
	 * @return the user assignment
	 * @throws org.oep.core.processmgt.NoSuchUserAssignmentException if a user assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserAssignment findByPrimaryKey(long userAssignmentId)
		throws NoSuchUserAssignmentException, SystemException {
		return findByPrimaryKey((Serializable)userAssignmentId);
	}

	/**
	 * Returns the user assignment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user assignment
	 * @return the user assignment, or <code>null</code> if a user assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserAssignment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserAssignment userAssignment = (UserAssignment)EntityCacheUtil.getResult(UserAssignmentModelImpl.ENTITY_CACHE_ENABLED,
				UserAssignmentImpl.class, primaryKey);

		if (userAssignment == _nullUserAssignment) {
			return null;
		}

		if (userAssignment == null) {
			Session session = null;

			try {
				session = openSession();

				userAssignment = (UserAssignment)session.get(UserAssignmentImpl.class,
						primaryKey);

				if (userAssignment != null) {
					cacheResult(userAssignment);
				}
				else {
					EntityCacheUtil.putResult(UserAssignmentModelImpl.ENTITY_CACHE_ENABLED,
						UserAssignmentImpl.class, primaryKey,
						_nullUserAssignment);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserAssignmentModelImpl.ENTITY_CACHE_ENABLED,
					UserAssignmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userAssignment;
	}

	/**
	 * Returns the user assignment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userAssignmentId the primary key of the user assignment
	 * @return the user assignment, or <code>null</code> if a user assignment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserAssignment fetchByPrimaryKey(long userAssignmentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)userAssignmentId);
	}

	/**
	 * Returns all the user assignments.
	 *
	 * @return the user assignments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserAssignment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user assignments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.UserAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user assignments
	 * @param end the upper bound of the range of user assignments (not inclusive)
	 * @return the range of user assignments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserAssignment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user assignments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.UserAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user assignments
	 * @param end the upper bound of the range of user assignments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user assignments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserAssignment> findAll(int start, int end,
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

		List<UserAssignment> list = (List<UserAssignment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERASSIGNMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERASSIGNMENT;

				if (pagination) {
					sql = sql.concat(UserAssignmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserAssignment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserAssignment>(list);
				}
				else {
					list = (List<UserAssignment>)QueryUtil.list(q,
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
	 * Removes all the user assignments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserAssignment userAssignment : findAll()) {
			remove(userAssignment);
		}
	}

	/**
	 * Returns the number of user assignments.
	 *
	 * @return the number of user assignments
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

				Query q = session.createQuery(_SQL_COUNT_USERASSIGNMENT);

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
	 * Initializes the user assignment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.processmgt.model.UserAssignment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserAssignment>> listenersList = new ArrayList<ModelListener<UserAssignment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserAssignment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserAssignmentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERASSIGNMENT = "SELECT userAssignment FROM UserAssignment userAssignment";
	private static final String _SQL_COUNT_USERASSIGNMENT = "SELECT COUNT(userAssignment) FROM UserAssignment userAssignment";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userAssignment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserAssignment exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserAssignmentPersistenceImpl.class);
	private static UserAssignment _nullUserAssignment = new UserAssignmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserAssignment> toCacheModel() {
				return _nullUserAssignmentCacheModel;
			}
		};

	private static CacheModel<UserAssignment> _nullUserAssignmentCacheModel = new CacheModel<UserAssignment>() {
			@Override
			public UserAssignment toEntityModel() {
				return _nullUserAssignment;
			}
		};
}