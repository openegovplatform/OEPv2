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

import org.oep.core.dossiermgt.NoSuchPaymentFile2DossierException;
import org.oep.core.dossiermgt.model.PaymentFile2Dossier;
import org.oep.core.dossiermgt.model.impl.PaymentFile2DossierImpl;
import org.oep.core.dossiermgt.model.impl.PaymentFile2DossierModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the payment file2 dossier service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see PaymentFile2DossierPersistence
 * @see PaymentFile2DossierUtil
 * @generated
 */
public class PaymentFile2DossierPersistenceImpl extends BasePersistenceImpl<PaymentFile2Dossier>
	implements PaymentFile2DossierPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PaymentFile2DossierUtil} to access the payment file2 dossier persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PaymentFile2DossierImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentFile2DossierModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFile2DossierModelImpl.FINDER_CACHE_ENABLED,
			PaymentFile2DossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentFile2DossierModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFile2DossierModelImpl.FINDER_CACHE_ENABLED,
			PaymentFile2DossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentFile2DossierModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFile2DossierModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PaymentFile2DossierPersistenceImpl() {
		setModelClass(PaymentFile2Dossier.class);
	}

	/**
	 * Caches the payment file2 dossier in the entity cache if it is enabled.
	 *
	 * @param paymentFile2Dossier the payment file2 dossier
	 */
	@Override
	public void cacheResult(PaymentFile2Dossier paymentFile2Dossier) {
		EntityCacheUtil.putResult(PaymentFile2DossierModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFile2DossierImpl.class, paymentFile2Dossier.getPrimaryKey(),
			paymentFile2Dossier);

		paymentFile2Dossier.resetOriginalValues();
	}

	/**
	 * Caches the payment file2 dossiers in the entity cache if it is enabled.
	 *
	 * @param paymentFile2Dossiers the payment file2 dossiers
	 */
	@Override
	public void cacheResult(List<PaymentFile2Dossier> paymentFile2Dossiers) {
		for (PaymentFile2Dossier paymentFile2Dossier : paymentFile2Dossiers) {
			if (EntityCacheUtil.getResult(
						PaymentFile2DossierModelImpl.ENTITY_CACHE_ENABLED,
						PaymentFile2DossierImpl.class,
						paymentFile2Dossier.getPrimaryKey()) == null) {
				cacheResult(paymentFile2Dossier);
			}
			else {
				paymentFile2Dossier.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all payment file2 dossiers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PaymentFile2DossierImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PaymentFile2DossierImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the payment file2 dossier.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PaymentFile2Dossier paymentFile2Dossier) {
		EntityCacheUtil.removeResult(PaymentFile2DossierModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFile2DossierImpl.class, paymentFile2Dossier.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PaymentFile2Dossier> paymentFile2Dossiers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PaymentFile2Dossier paymentFile2Dossier : paymentFile2Dossiers) {
			EntityCacheUtil.removeResult(PaymentFile2DossierModelImpl.ENTITY_CACHE_ENABLED,
				PaymentFile2DossierImpl.class,
				paymentFile2Dossier.getPrimaryKey());
		}
	}

	/**
	 * Creates a new payment file2 dossier with the primary key. Does not add the payment file2 dossier to the database.
	 *
	 * @param id the primary key for the new payment file2 dossier
	 * @return the new payment file2 dossier
	 */
	@Override
	public PaymentFile2Dossier create(long id) {
		PaymentFile2Dossier paymentFile2Dossier = new PaymentFile2DossierImpl();

		paymentFile2Dossier.setNew(true);
		paymentFile2Dossier.setPrimaryKey(id);

		return paymentFile2Dossier;
	}

	/**
	 * Removes the payment file2 dossier with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the payment file2 dossier
	 * @return the payment file2 dossier that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentFile2DossierException if a payment file2 dossier with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile2Dossier remove(long id)
		throws NoSuchPaymentFile2DossierException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the payment file2 dossier with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the payment file2 dossier
	 * @return the payment file2 dossier that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentFile2DossierException if a payment file2 dossier with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile2Dossier remove(Serializable primaryKey)
		throws NoSuchPaymentFile2DossierException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PaymentFile2Dossier paymentFile2Dossier = (PaymentFile2Dossier)session.get(PaymentFile2DossierImpl.class,
					primaryKey);

			if (paymentFile2Dossier == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPaymentFile2DossierException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(paymentFile2Dossier);
		}
		catch (NoSuchPaymentFile2DossierException nsee) {
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
	protected PaymentFile2Dossier removeImpl(
		PaymentFile2Dossier paymentFile2Dossier) throws SystemException {
		paymentFile2Dossier = toUnwrappedModel(paymentFile2Dossier);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(paymentFile2Dossier)) {
				paymentFile2Dossier = (PaymentFile2Dossier)session.get(PaymentFile2DossierImpl.class,
						paymentFile2Dossier.getPrimaryKeyObj());
			}

			if (paymentFile2Dossier != null) {
				session.delete(paymentFile2Dossier);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (paymentFile2Dossier != null) {
			clearCache(paymentFile2Dossier);
		}

		return paymentFile2Dossier;
	}

	@Override
	public PaymentFile2Dossier updateImpl(
		org.oep.core.dossiermgt.model.PaymentFile2Dossier paymentFile2Dossier)
		throws SystemException {
		paymentFile2Dossier = toUnwrappedModel(paymentFile2Dossier);

		boolean isNew = paymentFile2Dossier.isNew();

		Session session = null;

		try {
			session = openSession();

			if (paymentFile2Dossier.isNew()) {
				session.save(paymentFile2Dossier);

				paymentFile2Dossier.setNew(false);
			}
			else {
				session.merge(paymentFile2Dossier);
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

		EntityCacheUtil.putResult(PaymentFile2DossierModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFile2DossierImpl.class, paymentFile2Dossier.getPrimaryKey(),
			paymentFile2Dossier);

		return paymentFile2Dossier;
	}

	protected PaymentFile2Dossier toUnwrappedModel(
		PaymentFile2Dossier paymentFile2Dossier) {
		if (paymentFile2Dossier instanceof PaymentFile2DossierImpl) {
			return paymentFile2Dossier;
		}

		PaymentFile2DossierImpl paymentFile2DossierImpl = new PaymentFile2DossierImpl();

		paymentFile2DossierImpl.setNew(paymentFile2Dossier.isNew());
		paymentFile2DossierImpl.setPrimaryKey(paymentFile2Dossier.getPrimaryKey());

		paymentFile2DossierImpl.setId(paymentFile2Dossier.getId());
		paymentFile2DossierImpl.setCompanyId(paymentFile2Dossier.getCompanyId());
		paymentFile2DossierImpl.setPaymentFileId(paymentFile2Dossier.getPaymentFileId());
		paymentFile2DossierImpl.setDossierId(paymentFile2Dossier.getDossierId());
		paymentFile2DossierImpl.setAmount(paymentFile2Dossier.getAmount());

		return paymentFile2DossierImpl;
	}

	/**
	 * Returns the payment file2 dossier with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment file2 dossier
	 * @return the payment file2 dossier
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentFile2DossierException if a payment file2 dossier with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile2Dossier findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPaymentFile2DossierException, SystemException {
		PaymentFile2Dossier paymentFile2Dossier = fetchByPrimaryKey(primaryKey);

		if (paymentFile2Dossier == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPaymentFile2DossierException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return paymentFile2Dossier;
	}

	/**
	 * Returns the payment file2 dossier with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchPaymentFile2DossierException} if it could not be found.
	 *
	 * @param id the primary key of the payment file2 dossier
	 * @return the payment file2 dossier
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentFile2DossierException if a payment file2 dossier with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile2Dossier findByPrimaryKey(long id)
		throws NoSuchPaymentFile2DossierException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the payment file2 dossier with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment file2 dossier
	 * @return the payment file2 dossier, or <code>null</code> if a payment file2 dossier with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile2Dossier fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PaymentFile2Dossier paymentFile2Dossier = (PaymentFile2Dossier)EntityCacheUtil.getResult(PaymentFile2DossierModelImpl.ENTITY_CACHE_ENABLED,
				PaymentFile2DossierImpl.class, primaryKey);

		if (paymentFile2Dossier == _nullPaymentFile2Dossier) {
			return null;
		}

		if (paymentFile2Dossier == null) {
			Session session = null;

			try {
				session = openSession();

				paymentFile2Dossier = (PaymentFile2Dossier)session.get(PaymentFile2DossierImpl.class,
						primaryKey);

				if (paymentFile2Dossier != null) {
					cacheResult(paymentFile2Dossier);
				}
				else {
					EntityCacheUtil.putResult(PaymentFile2DossierModelImpl.ENTITY_CACHE_ENABLED,
						PaymentFile2DossierImpl.class, primaryKey,
						_nullPaymentFile2Dossier);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PaymentFile2DossierModelImpl.ENTITY_CACHE_ENABLED,
					PaymentFile2DossierImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return paymentFile2Dossier;
	}

	/**
	 * Returns the payment file2 dossier with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the payment file2 dossier
	 * @return the payment file2 dossier, or <code>null</code> if a payment file2 dossier with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile2Dossier fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the payment file2 dossiers.
	 *
	 * @return the payment file2 dossiers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile2Dossier> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment file2 dossiers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentFile2DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment file2 dossiers
	 * @param end the upper bound of the range of payment file2 dossiers (not inclusive)
	 * @return the range of payment file2 dossiers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile2Dossier> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment file2 dossiers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentFile2DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment file2 dossiers
	 * @param end the upper bound of the range of payment file2 dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of payment file2 dossiers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile2Dossier> findAll(int start, int end,
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

		List<PaymentFile2Dossier> list = (List<PaymentFile2Dossier>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PAYMENTFILE2DOSSIER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PAYMENTFILE2DOSSIER;

				if (pagination) {
					sql = sql.concat(PaymentFile2DossierModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PaymentFile2Dossier>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentFile2Dossier>(list);
				}
				else {
					list = (List<PaymentFile2Dossier>)QueryUtil.list(q,
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
	 * Removes all the payment file2 dossiers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PaymentFile2Dossier paymentFile2Dossier : findAll()) {
			remove(paymentFile2Dossier);
		}
	}

	/**
	 * Returns the number of payment file2 dossiers.
	 *
	 * @return the number of payment file2 dossiers
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

				Query q = session.createQuery(_SQL_COUNT_PAYMENTFILE2DOSSIER);

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
	 * Initializes the payment file2 dossier persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.PaymentFile2Dossier")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PaymentFile2Dossier>> listenersList = new ArrayList<ModelListener<PaymentFile2Dossier>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PaymentFile2Dossier>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PaymentFile2DossierImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PAYMENTFILE2DOSSIER = "SELECT paymentFile2Dossier FROM PaymentFile2Dossier paymentFile2Dossier";
	private static final String _SQL_COUNT_PAYMENTFILE2DOSSIER = "SELECT COUNT(paymentFile2Dossier) FROM PaymentFile2Dossier paymentFile2Dossier";
	private static final String _ORDER_BY_ENTITY_ALIAS = "paymentFile2Dossier.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentFile2Dossier exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PaymentFile2DossierPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static PaymentFile2Dossier _nullPaymentFile2Dossier = new PaymentFile2DossierImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PaymentFile2Dossier> toCacheModel() {
				return _nullPaymentFile2DossierCacheModel;
			}
		};

	private static CacheModel<PaymentFile2Dossier> _nullPaymentFile2DossierCacheModel =
		new CacheModel<PaymentFile2Dossier>() {
			@Override
			public PaymentFile2Dossier toEntityModel() {
				return _nullPaymentFile2Dossier;
			}
		};
}