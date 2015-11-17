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

import org.oep.processmgt.NoSuchStatisticByUserException;
import org.oep.processmgt.model.StatisticByUser;
import org.oep.processmgt.model.impl.StatisticByUserImpl;
import org.oep.processmgt.model.impl.StatisticByUserModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the statistic by user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see StatisticByUserPersistence
 * @see StatisticByUserUtil
 * @generated
 */
public class StatisticByUserPersistenceImpl extends BasePersistenceImpl<StatisticByUser>
	implements StatisticByUserPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StatisticByUserUtil} to access the statistic by user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StatisticByUserImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StatisticByUserModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByUserModelImpl.FINDER_CACHE_ENABLED,
			StatisticByUserImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StatisticByUserModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByUserModelImpl.FINDER_CACHE_ENABLED,
			StatisticByUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StatisticByUserModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public StatisticByUserPersistenceImpl() {
		setModelClass(StatisticByUser.class);
	}

	/**
	 * Caches the statistic by user in the entity cache if it is enabled.
	 *
	 * @param statisticByUser the statistic by user
	 */
	@Override
	public void cacheResult(StatisticByUser statisticByUser) {
		EntityCacheUtil.putResult(StatisticByUserModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByUserImpl.class, statisticByUser.getPrimaryKey(),
			statisticByUser);

		statisticByUser.resetOriginalValues();
	}

	/**
	 * Caches the statistic by users in the entity cache if it is enabled.
	 *
	 * @param statisticByUsers the statistic by users
	 */
	@Override
	public void cacheResult(List<StatisticByUser> statisticByUsers) {
		for (StatisticByUser statisticByUser : statisticByUsers) {
			if (EntityCacheUtil.getResult(
						StatisticByUserModelImpl.ENTITY_CACHE_ENABLED,
						StatisticByUserImpl.class,
						statisticByUser.getPrimaryKey()) == null) {
				cacheResult(statisticByUser);
			}
			else {
				statisticByUser.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all statistic by users.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StatisticByUserImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StatisticByUserImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the statistic by user.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StatisticByUser statisticByUser) {
		EntityCacheUtil.removeResult(StatisticByUserModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByUserImpl.class, statisticByUser.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<StatisticByUser> statisticByUsers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StatisticByUser statisticByUser : statisticByUsers) {
			EntityCacheUtil.removeResult(StatisticByUserModelImpl.ENTITY_CACHE_ENABLED,
				StatisticByUserImpl.class, statisticByUser.getPrimaryKey());
		}
	}

	/**
	 * Creates a new statistic by user with the primary key. Does not add the statistic by user to the database.
	 *
	 * @param statisticByUserId the primary key for the new statistic by user
	 * @return the new statistic by user
	 */
	@Override
	public StatisticByUser create(long statisticByUserId) {
		StatisticByUser statisticByUser = new StatisticByUserImpl();

		statisticByUser.setNew(true);
		statisticByUser.setPrimaryKey(statisticByUserId);

		return statisticByUser;
	}

	/**
	 * Removes the statistic by user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param statisticByUserId the primary key of the statistic by user
	 * @return the statistic by user that was removed
	 * @throws org.oep.processmgt.NoSuchStatisticByUserException if a statistic by user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByUser remove(long statisticByUserId)
		throws NoSuchStatisticByUserException, SystemException {
		return remove((Serializable)statisticByUserId);
	}

	/**
	 * Removes the statistic by user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the statistic by user
	 * @return the statistic by user that was removed
	 * @throws org.oep.processmgt.NoSuchStatisticByUserException if a statistic by user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByUser remove(Serializable primaryKey)
		throws NoSuchStatisticByUserException, SystemException {
		Session session = null;

		try {
			session = openSession();

			StatisticByUser statisticByUser = (StatisticByUser)session.get(StatisticByUserImpl.class,
					primaryKey);

			if (statisticByUser == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStatisticByUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(statisticByUser);
		}
		catch (NoSuchStatisticByUserException nsee) {
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
	protected StatisticByUser removeImpl(StatisticByUser statisticByUser)
		throws SystemException {
		statisticByUser = toUnwrappedModel(statisticByUser);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(statisticByUser)) {
				statisticByUser = (StatisticByUser)session.get(StatisticByUserImpl.class,
						statisticByUser.getPrimaryKeyObj());
			}

			if (statisticByUser != null) {
				session.delete(statisticByUser);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (statisticByUser != null) {
			clearCache(statisticByUser);
		}

		return statisticByUser;
	}

	@Override
	public StatisticByUser updateImpl(
		org.oep.processmgt.model.StatisticByUser statisticByUser)
		throws SystemException {
		statisticByUser = toUnwrappedModel(statisticByUser);

		boolean isNew = statisticByUser.isNew();

		Session session = null;

		try {
			session = openSession();

			if (statisticByUser.isNew()) {
				session.save(statisticByUser);

				statisticByUser.setNew(false);
			}
			else {
				session.merge(statisticByUser);
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

		EntityCacheUtil.putResult(StatisticByUserModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByUserImpl.class, statisticByUser.getPrimaryKey(),
			statisticByUser);

		return statisticByUser;
	}

	protected StatisticByUser toUnwrappedModel(StatisticByUser statisticByUser) {
		if (statisticByUser instanceof StatisticByUserImpl) {
			return statisticByUser;
		}

		StatisticByUserImpl statisticByUserImpl = new StatisticByUserImpl();

		statisticByUserImpl.setNew(statisticByUser.isNew());
		statisticByUserImpl.setPrimaryKey(statisticByUser.getPrimaryKey());

		statisticByUserImpl.setStatisticByUserId(statisticByUser.getStatisticByUserId());
		statisticByUserImpl.setUserId(statisticByUser.getUserId());
		statisticByUserImpl.setGroupId(statisticByUser.getGroupId());
		statisticByUserImpl.setCompanyId(statisticByUser.getCompanyId());
		statisticByUserImpl.setCreateDate(statisticByUser.getCreateDate());
		statisticByUserImpl.setMonth(statisticByUser.getMonth());
		statisticByUserImpl.setYear(statisticByUser.getYear());
		statisticByUserImpl.setTotalNumber(statisticByUser.getTotalNumber());
		statisticByUserImpl.setOntimeNumber(statisticByUser.getOntimeNumber());
		statisticByUserImpl.setOntimeRatio(statisticByUser.getOntimeRatio());
		statisticByUserImpl.setDelayDaysAvg(statisticByUser.getDelayDaysAvg());

		return statisticByUserImpl;
	}

	/**
	 * Returns the statistic by user with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the statistic by user
	 * @return the statistic by user
	 * @throws org.oep.processmgt.NoSuchStatisticByUserException if a statistic by user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByUser findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStatisticByUserException, SystemException {
		StatisticByUser statisticByUser = fetchByPrimaryKey(primaryKey);

		if (statisticByUser == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStatisticByUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return statisticByUser;
	}

	/**
	 * Returns the statistic by user with the primary key or throws a {@link org.oep.processmgt.NoSuchStatisticByUserException} if it could not be found.
	 *
	 * @param statisticByUserId the primary key of the statistic by user
	 * @return the statistic by user
	 * @throws org.oep.processmgt.NoSuchStatisticByUserException if a statistic by user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByUser findByPrimaryKey(long statisticByUserId)
		throws NoSuchStatisticByUserException, SystemException {
		return findByPrimaryKey((Serializable)statisticByUserId);
	}

	/**
	 * Returns the statistic by user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the statistic by user
	 * @return the statistic by user, or <code>null</code> if a statistic by user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByUser fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		StatisticByUser statisticByUser = (StatisticByUser)EntityCacheUtil.getResult(StatisticByUserModelImpl.ENTITY_CACHE_ENABLED,
				StatisticByUserImpl.class, primaryKey);

		if (statisticByUser == _nullStatisticByUser) {
			return null;
		}

		if (statisticByUser == null) {
			Session session = null;

			try {
				session = openSession();

				statisticByUser = (StatisticByUser)session.get(StatisticByUserImpl.class,
						primaryKey);

				if (statisticByUser != null) {
					cacheResult(statisticByUser);
				}
				else {
					EntityCacheUtil.putResult(StatisticByUserModelImpl.ENTITY_CACHE_ENABLED,
						StatisticByUserImpl.class, primaryKey,
						_nullStatisticByUser);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StatisticByUserModelImpl.ENTITY_CACHE_ENABLED,
					StatisticByUserImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return statisticByUser;
	}

	/**
	 * Returns the statistic by user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param statisticByUserId the primary key of the statistic by user
	 * @return the statistic by user, or <code>null</code> if a statistic by user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByUser fetchByPrimaryKey(long statisticByUserId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)statisticByUserId);
	}

	/**
	 * Returns all the statistic by users.
	 *
	 * @return the statistic by users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StatisticByUser> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the statistic by users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.StatisticByUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of statistic by users
	 * @param end the upper bound of the range of statistic by users (not inclusive)
	 * @return the range of statistic by users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StatisticByUser> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the statistic by users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.StatisticByUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of statistic by users
	 * @param end the upper bound of the range of statistic by users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of statistic by users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StatisticByUser> findAll(int start, int end,
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

		List<StatisticByUser> list = (List<StatisticByUser>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STATISTICBYUSER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATISTICBYUSER;

				if (pagination) {
					sql = sql.concat(StatisticByUserModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StatisticByUser>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StatisticByUser>(list);
				}
				else {
					list = (List<StatisticByUser>)QueryUtil.list(q,
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
	 * Removes all the statistic by users from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (StatisticByUser statisticByUser : findAll()) {
			remove(statisticByUser);
		}
	}

	/**
	 * Returns the number of statistic by users.
	 *
	 * @return the number of statistic by users
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

				Query q = session.createQuery(_SQL_COUNT_STATISTICBYUSER);

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
	 * Initializes the statistic by user persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.processmgt.model.StatisticByUser")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<StatisticByUser>> listenersList = new ArrayList<ModelListener<StatisticByUser>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<StatisticByUser>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(StatisticByUserImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_STATISTICBYUSER = "SELECT statisticByUser FROM StatisticByUser statisticByUser";
	private static final String _SQL_COUNT_STATISTICBYUSER = "SELECT COUNT(statisticByUser) FROM StatisticByUser statisticByUser";
	private static final String _ORDER_BY_ENTITY_ALIAS = "statisticByUser.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StatisticByUser exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StatisticByUserPersistenceImpl.class);
	private static StatisticByUser _nullStatisticByUser = new StatisticByUserImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<StatisticByUser> toCacheModel() {
				return _nullStatisticByUserCacheModel;
			}
		};

	private static CacheModel<StatisticByUser> _nullStatisticByUserCacheModel = new CacheModel<StatisticByUser>() {
			@Override
			public StatisticByUser toEntityModel() {
				return _nullStatisticByUser;
			}
		};
}