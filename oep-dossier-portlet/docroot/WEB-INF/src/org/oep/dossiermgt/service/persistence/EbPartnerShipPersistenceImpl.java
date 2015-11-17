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

import org.oep.dossiermgt.NoSuchEbPartnerShipException;
import org.oep.dossiermgt.model.EbPartnerShip;
import org.oep.dossiermgt.model.impl.EbPartnerShipImpl;
import org.oep.dossiermgt.model.impl.EbPartnerShipModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the eb partner ship service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see EbPartnerShipPersistence
 * @see EbPartnerShipUtil
 * @generated
 */
public class EbPartnerShipPersistenceImpl extends BasePersistenceImpl<EbPartnerShip>
	implements EbPartnerShipPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EbPartnerShipUtil} to access the eb partner ship persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EbPartnerShipImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EbPartnerShipModelImpl.ENTITY_CACHE_ENABLED,
			EbPartnerShipModelImpl.FINDER_CACHE_ENABLED,
			EbPartnerShipImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EbPartnerShipModelImpl.ENTITY_CACHE_ENABLED,
			EbPartnerShipModelImpl.FINDER_CACHE_ENABLED,
			EbPartnerShipImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EbPartnerShipModelImpl.ENTITY_CACHE_ENABLED,
			EbPartnerShipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EbPartnerShipPersistenceImpl() {
		setModelClass(EbPartnerShip.class);
	}

	/**
	 * Caches the eb partner ship in the entity cache if it is enabled.
	 *
	 * @param ebPartnerShip the eb partner ship
	 */
	@Override
	public void cacheResult(EbPartnerShip ebPartnerShip) {
		EntityCacheUtil.putResult(EbPartnerShipModelImpl.ENTITY_CACHE_ENABLED,
			EbPartnerShipImpl.class, ebPartnerShip.getPrimaryKey(),
			ebPartnerShip);

		ebPartnerShip.resetOriginalValues();
	}

	/**
	 * Caches the eb partner ships in the entity cache if it is enabled.
	 *
	 * @param ebPartnerShips the eb partner ships
	 */
	@Override
	public void cacheResult(List<EbPartnerShip> ebPartnerShips) {
		for (EbPartnerShip ebPartnerShip : ebPartnerShips) {
			if (EntityCacheUtil.getResult(
						EbPartnerShipModelImpl.ENTITY_CACHE_ENABLED,
						EbPartnerShipImpl.class, ebPartnerShip.getPrimaryKey()) == null) {
				cacheResult(ebPartnerShip);
			}
			else {
				ebPartnerShip.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all eb partner ships.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EbPartnerShipImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EbPartnerShipImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the eb partner ship.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EbPartnerShip ebPartnerShip) {
		EntityCacheUtil.removeResult(EbPartnerShipModelImpl.ENTITY_CACHE_ENABLED,
			EbPartnerShipImpl.class, ebPartnerShip.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EbPartnerShip> ebPartnerShips) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EbPartnerShip ebPartnerShip : ebPartnerShips) {
			EntityCacheUtil.removeResult(EbPartnerShipModelImpl.ENTITY_CACHE_ENABLED,
				EbPartnerShipImpl.class, ebPartnerShip.getPrimaryKey());
		}
	}

	/**
	 * Creates a new eb partner ship with the primary key. Does not add the eb partner ship to the database.
	 *
	 * @param ebPartnerShipId the primary key for the new eb partner ship
	 * @return the new eb partner ship
	 */
	@Override
	public EbPartnerShip create(long ebPartnerShipId) {
		EbPartnerShip ebPartnerShip = new EbPartnerShipImpl();

		ebPartnerShip.setNew(true);
		ebPartnerShip.setPrimaryKey(ebPartnerShipId);

		return ebPartnerShip;
	}

	/**
	 * Removes the eb partner ship with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ebPartnerShipId the primary key of the eb partner ship
	 * @return the eb partner ship that was removed
	 * @throws org.oep.dossiermgt.NoSuchEbPartnerShipException if a eb partner ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EbPartnerShip remove(long ebPartnerShipId)
		throws NoSuchEbPartnerShipException, SystemException {
		return remove((Serializable)ebPartnerShipId);
	}

	/**
	 * Removes the eb partner ship with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the eb partner ship
	 * @return the eb partner ship that was removed
	 * @throws org.oep.dossiermgt.NoSuchEbPartnerShipException if a eb partner ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EbPartnerShip remove(Serializable primaryKey)
		throws NoSuchEbPartnerShipException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EbPartnerShip ebPartnerShip = (EbPartnerShip)session.get(EbPartnerShipImpl.class,
					primaryKey);

			if (ebPartnerShip == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEbPartnerShipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ebPartnerShip);
		}
		catch (NoSuchEbPartnerShipException nsee) {
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
	protected EbPartnerShip removeImpl(EbPartnerShip ebPartnerShip)
		throws SystemException {
		ebPartnerShip = toUnwrappedModel(ebPartnerShip);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ebPartnerShip)) {
				ebPartnerShip = (EbPartnerShip)session.get(EbPartnerShipImpl.class,
						ebPartnerShip.getPrimaryKeyObj());
			}

			if (ebPartnerShip != null) {
				session.delete(ebPartnerShip);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ebPartnerShip != null) {
			clearCache(ebPartnerShip);
		}

		return ebPartnerShip;
	}

	@Override
	public EbPartnerShip updateImpl(
		org.oep.dossiermgt.model.EbPartnerShip ebPartnerShip)
		throws SystemException {
		ebPartnerShip = toUnwrappedModel(ebPartnerShip);

		boolean isNew = ebPartnerShip.isNew();

		Session session = null;

		try {
			session = openSession();

			if (ebPartnerShip.isNew()) {
				session.save(ebPartnerShip);

				ebPartnerShip.setNew(false);
			}
			else {
				session.merge(ebPartnerShip);
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

		EntityCacheUtil.putResult(EbPartnerShipModelImpl.ENTITY_CACHE_ENABLED,
			EbPartnerShipImpl.class, ebPartnerShip.getPrimaryKey(),
			ebPartnerShip);

		return ebPartnerShip;
	}

	protected EbPartnerShip toUnwrappedModel(EbPartnerShip ebPartnerShip) {
		if (ebPartnerShip instanceof EbPartnerShipImpl) {
			return ebPartnerShip;
		}

		EbPartnerShipImpl ebPartnerShipImpl = new EbPartnerShipImpl();

		ebPartnerShipImpl.setNew(ebPartnerShip.isNew());
		ebPartnerShipImpl.setPrimaryKey(ebPartnerShip.getPrimaryKey());

		ebPartnerShipImpl.setEbPartnerShipId(ebPartnerShip.getEbPartnerShipId());
		ebPartnerShipImpl.setCompanyId(ebPartnerShip.getCompanyId());
		ebPartnerShipImpl.setUserId(ebPartnerShip.getUserId());
		ebPartnerShipImpl.setGroupId(ebPartnerShip.getGroupId());
		ebPartnerShipImpl.setCreateDate(ebPartnerShip.getCreateDate());
		ebPartnerShipImpl.setName(ebPartnerShip.getName());
		ebPartnerShipImpl.setCpaId(ebPartnerShip.getCpaId());
		ebPartnerShipImpl.setService(ebPartnerShip.getService());

		return ebPartnerShipImpl;
	}

	/**
	 * Returns the eb partner ship with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the eb partner ship
	 * @return the eb partner ship
	 * @throws org.oep.dossiermgt.NoSuchEbPartnerShipException if a eb partner ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EbPartnerShip findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEbPartnerShipException, SystemException {
		EbPartnerShip ebPartnerShip = fetchByPrimaryKey(primaryKey);

		if (ebPartnerShip == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEbPartnerShipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ebPartnerShip;
	}

	/**
	 * Returns the eb partner ship with the primary key or throws a {@link org.oep.dossiermgt.NoSuchEbPartnerShipException} if it could not be found.
	 *
	 * @param ebPartnerShipId the primary key of the eb partner ship
	 * @return the eb partner ship
	 * @throws org.oep.dossiermgt.NoSuchEbPartnerShipException if a eb partner ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EbPartnerShip findByPrimaryKey(long ebPartnerShipId)
		throws NoSuchEbPartnerShipException, SystemException {
		return findByPrimaryKey((Serializable)ebPartnerShipId);
	}

	/**
	 * Returns the eb partner ship with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the eb partner ship
	 * @return the eb partner ship, or <code>null</code> if a eb partner ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EbPartnerShip fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EbPartnerShip ebPartnerShip = (EbPartnerShip)EntityCacheUtil.getResult(EbPartnerShipModelImpl.ENTITY_CACHE_ENABLED,
				EbPartnerShipImpl.class, primaryKey);

		if (ebPartnerShip == _nullEbPartnerShip) {
			return null;
		}

		if (ebPartnerShip == null) {
			Session session = null;

			try {
				session = openSession();

				ebPartnerShip = (EbPartnerShip)session.get(EbPartnerShipImpl.class,
						primaryKey);

				if (ebPartnerShip != null) {
					cacheResult(ebPartnerShip);
				}
				else {
					EntityCacheUtil.putResult(EbPartnerShipModelImpl.ENTITY_CACHE_ENABLED,
						EbPartnerShipImpl.class, primaryKey, _nullEbPartnerShip);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EbPartnerShipModelImpl.ENTITY_CACHE_ENABLED,
					EbPartnerShipImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ebPartnerShip;
	}

	/**
	 * Returns the eb partner ship with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ebPartnerShipId the primary key of the eb partner ship
	 * @return the eb partner ship, or <code>null</code> if a eb partner ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EbPartnerShip fetchByPrimaryKey(long ebPartnerShipId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ebPartnerShipId);
	}

	/**
	 * Returns all the eb partner ships.
	 *
	 * @return the eb partner ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EbPartnerShip> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the eb partner ships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.EbPartnerShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eb partner ships
	 * @param end the upper bound of the range of eb partner ships (not inclusive)
	 * @return the range of eb partner ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EbPartnerShip> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the eb partner ships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.EbPartnerShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eb partner ships
	 * @param end the upper bound of the range of eb partner ships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of eb partner ships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EbPartnerShip> findAll(int start, int end,
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

		List<EbPartnerShip> list = (List<EbPartnerShip>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EBPARTNERSHIP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EBPARTNERSHIP;

				if (pagination) {
					sql = sql.concat(EbPartnerShipModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EbPartnerShip>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EbPartnerShip>(list);
				}
				else {
					list = (List<EbPartnerShip>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the eb partner ships from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EbPartnerShip ebPartnerShip : findAll()) {
			remove(ebPartnerShip);
		}
	}

	/**
	 * Returns the number of eb partner ships.
	 *
	 * @return the number of eb partner ships
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

				Query q = session.createQuery(_SQL_COUNT_EBPARTNERSHIP);

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
	 * Initializes the eb partner ship persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.dossiermgt.model.EbPartnerShip")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EbPartnerShip>> listenersList = new ArrayList<ModelListener<EbPartnerShip>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EbPartnerShip>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EbPartnerShipImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EBPARTNERSHIP = "SELECT ebPartnerShip FROM EbPartnerShip ebPartnerShip";
	private static final String _SQL_COUNT_EBPARTNERSHIP = "SELECT COUNT(ebPartnerShip) FROM EbPartnerShip ebPartnerShip";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ebPartnerShip.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EbPartnerShip exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EbPartnerShipPersistenceImpl.class);
	private static EbPartnerShip _nullEbPartnerShip = new EbPartnerShipImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EbPartnerShip> toCacheModel() {
				return _nullEbPartnerShipCacheModel;
			}
		};

	private static CacheModel<EbPartnerShip> _nullEbPartnerShipCacheModel = new CacheModel<EbPartnerShip>() {
			@Override
			public EbPartnerShip toEntityModel() {
				return _nullEbPartnerShip;
			}
		};
}