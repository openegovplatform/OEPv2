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

import org.oep.core.dossiermgt.NoSuchDocTemplateException;
import org.oep.core.dossiermgt.model.DocTemplate;
import org.oep.core.dossiermgt.model.impl.DocTemplateImpl;
import org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the doc template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DocTemplatePersistence
 * @see DocTemplateUtil
 * @generated
 */
public class DocTemplatePersistenceImpl extends BasePersistenceImpl<DocTemplate>
	implements DocTemplatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DocTemplateUtil} to access the doc template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DocTemplateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, DocTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, DocTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DocTemplatePersistenceImpl() {
		setModelClass(DocTemplate.class);
	}

	/**
	 * Caches the doc template in the entity cache if it is enabled.
	 *
	 * @param docTemplate the doc template
	 */
	@Override
	public void cacheResult(DocTemplate docTemplate) {
		EntityCacheUtil.putResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateImpl.class, docTemplate.getPrimaryKey(), docTemplate);

		docTemplate.resetOriginalValues();
	}

	/**
	 * Caches the doc templates in the entity cache if it is enabled.
	 *
	 * @param docTemplates the doc templates
	 */
	@Override
	public void cacheResult(List<DocTemplate> docTemplates) {
		for (DocTemplate docTemplate : docTemplates) {
			if (EntityCacheUtil.getResult(
						DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
						DocTemplateImpl.class, docTemplate.getPrimaryKey()) == null) {
				cacheResult(docTemplate);
			}
			else {
				docTemplate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all doc templates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DocTemplateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DocTemplateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the doc template.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DocTemplate docTemplate) {
		EntityCacheUtil.removeResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateImpl.class, docTemplate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DocTemplate> docTemplates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DocTemplate docTemplate : docTemplates) {
			EntityCacheUtil.removeResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
				DocTemplateImpl.class, docTemplate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new doc template with the primary key. Does not add the doc template to the database.
	 *
	 * @param docTemplateId the primary key for the new doc template
	 * @return the new doc template
	 */
	@Override
	public DocTemplate create(long docTemplateId) {
		DocTemplate docTemplate = new DocTemplateImpl();

		docTemplate.setNew(true);
		docTemplate.setPrimaryKey(docTemplateId);

		return docTemplate;
	}

	/**
	 * Removes the doc template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docTemplateId the primary key of the doc template
	 * @return the doc template that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate remove(long docTemplateId)
		throws NoSuchDocTemplateException, SystemException {
		return remove((Serializable)docTemplateId);
	}

	/**
	 * Removes the doc template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the doc template
	 * @return the doc template that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate remove(Serializable primaryKey)
		throws NoSuchDocTemplateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DocTemplate docTemplate = (DocTemplate)session.get(DocTemplateImpl.class,
					primaryKey);

			if (docTemplate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(docTemplate);
		}
		catch (NoSuchDocTemplateException nsee) {
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
	protected DocTemplate removeImpl(DocTemplate docTemplate)
		throws SystemException {
		docTemplate = toUnwrappedModel(docTemplate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(docTemplate)) {
				docTemplate = (DocTemplate)session.get(DocTemplateImpl.class,
						docTemplate.getPrimaryKeyObj());
			}

			if (docTemplate != null) {
				session.delete(docTemplate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (docTemplate != null) {
			clearCache(docTemplate);
		}

		return docTemplate;
	}

	@Override
	public DocTemplate updateImpl(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws SystemException {
		docTemplate = toUnwrappedModel(docTemplate);

		boolean isNew = docTemplate.isNew();

		Session session = null;

		try {
			session = openSession();

			if (docTemplate.isNew()) {
				session.save(docTemplate);

				docTemplate.setNew(false);
			}
			else {
				session.merge(docTemplate);
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

		EntityCacheUtil.putResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateImpl.class, docTemplate.getPrimaryKey(), docTemplate);

		return docTemplate;
	}

	protected DocTemplate toUnwrappedModel(DocTemplate docTemplate) {
		if (docTemplate instanceof DocTemplateImpl) {
			return docTemplate;
		}

		DocTemplateImpl docTemplateImpl = new DocTemplateImpl();

		docTemplateImpl.setNew(docTemplate.isNew());
		docTemplateImpl.setPrimaryKey(docTemplate.getPrimaryKey());

		docTemplateImpl.setDocTemplateId(docTemplate.getDocTemplateId());
		docTemplateImpl.setUserId(docTemplate.getUserId());
		docTemplateImpl.setGroupId(docTemplate.getGroupId());
		docTemplateImpl.setCompanyId(docTemplate.getCompanyId());
		docTemplateImpl.setCreateDate(docTemplate.getCreateDate());
		docTemplateImpl.setModifiedDate(docTemplate.getModifiedDate());
		docTemplateImpl.setTemplateNo(docTemplate.getTemplateNo());
		docTemplateImpl.setTitle(docTemplate.getTitle());
		docTemplateImpl.setEnTitle(docTemplate.getEnTitle());
		docTemplateImpl.setFileEntryId(docTemplate.getFileEntryId());

		return docTemplateImpl;
	}

	/**
	 * Returns the doc template with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the doc template
	 * @return the doc template
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocTemplateException, SystemException {
		DocTemplate docTemplate = fetchByPrimaryKey(primaryKey);

		if (docTemplate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return docTemplate;
	}

	/**
	 * Returns the doc template with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDocTemplateException} if it could not be found.
	 *
	 * @param docTemplateId the primary key of the doc template
	 * @return the doc template
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate findByPrimaryKey(long docTemplateId)
		throws NoSuchDocTemplateException, SystemException {
		return findByPrimaryKey((Serializable)docTemplateId);
	}

	/**
	 * Returns the doc template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the doc template
	 * @return the doc template, or <code>null</code> if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DocTemplate docTemplate = (DocTemplate)EntityCacheUtil.getResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
				DocTemplateImpl.class, primaryKey);

		if (docTemplate == _nullDocTemplate) {
			return null;
		}

		if (docTemplate == null) {
			Session session = null;

			try {
				session = openSession();

				docTemplate = (DocTemplate)session.get(DocTemplateImpl.class,
						primaryKey);

				if (docTemplate != null) {
					cacheResult(docTemplate);
				}
				else {
					EntityCacheUtil.putResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
						DocTemplateImpl.class, primaryKey, _nullDocTemplate);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
					DocTemplateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return docTemplate;
	}

	/**
	 * Returns the doc template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param docTemplateId the primary key of the doc template
	 * @return the doc template, or <code>null</code> if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate fetchByPrimaryKey(long docTemplateId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)docTemplateId);
	}

	/**
	 * Returns all the doc templates.
	 *
	 * @return the doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocTemplate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the doc templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of doc templates
	 * @param end the upper bound of the range of doc templates (not inclusive)
	 * @return the range of doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocTemplate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the doc templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of doc templates
	 * @param end the upper bound of the range of doc templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocTemplate> findAll(int start, int end,
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

		List<DocTemplate> list = (List<DocTemplate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCTEMPLATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCTEMPLATE;

				if (pagination) {
					sql = sql.concat(DocTemplateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DocTemplate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocTemplate>(list);
				}
				else {
					list = (List<DocTemplate>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the doc templates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DocTemplate docTemplate : findAll()) {
			remove(docTemplate);
		}
	}

	/**
	 * Returns the number of doc templates.
	 *
	 * @return the number of doc templates
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

				Query q = session.createQuery(_SQL_COUNT_DOCTEMPLATE);

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
	 * Initializes the doc template persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.DocTemplate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DocTemplate>> listenersList = new ArrayList<ModelListener<DocTemplate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DocTemplate>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DocTemplateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOCTEMPLATE = "SELECT docTemplate FROM DocTemplate docTemplate";
	private static final String _SQL_COUNT_DOCTEMPLATE = "SELECT COUNT(docTemplate) FROM DocTemplate docTemplate";
	private static final String _ORDER_BY_ENTITY_ALIAS = "docTemplate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DocTemplate exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DocTemplatePersistenceImpl.class);
	private static DocTemplate _nullDocTemplate = new DocTemplateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DocTemplate> toCacheModel() {
				return _nullDocTemplateCacheModel;
			}
		};

	private static CacheModel<DocTemplate> _nullDocTemplateCacheModel = new CacheModel<DocTemplate>() {
			@Override
			public DocTemplate toEntityModel() {
				return _nullDocTemplate;
			}
		};
}