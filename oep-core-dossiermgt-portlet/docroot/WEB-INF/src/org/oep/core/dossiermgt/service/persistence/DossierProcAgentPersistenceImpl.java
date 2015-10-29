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

import org.oep.core.dossiermgt.NoSuchDossierProcAgentException;
import org.oep.core.dossiermgt.model.DossierProcAgent;
import org.oep.core.dossiermgt.model.impl.DossierProcAgentImpl;
import org.oep.core.dossiermgt.model.impl.DossierProcAgentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier proc agent service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcAgentPersistence
 * @see DossierProcAgentUtil
 * @generated
 */
public class DossierProcAgentPersistenceImpl extends BasePersistenceImpl<DossierProcAgent>
	implements DossierProcAgentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierProcAgentUtil} to access the dossier proc agent persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierProcAgentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierProcAgentModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcAgentModelImpl.FINDER_CACHE_ENABLED,
			DossierProcAgentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierProcAgentModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcAgentModelImpl.FINDER_CACHE_ENABLED,
			DossierProcAgentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierProcAgentModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcAgentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierProcAgentPersistenceImpl() {
		setModelClass(DossierProcAgent.class);
	}

	/**
	 * Caches the dossier proc agent in the entity cache if it is enabled.
	 *
	 * @param dossierProcAgent the dossier proc agent
	 */
	@Override
	public void cacheResult(DossierProcAgent dossierProcAgent) {
		EntityCacheUtil.putResult(DossierProcAgentModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcAgentImpl.class, dossierProcAgent.getPrimaryKey(),
			dossierProcAgent);

		dossierProcAgent.resetOriginalValues();
	}

	/**
	 * Caches the dossier proc agents in the entity cache if it is enabled.
	 *
	 * @param dossierProcAgents the dossier proc agents
	 */
	@Override
	public void cacheResult(List<DossierProcAgent> dossierProcAgents) {
		for (DossierProcAgent dossierProcAgent : dossierProcAgents) {
			if (EntityCacheUtil.getResult(
						DossierProcAgentModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcAgentImpl.class,
						dossierProcAgent.getPrimaryKey()) == null) {
				cacheResult(dossierProcAgent);
			}
			else {
				dossierProcAgent.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier proc agents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierProcAgentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierProcAgentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier proc agent.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierProcAgent dossierProcAgent) {
		EntityCacheUtil.removeResult(DossierProcAgentModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcAgentImpl.class, dossierProcAgent.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierProcAgent> dossierProcAgents) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierProcAgent dossierProcAgent : dossierProcAgents) {
			EntityCacheUtil.removeResult(DossierProcAgentModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcAgentImpl.class, dossierProcAgent.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier proc agent with the primary key. Does not add the dossier proc agent to the database.
	 *
	 * @param dossierProcAgentId the primary key for the new dossier proc agent
	 * @return the new dossier proc agent
	 */
	@Override
	public DossierProcAgent create(long dossierProcAgentId) {
		DossierProcAgent dossierProcAgent = new DossierProcAgentImpl();

		dossierProcAgent.setNew(true);
		dossierProcAgent.setPrimaryKey(dossierProcAgentId);

		return dossierProcAgent;
	}

	/**
	 * Removes the dossier proc agent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProcAgentId the primary key of the dossier proc agent
	 * @return the dossier proc agent that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcAgentException if a dossier proc agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcAgent remove(long dossierProcAgentId)
		throws NoSuchDossierProcAgentException, SystemException {
		return remove((Serializable)dossierProcAgentId);
	}

	/**
	 * Removes the dossier proc agent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier proc agent
	 * @return the dossier proc agent that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcAgentException if a dossier proc agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcAgent remove(Serializable primaryKey)
		throws NoSuchDossierProcAgentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierProcAgent dossierProcAgent = (DossierProcAgent)session.get(DossierProcAgentImpl.class,
					primaryKey);

			if (dossierProcAgent == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierProcAgentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierProcAgent);
		}
		catch (NoSuchDossierProcAgentException nsee) {
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
	protected DossierProcAgent removeImpl(DossierProcAgent dossierProcAgent)
		throws SystemException {
		dossierProcAgent = toUnwrappedModel(dossierProcAgent);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierProcAgent)) {
				dossierProcAgent = (DossierProcAgent)session.get(DossierProcAgentImpl.class,
						dossierProcAgent.getPrimaryKeyObj());
			}

			if (dossierProcAgent != null) {
				session.delete(dossierProcAgent);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierProcAgent != null) {
			clearCache(dossierProcAgent);
		}

		return dossierProcAgent;
	}

	@Override
	public DossierProcAgent updateImpl(
		org.oep.core.dossiermgt.model.DossierProcAgent dossierProcAgent)
		throws SystemException {
		dossierProcAgent = toUnwrappedModel(dossierProcAgent);

		boolean isNew = dossierProcAgent.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierProcAgent.isNew()) {
				session.save(dossierProcAgent);

				dossierProcAgent.setNew(false);
			}
			else {
				session.merge(dossierProcAgent);
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

		EntityCacheUtil.putResult(DossierProcAgentModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcAgentImpl.class, dossierProcAgent.getPrimaryKey(),
			dossierProcAgent);

		return dossierProcAgent;
	}

	protected DossierProcAgent toUnwrappedModel(
		DossierProcAgent dossierProcAgent) {
		if (dossierProcAgent instanceof DossierProcAgentImpl) {
			return dossierProcAgent;
		}

		DossierProcAgentImpl dossierProcAgentImpl = new DossierProcAgentImpl();

		dossierProcAgentImpl.setNew(dossierProcAgent.isNew());
		dossierProcAgentImpl.setPrimaryKey(dossierProcAgent.getPrimaryKey());

		dossierProcAgentImpl.setDossierProcAgentId(dossierProcAgent.getDossierProcAgentId());
		dossierProcAgentImpl.setCompanyId(dossierProcAgent.getCompanyId());
		dossierProcAgentImpl.setCreateDate(dossierProcAgent.getCreateDate());
		dossierProcAgentImpl.setModifiedDate(dossierProcAgent.getModifiedDate());
		dossierProcAgentImpl.setDossierProcId(dossierProcAgent.getDossierProcId());
		dossierProcAgentImpl.setGovAgencyId(dossierProcAgent.getGovAgencyId());
		dossierProcAgentImpl.setGovAgencyName(dossierProcAgent.getGovAgencyName());
		dossierProcAgentImpl.setBankTransfer(dossierProcAgent.getBankTransfer());
		dossierProcAgentImpl.setKeypay(dossierProcAgent.getKeypay());
		dossierProcAgentImpl.setEbPartnerShipId(dossierProcAgent.getEbPartnerShipId());

		return dossierProcAgentImpl;
	}

	/**
	 * Returns the dossier proc agent with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc agent
	 * @return the dossier proc agent
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcAgentException if a dossier proc agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcAgent findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierProcAgentException, SystemException {
		DossierProcAgent dossierProcAgent = fetchByPrimaryKey(primaryKey);

		if (dossierProcAgent == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierProcAgentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierProcAgent;
	}

	/**
	 * Returns the dossier proc agent with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcAgentException} if it could not be found.
	 *
	 * @param dossierProcAgentId the primary key of the dossier proc agent
	 * @return the dossier proc agent
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcAgentException if a dossier proc agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcAgent findByPrimaryKey(long dossierProcAgentId)
		throws NoSuchDossierProcAgentException, SystemException {
		return findByPrimaryKey((Serializable)dossierProcAgentId);
	}

	/**
	 * Returns the dossier proc agent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc agent
	 * @return the dossier proc agent, or <code>null</code> if a dossier proc agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcAgent fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierProcAgent dossierProcAgent = (DossierProcAgent)EntityCacheUtil.getResult(DossierProcAgentModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcAgentImpl.class, primaryKey);

		if (dossierProcAgent == _nullDossierProcAgent) {
			return null;
		}

		if (dossierProcAgent == null) {
			Session session = null;

			try {
				session = openSession();

				dossierProcAgent = (DossierProcAgent)session.get(DossierProcAgentImpl.class,
						primaryKey);

				if (dossierProcAgent != null) {
					cacheResult(dossierProcAgent);
				}
				else {
					EntityCacheUtil.putResult(DossierProcAgentModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcAgentImpl.class, primaryKey,
						_nullDossierProcAgent);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierProcAgentModelImpl.ENTITY_CACHE_ENABLED,
					DossierProcAgentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierProcAgent;
	}

	/**
	 * Returns the dossier proc agent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierProcAgentId the primary key of the dossier proc agent
	 * @return the dossier proc agent, or <code>null</code> if a dossier proc agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcAgent fetchByPrimaryKey(long dossierProcAgentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierProcAgentId);
	}

	/**
	 * Returns all the dossier proc agents.
	 *
	 * @return the dossier proc agents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcAgent> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier proc agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier proc agents
	 * @param end the upper bound of the range of dossier proc agents (not inclusive)
	 * @return the range of dossier proc agents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcAgent> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier proc agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier proc agents
	 * @param end the upper bound of the range of dossier proc agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier proc agents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcAgent> findAll(int start, int end,
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

		List<DossierProcAgent> list = (List<DossierProcAgent>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERPROCAGENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERPROCAGENT;

				if (pagination) {
					sql = sql.concat(DossierProcAgentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierProcAgent>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProcAgent>(list);
				}
				else {
					list = (List<DossierProcAgent>)QueryUtil.list(q,
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
	 * Removes all the dossier proc agents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierProcAgent dossierProcAgent : findAll()) {
			remove(dossierProcAgent);
		}
	}

	/**
	 * Returns the number of dossier proc agents.
	 *
	 * @return the number of dossier proc agents
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERPROCAGENT);

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
	 * Initializes the dossier proc agent persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.DossierProcAgent")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierProcAgent>> listenersList = new ArrayList<ModelListener<DossierProcAgent>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierProcAgent>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierProcAgentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERPROCAGENT = "SELECT dossierProcAgent FROM DossierProcAgent dossierProcAgent";
	private static final String _SQL_COUNT_DOSSIERPROCAGENT = "SELECT COUNT(dossierProcAgent) FROM DossierProcAgent dossierProcAgent";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierProcAgent.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierProcAgent exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierProcAgentPersistenceImpl.class);
	private static DossierProcAgent _nullDossierProcAgent = new DossierProcAgentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierProcAgent> toCacheModel() {
				return _nullDossierProcAgentCacheModel;
			}
		};

	private static CacheModel<DossierProcAgent> _nullDossierProcAgentCacheModel = new CacheModel<DossierProcAgent>() {
			@Override
			public DossierProcAgent toEntityModel() {
				return _nullDossierProcAgent;
			}
		};
}