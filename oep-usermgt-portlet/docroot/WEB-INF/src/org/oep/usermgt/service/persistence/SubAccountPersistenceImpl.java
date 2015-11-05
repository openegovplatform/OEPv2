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

import org.oep.usermgt.NoSuchSubAccountException;
import org.oep.usermgt.model.SubAccount;
import org.oep.usermgt.model.impl.SubAccountImpl;
import org.oep.usermgt.model.impl.SubAccountModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the sub account service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see SubAccountPersistence
 * @see SubAccountUtil
 * @generated
 */
public class SubAccountPersistenceImpl extends BasePersistenceImpl<SubAccount>
	implements SubAccountPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SubAccountUtil} to access the sub account persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SubAccountImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, SubAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, SubAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_B = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, SubAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByB",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, SubAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByB",
			new String[] { Long.class.getName() },
			SubAccountModelImpl.BUSINESSID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_B = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByB",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the sub accounts where businessId = &#63;.
	 *
	 * @param businessId the business ID
	 * @return the matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SubAccount> findByB(long businessId) throws SystemException {
		return findByB(businessId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sub accounts where businessId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param businessId the business ID
	 * @param start the lower bound of the range of sub accounts
	 * @param end the upper bound of the range of sub accounts (not inclusive)
	 * @return the range of matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SubAccount> findByB(long businessId, int start, int end)
		throws SystemException {
		return findByB(businessId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sub accounts where businessId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param businessId the business ID
	 * @param start the lower bound of the range of sub accounts
	 * @param end the upper bound of the range of sub accounts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SubAccount> findByB(long businessId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B;
			finderArgs = new Object[] { businessId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_B;
			finderArgs = new Object[] { businessId, start, end, orderByComparator };
		}

		List<SubAccount> list = (List<SubAccount>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SubAccount subAccount : list) {
				if ((businessId != subAccount.getBusinessId())) {
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

			query.append(_SQL_SELECT_SUBACCOUNT_WHERE);

			query.append(_FINDER_COLUMN_B_BUSINESSID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SubAccountModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessId);

				if (!pagination) {
					list = (List<SubAccount>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SubAccount>(list);
				}
				else {
					list = (List<SubAccount>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first sub account in the ordered set where businessId = &#63;.
	 *
	 * @param businessId the business ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sub account
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount findByB_First(long businessId,
		OrderByComparator orderByComparator)
		throws NoSuchSubAccountException, SystemException {
		SubAccount subAccount = fetchByB_First(businessId, orderByComparator);

		if (subAccount != null) {
			return subAccount;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("businessId=");
		msg.append(businessId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSubAccountException(msg.toString());
	}

	/**
	 * Returns the first sub account in the ordered set where businessId = &#63;.
	 *
	 * @param businessId the business ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sub account, or <code>null</code> if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount fetchByB_First(long businessId,
		OrderByComparator orderByComparator) throws SystemException {
		List<SubAccount> list = findByB(businessId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sub account in the ordered set where businessId = &#63;.
	 *
	 * @param businessId the business ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sub account
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount findByB_Last(long businessId,
		OrderByComparator orderByComparator)
		throws NoSuchSubAccountException, SystemException {
		SubAccount subAccount = fetchByB_Last(businessId, orderByComparator);

		if (subAccount != null) {
			return subAccount;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("businessId=");
		msg.append(businessId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSubAccountException(msg.toString());
	}

	/**
	 * Returns the last sub account in the ordered set where businessId = &#63;.
	 *
	 * @param businessId the business ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sub account, or <code>null</code> if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount fetchByB_Last(long businessId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByB(businessId);

		if (count == 0) {
			return null;
		}

		List<SubAccount> list = findByB(businessId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sub accounts before and after the current sub account in the ordered set where businessId = &#63;.
	 *
	 * @param subAccountId the primary key of the current sub account
	 * @param businessId the business ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sub account
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount[] findByB_PrevAndNext(long subAccountId, long businessId,
		OrderByComparator orderByComparator)
		throws NoSuchSubAccountException, SystemException {
		SubAccount subAccount = findByPrimaryKey(subAccountId);

		Session session = null;

		try {
			session = openSession();

			SubAccount[] array = new SubAccountImpl[3];

			array[0] = getByB_PrevAndNext(session, subAccount, businessId,
					orderByComparator, true);

			array[1] = subAccount;

			array[2] = getByB_PrevAndNext(session, subAccount, businessId,
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

	protected SubAccount getByB_PrevAndNext(Session session,
		SubAccount subAccount, long businessId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SUBACCOUNT_WHERE);

		query.append(_FINDER_COLUMN_B_BUSINESSID_2);

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
			query.append(SubAccountModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(businessId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(subAccount);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SubAccount> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sub accounts where businessId = &#63; from the database.
	 *
	 * @param businessId the business ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByB(long businessId) throws SystemException {
		for (SubAccount subAccount : findByB(businessId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(subAccount);
		}
	}

	/**
	 * Returns the number of sub accounts where businessId = &#63;.
	 *
	 * @param businessId the business ID
	 * @return the number of matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByB(long businessId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_B;

		Object[] finderArgs = new Object[] { businessId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SUBACCOUNT_WHERE);

			query.append(_FINDER_COLUMN_B_BUSINESSID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessId);

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

	private static final String _FINDER_COLUMN_B_BUSINESSID_2 = "subAccount.businessId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MU = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, SubAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMU",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MU = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, SubAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMU",
			new String[] { Long.class.getName() },
			SubAccountModelImpl.MAPPINGUSERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MU = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMU",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the sub accounts where mappingUserId = &#63;.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SubAccount> findByMU(long mappingUserId)
		throws SystemException {
		return findByMU(mappingUserId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the sub accounts where mappingUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mappingUserId the mapping user ID
	 * @param start the lower bound of the range of sub accounts
	 * @param end the upper bound of the range of sub accounts (not inclusive)
	 * @return the range of matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SubAccount> findByMU(long mappingUserId, int start, int end)
		throws SystemException {
		return findByMU(mappingUserId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sub accounts where mappingUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mappingUserId the mapping user ID
	 * @param start the lower bound of the range of sub accounts
	 * @param end the upper bound of the range of sub accounts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SubAccount> findByMU(long mappingUserId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MU;
			finderArgs = new Object[] { mappingUserId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MU;
			finderArgs = new Object[] {
					mappingUserId,
					
					start, end, orderByComparator
				};
		}

		List<SubAccount> list = (List<SubAccount>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SubAccount subAccount : list) {
				if ((mappingUserId != subAccount.getMappingUserId())) {
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

			query.append(_SQL_SELECT_SUBACCOUNT_WHERE);

			query.append(_FINDER_COLUMN_MU_MAPPINGUSERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SubAccountModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mappingUserId);

				if (!pagination) {
					list = (List<SubAccount>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SubAccount>(list);
				}
				else {
					list = (List<SubAccount>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first sub account in the ordered set where mappingUserId = &#63;.
	 *
	 * @param mappingUserId the mapping user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sub account
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount findByMU_First(long mappingUserId,
		OrderByComparator orderByComparator)
		throws NoSuchSubAccountException, SystemException {
		SubAccount subAccount = fetchByMU_First(mappingUserId, orderByComparator);

		if (subAccount != null) {
			return subAccount;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mappingUserId=");
		msg.append(mappingUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSubAccountException(msg.toString());
	}

	/**
	 * Returns the first sub account in the ordered set where mappingUserId = &#63;.
	 *
	 * @param mappingUserId the mapping user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sub account, or <code>null</code> if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount fetchByMU_First(long mappingUserId,
		OrderByComparator orderByComparator) throws SystemException {
		List<SubAccount> list = findByMU(mappingUserId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sub account in the ordered set where mappingUserId = &#63;.
	 *
	 * @param mappingUserId the mapping user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sub account
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount findByMU_Last(long mappingUserId,
		OrderByComparator orderByComparator)
		throws NoSuchSubAccountException, SystemException {
		SubAccount subAccount = fetchByMU_Last(mappingUserId, orderByComparator);

		if (subAccount != null) {
			return subAccount;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mappingUserId=");
		msg.append(mappingUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSubAccountException(msg.toString());
	}

	/**
	 * Returns the last sub account in the ordered set where mappingUserId = &#63;.
	 *
	 * @param mappingUserId the mapping user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sub account, or <code>null</code> if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount fetchByMU_Last(long mappingUserId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMU(mappingUserId);

		if (count == 0) {
			return null;
		}

		List<SubAccount> list = findByMU(mappingUserId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sub accounts before and after the current sub account in the ordered set where mappingUserId = &#63;.
	 *
	 * @param subAccountId the primary key of the current sub account
	 * @param mappingUserId the mapping user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sub account
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount[] findByMU_PrevAndNext(long subAccountId,
		long mappingUserId, OrderByComparator orderByComparator)
		throws NoSuchSubAccountException, SystemException {
		SubAccount subAccount = findByPrimaryKey(subAccountId);

		Session session = null;

		try {
			session = openSession();

			SubAccount[] array = new SubAccountImpl[3];

			array[0] = getByMU_PrevAndNext(session, subAccount, mappingUserId,
					orderByComparator, true);

			array[1] = subAccount;

			array[2] = getByMU_PrevAndNext(session, subAccount, mappingUserId,
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

	protected SubAccount getByMU_PrevAndNext(Session session,
		SubAccount subAccount, long mappingUserId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SUBACCOUNT_WHERE);

		query.append(_FINDER_COLUMN_MU_MAPPINGUSERID_2);

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
			query.append(SubAccountModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mappingUserId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(subAccount);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SubAccount> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sub accounts where mappingUserId = &#63; from the database.
	 *
	 * @param mappingUserId the mapping user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMU(long mappingUserId) throws SystemException {
		for (SubAccount subAccount : findByMU(mappingUserId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(subAccount);
		}
	}

	/**
	 * Returns the number of sub accounts where mappingUserId = &#63;.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the number of matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMU(long mappingUserId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MU;

		Object[] finderArgs = new Object[] { mappingUserId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SUBACCOUNT_WHERE);

			query.append(_FINDER_COLUMN_MU_MAPPINGUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mappingUserId);

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

	private static final String _FINDER_COLUMN_MU_MAPPINGUSERID_2 = "subAccount.mappingUserId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_B_MU = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, SubAccountImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByB_MU",
			new String[] { Long.class.getName(), Long.class.getName() },
			SubAccountModelImpl.BUSINESSID_COLUMN_BITMASK |
			SubAccountModelImpl.MAPPINGUSERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_B_MU = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByB_MU",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the sub account where businessId = &#63; and mappingUserId = &#63; or throws a {@link org.oep.usermgt.NoSuchSubAccountException} if it could not be found.
	 *
	 * @param businessId the business ID
	 * @param mappingUserId the mapping user ID
	 * @return the matching sub account
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount findByB_MU(long businessId, long mappingUserId)
		throws NoSuchSubAccountException, SystemException {
		SubAccount subAccount = fetchByB_MU(businessId, mappingUserId);

		if (subAccount == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("businessId=");
			msg.append(businessId);

			msg.append(", mappingUserId=");
			msg.append(mappingUserId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchSubAccountException(msg.toString());
		}

		return subAccount;
	}

	/**
	 * Returns the sub account where businessId = &#63; and mappingUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param businessId the business ID
	 * @param mappingUserId the mapping user ID
	 * @return the matching sub account, or <code>null</code> if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount fetchByB_MU(long businessId, long mappingUserId)
		throws SystemException {
		return fetchByB_MU(businessId, mappingUserId, true);
	}

	/**
	 * Returns the sub account where businessId = &#63; and mappingUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param businessId the business ID
	 * @param mappingUserId the mapping user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching sub account, or <code>null</code> if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount fetchByB_MU(long businessId, long mappingUserId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { businessId, mappingUserId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_B_MU,
					finderArgs, this);
		}

		if (result instanceof SubAccount) {
			SubAccount subAccount = (SubAccount)result;

			if ((businessId != subAccount.getBusinessId()) ||
					(mappingUserId != subAccount.getMappingUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_SUBACCOUNT_WHERE);

			query.append(_FINDER_COLUMN_B_MU_BUSINESSID_2);

			query.append(_FINDER_COLUMN_B_MU_MAPPINGUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessId);

				qPos.add(mappingUserId);

				List<SubAccount> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_B_MU,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"SubAccountPersistenceImpl.fetchByB_MU(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					SubAccount subAccount = list.get(0);

					result = subAccount;

					cacheResult(subAccount);

					if ((subAccount.getBusinessId() != businessId) ||
							(subAccount.getMappingUserId() != mappingUserId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_B_MU,
							finderArgs, subAccount);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_B_MU,
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
			return (SubAccount)result;
		}
	}

	/**
	 * Removes the sub account where businessId = &#63; and mappingUserId = &#63; from the database.
	 *
	 * @param businessId the business ID
	 * @param mappingUserId the mapping user ID
	 * @return the sub account that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount removeByB_MU(long businessId, long mappingUserId)
		throws NoSuchSubAccountException, SystemException {
		SubAccount subAccount = findByB_MU(businessId, mappingUserId);

		return remove(subAccount);
	}

	/**
	 * Returns the number of sub accounts where businessId = &#63; and mappingUserId = &#63;.
	 *
	 * @param businessId the business ID
	 * @param mappingUserId the mapping user ID
	 * @return the number of matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByB_MU(long businessId, long mappingUserId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_B_MU;

		Object[] finderArgs = new Object[] { businessId, mappingUserId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SUBACCOUNT_WHERE);

			query.append(_FINDER_COLUMN_B_MU_BUSINESSID_2);

			query.append(_FINDER_COLUMN_B_MU_MAPPINGUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessId);

				qPos.add(mappingUserId);

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

	private static final String _FINDER_COLUMN_B_MU_BUSINESSID_2 = "subAccount.businessId = ? AND ";
	private static final String _FINDER_COLUMN_B_MU_MAPPINGUSERID_2 = "subAccount.mappingUserId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_B_WR = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, SubAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByB_WR",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B_WR = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, SubAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByB_WR",
			new String[] { Long.class.getName(), String.class.getName() },
			SubAccountModelImpl.BUSINESSID_COLUMN_BITMASK |
			SubAccountModelImpl.WORKINGROLE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_B_WR = new FinderPath(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByB_WR",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the sub accounts where businessId = &#63; and workingRole = &#63;.
	 *
	 * @param businessId the business ID
	 * @param workingRole the working role
	 * @return the matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SubAccount> findByB_WR(long businessId, String workingRole)
		throws SystemException {
		return findByB_WR(businessId, workingRole, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sub accounts where businessId = &#63; and workingRole = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param businessId the business ID
	 * @param workingRole the working role
	 * @param start the lower bound of the range of sub accounts
	 * @param end the upper bound of the range of sub accounts (not inclusive)
	 * @return the range of matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SubAccount> findByB_WR(long businessId, String workingRole,
		int start, int end) throws SystemException {
		return findByB_WR(businessId, workingRole, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sub accounts where businessId = &#63; and workingRole = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param businessId the business ID
	 * @param workingRole the working role
	 * @param start the lower bound of the range of sub accounts
	 * @param end the upper bound of the range of sub accounts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SubAccount> findByB_WR(long businessId, String workingRole,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B_WR;
			finderArgs = new Object[] { businessId, workingRole };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_B_WR;
			finderArgs = new Object[] {
					businessId, workingRole,
					
					start, end, orderByComparator
				};
		}

		List<SubAccount> list = (List<SubAccount>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SubAccount subAccount : list) {
				if ((businessId != subAccount.getBusinessId()) ||
						!Validator.equals(workingRole,
							subAccount.getWorkingRole())) {
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

			query.append(_SQL_SELECT_SUBACCOUNT_WHERE);

			query.append(_FINDER_COLUMN_B_WR_BUSINESSID_2);

			boolean bindWorkingRole = false;

			if (workingRole == null) {
				query.append(_FINDER_COLUMN_B_WR_WORKINGROLE_1);
			}
			else if (workingRole.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_B_WR_WORKINGROLE_3);
			}
			else {
				bindWorkingRole = true;

				query.append(_FINDER_COLUMN_B_WR_WORKINGROLE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SubAccountModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessId);

				if (bindWorkingRole) {
					qPos.add(workingRole);
				}

				if (!pagination) {
					list = (List<SubAccount>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SubAccount>(list);
				}
				else {
					list = (List<SubAccount>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first sub account in the ordered set where businessId = &#63; and workingRole = &#63;.
	 *
	 * @param businessId the business ID
	 * @param workingRole the working role
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sub account
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount findByB_WR_First(long businessId, String workingRole,
		OrderByComparator orderByComparator)
		throws NoSuchSubAccountException, SystemException {
		SubAccount subAccount = fetchByB_WR_First(businessId, workingRole,
				orderByComparator);

		if (subAccount != null) {
			return subAccount;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("businessId=");
		msg.append(businessId);

		msg.append(", workingRole=");
		msg.append(workingRole);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSubAccountException(msg.toString());
	}

	/**
	 * Returns the first sub account in the ordered set where businessId = &#63; and workingRole = &#63;.
	 *
	 * @param businessId the business ID
	 * @param workingRole the working role
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sub account, or <code>null</code> if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount fetchByB_WR_First(long businessId, String workingRole,
		OrderByComparator orderByComparator) throws SystemException {
		List<SubAccount> list = findByB_WR(businessId, workingRole, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sub account in the ordered set where businessId = &#63; and workingRole = &#63;.
	 *
	 * @param businessId the business ID
	 * @param workingRole the working role
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sub account
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount findByB_WR_Last(long businessId, String workingRole,
		OrderByComparator orderByComparator)
		throws NoSuchSubAccountException, SystemException {
		SubAccount subAccount = fetchByB_WR_Last(businessId, workingRole,
				orderByComparator);

		if (subAccount != null) {
			return subAccount;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("businessId=");
		msg.append(businessId);

		msg.append(", workingRole=");
		msg.append(workingRole);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSubAccountException(msg.toString());
	}

	/**
	 * Returns the last sub account in the ordered set where businessId = &#63; and workingRole = &#63;.
	 *
	 * @param businessId the business ID
	 * @param workingRole the working role
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sub account, or <code>null</code> if a matching sub account could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount fetchByB_WR_Last(long businessId, String workingRole,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByB_WR(businessId, workingRole);

		if (count == 0) {
			return null;
		}

		List<SubAccount> list = findByB_WR(businessId, workingRole, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sub accounts before and after the current sub account in the ordered set where businessId = &#63; and workingRole = &#63;.
	 *
	 * @param subAccountId the primary key of the current sub account
	 * @param businessId the business ID
	 * @param workingRole the working role
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sub account
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount[] findByB_WR_PrevAndNext(long subAccountId,
		long businessId, String workingRole, OrderByComparator orderByComparator)
		throws NoSuchSubAccountException, SystemException {
		SubAccount subAccount = findByPrimaryKey(subAccountId);

		Session session = null;

		try {
			session = openSession();

			SubAccount[] array = new SubAccountImpl[3];

			array[0] = getByB_WR_PrevAndNext(session, subAccount, businessId,
					workingRole, orderByComparator, true);

			array[1] = subAccount;

			array[2] = getByB_WR_PrevAndNext(session, subAccount, businessId,
					workingRole, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SubAccount getByB_WR_PrevAndNext(Session session,
		SubAccount subAccount, long businessId, String workingRole,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SUBACCOUNT_WHERE);

		query.append(_FINDER_COLUMN_B_WR_BUSINESSID_2);

		boolean bindWorkingRole = false;

		if (workingRole == null) {
			query.append(_FINDER_COLUMN_B_WR_WORKINGROLE_1);
		}
		else if (workingRole.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_B_WR_WORKINGROLE_3);
		}
		else {
			bindWorkingRole = true;

			query.append(_FINDER_COLUMN_B_WR_WORKINGROLE_2);
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
			query.append(SubAccountModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(businessId);

		if (bindWorkingRole) {
			qPos.add(workingRole);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(subAccount);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SubAccount> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sub accounts where businessId = &#63; and workingRole = &#63; from the database.
	 *
	 * @param businessId the business ID
	 * @param workingRole the working role
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByB_WR(long businessId, String workingRole)
		throws SystemException {
		for (SubAccount subAccount : findByB_WR(businessId, workingRole,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(subAccount);
		}
	}

	/**
	 * Returns the number of sub accounts where businessId = &#63; and workingRole = &#63;.
	 *
	 * @param businessId the business ID
	 * @param workingRole the working role
	 * @return the number of matching sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByB_WR(long businessId, String workingRole)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_B_WR;

		Object[] finderArgs = new Object[] { businessId, workingRole };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SUBACCOUNT_WHERE);

			query.append(_FINDER_COLUMN_B_WR_BUSINESSID_2);

			boolean bindWorkingRole = false;

			if (workingRole == null) {
				query.append(_FINDER_COLUMN_B_WR_WORKINGROLE_1);
			}
			else if (workingRole.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_B_WR_WORKINGROLE_3);
			}
			else {
				bindWorkingRole = true;

				query.append(_FINDER_COLUMN_B_WR_WORKINGROLE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessId);

				if (bindWorkingRole) {
					qPos.add(workingRole);
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

	private static final String _FINDER_COLUMN_B_WR_BUSINESSID_2 = "subAccount.businessId = ? AND ";
	private static final String _FINDER_COLUMN_B_WR_WORKINGROLE_1 = "subAccount.workingRole IS NULL";
	private static final String _FINDER_COLUMN_B_WR_WORKINGROLE_2 = "subAccount.workingRole = ?";
	private static final String _FINDER_COLUMN_B_WR_WORKINGROLE_3 = "(subAccount.workingRole IS NULL OR subAccount.workingRole = '')";

	public SubAccountPersistenceImpl() {
		setModelClass(SubAccount.class);
	}

	/**
	 * Caches the sub account in the entity cache if it is enabled.
	 *
	 * @param subAccount the sub account
	 */
	@Override
	public void cacheResult(SubAccount subAccount) {
		EntityCacheUtil.putResult(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountImpl.class, subAccount.getPrimaryKey(), subAccount);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_B_MU,
			new Object[] {
				subAccount.getBusinessId(), subAccount.getMappingUserId()
			}, subAccount);

		subAccount.resetOriginalValues();
	}

	/**
	 * Caches the sub accounts in the entity cache if it is enabled.
	 *
	 * @param subAccounts the sub accounts
	 */
	@Override
	public void cacheResult(List<SubAccount> subAccounts) {
		for (SubAccount subAccount : subAccounts) {
			if (EntityCacheUtil.getResult(
						SubAccountModelImpl.ENTITY_CACHE_ENABLED,
						SubAccountImpl.class, subAccount.getPrimaryKey()) == null) {
				cacheResult(subAccount);
			}
			else {
				subAccount.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sub accounts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SubAccountImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SubAccountImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sub account.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SubAccount subAccount) {
		EntityCacheUtil.removeResult(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountImpl.class, subAccount.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(subAccount);
	}

	@Override
	public void clearCache(List<SubAccount> subAccounts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SubAccount subAccount : subAccounts) {
			EntityCacheUtil.removeResult(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
				SubAccountImpl.class, subAccount.getPrimaryKey());

			clearUniqueFindersCache(subAccount);
		}
	}

	protected void cacheUniqueFindersCache(SubAccount subAccount) {
		if (subAccount.isNew()) {
			Object[] args = new Object[] {
					subAccount.getBusinessId(), subAccount.getMappingUserId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_B_MU, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_B_MU, args,
				subAccount);
		}
		else {
			SubAccountModelImpl subAccountModelImpl = (SubAccountModelImpl)subAccount;

			if ((subAccountModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_B_MU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						subAccount.getBusinessId(),
						subAccount.getMappingUserId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_B_MU, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_B_MU, args,
					subAccount);
			}
		}
	}

	protected void clearUniqueFindersCache(SubAccount subAccount) {
		SubAccountModelImpl subAccountModelImpl = (SubAccountModelImpl)subAccount;

		Object[] args = new Object[] {
				subAccount.getBusinessId(), subAccount.getMappingUserId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_B_MU, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_B_MU, args);

		if ((subAccountModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_B_MU.getColumnBitmask()) != 0) {
			args = new Object[] {
					subAccountModelImpl.getOriginalBusinessId(),
					subAccountModelImpl.getOriginalMappingUserId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_B_MU, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_B_MU, args);
		}
	}

	/**
	 * Creates a new sub account with the primary key. Does not add the sub account to the database.
	 *
	 * @param subAccountId the primary key for the new sub account
	 * @return the new sub account
	 */
	@Override
	public SubAccount create(long subAccountId) {
		SubAccount subAccount = new SubAccountImpl();

		subAccount.setNew(true);
		subAccount.setPrimaryKey(subAccountId);

		return subAccount;
	}

	/**
	 * Removes the sub account with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subAccountId the primary key of the sub account
	 * @return the sub account that was removed
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount remove(long subAccountId)
		throws NoSuchSubAccountException, SystemException {
		return remove((Serializable)subAccountId);
	}

	/**
	 * Removes the sub account with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sub account
	 * @return the sub account that was removed
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount remove(Serializable primaryKey)
		throws NoSuchSubAccountException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SubAccount subAccount = (SubAccount)session.get(SubAccountImpl.class,
					primaryKey);

			if (subAccount == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSubAccountException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(subAccount);
		}
		catch (NoSuchSubAccountException nsee) {
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
	protected SubAccount removeImpl(SubAccount subAccount)
		throws SystemException {
		subAccount = toUnwrappedModel(subAccount);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(subAccount)) {
				subAccount = (SubAccount)session.get(SubAccountImpl.class,
						subAccount.getPrimaryKeyObj());
			}

			if (subAccount != null) {
				session.delete(subAccount);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (subAccount != null) {
			clearCache(subAccount);
		}

		return subAccount;
	}

	@Override
	public SubAccount updateImpl(org.oep.usermgt.model.SubAccount subAccount)
		throws SystemException {
		subAccount = toUnwrappedModel(subAccount);

		boolean isNew = subAccount.isNew();

		SubAccountModelImpl subAccountModelImpl = (SubAccountModelImpl)subAccount;

		Session session = null;

		try {
			session = openSession();

			if (subAccount.isNew()) {
				session.save(subAccount);

				subAccount.setNew(false);
			}
			else {
				session.merge(subAccount);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SubAccountModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((subAccountModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						subAccountModelImpl.getOriginalBusinessId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_B, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B,
					args);

				args = new Object[] { subAccountModelImpl.getBusinessId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_B, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B,
					args);
			}

			if ((subAccountModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						subAccountModelImpl.getOriginalMappingUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MU, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MU,
					args);

				args = new Object[] { subAccountModelImpl.getMappingUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MU, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MU,
					args);
			}

			if ((subAccountModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B_WR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						subAccountModelImpl.getOriginalBusinessId(),
						subAccountModelImpl.getOriginalWorkingRole()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_B_WR, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B_WR,
					args);

				args = new Object[] {
						subAccountModelImpl.getBusinessId(),
						subAccountModelImpl.getWorkingRole()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_B_WR, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B_WR,
					args);
			}
		}

		EntityCacheUtil.putResult(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
			SubAccountImpl.class, subAccount.getPrimaryKey(), subAccount);

		clearUniqueFindersCache(subAccount);
		cacheUniqueFindersCache(subAccount);

		return subAccount;
	}

	protected SubAccount toUnwrappedModel(SubAccount subAccount) {
		if (subAccount instanceof SubAccountImpl) {
			return subAccount;
		}

		SubAccountImpl subAccountImpl = new SubAccountImpl();

		subAccountImpl.setNew(subAccount.isNew());
		subAccountImpl.setPrimaryKey(subAccount.getPrimaryKey());

		subAccountImpl.setSubAccountId(subAccount.getSubAccountId());
		subAccountImpl.setCompanyId(subAccount.getCompanyId());
		subAccountImpl.setGroupId(subAccount.getGroupId());
		subAccountImpl.setUserId(subAccount.getUserId());
		subAccountImpl.setCreateDate(subAccount.getCreateDate());
		subAccountImpl.setModifiedDate(subAccount.getModifiedDate());
		subAccountImpl.setBusinessId(subAccount.getBusinessId());
		subAccountImpl.setMappingUserId(subAccount.getMappingUserId());
		subAccountImpl.setFullName(subAccount.getFullName());
		subAccountImpl.setShortName(subAccount.getShortName());
		subAccountImpl.setWorkingRole(subAccount.getWorkingRole());
		subAccountImpl.setTelNo(subAccount.getTelNo());
		subAccountImpl.setMobile(subAccount.getMobile());
		subAccountImpl.setEmail(subAccount.getEmail());

		return subAccountImpl;
	}

	/**
	 * Returns the sub account with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sub account
	 * @return the sub account
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSubAccountException, SystemException {
		SubAccount subAccount = fetchByPrimaryKey(primaryKey);

		if (subAccount == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSubAccountException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return subAccount;
	}

	/**
	 * Returns the sub account with the primary key or throws a {@link org.oep.usermgt.NoSuchSubAccountException} if it could not be found.
	 *
	 * @param subAccountId the primary key of the sub account
	 * @return the sub account
	 * @throws org.oep.usermgt.NoSuchSubAccountException if a sub account with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount findByPrimaryKey(long subAccountId)
		throws NoSuchSubAccountException, SystemException {
		return findByPrimaryKey((Serializable)subAccountId);
	}

	/**
	 * Returns the sub account with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sub account
	 * @return the sub account, or <code>null</code> if a sub account with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		SubAccount subAccount = (SubAccount)EntityCacheUtil.getResult(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
				SubAccountImpl.class, primaryKey);

		if (subAccount == _nullSubAccount) {
			return null;
		}

		if (subAccount == null) {
			Session session = null;

			try {
				session = openSession();

				subAccount = (SubAccount)session.get(SubAccountImpl.class,
						primaryKey);

				if (subAccount != null) {
					cacheResult(subAccount);
				}
				else {
					EntityCacheUtil.putResult(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
						SubAccountImpl.class, primaryKey, _nullSubAccount);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SubAccountModelImpl.ENTITY_CACHE_ENABLED,
					SubAccountImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return subAccount;
	}

	/**
	 * Returns the sub account with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subAccountId the primary key of the sub account
	 * @return the sub account, or <code>null</code> if a sub account with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SubAccount fetchByPrimaryKey(long subAccountId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)subAccountId);
	}

	/**
	 * Returns all the sub accounts.
	 *
	 * @return the sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SubAccount> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sub accounts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sub accounts
	 * @param end the upper bound of the range of sub accounts (not inclusive)
	 * @return the range of sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SubAccount> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sub accounts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sub accounts
	 * @param end the upper bound of the range of sub accounts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sub accounts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SubAccount> findAll(int start, int end,
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

		List<SubAccount> list = (List<SubAccount>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SUBACCOUNT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUBACCOUNT;

				if (pagination) {
					sql = sql.concat(SubAccountModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SubAccount>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SubAccount>(list);
				}
				else {
					list = (List<SubAccount>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the sub accounts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SubAccount subAccount : findAll()) {
			remove(subAccount);
		}
	}

	/**
	 * Returns the number of sub accounts.
	 *
	 * @return the number of sub accounts
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

				Query q = session.createQuery(_SQL_COUNT_SUBACCOUNT);

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
	 * Initializes the sub account persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.usermgt.model.SubAccount")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SubAccount>> listenersList = new ArrayList<ModelListener<SubAccount>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SubAccount>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SubAccountImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SUBACCOUNT = "SELECT subAccount FROM SubAccount subAccount";
	private static final String _SQL_SELECT_SUBACCOUNT_WHERE = "SELECT subAccount FROM SubAccount subAccount WHERE ";
	private static final String _SQL_COUNT_SUBACCOUNT = "SELECT COUNT(subAccount) FROM SubAccount subAccount";
	private static final String _SQL_COUNT_SUBACCOUNT_WHERE = "SELECT COUNT(subAccount) FROM SubAccount subAccount WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "subAccount.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SubAccount exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SubAccount exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SubAccountPersistenceImpl.class);
	private static SubAccount _nullSubAccount = new SubAccountImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SubAccount> toCacheModel() {
				return _nullSubAccountCacheModel;
			}
		};

	private static CacheModel<SubAccount> _nullSubAccountCacheModel = new CacheModel<SubAccount>() {
			@Override
			public SubAccount toEntityModel() {
				return _nullSubAccount;
			}
		};
}