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

import org.oep.core.dossiermgt.NoSuchDossierProcException;
import org.oep.core.dossiermgt.model.DossierProc;
import org.oep.core.dossiermgt.model.impl.DossierProcImpl;
import org.oep.core.dossiermgt.model.impl.DossierProcModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dossier proc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcPersistence
 * @see DossierProcUtil
 * @generated
 */
public class DossierProcPersistenceImpl extends BasePersistenceImpl<DossierProc>
	implements DossierProcPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierProcUtil} to access the dossier proc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierProcImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierProcPersistenceImpl() {
		setModelClass(DossierProc.class);
	}

	/**
	 * Caches the dossier proc in the entity cache if it is enabled.
	 *
	 * @param dossierProc the dossier proc
	 */
	@Override
	public void cacheResult(DossierProc dossierProc) {
		EntityCacheUtil.putResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcImpl.class, dossierProc.getPrimaryKey(), dossierProc);

		dossierProc.resetOriginalValues();
	}

	/**
	 * Caches the dossier procs in the entity cache if it is enabled.
	 *
	 * @param dossierProcs the dossier procs
	 */
	@Override
	public void cacheResult(List<DossierProc> dossierProcs) {
		for (DossierProc dossierProc : dossierProcs) {
			if (EntityCacheUtil.getResult(
						DossierProcModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcImpl.class, dossierProc.getPrimaryKey()) == null) {
				cacheResult(dossierProc);
			}
			else {
				dossierProc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier procs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierProcImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierProcImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier proc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierProc dossierProc) {
		EntityCacheUtil.removeResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcImpl.class, dossierProc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierProc> dossierProcs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierProc dossierProc : dossierProcs) {
			EntityCacheUtil.removeResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcImpl.class, dossierProc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier proc with the primary key. Does not add the dossier proc to the database.
	 *
	 * @param dossierProcId the primary key for the new dossier proc
	 * @return the new dossier proc
	 */
	@Override
	public DossierProc create(long dossierProcId) {
		DossierProc dossierProc = new DossierProcImpl();

		dossierProc.setNew(true);
		dossierProc.setPrimaryKey(dossierProcId);

		return dossierProc;
	}

	/**
	 * Removes the dossier proc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProcId the primary key of the dossier proc
	 * @return the dossier proc that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc remove(long dossierProcId)
		throws NoSuchDossierProcException, SystemException {
		return remove((Serializable)dossierProcId);
	}

	/**
	 * Removes the dossier proc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier proc
	 * @return the dossier proc that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc remove(Serializable primaryKey)
		throws NoSuchDossierProcException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierProc dossierProc = (DossierProc)session.get(DossierProcImpl.class,
					primaryKey);

			if (dossierProc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierProcException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierProc);
		}
		catch (NoSuchDossierProcException nsee) {
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
	protected DossierProc removeImpl(DossierProc dossierProc)
		throws SystemException {
		dossierProc = toUnwrappedModel(dossierProc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierProc)) {
				dossierProc = (DossierProc)session.get(DossierProcImpl.class,
						dossierProc.getPrimaryKeyObj());
			}

			if (dossierProc != null) {
				session.delete(dossierProc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierProc != null) {
			clearCache(dossierProc);
		}

		return dossierProc;
	}

	@Override
	public DossierProc updateImpl(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws SystemException {
		dossierProc = toUnwrappedModel(dossierProc);

		boolean isNew = dossierProc.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierProc.isNew()) {
				session.save(dossierProc);

				dossierProc.setNew(false);
			}
			else {
				session.merge(dossierProc);
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

		EntityCacheUtil.putResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcImpl.class, dossierProc.getPrimaryKey(), dossierProc);

		return dossierProc;
	}

	protected DossierProc toUnwrappedModel(DossierProc dossierProc) {
		if (dossierProc instanceof DossierProcImpl) {
			return dossierProc;
		}

		DossierProcImpl dossierProcImpl = new DossierProcImpl();

		dossierProcImpl.setNew(dossierProc.isNew());
		dossierProcImpl.setPrimaryKey(dossierProc.getPrimaryKey());

		dossierProcImpl.setDossierProcId(dossierProc.getDossierProcId());
		dossierProcImpl.setUserId(dossierProc.getUserId());
		dossierProcImpl.setGroupId(dossierProc.getGroupId());
		dossierProcImpl.setCompanyId(dossierProc.getCompanyId());
		dossierProcImpl.setCreateDate(dossierProc.getCreateDate());
		dossierProcImpl.setModifiedDate(dossierProc.getModifiedDate());
		dossierProcImpl.setDossierProcNo(dossierProc.getDossierProcNo());
		dossierProcImpl.setName(dossierProc.getName());
		dossierProcImpl.setEnName(dossierProc.getEnName());
		dossierProcImpl.setShortName(dossierProc.getShortName());
		dossierProcImpl.setProcessDescription(dossierProc.getProcessDescription());
		dossierProcImpl.setMethodDescription(dossierProc.getMethodDescription());
		dossierProcImpl.setDossierDescription(dossierProc.getDossierDescription());
		dossierProcImpl.setConditionDescription(dossierProc.getConditionDescription());
		dossierProcImpl.setDurationDescription(dossierProc.getDurationDescription());
		dossierProcImpl.setActorsDescription(dossierProc.getActorsDescription());
		dossierProcImpl.setResultsDescription(dossierProc.getResultsDescription());
		dossierProcImpl.setFeeDescription(dossierProc.getFeeDescription());
		dossierProcImpl.setInstructionsDescription(dossierProc.getInstructionsDescription());
		dossierProcImpl.setAdministrationNo(dossierProc.getAdministrationNo());
		dossierProcImpl.setAdministrationName(dossierProc.getAdministrationName());
		dossierProcImpl.setDomainNo(dossierProc.getDomainNo());
		dossierProcImpl.setDomainName(dossierProc.getDomainName());
		dossierProcImpl.setEffectDate(dossierProc.getEffectDate());
		dossierProcImpl.setExpireDate(dossierProc.getExpireDate());
		dossierProcImpl.setActive(dossierProc.getActive());

		return dossierProcImpl;
	}

	/**
	 * Returns the dossier proc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc
	 * @return the dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByPrimaryKey(primaryKey);

		if (dossierProc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierProcException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierProc;
	}

	/**
	 * Returns the dossier proc with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcException} if it could not be found.
	 *
	 * @param dossierProcId the primary key of the dossier proc
	 * @return the dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByPrimaryKey(long dossierProcId)
		throws NoSuchDossierProcException, SystemException {
		return findByPrimaryKey((Serializable)dossierProcId);
	}

	/**
	 * Returns the dossier proc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc
	 * @return the dossier proc, or <code>null</code> if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierProc dossierProc = (DossierProc)EntityCacheUtil.getResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcImpl.class, primaryKey);

		if (dossierProc == _nullDossierProc) {
			return null;
		}

		if (dossierProc == null) {
			Session session = null;

			try {
				session = openSession();

				dossierProc = (DossierProc)session.get(DossierProcImpl.class,
						primaryKey);

				if (dossierProc != null) {
					cacheResult(dossierProc);
				}
				else {
					EntityCacheUtil.putResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcImpl.class, primaryKey, _nullDossierProc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
					DossierProcImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierProc;
	}

	/**
	 * Returns the dossier proc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierProcId the primary key of the dossier proc
	 * @return the dossier proc, or <code>null</code> if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByPrimaryKey(long dossierProcId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierProcId);
	}

	/**
	 * Returns all the dossier procs.
	 *
	 * @return the dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findAll(int start, int end,
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

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERPROC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERPROC;

				if (pagination) {
					sql = sql.concat(DossierProcModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dossier procs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierProc dossierProc : findAll()) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs.
	 *
	 * @return the number of dossier procs
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERPROC);

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
	 * Initializes the dossier proc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.DossierProc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierProc>> listenersList = new ArrayList<ModelListener<DossierProc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierProc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierProcImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERPROC = "SELECT dossierProc FROM DossierProc dossierProc";
	private static final String _SQL_COUNT_DOSSIERPROC = "SELECT COUNT(dossierProc) FROM DossierProc dossierProc";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierProc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierProc exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierProcPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"active"
			});
	private static DossierProc _nullDossierProc = new DossierProcImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierProc> toCacheModel() {
				return _nullDossierProcCacheModel;
			}
		};

	private static CacheModel<DossierProc> _nullDossierProcCacheModel = new CacheModel<DossierProc>() {
			@Override
			public DossierProc toEntityModel() {
				return _nullDossierProc;
			}
		};
}