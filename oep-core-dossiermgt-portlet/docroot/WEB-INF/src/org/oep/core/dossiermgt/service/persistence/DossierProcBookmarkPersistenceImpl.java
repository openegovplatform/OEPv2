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

import org.oep.core.dossiermgt.NoSuchDossierProcBookmarkException;
import org.oep.core.dossiermgt.model.DossierProcBookmark;
import org.oep.core.dossiermgt.model.impl.DossierProcBookmarkImpl;
import org.oep.core.dossiermgt.model.impl.DossierProcBookmarkModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier proc bookmark service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcBookmarkPersistence
 * @see DossierProcBookmarkUtil
 * @generated
 */
public class DossierProcBookmarkPersistenceImpl extends BasePersistenceImpl<DossierProcBookmark>
	implements DossierProcBookmarkPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierProcBookmarkUtil} to access the dossier proc bookmark persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierProcBookmarkImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierProcBookmarkModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcBookmarkModelImpl.FINDER_CACHE_ENABLED,
			DossierProcBookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierProcBookmarkModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcBookmarkModelImpl.FINDER_CACHE_ENABLED,
			DossierProcBookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierProcBookmarkModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcBookmarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierProcBookmarkPersistenceImpl() {
		setModelClass(DossierProcBookmark.class);
	}

	/**
	 * Caches the dossier proc bookmark in the entity cache if it is enabled.
	 *
	 * @param dossierProcBookmark the dossier proc bookmark
	 */
	@Override
	public void cacheResult(DossierProcBookmark dossierProcBookmark) {
		EntityCacheUtil.putResult(DossierProcBookmarkModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcBookmarkImpl.class, dossierProcBookmark.getPrimaryKey(),
			dossierProcBookmark);

		dossierProcBookmark.resetOriginalValues();
	}

	/**
	 * Caches the dossier proc bookmarks in the entity cache if it is enabled.
	 *
	 * @param dossierProcBookmarks the dossier proc bookmarks
	 */
	@Override
	public void cacheResult(List<DossierProcBookmark> dossierProcBookmarks) {
		for (DossierProcBookmark dossierProcBookmark : dossierProcBookmarks) {
			if (EntityCacheUtil.getResult(
						DossierProcBookmarkModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcBookmarkImpl.class,
						dossierProcBookmark.getPrimaryKey()) == null) {
				cacheResult(dossierProcBookmark);
			}
			else {
				dossierProcBookmark.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier proc bookmarks.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierProcBookmarkImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierProcBookmarkImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier proc bookmark.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierProcBookmark dossierProcBookmark) {
		EntityCacheUtil.removeResult(DossierProcBookmarkModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcBookmarkImpl.class, dossierProcBookmark.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierProcBookmark> dossierProcBookmarks) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierProcBookmark dossierProcBookmark : dossierProcBookmarks) {
			EntityCacheUtil.removeResult(DossierProcBookmarkModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcBookmarkImpl.class,
				dossierProcBookmark.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier proc bookmark with the primary key. Does not add the dossier proc bookmark to the database.
	 *
	 * @param dossierProcBookmarkId the primary key for the new dossier proc bookmark
	 * @return the new dossier proc bookmark
	 */
	@Override
	public DossierProcBookmark create(long dossierProcBookmarkId) {
		DossierProcBookmark dossierProcBookmark = new DossierProcBookmarkImpl();

		dossierProcBookmark.setNew(true);
		dossierProcBookmark.setPrimaryKey(dossierProcBookmarkId);

		return dossierProcBookmark;
	}

	/**
	 * Removes the dossier proc bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProcBookmarkId the primary key of the dossier proc bookmark
	 * @return the dossier proc bookmark that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcBookmarkException if a dossier proc bookmark with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcBookmark remove(long dossierProcBookmarkId)
		throws NoSuchDossierProcBookmarkException, SystemException {
		return remove((Serializable)dossierProcBookmarkId);
	}

	/**
	 * Removes the dossier proc bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier proc bookmark
	 * @return the dossier proc bookmark that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcBookmarkException if a dossier proc bookmark with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcBookmark remove(Serializable primaryKey)
		throws NoSuchDossierProcBookmarkException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierProcBookmark dossierProcBookmark = (DossierProcBookmark)session.get(DossierProcBookmarkImpl.class,
					primaryKey);

			if (dossierProcBookmark == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierProcBookmarkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierProcBookmark);
		}
		catch (NoSuchDossierProcBookmarkException nsee) {
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
	protected DossierProcBookmark removeImpl(
		DossierProcBookmark dossierProcBookmark) throws SystemException {
		dossierProcBookmark = toUnwrappedModel(dossierProcBookmark);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierProcBookmark)) {
				dossierProcBookmark = (DossierProcBookmark)session.get(DossierProcBookmarkImpl.class,
						dossierProcBookmark.getPrimaryKeyObj());
			}

			if (dossierProcBookmark != null) {
				session.delete(dossierProcBookmark);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierProcBookmark != null) {
			clearCache(dossierProcBookmark);
		}

		return dossierProcBookmark;
	}

	@Override
	public DossierProcBookmark updateImpl(
		org.oep.core.dossiermgt.model.DossierProcBookmark dossierProcBookmark)
		throws SystemException {
		dossierProcBookmark = toUnwrappedModel(dossierProcBookmark);

		boolean isNew = dossierProcBookmark.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierProcBookmark.isNew()) {
				session.save(dossierProcBookmark);

				dossierProcBookmark.setNew(false);
			}
			else {
				session.merge(dossierProcBookmark);
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

		EntityCacheUtil.putResult(DossierProcBookmarkModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcBookmarkImpl.class, dossierProcBookmark.getPrimaryKey(),
			dossierProcBookmark);

		return dossierProcBookmark;
	}

	protected DossierProcBookmark toUnwrappedModel(
		DossierProcBookmark dossierProcBookmark) {
		if (dossierProcBookmark instanceof DossierProcBookmarkImpl) {
			return dossierProcBookmark;
		}

		DossierProcBookmarkImpl dossierProcBookmarkImpl = new DossierProcBookmarkImpl();

		dossierProcBookmarkImpl.setNew(dossierProcBookmark.isNew());
		dossierProcBookmarkImpl.setPrimaryKey(dossierProcBookmark.getPrimaryKey());

		dossierProcBookmarkImpl.setDossierProcBookmarkId(dossierProcBookmark.getDossierProcBookmarkId());
		dossierProcBookmarkImpl.setUserId(dossierProcBookmark.getUserId());
		dossierProcBookmarkImpl.setGroupId(dossierProcBookmark.getGroupId());
		dossierProcBookmarkImpl.setCompanyId(dossierProcBookmark.getCompanyId());
		dossierProcBookmarkImpl.setCreateDate(dossierProcBookmark.getCreateDate());
		dossierProcBookmarkImpl.setDossierProcAgentId(dossierProcBookmark.getDossierProcAgentId());

		return dossierProcBookmarkImpl;
	}

	/**
	 * Returns the dossier proc bookmark with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc bookmark
	 * @return the dossier proc bookmark
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcBookmarkException if a dossier proc bookmark with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcBookmark findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierProcBookmarkException, SystemException {
		DossierProcBookmark dossierProcBookmark = fetchByPrimaryKey(primaryKey);

		if (dossierProcBookmark == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierProcBookmarkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierProcBookmark;
	}

	/**
	 * Returns the dossier proc bookmark with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcBookmarkException} if it could not be found.
	 *
	 * @param dossierProcBookmarkId the primary key of the dossier proc bookmark
	 * @return the dossier proc bookmark
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcBookmarkException if a dossier proc bookmark with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcBookmark findByPrimaryKey(long dossierProcBookmarkId)
		throws NoSuchDossierProcBookmarkException, SystemException {
		return findByPrimaryKey((Serializable)dossierProcBookmarkId);
	}

	/**
	 * Returns the dossier proc bookmark with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc bookmark
	 * @return the dossier proc bookmark, or <code>null</code> if a dossier proc bookmark with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcBookmark fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierProcBookmark dossierProcBookmark = (DossierProcBookmark)EntityCacheUtil.getResult(DossierProcBookmarkModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcBookmarkImpl.class, primaryKey);

		if (dossierProcBookmark == _nullDossierProcBookmark) {
			return null;
		}

		if (dossierProcBookmark == null) {
			Session session = null;

			try {
				session = openSession();

				dossierProcBookmark = (DossierProcBookmark)session.get(DossierProcBookmarkImpl.class,
						primaryKey);

				if (dossierProcBookmark != null) {
					cacheResult(dossierProcBookmark);
				}
				else {
					EntityCacheUtil.putResult(DossierProcBookmarkModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcBookmarkImpl.class, primaryKey,
						_nullDossierProcBookmark);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierProcBookmarkModelImpl.ENTITY_CACHE_ENABLED,
					DossierProcBookmarkImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierProcBookmark;
	}

	/**
	 * Returns the dossier proc bookmark with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierProcBookmarkId the primary key of the dossier proc bookmark
	 * @return the dossier proc bookmark, or <code>null</code> if a dossier proc bookmark with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcBookmark fetchByPrimaryKey(long dossierProcBookmarkId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierProcBookmarkId);
	}

	/**
	 * Returns all the dossier proc bookmarks.
	 *
	 * @return the dossier proc bookmarks
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcBookmark> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier proc bookmarks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcBookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier proc bookmarks
	 * @param end the upper bound of the range of dossier proc bookmarks (not inclusive)
	 * @return the range of dossier proc bookmarks
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcBookmark> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier proc bookmarks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcBookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier proc bookmarks
	 * @param end the upper bound of the range of dossier proc bookmarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier proc bookmarks
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcBookmark> findAll(int start, int end,
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

		List<DossierProcBookmark> list = (List<DossierProcBookmark>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERPROCBOOKMARK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERPROCBOOKMARK;

				if (pagination) {
					sql = sql.concat(DossierProcBookmarkModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierProcBookmark>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProcBookmark>(list);
				}
				else {
					list = (List<DossierProcBookmark>)QueryUtil.list(q,
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
	 * Removes all the dossier proc bookmarks from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierProcBookmark dossierProcBookmark : findAll()) {
			remove(dossierProcBookmark);
		}
	}

	/**
	 * Returns the number of dossier proc bookmarks.
	 *
	 * @return the number of dossier proc bookmarks
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERPROCBOOKMARK);

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
	 * Initializes the dossier proc bookmark persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.DossierProcBookmark")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierProcBookmark>> listenersList = new ArrayList<ModelListener<DossierProcBookmark>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierProcBookmark>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierProcBookmarkImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERPROCBOOKMARK = "SELECT dossierProcBookmark FROM DossierProcBookmark dossierProcBookmark";
	private static final String _SQL_COUNT_DOSSIERPROCBOOKMARK = "SELECT COUNT(dossierProcBookmark) FROM DossierProcBookmark dossierProcBookmark";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierProcBookmark.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierProcBookmark exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierProcBookmarkPersistenceImpl.class);
	private static DossierProcBookmark _nullDossierProcBookmark = new DossierProcBookmarkImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierProcBookmark> toCacheModel() {
				return _nullDossierProcBookmarkCacheModel;
			}
		};

	private static CacheModel<DossierProcBookmark> _nullDossierProcBookmarkCacheModel =
		new CacheModel<DossierProcBookmark>() {
			@Override
			public DossierProcBookmark toEntityModel() {
				return _nullDossierProcBookmark;
			}
		};
}