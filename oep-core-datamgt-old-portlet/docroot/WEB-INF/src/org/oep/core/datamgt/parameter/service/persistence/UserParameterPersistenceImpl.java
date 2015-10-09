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

package org.oep.core.datamgt.parameter.service.persistence;

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

import org.oep.core.datamgt.parameter.NoSuchUserParameterException;
import org.oep.core.datamgt.parameter.model.UserParameter;
import org.oep.core.datamgt.parameter.model.impl.UserParameterImpl;
import org.oep.core.datamgt.parameter.model.impl.UserParameterModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user parameter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TrungDK
 * @see UserParameterPersistence
 * @see UserParameterUtil
 * @generated
 */
public class UserParameterPersistenceImpl extends BasePersistenceImpl<UserParameter>
	implements UserParameterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserParameterUtil} to access the user parameter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserParameterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserParameterModelImpl.ENTITY_CACHE_ENABLED,
			UserParameterModelImpl.FINDER_CACHE_ENABLED,
			UserParameterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserParameterModelImpl.ENTITY_CACHE_ENABLED,
			UserParameterModelImpl.FINDER_CACHE_ENABLED,
			UserParameterImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserParameterModelImpl.ENTITY_CACHE_ENABLED,
			UserParameterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UserParameterPersistenceImpl() {
		setModelClass(UserParameter.class);
	}

	/**
	 * Caches the user parameter in the entity cache if it is enabled.
	 *
	 * @param userParameter the user parameter
	 */
	@Override
	public void cacheResult(UserParameter userParameter) {
		EntityCacheUtil.putResult(UserParameterModelImpl.ENTITY_CACHE_ENABLED,
			UserParameterImpl.class, userParameter.getPrimaryKey(),
			userParameter);

		userParameter.resetOriginalValues();
	}

	/**
	 * Caches the user parameters in the entity cache if it is enabled.
	 *
	 * @param userParameters the user parameters
	 */
	@Override
	public void cacheResult(List<UserParameter> userParameters) {
		for (UserParameter userParameter : userParameters) {
			if (EntityCacheUtil.getResult(
						UserParameterModelImpl.ENTITY_CACHE_ENABLED,
						UserParameterImpl.class, userParameter.getPrimaryKey()) == null) {
				cacheResult(userParameter);
			}
			else {
				userParameter.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user parameters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserParameterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserParameterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user parameter.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserParameter userParameter) {
		EntityCacheUtil.removeResult(UserParameterModelImpl.ENTITY_CACHE_ENABLED,
			UserParameterImpl.class, userParameter.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserParameter> userParameters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserParameter userParameter : userParameters) {
			EntityCacheUtil.removeResult(UserParameterModelImpl.ENTITY_CACHE_ENABLED,
				UserParameterImpl.class, userParameter.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user parameter with the primary key. Does not add the user parameter to the database.
	 *
	 * @param userParameterId the primary key for the new user parameter
	 * @return the new user parameter
	 */
	@Override
	public UserParameter create(long userParameterId) {
		UserParameter userParameter = new UserParameterImpl();

		userParameter.setNew(true);
		userParameter.setPrimaryKey(userParameterId);

		return userParameter;
	}

	/**
	 * Removes the user parameter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userParameterId the primary key of the user parameter
	 * @return the user parameter that was removed
	 * @throws org.oep.core.datamgt.parameter.NoSuchUserParameterException if a user parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserParameter remove(long userParameterId)
		throws NoSuchUserParameterException, SystemException {
		return remove((Serializable)userParameterId);
	}

	/**
	 * Removes the user parameter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user parameter
	 * @return the user parameter that was removed
	 * @throws org.oep.core.datamgt.parameter.NoSuchUserParameterException if a user parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserParameter remove(Serializable primaryKey)
		throws NoSuchUserParameterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserParameter userParameter = (UserParameter)session.get(UserParameterImpl.class,
					primaryKey);

			if (userParameter == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserParameterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userParameter);
		}
		catch (NoSuchUserParameterException nsee) {
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
	protected UserParameter removeImpl(UserParameter userParameter)
		throws SystemException {
		userParameter = toUnwrappedModel(userParameter);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userParameter)) {
				userParameter = (UserParameter)session.get(UserParameterImpl.class,
						userParameter.getPrimaryKeyObj());
			}

			if (userParameter != null) {
				session.delete(userParameter);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userParameter != null) {
			clearCache(userParameter);
		}

		return userParameter;
	}

	@Override
	public UserParameter updateImpl(
		org.oep.core.datamgt.parameter.model.UserParameter userParameter)
		throws SystemException {
		userParameter = toUnwrappedModel(userParameter);

		boolean isNew = userParameter.isNew();

		Session session = null;

		try {
			session = openSession();

			if (userParameter.isNew()) {
				session.save(userParameter);

				userParameter.setNew(false);
			}
			else {
				session.merge(userParameter);
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

		EntityCacheUtil.putResult(UserParameterModelImpl.ENTITY_CACHE_ENABLED,
			UserParameterImpl.class, userParameter.getPrimaryKey(),
			userParameter);

		return userParameter;
	}

	protected UserParameter toUnwrappedModel(UserParameter userParameter) {
		if (userParameter instanceof UserParameterImpl) {
			return userParameter;
		}

		UserParameterImpl userParameterImpl = new UserParameterImpl();

		userParameterImpl.setNew(userParameter.isNew());
		userParameterImpl.setPrimaryKey(userParameter.getPrimaryKey());

		userParameterImpl.setUserParameterId(userParameter.getUserParameterId());
		userParameterImpl.setUserId(userParameter.getUserId());
		userParameterImpl.setGroupId(userParameter.getGroupId());
		userParameterImpl.setCompanyId(userParameter.getCompanyId());
		userParameterImpl.setCreateDate(userParameter.getCreateDate());
		userParameterImpl.setModifiedDate(userParameter.getModifiedDate());
		userParameterImpl.setApplicationName(userParameter.getApplicationName());
		userParameterImpl.setParameterName(userParameter.getParameterName());
		userParameterImpl.setTitle(userParameter.getTitle());
		userParameterImpl.setParameterValue(userParameter.getParameterValue());

		return userParameterImpl;
	}

	/**
	 * Returns the user parameter with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user parameter
	 * @return the user parameter
	 * @throws org.oep.core.datamgt.parameter.NoSuchUserParameterException if a user parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserParameter findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserParameterException, SystemException {
		UserParameter userParameter = fetchByPrimaryKey(primaryKey);

		if (userParameter == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserParameterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userParameter;
	}

	/**
	 * Returns the user parameter with the primary key or throws a {@link org.oep.core.datamgt.parameter.NoSuchUserParameterException} if it could not be found.
	 *
	 * @param userParameterId the primary key of the user parameter
	 * @return the user parameter
	 * @throws org.oep.core.datamgt.parameter.NoSuchUserParameterException if a user parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserParameter findByPrimaryKey(long userParameterId)
		throws NoSuchUserParameterException, SystemException {
		return findByPrimaryKey((Serializable)userParameterId);
	}

	/**
	 * Returns the user parameter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user parameter
	 * @return the user parameter, or <code>null</code> if a user parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserParameter fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserParameter userParameter = (UserParameter)EntityCacheUtil.getResult(UserParameterModelImpl.ENTITY_CACHE_ENABLED,
				UserParameterImpl.class, primaryKey);

		if (userParameter == _nullUserParameter) {
			return null;
		}

		if (userParameter == null) {
			Session session = null;

			try {
				session = openSession();

				userParameter = (UserParameter)session.get(UserParameterImpl.class,
						primaryKey);

				if (userParameter != null) {
					cacheResult(userParameter);
				}
				else {
					EntityCacheUtil.putResult(UserParameterModelImpl.ENTITY_CACHE_ENABLED,
						UserParameterImpl.class, primaryKey, _nullUserParameter);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserParameterModelImpl.ENTITY_CACHE_ENABLED,
					UserParameterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userParameter;
	}

	/**
	 * Returns the user parameter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userParameterId the primary key of the user parameter
	 * @return the user parameter, or <code>null</code> if a user parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserParameter fetchByPrimaryKey(long userParameterId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)userParameterId);
	}

	/**
	 * Returns all the user parameters.
	 *
	 * @return the user parameters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserParameter> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user parameters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.UserParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user parameters
	 * @param end the upper bound of the range of user parameters (not inclusive)
	 * @return the range of user parameters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserParameter> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user parameters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.UserParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user parameters
	 * @param end the upper bound of the range of user parameters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user parameters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserParameter> findAll(int start, int end,
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

		List<UserParameter> list = (List<UserParameter>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERPARAMETER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERPARAMETER;

				if (pagination) {
					sql = sql.concat(UserParameterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserParameter>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserParameter>(list);
				}
				else {
					list = (List<UserParameter>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user parameters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserParameter userParameter : findAll()) {
			remove(userParameter);
		}
	}

	/**
	 * Returns the number of user parameters.
	 *
	 * @return the number of user parameters
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

				Query q = session.createQuery(_SQL_COUNT_USERPARAMETER);

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
	 * Initializes the user parameter persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.datamgt.parameter.model.UserParameter")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserParameter>> listenersList = new ArrayList<ModelListener<UserParameter>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserParameter>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserParameterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERPARAMETER = "SELECT userParameter FROM UserParameter userParameter";
	private static final String _SQL_COUNT_USERPARAMETER = "SELECT COUNT(userParameter) FROM UserParameter userParameter";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userParameter.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserParameter exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserParameterPersistenceImpl.class);
	private static UserParameter _nullUserParameter = new UserParameterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserParameter> toCacheModel() {
				return _nullUserParameterCacheModel;
			}
		};

	private static CacheModel<UserParameter> _nullUserParameterCacheModel = new CacheModel<UserParameter>() {
			@Override
			public UserParameter toEntityModel() {
				return _nullUserParameter;
			}
		};
}