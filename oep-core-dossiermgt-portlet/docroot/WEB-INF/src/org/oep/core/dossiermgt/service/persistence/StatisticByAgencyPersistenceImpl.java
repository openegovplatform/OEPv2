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

import org.oep.core.dossiermgt.NoSuchStatisticByAgencyException;
import org.oep.core.dossiermgt.model.StatisticByAgency;
import org.oep.core.dossiermgt.model.impl.StatisticByAgencyImpl;
import org.oep.core.dossiermgt.model.impl.StatisticByAgencyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the statistic by agency service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see StatisticByAgencyPersistence
 * @see StatisticByAgencyUtil
 * @generated
 */
public class StatisticByAgencyPersistenceImpl extends BasePersistenceImpl<StatisticByAgency>
	implements StatisticByAgencyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StatisticByAgencyUtil} to access the statistic by agency persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StatisticByAgencyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StatisticByAgencyModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByAgencyModelImpl.FINDER_CACHE_ENABLED,
			StatisticByAgencyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StatisticByAgencyModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByAgencyModelImpl.FINDER_CACHE_ENABLED,
			StatisticByAgencyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StatisticByAgencyModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByAgencyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public StatisticByAgencyPersistenceImpl() {
		setModelClass(StatisticByAgency.class);
	}

	/**
	 * Caches the statistic by agency in the entity cache if it is enabled.
	 *
	 * @param statisticByAgency the statistic by agency
	 */
	@Override
	public void cacheResult(StatisticByAgency statisticByAgency) {
		EntityCacheUtil.putResult(StatisticByAgencyModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByAgencyImpl.class, statisticByAgency.getPrimaryKey(),
			statisticByAgency);

		statisticByAgency.resetOriginalValues();
	}

	/**
	 * Caches the statistic by agencies in the entity cache if it is enabled.
	 *
	 * @param statisticByAgencies the statistic by agencies
	 */
	@Override
	public void cacheResult(List<StatisticByAgency> statisticByAgencies) {
		for (StatisticByAgency statisticByAgency : statisticByAgencies) {
			if (EntityCacheUtil.getResult(
						StatisticByAgencyModelImpl.ENTITY_CACHE_ENABLED,
						StatisticByAgencyImpl.class,
						statisticByAgency.getPrimaryKey()) == null) {
				cacheResult(statisticByAgency);
			}
			else {
				statisticByAgency.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all statistic by agencies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StatisticByAgencyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StatisticByAgencyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the statistic by agency.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StatisticByAgency statisticByAgency) {
		EntityCacheUtil.removeResult(StatisticByAgencyModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByAgencyImpl.class, statisticByAgency.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<StatisticByAgency> statisticByAgencies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StatisticByAgency statisticByAgency : statisticByAgencies) {
			EntityCacheUtil.removeResult(StatisticByAgencyModelImpl.ENTITY_CACHE_ENABLED,
				StatisticByAgencyImpl.class, statisticByAgency.getPrimaryKey());
		}
	}

	/**
	 * Creates a new statistic by agency with the primary key. Does not add the statistic by agency to the database.
	 *
	 * @param statisticByAgencyId the primary key for the new statistic by agency
	 * @return the new statistic by agency
	 */
	@Override
	public StatisticByAgency create(long statisticByAgencyId) {
		StatisticByAgency statisticByAgency = new StatisticByAgencyImpl();

		statisticByAgency.setNew(true);
		statisticByAgency.setPrimaryKey(statisticByAgencyId);

		return statisticByAgency;
	}

	/**
	 * Removes the statistic by agency with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param statisticByAgencyId the primary key of the statistic by agency
	 * @return the statistic by agency that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchStatisticByAgencyException if a statistic by agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByAgency remove(long statisticByAgencyId)
		throws NoSuchStatisticByAgencyException, SystemException {
		return remove((Serializable)statisticByAgencyId);
	}

	/**
	 * Removes the statistic by agency with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the statistic by agency
	 * @return the statistic by agency that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchStatisticByAgencyException if a statistic by agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByAgency remove(Serializable primaryKey)
		throws NoSuchStatisticByAgencyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			StatisticByAgency statisticByAgency = (StatisticByAgency)session.get(StatisticByAgencyImpl.class,
					primaryKey);

			if (statisticByAgency == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStatisticByAgencyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(statisticByAgency);
		}
		catch (NoSuchStatisticByAgencyException nsee) {
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
	protected StatisticByAgency removeImpl(StatisticByAgency statisticByAgency)
		throws SystemException {
		statisticByAgency = toUnwrappedModel(statisticByAgency);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(statisticByAgency)) {
				statisticByAgency = (StatisticByAgency)session.get(StatisticByAgencyImpl.class,
						statisticByAgency.getPrimaryKeyObj());
			}

			if (statisticByAgency != null) {
				session.delete(statisticByAgency);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (statisticByAgency != null) {
			clearCache(statisticByAgency);
		}

		return statisticByAgency;
	}

	@Override
	public StatisticByAgency updateImpl(
		org.oep.core.dossiermgt.model.StatisticByAgency statisticByAgency)
		throws SystemException {
		statisticByAgency = toUnwrappedModel(statisticByAgency);

		boolean isNew = statisticByAgency.isNew();

		Session session = null;

		try {
			session = openSession();

			if (statisticByAgency.isNew()) {
				session.save(statisticByAgency);

				statisticByAgency.setNew(false);
			}
			else {
				session.merge(statisticByAgency);
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

		EntityCacheUtil.putResult(StatisticByAgencyModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByAgencyImpl.class, statisticByAgency.getPrimaryKey(),
			statisticByAgency);

		return statisticByAgency;
	}

	protected StatisticByAgency toUnwrappedModel(
		StatisticByAgency statisticByAgency) {
		if (statisticByAgency instanceof StatisticByAgencyImpl) {
			return statisticByAgency;
		}

		StatisticByAgencyImpl statisticByAgencyImpl = new StatisticByAgencyImpl();

		statisticByAgencyImpl.setNew(statisticByAgency.isNew());
		statisticByAgencyImpl.setPrimaryKey(statisticByAgency.getPrimaryKey());

		statisticByAgencyImpl.setStatisticByAgencyId(statisticByAgency.getStatisticByAgencyId());
		statisticByAgencyImpl.setGroupId(statisticByAgency.getGroupId());
		statisticByAgencyImpl.setCompanyId(statisticByAgency.getCompanyId());
		statisticByAgencyImpl.setCreateDate(statisticByAgency.getCreateDate());
		statisticByAgencyImpl.setMonth(statisticByAgency.getMonth());
		statisticByAgencyImpl.setYear(statisticByAgency.getYear());
		statisticByAgencyImpl.setGovAgencyId(statisticByAgency.getGovAgencyId());
		statisticByAgencyImpl.setReceiveNumber(statisticByAgency.getReceiveNumber());
		statisticByAgencyImpl.setOnlineNumber(statisticByAgency.getOnlineNumber());
		statisticByAgencyImpl.setOnlineRatio(statisticByAgency.getOnlineRatio());
		statisticByAgencyImpl.setFinishNumber(statisticByAgency.getFinishNumber());
		statisticByAgencyImpl.setOntimeNumber(statisticByAgency.getOntimeNumber());
		statisticByAgencyImpl.setOntimeRatio(statisticByAgency.getOntimeRatio());
		statisticByAgencyImpl.setDelayDaysAvg(statisticByAgency.getDelayDaysAvg());

		return statisticByAgencyImpl;
	}

	/**
	 * Returns the statistic by agency with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the statistic by agency
	 * @return the statistic by agency
	 * @throws org.oep.core.dossiermgt.NoSuchStatisticByAgencyException if a statistic by agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByAgency findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStatisticByAgencyException, SystemException {
		StatisticByAgency statisticByAgency = fetchByPrimaryKey(primaryKey);

		if (statisticByAgency == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStatisticByAgencyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return statisticByAgency;
	}

	/**
	 * Returns the statistic by agency with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchStatisticByAgencyException} if it could not be found.
	 *
	 * @param statisticByAgencyId the primary key of the statistic by agency
	 * @return the statistic by agency
	 * @throws org.oep.core.dossiermgt.NoSuchStatisticByAgencyException if a statistic by agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByAgency findByPrimaryKey(long statisticByAgencyId)
		throws NoSuchStatisticByAgencyException, SystemException {
		return findByPrimaryKey((Serializable)statisticByAgencyId);
	}

	/**
	 * Returns the statistic by agency with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the statistic by agency
	 * @return the statistic by agency, or <code>null</code> if a statistic by agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByAgency fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		StatisticByAgency statisticByAgency = (StatisticByAgency)EntityCacheUtil.getResult(StatisticByAgencyModelImpl.ENTITY_CACHE_ENABLED,
				StatisticByAgencyImpl.class, primaryKey);

		if (statisticByAgency == _nullStatisticByAgency) {
			return null;
		}

		if (statisticByAgency == null) {
			Session session = null;

			try {
				session = openSession();

				statisticByAgency = (StatisticByAgency)session.get(StatisticByAgencyImpl.class,
						primaryKey);

				if (statisticByAgency != null) {
					cacheResult(statisticByAgency);
				}
				else {
					EntityCacheUtil.putResult(StatisticByAgencyModelImpl.ENTITY_CACHE_ENABLED,
						StatisticByAgencyImpl.class, primaryKey,
						_nullStatisticByAgency);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StatisticByAgencyModelImpl.ENTITY_CACHE_ENABLED,
					StatisticByAgencyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return statisticByAgency;
	}

	/**
	 * Returns the statistic by agency with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param statisticByAgencyId the primary key of the statistic by agency
	 * @return the statistic by agency, or <code>null</code> if a statistic by agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByAgency fetchByPrimaryKey(long statisticByAgencyId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)statisticByAgencyId);
	}

	/**
	 * Returns all the statistic by agencies.
	 *
	 * @return the statistic by agencies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StatisticByAgency> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the statistic by agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of statistic by agencies
	 * @param end the upper bound of the range of statistic by agencies (not inclusive)
	 * @return the range of statistic by agencies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StatisticByAgency> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the statistic by agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.StatisticByAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of statistic by agencies
	 * @param end the upper bound of the range of statistic by agencies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of statistic by agencies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StatisticByAgency> findAll(int start, int end,
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

		List<StatisticByAgency> list = (List<StatisticByAgency>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STATISTICBYAGENCY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATISTICBYAGENCY;

				if (pagination) {
					sql = sql.concat(StatisticByAgencyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StatisticByAgency>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StatisticByAgency>(list);
				}
				else {
					list = (List<StatisticByAgency>)QueryUtil.list(q,
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
	 * Removes all the statistic by agencies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (StatisticByAgency statisticByAgency : findAll()) {
			remove(statisticByAgency);
		}
	}

	/**
	 * Returns the number of statistic by agencies.
	 *
	 * @return the number of statistic by agencies
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

				Query q = session.createQuery(_SQL_COUNT_STATISTICBYAGENCY);

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
	 * Initializes the statistic by agency persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.StatisticByAgency")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<StatisticByAgency>> listenersList = new ArrayList<ModelListener<StatisticByAgency>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<StatisticByAgency>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(StatisticByAgencyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_STATISTICBYAGENCY = "SELECT statisticByAgency FROM StatisticByAgency statisticByAgency";
	private static final String _SQL_COUNT_STATISTICBYAGENCY = "SELECT COUNT(statisticByAgency) FROM StatisticByAgency statisticByAgency";
	private static final String _ORDER_BY_ENTITY_ALIAS = "statisticByAgency.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StatisticByAgency exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StatisticByAgencyPersistenceImpl.class);
	private static StatisticByAgency _nullStatisticByAgency = new StatisticByAgencyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<StatisticByAgency> toCacheModel() {
				return _nullStatisticByAgencyCacheModel;
			}
		};

	private static CacheModel<StatisticByAgency> _nullStatisticByAgencyCacheModel =
		new CacheModel<StatisticByAgency>() {
			@Override
			public StatisticByAgency toEntityModel() {
				return _nullStatisticByAgency;
			}
		};
}