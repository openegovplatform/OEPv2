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

package org.oep.core.processmgt.service.persistence;

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

import org.oep.core.processmgt.NoSuchDocFile2ProcessOrderException;
import org.oep.core.processmgt.model.DocFile2ProcessOrder;
import org.oep.core.processmgt.model.impl.DocFile2ProcessOrderImpl;
import org.oep.core.processmgt.model.impl.DocFile2ProcessOrderModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the doc file2 process order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DocFile2ProcessOrderPersistence
 * @see DocFile2ProcessOrderUtil
 * @generated
 */
public class DocFile2ProcessOrderPersistenceImpl extends BasePersistenceImpl<DocFile2ProcessOrder>
	implements DocFile2ProcessOrderPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DocFile2ProcessOrderUtil} to access the doc file2 process order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DocFile2ProcessOrderImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DocFile2ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			DocFile2ProcessOrderModelImpl.FINDER_CACHE_ENABLED,
			DocFile2ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DocFile2ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			DocFile2ProcessOrderModelImpl.FINDER_CACHE_ENABLED,
			DocFile2ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DocFile2ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			DocFile2ProcessOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DocFile2ProcessOrderPersistenceImpl() {
		setModelClass(DocFile2ProcessOrder.class);
	}

	/**
	 * Caches the doc file2 process order in the entity cache if it is enabled.
	 *
	 * @param docFile2ProcessOrder the doc file2 process order
	 */
	@Override
	public void cacheResult(DocFile2ProcessOrder docFile2ProcessOrder) {
		EntityCacheUtil.putResult(DocFile2ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			DocFile2ProcessOrderImpl.class,
			docFile2ProcessOrder.getPrimaryKey(), docFile2ProcessOrder);

		docFile2ProcessOrder.resetOriginalValues();
	}

	/**
	 * Caches the doc file2 process orders in the entity cache if it is enabled.
	 *
	 * @param docFile2ProcessOrders the doc file2 process orders
	 */
	@Override
	public void cacheResult(List<DocFile2ProcessOrder> docFile2ProcessOrders) {
		for (DocFile2ProcessOrder docFile2ProcessOrder : docFile2ProcessOrders) {
			if (EntityCacheUtil.getResult(
						DocFile2ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
						DocFile2ProcessOrderImpl.class,
						docFile2ProcessOrder.getPrimaryKey()) == null) {
				cacheResult(docFile2ProcessOrder);
			}
			else {
				docFile2ProcessOrder.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all doc file2 process orders.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DocFile2ProcessOrderImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DocFile2ProcessOrderImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the doc file2 process order.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DocFile2ProcessOrder docFile2ProcessOrder) {
		EntityCacheUtil.removeResult(DocFile2ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			DocFile2ProcessOrderImpl.class, docFile2ProcessOrder.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DocFile2ProcessOrder> docFile2ProcessOrders) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DocFile2ProcessOrder docFile2ProcessOrder : docFile2ProcessOrders) {
			EntityCacheUtil.removeResult(DocFile2ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
				DocFile2ProcessOrderImpl.class,
				docFile2ProcessOrder.getPrimaryKey());
		}
	}

	/**
	 * Creates a new doc file2 process order with the primary key. Does not add the doc file2 process order to the database.
	 *
	 * @param docFileId the primary key for the new doc file2 process order
	 * @return the new doc file2 process order
	 */
	@Override
	public DocFile2ProcessOrder create(long docFileId) {
		DocFile2ProcessOrder docFile2ProcessOrder = new DocFile2ProcessOrderImpl();

		docFile2ProcessOrder.setNew(true);
		docFile2ProcessOrder.setPrimaryKey(docFileId);

		return docFile2ProcessOrder;
	}

	/**
	 * Removes the doc file2 process order with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docFileId the primary key of the doc file2 process order
	 * @return the doc file2 process order that was removed
	 * @throws org.oep.core.processmgt.NoSuchDocFile2ProcessOrderException if a doc file2 process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFile2ProcessOrder remove(long docFileId)
		throws NoSuchDocFile2ProcessOrderException, SystemException {
		return remove((Serializable)docFileId);
	}

	/**
	 * Removes the doc file2 process order with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the doc file2 process order
	 * @return the doc file2 process order that was removed
	 * @throws org.oep.core.processmgt.NoSuchDocFile2ProcessOrderException if a doc file2 process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFile2ProcessOrder remove(Serializable primaryKey)
		throws NoSuchDocFile2ProcessOrderException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DocFile2ProcessOrder docFile2ProcessOrder = (DocFile2ProcessOrder)session.get(DocFile2ProcessOrderImpl.class,
					primaryKey);

			if (docFile2ProcessOrder == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocFile2ProcessOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(docFile2ProcessOrder);
		}
		catch (NoSuchDocFile2ProcessOrderException nsee) {
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
	protected DocFile2ProcessOrder removeImpl(
		DocFile2ProcessOrder docFile2ProcessOrder) throws SystemException {
		docFile2ProcessOrder = toUnwrappedModel(docFile2ProcessOrder);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(docFile2ProcessOrder)) {
				docFile2ProcessOrder = (DocFile2ProcessOrder)session.get(DocFile2ProcessOrderImpl.class,
						docFile2ProcessOrder.getPrimaryKeyObj());
			}

			if (docFile2ProcessOrder != null) {
				session.delete(docFile2ProcessOrder);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (docFile2ProcessOrder != null) {
			clearCache(docFile2ProcessOrder);
		}

		return docFile2ProcessOrder;
	}

	@Override
	public DocFile2ProcessOrder updateImpl(
		org.oep.core.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder)
		throws SystemException {
		docFile2ProcessOrder = toUnwrappedModel(docFile2ProcessOrder);

		boolean isNew = docFile2ProcessOrder.isNew();

		Session session = null;

		try {
			session = openSession();

			if (docFile2ProcessOrder.isNew()) {
				session.save(docFile2ProcessOrder);

				docFile2ProcessOrder.setNew(false);
			}
			else {
				session.merge(docFile2ProcessOrder);
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

		EntityCacheUtil.putResult(DocFile2ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			DocFile2ProcessOrderImpl.class,
			docFile2ProcessOrder.getPrimaryKey(), docFile2ProcessOrder);

		return docFile2ProcessOrder;
	}

	protected DocFile2ProcessOrder toUnwrappedModel(
		DocFile2ProcessOrder docFile2ProcessOrder) {
		if (docFile2ProcessOrder instanceof DocFile2ProcessOrderImpl) {
			return docFile2ProcessOrder;
		}

		DocFile2ProcessOrderImpl docFile2ProcessOrderImpl = new DocFile2ProcessOrderImpl();

		docFile2ProcessOrderImpl.setNew(docFile2ProcessOrder.isNew());
		docFile2ProcessOrderImpl.setPrimaryKey(docFile2ProcessOrder.getPrimaryKey());

		docFile2ProcessOrderImpl.setDocFileId(docFile2ProcessOrder.getDocFileId());
		docFile2ProcessOrderImpl.setProcessOrderId(docFile2ProcessOrder.getProcessOrderId());

		return docFile2ProcessOrderImpl;
	}

	/**
	 * Returns the doc file2 process order with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the doc file2 process order
	 * @return the doc file2 process order
	 * @throws org.oep.core.processmgt.NoSuchDocFile2ProcessOrderException if a doc file2 process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFile2ProcessOrder findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocFile2ProcessOrderException, SystemException {
		DocFile2ProcessOrder docFile2ProcessOrder = fetchByPrimaryKey(primaryKey);

		if (docFile2ProcessOrder == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocFile2ProcessOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return docFile2ProcessOrder;
	}

	/**
	 * Returns the doc file2 process order with the primary key or throws a {@link org.oep.core.processmgt.NoSuchDocFile2ProcessOrderException} if it could not be found.
	 *
	 * @param docFileId the primary key of the doc file2 process order
	 * @return the doc file2 process order
	 * @throws org.oep.core.processmgt.NoSuchDocFile2ProcessOrderException if a doc file2 process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFile2ProcessOrder findByPrimaryKey(long docFileId)
		throws NoSuchDocFile2ProcessOrderException, SystemException {
		return findByPrimaryKey((Serializable)docFileId);
	}

	/**
	 * Returns the doc file2 process order with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the doc file2 process order
	 * @return the doc file2 process order, or <code>null</code> if a doc file2 process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFile2ProcessOrder fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DocFile2ProcessOrder docFile2ProcessOrder = (DocFile2ProcessOrder)EntityCacheUtil.getResult(DocFile2ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
				DocFile2ProcessOrderImpl.class, primaryKey);

		if (docFile2ProcessOrder == _nullDocFile2ProcessOrder) {
			return null;
		}

		if (docFile2ProcessOrder == null) {
			Session session = null;

			try {
				session = openSession();

				docFile2ProcessOrder = (DocFile2ProcessOrder)session.get(DocFile2ProcessOrderImpl.class,
						primaryKey);

				if (docFile2ProcessOrder != null) {
					cacheResult(docFile2ProcessOrder);
				}
				else {
					EntityCacheUtil.putResult(DocFile2ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
						DocFile2ProcessOrderImpl.class, primaryKey,
						_nullDocFile2ProcessOrder);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DocFile2ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
					DocFile2ProcessOrderImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return docFile2ProcessOrder;
	}

	/**
	 * Returns the doc file2 process order with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param docFileId the primary key of the doc file2 process order
	 * @return the doc file2 process order, or <code>null</code> if a doc file2 process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFile2ProcessOrder fetchByPrimaryKey(long docFileId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)docFileId);
	}

	/**
	 * Returns all the doc file2 process orders.
	 *
	 * @return the doc file2 process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocFile2ProcessOrder> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the doc file2 process orders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DocFile2ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of doc file2 process orders
	 * @param end the upper bound of the range of doc file2 process orders (not inclusive)
	 * @return the range of doc file2 process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocFile2ProcessOrder> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the doc file2 process orders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DocFile2ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of doc file2 process orders
	 * @param end the upper bound of the range of doc file2 process orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of doc file2 process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocFile2ProcessOrder> findAll(int start, int end,
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

		List<DocFile2ProcessOrder> list = (List<DocFile2ProcessOrder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCFILE2PROCESSORDER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCFILE2PROCESSORDER;

				if (pagination) {
					sql = sql.concat(DocFile2ProcessOrderModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DocFile2ProcessOrder>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocFile2ProcessOrder>(list);
				}
				else {
					list = (List<DocFile2ProcessOrder>)QueryUtil.list(q,
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
	 * Removes all the doc file2 process orders from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DocFile2ProcessOrder docFile2ProcessOrder : findAll()) {
			remove(docFile2ProcessOrder);
		}
	}

	/**
	 * Returns the number of doc file2 process orders.
	 *
	 * @return the number of doc file2 process orders
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

				Query q = session.createQuery(_SQL_COUNT_DOCFILE2PROCESSORDER);

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
	 * Initializes the doc file2 process order persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.processmgt.model.DocFile2ProcessOrder")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DocFile2ProcessOrder>> listenersList = new ArrayList<ModelListener<DocFile2ProcessOrder>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DocFile2ProcessOrder>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DocFile2ProcessOrderImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOCFILE2PROCESSORDER = "SELECT docFile2ProcessOrder FROM DocFile2ProcessOrder docFile2ProcessOrder";
	private static final String _SQL_COUNT_DOCFILE2PROCESSORDER = "SELECT COUNT(docFile2ProcessOrder) FROM DocFile2ProcessOrder docFile2ProcessOrder";
	private static final String _ORDER_BY_ENTITY_ALIAS = "docFile2ProcessOrder.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DocFile2ProcessOrder exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DocFile2ProcessOrderPersistenceImpl.class);
	private static DocFile2ProcessOrder _nullDocFile2ProcessOrder = new DocFile2ProcessOrderImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DocFile2ProcessOrder> toCacheModel() {
				return _nullDocFile2ProcessOrderCacheModel;
			}
		};

	private static CacheModel<DocFile2ProcessOrder> _nullDocFile2ProcessOrderCacheModel =
		new CacheModel<DocFile2ProcessOrder>() {
			@Override
			public DocFile2ProcessOrder toEntityModel() {
				return _nullDocFile2ProcessOrder;
			}
		};
}