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

package org.oep.dossiermgt.service.persistence;

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

import org.oep.dossiermgt.NoSuchStatisticByDomainException;
import org.oep.dossiermgt.model.StatisticByDomain;
import org.oep.dossiermgt.model.impl.StatisticByDomainImpl;
import org.oep.dossiermgt.model.impl.StatisticByDomainModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the statistic by domain service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see StatisticByDomainPersistence
 * @see StatisticByDomainUtil
 * @generated
 */
public class StatisticByDomainPersistenceImpl extends BasePersistenceImpl<StatisticByDomain>
	implements StatisticByDomainPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StatisticByDomainUtil} to access the statistic by domain persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StatisticByDomainImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StatisticByDomainModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByDomainModelImpl.FINDER_CACHE_ENABLED,
			StatisticByDomainImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StatisticByDomainModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByDomainModelImpl.FINDER_CACHE_ENABLED,
			StatisticByDomainImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StatisticByDomainModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByDomainModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public StatisticByDomainPersistenceImpl() {
		setModelClass(StatisticByDomain.class);
	}

	/**
	 * Caches the statistic by domain in the entity cache if it is enabled.
	 *
	 * @param statisticByDomain the statistic by domain
	 */
	@Override
	public void cacheResult(StatisticByDomain statisticByDomain) {
		EntityCacheUtil.putResult(StatisticByDomainModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByDomainImpl.class, statisticByDomain.getPrimaryKey(),
			statisticByDomain);

		statisticByDomain.resetOriginalValues();
	}

	/**
	 * Caches the statistic by domains in the entity cache if it is enabled.
	 *
	 * @param statisticByDomains the statistic by domains
	 */
	@Override
	public void cacheResult(List<StatisticByDomain> statisticByDomains) {
		for (StatisticByDomain statisticByDomain : statisticByDomains) {
			if (EntityCacheUtil.getResult(
						StatisticByDomainModelImpl.ENTITY_CACHE_ENABLED,
						StatisticByDomainImpl.class,
						statisticByDomain.getPrimaryKey()) == null) {
				cacheResult(statisticByDomain);
			}
			else {
				statisticByDomain.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all statistic by domains.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StatisticByDomainImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StatisticByDomainImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the statistic by domain.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StatisticByDomain statisticByDomain) {
		EntityCacheUtil.removeResult(StatisticByDomainModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByDomainImpl.class, statisticByDomain.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<StatisticByDomain> statisticByDomains) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StatisticByDomain statisticByDomain : statisticByDomains) {
			EntityCacheUtil.removeResult(StatisticByDomainModelImpl.ENTITY_CACHE_ENABLED,
				StatisticByDomainImpl.class, statisticByDomain.getPrimaryKey());
		}
	}

	/**
	 * Creates a new statistic by domain with the primary key. Does not add the statistic by domain to the database.
	 *
	 * @param statisticByDomainId the primary key for the new statistic by domain
	 * @return the new statistic by domain
	 */
	@Override
	public StatisticByDomain create(long statisticByDomainId) {
		StatisticByDomain statisticByDomain = new StatisticByDomainImpl();

		statisticByDomain.setNew(true);
		statisticByDomain.setPrimaryKey(statisticByDomainId);

		return statisticByDomain;
	}

	/**
	 * Removes the statistic by domain with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param statisticByDomainId the primary key of the statistic by domain
	 * @return the statistic by domain that was removed
	 * @throws org.oep.dossiermgt.NoSuchStatisticByDomainException if a statistic by domain with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByDomain remove(long statisticByDomainId)
		throws NoSuchStatisticByDomainException, SystemException {
		return remove((Serializable)statisticByDomainId);
	}

	/**
	 * Removes the statistic by domain with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the statistic by domain
	 * @return the statistic by domain that was removed
	 * @throws org.oep.dossiermgt.NoSuchStatisticByDomainException if a statistic by domain with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByDomain remove(Serializable primaryKey)
		throws NoSuchStatisticByDomainException, SystemException {
		Session session = null;

		try {
			session = openSession();

			StatisticByDomain statisticByDomain = (StatisticByDomain)session.get(StatisticByDomainImpl.class,
					primaryKey);

			if (statisticByDomain == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStatisticByDomainException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(statisticByDomain);
		}
		catch (NoSuchStatisticByDomainException nsee) {
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
	protected StatisticByDomain removeImpl(StatisticByDomain statisticByDomain)
		throws SystemException {
		statisticByDomain = toUnwrappedModel(statisticByDomain);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(statisticByDomain)) {
				statisticByDomain = (StatisticByDomain)session.get(StatisticByDomainImpl.class,
						statisticByDomain.getPrimaryKeyObj());
			}

			if (statisticByDomain != null) {
				session.delete(statisticByDomain);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (statisticByDomain != null) {
			clearCache(statisticByDomain);
		}

		return statisticByDomain;
	}

	@Override
	public StatisticByDomain updateImpl(
		org.oep.dossiermgt.model.StatisticByDomain statisticByDomain)
		throws SystemException {
		statisticByDomain = toUnwrappedModel(statisticByDomain);

		boolean isNew = statisticByDomain.isNew();

		Session session = null;

		try {
			session = openSession();

			if (statisticByDomain.isNew()) {
				session.save(statisticByDomain);

				statisticByDomain.setNew(false);
			}
			else {
				session.merge(statisticByDomain);
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

		EntityCacheUtil.putResult(StatisticByDomainModelImpl.ENTITY_CACHE_ENABLED,
			StatisticByDomainImpl.class, statisticByDomain.getPrimaryKey(),
			statisticByDomain);

		return statisticByDomain;
	}

	protected StatisticByDomain toUnwrappedModel(
		StatisticByDomain statisticByDomain) {
		if (statisticByDomain instanceof StatisticByDomainImpl) {
			return statisticByDomain;
		}

		StatisticByDomainImpl statisticByDomainImpl = new StatisticByDomainImpl();

		statisticByDomainImpl.setNew(statisticByDomain.isNew());
		statisticByDomainImpl.setPrimaryKey(statisticByDomain.getPrimaryKey());

		statisticByDomainImpl.setStatisticByDomainId(statisticByDomain.getStatisticByDomainId());
		statisticByDomainImpl.setGroupId(statisticByDomain.getGroupId());
		statisticByDomainImpl.setCompanyId(statisticByDomain.getCompanyId());
		statisticByDomainImpl.setCreateDate(statisticByDomain.getCreateDate());
		statisticByDomainImpl.setMonth(statisticByDomain.getMonth());
		statisticByDomainImpl.setYear(statisticByDomain.getYear());
		statisticByDomainImpl.setDossierDomain(statisticByDomain.getDossierDomain());
		statisticByDomainImpl.setReceiveNumber(statisticByDomain.getReceiveNumber());
		statisticByDomainImpl.setOnlineNumber(statisticByDomain.getOnlineNumber());
		statisticByDomainImpl.setOnlineRatio(statisticByDomain.getOnlineRatio());
		statisticByDomainImpl.setFinishNumber(statisticByDomain.getFinishNumber());
		statisticByDomainImpl.setOntimeNumber(statisticByDomain.getOntimeNumber());
		statisticByDomainImpl.setOntimeRatio(statisticByDomain.getOntimeRatio());
		statisticByDomainImpl.setDelayDaysAvg(statisticByDomain.getDelayDaysAvg());

		return statisticByDomainImpl;
	}

	/**
	 * Returns the statistic by domain with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the statistic by domain
	 * @return the statistic by domain
	 * @throws org.oep.dossiermgt.NoSuchStatisticByDomainException if a statistic by domain with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByDomain findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStatisticByDomainException, SystemException {
		StatisticByDomain statisticByDomain = fetchByPrimaryKey(primaryKey);

		if (statisticByDomain == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStatisticByDomainException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return statisticByDomain;
	}

	/**
	 * Returns the statistic by domain with the primary key or throws a {@link org.oep.dossiermgt.NoSuchStatisticByDomainException} if it could not be found.
	 *
	 * @param statisticByDomainId the primary key of the statistic by domain
	 * @return the statistic by domain
	 * @throws org.oep.dossiermgt.NoSuchStatisticByDomainException if a statistic by domain with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByDomain findByPrimaryKey(long statisticByDomainId)
		throws NoSuchStatisticByDomainException, SystemException {
		return findByPrimaryKey((Serializable)statisticByDomainId);
	}

	/**
	 * Returns the statistic by domain with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the statistic by domain
	 * @return the statistic by domain, or <code>null</code> if a statistic by domain with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByDomain fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		StatisticByDomain statisticByDomain = (StatisticByDomain)EntityCacheUtil.getResult(StatisticByDomainModelImpl.ENTITY_CACHE_ENABLED,
				StatisticByDomainImpl.class, primaryKey);

		if (statisticByDomain == _nullStatisticByDomain) {
			return null;
		}

		if (statisticByDomain == null) {
			Session session = null;

			try {
				session = openSession();

				statisticByDomain = (StatisticByDomain)session.get(StatisticByDomainImpl.class,
						primaryKey);

				if (statisticByDomain != null) {
					cacheResult(statisticByDomain);
				}
				else {
					EntityCacheUtil.putResult(StatisticByDomainModelImpl.ENTITY_CACHE_ENABLED,
						StatisticByDomainImpl.class, primaryKey,
						_nullStatisticByDomain);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StatisticByDomainModelImpl.ENTITY_CACHE_ENABLED,
					StatisticByDomainImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return statisticByDomain;
	}

	/**
	 * Returns the statistic by domain with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param statisticByDomainId the primary key of the statistic by domain
	 * @return the statistic by domain, or <code>null</code> if a statistic by domain with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StatisticByDomain fetchByPrimaryKey(long statisticByDomainId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)statisticByDomainId);
	}

	/**
	 * Returns all the statistic by domains.
	 *
	 * @return the statistic by domains
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StatisticByDomain> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the statistic by domains.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.StatisticByDomainModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of statistic by domains
	 * @param end the upper bound of the range of statistic by domains (not inclusive)
	 * @return the range of statistic by domains
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StatisticByDomain> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the statistic by domains.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.StatisticByDomainModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of statistic by domains
	 * @param end the upper bound of the range of statistic by domains (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of statistic by domains
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StatisticByDomain> findAll(int start, int end,
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

		List<StatisticByDomain> list = (List<StatisticByDomain>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STATISTICBYDOMAIN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATISTICBYDOMAIN;

				if (pagination) {
					sql = sql.concat(StatisticByDomainModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StatisticByDomain>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StatisticByDomain>(list);
				}
				else {
					list = (List<StatisticByDomain>)QueryUtil.list(q,
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
	 * Removes all the statistic by domains from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (StatisticByDomain statisticByDomain : findAll()) {
			remove(statisticByDomain);
		}
	}

	/**
	 * Returns the number of statistic by domains.
	 *
	 * @return the number of statistic by domains
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

				Query q = session.createQuery(_SQL_COUNT_STATISTICBYDOMAIN);

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
	 * Initializes the statistic by domain persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.dossiermgt.model.StatisticByDomain")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<StatisticByDomain>> listenersList = new ArrayList<ModelListener<StatisticByDomain>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<StatisticByDomain>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(StatisticByDomainImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_STATISTICBYDOMAIN = "SELECT statisticByDomain FROM StatisticByDomain statisticByDomain";
	private static final String _SQL_COUNT_STATISTICBYDOMAIN = "SELECT COUNT(statisticByDomain) FROM StatisticByDomain statisticByDomain";
	private static final String _ORDER_BY_ENTITY_ALIAS = "statisticByDomain.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StatisticByDomain exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StatisticByDomainPersistenceImpl.class);
	private static StatisticByDomain _nullStatisticByDomain = new StatisticByDomainImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<StatisticByDomain> toCacheModel() {
				return _nullStatisticByDomainCacheModel;
			}
		};

	private static CacheModel<StatisticByDomain> _nullStatisticByDomainCacheModel =
		new CacheModel<StatisticByDomain>() {
			@Override
			public StatisticByDomain toEntityModel() {
				return _nullStatisticByDomain;
			}
		};
}