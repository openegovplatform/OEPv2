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

import org.oep.usermgt.NoSuchJobpos2RoleException;
import org.oep.usermgt.model.Jobpos2Role;
import org.oep.usermgt.model.impl.Jobpos2RoleImpl;
import org.oep.usermgt.model.impl.Jobpos2RoleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the jobpos to role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see Jobpos2RolePersistence
 * @see Jobpos2RoleUtil
 * @generated
 */
public class Jobpos2RolePersistenceImpl extends BasePersistenceImpl<Jobpos2Role>
	implements Jobpos2RolePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Jobpos2RoleUtil} to access the jobpos to role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Jobpos2RoleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			Jobpos2RoleModelImpl.FINDER_CACHE_ENABLED, Jobpos2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			Jobpos2RoleModelImpl.FINDER_CACHE_ENABLED, Jobpos2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			Jobpos2RoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_R = new FinderPath(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			Jobpos2RoleModelImpl.FINDER_CACHE_ENABLED, Jobpos2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByR",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R = new FinderPath(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			Jobpos2RoleModelImpl.FINDER_CACHE_ENABLED, Jobpos2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByR",
			new String[] { Long.class.getName() },
			Jobpos2RoleModelImpl.ROLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_R = new FinderPath(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			Jobpos2RoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByR",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the jobpos to roles where roleId = &#63;.
	 *
	 * @param roleId the role ID
	 * @return the matching jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Jobpos2Role> findByR(long roleId) throws SystemException {
		return findByR(roleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jobpos to roles where roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.Jobpos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param roleId the role ID
	 * @param start the lower bound of the range of jobpos to roles
	 * @param end the upper bound of the range of jobpos to roles (not inclusive)
	 * @return the range of matching jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Jobpos2Role> findByR(long roleId, int start, int end)
		throws SystemException {
		return findByR(roleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jobpos to roles where roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.Jobpos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param roleId the role ID
	 * @param start the lower bound of the range of jobpos to roles
	 * @param end the upper bound of the range of jobpos to roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Jobpos2Role> findByR(long roleId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R;
			finderArgs = new Object[] { roleId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_R;
			finderArgs = new Object[] { roleId, start, end, orderByComparator };
		}

		List<Jobpos2Role> list = (List<Jobpos2Role>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Jobpos2Role jobpos2Role : list) {
				if ((roleId != jobpos2Role.getRoleId())) {
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

			query.append(_SQL_SELECT_JOBPOS2ROLE_WHERE);

			query.append(_FINDER_COLUMN_R_ROLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(Jobpos2RoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(roleId);

				if (!pagination) {
					list = (List<Jobpos2Role>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Jobpos2Role>(list);
				}
				else {
					list = (List<Jobpos2Role>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first jobpos to role in the ordered set where roleId = &#63;.
	 *
	 * @param roleId the role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jobpos to role
	 * @throws org.oep.usermgt.NoSuchJobpos2RoleException if a matching jobpos to role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role findByR_First(long roleId,
		OrderByComparator orderByComparator)
		throws NoSuchJobpos2RoleException, SystemException {
		Jobpos2Role jobpos2Role = fetchByR_First(roleId, orderByComparator);

		if (jobpos2Role != null) {
			return jobpos2Role;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("roleId=");
		msg.append(roleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobpos2RoleException(msg.toString());
	}

	/**
	 * Returns the first jobpos to role in the ordered set where roleId = &#63;.
	 *
	 * @param roleId the role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jobpos to role, or <code>null</code> if a matching jobpos to role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role fetchByR_First(long roleId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Jobpos2Role> list = findByR(roleId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jobpos to role in the ordered set where roleId = &#63;.
	 *
	 * @param roleId the role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jobpos to role
	 * @throws org.oep.usermgt.NoSuchJobpos2RoleException if a matching jobpos to role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role findByR_Last(long roleId,
		OrderByComparator orderByComparator)
		throws NoSuchJobpos2RoleException, SystemException {
		Jobpos2Role jobpos2Role = fetchByR_Last(roleId, orderByComparator);

		if (jobpos2Role != null) {
			return jobpos2Role;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("roleId=");
		msg.append(roleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobpos2RoleException(msg.toString());
	}

	/**
	 * Returns the last jobpos to role in the ordered set where roleId = &#63;.
	 *
	 * @param roleId the role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jobpos to role, or <code>null</code> if a matching jobpos to role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role fetchByR_Last(long roleId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByR(roleId);

		if (count == 0) {
			return null;
		}

		List<Jobpos2Role> list = findByR(roleId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jobpos to roles before and after the current jobpos to role in the ordered set where roleId = &#63;.
	 *
	 * @param jobpos2RolePK the primary key of the current jobpos to role
	 * @param roleId the role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jobpos to role
	 * @throws org.oep.usermgt.NoSuchJobpos2RoleException if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role[] findByR_PrevAndNext(Jobpos2RolePK jobpos2RolePK,
		long roleId, OrderByComparator orderByComparator)
		throws NoSuchJobpos2RoleException, SystemException {
		Jobpos2Role jobpos2Role = findByPrimaryKey(jobpos2RolePK);

		Session session = null;

		try {
			session = openSession();

			Jobpos2Role[] array = new Jobpos2RoleImpl[3];

			array[0] = getByR_PrevAndNext(session, jobpos2Role, roleId,
					orderByComparator, true);

			array[1] = jobpos2Role;

			array[2] = getByR_PrevAndNext(session, jobpos2Role, roleId,
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

	protected Jobpos2Role getByR_PrevAndNext(Session session,
		Jobpos2Role jobpos2Role, long roleId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JOBPOS2ROLE_WHERE);

		query.append(_FINDER_COLUMN_R_ROLEID_2);

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
			query.append(Jobpos2RoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(roleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jobpos2Role);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Jobpos2Role> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jobpos to roles where roleId = &#63; from the database.
	 *
	 * @param roleId the role ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByR(long roleId) throws SystemException {
		for (Jobpos2Role jobpos2Role : findByR(roleId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(jobpos2Role);
		}
	}

	/**
	 * Returns the number of jobpos to roles where roleId = &#63;.
	 *
	 * @param roleId the role ID
	 * @return the number of matching jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByR(long roleId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_R;

		Object[] finderArgs = new Object[] { roleId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JOBPOS2ROLE_WHERE);

			query.append(_FINDER_COLUMN_R_ROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_R_ROLEID_2 = "jobpos2Role.id.roleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_JP = new FinderPath(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			Jobpos2RoleModelImpl.FINDER_CACHE_ENABLED, Jobpos2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByJP",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JP = new FinderPath(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			Jobpos2RoleModelImpl.FINDER_CACHE_ENABLED, Jobpos2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByJP",
			new String[] { Long.class.getName() },
			Jobpos2RoleModelImpl.JOBPOSID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_JP = new FinderPath(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			Jobpos2RoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByJP",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the jobpos to roles where jobPosId = &#63;.
	 *
	 * @param jobPosId the job pos ID
	 * @return the matching jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Jobpos2Role> findByJP(long jobPosId) throws SystemException {
		return findByJP(jobPosId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jobpos to roles where jobPosId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.Jobpos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param jobPosId the job pos ID
	 * @param start the lower bound of the range of jobpos to roles
	 * @param end the upper bound of the range of jobpos to roles (not inclusive)
	 * @return the range of matching jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Jobpos2Role> findByJP(long jobPosId, int start, int end)
		throws SystemException {
		return findByJP(jobPosId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jobpos to roles where jobPosId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.Jobpos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param jobPosId the job pos ID
	 * @param start the lower bound of the range of jobpos to roles
	 * @param end the upper bound of the range of jobpos to roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Jobpos2Role> findByJP(long jobPosId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JP;
			finderArgs = new Object[] { jobPosId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_JP;
			finderArgs = new Object[] { jobPosId, start, end, orderByComparator };
		}

		List<Jobpos2Role> list = (List<Jobpos2Role>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Jobpos2Role jobpos2Role : list) {
				if ((jobPosId != jobpos2Role.getJobPosId())) {
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

			query.append(_SQL_SELECT_JOBPOS2ROLE_WHERE);

			query.append(_FINDER_COLUMN_JP_JOBPOSID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(Jobpos2RoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(jobPosId);

				if (!pagination) {
					list = (List<Jobpos2Role>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Jobpos2Role>(list);
				}
				else {
					list = (List<Jobpos2Role>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first jobpos to role in the ordered set where jobPosId = &#63;.
	 *
	 * @param jobPosId the job pos ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jobpos to role
	 * @throws org.oep.usermgt.NoSuchJobpos2RoleException if a matching jobpos to role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role findByJP_First(long jobPosId,
		OrderByComparator orderByComparator)
		throws NoSuchJobpos2RoleException, SystemException {
		Jobpos2Role jobpos2Role = fetchByJP_First(jobPosId, orderByComparator);

		if (jobpos2Role != null) {
			return jobpos2Role;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("jobPosId=");
		msg.append(jobPosId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobpos2RoleException(msg.toString());
	}

	/**
	 * Returns the first jobpos to role in the ordered set where jobPosId = &#63;.
	 *
	 * @param jobPosId the job pos ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jobpos to role, or <code>null</code> if a matching jobpos to role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role fetchByJP_First(long jobPosId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Jobpos2Role> list = findByJP(jobPosId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jobpos to role in the ordered set where jobPosId = &#63;.
	 *
	 * @param jobPosId the job pos ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jobpos to role
	 * @throws org.oep.usermgt.NoSuchJobpos2RoleException if a matching jobpos to role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role findByJP_Last(long jobPosId,
		OrderByComparator orderByComparator)
		throws NoSuchJobpos2RoleException, SystemException {
		Jobpos2Role jobpos2Role = fetchByJP_Last(jobPosId, orderByComparator);

		if (jobpos2Role != null) {
			return jobpos2Role;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("jobPosId=");
		msg.append(jobPosId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobpos2RoleException(msg.toString());
	}

	/**
	 * Returns the last jobpos to role in the ordered set where jobPosId = &#63;.
	 *
	 * @param jobPosId the job pos ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jobpos to role, or <code>null</code> if a matching jobpos to role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role fetchByJP_Last(long jobPosId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByJP(jobPosId);

		if (count == 0) {
			return null;
		}

		List<Jobpos2Role> list = findByJP(jobPosId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jobpos to roles before and after the current jobpos to role in the ordered set where jobPosId = &#63;.
	 *
	 * @param jobpos2RolePK the primary key of the current jobpos to role
	 * @param jobPosId the job pos ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jobpos to role
	 * @throws org.oep.usermgt.NoSuchJobpos2RoleException if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role[] findByJP_PrevAndNext(Jobpos2RolePK jobpos2RolePK,
		long jobPosId, OrderByComparator orderByComparator)
		throws NoSuchJobpos2RoleException, SystemException {
		Jobpos2Role jobpos2Role = findByPrimaryKey(jobpos2RolePK);

		Session session = null;

		try {
			session = openSession();

			Jobpos2Role[] array = new Jobpos2RoleImpl[3];

			array[0] = getByJP_PrevAndNext(session, jobpos2Role, jobPosId,
					orderByComparator, true);

			array[1] = jobpos2Role;

			array[2] = getByJP_PrevAndNext(session, jobpos2Role, jobPosId,
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

	protected Jobpos2Role getByJP_PrevAndNext(Session session,
		Jobpos2Role jobpos2Role, long jobPosId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JOBPOS2ROLE_WHERE);

		query.append(_FINDER_COLUMN_JP_JOBPOSID_2);

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
			query.append(Jobpos2RoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(jobPosId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jobpos2Role);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Jobpos2Role> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jobpos to roles where jobPosId = &#63; from the database.
	 *
	 * @param jobPosId the job pos ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByJP(long jobPosId) throws SystemException {
		for (Jobpos2Role jobpos2Role : findByJP(jobPosId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(jobpos2Role);
		}
	}

	/**
	 * Returns the number of jobpos to roles where jobPosId = &#63;.
	 *
	 * @param jobPosId the job pos ID
	 * @return the number of matching jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByJP(long jobPosId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_JP;

		Object[] finderArgs = new Object[] { jobPosId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JOBPOS2ROLE_WHERE);

			query.append(_FINDER_COLUMN_JP_JOBPOSID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(jobPosId);

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

	private static final String _FINDER_COLUMN_JP_JOBPOSID_2 = "jobpos2Role.id.jobPosId = ?";

	public Jobpos2RolePersistenceImpl() {
		setModelClass(Jobpos2Role.class);
	}

	/**
	 * Caches the jobpos to role in the entity cache if it is enabled.
	 *
	 * @param jobpos2Role the jobpos to role
	 */
	@Override
	public void cacheResult(Jobpos2Role jobpos2Role) {
		EntityCacheUtil.putResult(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			Jobpos2RoleImpl.class, jobpos2Role.getPrimaryKey(), jobpos2Role);

		jobpos2Role.resetOriginalValues();
	}

	/**
	 * Caches the jobpos to roles in the entity cache if it is enabled.
	 *
	 * @param jobpos2Roles the jobpos to roles
	 */
	@Override
	public void cacheResult(List<Jobpos2Role> jobpos2Roles) {
		for (Jobpos2Role jobpos2Role : jobpos2Roles) {
			if (EntityCacheUtil.getResult(
						Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
						Jobpos2RoleImpl.class, jobpos2Role.getPrimaryKey()) == null) {
				cacheResult(jobpos2Role);
			}
			else {
				jobpos2Role.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all jobpos to roles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(Jobpos2RoleImpl.class.getName());
		}

		EntityCacheUtil.clearCache(Jobpos2RoleImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the jobpos to role.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Jobpos2Role jobpos2Role) {
		EntityCacheUtil.removeResult(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			Jobpos2RoleImpl.class, jobpos2Role.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Jobpos2Role> jobpos2Roles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Jobpos2Role jobpos2Role : jobpos2Roles) {
			EntityCacheUtil.removeResult(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
				Jobpos2RoleImpl.class, jobpos2Role.getPrimaryKey());
		}
	}

	/**
	 * Creates a new jobpos to role with the primary key. Does not add the jobpos to role to the database.
	 *
	 * @param jobpos2RolePK the primary key for the new jobpos to role
	 * @return the new jobpos to role
	 */
	@Override
	public Jobpos2Role create(Jobpos2RolePK jobpos2RolePK) {
		Jobpos2Role jobpos2Role = new Jobpos2RoleImpl();

		jobpos2Role.setNew(true);
		jobpos2Role.setPrimaryKey(jobpos2RolePK);

		return jobpos2Role;
	}

	/**
	 * Removes the jobpos to role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jobpos2RolePK the primary key of the jobpos to role
	 * @return the jobpos to role that was removed
	 * @throws org.oep.usermgt.NoSuchJobpos2RoleException if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role remove(Jobpos2RolePK jobpos2RolePK)
		throws NoSuchJobpos2RoleException, SystemException {
		return remove((Serializable)jobpos2RolePK);
	}

	/**
	 * Removes the jobpos to role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jobpos to role
	 * @return the jobpos to role that was removed
	 * @throws org.oep.usermgt.NoSuchJobpos2RoleException if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role remove(Serializable primaryKey)
		throws NoSuchJobpos2RoleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Jobpos2Role jobpos2Role = (Jobpos2Role)session.get(Jobpos2RoleImpl.class,
					primaryKey);

			if (jobpos2Role == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJobpos2RoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(jobpos2Role);
		}
		catch (NoSuchJobpos2RoleException nsee) {
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
	protected Jobpos2Role removeImpl(Jobpos2Role jobpos2Role)
		throws SystemException {
		jobpos2Role = toUnwrappedModel(jobpos2Role);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jobpos2Role)) {
				jobpos2Role = (Jobpos2Role)session.get(Jobpos2RoleImpl.class,
						jobpos2Role.getPrimaryKeyObj());
			}

			if (jobpos2Role != null) {
				session.delete(jobpos2Role);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (jobpos2Role != null) {
			clearCache(jobpos2Role);
		}

		return jobpos2Role;
	}

	@Override
	public Jobpos2Role updateImpl(org.oep.usermgt.model.Jobpos2Role jobpos2Role)
		throws SystemException {
		jobpos2Role = toUnwrappedModel(jobpos2Role);

		boolean isNew = jobpos2Role.isNew();

		Jobpos2RoleModelImpl jobpos2RoleModelImpl = (Jobpos2RoleModelImpl)jobpos2Role;

		Session session = null;

		try {
			session = openSession();

			if (jobpos2Role.isNew()) {
				session.save(jobpos2Role);

				jobpos2Role.setNew(false);
			}
			else {
				session.merge(jobpos2Role);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !Jobpos2RoleModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((jobpos2RoleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						jobpos2RoleModelImpl.getOriginalRoleId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_R, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R,
					args);

				args = new Object[] { jobpos2RoleModelImpl.getRoleId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_R, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R,
					args);
			}

			if ((jobpos2RoleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JP.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						jobpos2RoleModelImpl.getOriginalJobPosId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_JP, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JP,
					args);

				args = new Object[] { jobpos2RoleModelImpl.getJobPosId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_JP, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JP,
					args);
			}
		}

		EntityCacheUtil.putResult(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			Jobpos2RoleImpl.class, jobpos2Role.getPrimaryKey(), jobpos2Role);

		return jobpos2Role;
	}

	protected Jobpos2Role toUnwrappedModel(Jobpos2Role jobpos2Role) {
		if (jobpos2Role instanceof Jobpos2RoleImpl) {
			return jobpos2Role;
		}

		Jobpos2RoleImpl jobpos2RoleImpl = new Jobpos2RoleImpl();

		jobpos2RoleImpl.setNew(jobpos2Role.isNew());
		jobpos2RoleImpl.setPrimaryKey(jobpos2Role.getPrimaryKey());

		jobpos2RoleImpl.setJobPosId(jobpos2Role.getJobPosId());
		jobpos2RoleImpl.setRoleId(jobpos2Role.getRoleId());

		return jobpos2RoleImpl;
	}

	/**
	 * Returns the jobpos to role with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the jobpos to role
	 * @return the jobpos to role
	 * @throws org.oep.usermgt.NoSuchJobpos2RoleException if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJobpos2RoleException, SystemException {
		Jobpos2Role jobpos2Role = fetchByPrimaryKey(primaryKey);

		if (jobpos2Role == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJobpos2RoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return jobpos2Role;
	}

	/**
	 * Returns the jobpos to role with the primary key or throws a {@link org.oep.usermgt.NoSuchJobpos2RoleException} if it could not be found.
	 *
	 * @param jobpos2RolePK the primary key of the jobpos to role
	 * @return the jobpos to role
	 * @throws org.oep.usermgt.NoSuchJobpos2RoleException if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role findByPrimaryKey(Jobpos2RolePK jobpos2RolePK)
		throws NoSuchJobpos2RoleException, SystemException {
		return findByPrimaryKey((Serializable)jobpos2RolePK);
	}

	/**
	 * Returns the jobpos to role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jobpos to role
	 * @return the jobpos to role, or <code>null</code> if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Jobpos2Role jobpos2Role = (Jobpos2Role)EntityCacheUtil.getResult(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
				Jobpos2RoleImpl.class, primaryKey);

		if (jobpos2Role == _nullJobpos2Role) {
			return null;
		}

		if (jobpos2Role == null) {
			Session session = null;

			try {
				session = openSession();

				jobpos2Role = (Jobpos2Role)session.get(Jobpos2RoleImpl.class,
						primaryKey);

				if (jobpos2Role != null) {
					cacheResult(jobpos2Role);
				}
				else {
					EntityCacheUtil.putResult(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
						Jobpos2RoleImpl.class, primaryKey, _nullJobpos2Role);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(Jobpos2RoleModelImpl.ENTITY_CACHE_ENABLED,
					Jobpos2RoleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return jobpos2Role;
	}

	/**
	 * Returns the jobpos to role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jobpos2RolePK the primary key of the jobpos to role
	 * @return the jobpos to role, or <code>null</code> if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jobpos2Role fetchByPrimaryKey(Jobpos2RolePK jobpos2RolePK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)jobpos2RolePK);
	}

	/**
	 * Returns all the jobpos to roles.
	 *
	 * @return the jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Jobpos2Role> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jobpos to roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.Jobpos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of jobpos to roles
	 * @param end the upper bound of the range of jobpos to roles (not inclusive)
	 * @return the range of jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Jobpos2Role> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jobpos to roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.Jobpos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of jobpos to roles
	 * @param end the upper bound of the range of jobpos to roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Jobpos2Role> findAll(int start, int end,
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

		List<Jobpos2Role> list = (List<Jobpos2Role>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_JOBPOS2ROLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JOBPOS2ROLE;

				if (pagination) {
					sql = sql.concat(Jobpos2RoleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Jobpos2Role>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Jobpos2Role>(list);
				}
				else {
					list = (List<Jobpos2Role>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the jobpos to roles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Jobpos2Role jobpos2Role : findAll()) {
			remove(jobpos2Role);
		}
	}

	/**
	 * Returns the number of jobpos to roles.
	 *
	 * @return the number of jobpos to roles
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

				Query q = session.createQuery(_SQL_COUNT_JOBPOS2ROLE);

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
	 * Initializes the jobpos to role persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.usermgt.model.Jobpos2Role")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Jobpos2Role>> listenersList = new ArrayList<ModelListener<Jobpos2Role>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Jobpos2Role>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(Jobpos2RoleImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_JOBPOS2ROLE = "SELECT jobpos2Role FROM Jobpos2Role jobpos2Role";
	private static final String _SQL_SELECT_JOBPOS2ROLE_WHERE = "SELECT jobpos2Role FROM Jobpos2Role jobpos2Role WHERE ";
	private static final String _SQL_COUNT_JOBPOS2ROLE = "SELECT COUNT(jobpos2Role) FROM Jobpos2Role jobpos2Role";
	private static final String _SQL_COUNT_JOBPOS2ROLE_WHERE = "SELECT COUNT(jobpos2Role) FROM Jobpos2Role jobpos2Role WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jobpos2Role.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Jobpos2Role exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Jobpos2Role exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(Jobpos2RolePersistenceImpl.class);
	private static Jobpos2Role _nullJobpos2Role = new Jobpos2RoleImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Jobpos2Role> toCacheModel() {
				return _nullJobpos2RoleCacheModel;
			}
		};

	private static CacheModel<Jobpos2Role> _nullJobpos2RoleCacheModel = new CacheModel<Jobpos2Role>() {
			@Override
			public Jobpos2Role toEntityModel() {
				return _nullJobpos2Role;
			}
		};
}