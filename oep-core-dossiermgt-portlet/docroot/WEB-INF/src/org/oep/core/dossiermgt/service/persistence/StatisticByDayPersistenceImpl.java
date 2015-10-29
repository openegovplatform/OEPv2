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

import org.oep.core.dossiermgt.NoSuchStatisticByDayException;
import org.oep.core.dossiermgt.model.StatisticByDay;
import org.oep.core.dossiermgt.model.impl.StatisticByDayImpl;
import org.oep.core.dossiermgt.model.impl.StatisticByDayModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the statistic by day service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see StatisticByDayPersistence
 * @see StatisticByDayUtil
 * @generated
 */
public class StatisticByDayPersistenceImpl extends BasePersistenceImpl<StatisticByDay>
	implements StatisticByDayPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StatisticByDayUtil} to access the statistic by day persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StatisticByDayImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StatisticByDayModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByDayModelImpl.FINDER_CACHE_ENABLED,
			StatisticByDayImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StatisticByDayModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByDayModelImpl.FINDER_CACHE_ENABLED,
			StatisticByDayImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StatisticByDayModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByDayModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public StatisticByDayPersistenceImpl() {
		setModelClass(StatisticByDay.class);
	}

	/**
	 * Caches the statistic by day in the entity cache if it is enabled.
	 *
	 * @param statisticByDay the statistic by day
	 */
	@Override
	public void cacheResult(StatisticByDay statisticByDay) {
		EntityCacheUtil.putResult(StatisticByDayModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByDayImpl.class, statisticByDay.getPrimaryKey(),
			statisticByDay);

		statisticByDay.resetOriginalValues();
	}

	/**
	 * Caches the statistic by daies in the entity cache if it is enabled.
	 *
	 * @param statisticByDaies the statistic by daies
	 */
	@Override
	public void cacheResult(List<StatisticByDay> statisticByDaies) {
		for (StatisticByDay statisticByDay : statisticByDaies) {
			if (EntityCacheUtil.getResult(
						StatisticByDayModelImpl.ENTITY_CACHE_ENABLED,
						StatisticByDayImpl.class, statisticByDay.getPrimaryKey()) == null) {
				cacheResult(statisticByDay);
			}
			else {
				statisticByDay.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all statistic by daies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StatisticByDayImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StatisticByDayImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the statistic by day.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StatisticByDay statisticByDay) {
		EntityCacheUtil.removeResult(StatisticByDayModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByDayImpl.class, statisticByDay.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<StatisticByDay> statisticByDaies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StatisticByDay statisticByDay : statisticByDaies) {
			EntityCacheUtil.removeResult(StatisticByDayModelImpl.ENTITY_CACHE_ENABLED,
				StatisticByDayImpl.class, statisticByDay.getPrimaryKey());
		}
	}

	/**
	 * Creates a new statistic by day with the primary key. Does not add the statistic by day to the database.
	 *
	 * @param statisticByDayId the primary key for the new statistic by day
	 * @return the new statistic by day
	 */
	@Override
	public StatisticByDay create(long statisticByDayId) {
		StatisticByDay statisticByDay = new StatisticByDayImpl();

		statisticByDay.setNew(true);
		statisticByDay.setPrimaryKey(statisticByDayId);

		return statisticByDay;
	}

	/**
	 * Removes the statistic by day with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param statisticByDayId the primary key of the statistic by day
	 * @return the statistic by day that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchStatisticByDayException if a statistic by day with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByDay remove(long statisticByDayId)
		throws NoSuchStatisticByDayException, SystemException {
		return remove((Serializable)statisticByDayId);
	}

	/**
	 * Removes the statistic by day with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the statistic by day
	 * @return the statistic by day that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchStatisticByDayException if a statistic by day with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByDay remove(Serializable primaryKey)
		throws NoSuchStatisticByDayException, SystemException {
		Session session = null;

		try {
			session = openSession();

			StatisticByDay statisticByDay = (StatisticByDay)session.get(StatisticByDayImpl.class,
					primaryKey);

			if (statisticByDay == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStatisticByDayException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(statisticByDay);
		}
		catch (NoSuchStatisticByDayException nsee) {
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
	protected StatisticByDay removeImpl(StatisticByDay statisticByDay)
		throws SystemException {
		statisticByDay = toUnwrappedModel(statisticByDay);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(statisticByDay)) {
				statisticByDay = (StatisticByDay)session.get(StatisticByDayImpl.class,
						statisticByDay.getPrimaryKeyObj());
			}

			if (statisticByDay != null) {
				session.delete(statisticByDay);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (statisticByDay != null) {
			clearCache(statisticByDay);
		}

		return statisticByDay;
	}

	@Override
	public StatisticByDay updateImpl(
		org.oep.core.dossiermgt.model.StatisticByDay statisticByDay)
		throws SystemException {
		statisticByDay = toUnwrappedModel(statisticByDay);

		boolean isNew = statisticByDay.isNew();

		Session session = null;

		try {
			session = openSession();

			if (statisticByDay.isNew()) {
				session.save(statisticByDay);

				statisticByDay.setNew(false);
			}
			else {
				session.merge(statisticByDay);
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

		EntityCacheUtil.putResult(StatisticByDayModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByDayImpl.class, statisticByDay.getPrimaryKey(),
			statisticByDay);

		return statisticByDay;
	}

	protected StatisticByDay toUnwrappedModel(StatisticByDay statisticByDay) {
		if (statisticByDay instanceof StatisticByDayImpl) {
			return statisticByDay;
		}

		StatisticByDayImpl statisticByDayImpl = new StatisticByDayImpl();

		statisticByDayImpl.setNew(statisticByDay.isNew());
		statisticByDayImpl.setPrimaryKey(statisticByDay.getPrimaryKey());

		statisticByDayImpl.setStatisticByDayId(statisticByDay.getStatisticByDayId());
		statisticByDayImpl.setGroupId(statisticByDay.getGroupId());
		statisticByDayImpl.setCompanyId(statisticByDay.getCompanyId());
		statisticByDayImpl.setCreateDate(statisticByDay.getCreateDate());
		statisticByDayImpl.setStatisticDate(statisticByDay.getStatisticDate());
		statisticByDayImpl.setStatisticWeek(statisticByDay.getStatisticWeek());
		statisticByDayImpl.setReceiveNumber(statisticByDay.getReceiveNumber());
		statisticByDayImpl.setOnlineNumber(statisticByDay.getOnlineNumber());
		statisticByDayImpl.setOnlineRatio(statisticByDay.getOnlineRatio());
		statisticByDayImpl.setFinishNumber(statisticByDay.getFinishNumber());
		statisticByDayImpl.setOntimeNumber(statisticByDay.getOntimeNumber());
		statisticByDayImpl.setOntimeRatio(statisticByDay.getOntimeRatio());
		statisticByDayImpl.setDelayDaysAvg(statisticByDay.getDelayDaysAvg());

		return statisticByDayImpl;
	}

	/**
	 * Returns the statistic by day with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the statistic by day
	 * @return the statistic by day
	 * @throws org.oep.core.dossiermgt.NoSuchStatisticByDayException if a statistic by day with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByDay findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStatisticByDayException, SystemException {
		StatisticByDay statisticByDay = fetchByPrimaryKey(primaryKey);

		if (statisticByDay == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStatisticByDayException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return statisticByDay;
	}

	/**
	 * Returns the statistic by day with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchStatisticByDayException} if it could not be found.
	 *
	 * @param statisticByDayId the primary key of the statistic by day
	 * @return the statistic by day
	 * @throws org.oep.core.dossiermgt.NoSuchStatisticByDayException if a statistic by day with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByDay findByPrimaryKey(long statisticByDayId)
		throws NoSuchStatisticByDayException, SystemException {
		return findByPrimaryKey((Serializable)statisticByDayId);
	}

	/**
	 * Returns the statistic by day with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the statistic by day
	 * @return the statistic by day, or <code>null</code> if a statistic by day with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByDay fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		StatisticByDay statisticByDay = (StatisticByDay)EntityCacheUtil.getResult(StatisticByDayModelImpl.ENTITY_CACHE_ENABLED,
				StatisticByDayImpl.class, primaryKey);

		if (statisticByDay == _nullStatisticByDay) {
			return null;
		}

		if (statisticByDay == null) {
			Session session = null;

			try {
				session = openSession();

				statisticByDay = (StatisticByDay)session.get(StatisticByDayImpl.class,
						primaryKey);

				if (statisticByDay != null) {
					cacheResult(statisticByDay);
				}
				else {
					EntityCacheUtil.putResult(StatisticByDayModelImpl.ENTITY_CACHE_ENABLED,
						StatisticByDayImpl.class, primaryKey,
						_nullStatisticByDay);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StatisticByDayModelImpl.ENTITY_CACHE_ENABLED,
					StatisticByDayImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return statisticByDay;
	}

	/**
	 * Returns the statistic by day with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param statisticByDayId the primary key of the statistic by day
	 * @return the statistic by day, or <code>null</code> if a statistic by day with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByDay fetchByPrimaryKey(long statisticByDayId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)statisticByDayId);
	}

	/**
	 * Returns all the statistic by daies.
	 *
	 * @return the statistic by daies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StatisticByDay> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the statistic by daies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of statistic by daies
	 * @param end the upper bound of the range of statistic by daies (not inclusive)
	 * @return the range of statistic by daies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StatisticByDay> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the statistic by daies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of statistic by daies
	 * @param end the upper bound of the range of statistic by daies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of statistic by daies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StatisticByDay> findAll(int start, int end,
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

		List<StatisticByDay> list = (List<StatisticByDay>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STATISTICBYDAY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATISTICBYDAY;

				if (pagination) {
					sql = sql.concat(StatisticByDayModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StatisticByDay>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StatisticByDay>(list);
				}
				else {
					list = (List<StatisticByDay>)QueryUtil.list(q,
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
	 * Removes all the statistic by daies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (StatisticByDay statisticByDay : findAll()) {
			remove(statisticByDay);
		}
	}

	/**
	 * Returns the number of statistic by daies.
	 *
	 * @return the number of statistic by daies
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

				Query q = session.createQuery(_SQL_COUNT_STATISTICBYDAY);

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
	 * Initializes the statistic by day persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.StatisticByDay")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<StatisticByDay>> listenersList = new ArrayList<ModelListener<StatisticByDay>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<StatisticByDay>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(StatisticByDayImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_STATISTICBYDAY = "SELECT statisticByDay FROM StatisticByDay statisticByDay";
	private static final String _SQL_COUNT_STATISTICBYDAY = "SELECT COUNT(statisticByDay) FROM StatisticByDay statisticByDay";
	private static final String _ORDER_BY_ENTITY_ALIAS = "statisticByDay.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StatisticByDay exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StatisticByDayPersistenceImpl.class);
	private static StatisticByDay _nullStatisticByDay = new StatisticByDayImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<StatisticByDay> toCacheModel() {
				return _nullStatisticByDayCacheModel;
			}
		};

	private static CacheModel<StatisticByDay> _nullStatisticByDayCacheModel = new CacheModel<StatisticByDay>() {
			@Override
			public StatisticByDay toEntityModel() {
				return _nullStatisticByDay;
			}
		};
}