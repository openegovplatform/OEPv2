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

import org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException;
import org.oep.core.dossiermgt.model.DossierDoc2Template;
import org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateImpl;
import org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier doc2 template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierDoc2TemplatePersistence
 * @see DossierDoc2TemplateUtil
 * @generated
 */
public class DossierDoc2TemplatePersistenceImpl extends BasePersistenceImpl<DossierDoc2Template>
	implements DossierDoc2TemplatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierDoc2TemplateUtil} to access the dossier doc2 template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierDoc2TemplateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierDoc2TemplateModelImpl.ENTITY_CACHE_ENABLED,
			DossierDoc2TemplateModelImpl.FINDER_CACHE_ENABLED,
			DossierDoc2TemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierDoc2TemplateModelImpl.ENTITY_CACHE_ENABLED,
			DossierDoc2TemplateModelImpl.FINDER_CACHE_ENABLED,
			DossierDoc2TemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierDoc2TemplateModelImpl.ENTITY_CACHE_ENABLED,
			DossierDoc2TemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DossierDoc2TemplatePersistenceImpl() {
		setModelClass(DossierDoc2Template.class);
	}

	/**
	 * Caches the dossier doc2 template in the entity cache if it is enabled.
	 *
	 * @param dossierDoc2Template the dossier doc2 template
	 */
	@Override
	public void cacheResult(DossierDoc2Template dossierDoc2Template) {
		EntityCacheUtil.putResult(DossierDoc2TemplateModelImpl.ENTITY_CACHE_ENABLED,
			DossierDoc2TemplateImpl.class, dossierDoc2Template.getPrimaryKey(),
			dossierDoc2Template);

		dossierDoc2Template.resetOriginalValues();
	}

	/**
	 * Caches the dossier doc2 templates in the entity cache if it is enabled.
	 *
	 * @param dossierDoc2Templates the dossier doc2 templates
	 */
	@Override
	public void cacheResult(List<DossierDoc2Template> dossierDoc2Templates) {
		for (DossierDoc2Template dossierDoc2Template : dossierDoc2Templates) {
			if (EntityCacheUtil.getResult(
						DossierDoc2TemplateModelImpl.ENTITY_CACHE_ENABLED,
						DossierDoc2TemplateImpl.class,
						dossierDoc2Template.getPrimaryKey()) == null) {
				cacheResult(dossierDoc2Template);
			}
			else {
				dossierDoc2Template.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier doc2 templates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierDoc2TemplateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierDoc2TemplateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier doc2 template.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierDoc2Template dossierDoc2Template) {
		EntityCacheUtil.removeResult(DossierDoc2TemplateModelImpl.ENTITY_CACHE_ENABLED,
			DossierDoc2TemplateImpl.class, dossierDoc2Template.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierDoc2Template> dossierDoc2Templates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierDoc2Template dossierDoc2Template : dossierDoc2Templates) {
			EntityCacheUtil.removeResult(DossierDoc2TemplateModelImpl.ENTITY_CACHE_ENABLED,
				DossierDoc2TemplateImpl.class,
				dossierDoc2Template.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier doc2 template with the primary key. Does not add the dossier doc2 template to the database.
	 *
	 * @param dossierDoc2TemplatePK the primary key for the new dossier doc2 template
	 * @return the new dossier doc2 template
	 */
	@Override
	public DossierDoc2Template create(
		DossierDoc2TemplatePK dossierDoc2TemplatePK) {
		DossierDoc2Template dossierDoc2Template = new DossierDoc2TemplateImpl();

		dossierDoc2Template.setNew(true);
		dossierDoc2Template.setPrimaryKey(dossierDoc2TemplatePK);

		return dossierDoc2Template;
	}

	/**
	 * Removes the dossier doc2 template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierDoc2TemplatePK the primary key of the dossier doc2 template
	 * @return the dossier doc2 template that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException if a dossier doc2 template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierDoc2Template remove(
		DossierDoc2TemplatePK dossierDoc2TemplatePK)
		throws NoSuchDossierDoc2TemplateException, SystemException {
		return remove((Serializable)dossierDoc2TemplatePK);
	}

	/**
	 * Removes the dossier doc2 template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier doc2 template
	 * @return the dossier doc2 template that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException if a dossier doc2 template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierDoc2Template remove(Serializable primaryKey)
		throws NoSuchDossierDoc2TemplateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierDoc2Template dossierDoc2Template = (DossierDoc2Template)session.get(DossierDoc2TemplateImpl.class,
					primaryKey);

			if (dossierDoc2Template == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierDoc2TemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierDoc2Template);
		}
		catch (NoSuchDossierDoc2TemplateException nsee) {
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
	protected DossierDoc2Template removeImpl(
		DossierDoc2Template dossierDoc2Template) throws SystemException {
		dossierDoc2Template = toUnwrappedModel(dossierDoc2Template);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierDoc2Template)) {
				dossierDoc2Template = (DossierDoc2Template)session.get(DossierDoc2TemplateImpl.class,
						dossierDoc2Template.getPrimaryKeyObj());
			}

			if (dossierDoc2Template != null) {
				session.delete(dossierDoc2Template);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierDoc2Template != null) {
			clearCache(dossierDoc2Template);
		}

		return dossierDoc2Template;
	}

	@Override
	public DossierDoc2Template updateImpl(
		org.oep.core.dossiermgt.model.DossierDoc2Template dossierDoc2Template)
		throws SystemException {
		dossierDoc2Template = toUnwrappedModel(dossierDoc2Template);

		boolean isNew = dossierDoc2Template.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dossierDoc2Template.isNew()) {
				session.save(dossierDoc2Template);

				dossierDoc2Template.setNew(false);
			}
			else {
				session.merge(dossierDoc2Template);
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

		EntityCacheUtil.putResult(DossierDoc2TemplateModelImpl.ENTITY_CACHE_ENABLED,
			DossierDoc2TemplateImpl.class, dossierDoc2Template.getPrimaryKey(),
			dossierDoc2Template);

		return dossierDoc2Template;
	}

	protected DossierDoc2Template toUnwrappedModel(
		DossierDoc2Template dossierDoc2Template) {
		if (dossierDoc2Template instanceof DossierDoc2TemplateImpl) {
			return dossierDoc2Template;
		}

		DossierDoc2TemplateImpl dossierDoc2TemplateImpl = new DossierDoc2TemplateImpl();

		dossierDoc2TemplateImpl.setNew(dossierDoc2Template.isNew());
		dossierDoc2TemplateImpl.setPrimaryKey(dossierDoc2Template.getPrimaryKey());

		dossierDoc2TemplateImpl.setDossierDocId(dossierDoc2Template.getDossierDocId());
		dossierDoc2TemplateImpl.setDocTemplateId(dossierDoc2Template.getDocTemplateId());

		return dossierDoc2TemplateImpl;
	}

	/**
	 * Returns the dossier doc2 template with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier doc2 template
	 * @return the dossier doc2 template
	 * @throws org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException if a dossier doc2 template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierDoc2Template findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierDoc2TemplateException, SystemException {
		DossierDoc2Template dossierDoc2Template = fetchByPrimaryKey(primaryKey);

		if (dossierDoc2Template == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierDoc2TemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierDoc2Template;
	}

	/**
	 * Returns the dossier doc2 template with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException} if it could not be found.
	 *
	 * @param dossierDoc2TemplatePK the primary key of the dossier doc2 template
	 * @return the dossier doc2 template
	 * @throws org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException if a dossier doc2 template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierDoc2Template findByPrimaryKey(
		DossierDoc2TemplatePK dossierDoc2TemplatePK)
		throws NoSuchDossierDoc2TemplateException, SystemException {
		return findByPrimaryKey((Serializable)dossierDoc2TemplatePK);
	}

	/**
	 * Returns the dossier doc2 template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier doc2 template
	 * @return the dossier doc2 template, or <code>null</code> if a dossier doc2 template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierDoc2Template fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierDoc2Template dossierDoc2Template = (DossierDoc2Template)EntityCacheUtil.getResult(DossierDoc2TemplateModelImpl.ENTITY_CACHE_ENABLED,
				DossierDoc2TemplateImpl.class, primaryKey);

		if (dossierDoc2Template == _nullDossierDoc2Template) {
			return null;
		}

		if (dossierDoc2Template == null) {
			Session session = null;

			try {
				session = openSession();

				dossierDoc2Template = (DossierDoc2Template)session.get(DossierDoc2TemplateImpl.class,
						primaryKey);

				if (dossierDoc2Template != null) {
					cacheResult(dossierDoc2Template);
				}
				else {
					EntityCacheUtil.putResult(DossierDoc2TemplateModelImpl.ENTITY_CACHE_ENABLED,
						DossierDoc2TemplateImpl.class, primaryKey,
						_nullDossierDoc2Template);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierDoc2TemplateModelImpl.ENTITY_CACHE_ENABLED,
					DossierDoc2TemplateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierDoc2Template;
	}

	/**
	 * Returns the dossier doc2 template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierDoc2TemplatePK the primary key of the dossier doc2 template
	 * @return the dossier doc2 template, or <code>null</code> if a dossier doc2 template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierDoc2Template fetchByPrimaryKey(
		DossierDoc2TemplatePK dossierDoc2TemplatePK) throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierDoc2TemplatePK);
	}

	/**
	 * Returns all the dossier doc2 templates.
	 *
	 * @return the dossier doc2 templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierDoc2Template> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier doc2 templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier doc2 templates
	 * @param end the upper bound of the range of dossier doc2 templates (not inclusive)
	 * @return the range of dossier doc2 templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierDoc2Template> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier doc2 templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier doc2 templates
	 * @param end the upper bound of the range of dossier doc2 templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier doc2 templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierDoc2Template> findAll(int start, int end,
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

		List<DossierDoc2Template> list = (List<DossierDoc2Template>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERDOC2TEMPLATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERDOC2TEMPLATE;

				if (pagination) {
					sql = sql.concat(DossierDoc2TemplateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierDoc2Template>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierDoc2Template>(list);
				}
				else {
					list = (List<DossierDoc2Template>)QueryUtil.list(q,
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
	 * Removes all the dossier doc2 templates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierDoc2Template dossierDoc2Template : findAll()) {
			remove(dossierDoc2Template);
		}
	}

	/**
	 * Returns the number of dossier doc2 templates.
	 *
	 * @return the number of dossier doc2 templates
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERDOC2TEMPLATE);

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
	 * Initializes the dossier doc2 template persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.DossierDoc2Template")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierDoc2Template>> listenersList = new ArrayList<ModelListener<DossierDoc2Template>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierDoc2Template>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierDoc2TemplateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERDOC2TEMPLATE = "SELECT dossierDoc2Template FROM DossierDoc2Template dossierDoc2Template";
	private static final String _SQL_COUNT_DOSSIERDOC2TEMPLATE = "SELECT COUNT(dossierDoc2Template) FROM DossierDoc2Template dossierDoc2Template";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierDoc2Template.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierDoc2Template exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierDoc2TemplatePersistenceImpl.class);
	private static DossierDoc2Template _nullDossierDoc2Template = new DossierDoc2TemplateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierDoc2Template> toCacheModel() {
				return _nullDossierDoc2TemplateCacheModel;
			}
		};

	private static CacheModel<DossierDoc2Template> _nullDossierDoc2TemplateCacheModel =
		new CacheModel<DossierDoc2Template>() {
			@Override
			public DossierDoc2Template toEntityModel() {
				return _nullDossierDoc2Template;
			}
		};
}