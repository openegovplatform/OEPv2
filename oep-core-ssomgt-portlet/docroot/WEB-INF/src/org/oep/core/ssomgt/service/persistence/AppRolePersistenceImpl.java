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

package org.oep.core.ssomgt.service.persistence;

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

import org.oep.core.ssomgt.NoSuchAppRoleException;
import org.oep.core.ssomgt.model.AppRole;
import org.oep.core.ssomgt.model.impl.AppRoleImpl;
import org.oep.core.ssomgt.model.impl.AppRoleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the app role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see AppRolePersistence
 * @see AppRoleUtil
 * @generated
 */
public class AppRolePersistenceImpl extends BasePersistenceImpl<AppRole>
	implements AppRolePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AppRoleUtil} to access the app role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AppRoleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleModelImpl.FINDER_CACHE_ENABLED, AppRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleModelImpl.FINDER_CACHE_ENABLED, AppRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C = new FinderPath(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleModelImpl.FINDER_CACHE_ENABLED, AppRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C = new FinderPath(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleModelImpl.FINDER_CACHE_ENABLED, AppRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC",
			new String[] { Long.class.getName() },
			AppRoleModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the app roles where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole> findByC(long companyId) throws SystemException {
		return findByC(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app roles where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of app roles
	 * @param end the upper bound of the range of app roles (not inclusive)
	 * @return the range of matching app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole> findByC(long companyId, int start, int end)
		throws SystemException {
		return findByC(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app roles where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of app roles
	 * @param end the upper bound of the range of app roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole> findByC(long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<AppRole> list = (List<AppRole>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole appRole : list) {
				if ((companyId != appRole.getCompanyId())) {
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

			query.append(_SQL_SELECT_APPROLE_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<AppRole>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole>(list);
				}
				else {
					list = (List<AppRole>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first app role in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole findByC_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRoleException, SystemException {
		AppRole appRole = fetchByC_First(companyId, orderByComparator);

		if (appRole != null) {
			return appRole;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRoleException(msg.toString());
	}

	/**
	 * Returns the first app role in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role, or <code>null</code> if a matching app role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole fetchByC_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AppRole> list = findByC(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app role in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole findByC_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRoleException, SystemException {
		AppRole appRole = fetchByC_Last(companyId, orderByComparator);

		if (appRole != null) {
			return appRole;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRoleException(msg.toString());
	}

	/**
	 * Returns the last app role in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role, or <code>null</code> if a matching app role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole fetchByC_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC(companyId);

		if (count == 0) {
			return null;
		}

		List<AppRole> list = findByC(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app roles before and after the current app role in the ordered set where companyId = &#63;.
	 *
	 * @param appRoleId the primary key of the current app role
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app role
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole[] findByC_PrevAndNext(long appRoleId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRoleException, SystemException {
		AppRole appRole = findByPrimaryKey(appRoleId);

		Session session = null;

		try {
			session = openSession();

			AppRole[] array = new AppRoleImpl[3];

			array[0] = getByC_PrevAndNext(session, appRole, companyId,
					orderByComparator, true);

			array[1] = appRole;

			array[2] = getByC_PrevAndNext(session, appRole, companyId,
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

	protected AppRole getByC_PrevAndNext(Session session, AppRole appRole,
		long companyId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPROLE_WHERE);

		query.append(_FINDER_COLUMN_C_COMPANYID_2);

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
			query.append(AppRoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appRole);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppRole> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app roles where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC(long companyId) throws SystemException {
		for (AppRole appRole : findByC(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(appRole);
		}
	}

	/**
	 * Returns the number of app roles where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC(long companyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_APPROLE_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_C_COMPANYID_2 = "appRole.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G = new FinderPath(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleModelImpl.FINDER_CACHE_ENABLED, AppRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G = new FinderPath(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleModelImpl.FINDER_CACHE_ENABLED, AppRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			AppRoleModelImpl.COMPANYID_COLUMN_BITMASK |
			AppRoleModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the app roles where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole> findByC_G(long companyId, long groupId)
		throws SystemException {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app roles where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of app roles
	 * @param end the upper bound of the range of app roles (not inclusive)
	 * @return the range of matching app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole> findByC_G(long companyId, long groupId, int start,
		int end) throws SystemException {
		return findByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app roles where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of app roles
	 * @param end the upper bound of the range of app roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole> findByC_G(long companyId, long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G;
			finderArgs = new Object[] { companyId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G;
			finderArgs = new Object[] {
					companyId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<AppRole> list = (List<AppRole>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole appRole : list) {
				if ((companyId != appRole.getCompanyId()) ||
						(groupId != appRole.getGroupId())) {
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

			query.append(_SQL_SELECT_APPROLE_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<AppRole>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole>(list);
				}
				else {
					list = (List<AppRole>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first app role in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole findByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRoleException, SystemException {
		AppRole appRole = fetchByC_G_First(companyId, groupId, orderByComparator);

		if (appRole != null) {
			return appRole;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRoleException(msg.toString());
	}

	/**
	 * Returns the first app role in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role, or <code>null</code> if a matching app role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole fetchByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AppRole> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app role in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole findByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRoleException, SystemException {
		AppRole appRole = fetchByC_G_Last(companyId, groupId, orderByComparator);

		if (appRole != null) {
			return appRole;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRoleException(msg.toString());
	}

	/**
	 * Returns the last app role in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role, or <code>null</code> if a matching app role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole fetchByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_G(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<AppRole> list = findByC_G(companyId, groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app roles before and after the current app role in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param appRoleId the primary key of the current app role
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app role
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole[] findByC_G_PrevAndNext(long appRoleId, long companyId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchAppRoleException, SystemException {
		AppRole appRole = findByPrimaryKey(appRoleId);

		Session session = null;

		try {
			session = openSession();

			AppRole[] array = new AppRoleImpl[3];

			array[0] = getByC_G_PrevAndNext(session, appRole, companyId,
					groupId, orderByComparator, true);

			array[1] = appRole;

			array[2] = getByC_G_PrevAndNext(session, appRole, companyId,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppRole getByC_G_PrevAndNext(Session session, AppRole appRole,
		long companyId, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPROLE_WHERE);

		query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_GROUPID_2);

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
			query.append(AppRoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appRole);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppRole> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app roles where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G(long companyId, long groupId)
		throws SystemException {
		for (AppRole appRole : findByC_G(companyId, groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(appRole);
		}
	}

	/**
	 * Returns the number of app roles where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G(long companyId, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G;

		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_APPROLE_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "appRole.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "appRole.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_A = new FinderPath(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleModelImpl.FINDER_CACHE_ENABLED, AppRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_G_A",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_A = new FinderPath(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleModelImpl.FINDER_CACHE_ENABLED, AppRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G_A",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			AppRoleModelImpl.COMPANYID_COLUMN_BITMASK |
			AppRoleModelImpl.GROUPID_COLUMN_BITMASK |
			AppRoleModelImpl.APPLICATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_A = new FinderPath(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_A",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param applicationId the application ID
	 * @return the matching app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole> findByC_G_A(long companyId, long groupId,
		long applicationId) throws SystemException {
		return findByC_G_A(companyId, groupId, applicationId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param applicationId the application ID
	 * @param start the lower bound of the range of app roles
	 * @param end the upper bound of the range of app roles (not inclusive)
	 * @return the range of matching app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole> findByC_G_A(long companyId, long groupId,
		long applicationId, int start, int end) throws SystemException {
		return findByC_G_A(companyId, groupId, applicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param applicationId the application ID
	 * @param start the lower bound of the range of app roles
	 * @param end the upper bound of the range of app roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole> findByC_G_A(long companyId, long groupId,
		long applicationId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_A;
			finderArgs = new Object[] { companyId, groupId, applicationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_A;
			finderArgs = new Object[] {
					companyId, groupId, applicationId,
					
					start, end, orderByComparator
				};
		}

		List<AppRole> list = (List<AppRole>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole appRole : list) {
				if ((companyId != appRole.getCompanyId()) ||
						(groupId != appRole.getGroupId()) ||
						(applicationId != appRole.getApplicationId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_APPROLE_WHERE);

			query.append(_FINDER_COLUMN_C_G_A_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_A_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_A_APPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(applicationId);

				if (!pagination) {
					list = (List<AppRole>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole>(list);
				}
				else {
					list = (List<AppRole>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param applicationId the application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole findByC_G_A_First(long companyId, long groupId,
		long applicationId, OrderByComparator orderByComparator)
		throws NoSuchAppRoleException, SystemException {
		AppRole appRole = fetchByC_G_A_First(companyId, groupId, applicationId,
				orderByComparator);

		if (appRole != null) {
			return appRole;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", applicationId=");
		msg.append(applicationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRoleException(msg.toString());
	}

	/**
	 * Returns the first app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param applicationId the application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role, or <code>null</code> if a matching app role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole fetchByC_G_A_First(long companyId, long groupId,
		long applicationId, OrderByComparator orderByComparator)
		throws SystemException {
		List<AppRole> list = findByC_G_A(companyId, groupId, applicationId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param applicationId the application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a matching app role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole findByC_G_A_Last(long companyId, long groupId,
		long applicationId, OrderByComparator orderByComparator)
		throws NoSuchAppRoleException, SystemException {
		AppRole appRole = fetchByC_G_A_Last(companyId, groupId, applicationId,
				orderByComparator);

		if (appRole != null) {
			return appRole;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", applicationId=");
		msg.append(applicationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRoleException(msg.toString());
	}

	/**
	 * Returns the last app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param applicationId the application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role, or <code>null</code> if a matching app role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole fetchByC_G_A_Last(long companyId, long groupId,
		long applicationId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_G_A(companyId, groupId, applicationId);

		if (count == 0) {
			return null;
		}

		List<AppRole> list = findByC_G_A(companyId, groupId, applicationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app roles before and after the current app role in the ordered set where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	 *
	 * @param appRoleId the primary key of the current app role
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param applicationId the application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app role
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole[] findByC_G_A_PrevAndNext(long appRoleId, long companyId,
		long groupId, long applicationId, OrderByComparator orderByComparator)
		throws NoSuchAppRoleException, SystemException {
		AppRole appRole = findByPrimaryKey(appRoleId);

		Session session = null;

		try {
			session = openSession();

			AppRole[] array = new AppRoleImpl[3];

			array[0] = getByC_G_A_PrevAndNext(session, appRole, companyId,
					groupId, applicationId, orderByComparator, true);

			array[1] = appRole;

			array[2] = getByC_G_A_PrevAndNext(session, appRole, companyId,
					groupId, applicationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppRole getByC_G_A_PrevAndNext(Session session, AppRole appRole,
		long companyId, long groupId, long applicationId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPROLE_WHERE);

		query.append(_FINDER_COLUMN_C_G_A_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_A_GROUPID_2);

		query.append(_FINDER_COLUMN_C_G_A_APPLICATIONID_2);

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
			query.append(AppRoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(applicationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appRole);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppRole> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param applicationId the application ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G_A(long companyId, long groupId, long applicationId)
		throws SystemException {
		for (AppRole appRole : findByC_G_A(companyId, groupId, applicationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appRole);
		}
	}

	/**
	 * Returns the number of app roles where companyId = &#63; and groupId = &#63; and applicationId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param applicationId the application ID
	 * @return the number of matching app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G_A(long companyId, long groupId, long applicationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_A;

		Object[] finderArgs = new Object[] { companyId, groupId, applicationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_APPROLE_WHERE);

			query.append(_FINDER_COLUMN_C_G_A_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_A_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_A_APPLICATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(applicationId);

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

	private static final String _FINDER_COLUMN_C_G_A_COMPANYID_2 = "appRole.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_A_GROUPID_2 = "appRole.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_A_APPLICATIONID_2 = "appRole.applicationId = ?";

	public AppRolePersistenceImpl() {
		setModelClass(AppRole.class);
	}

	/**
	 * Caches the app role in the entity cache if it is enabled.
	 *
	 * @param appRole the app role
	 */
	@Override
	public void cacheResult(AppRole appRole) {
		EntityCacheUtil.putResult(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleImpl.class, appRole.getPrimaryKey(), appRole);

		appRole.resetOriginalValues();
	}

	/**
	 * Caches the app roles in the entity cache if it is enabled.
	 *
	 * @param appRoles the app roles
	 */
	@Override
	public void cacheResult(List<AppRole> appRoles) {
		for (AppRole appRole : appRoles) {
			if (EntityCacheUtil.getResult(
						AppRoleModelImpl.ENTITY_CACHE_ENABLED,
						AppRoleImpl.class, appRole.getPrimaryKey()) == null) {
				cacheResult(appRole);
			}
			else {
				appRole.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all app roles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AppRoleImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AppRoleImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the app role.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AppRole appRole) {
		EntityCacheUtil.removeResult(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleImpl.class, appRole.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AppRole> appRoles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AppRole appRole : appRoles) {
			EntityCacheUtil.removeResult(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
				AppRoleImpl.class, appRole.getPrimaryKey());
		}
	}

	/**
	 * Creates a new app role with the primary key. Does not add the app role to the database.
	 *
	 * @param appRoleId the primary key for the new app role
	 * @return the new app role
	 */
	@Override
	public AppRole create(long appRoleId) {
		AppRole appRole = new AppRoleImpl();

		appRole.setNew(true);
		appRole.setPrimaryKey(appRoleId);

		return appRole;
	}

	/**
	 * Removes the app role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appRoleId the primary key of the app role
	 * @return the app role that was removed
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole remove(long appRoleId)
		throws NoSuchAppRoleException, SystemException {
		return remove((Serializable)appRoleId);
	}

	/**
	 * Removes the app role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the app role
	 * @return the app role that was removed
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole remove(Serializable primaryKey)
		throws NoSuchAppRoleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AppRole appRole = (AppRole)session.get(AppRoleImpl.class, primaryKey);

			if (appRole == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAppRoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(appRole);
		}
		catch (NoSuchAppRoleException nsee) {
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
	protected AppRole removeImpl(AppRole appRole) throws SystemException {
		appRole = toUnwrappedModel(appRole);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(appRole)) {
				appRole = (AppRole)session.get(AppRoleImpl.class,
						appRole.getPrimaryKeyObj());
			}

			if (appRole != null) {
				session.delete(appRole);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (appRole != null) {
			clearCache(appRole);
		}

		return appRole;
	}

	@Override
	public AppRole updateImpl(org.oep.core.ssomgt.model.AppRole appRole)
		throws SystemException {
		appRole = toUnwrappedModel(appRole);

		boolean isNew = appRole.isNew();

		AppRoleModelImpl appRoleModelImpl = (AppRoleModelImpl)appRole;

		Session session = null;

		try {
			session = openSession();

			if (appRole.isNew()) {
				session.save(appRole);

				appRole.setNew(false);
			}
			else {
				session.merge(appRole);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AppRoleModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((appRoleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appRoleModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);

				args = new Object[] { appRoleModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);
			}

			if ((appRoleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appRoleModelImpl.getOriginalCompanyId(),
						appRoleModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);

				args = new Object[] {
						appRoleModelImpl.getCompanyId(),
						appRoleModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);
			}

			if ((appRoleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appRoleModelImpl.getOriginalCompanyId(),
						appRoleModelImpl.getOriginalGroupId(),
						appRoleModelImpl.getOriginalApplicationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_A, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_A,
					args);

				args = new Object[] {
						appRoleModelImpl.getCompanyId(),
						appRoleModelImpl.getGroupId(),
						appRoleModelImpl.getApplicationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_A, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_A,
					args);
			}
		}

		EntityCacheUtil.putResult(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
			AppRoleImpl.class, appRole.getPrimaryKey(), appRole);

		return appRole;
	}

	protected AppRole toUnwrappedModel(AppRole appRole) {
		if (appRole instanceof AppRoleImpl) {
			return appRole;
		}

		AppRoleImpl appRoleImpl = new AppRoleImpl();

		appRoleImpl.setNew(appRole.isNew());
		appRoleImpl.setPrimaryKey(appRole.getPrimaryKey());

		appRoleImpl.setAppRoleId(appRole.getAppRoleId());
		appRoleImpl.setUserId(appRole.getUserId());
		appRoleImpl.setGroupId(appRole.getGroupId());
		appRoleImpl.setCompanyId(appRole.getCompanyId());
		appRoleImpl.setCreateDate(appRole.getCreateDate());
		appRoleImpl.setApplicationId(appRole.getApplicationId());
		appRoleImpl.setRoleCode(appRole.getRoleCode());
		appRoleImpl.setRoleName(appRole.getRoleName());

		return appRoleImpl;
	}

	/**
	 * Returns the app role with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the app role
	 * @return the app role
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAppRoleException, SystemException {
		AppRole appRole = fetchByPrimaryKey(primaryKey);

		if (appRole == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAppRoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return appRole;
	}

	/**
	 * Returns the app role with the primary key or throws a {@link org.oep.core.ssomgt.NoSuchAppRoleException} if it could not be found.
	 *
	 * @param appRoleId the primary key of the app role
	 * @return the app role
	 * @throws org.oep.core.ssomgt.NoSuchAppRoleException if a app role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole findByPrimaryKey(long appRoleId)
		throws NoSuchAppRoleException, SystemException {
		return findByPrimaryKey((Serializable)appRoleId);
	}

	/**
	 * Returns the app role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the app role
	 * @return the app role, or <code>null</code> if a app role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AppRole appRole = (AppRole)EntityCacheUtil.getResult(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
				AppRoleImpl.class, primaryKey);

		if (appRole == _nullAppRole) {
			return null;
		}

		if (appRole == null) {
			Session session = null;

			try {
				session = openSession();

				appRole = (AppRole)session.get(AppRoleImpl.class, primaryKey);

				if (appRole != null) {
					cacheResult(appRole);
				}
				else {
					EntityCacheUtil.putResult(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
						AppRoleImpl.class, primaryKey, _nullAppRole);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AppRoleModelImpl.ENTITY_CACHE_ENABLED,
					AppRoleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return appRole;
	}

	/**
	 * Returns the app role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appRoleId the primary key of the app role
	 * @return the app role, or <code>null</code> if a app role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole fetchByPrimaryKey(long appRoleId) throws SystemException {
		return fetchByPrimaryKey((Serializable)appRoleId);
	}

	/**
	 * Returns all the app roles.
	 *
	 * @return the app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of app roles
	 * @param end the upper bound of the range of app roles (not inclusive)
	 * @return the range of app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the app roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of app roles
	 * @param end the upper bound of the range of app roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of app roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole> findAll(int start, int end,
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

		List<AppRole> list = (List<AppRole>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_APPROLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APPROLE;

				if (pagination) {
					sql = sql.concat(AppRoleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AppRole>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole>(list);
				}
				else {
					list = (List<AppRole>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the app roles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AppRole appRole : findAll()) {
			remove(appRole);
		}
	}

	/**
	 * Returns the number of app roles.
	 *
	 * @return the number of app roles
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

				Query q = session.createQuery(_SQL_COUNT_APPROLE);

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
	 * Initializes the app role persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.ssomgt.model.AppRole")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AppRole>> listenersList = new ArrayList<ModelListener<AppRole>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AppRole>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AppRoleImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_APPROLE = "SELECT appRole FROM AppRole appRole";
	private static final String _SQL_SELECT_APPROLE_WHERE = "SELECT appRole FROM AppRole appRole WHERE ";
	private static final String _SQL_COUNT_APPROLE = "SELECT COUNT(appRole) FROM AppRole appRole";
	private static final String _SQL_COUNT_APPROLE_WHERE = "SELECT COUNT(appRole) FROM AppRole appRole WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "appRole.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AppRole exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AppRole exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AppRolePersistenceImpl.class);
	private static AppRole _nullAppRole = new AppRoleImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AppRole> toCacheModel() {
				return _nullAppRoleCacheModel;
			}
		};

	private static CacheModel<AppRole> _nullAppRoleCacheModel = new CacheModel<AppRole>() {
			@Override
			public AppRole toEntityModel() {
				return _nullAppRole;
			}
		};
}