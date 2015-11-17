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

import org.oep.dossiermgt.NoSuchDossierTagException;
import org.oep.dossiermgt.model.DossierTag;
import org.oep.dossiermgt.model.impl.DossierTagImpl;
import org.oep.dossiermgt.model.impl.DossierTagModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier tag service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierTagPersistence
 * @see DossierTagUtil
 * @generated
 */
public class DossierTagPersistenceImpl extends BasePersistenceImpl<DossierTag>
	implements DossierTagPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierTagUtil} to access the dossier tag persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierTagImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierTagModelImpl.ENTITY_CACHE_ENABLED,
			DossierTagModelImpl.FINDER_CACHE_ENABLED, DossierTagImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierTagModelImpl.ENTITY_CACHE_ENABLED,
			DossierTagModelImpl.FINDER_CACHE_ENABLED, DossierTagImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierTagModelImpl.ENTITY_CACHE_ENABLED,
			DossierTagModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierTagPersistenceImpl() {
		setModelClass(DossierTag.class);
	}

	/**
	 * Caches the dossier tag in the entity cache if it is enabled.
	 *
	 * @param dossierTag the dossier tag
	 */
	@Override
	public void cacheResult(DossierTag dossierTag) {
		EntityCacheUtil.putResult(DossierTagModelImpl.ENTITY_CACHE_ENABLED,
			DossierTagImpl.class, dossierTag.getPrimaryKey(), dossierTag);

		dossierTag.resetOriginalValues();
	}

	/**
	 * Caches the dossier tags in the entity cache if it is enabled.
	 *
	 * @param dossierTags the dossier tags
	 */
	@Override
	public void cacheResult(List<DossierTag> dossierTags) {
		for (DossierTag dossierTag : dossierTags) {
			if (EntityCacheUtil.getResult(
						DossierTagModelImpl.ENTITY_CACHE_ENABLED,
						DossierTagImpl.class, dossierTag.getPrimaryKey()) == null) {
				cacheResult(dossierTag);
			}
			else {
				dossierTag.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier tags.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierTagImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierTagImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier tag.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierTag dossierTag) {
		EntityCacheUtil.removeResult(DossierTagModelImpl.ENTITY_CACHE_ENABLED,
			DossierTagImpl.class, dossierTag.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierTag> dossierTags) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierTag dossierTag : dossierTags) {
			EntityCacheUtil.removeResult(DossierTagModelImpl.ENTITY_CACHE_ENABLED,
				DossierTagImpl.class, dossierTag.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier tag with the primary key. Does not add the dossier tag to the database.
	 *
	 * @param dossierTagId the primary key for the new dossier tag
	 * @return the new dossier tag
	 */
	@Override
	public DossierTag create(long dossierTagId) {
		DossierTag dossierTag = new DossierTagImpl();

		dossierTag.setNew(true);
		dossierTag.setPrimaryKey(dossierTagId);

		return dossierTag;
	}

	/**
	 * Removes the dossier tag with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierTagId the primary key of the dossier tag
	 * @return the dossier tag that was removed
	 * @throws org.oep.dossiermgt.NoSuchDossierTagException if a dossier tag with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierTag remove(long dossierTagId)
		throws NoSuchDossierTagException, SystemException {
		return remove((Serializable)dossierTagId);
	}

	/**
	 * Removes the dossier tag with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier tag
	 * @return the dossier tag that was removed
	 * @throws org.oep.dossiermgt.NoSuchDossierTagException if a dossier tag with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierTag remove(Serializable primaryKey)
		throws NoSuchDossierTagException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierTag dossierTag = (DossierTag)session.get(DossierTagImpl.class,
					primaryKey);

			if (dossierTag == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierTagException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierTag);
		}
		catch (NoSuchDossierTagException nsee) {
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
	protected DossierTag removeImpl(DossierTag dossierTag)
		throws SystemException {
		dossierTag = toUnwrappedModel(dossierTag);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierTag)) {
				dossierTag = (DossierTag)session.get(DossierTagImpl.class,
						dossierTag.getPrimaryKeyObj());
			}

			if (dossierTag != null) {
				session.delete(dossierTag);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierTag != null) {
			clearCache(dossierTag);
		}

		return dossierTag;
	}

	@Override
	public DossierTag updateImpl(org.oep.dossiermgt.model.DossierTag dossierTag)
		throws SystemException {
		dossierTag = toUnwrappedModel(dossierTag);

		boolean isNew = dossierTag.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierTag.isNew()) {
				session.save(dossierTag);

				dossierTag.setNew(false);
			}
			else {
				session.merge(dossierTag);
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

		EntityCacheUtil.putResult(DossierTagModelImpl.ENTITY_CACHE_ENABLED,
			DossierTagImpl.class, dossierTag.getPrimaryKey(), dossierTag);

		return dossierTag;
	}

	protected DossierTag toUnwrappedModel(DossierTag dossierTag) {
		if (dossierTag instanceof DossierTagImpl) {
			return dossierTag;
		}

		DossierTagImpl dossierTagImpl = new DossierTagImpl();

		dossierTagImpl.setNew(dossierTag.isNew());
		dossierTagImpl.setPrimaryKey(dossierTag.getPrimaryKey());

		dossierTagImpl.setDossierTagId(dossierTag.getDossierTagId());
		dossierTagImpl.setUserId(dossierTag.getUserId());
		dossierTagImpl.setGroupId(dossierTag.getGroupId());
		dossierTagImpl.setCompanyId(dossierTag.getCompanyId());
		dossierTagImpl.setCreateDate(dossierTag.getCreateDate());
		dossierTagImpl.setDossierId(dossierTag.getDossierId());
		dossierTagImpl.setTag(dossierTag.getTag());

		return dossierTagImpl;
	}

	/**
	 * Returns the dossier tag with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier tag
	 * @return the dossier tag
	 * @throws org.oep.dossiermgt.NoSuchDossierTagException if a dossier tag with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierTag findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierTagException, SystemException {
		DossierTag dossierTag = fetchByPrimaryKey(primaryKey);

		if (dossierTag == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierTagException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierTag;
	}

	/**
	 * Returns the dossier tag with the primary key or throws a {@link org.oep.dossiermgt.NoSuchDossierTagException} if it could not be found.
	 *
	 * @param dossierTagId the primary key of the dossier tag
	 * @return the dossier tag
	 * @throws org.oep.dossiermgt.NoSuchDossierTagException if a dossier tag with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierTag findByPrimaryKey(long dossierTagId)
		throws NoSuchDossierTagException, SystemException {
		return findByPrimaryKey((Serializable)dossierTagId);
	}

	/**
	 * Returns the dossier tag with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier tag
	 * @return the dossier tag, or <code>null</code> if a dossier tag with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierTag fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierTag dossierTag = (DossierTag)EntityCacheUtil.getResult(DossierTagModelImpl.ENTITY_CACHE_ENABLED,
				DossierTagImpl.class, primaryKey);

		if (dossierTag == _nullDossierTag) {
			return null;
		}

		if (dossierTag == null) {
			Session session = null;

			try {
				session = openSession();

				dossierTag = (DossierTag)session.get(DossierTagImpl.class,
						primaryKey);

				if (dossierTag != null) {
					cacheResult(dossierTag);
				}
				else {
					EntityCacheUtil.putResult(DossierTagModelImpl.ENTITY_CACHE_ENABLED,
						DossierTagImpl.class, primaryKey, _nullDossierTag);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierTagModelImpl.ENTITY_CACHE_ENABLED,
					DossierTagImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierTag;
	}

	/**
	 * Returns the dossier tag with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierTagId the primary key of the dossier tag
	 * @return the dossier tag, or <code>null</code> if a dossier tag with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierTag fetchByPrimaryKey(long dossierTagId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierTagId);
	}

	/**
	 * Returns all the dossier tags.
	 *
	 * @return the dossier tags
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierTag> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier tags.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier tags
	 * @param end the upper bound of the range of dossier tags (not inclusive)
	 * @return the range of dossier tags
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierTag> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier tags.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier tags
	 * @param end the upper bound of the range of dossier tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier tags
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierTag> findAll(int start, int end,
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

		List<DossierTag> list = (List<DossierTag>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERTAG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERTAG;

				if (pagination) {
					sql = sql.concat(DossierTagModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierTag>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierTag>(list);
				}
				else {
					list = (List<DossierTag>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dossier tags from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierTag dossierTag : findAll()) {
			remove(dossierTag);
		}
	}

	/**
	 * Returns the number of dossier tags.
	 *
	 * @return the number of dossier tags
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERTAG);

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
	 * Initializes the dossier tag persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.dossiermgt.model.DossierTag")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierTag>> listenersList = new ArrayList<ModelListener<DossierTag>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierTag>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierTagImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERTAG = "SELECT dossierTag FROM DossierTag dossierTag";
	private static final String _SQL_COUNT_DOSSIERTAG = "SELECT COUNT(dossierTag) FROM DossierTag dossierTag";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierTag.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierTag exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierTagPersistenceImpl.class);
	private static DossierTag _nullDossierTag = new DossierTagImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierTag> toCacheModel() {
				return _nullDossierTagCacheModel;
			}
		};

	private static CacheModel<DossierTag> _nullDossierTagCacheModel = new CacheModel<DossierTag>() {
			@Override
			public DossierTag toEntityModel() {
				return _nullDossierTag;
			}
		};
}