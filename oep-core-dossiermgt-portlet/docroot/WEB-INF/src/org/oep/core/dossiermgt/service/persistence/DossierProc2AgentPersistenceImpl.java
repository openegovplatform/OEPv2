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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.core.dossiermgt.NoSuchDossierProc2AgentException;
import org.oep.core.dossiermgt.model.DossierProc2Agent;
import org.oep.core.dossiermgt.model.impl.DossierProc2AgentImpl;
import org.oep.core.dossiermgt.model.impl.DossierProc2AgentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dossier proc2 agent service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProc2AgentPersistence
 * @see DossierProc2AgentUtil
 * @generated
 */
public class DossierProc2AgentPersistenceImpl extends BasePersistenceImpl<DossierProc2Agent>
	implements DossierProc2AgentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierProc2AgentUtil} to access the dossier proc2 agent persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierProc2AgentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierProc2AgentModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2AgentModelImpl.FINDER_CACHE_ENABLED,
			DossierProc2AgentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierProc2AgentModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2AgentModelImpl.FINDER_CACHE_ENABLED,
			DossierProc2AgentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierProc2AgentModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2AgentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierProc2AgentPersistenceImpl() {
		setModelClass(DossierProc2Agent.class);
	}

	/**
	 * Caches the dossier proc2 agent in the entity cache if it is enabled.
	 *
	 * @param dossierProc2Agent the dossier proc2 agent
	 */
	@Override
	public void cacheResult(DossierProc2Agent dossierProc2Agent) {
		EntityCacheUtil.putResult(DossierProc2AgentModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2AgentImpl.class, dossierProc2Agent.getPrimaryKey(),
			dossierProc2Agent);

		dossierProc2Agent.resetOriginalValues();
	}

	/**
	 * Caches the dossier proc2 agents in the entity cache if it is enabled.
	 *
	 * @param dossierProc2Agents the dossier proc2 agents
	 */
	@Override
	public void cacheResult(List<DossierProc2Agent> dossierProc2Agents) {
		for (DossierProc2Agent dossierProc2Agent : dossierProc2Agents) {
			if (EntityCacheUtil.getResult(
						DossierProc2AgentModelImpl.ENTITY_CACHE_ENABLED,
						DossierProc2AgentImpl.class,
						dossierProc2Agent.getPrimaryKey()) == null) {
				cacheResult(dossierProc2Agent);
			}
			else {
				dossierProc2Agent.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier proc2 agents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierProc2AgentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierProc2AgentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier proc2 agent.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierProc2Agent dossierProc2Agent) {
		EntityCacheUtil.removeResult(DossierProc2AgentModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2AgentImpl.class, dossierProc2Agent.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierProc2Agent> dossierProc2Agents) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierProc2Agent dossierProc2Agent : dossierProc2Agents) {
			EntityCacheUtil.removeResult(DossierProc2AgentModelImpl.ENTITY_CACHE_ENABLED,
				DossierProc2AgentImpl.class, dossierProc2Agent.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier proc2 agent with the primary key. Does not add the dossier proc2 agent to the database.
	 *
	 * @param id the primary key for the new dossier proc2 agent
	 * @return the new dossier proc2 agent
	 */
	@Override
	public DossierProc2Agent create(long id) {
		DossierProc2Agent dossierProc2Agent = new DossierProc2AgentImpl();

		dossierProc2Agent.setNew(true);
		dossierProc2Agent.setPrimaryKey(id);

		return dossierProc2Agent;
	}

	/**
	 * Removes the dossier proc2 agent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dossier proc2 agent
	 * @return the dossier proc2 agent that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProc2AgentException if a dossier proc2 agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Agent remove(long id)
		throws NoSuchDossierProc2AgentException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dossier proc2 agent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier proc2 agent
	 * @return the dossier proc2 agent that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProc2AgentException if a dossier proc2 agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Agent remove(Serializable primaryKey)
		throws NoSuchDossierProc2AgentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierProc2Agent dossierProc2Agent = (DossierProc2Agent)session.get(DossierProc2AgentImpl.class,
					primaryKey);

			if (dossierProc2Agent == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierProc2AgentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierProc2Agent);
		}
		catch (NoSuchDossierProc2AgentException nsee) {
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
	protected DossierProc2Agent removeImpl(DossierProc2Agent dossierProc2Agent)
		throws SystemException {
		dossierProc2Agent = toUnwrappedModel(dossierProc2Agent);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierProc2Agent)) {
				dossierProc2Agent = (DossierProc2Agent)session.get(DossierProc2AgentImpl.class,
						dossierProc2Agent.getPrimaryKeyObj());
			}

			if (dossierProc2Agent != null) {
				session.delete(dossierProc2Agent);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierProc2Agent != null) {
			clearCache(dossierProc2Agent);
		}

		return dossierProc2Agent;
	}

	@Override
	public DossierProc2Agent updateImpl(
		org.oep.core.dossiermgt.model.DossierProc2Agent dossierProc2Agent)
		throws SystemException {
		dossierProc2Agent = toUnwrappedModel(dossierProc2Agent);

		boolean isNew = dossierProc2Agent.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierProc2Agent.isNew()) {
				session.save(dossierProc2Agent);

				dossierProc2Agent.setNew(false);
			}
			else {
				session.merge(dossierProc2Agent);
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

		EntityCacheUtil.putResult(DossierProc2AgentModelImpl.ENTITY_CACHE_ENABLED,
			DossierProc2AgentImpl.class, dossierProc2Agent.getPrimaryKey(),
			dossierProc2Agent);

		return dossierProc2Agent;
	}

	protected DossierProc2Agent toUnwrappedModel(
		DossierProc2Agent dossierProc2Agent) {
		if (dossierProc2Agent instanceof DossierProc2AgentImpl) {
			return dossierProc2Agent;
		}

		DossierProc2AgentImpl dossierProc2AgentImpl = new DossierProc2AgentImpl();

		dossierProc2AgentImpl.setNew(dossierProc2Agent.isNew());
		dossierProc2AgentImpl.setPrimaryKey(dossierProc2Agent.getPrimaryKey());

		dossierProc2AgentImpl.setId(dossierProc2Agent.getId());
		dossierProc2AgentImpl.setCompanyId(dossierProc2Agent.getCompanyId());
		dossierProc2AgentImpl.setDossierProcId(dossierProc2Agent.getDossierProcId());
		dossierProc2AgentImpl.setGovAgentNo(dossierProc2Agent.getGovAgentNo());
		dossierProc2AgentImpl.setGovAgentName(dossierProc2Agent.getGovAgentName());

		return dossierProc2AgentImpl;
	}

	/**
	 * Returns the dossier proc2 agent with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc2 agent
	 * @return the dossier proc2 agent
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProc2AgentException if a dossier proc2 agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Agent findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierProc2AgentException, SystemException {
		DossierProc2Agent dossierProc2Agent = fetchByPrimaryKey(primaryKey);

		if (dossierProc2Agent == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierProc2AgentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierProc2Agent;
	}

	/**
	 * Returns the dossier proc2 agent with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProc2AgentException} if it could not be found.
	 *
	 * @param id the primary key of the dossier proc2 agent
	 * @return the dossier proc2 agent
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProc2AgentException if a dossier proc2 agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Agent findByPrimaryKey(long id)
		throws NoSuchDossierProc2AgentException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dossier proc2 agent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc2 agent
	 * @return the dossier proc2 agent, or <code>null</code> if a dossier proc2 agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Agent fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierProc2Agent dossierProc2Agent = (DossierProc2Agent)EntityCacheUtil.getResult(DossierProc2AgentModelImpl.ENTITY_CACHE_ENABLED,
				DossierProc2AgentImpl.class, primaryKey);

		if (dossierProc2Agent == _nullDossierProc2Agent) {
			return null;
		}

		if (dossierProc2Agent == null) {
			Session session = null;

			try {
				session = openSession();

				dossierProc2Agent = (DossierProc2Agent)session.get(DossierProc2AgentImpl.class,
						primaryKey);

				if (dossierProc2Agent != null) {
					cacheResult(dossierProc2Agent);
				}
				else {
					EntityCacheUtil.putResult(DossierProc2AgentModelImpl.ENTITY_CACHE_ENABLED,
						DossierProc2AgentImpl.class, primaryKey,
						_nullDossierProc2Agent);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierProc2AgentModelImpl.ENTITY_CACHE_ENABLED,
					DossierProc2AgentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierProc2Agent;
	}

	/**
	 * Returns the dossier proc2 agent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dossier proc2 agent
	 * @return the dossier proc2 agent, or <code>null</code> if a dossier proc2 agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc2Agent fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dossier proc2 agents.
	 *
	 * @return the dossier proc2 agents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc2Agent> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier proc2 agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProc2AgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier proc2 agents
	 * @param end the upper bound of the range of dossier proc2 agents (not inclusive)
	 * @return the range of dossier proc2 agents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc2Agent> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier proc2 agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProc2AgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier proc2 agents
	 * @param end the upper bound of the range of dossier proc2 agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier proc2 agents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc2Agent> findAll(int start, int end,
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

		List<DossierProc2Agent> list = (List<DossierProc2Agent>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERPROC2AGENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERPROC2AGENT;

				if (pagination) {
					sql = sql.concat(DossierProc2AgentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierProc2Agent>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc2Agent>(list);
				}
				else {
					list = (List<DossierProc2Agent>)QueryUtil.list(q,
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
	 * Removes all the dossier proc2 agents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierProc2Agent dossierProc2Agent : findAll()) {
			remove(dossierProc2Agent);
		}
	}

	/**
	 * Returns the number of dossier proc2 agents.
	 *
	 * @return the number of dossier proc2 agents
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERPROC2AGENT);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the dossier proc2 agent persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.DossierProc2Agent")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierProc2Agent>> listenersList = new ArrayList<ModelListener<DossierProc2Agent>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierProc2Agent>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierProc2AgentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERPROC2AGENT = "SELECT dossierProc2Agent FROM DossierProc2Agent dossierProc2Agent";
	private static final String _SQL_COUNT_DOSSIERPROC2AGENT = "SELECT COUNT(dossierProc2Agent) FROM DossierProc2Agent dossierProc2Agent";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierProc2Agent.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierProc2Agent exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierProc2AgentPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static DossierProc2Agent _nullDossierProc2Agent = new DossierProc2AgentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierProc2Agent> toCacheModel() {
				return _nullDossierProc2AgentCacheModel;
			}
		};

	private static CacheModel<DossierProc2Agent> _nullDossierProc2AgentCacheModel =
		new CacheModel<DossierProc2Agent>() {
			@Override
			public DossierProc2Agent toEntityModel() {
				return _nullDossierProc2Agent;
			}
		};
}