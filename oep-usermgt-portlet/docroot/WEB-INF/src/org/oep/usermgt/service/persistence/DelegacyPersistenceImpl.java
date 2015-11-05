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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.usermgt.NoSuchDelegacyException;
import org.oep.usermgt.model.Delegacy;
import org.oep.usermgt.model.impl.DelegacyImpl;
import org.oep.usermgt.model.impl.DelegacyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the delegacy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see DelegacyPersistence
 * @see DelegacyUtil
 * @generated
 */
public class DelegacyPersistenceImpl extends BasePersistenceImpl<Delegacy>
	implements DelegacyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DelegacyUtil} to access the delegacy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DelegacyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyModelImpl.FINDER_CACHE_ENABLED, DelegacyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyModelImpl.FINDER_CACHE_ENABLED, DelegacyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FE = new FinderPath(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyModelImpl.FINDER_CACHE_ENABLED, DelegacyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFE",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FE = new FinderPath(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyModelImpl.FINDER_CACHE_ENABLED, DelegacyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFE",
			new String[] { Long.class.getName() },
			DelegacyModelImpl.FROMEMPLOYEEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FE = new FinderPath(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFE",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the delegacies where fromEmployeeId = &#63;.
	 *
	 * @param fromEmployeeId the from employee ID
	 * @return the matching delegacies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Delegacy> findByFE(long fromEmployeeId)
		throws SystemException {
		return findByFE(fromEmployeeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the delegacies where fromEmployeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fromEmployeeId the from employee ID
	 * @param start the lower bound of the range of delegacies
	 * @param end the upper bound of the range of delegacies (not inclusive)
	 * @return the range of matching delegacies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Delegacy> findByFE(long fromEmployeeId, int start, int end)
		throws SystemException {
		return findByFE(fromEmployeeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the delegacies where fromEmployeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fromEmployeeId the from employee ID
	 * @param start the lower bound of the range of delegacies
	 * @param end the upper bound of the range of delegacies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching delegacies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Delegacy> findByFE(long fromEmployeeId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FE;
			finderArgs = new Object[] { fromEmployeeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FE;
			finderArgs = new Object[] {
					fromEmployeeId,
					
					start, end, orderByComparator
				};
		}

		List<Delegacy> list = (List<Delegacy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Delegacy delegacy : list) {
				if ((fromEmployeeId != delegacy.getFromEmployeeId())) {
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

			query.append(_SQL_SELECT_DELEGACY_WHERE);

			query.append(_FINDER_COLUMN_FE_FROMEMPLOYEEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DelegacyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fromEmployeeId);

				if (!pagination) {
					list = (List<Delegacy>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Delegacy>(list);
				}
				else {
					list = (List<Delegacy>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first delegacy in the ordered set where fromEmployeeId = &#63;.
	 *
	 * @param fromEmployeeId the from employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching delegacy
	 * @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy findByFE_First(long fromEmployeeId,
		OrderByComparator orderByComparator)
		throws NoSuchDelegacyException, SystemException {
		Delegacy delegacy = fetchByFE_First(fromEmployeeId, orderByComparator);

		if (delegacy != null) {
			return delegacy;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fromEmployeeId=");
		msg.append(fromEmployeeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDelegacyException(msg.toString());
	}

	/**
	 * Returns the first delegacy in the ordered set where fromEmployeeId = &#63;.
	 *
	 * @param fromEmployeeId the from employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching delegacy, or <code>null</code> if a matching delegacy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy fetchByFE_First(long fromEmployeeId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Delegacy> list = findByFE(fromEmployeeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last delegacy in the ordered set where fromEmployeeId = &#63;.
	 *
	 * @param fromEmployeeId the from employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching delegacy
	 * @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy findByFE_Last(long fromEmployeeId,
		OrderByComparator orderByComparator)
		throws NoSuchDelegacyException, SystemException {
		Delegacy delegacy = fetchByFE_Last(fromEmployeeId, orderByComparator);

		if (delegacy != null) {
			return delegacy;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fromEmployeeId=");
		msg.append(fromEmployeeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDelegacyException(msg.toString());
	}

	/**
	 * Returns the last delegacy in the ordered set where fromEmployeeId = &#63;.
	 *
	 * @param fromEmployeeId the from employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching delegacy, or <code>null</code> if a matching delegacy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy fetchByFE_Last(long fromEmployeeId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFE(fromEmployeeId);

		if (count == 0) {
			return null;
		}

		List<Delegacy> list = findByFE(fromEmployeeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the delegacies before and after the current delegacy in the ordered set where fromEmployeeId = &#63;.
	 *
	 * @param delegacyId the primary key of the current delegacy
	 * @param fromEmployeeId the from employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next delegacy
	 * @throws org.oep.usermgt.NoSuchDelegacyException if a delegacy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy[] findByFE_PrevAndNext(long delegacyId,
		long fromEmployeeId, OrderByComparator orderByComparator)
		throws NoSuchDelegacyException, SystemException {
		Delegacy delegacy = findByPrimaryKey(delegacyId);

		Session session = null;

		try {
			session = openSession();

			Delegacy[] array = new DelegacyImpl[3];

			array[0] = getByFE_PrevAndNext(session, delegacy, fromEmployeeId,
					orderByComparator, true);

			array[1] = delegacy;

			array[2] = getByFE_PrevAndNext(session, delegacy, fromEmployeeId,
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

	protected Delegacy getByFE_PrevAndNext(Session session, Delegacy delegacy,
		long fromEmployeeId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DELEGACY_WHERE);

		query.append(_FINDER_COLUMN_FE_FROMEMPLOYEEID_2);

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
			query.append(DelegacyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(fromEmployeeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(delegacy);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Delegacy> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the delegacies where fromEmployeeId = &#63; from the database.
	 *
	 * @param fromEmployeeId the from employee ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByFE(long fromEmployeeId) throws SystemException {
		for (Delegacy delegacy : findByFE(fromEmployeeId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(delegacy);
		}
	}

	/**
	 * Returns the number of delegacies where fromEmployeeId = &#63;.
	 *
	 * @param fromEmployeeId the from employee ID
	 * @return the number of matching delegacies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByFE(long fromEmployeeId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FE;

		Object[] finderArgs = new Object[] { fromEmployeeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DELEGACY_WHERE);

			query.append(_FINDER_COLUMN_FE_FROMEMPLOYEEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fromEmployeeId);

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

	private static final String _FINDER_COLUMN_FE_FROMEMPLOYEEID_2 = "delegacy.fromEmployeeId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TE = new FinderPath(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyModelImpl.FINDER_CACHE_ENABLED, DelegacyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTE",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TE = new FinderPath(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyModelImpl.FINDER_CACHE_ENABLED, DelegacyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTE",
			new String[] { Long.class.getName() },
			DelegacyModelImpl.TOEMPLOYEEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TE = new FinderPath(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTE",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the delegacies where toEmployeeId = &#63;.
	 *
	 * @param toEmployeeId the to employee ID
	 * @return the matching delegacies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Delegacy> findByTE(long toEmployeeId) throws SystemException {
		return findByTE(toEmployeeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the delegacies where toEmployeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toEmployeeId the to employee ID
	 * @param start the lower bound of the range of delegacies
	 * @param end the upper bound of the range of delegacies (not inclusive)
	 * @return the range of matching delegacies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Delegacy> findByTE(long toEmployeeId, int start, int end)
		throws SystemException {
		return findByTE(toEmployeeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the delegacies where toEmployeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toEmployeeId the to employee ID
	 * @param start the lower bound of the range of delegacies
	 * @param end the upper bound of the range of delegacies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching delegacies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Delegacy> findByTE(long toEmployeeId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TE;
			finderArgs = new Object[] { toEmployeeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TE;
			finderArgs = new Object[] {
					toEmployeeId,
					
					start, end, orderByComparator
				};
		}

		List<Delegacy> list = (List<Delegacy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Delegacy delegacy : list) {
				if ((toEmployeeId != delegacy.getToEmployeeId())) {
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

			query.append(_SQL_SELECT_DELEGACY_WHERE);

			query.append(_FINDER_COLUMN_TE_TOEMPLOYEEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DelegacyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toEmployeeId);

				if (!pagination) {
					list = (List<Delegacy>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Delegacy>(list);
				}
				else {
					list = (List<Delegacy>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first delegacy in the ordered set where toEmployeeId = &#63;.
	 *
	 * @param toEmployeeId the to employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching delegacy
	 * @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy findByTE_First(long toEmployeeId,
		OrderByComparator orderByComparator)
		throws NoSuchDelegacyException, SystemException {
		Delegacy delegacy = fetchByTE_First(toEmployeeId, orderByComparator);

		if (delegacy != null) {
			return delegacy;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toEmployeeId=");
		msg.append(toEmployeeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDelegacyException(msg.toString());
	}

	/**
	 * Returns the first delegacy in the ordered set where toEmployeeId = &#63;.
	 *
	 * @param toEmployeeId the to employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching delegacy, or <code>null</code> if a matching delegacy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy fetchByTE_First(long toEmployeeId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Delegacy> list = findByTE(toEmployeeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last delegacy in the ordered set where toEmployeeId = &#63;.
	 *
	 * @param toEmployeeId the to employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching delegacy
	 * @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy findByTE_Last(long toEmployeeId,
		OrderByComparator orderByComparator)
		throws NoSuchDelegacyException, SystemException {
		Delegacy delegacy = fetchByTE_Last(toEmployeeId, orderByComparator);

		if (delegacy != null) {
			return delegacy;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toEmployeeId=");
		msg.append(toEmployeeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDelegacyException(msg.toString());
	}

	/**
	 * Returns the last delegacy in the ordered set where toEmployeeId = &#63;.
	 *
	 * @param toEmployeeId the to employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching delegacy, or <code>null</code> if a matching delegacy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy fetchByTE_Last(long toEmployeeId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTE(toEmployeeId);

		if (count == 0) {
			return null;
		}

		List<Delegacy> list = findByTE(toEmployeeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the delegacies before and after the current delegacy in the ordered set where toEmployeeId = &#63;.
	 *
	 * @param delegacyId the primary key of the current delegacy
	 * @param toEmployeeId the to employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next delegacy
	 * @throws org.oep.usermgt.NoSuchDelegacyException if a delegacy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy[] findByTE_PrevAndNext(long delegacyId, long toEmployeeId,
		OrderByComparator orderByComparator)
		throws NoSuchDelegacyException, SystemException {
		Delegacy delegacy = findByPrimaryKey(delegacyId);

		Session session = null;

		try {
			session = openSession();

			Delegacy[] array = new DelegacyImpl[3];

			array[0] = getByTE_PrevAndNext(session, delegacy, toEmployeeId,
					orderByComparator, true);

			array[1] = delegacy;

			array[2] = getByTE_PrevAndNext(session, delegacy, toEmployeeId,
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

	protected Delegacy getByTE_PrevAndNext(Session session, Delegacy delegacy,
		long toEmployeeId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DELEGACY_WHERE);

		query.append(_FINDER_COLUMN_TE_TOEMPLOYEEID_2);

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
			query.append(DelegacyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(toEmployeeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(delegacy);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Delegacy> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the delegacies where toEmployeeId = &#63; from the database.
	 *
	 * @param toEmployeeId the to employee ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTE(long toEmployeeId) throws SystemException {
		for (Delegacy delegacy : findByTE(toEmployeeId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(delegacy);
		}
	}

	/**
	 * Returns the number of delegacies where toEmployeeId = &#63;.
	 *
	 * @param toEmployeeId the to employee ID
	 * @return the number of matching delegacies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTE(long toEmployeeId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TE;

		Object[] finderArgs = new Object[] { toEmployeeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DELEGACY_WHERE);

			query.append(_FINDER_COLUMN_TE_TOEMPLOYEEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toEmployeeId);

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

	private static final String _FINDER_COLUMN_TE_TOEMPLOYEEID_2 = "delegacy.toEmployeeId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_TE_R = new FinderPath(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyModelImpl.FINDER_CACHE_ENABLED, DelegacyImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByTE_R",
			new String[] { Long.class.getName(), Long.class.getName() },
			DelegacyModelImpl.TOEMPLOYEEID_COLUMN_BITMASK |
			DelegacyModelImpl.ROLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TE_R = new FinderPath(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTE_R",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the delegacy where toEmployeeId = &#63; and roleId = &#63; or throws a {@link org.oep.usermgt.NoSuchDelegacyException} if it could not be found.
	 *
	 * @param toEmployeeId the to employee ID
	 * @param roleId the role ID
	 * @return the matching delegacy
	 * @throws org.oep.usermgt.NoSuchDelegacyException if a matching delegacy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy findByTE_R(long toEmployeeId, long roleId)
		throws NoSuchDelegacyException, SystemException {
		Delegacy delegacy = fetchByTE_R(toEmployeeId, roleId);

		if (delegacy == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("toEmployeeId=");
			msg.append(toEmployeeId);

			msg.append(", roleId=");
			msg.append(roleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDelegacyException(msg.toString());
		}

		return delegacy;
	}

	/**
	 * Returns the delegacy where toEmployeeId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param toEmployeeId the to employee ID
	 * @param roleId the role ID
	 * @return the matching delegacy, or <code>null</code> if a matching delegacy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy fetchByTE_R(long toEmployeeId, long roleId)
		throws SystemException {
		return fetchByTE_R(toEmployeeId, roleId, true);
	}

	/**
	 * Returns the delegacy where toEmployeeId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param toEmployeeId the to employee ID
	 * @param roleId the role ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching delegacy, or <code>null</code> if a matching delegacy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy fetchByTE_R(long toEmployeeId, long roleId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { toEmployeeId, roleId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TE_R,
					finderArgs, this);
		}

		if (result instanceof Delegacy) {
			Delegacy delegacy = (Delegacy)result;

			if ((toEmployeeId != delegacy.getToEmployeeId()) ||
					(roleId != delegacy.getRoleId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DELEGACY_WHERE);

			query.append(_FINDER_COLUMN_TE_R_TOEMPLOYEEID_2);

			query.append(_FINDER_COLUMN_TE_R_ROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toEmployeeId);

				qPos.add(roleId);

				List<Delegacy> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TE_R,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DelegacyPersistenceImpl.fetchByTE_R(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Delegacy delegacy = list.get(0);

					result = delegacy;

					cacheResult(delegacy);

					if ((delegacy.getToEmployeeId() != toEmployeeId) ||
							(delegacy.getRoleId() != roleId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TE_R,
							finderArgs, delegacy);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TE_R,
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
			return (Delegacy)result;
		}
	}

	/**
	 * Removes the delegacy where toEmployeeId = &#63; and roleId = &#63; from the database.
	 *
	 * @param toEmployeeId the to employee ID
	 * @param roleId the role ID
	 * @return the delegacy that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy removeByTE_R(long toEmployeeId, long roleId)
		throws NoSuchDelegacyException, SystemException {
		Delegacy delegacy = findByTE_R(toEmployeeId, roleId);

		return remove(delegacy);
	}

	/**
	 * Returns the number of delegacies where toEmployeeId = &#63; and roleId = &#63;.
	 *
	 * @param toEmployeeId the to employee ID
	 * @param roleId the role ID
	 * @return the number of matching delegacies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTE_R(long toEmployeeId, long roleId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TE_R;

		Object[] finderArgs = new Object[] { toEmployeeId, roleId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DELEGACY_WHERE);

			query.append(_FINDER_COLUMN_TE_R_TOEMPLOYEEID_2);

			query.append(_FINDER_COLUMN_TE_R_ROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toEmployeeId);

				qPos.add(roleId);

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

	private static final String _FINDER_COLUMN_TE_R_TOEMPLOYEEID_2 = "delegacy.toEmployeeId = ? AND ";
	private static final String _FINDER_COLUMN_TE_R_ROLEID_2 = "delegacy.roleId = ?";

	public DelegacyPersistenceImpl() {
		setModelClass(Delegacy.class);
	}

	/**
	 * Caches the delegacy in the entity cache if it is enabled.
	 *
	 * @param delegacy the delegacy
	 */
	@Override
	public void cacheResult(Delegacy delegacy) {
		EntityCacheUtil.putResult(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyImpl.class, delegacy.getPrimaryKey(), delegacy);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TE_R,
			new Object[] { delegacy.getToEmployeeId(), delegacy.getRoleId() },
			delegacy);

		delegacy.resetOriginalValues();
	}

	/**
	 * Caches the delegacies in the entity cache if it is enabled.
	 *
	 * @param delegacies the delegacies
	 */
	@Override
	public void cacheResult(List<Delegacy> delegacies) {
		for (Delegacy delegacy : delegacies) {
			if (EntityCacheUtil.getResult(
						DelegacyModelImpl.ENTITY_CACHE_ENABLED,
						DelegacyImpl.class, delegacy.getPrimaryKey()) == null) {
				cacheResult(delegacy);
			}
			else {
				delegacy.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all delegacies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DelegacyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DelegacyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the delegacy.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Delegacy delegacy) {
		EntityCacheUtil.removeResult(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyImpl.class, delegacy.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(delegacy);
	}

	@Override
	public void clearCache(List<Delegacy> delegacies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Delegacy delegacy : delegacies) {
			EntityCacheUtil.removeResult(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
				DelegacyImpl.class, delegacy.getPrimaryKey());

			clearUniqueFindersCache(delegacy);
		}
	}

	protected void cacheUniqueFindersCache(Delegacy delegacy) {
		if (delegacy.isNew()) {
			Object[] args = new Object[] {
					delegacy.getToEmployeeId(), delegacy.getRoleId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TE_R, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TE_R, args, delegacy);
		}
		else {
			DelegacyModelImpl delegacyModelImpl = (DelegacyModelImpl)delegacy;

			if ((delegacyModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TE_R.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						delegacy.getToEmployeeId(), delegacy.getRoleId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TE_R, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TE_R, args,
					delegacy);
			}
		}
	}

	protected void clearUniqueFindersCache(Delegacy delegacy) {
		DelegacyModelImpl delegacyModelImpl = (DelegacyModelImpl)delegacy;

		Object[] args = new Object[] {
				delegacy.getToEmployeeId(), delegacy.getRoleId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TE_R, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TE_R, args);

		if ((delegacyModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TE_R.getColumnBitmask()) != 0) {
			args = new Object[] {
					delegacyModelImpl.getOriginalToEmployeeId(),
					delegacyModelImpl.getOriginalRoleId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TE_R, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TE_R, args);
		}
	}

	/**
	 * Creates a new delegacy with the primary key. Does not add the delegacy to the database.
	 *
	 * @param delegacyId the primary key for the new delegacy
	 * @return the new delegacy
	 */
	@Override
	public Delegacy create(long delegacyId) {
		Delegacy delegacy = new DelegacyImpl();

		delegacy.setNew(true);
		delegacy.setPrimaryKey(delegacyId);

		return delegacy;
	}

	/**
	 * Removes the delegacy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param delegacyId the primary key of the delegacy
	 * @return the delegacy that was removed
	 * @throws org.oep.usermgt.NoSuchDelegacyException if a delegacy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy remove(long delegacyId)
		throws NoSuchDelegacyException, SystemException {
		return remove((Serializable)delegacyId);
	}

	/**
	 * Removes the delegacy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the delegacy
	 * @return the delegacy that was removed
	 * @throws org.oep.usermgt.NoSuchDelegacyException if a delegacy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy remove(Serializable primaryKey)
		throws NoSuchDelegacyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Delegacy delegacy = (Delegacy)session.get(DelegacyImpl.class,
					primaryKey);

			if (delegacy == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDelegacyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(delegacy);
		}
		catch (NoSuchDelegacyException nsee) {
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
	protected Delegacy removeImpl(Delegacy delegacy) throws SystemException {
		delegacy = toUnwrappedModel(delegacy);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(delegacy)) {
				delegacy = (Delegacy)session.get(DelegacyImpl.class,
						delegacy.getPrimaryKeyObj());
			}

			if (delegacy != null) {
				session.delete(delegacy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (delegacy != null) {
			clearCache(delegacy);
		}

		return delegacy;
	}

	@Override
	public Delegacy updateImpl(org.oep.usermgt.model.Delegacy delegacy)
		throws SystemException {
		delegacy = toUnwrappedModel(delegacy);

		boolean isNew = delegacy.isNew();

		DelegacyModelImpl delegacyModelImpl = (DelegacyModelImpl)delegacy;

		Session session = null;

		try {
			session = openSession();

			if (delegacy.isNew()) {
				session.save(delegacy);

				delegacy.setNew(false);
			}
			else {
				session.merge(delegacy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DelegacyModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((delegacyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						delegacyModelImpl.getOriginalFromEmployeeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FE,
					args);

				args = new Object[] { delegacyModelImpl.getFromEmployeeId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FE,
					args);
			}

			if ((delegacyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						delegacyModelImpl.getOriginalToEmployeeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TE,
					args);

				args = new Object[] { delegacyModelImpl.getToEmployeeId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TE,
					args);
			}
		}

		EntityCacheUtil.putResult(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
			DelegacyImpl.class, delegacy.getPrimaryKey(), delegacy);

		clearUniqueFindersCache(delegacy);
		cacheUniqueFindersCache(delegacy);

		return delegacy;
	}

	protected Delegacy toUnwrappedModel(Delegacy delegacy) {
		if (delegacy instanceof DelegacyImpl) {
			return delegacy;
		}

		DelegacyImpl delegacyImpl = new DelegacyImpl();

		delegacyImpl.setNew(delegacy.isNew());
		delegacyImpl.setPrimaryKey(delegacy.getPrimaryKey());

		delegacyImpl.setDelegacyId(delegacy.getDelegacyId());
		delegacyImpl.setCompanyId(delegacy.getCompanyId());
		delegacyImpl.setGroupId(delegacy.getGroupId());
		delegacyImpl.setUserId(delegacy.getUserId());
		delegacyImpl.setCreateDate(delegacy.getCreateDate());
		delegacyImpl.setFromEmployeeId(delegacy.getFromEmployeeId());
		delegacyImpl.setToEmployeeId(delegacy.getToEmployeeId());
		delegacyImpl.setRoleId(delegacy.getRoleId());

		return delegacyImpl;
	}

	/**
	 * Returns the delegacy with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the delegacy
	 * @return the delegacy
	 * @throws org.oep.usermgt.NoSuchDelegacyException if a delegacy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDelegacyException, SystemException {
		Delegacy delegacy = fetchByPrimaryKey(primaryKey);

		if (delegacy == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDelegacyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return delegacy;
	}

	/**
	 * Returns the delegacy with the primary key or throws a {@link org.oep.usermgt.NoSuchDelegacyException} if it could not be found.
	 *
	 * @param delegacyId the primary key of the delegacy
	 * @return the delegacy
	 * @throws org.oep.usermgt.NoSuchDelegacyException if a delegacy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy findByPrimaryKey(long delegacyId)
		throws NoSuchDelegacyException, SystemException {
		return findByPrimaryKey((Serializable)delegacyId);
	}

	/**
	 * Returns the delegacy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the delegacy
	 * @return the delegacy, or <code>null</code> if a delegacy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Delegacy delegacy = (Delegacy)EntityCacheUtil.getResult(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
				DelegacyImpl.class, primaryKey);

		if (delegacy == _nullDelegacy) {
			return null;
		}

		if (delegacy == null) {
			Session session = null;

			try {
				session = openSession();

				delegacy = (Delegacy)session.get(DelegacyImpl.class, primaryKey);

				if (delegacy != null) {
					cacheResult(delegacy);
				}
				else {
					EntityCacheUtil.putResult(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
						DelegacyImpl.class, primaryKey, _nullDelegacy);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DelegacyModelImpl.ENTITY_CACHE_ENABLED,
					DelegacyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return delegacy;
	}

	/**
	 * Returns the delegacy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param delegacyId the primary key of the delegacy
	 * @return the delegacy, or <code>null</code> if a delegacy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Delegacy fetchByPrimaryKey(long delegacyId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)delegacyId);
	}

	/**
	 * Returns all the delegacies.
	 *
	 * @return the delegacies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Delegacy> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the delegacies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of delegacies
	 * @param end the upper bound of the range of delegacies (not inclusive)
	 * @return the range of delegacies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Delegacy> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the delegacies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.DelegacyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of delegacies
	 * @param end the upper bound of the range of delegacies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of delegacies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Delegacy> findAll(int start, int end,
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

		List<Delegacy> list = (List<Delegacy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DELEGACY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DELEGACY;

				if (pagination) {
					sql = sql.concat(DelegacyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Delegacy>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Delegacy>(list);
				}
				else {
					list = (List<Delegacy>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the delegacies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Delegacy delegacy : findAll()) {
			remove(delegacy);
		}
	}

	/**
	 * Returns the number of delegacies.
	 *
	 * @return the number of delegacies
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

				Query q = session.createQuery(_SQL_COUNT_DELEGACY);

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
	 * Initializes the delegacy persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.usermgt.model.Delegacy")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Delegacy>> listenersList = new ArrayList<ModelListener<Delegacy>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Delegacy>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DelegacyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DELEGACY = "SELECT delegacy FROM Delegacy delegacy";
	private static final String _SQL_SELECT_DELEGACY_WHERE = "SELECT delegacy FROM Delegacy delegacy WHERE ";
	private static final String _SQL_COUNT_DELEGACY = "SELECT COUNT(delegacy) FROM Delegacy delegacy";
	private static final String _SQL_COUNT_DELEGACY_WHERE = "SELECT COUNT(delegacy) FROM Delegacy delegacy WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "delegacy.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Delegacy exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Delegacy exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DelegacyPersistenceImpl.class);
	private static Delegacy _nullDelegacy = new DelegacyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Delegacy> toCacheModel() {
				return _nullDelegacyCacheModel;
			}
		};

	private static CacheModel<Delegacy> _nullDelegacyCacheModel = new CacheModel<Delegacy>() {
			@Override
			public Delegacy toEntityModel() {
				return _nullDelegacy;
			}
		};
}