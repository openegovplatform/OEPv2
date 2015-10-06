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

import org.oep.core.dossiermgt.NoSuchDossierProcAgencyException;
import org.oep.core.dossiermgt.model.DossierProcAgency;
import org.oep.core.dossiermgt.model.impl.DossierProcAgencyImpl;
import org.oep.core.dossiermgt.model.impl.DossierProcAgencyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier proc agency service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcAgencyPersistence
 * @see DossierProcAgencyUtil
 * @generated
 */
public class DossierProcAgencyPersistenceImpl extends BasePersistenceImpl<DossierProcAgency>
	implements DossierProcAgencyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierProcAgencyUtil} to access the dossier proc agency persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierProcAgencyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierProcAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcAgencyModelImpl.FINDER_CACHE_ENABLED,
			DossierProcAgencyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierProcAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcAgencyModelImpl.FINDER_CACHE_ENABLED,
			DossierProcAgencyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierProcAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcAgencyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierProcAgencyPersistenceImpl() {
		setModelClass(DossierProcAgency.class);
	}

	/**
	 * Caches the dossier proc agency in the entity cache if it is enabled.
	 *
	 * @param dossierProcAgency the dossier proc agency
	 */
	@Override
	public void cacheResult(DossierProcAgency dossierProcAgency) {
		EntityCacheUtil.putResult(DossierProcAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcAgencyImpl.class, dossierProcAgency.getPrimaryKey(),
			dossierProcAgency);

		dossierProcAgency.resetOriginalValues();
	}

	/**
	 * Caches the dossier proc agencies in the entity cache if it is enabled.
	 *
	 * @param dossierProcAgencies the dossier proc agencies
	 */
	@Override
	public void cacheResult(List<DossierProcAgency> dossierProcAgencies) {
		for (DossierProcAgency dossierProcAgency : dossierProcAgencies) {
			if (EntityCacheUtil.getResult(
						DossierProcAgencyModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcAgencyImpl.class,
						dossierProcAgency.getPrimaryKey()) == null) {
				cacheResult(dossierProcAgency);
			}
			else {
				dossierProcAgency.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier proc agencies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierProcAgencyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierProcAgencyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier proc agency.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierProcAgency dossierProcAgency) {
		EntityCacheUtil.removeResult(DossierProcAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcAgencyImpl.class, dossierProcAgency.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierProcAgency> dossierProcAgencies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierProcAgency dossierProcAgency : dossierProcAgencies) {
			EntityCacheUtil.removeResult(DossierProcAgencyModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcAgencyImpl.class, dossierProcAgency.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier proc agency with the primary key. Does not add the dossier proc agency to the database.
	 *
	 * @param dossierProcAgencyId the primary key for the new dossier proc agency
	 * @return the new dossier proc agency
	 */
	@Override
	public DossierProcAgency create(long dossierProcAgencyId) {
		DossierProcAgency dossierProcAgency = new DossierProcAgencyImpl();

		dossierProcAgency.setNew(true);
		dossierProcAgency.setPrimaryKey(dossierProcAgencyId);

		return dossierProcAgency;
	}

	/**
	 * Removes the dossier proc agency with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProcAgencyId the primary key of the dossier proc agency
	 * @return the dossier proc agency that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcAgencyException if a dossier proc agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcAgency remove(long dossierProcAgencyId)
		throws NoSuchDossierProcAgencyException, SystemException {
		return remove((Serializable)dossierProcAgencyId);
	}

	/**
	 * Removes the dossier proc agency with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier proc agency
	 * @return the dossier proc agency that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcAgencyException if a dossier proc agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcAgency remove(Serializable primaryKey)
		throws NoSuchDossierProcAgencyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierProcAgency dossierProcAgency = (DossierProcAgency)session.get(DossierProcAgencyImpl.class,
					primaryKey);

			if (dossierProcAgency == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierProcAgencyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierProcAgency);
		}
		catch (NoSuchDossierProcAgencyException nsee) {
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
	protected DossierProcAgency removeImpl(DossierProcAgency dossierProcAgency)
		throws SystemException {
		dossierProcAgency = toUnwrappedModel(dossierProcAgency);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierProcAgency)) {
				dossierProcAgency = (DossierProcAgency)session.get(DossierProcAgencyImpl.class,
						dossierProcAgency.getPrimaryKeyObj());
			}

			if (dossierProcAgency != null) {
				session.delete(dossierProcAgency);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierProcAgency != null) {
			clearCache(dossierProcAgency);
		}

		return dossierProcAgency;
	}

	@Override
	public DossierProcAgency updateImpl(
		org.oep.core.dossiermgt.model.DossierProcAgency dossierProcAgency)
		throws SystemException {
		dossierProcAgency = toUnwrappedModel(dossierProcAgency);

		boolean isNew = dossierProcAgency.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierProcAgency.isNew()) {
				session.save(dossierProcAgency);

				dossierProcAgency.setNew(false);
			}
			else {
				session.merge(dossierProcAgency);
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

		EntityCacheUtil.putResult(DossierProcAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcAgencyImpl.class, dossierProcAgency.getPrimaryKey(),
			dossierProcAgency);

		return dossierProcAgency;
	}

	protected DossierProcAgency toUnwrappedModel(
		DossierProcAgency dossierProcAgency) {
		if (dossierProcAgency instanceof DossierProcAgencyImpl) {
			return dossierProcAgency;
		}

		DossierProcAgencyImpl dossierProcAgencyImpl = new DossierProcAgencyImpl();

		dossierProcAgencyImpl.setNew(dossierProcAgency.isNew());
		dossierProcAgencyImpl.setPrimaryKey(dossierProcAgency.getPrimaryKey());

		dossierProcAgencyImpl.setDossierProcAgencyId(dossierProcAgency.getDossierProcAgencyId());
		dossierProcAgencyImpl.setCompanyId(dossierProcAgency.getCompanyId());
		dossierProcAgencyImpl.setCreateDate(dossierProcAgency.getCreateDate());
		dossierProcAgencyImpl.setModifiedDate(dossierProcAgency.getModifiedDate());
		dossierProcAgencyImpl.setDossierProcId(dossierProcAgency.getDossierProcId());
		dossierProcAgencyImpl.setGovAgencyId(dossierProcAgency.getGovAgencyId());
		dossierProcAgencyImpl.setGovAgencyName(dossierProcAgency.getGovAgencyName());
		dossierProcAgencyImpl.setEbPartnerShipId(dossierProcAgency.getEbPartnerShipId());

		return dossierProcAgencyImpl;
	}

	/**
	 * Returns the dossier proc agency with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc agency
	 * @return the dossier proc agency
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcAgencyException if a dossier proc agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcAgency findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierProcAgencyException, SystemException {
		DossierProcAgency dossierProcAgency = fetchByPrimaryKey(primaryKey);

		if (dossierProcAgency == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierProcAgencyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierProcAgency;
	}

	/**
	 * Returns the dossier proc agency with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcAgencyException} if it could not be found.
	 *
	 * @param dossierProcAgencyId the primary key of the dossier proc agency
	 * @return the dossier proc agency
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcAgencyException if a dossier proc agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcAgency findByPrimaryKey(long dossierProcAgencyId)
		throws NoSuchDossierProcAgencyException, SystemException {
		return findByPrimaryKey((Serializable)dossierProcAgencyId);
	}

	/**
	 * Returns the dossier proc agency with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc agency
	 * @return the dossier proc agency, or <code>null</code> if a dossier proc agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcAgency fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierProcAgency dossierProcAgency = (DossierProcAgency)EntityCacheUtil.getResult(DossierProcAgencyModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcAgencyImpl.class, primaryKey);

		if (dossierProcAgency == _nullDossierProcAgency) {
			return null;
		}

		if (dossierProcAgency == null) {
			Session session = null;

			try {
				session = openSession();

				dossierProcAgency = (DossierProcAgency)session.get(DossierProcAgencyImpl.class,
						primaryKey);

				if (dossierProcAgency != null) {
					cacheResult(dossierProcAgency);
				}
				else {
					EntityCacheUtil.putResult(DossierProcAgencyModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcAgencyImpl.class, primaryKey,
						_nullDossierProcAgency);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierProcAgencyModelImpl.ENTITY_CACHE_ENABLED,
					DossierProcAgencyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierProcAgency;
	}

	/**
	 * Returns the dossier proc agency with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierProcAgencyId the primary key of the dossier proc agency
	 * @return the dossier proc agency, or <code>null</code> if a dossier proc agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcAgency fetchByPrimaryKey(long dossierProcAgencyId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierProcAgencyId);
	}

	/**
	 * Returns all the dossier proc agencies.
	 *
	 * @return the dossier proc agencies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcAgency> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier proc agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier proc agencies
	 * @param end the upper bound of the range of dossier proc agencies (not inclusive)
	 * @return the range of dossier proc agencies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcAgency> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier proc agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier proc agencies
	 * @param end the upper bound of the range of dossier proc agencies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier proc agencies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcAgency> findAll(int start, int end,
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

		List<DossierProcAgency> list = (List<DossierProcAgency>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERPROCAGENCY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERPROCAGENCY;

				if (pagination) {
					sql = sql.concat(DossierProcAgencyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierProcAgency>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProcAgency>(list);
				}
				else {
					list = (List<DossierProcAgency>)QueryUtil.list(q,
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
	 * Removes all the dossier proc agencies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierProcAgency dossierProcAgency : findAll()) {
			remove(dossierProcAgency);
		}
	}

	/**
	 * Returns the number of dossier proc agencies.
	 *
	 * @return the number of dossier proc agencies
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERPROCAGENCY);

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
	 * Initializes the dossier proc agency persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.DossierProcAgency")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierProcAgency>> listenersList = new ArrayList<ModelListener<DossierProcAgency>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierProcAgency>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierProcAgencyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERPROCAGENCY = "SELECT dossierProcAgency FROM DossierProcAgency dossierProcAgency";
	private static final String _SQL_COUNT_DOSSIERPROCAGENCY = "SELECT COUNT(dossierProcAgency) FROM DossierProcAgency dossierProcAgency";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierProcAgency.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierProcAgency exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierProcAgencyPersistenceImpl.class);
	private static DossierProcAgency _nullDossierProcAgency = new DossierProcAgencyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierProcAgency> toCacheModel() {
				return _nullDossierProcAgencyCacheModel;
			}
		};

	private static CacheModel<DossierProcAgency> _nullDossierProcAgencyCacheModel =
		new CacheModel<DossierProcAgency>() {
			@Override
			public DossierProcAgency toEntityModel() {
				return _nullDossierProcAgency;
			}
		};
}