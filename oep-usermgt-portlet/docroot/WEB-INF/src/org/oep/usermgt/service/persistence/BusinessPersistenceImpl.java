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

package org.oep.usermgt.service.persistence;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.usermgt.NoSuchBusinessException;
import org.oep.usermgt.model.Business;
import org.oep.usermgt.model.impl.BusinessImpl;
import org.oep.usermgt.model.impl.BusinessModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the business service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see BusinessPersistence
 * @see BusinessUtil
 * @generated
 */
public class BusinessPersistenceImpl extends BasePersistenceImpl<Business>
	implements BusinessPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BusinessUtil} to access the business persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BusinessImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MU = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMU",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MU = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMU",
			new String[] { Long.class.getName() },
			BusinessModelImpl.MASTERUSERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MU = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMU",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the businesses where masterUserId = &#63;.
	 *
	 * @param masterUserId the master user ID
	 * @return the matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByMU(long masterUserId) throws SystemException {
		return findByMU(masterUserId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businesses where masterUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param masterUserId the master user ID
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @return the range of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByMU(long masterUserId, int start, int end)
		throws SystemException {
		return findByMU(masterUserId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the businesses where masterUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param masterUserId the master user ID
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByMU(long masterUserId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MU;
			finderArgs = new Object[] { masterUserId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MU;
			finderArgs = new Object[] {
					masterUserId,
					
					start, end, orderByComparator
				};
		}

		List<Business> list = (List<Business>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Business business : list) {
				if ((masterUserId != business.getMasterUserId())) {
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

			query.append(_SQL_SELECT_BUSINESS_WHERE);

			query.append(_FINDER_COLUMN_MU_MASTERUSERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BusinessModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(masterUserId);

				if (!pagination) {
					list = (List<Business>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Business>(list);
				}
				else {
					list = (List<Business>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first business in the ordered set where masterUserId = &#63;.
	 *
	 * @param masterUserId the master user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByMU_First(long masterUserId,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = fetchByMU_First(masterUserId, orderByComparator);

		if (business != null) {
			return business;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("masterUserId=");
		msg.append(masterUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessException(msg.toString());
	}

	/**
	 * Returns the first business in the ordered set where masterUserId = &#63;.
	 *
	 * @param masterUserId the master user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business, or <code>null</code> if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByMU_First(long masterUserId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Business> list = findByMU(masterUserId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last business in the ordered set where masterUserId = &#63;.
	 *
	 * @param masterUserId the master user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByMU_Last(long masterUserId,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = fetchByMU_Last(masterUserId, orderByComparator);

		if (business != null) {
			return business;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("masterUserId=");
		msg.append(masterUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessException(msg.toString());
	}

	/**
	 * Returns the last business in the ordered set where masterUserId = &#63;.
	 *
	 * @param masterUserId the master user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business, or <code>null</code> if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByMU_Last(long masterUserId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMU(masterUserId);

		if (count == 0) {
			return null;
		}

		List<Business> list = findByMU(masterUserId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the businesses before and after the current business in the ordered set where masterUserId = &#63;.
	 *
	 * @param businessId the primary key of the current business
	 * @param masterUserId the master user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business[] findByMU_PrevAndNext(long businessId, long masterUserId,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = findByPrimaryKey(businessId);

		Session session = null;

		try {
			session = openSession();

			Business[] array = new BusinessImpl[3];

			array[0] = getByMU_PrevAndNext(session, business, masterUserId,
					orderByComparator, true);

			array[1] = business;

			array[2] = getByMU_PrevAndNext(session, business, masterUserId,
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

	protected Business getByMU_PrevAndNext(Session session, Business business,
		long masterUserId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUSINESS_WHERE);

		query.append(_FINDER_COLUMN_MU_MASTERUSERID_2);

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
			query.append(BusinessModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(masterUserId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(business);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Business> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the businesses where masterUserId = &#63; from the database.
	 *
	 * @param masterUserId the master user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMU(long masterUserId) throws SystemException {
		for (Business business : findByMU(masterUserId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(business);
		}
	}

	/**
	 * Returns the number of businesses where masterUserId = &#63;.
	 *
	 * @param masterUserId the master user ID
	 * @return the number of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMU(long masterUserId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MU;

		Object[] finderArgs = new Object[] { masterUserId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESS_WHERE);

			query.append(_FINDER_COLUMN_MU_MASTERUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(masterUserId);

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

	private static final String _FINDER_COLUMN_MU_MASTERUSERID_2 = "business.masterUserId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_O = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByO",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByO",
			new String[] { Long.class.getName() },
			BusinessModelImpl.ORGANIZATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_O = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByO",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the businesses where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByO(long organizationId)
		throws SystemException {
		return findByO(organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the businesses where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @return the range of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByO(long organizationId, int start, int end)
		throws SystemException {
		return findByO(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the businesses where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByO(long organizationId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O;
			finderArgs = new Object[] { organizationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_O;
			finderArgs = new Object[] {
					organizationId,
					
					start, end, orderByComparator
				};
		}

		List<Business> list = (List<Business>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Business business : list) {
				if ((organizationId != business.getOrganizationId())) {
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

			query.append(_SQL_SELECT_BUSINESS_WHERE);

			query.append(_FINDER_COLUMN_O_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BusinessModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<Business>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Business>(list);
				}
				else {
					list = (List<Business>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first business in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByO_First(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = fetchByO_First(organizationId, orderByComparator);

		if (business != null) {
			return business;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessException(msg.toString());
	}

	/**
	 * Returns the first business in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business, or <code>null</code> if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByO_First(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Business> list = findByO(organizationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last business in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByO_Last(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = fetchByO_Last(organizationId, orderByComparator);

		if (business != null) {
			return business;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessException(msg.toString());
	}

	/**
	 * Returns the last business in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business, or <code>null</code> if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByO_Last(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByO(organizationId);

		if (count == 0) {
			return null;
		}

		List<Business> list = findByO(organizationId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the businesses before and after the current business in the ordered set where organizationId = &#63;.
	 *
	 * @param businessId the primary key of the current business
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business[] findByO_PrevAndNext(long businessId, long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = findByPrimaryKey(businessId);

		Session session = null;

		try {
			session = openSession();

			Business[] array = new BusinessImpl[3];

			array[0] = getByO_PrevAndNext(session, business, organizationId,
					orderByComparator, true);

			array[1] = business;

			array[2] = getByO_PrevAndNext(session, business, organizationId,
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

	protected Business getByO_PrevAndNext(Session session, Business business,
		long organizationId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUSINESS_WHERE);

		query.append(_FINDER_COLUMN_O_ORGANIZATIONID_2);

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
			query.append(BusinessModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(business);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Business> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the businesses where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByO(long organizationId) throws SystemException {
		for (Business business : findByO(organizationId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(business);
		}
	}

	/**
	 * Returns the number of businesses where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByO(long organizationId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_O;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESS_WHERE);

			query.append(_FINDER_COLUMN_O_ORGANIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

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

	private static final String _FINDER_COLUMN_O_ORGANIZATIONID_2 = "business.organizationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CN = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCN",
			new String[] { String.class.getName() },
			BusinessModelImpl.CITYNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CN = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the businesses where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @return the matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByCN(String cityNo) throws SystemException {
		return findByCN(cityNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businesses where cityNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cityNo the city no
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @return the range of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByCN(String cityNo, int start, int end)
		throws SystemException {
		return findByCN(cityNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the businesses where cityNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cityNo the city no
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByCN(String cityNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN;
			finderArgs = new Object[] { cityNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CN;
			finderArgs = new Object[] { cityNo, start, end, orderByComparator };
		}

		List<Business> list = (List<Business>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Business business : list) {
				if (!Validator.equals(cityNo, business.getCityNo())) {
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

			query.append(_SQL_SELECT_BUSINESS_WHERE);

			boolean bindCityNo = false;

			if (cityNo == null) {
				query.append(_FINDER_COLUMN_CN_CITYNO_1);
			}
			else if (cityNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CN_CITYNO_3);
			}
			else {
				bindCityNo = true;

				query.append(_FINDER_COLUMN_CN_CITYNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BusinessModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCityNo) {
					qPos.add(cityNo);
				}

				if (!pagination) {
					list = (List<Business>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Business>(list);
				}
				else {
					list = (List<Business>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first business in the ordered set where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByCN_First(String cityNo,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = fetchByCN_First(cityNo, orderByComparator);

		if (business != null) {
			return business;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cityNo=");
		msg.append(cityNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessException(msg.toString());
	}

	/**
	 * Returns the first business in the ordered set where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business, or <code>null</code> if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByCN_First(String cityNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<Business> list = findByCN(cityNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last business in the ordered set where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByCN_Last(String cityNo,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = fetchByCN_Last(cityNo, orderByComparator);

		if (business != null) {
			return business;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cityNo=");
		msg.append(cityNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessException(msg.toString());
	}

	/**
	 * Returns the last business in the ordered set where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business, or <code>null</code> if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByCN_Last(String cityNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCN(cityNo);

		if (count == 0) {
			return null;
		}

		List<Business> list = findByCN(cityNo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the businesses before and after the current business in the ordered set where cityNo = &#63;.
	 *
	 * @param businessId the primary key of the current business
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business[] findByCN_PrevAndNext(long businessId, String cityNo,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = findByPrimaryKey(businessId);

		Session session = null;

		try {
			session = openSession();

			Business[] array = new BusinessImpl[3];

			array[0] = getByCN_PrevAndNext(session, business, cityNo,
					orderByComparator, true);

			array[1] = business;

			array[2] = getByCN_PrevAndNext(session, business, cityNo,
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

	protected Business getByCN_PrevAndNext(Session session, Business business,
		String cityNo, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUSINESS_WHERE);

		boolean bindCityNo = false;

		if (cityNo == null) {
			query.append(_FINDER_COLUMN_CN_CITYNO_1);
		}
		else if (cityNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CN_CITYNO_3);
		}
		else {
			bindCityNo = true;

			query.append(_FINDER_COLUMN_CN_CITYNO_2);
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
			query.append(BusinessModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCityNo) {
			qPos.add(cityNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(business);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Business> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the businesses where cityNo = &#63; from the database.
	 *
	 * @param cityNo the city no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCN(String cityNo) throws SystemException {
		for (Business business : findByCN(cityNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(business);
		}
	}

	/**
	 * Returns the number of businesses where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @return the number of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCN(String cityNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CN;

		Object[] finderArgs = new Object[] { cityNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESS_WHERE);

			boolean bindCityNo = false;

			if (cityNo == null) {
				query.append(_FINDER_COLUMN_CN_CITYNO_1);
			}
			else if (cityNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CN_CITYNO_3);
			}
			else {
				bindCityNo = true;

				query.append(_FINDER_COLUMN_CN_CITYNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCityNo) {
					qPos.add(cityNo);
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

	private static final String _FINDER_COLUMN_CN_CITYNO_1 = "business.cityNo IS NULL";
	private static final String _FINDER_COLUMN_CN_CITYNO_2 = "business.cityNo = ?";
	private static final String _FINDER_COLUMN_CN_CITYNO_3 = "(business.cityNo IS NULL OR business.cityNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DN = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDN",
			new String[] { String.class.getName() },
			BusinessModelImpl.DISTRICTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DN = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the businesses where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @return the matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByDN(String districtNo) throws SystemException {
		return findByDN(districtNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businesses where districtNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param districtNo the district no
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @return the range of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByDN(String districtNo, int start, int end)
		throws SystemException {
		return findByDN(districtNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the businesses where districtNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param districtNo the district no
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByDN(String districtNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN;
			finderArgs = new Object[] { districtNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DN;
			finderArgs = new Object[] { districtNo, start, end, orderByComparator };
		}

		List<Business> list = (List<Business>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Business business : list) {
				if (!Validator.equals(districtNo, business.getDistrictNo())) {
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

			query.append(_SQL_SELECT_BUSINESS_WHERE);

			boolean bindDistrictNo = false;

			if (districtNo == null) {
				query.append(_FINDER_COLUMN_DN_DISTRICTNO_1);
			}
			else if (districtNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DN_DISTRICTNO_3);
			}
			else {
				bindDistrictNo = true;

				query.append(_FINDER_COLUMN_DN_DISTRICTNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BusinessModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDistrictNo) {
					qPos.add(districtNo);
				}

				if (!pagination) {
					list = (List<Business>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Business>(list);
				}
				else {
					list = (List<Business>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first business in the ordered set where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByDN_First(String districtNo,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = fetchByDN_First(districtNo, orderByComparator);

		if (business != null) {
			return business;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("districtNo=");
		msg.append(districtNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessException(msg.toString());
	}

	/**
	 * Returns the first business in the ordered set where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business, or <code>null</code> if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByDN_First(String districtNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<Business> list = findByDN(districtNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last business in the ordered set where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByDN_Last(String districtNo,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = fetchByDN_Last(districtNo, orderByComparator);

		if (business != null) {
			return business;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("districtNo=");
		msg.append(districtNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessException(msg.toString());
	}

	/**
	 * Returns the last business in the ordered set where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business, or <code>null</code> if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByDN_Last(String districtNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDN(districtNo);

		if (count == 0) {
			return null;
		}

		List<Business> list = findByDN(districtNo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the businesses before and after the current business in the ordered set where districtNo = &#63;.
	 *
	 * @param businessId the primary key of the current business
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business[] findByDN_PrevAndNext(long businessId, String districtNo,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = findByPrimaryKey(businessId);

		Session session = null;

		try {
			session = openSession();

			Business[] array = new BusinessImpl[3];

			array[0] = getByDN_PrevAndNext(session, business, districtNo,
					orderByComparator, true);

			array[1] = business;

			array[2] = getByDN_PrevAndNext(session, business, districtNo,
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

	protected Business getByDN_PrevAndNext(Session session, Business business,
		String districtNo, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUSINESS_WHERE);

		boolean bindDistrictNo = false;

		if (districtNo == null) {
			query.append(_FINDER_COLUMN_DN_DISTRICTNO_1);
		}
		else if (districtNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DN_DISTRICTNO_3);
		}
		else {
			bindDistrictNo = true;

			query.append(_FINDER_COLUMN_DN_DISTRICTNO_2);
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
			query.append(BusinessModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDistrictNo) {
			qPos.add(districtNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(business);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Business> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the businesses where districtNo = &#63; from the database.
	 *
	 * @param districtNo the district no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDN(String districtNo) throws SystemException {
		for (Business business : findByDN(districtNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(business);
		}
	}

	/**
	 * Returns the number of businesses where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @return the number of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDN(String districtNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DN;

		Object[] finderArgs = new Object[] { districtNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESS_WHERE);

			boolean bindDistrictNo = false;

			if (districtNo == null) {
				query.append(_FINDER_COLUMN_DN_DISTRICTNO_1);
			}
			else if (districtNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DN_DISTRICTNO_3);
			}
			else {
				bindDistrictNo = true;

				query.append(_FINDER_COLUMN_DN_DISTRICTNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDistrictNo) {
					qPos.add(districtNo);
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

	private static final String _FINDER_COLUMN_DN_DISTRICTNO_1 = "business.districtNo IS NULL";
	private static final String _FINDER_COLUMN_DN_DISTRICTNO_2 = "business.districtNo = ?";
	private static final String _FINDER_COLUMN_DN_DISTRICTNO_3 = "(business.districtNo IS NULL OR business.districtNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WN = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByWN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WN = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByWN",
			new String[] { String.class.getName() },
			BusinessModelImpl.WARDNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WN = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByWN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the businesses where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @return the matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByWN(String wardNo) throws SystemException {
		return findByWN(wardNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businesses where wardNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param wardNo the ward no
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @return the range of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByWN(String wardNo, int start, int end)
		throws SystemException {
		return findByWN(wardNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the businesses where wardNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param wardNo the ward no
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findByWN(String wardNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WN;
			finderArgs = new Object[] { wardNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WN;
			finderArgs = new Object[] { wardNo, start, end, orderByComparator };
		}

		List<Business> list = (List<Business>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Business business : list) {
				if (!Validator.equals(wardNo, business.getWardNo())) {
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

			query.append(_SQL_SELECT_BUSINESS_WHERE);

			boolean bindWardNo = false;

			if (wardNo == null) {
				query.append(_FINDER_COLUMN_WN_WARDNO_1);
			}
			else if (wardNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_WN_WARDNO_3);
			}
			else {
				bindWardNo = true;

				query.append(_FINDER_COLUMN_WN_WARDNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BusinessModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindWardNo) {
					qPos.add(wardNo);
				}

				if (!pagination) {
					list = (List<Business>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Business>(list);
				}
				else {
					list = (List<Business>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first business in the ordered set where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByWN_First(String wardNo,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = fetchByWN_First(wardNo, orderByComparator);

		if (business != null) {
			return business;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wardNo=");
		msg.append(wardNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessException(msg.toString());
	}

	/**
	 * Returns the first business in the ordered set where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business, or <code>null</code> if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByWN_First(String wardNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<Business> list = findByWN(wardNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last business in the ordered set where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByWN_Last(String wardNo,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = fetchByWN_Last(wardNo, orderByComparator);

		if (business != null) {
			return business;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wardNo=");
		msg.append(wardNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessException(msg.toString());
	}

	/**
	 * Returns the last business in the ordered set where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business, or <code>null</code> if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByWN_Last(String wardNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByWN(wardNo);

		if (count == 0) {
			return null;
		}

		List<Business> list = findByWN(wardNo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the businesses before and after the current business in the ordered set where wardNo = &#63;.
	 *
	 * @param businessId the primary key of the current business
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business[] findByWN_PrevAndNext(long businessId, String wardNo,
		OrderByComparator orderByComparator)
		throws NoSuchBusinessException, SystemException {
		Business business = findByPrimaryKey(businessId);

		Session session = null;

		try {
			session = openSession();

			Business[] array = new BusinessImpl[3];

			array[0] = getByWN_PrevAndNext(session, business, wardNo,
					orderByComparator, true);

			array[1] = business;

			array[2] = getByWN_PrevAndNext(session, business, wardNo,
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

	protected Business getByWN_PrevAndNext(Session session, Business business,
		String wardNo, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUSINESS_WHERE);

		boolean bindWardNo = false;

		if (wardNo == null) {
			query.append(_FINDER_COLUMN_WN_WARDNO_1);
		}
		else if (wardNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_WN_WARDNO_3);
		}
		else {
			bindWardNo = true;

			query.append(_FINDER_COLUMN_WN_WARDNO_2);
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
			query.append(BusinessModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindWardNo) {
			qPos.add(wardNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(business);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Business> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the businesses where wardNo = &#63; from the database.
	 *
	 * @param wardNo the ward no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByWN(String wardNo) throws SystemException {
		for (Business business : findByWN(wardNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(business);
		}
	}

	/**
	 * Returns the number of businesses where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @return the number of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByWN(String wardNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WN;

		Object[] finderArgs = new Object[] { wardNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESS_WHERE);

			boolean bindWardNo = false;

			if (wardNo == null) {
				query.append(_FINDER_COLUMN_WN_WARDNO_1);
			}
			else if (wardNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_WN_WARDNO_3);
			}
			else {
				bindWardNo = true;

				query.append(_FINDER_COLUMN_WN_WARDNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindWardNo) {
					qPos.add(wardNo);
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

	private static final String _FINDER_COLUMN_WN_WARDNO_1 = "business.wardNo IS NULL";
	private static final String _FINDER_COLUMN_WN_WARDNO_2 = "business.wardNo = ?";
	private static final String _FINDER_COLUMN_WN_WARDNO_3 = "(business.wardNo IS NULL OR business.wardNo = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_RA = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, BusinessImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByRA",
			new String[] { String.class.getName() },
			BusinessModelImpl.REGISTERAGENT_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RA = new FinderPath(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRA",
			new String[] { String.class.getName() });

	/**
	 * Returns the business where registerAgent = &#63; or throws a {@link org.oep.usermgt.NoSuchBusinessException} if it could not be found.
	 *
	 * @param registerAgent the register agent
	 * @return the matching business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByRA(String registerAgent)
		throws NoSuchBusinessException, SystemException {
		Business business = fetchByRA(registerAgent);

		if (business == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("registerAgent=");
			msg.append(registerAgent);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchBusinessException(msg.toString());
		}

		return business;
	}

	/**
	 * Returns the business where registerAgent = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param registerAgent the register agent
	 * @return the matching business, or <code>null</code> if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByRA(String registerAgent) throws SystemException {
		return fetchByRA(registerAgent, true);
	}

	/**
	 * Returns the business where registerAgent = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param registerAgent the register agent
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching business, or <code>null</code> if a matching business could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByRA(String registerAgent, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { registerAgent };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_RA,
					finderArgs, this);
		}

		if (result instanceof Business) {
			Business business = (Business)result;

			if (!Validator.equals(registerAgent, business.getRegisterAgent())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_BUSINESS_WHERE);

			boolean bindRegisterAgent = false;

			if (registerAgent == null) {
				query.append(_FINDER_COLUMN_RA_REGISTERAGENT_1);
			}
			else if (registerAgent.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RA_REGISTERAGENT_3);
			}
			else {
				bindRegisterAgent = true;

				query.append(_FINDER_COLUMN_RA_REGISTERAGENT_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegisterAgent) {
					qPos.add(registerAgent);
				}

				List<Business> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RA,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"BusinessPersistenceImpl.fetchByRA(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Business business = list.get(0);

					result = business;

					cacheResult(business);

					if ((business.getRegisterAgent() == null) ||
							!business.getRegisterAgent().equals(registerAgent)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RA,
							finderArgs, business);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RA, finderArgs);

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
			return (Business)result;
		}
	}

	/**
	 * Removes the business where registerAgent = &#63; from the database.
	 *
	 * @param registerAgent the register agent
	 * @return the business that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business removeByRA(String registerAgent)
		throws NoSuchBusinessException, SystemException {
		Business business = findByRA(registerAgent);

		return remove(business);
	}

	/**
	 * Returns the number of businesses where registerAgent = &#63;.
	 *
	 * @param registerAgent the register agent
	 * @return the number of matching businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRA(String registerAgent) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RA;

		Object[] finderArgs = new Object[] { registerAgent };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESS_WHERE);

			boolean bindRegisterAgent = false;

			if (registerAgent == null) {
				query.append(_FINDER_COLUMN_RA_REGISTERAGENT_1);
			}
			else if (registerAgent.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RA_REGISTERAGENT_3);
			}
			else {
				bindRegisterAgent = true;

				query.append(_FINDER_COLUMN_RA_REGISTERAGENT_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegisterAgent) {
					qPos.add(registerAgent);
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

	private static final String _FINDER_COLUMN_RA_REGISTERAGENT_1 = "business.registerAgent IS NULL";
	private static final String _FINDER_COLUMN_RA_REGISTERAGENT_2 = "business.registerAgent = ?";
	private static final String _FINDER_COLUMN_RA_REGISTERAGENT_3 = "(business.registerAgent IS NULL OR business.registerAgent = '')";

	public BusinessPersistenceImpl() {
		setModelClass(Business.class);
	}

	/**
	 * Caches the business in the entity cache if it is enabled.
	 *
	 * @param business the business
	 */
	@Override
	public void cacheResult(Business business) {
		EntityCacheUtil.putResult(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessImpl.class, business.getPrimaryKey(), business);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RA,
			new Object[] { business.getRegisterAgent() }, business);

		business.resetOriginalValues();
	}

	/**
	 * Caches the businesses in the entity cache if it is enabled.
	 *
	 * @param businesses the businesses
	 */
	@Override
	public void cacheResult(List<Business> businesses) {
		for (Business business : businesses) {
			if (EntityCacheUtil.getResult(
						BusinessModelImpl.ENTITY_CACHE_ENABLED,
						BusinessImpl.class, business.getPrimaryKey()) == null) {
				cacheResult(business);
			}
			else {
				business.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all businesses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BusinessImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BusinessImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the business.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Business business) {
		EntityCacheUtil.removeResult(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessImpl.class, business.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(business);
	}

	@Override
	public void clearCache(List<Business> businesses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Business business : businesses) {
			EntityCacheUtil.removeResult(BusinessModelImpl.ENTITY_CACHE_ENABLED,
				BusinessImpl.class, business.getPrimaryKey());

			clearUniqueFindersCache(business);
		}
	}

	protected void cacheUniqueFindersCache(Business business) {
		if (business.isNew()) {
			Object[] args = new Object[] { business.getRegisterAgent() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RA, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RA, args, business);
		}
		else {
			BusinessModelImpl businessModelImpl = (BusinessModelImpl)business;

			if ((businessModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_RA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { business.getRegisterAgent() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RA, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RA, args,
					business);
			}
		}
	}

	protected void clearUniqueFindersCache(Business business) {
		BusinessModelImpl businessModelImpl = (BusinessModelImpl)business;

		Object[] args = new Object[] { business.getRegisterAgent() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RA, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RA, args);

		if ((businessModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_RA.getColumnBitmask()) != 0) {
			args = new Object[] { businessModelImpl.getOriginalRegisterAgent() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RA, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RA, args);
		}
	}

	/**
	 * Creates a new business with the primary key. Does not add the business to the database.
	 *
	 * @param businessId the primary key for the new business
	 * @return the new business
	 */
	@Override
	public Business create(long businessId) {
		Business business = new BusinessImpl();

		business.setNew(true);
		business.setPrimaryKey(businessId);

		return business;
	}

	/**
	 * Removes the business with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessId the primary key of the business
	 * @return the business that was removed
	 * @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business remove(long businessId)
		throws NoSuchBusinessException, SystemException {
		return remove((Serializable)businessId);
	}

	/**
	 * Removes the business with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the business
	 * @return the business that was removed
	 * @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business remove(Serializable primaryKey)
		throws NoSuchBusinessException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Business business = (Business)session.get(BusinessImpl.class,
					primaryKey);

			if (business == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBusinessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(business);
		}
		catch (NoSuchBusinessException nsee) {
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
	protected Business removeImpl(Business business) throws SystemException {
		business = toUnwrappedModel(business);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(business)) {
				business = (Business)session.get(BusinessImpl.class,
						business.getPrimaryKeyObj());
			}

			if (business != null) {
				session.delete(business);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (business != null) {
			clearCache(business);
		}

		return business;
	}

	@Override
	public Business updateImpl(org.oep.usermgt.model.Business business)
		throws SystemException {
		business = toUnwrappedModel(business);

		boolean isNew = business.isNew();

		BusinessModelImpl businessModelImpl = (BusinessModelImpl)business;

		Session session = null;

		try {
			session = openSession();

			if (business.isNew()) {
				session.save(business);

				business.setNew(false);
			}
			else {
				session.merge(business);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BusinessModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((businessModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						businessModelImpl.getOriginalMasterUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MU, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MU,
					args);

				args = new Object[] { businessModelImpl.getMasterUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MU, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MU,
					args);
			}

			if ((businessModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						businessModelImpl.getOriginalOrganizationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O,
					args);

				args = new Object[] { businessModelImpl.getOrganizationId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O,
					args);
			}

			if ((businessModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						businessModelImpl.getOriginalCityNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN,
					args);

				args = new Object[] { businessModelImpl.getCityNo() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN,
					args);
			}

			if ((businessModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						businessModelImpl.getOriginalDistrictNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN,
					args);

				args = new Object[] { businessModelImpl.getDistrictNo() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN,
					args);
			}

			if ((businessModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						businessModelImpl.getOriginalWardNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WN,
					args);

				args = new Object[] { businessModelImpl.getWardNo() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WN,
					args);
			}
		}

		EntityCacheUtil.putResult(BusinessModelImpl.ENTITY_CACHE_ENABLED,
			BusinessImpl.class, business.getPrimaryKey(), business);

		clearUniqueFindersCache(business);
		cacheUniqueFindersCache(business);

		return business;
	}

	protected Business toUnwrappedModel(Business business) {
		if (business instanceof BusinessImpl) {
			return business;
		}

		BusinessImpl businessImpl = new BusinessImpl();

		businessImpl.setNew(business.isNew());
		businessImpl.setPrimaryKey(business.getPrimaryKey());

		businessImpl.setBusinessId(business.getBusinessId());
		businessImpl.setUserId(business.getUserId());
		businessImpl.setGroupId(business.getGroupId());
		businessImpl.setCompanyId(business.getCompanyId());
		businessImpl.setCreateDate(business.getCreateDate());
		businessImpl.setModifiedDate(business.getModifiedDate());
		businessImpl.setOrganizationId(business.getOrganizationId());
		businessImpl.setMasterUserId(business.getMasterUserId());
		businessImpl.setName(business.getName());
		businessImpl.setEnName(business.getEnName());
		businessImpl.setShortName(business.getShortName());
		businessImpl.setAddress(business.getAddress());
		businessImpl.setCityNo(business.getCityNo());
		businessImpl.setCityName(business.getCityName());
		businessImpl.setDistrictNo(business.getDistrictNo());
		businessImpl.setDistrictName(business.getDistrictName());
		businessImpl.setWardNo(business.getWardNo());
		businessImpl.setWardName(business.getWardName());
		businessImpl.setGpsPosition(business.getGpsPosition());
		businessImpl.setTelNo(business.getTelNo());
		businessImpl.setFax(business.getFax());
		businessImpl.setEmail(business.getEmail());
		businessImpl.setBusinessNo(business.getBusinessNo());
		businessImpl.setBusinessType(business.getBusinessType());
		businessImpl.setRegisterAgent(business.getRegisterAgent());
		businessImpl.setRegisterDate(business.getRegisterDate());
		businessImpl.setRepresentative(business.getRepresentative());
		businessImpl.setRepresentativeRole(business.getRepresentativeRole());

		return businessImpl;
	}

	/**
	 * Returns the business with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the business
	 * @return the business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBusinessException, SystemException {
		Business business = fetchByPrimaryKey(primaryKey);

		if (business == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBusinessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return business;
	}

	/**
	 * Returns the business with the primary key or throws a {@link org.oep.usermgt.NoSuchBusinessException} if it could not be found.
	 *
	 * @param businessId the primary key of the business
	 * @return the business
	 * @throws org.oep.usermgt.NoSuchBusinessException if a business with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business findByPrimaryKey(long businessId)
		throws NoSuchBusinessException, SystemException {
		return findByPrimaryKey((Serializable)businessId);
	}

	/**
	 * Returns the business with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the business
	 * @return the business, or <code>null</code> if a business with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Business business = (Business)EntityCacheUtil.getResult(BusinessModelImpl.ENTITY_CACHE_ENABLED,
				BusinessImpl.class, primaryKey);

		if (business == _nullBusiness) {
			return null;
		}

		if (business == null) {
			Session session = null;

			try {
				session = openSession();

				business = (Business)session.get(BusinessImpl.class, primaryKey);

				if (business != null) {
					cacheResult(business);
				}
				else {
					EntityCacheUtil.putResult(BusinessModelImpl.ENTITY_CACHE_ENABLED,
						BusinessImpl.class, primaryKey, _nullBusiness);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BusinessModelImpl.ENTITY_CACHE_ENABLED,
					BusinessImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return business;
	}

	/**
	 * Returns the business with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param businessId the primary key of the business
	 * @return the business, or <code>null</code> if a business with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Business fetchByPrimaryKey(long businessId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)businessId);
	}

	/**
	 * Returns all the businesses.
	 *
	 * @return the businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businesses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @return the range of businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the businesses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.BusinessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of businesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Business> findAll(int start, int end,
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

		List<Business> list = (List<Business>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BUSINESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUSINESS;

				if (pagination) {
					sql = sql.concat(BusinessModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Business>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Business>(list);
				}
				else {
					list = (List<Business>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the businesses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Business business : findAll()) {
			remove(business);
		}
	}

	/**
	 * Returns the number of businesses.
	 *
	 * @return the number of businesses
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

				Query q = session.createQuery(_SQL_COUNT_BUSINESS);

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
	 * Initializes the business persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.usermgt.model.Business")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Business>> listenersList = new ArrayList<ModelListener<Business>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Business>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BusinessImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BUSINESS = "SELECT business FROM Business business";
	private static final String _SQL_SELECT_BUSINESS_WHERE = "SELECT business FROM Business business WHERE ";
	private static final String _SQL_COUNT_BUSINESS = "SELECT COUNT(business) FROM Business business";
	private static final String _SQL_COUNT_BUSINESS_WHERE = "SELECT COUNT(business) FROM Business business WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "business.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Business exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Business exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BusinessPersistenceImpl.class);
	private static Business _nullBusiness = new BusinessImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Business> toCacheModel() {
				return _nullBusinessCacheModel;
			}
		};

	private static CacheModel<Business> _nullBusinessCacheModel = new CacheModel<Business>() {
			@Override
			public Business toEntityModel() {
				return _nullBusiness;
			}
		};
}