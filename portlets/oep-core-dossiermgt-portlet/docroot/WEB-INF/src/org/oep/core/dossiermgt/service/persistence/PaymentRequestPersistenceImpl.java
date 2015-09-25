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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.core.dossiermgt.NoSuchPaymentRequestException;
import org.oep.core.dossiermgt.model.PaymentRequest;
import org.oep.core.dossiermgt.model.impl.PaymentRequestImpl;
import org.oep.core.dossiermgt.model.impl.PaymentRequestModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the payment request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see PaymentRequestPersistence
 * @see PaymentRequestUtil
 * @generated
 */
public class PaymentRequestPersistenceImpl extends BasePersistenceImpl<PaymentRequest>
	implements PaymentRequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PaymentRequestUtil} to access the payment request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PaymentRequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestModelImpl.FINDER_CACHE_ENABLED,
			PaymentRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestModelImpl.FINDER_CACHE_ENABLED,
			PaymentRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestModelImpl.FINDER_CACHE_ENABLED,
			PaymentRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestModelImpl.FINDER_CACHE_ENABLED,
			PaymentRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			PaymentRequestModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the payment requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentRequest> findByUuid(String uuid)
		throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of payment requests
	 * @param end the upper bound of the range of payment requests (not inclusive)
	 * @return the range of matching payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentRequest> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of payment requests
	 * @param end the upper bound of the range of payment requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentRequest> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<PaymentRequest> list = (List<PaymentRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PaymentRequest paymentRequest : list) {
				if (!Validator.equals(uuid, paymentRequest.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PAYMENTREQUEST_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PaymentRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<PaymentRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentRequest>(list);
				}
				else {
					list = (List<PaymentRequest>)QueryUtil.list(q,
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
	 * Returns the first payment request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching payment request
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentRequestException if a matching payment request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentRequestException, SystemException {
		PaymentRequest paymentRequest = fetchByUuid_First(uuid,
				orderByComparator);

		if (paymentRequest != null) {
			return paymentRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentRequestException(msg.toString());
	}

	/**
	 * Returns the first payment request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching payment request, or <code>null</code> if a matching payment request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<PaymentRequest> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last payment request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching payment request
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentRequestException if a matching payment request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentRequestException, SystemException {
		PaymentRequest paymentRequest = fetchByUuid_Last(uuid, orderByComparator);

		if (paymentRequest != null) {
			return paymentRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentRequestException(msg.toString());
	}

	/**
	 * Returns the last payment request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching payment request, or <code>null</code> if a matching payment request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<PaymentRequest> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the payment requests before and after the current payment request in the ordered set where uuid = &#63;.
	 *
	 * @param paymentRequestId the primary key of the current payment request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next payment request
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentRequestException if a payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest[] findByUuid_PrevAndNext(long paymentRequestId,
		String uuid, OrderByComparator orderByComparator)
		throws NoSuchPaymentRequestException, SystemException {
		PaymentRequest paymentRequest = findByPrimaryKey(paymentRequestId);

		Session session = null;

		try {
			session = openSession();

			PaymentRequest[] array = new PaymentRequestImpl[3];

			array[0] = getByUuid_PrevAndNext(session, paymentRequest, uuid,
					orderByComparator, true);

			array[1] = paymentRequest;

			array[2] = getByUuid_PrevAndNext(session, paymentRequest, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PaymentRequest getByUuid_PrevAndNext(Session session,
		PaymentRequest paymentRequest, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PAYMENTREQUEST_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(PaymentRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(paymentRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PaymentRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the payment requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (PaymentRequest paymentRequest : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(paymentRequest);
		}
	}

	/**
	 * Returns the number of payment requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PAYMENTREQUEST_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "paymentRequest.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "paymentRequest.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(paymentRequest.uuid IS NULL OR paymentRequest.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestModelImpl.FINDER_CACHE_ENABLED,
			PaymentRequestImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			PaymentRequestModelImpl.UUID_COLUMN_BITMASK |
			PaymentRequestModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the payment request where uuid = &#63; and groupId = &#63; or throws a {@link org.oep.core.dossiermgt.NoSuchPaymentRequestException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching payment request
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentRequestException if a matching payment request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest findByUUID_G(String uuid, long groupId)
		throws NoSuchPaymentRequestException, SystemException {
		PaymentRequest paymentRequest = fetchByUUID_G(uuid, groupId);

		if (paymentRequest == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPaymentRequestException(msg.toString());
		}

		return paymentRequest;
	}

	/**
	 * Returns the payment request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching payment request, or <code>null</code> if a matching payment request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the payment request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching payment request, or <code>null</code> if a matching payment request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof PaymentRequest) {
			PaymentRequest paymentRequest = (PaymentRequest)result;

			if (!Validator.equals(uuid, paymentRequest.getUuid()) ||
					(groupId != paymentRequest.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PAYMENTREQUEST_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<PaymentRequest> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					PaymentRequest paymentRequest = list.get(0);

					result = paymentRequest;

					cacheResult(paymentRequest);

					if ((paymentRequest.getUuid() == null) ||
							!paymentRequest.getUuid().equals(uuid) ||
							(paymentRequest.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, paymentRequest);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (PaymentRequest)result;
		}
	}

	/**
	 * Removes the payment request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the payment request that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest removeByUUID_G(String uuid, long groupId)
		throws NoSuchPaymentRequestException, SystemException {
		PaymentRequest paymentRequest = findByUUID_G(uuid, groupId);

		return remove(paymentRequest);
	}

	/**
	 * Returns the number of payment requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PAYMENTREQUEST_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "paymentRequest.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "paymentRequest.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(paymentRequest.uuid IS NULL OR paymentRequest.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "paymentRequest.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestModelImpl.FINDER_CACHE_ENABLED,
			PaymentRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestModelImpl.FINDER_CACHE_ENABLED,
			PaymentRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			PaymentRequestModelImpl.UUID_COLUMN_BITMASK |
			PaymentRequestModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the payment requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentRequest> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of payment requests
	 * @param end the upper bound of the range of payment requests (not inclusive)
	 * @return the range of matching payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentRequest> findByUuid_C(String uuid, long companyId,
		int start, int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of payment requests
	 * @param end the upper bound of the range of payment requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentRequest> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<PaymentRequest> list = (List<PaymentRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PaymentRequest paymentRequest : list) {
				if (!Validator.equals(uuid, paymentRequest.getUuid()) ||
						(companyId != paymentRequest.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_PAYMENTREQUEST_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PaymentRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<PaymentRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentRequest>(list);
				}
				else {
					list = (List<PaymentRequest>)QueryUtil.list(q,
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
	 * Returns the first payment request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching payment request
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentRequestException if a matching payment request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentRequestException, SystemException {
		PaymentRequest paymentRequest = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (paymentRequest != null) {
			return paymentRequest;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentRequestException(msg.toString());
	}

	/**
	 * Returns the first payment request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching payment request, or <code>null</code> if a matching payment request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<PaymentRequest> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last payment request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching payment request
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentRequestException if a matching payment request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentRequestException, SystemException {
		PaymentRequest paymentRequest = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (paymentRequest != null) {
			return paymentRequest;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentRequestException(msg.toString());
	}

	/**
	 * Returns the last payment request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching payment request, or <code>null</code> if a matching payment request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<PaymentRequest> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the payment requests before and after the current payment request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param paymentRequestId the primary key of the current payment request
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next payment request
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentRequestException if a payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest[] findByUuid_C_PrevAndNext(long paymentRequestId,
		String uuid, long companyId, OrderByComparator orderByComparator)
		throws NoSuchPaymentRequestException, SystemException {
		PaymentRequest paymentRequest = findByPrimaryKey(paymentRequestId);

		Session session = null;

		try {
			session = openSession();

			PaymentRequest[] array = new PaymentRequestImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, paymentRequest, uuid,
					companyId, orderByComparator, true);

			array[1] = paymentRequest;

			array[2] = getByUuid_C_PrevAndNext(session, paymentRequest, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PaymentRequest getByUuid_C_PrevAndNext(Session session,
		PaymentRequest paymentRequest, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PAYMENTREQUEST_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(PaymentRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(paymentRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PaymentRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the payment requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (PaymentRequest paymentRequest : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(paymentRequest);
		}
	}

	/**
	 * Returns the number of payment requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PAYMENTREQUEST_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "paymentRequest.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "paymentRequest.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(paymentRequest.uuid IS NULL OR paymentRequest.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "paymentRequest.companyId = ?";

	public PaymentRequestPersistenceImpl() {
		setModelClass(PaymentRequest.class);
	}

	/**
	 * Caches the payment request in the entity cache if it is enabled.
	 *
	 * @param paymentRequest the payment request
	 */
	@Override
	public void cacheResult(PaymentRequest paymentRequest) {
		EntityCacheUtil.putResult(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestImpl.class, paymentRequest.getPrimaryKey(),
			paymentRequest);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { paymentRequest.getUuid(), paymentRequest.getGroupId() },
			paymentRequest);

		paymentRequest.resetOriginalValues();
	}

	/**
	 * Caches the payment requests in the entity cache if it is enabled.
	 *
	 * @param paymentRequests the payment requests
	 */
	@Override
	public void cacheResult(List<PaymentRequest> paymentRequests) {
		for (PaymentRequest paymentRequest : paymentRequests) {
			if (EntityCacheUtil.getResult(
						PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
						PaymentRequestImpl.class, paymentRequest.getPrimaryKey()) == null) {
				cacheResult(paymentRequest);
			}
			else {
				paymentRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all payment requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PaymentRequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PaymentRequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the payment request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PaymentRequest paymentRequest) {
		EntityCacheUtil.removeResult(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestImpl.class, paymentRequest.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(paymentRequest);
	}

	@Override
	public void clearCache(List<PaymentRequest> paymentRequests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PaymentRequest paymentRequest : paymentRequests) {
			EntityCacheUtil.removeResult(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
				PaymentRequestImpl.class, paymentRequest.getPrimaryKey());

			clearUniqueFindersCache(paymentRequest);
		}
	}

	protected void cacheUniqueFindersCache(PaymentRequest paymentRequest) {
		if (paymentRequest.isNew()) {
			Object[] args = new Object[] {
					paymentRequest.getUuid(), paymentRequest.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				paymentRequest);
		}
		else {
			PaymentRequestModelImpl paymentRequestModelImpl = (PaymentRequestModelImpl)paymentRequest;

			if ((paymentRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentRequest.getUuid(), paymentRequest.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					paymentRequest);
			}
		}
	}

	protected void clearUniqueFindersCache(PaymentRequest paymentRequest) {
		PaymentRequestModelImpl paymentRequestModelImpl = (PaymentRequestModelImpl)paymentRequest;

		Object[] args = new Object[] {
				paymentRequest.getUuid(), paymentRequest.getGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((paymentRequestModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					paymentRequestModelImpl.getOriginalUuid(),
					paymentRequestModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new payment request with the primary key. Does not add the payment request to the database.
	 *
	 * @param paymentRequestId the primary key for the new payment request
	 * @return the new payment request
	 */
	@Override
	public PaymentRequest create(long paymentRequestId) {
		PaymentRequest paymentRequest = new PaymentRequestImpl();

		paymentRequest.setNew(true);
		paymentRequest.setPrimaryKey(paymentRequestId);

		String uuid = PortalUUIDUtil.generate();

		paymentRequest.setUuid(uuid);

		return paymentRequest;
	}

	/**
	 * Removes the payment request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param paymentRequestId the primary key of the payment request
	 * @return the payment request that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentRequestException if a payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest remove(long paymentRequestId)
		throws NoSuchPaymentRequestException, SystemException {
		return remove((Serializable)paymentRequestId);
	}

	/**
	 * Removes the payment request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the payment request
	 * @return the payment request that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentRequestException if a payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest remove(Serializable primaryKey)
		throws NoSuchPaymentRequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PaymentRequest paymentRequest = (PaymentRequest)session.get(PaymentRequestImpl.class,
					primaryKey);

			if (paymentRequest == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPaymentRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(paymentRequest);
		}
		catch (NoSuchPaymentRequestException nsee) {
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
	protected PaymentRequest removeImpl(PaymentRequest paymentRequest)
		throws SystemException {
		paymentRequest = toUnwrappedModel(paymentRequest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(paymentRequest)) {
				paymentRequest = (PaymentRequest)session.get(PaymentRequestImpl.class,
						paymentRequest.getPrimaryKeyObj());
			}

			if (paymentRequest != null) {
				session.delete(paymentRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (paymentRequest != null) {
			clearCache(paymentRequest);
		}

		return paymentRequest;
	}

	@Override
	public PaymentRequest updateImpl(
		org.oep.core.dossiermgt.model.PaymentRequest paymentRequest)
		throws SystemException {
		paymentRequest = toUnwrappedModel(paymentRequest);

		boolean isNew = paymentRequest.isNew();

		PaymentRequestModelImpl paymentRequestModelImpl = (PaymentRequestModelImpl)paymentRequest;

		if (Validator.isNull(paymentRequest.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			paymentRequest.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (paymentRequest.isNew()) {
				session.save(paymentRequest);

				paymentRequest.setNew(false);
			}
			else {
				session.merge(paymentRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PaymentRequestModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((paymentRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentRequestModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { paymentRequestModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((paymentRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentRequestModelImpl.getOriginalUuid(),
						paymentRequestModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						paymentRequestModelImpl.getUuid(),
						paymentRequestModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		EntityCacheUtil.putResult(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			PaymentRequestImpl.class, paymentRequest.getPrimaryKey(),
			paymentRequest);

		clearUniqueFindersCache(paymentRequest);
		cacheUniqueFindersCache(paymentRequest);

		return paymentRequest;
	}

	protected PaymentRequest toUnwrappedModel(PaymentRequest paymentRequest) {
		if (paymentRequest instanceof PaymentRequestImpl) {
			return paymentRequest;
		}

		PaymentRequestImpl paymentRequestImpl = new PaymentRequestImpl();

		paymentRequestImpl.setNew(paymentRequest.isNew());
		paymentRequestImpl.setPrimaryKey(paymentRequest.getPrimaryKey());

		paymentRequestImpl.setUuid(paymentRequest.getUuid());
		paymentRequestImpl.setPaymentRequestId(paymentRequest.getPaymentRequestId());
		paymentRequestImpl.setUserId(paymentRequest.getUserId());
		paymentRequestImpl.setGroupId(paymentRequest.getGroupId());
		paymentRequestImpl.setCompanyId(paymentRequest.getCompanyId());
		paymentRequestImpl.setCreateDate(paymentRequest.getCreateDate());
		paymentRequestImpl.setModifiedDate(paymentRequest.getModifiedDate());
		paymentRequestImpl.setOrganizationId(paymentRequest.getOrganizationId());
		paymentRequestImpl.setDossierId(paymentRequest.getDossierId());
		paymentRequestImpl.setAmount(paymentRequest.getAmount());
		paymentRequestImpl.setNote(paymentRequest.getNote());
		paymentRequestImpl.setIssueDate(paymentRequest.getIssueDate());
		paymentRequestImpl.setPaymentFileId(paymentRequest.getPaymentFileId());

		return paymentRequestImpl;
	}

	/**
	 * Returns the payment request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment request
	 * @return the payment request
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentRequestException if a payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPaymentRequestException, SystemException {
		PaymentRequest paymentRequest = fetchByPrimaryKey(primaryKey);

		if (paymentRequest == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPaymentRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return paymentRequest;
	}

	/**
	 * Returns the payment request with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchPaymentRequestException} if it could not be found.
	 *
	 * @param paymentRequestId the primary key of the payment request
	 * @return the payment request
	 * @throws org.oep.core.dossiermgt.NoSuchPaymentRequestException if a payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest findByPrimaryKey(long paymentRequestId)
		throws NoSuchPaymentRequestException, SystemException {
		return findByPrimaryKey((Serializable)paymentRequestId);
	}

	/**
	 * Returns the payment request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment request
	 * @return the payment request, or <code>null</code> if a payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PaymentRequest paymentRequest = (PaymentRequest)EntityCacheUtil.getResult(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
				PaymentRequestImpl.class, primaryKey);

		if (paymentRequest == _nullPaymentRequest) {
			return null;
		}

		if (paymentRequest == null) {
			Session session = null;

			try {
				session = openSession();

				paymentRequest = (PaymentRequest)session.get(PaymentRequestImpl.class,
						primaryKey);

				if (paymentRequest != null) {
					cacheResult(paymentRequest);
				}
				else {
					EntityCacheUtil.putResult(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
						PaymentRequestImpl.class, primaryKey,
						_nullPaymentRequest);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
					PaymentRequestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return paymentRequest;
	}

	/**
	 * Returns the payment request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param paymentRequestId the primary key of the payment request
	 * @return the payment request, or <code>null</code> if a payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentRequest fetchByPrimaryKey(long paymentRequestId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)paymentRequestId);
	}

	/**
	 * Returns all the payment requests.
	 *
	 * @return the payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentRequest> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment requests
	 * @param end the upper bound of the range of payment requests (not inclusive)
	 * @return the range of payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentRequest> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.PaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment requests
	 * @param end the upper bound of the range of payment requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentRequest> findAll(int start, int end,
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

		List<PaymentRequest> list = (List<PaymentRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PAYMENTREQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PAYMENTREQUEST;

				if (pagination) {
					sql = sql.concat(PaymentRequestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PaymentRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentRequest>(list);
				}
				else {
					list = (List<PaymentRequest>)QueryUtil.list(q,
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
	 * Removes all the payment requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PaymentRequest paymentRequest : findAll()) {
			remove(paymentRequest);
		}
	}

	/**
	 * Returns the number of payment requests.
	 *
	 * @return the number of payment requests
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

				Query q = session.createQuery(_SQL_COUNT_PAYMENTREQUEST);

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
	 * Initializes the payment request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.PaymentRequest")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PaymentRequest>> listenersList = new ArrayList<ModelListener<PaymentRequest>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PaymentRequest>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PaymentRequestImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PAYMENTREQUEST = "SELECT paymentRequest FROM PaymentRequest paymentRequest";
	private static final String _SQL_SELECT_PAYMENTREQUEST_WHERE = "SELECT paymentRequest FROM PaymentRequest paymentRequest WHERE ";
	private static final String _SQL_COUNT_PAYMENTREQUEST = "SELECT COUNT(paymentRequest) FROM PaymentRequest paymentRequest";
	private static final String _SQL_COUNT_PAYMENTREQUEST_WHERE = "SELECT COUNT(paymentRequest) FROM PaymentRequest paymentRequest WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "paymentRequest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentRequest exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PaymentRequest exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PaymentRequestPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static PaymentRequest _nullPaymentRequest = new PaymentRequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PaymentRequest> toCacheModel() {
				return _nullPaymentRequestCacheModel;
			}
		};

	private static CacheModel<PaymentRequest> _nullPaymentRequestCacheModel = new CacheModel<PaymentRequest>() {
			@Override
			public PaymentRequest toEntityModel() {
				return _nullPaymentRequest;
			}
		};
}