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

import com.liferay.portal.kernel.bean.BeanReference;
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
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import org.oep.core.dossiermgt.NoSuchDossierDocException;
import org.oep.core.dossiermgt.model.DossierDoc;
import org.oep.core.dossiermgt.model.impl.DossierDocImpl;
import org.oep.core.dossiermgt.model.impl.DossierDocModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dossier doc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierDocPersistence
 * @see DossierDocUtil
 * @generated
 */
public class DossierDocPersistenceImpl extends BasePersistenceImpl<DossierDoc>
	implements DossierDocPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierDocUtil} to access the dossier doc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierDocImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierDocModelImpl.ENTITY_CACHE_ENABLED,
			DossierDocModelImpl.FINDER_CACHE_ENABLED, DossierDocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierDocModelImpl.ENTITY_CACHE_ENABLED,
			DossierDocModelImpl.FINDER_CACHE_ENABLED, DossierDocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierDocModelImpl.ENTITY_CACHE_ENABLED,
			DossierDocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierDocPersistenceImpl() {
		setModelClass(DossierDoc.class);
	}

	/**
	 * Caches the dossier doc in the entity cache if it is enabled.
	 *
	 * @param dossierDoc the dossier doc
	 */
	@Override
	public void cacheResult(DossierDoc dossierDoc) {
		EntityCacheUtil.putResult(DossierDocModelImpl.ENTITY_CACHE_ENABLED,
			DossierDocImpl.class, dossierDoc.getPrimaryKey(), dossierDoc);

		dossierDoc.resetOriginalValues();
	}

	/**
	 * Caches the dossier docs in the entity cache if it is enabled.
	 *
	 * @param dossierDocs the dossier docs
	 */
	@Override
	public void cacheResult(List<DossierDoc> dossierDocs) {
		for (DossierDoc dossierDoc : dossierDocs) {
			if (EntityCacheUtil.getResult(
						DossierDocModelImpl.ENTITY_CACHE_ENABLED,
						DossierDocImpl.class, dossierDoc.getPrimaryKey()) == null) {
				cacheResult(dossierDoc);
			}
			else {
				dossierDoc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier docs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierDocImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierDocImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier doc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierDoc dossierDoc) {
		EntityCacheUtil.removeResult(DossierDocModelImpl.ENTITY_CACHE_ENABLED,
			DossierDocImpl.class, dossierDoc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierDoc> dossierDocs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierDoc dossierDoc : dossierDocs) {
			EntityCacheUtil.removeResult(DossierDocModelImpl.ENTITY_CACHE_ENABLED,
				DossierDocImpl.class, dossierDoc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier doc with the primary key. Does not add the dossier doc to the database.
	 *
	 * @param dossierDocId the primary key for the new dossier doc
	 * @return the new dossier doc
	 */
	@Override
	public DossierDoc create(long dossierDocId) {
		DossierDoc dossierDoc = new DossierDocImpl();

		dossierDoc.setNew(true);
		dossierDoc.setPrimaryKey(dossierDocId);

		return dossierDoc;
	}

	/**
	 * Removes the dossier doc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierDocId the primary key of the dossier doc
	 * @return the dossier doc that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierDocException if a dossier doc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierDoc remove(long dossierDocId)
		throws NoSuchDossierDocException, SystemException {
		return remove((Serializable)dossierDocId);
	}

	/**
	 * Removes the dossier doc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier doc
	 * @return the dossier doc that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierDocException if a dossier doc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierDoc remove(Serializable primaryKey)
		throws NoSuchDossierDocException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierDoc dossierDoc = (DossierDoc)session.get(DossierDocImpl.class,
					primaryKey);

			if (dossierDoc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierDocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierDoc);
		}
		catch (NoSuchDossierDocException nsee) {
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
	protected DossierDoc removeImpl(DossierDoc dossierDoc)
		throws SystemException {
		dossierDoc = toUnwrappedModel(dossierDoc);

		dossierDocToDocTemplateTableMapper.deleteLeftPrimaryKeyTableMappings(dossierDoc.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierDoc)) {
				dossierDoc = (DossierDoc)session.get(DossierDocImpl.class,
						dossierDoc.getPrimaryKeyObj());
			}

			if (dossierDoc != null) {
				session.delete(dossierDoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierDoc != null) {
			clearCache(dossierDoc);
		}

		return dossierDoc;
	}

	@Override
	public DossierDoc updateImpl(
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc)
		throws SystemException {
		dossierDoc = toUnwrappedModel(dossierDoc);

		boolean isNew = dossierDoc.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierDoc.isNew()) {
				session.save(dossierDoc);

				dossierDoc.setNew(false);
			}
			else {
				session.merge(dossierDoc);
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

		EntityCacheUtil.putResult(DossierDocModelImpl.ENTITY_CACHE_ENABLED,
			DossierDocImpl.class, dossierDoc.getPrimaryKey(), dossierDoc);

		return dossierDoc;
	}

	protected DossierDoc toUnwrappedModel(DossierDoc dossierDoc) {
		if (dossierDoc instanceof DossierDocImpl) {
			return dossierDoc;
		}

		DossierDocImpl dossierDocImpl = new DossierDocImpl();

		dossierDocImpl.setNew(dossierDoc.isNew());
		dossierDocImpl.setPrimaryKey(dossierDoc.getPrimaryKey());

		dossierDocImpl.setDossierDocId(dossierDoc.getDossierDocId());
		dossierDocImpl.setUserId(dossierDoc.getUserId());
		dossierDocImpl.setGroupId(dossierDoc.getGroupId());
		dossierDocImpl.setCompanyId(dossierDoc.getCompanyId());
		dossierDocImpl.setCreateDate(dossierDoc.getCreateDate());
		dossierDocImpl.setModifiedDate(dossierDoc.getModifiedDate());
		dossierDocImpl.setDossierProcId(dossierDoc.getDossierProcId());
		dossierDocImpl.setDossierDocNo(dossierDoc.getDossierDocNo());
		dossierDocImpl.setDossierDocName(dossierDoc.getDossierDocName());
		dossierDocImpl.setNote(dossierDoc.getNote());
		dossierDocImpl.setSequenceNo(dossierDoc.getSequenceNo());
		dossierDocImpl.setDefaultDocTemplateId(dossierDoc.getDefaultDocTemplateId());
		dossierDocImpl.setValidationType(dossierDoc.getValidationType());
		dossierDocImpl.setRequirementType(dossierDoc.getRequirementType());
		dossierDocImpl.setNumberOfFile(dossierDoc.getNumberOfFile());
		dossierDocImpl.setSplitSubDossier(dossierDoc.getSplitSubDossier());
		dossierDocImpl.setOnlineForm(dossierDoc.getOnlineForm());

		return dossierDocImpl;
	}

	/**
	 * Returns the dossier doc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier doc
	 * @return the dossier doc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierDocException if a dossier doc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierDoc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierDocException, SystemException {
		DossierDoc dossierDoc = fetchByPrimaryKey(primaryKey);

		if (dossierDoc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierDocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierDoc;
	}

	/**
	 * Returns the dossier doc with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierDocException} if it could not be found.
	 *
	 * @param dossierDocId the primary key of the dossier doc
	 * @return the dossier doc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierDocException if a dossier doc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierDoc findByPrimaryKey(long dossierDocId)
		throws NoSuchDossierDocException, SystemException {
		return findByPrimaryKey((Serializable)dossierDocId);
	}

	/**
	 * Returns the dossier doc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier doc
	 * @return the dossier doc, or <code>null</code> if a dossier doc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierDoc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierDoc dossierDoc = (DossierDoc)EntityCacheUtil.getResult(DossierDocModelImpl.ENTITY_CACHE_ENABLED,
				DossierDocImpl.class, primaryKey);

		if (dossierDoc == _nullDossierDoc) {
			return null;
		}

		if (dossierDoc == null) {
			Session session = null;

			try {
				session = openSession();

				dossierDoc = (DossierDoc)session.get(DossierDocImpl.class,
						primaryKey);

				if (dossierDoc != null) {
					cacheResult(dossierDoc);
				}
				else {
					EntityCacheUtil.putResult(DossierDocModelImpl.ENTITY_CACHE_ENABLED,
						DossierDocImpl.class, primaryKey, _nullDossierDoc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierDocModelImpl.ENTITY_CACHE_ENABLED,
					DossierDocImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierDoc;
	}

	/**
	 * Returns the dossier doc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierDocId the primary key of the dossier doc
	 * @return the dossier doc, or <code>null</code> if a dossier doc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierDoc fetchByPrimaryKey(long dossierDocId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierDocId);
	}

	/**
	 * Returns all the dossier docs.
	 *
	 * @return the dossier docs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierDoc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier docs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier docs
	 * @param end the upper bound of the range of dossier docs (not inclusive)
	 * @return the range of dossier docs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierDoc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier docs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier docs
	 * @param end the upper bound of the range of dossier docs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier docs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierDoc> findAll(int start, int end,
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

		List<DossierDoc> list = (List<DossierDoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERDOC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERDOC;

				if (pagination) {
					sql = sql.concat(DossierDocModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierDoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierDoc>(list);
				}
				else {
					list = (List<DossierDoc>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dossier docs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierDoc dossierDoc : findAll()) {
			remove(dossierDoc);
		}
	}

	/**
	 * Returns the number of dossier docs.
	 *
	 * @return the number of dossier docs
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERDOC);

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
	 * Returns all the doc templates associated with the dossier doc.
	 *
	 * @param pk the primary key of the dossier doc
	 * @return the doc templates associated with the dossier doc
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.core.dossiermgt.model.DocTemplate> getDocTemplates(
		long pk) throws SystemException {
		return getDocTemplates(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the doc templates associated with the dossier doc.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the dossier doc
	 * @param start the lower bound of the range of dossier docs
	 * @param end the upper bound of the range of dossier docs (not inclusive)
	 * @return the range of doc templates associated with the dossier doc
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.core.dossiermgt.model.DocTemplate> getDocTemplates(
		long pk, int start, int end) throws SystemException {
		return getDocTemplates(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the doc templates associated with the dossier doc.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the dossier doc
	 * @param start the lower bound of the range of dossier docs
	 * @param end the upper bound of the range of dossier docs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of doc templates associated with the dossier doc
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.core.dossiermgt.model.DocTemplate> getDocTemplates(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return dossierDocToDocTemplateTableMapper.getRightBaseModels(pk, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of doc templates associated with the dossier doc.
	 *
	 * @param pk the primary key of the dossier doc
	 * @return the number of doc templates associated with the dossier doc
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getDocTemplatesSize(long pk) throws SystemException {
		long[] pks = dossierDocToDocTemplateTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the doc template is associated with the dossier doc.
	 *
	 * @param pk the primary key of the dossier doc
	 * @param docTemplatePK the primary key of the doc template
	 * @return <code>true</code> if the doc template is associated with the dossier doc; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsDocTemplate(long pk, long docTemplatePK)
		throws SystemException {
		return dossierDocToDocTemplateTableMapper.containsTableMapping(pk,
			docTemplatePK);
	}

	/**
	 * Returns <code>true</code> if the dossier doc has any doc templates associated with it.
	 *
	 * @param pk the primary key of the dossier doc to check for associations with doc templates
	 * @return <code>true</code> if the dossier doc has any doc templates associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsDocTemplates(long pk) throws SystemException {
		if (getDocTemplatesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the dossier doc and the doc template. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dossier doc
	 * @param docTemplatePK the primary key of the doc template
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addDocTemplate(long pk, long docTemplatePK)
		throws SystemException {
		dossierDocToDocTemplateTableMapper.addTableMapping(pk, docTemplatePK);
	}

	/**
	 * Adds an association between the dossier doc and the doc template. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dossier doc
	 * @param docTemplate the doc template
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addDocTemplate(long pk,
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws SystemException {
		dossierDocToDocTemplateTableMapper.addTableMapping(pk,
			docTemplate.getPrimaryKey());
	}

	/**
	 * Adds an association between the dossier doc and the doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dossier doc
	 * @param docTemplatePKs the primary keys of the doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addDocTemplates(long pk, long[] docTemplatePKs)
		throws SystemException {
		for (long docTemplatePK : docTemplatePKs) {
			dossierDocToDocTemplateTableMapper.addTableMapping(pk, docTemplatePK);
		}
	}

	/**
	 * Adds an association between the dossier doc and the doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dossier doc
	 * @param docTemplates the doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addDocTemplates(long pk,
		List<org.oep.core.dossiermgt.model.DocTemplate> docTemplates)
		throws SystemException {
		for (org.oep.core.dossiermgt.model.DocTemplate docTemplate : docTemplates) {
			dossierDocToDocTemplateTableMapper.addTableMapping(pk,
				docTemplate.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the dossier doc and its doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dossier doc to clear the associated doc templates from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearDocTemplates(long pk) throws SystemException {
		dossierDocToDocTemplateTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the dossier doc and the doc template. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dossier doc
	 * @param docTemplatePK the primary key of the doc template
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeDocTemplate(long pk, long docTemplatePK)
		throws SystemException {
		dossierDocToDocTemplateTableMapper.deleteTableMapping(pk, docTemplatePK);
	}

	/**
	 * Removes the association between the dossier doc and the doc template. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dossier doc
	 * @param docTemplate the doc template
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeDocTemplate(long pk,
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws SystemException {
		dossierDocToDocTemplateTableMapper.deleteTableMapping(pk,
			docTemplate.getPrimaryKey());
	}

	/**
	 * Removes the association between the dossier doc and the doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dossier doc
	 * @param docTemplatePKs the primary keys of the doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeDocTemplates(long pk, long[] docTemplatePKs)
		throws SystemException {
		for (long docTemplatePK : docTemplatePKs) {
			dossierDocToDocTemplateTableMapper.deleteTableMapping(pk,
				docTemplatePK);
		}
	}

	/**
	 * Removes the association between the dossier doc and the doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dossier doc
	 * @param docTemplates the doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeDocTemplates(long pk,
		List<org.oep.core.dossiermgt.model.DocTemplate> docTemplates)
		throws SystemException {
		for (org.oep.core.dossiermgt.model.DocTemplate docTemplate : docTemplates) {
			dossierDocToDocTemplateTableMapper.deleteTableMapping(pk,
				docTemplate.getPrimaryKey());
		}
	}

	/**
	 * Sets the doc templates associated with the dossier doc, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dossier doc
	 * @param docTemplatePKs the primary keys of the doc templates to be associated with the dossier doc
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setDocTemplates(long pk, long[] docTemplatePKs)
		throws SystemException {
		Set<Long> newDocTemplatePKsSet = SetUtil.fromArray(docTemplatePKs);
		Set<Long> oldDocTemplatePKsSet = SetUtil.fromArray(dossierDocToDocTemplateTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeDocTemplatePKsSet = new HashSet<Long>(oldDocTemplatePKsSet);

		removeDocTemplatePKsSet.removeAll(newDocTemplatePKsSet);

		for (long removeDocTemplatePK : removeDocTemplatePKsSet) {
			dossierDocToDocTemplateTableMapper.deleteTableMapping(pk,
				removeDocTemplatePK);
		}

		newDocTemplatePKsSet.removeAll(oldDocTemplatePKsSet);

		for (long newDocTemplatePK : newDocTemplatePKsSet) {
			dossierDocToDocTemplateTableMapper.addTableMapping(pk,
				newDocTemplatePK);
		}
	}

	/**
	 * Sets the doc templates associated with the dossier doc, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dossier doc
	 * @param docTemplates the doc templates to be associated with the dossier doc
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setDocTemplates(long pk,
		List<org.oep.core.dossiermgt.model.DocTemplate> docTemplates)
		throws SystemException {
		try {
			long[] docTemplatePKs = new long[docTemplates.size()];

			for (int i = 0; i < docTemplates.size(); i++) {
				org.oep.core.dossiermgt.model.DocTemplate docTemplate = docTemplates.get(i);

				docTemplatePKs[i] = docTemplate.getPrimaryKey();
			}

			setDocTemplates(pk, docTemplatePKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(DossierDocModelImpl.MAPPING_TABLE_OEP_DOSSIERMGT_OEP_DOSSIERMGT_DOSSIERDOC2TEMPLATE_NAME);
		}
	}

	/**
	 * Initializes the dossier doc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.DossierDoc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierDoc>> listenersList = new ArrayList<ModelListener<DossierDoc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierDoc>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		dossierDocToDocTemplateTableMapper = TableMapperFactory.getTableMapper("oep_dossiermgt_oep_dossiermgt_dossierdoc2template",
				"dossierDocId", "docTemplateId", this, docTemplatePersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DossierDocImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = DocTemplatePersistence.class)
	protected DocTemplatePersistence docTemplatePersistence;
	protected TableMapper<DossierDoc, org.oep.core.dossiermgt.model.DocTemplate> dossierDocToDocTemplateTableMapper;
	private static final String _SQL_SELECT_DOSSIERDOC = "SELECT dossierDoc FROM DossierDoc dossierDoc";
	private static final String _SQL_COUNT_DOSSIERDOC = "SELECT COUNT(dossierDoc) FROM DossierDoc dossierDoc";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierDoc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierDoc exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierDocPersistenceImpl.class);
	private static DossierDoc _nullDossierDoc = new DossierDocImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierDoc> toCacheModel() {
				return _nullDossierDocCacheModel;
			}
		};

	private static CacheModel<DossierDoc> _nullDossierDocCacheModel = new CacheModel<DossierDoc>() {
			@Override
			public DossierDoc toEntityModel() {
				return _nullDossierDoc;
			}
		};
}