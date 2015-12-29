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

import org.oep.usermgt.NoSuchJobPos2RoleException;
import org.oep.usermgt.model.JobPos2Role;
import org.oep.usermgt.model.impl.JobPos2RoleImpl;
import org.oep.usermgt.model.impl.JobPos2RoleModelImpl;

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
 * @see JobPos2RolePersistence
 * @see JobPos2RoleUtil
 * @generated
 */
public class JobPos2RolePersistenceImpl extends BasePersistenceImpl<JobPos2Role>
	implements JobPos2RolePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link JobPos2RoleUtil} to access the jobpos to role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = JobPos2RoleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			JobPos2RoleModelImpl.FINDER_CACHE_ENABLED, JobPos2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			JobPos2RoleModelImpl.FINDER_CACHE_ENABLED, JobPos2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			JobPos2RoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_R = new FinderPath(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			JobPos2RoleModelImpl.FINDER_CACHE_ENABLED, JobPos2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByR",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R = new FinderPath(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			JobPos2RoleModelImpl.FINDER_CACHE_ENABLED, JobPos2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByR",
			new String[] { Long.class.getName() },
			JobPos2RoleModelImpl.ROLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_R = new FinderPath(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			JobPos2RoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
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
	public List<JobPos2Role> findByR(long roleId) throws SystemException {
		return findByR(roleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jobpos to roles where roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param roleId the role ID
	 * @param start the lower bound of the range of jobpos to roles
	 * @param end the upper bound of the range of jobpos to roles (not inclusive)
	 * @return the range of matching jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos2Role> findByR(long roleId, int start, int end)
		throws SystemException {
		return findByR(roleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jobpos to roles where roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<JobPos2Role> findByR(long roleId, int start, int end,
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

		List<JobPos2Role> list = (List<JobPos2Role>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (JobPos2Role jobPos2Role : list) {
				if ((roleId != jobPos2Role.getRoleId())) {
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
				query.append(JobPos2RoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(roleId);

				if (!pagination) {
					list = (List<JobPos2Role>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<JobPos2Role>(list);
				}
				else {
					list = (List<JobPos2Role>)QueryUtil.list(q, getDialect(),
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
	 * @throws org.oep.usermgt.NoSuchJobPos2RoleException if a matching jobpos to role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos2Role findByR_First(long roleId,
		OrderByComparator orderByComparator)
		throws NoSuchJobPos2RoleException, SystemException {
		JobPos2Role jobPos2Role = fetchByR_First(roleId, orderByComparator);

		if (jobPos2Role != null) {
			return jobPos2Role;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("roleId=");
		msg.append(roleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPos2RoleException(msg.toString());
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
	public JobPos2Role fetchByR_First(long roleId,
		OrderByComparator orderByComparator) throws SystemException {
		List<JobPos2Role> list = findByR(roleId, 0, 1, orderByComparator);

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
	 * @throws org.oep.usermgt.NoSuchJobPos2RoleException if a matching jobpos to role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos2Role findByR_Last(long roleId,
		OrderByComparator orderByComparator)
		throws NoSuchJobPos2RoleException, SystemException {
		JobPos2Role jobPos2Role = fetchByR_Last(roleId, orderByComparator);

		if (jobPos2Role != null) {
			return jobPos2Role;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("roleId=");
		msg.append(roleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPos2RoleException(msg.toString());
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
	public JobPos2Role fetchByR_Last(long roleId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByR(roleId);

		if (count == 0) {
			return null;
		}

		List<JobPos2Role> list = findByR(roleId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jobpos to roles before and after the current jobpos to role in the ordered set where roleId = &#63;.
	 *
	 * @param jobPos2RolePK the primary key of the current jobpos to role
	 * @param roleId the role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jobpos to role
	 * @throws org.oep.usermgt.NoSuchJobPos2RoleException if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos2Role[] findByR_PrevAndNext(JobPos2RolePK jobPos2RolePK,
		long roleId, OrderByComparator orderByComparator)
		throws NoSuchJobPos2RoleException, SystemException {
		JobPos2Role jobPos2Role = findByPrimaryKey(jobPos2RolePK);

		Session session = null;

		try {
			session = openSession();

			JobPos2Role[] array = new JobPos2RoleImpl[3];

			array[0] = getByR_PrevAndNext(session, jobPos2Role, roleId,
					orderByComparator, true);

			array[1] = jobPos2Role;

			array[2] = getByR_PrevAndNext(session, jobPos2Role, roleId,
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

	protected JobPos2Role getByR_PrevAndNext(Session session,
		JobPos2Role jobPos2Role, long roleId,
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
			query.append(JobPos2RoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(roleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jobPos2Role);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<JobPos2Role> list = q.list();

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
		for (JobPos2Role jobPos2Role : findByR(roleId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(jobPos2Role);
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

	private static final String _FINDER_COLUMN_R_ROLEID_2 = "jobPos2Role.id.roleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_JP = new FinderPath(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			JobPos2RoleModelImpl.FINDER_CACHE_ENABLED, JobPos2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByJP",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JP = new FinderPath(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			JobPos2RoleModelImpl.FINDER_CACHE_ENABLED, JobPos2RoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByJP",
			new String[] { Long.class.getName() },
			JobPos2RoleModelImpl.JOBPOSID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_JP = new FinderPath(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			JobPos2RoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
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
	public List<JobPos2Role> findByJP(long jobPosId) throws SystemException {
		return findByJP(jobPosId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jobpos to roles where jobPosId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param jobPosId the job pos ID
	 * @param start the lower bound of the range of jobpos to roles
	 * @param end the upper bound of the range of jobpos to roles (not inclusive)
	 * @return the range of matching jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos2Role> findByJP(long jobPosId, int start, int end)
		throws SystemException {
		return findByJP(jobPosId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jobpos to roles where jobPosId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<JobPos2Role> findByJP(long jobPosId, int start, int end,
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

		List<JobPos2Role> list = (List<JobPos2Role>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (JobPos2Role jobPos2Role : list) {
				if ((jobPosId != jobPos2Role.getJobPosId())) {
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
				query.append(JobPos2RoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(jobPosId);

				if (!pagination) {
					list = (List<JobPos2Role>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<JobPos2Role>(list);
				}
				else {
					list = (List<JobPos2Role>)QueryUtil.list(q, getDialect(),
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
	 * @throws org.oep.usermgt.NoSuchJobPos2RoleException if a matching jobpos to role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos2Role findByJP_First(long jobPosId,
		OrderByComparator orderByComparator)
		throws NoSuchJobPos2RoleException, SystemException {
		JobPos2Role jobPos2Role = fetchByJP_First(jobPosId, orderByComparator);

		if (jobPos2Role != null) {
			return jobPos2Role;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("jobPosId=");
		msg.append(jobPosId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPos2RoleException(msg.toString());
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
	public JobPos2Role fetchByJP_First(long jobPosId,
		OrderByComparator orderByComparator) throws SystemException {
		List<JobPos2Role> list = findByJP(jobPosId, 0, 1, orderByComparator);

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
	 * @throws org.oep.usermgt.NoSuchJobPos2RoleException if a matching jobpos to role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos2Role findByJP_Last(long jobPosId,
		OrderByComparator orderByComparator)
		throws NoSuchJobPos2RoleException, SystemException {
		JobPos2Role jobPos2Role = fetchByJP_Last(jobPosId, orderByComparator);

		if (jobPos2Role != null) {
			return jobPos2Role;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("jobPosId=");
		msg.append(jobPosId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPos2RoleException(msg.toString());
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
	public JobPos2Role fetchByJP_Last(long jobPosId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByJP(jobPosId);

		if (count == 0) {
			return null;
		}

		List<JobPos2Role> list = findByJP(jobPosId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jobpos to roles before and after the current jobpos to role in the ordered set where jobPosId = &#63;.
	 *
	 * @param jobPos2RolePK the primary key of the current jobpos to role
	 * @param jobPosId the job pos ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jobpos to role
	 * @throws org.oep.usermgt.NoSuchJobPos2RoleException if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos2Role[] findByJP_PrevAndNext(JobPos2RolePK jobPos2RolePK,
		long jobPosId, OrderByComparator orderByComparator)
		throws NoSuchJobPos2RoleException, SystemException {
		JobPos2Role jobPos2Role = findByPrimaryKey(jobPos2RolePK);

		Session session = null;

		try {
			session = openSession();

			JobPos2Role[] array = new JobPos2RoleImpl[3];

			array[0] = getByJP_PrevAndNext(session, jobPos2Role, jobPosId,
					orderByComparator, true);

			array[1] = jobPos2Role;

			array[2] = getByJP_PrevAndNext(session, jobPos2Role, jobPosId,
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

	protected JobPos2Role getByJP_PrevAndNext(Session session,
		JobPos2Role jobPos2Role, long jobPosId,
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
			query.append(JobPos2RoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(jobPosId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jobPos2Role);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<JobPos2Role> list = q.list();

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
		for (JobPos2Role jobPos2Role : findByJP(jobPosId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(jobPos2Role);
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

	private static final String _FINDER_COLUMN_JP_JOBPOSID_2 = "jobPos2Role.id.jobPosId = ?";

	public JobPos2RolePersistenceImpl() {
		setModelClass(JobPos2Role.class);
	}

	/**
	 * Caches the jobpos to role in the entity cache if it is enabled.
	 *
	 * @param jobPos2Role the jobpos to role
	 */
	@Override
	public void cacheResult(JobPos2Role jobPos2Role) {
		EntityCacheUtil.putResult(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			JobPos2RoleImpl.class, jobPos2Role.getPrimaryKey(), jobPos2Role);

		jobPos2Role.resetOriginalValues();
	}

	/**
	 * Caches the jobpos to roles in the entity cache if it is enabled.
	 *
	 * @param jobPos2Roles the jobpos to roles
	 */
	@Override
	public void cacheResult(List<JobPos2Role> jobPos2Roles) {
		for (JobPos2Role jobPos2Role : jobPos2Roles) {
			if (EntityCacheUtil.getResult(
						JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
						JobPos2RoleImpl.class, jobPos2Role.getPrimaryKey()) == null) {
				cacheResult(jobPos2Role);
			}
			else {
				jobPos2Role.resetOriginalValues();
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
			CacheRegistryUtil.clear(JobPos2RoleImpl.class.getName());
		}

		EntityCacheUtil.clearCache(JobPos2RoleImpl.class.getName());

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
	public void clearCache(JobPos2Role jobPos2Role) {
		EntityCacheUtil.removeResult(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			JobPos2RoleImpl.class, jobPos2Role.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<JobPos2Role> jobPos2Roles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (JobPos2Role jobPos2Role : jobPos2Roles) {
			EntityCacheUtil.removeResult(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
				JobPos2RoleImpl.class, jobPos2Role.getPrimaryKey());
		}
	}

	/**
	 * Creates a new jobpos to role with the primary key. Does not add the jobpos to role to the database.
	 *
	 * @param jobPos2RolePK the primary key for the new jobpos to role
	 * @return the new jobpos to role
	 */
	@Override
	public JobPos2Role create(JobPos2RolePK jobPos2RolePK) {
		JobPos2Role jobPos2Role = new JobPos2RoleImpl();

		jobPos2Role.setNew(true);
		jobPos2Role.setPrimaryKey(jobPos2RolePK);

		return jobPos2Role;
	}

	/**
	 * Removes the jobpos to role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jobPos2RolePK the primary key of the jobpos to role
	 * @return the jobpos to role that was removed
	 * @throws org.oep.usermgt.NoSuchJobPos2RoleException if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos2Role remove(JobPos2RolePK jobPos2RolePK)
		throws NoSuchJobPos2RoleException, SystemException {
		return remove((Serializable)jobPos2RolePK);
	}

	/**
	 * Removes the jobpos to role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jobpos to role
	 * @return the jobpos to role that was removed
	 * @throws org.oep.usermgt.NoSuchJobPos2RoleException if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos2Role remove(Serializable primaryKey)
		throws NoSuchJobPos2RoleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			JobPos2Role jobPos2Role = (JobPos2Role)session.get(JobPos2RoleImpl.class,
					primaryKey);

			if (jobPos2Role == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJobPos2RoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(jobPos2Role);
		}
		catch (NoSuchJobPos2RoleException nsee) {
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
	protected JobPos2Role removeImpl(JobPos2Role jobPos2Role)
		throws SystemException {
		jobPos2Role = toUnwrappedModel(jobPos2Role);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jobPos2Role)) {
				jobPos2Role = (JobPos2Role)session.get(JobPos2RoleImpl.class,
						jobPos2Role.getPrimaryKeyObj());
			}

			if (jobPos2Role != null) {
				session.delete(jobPos2Role);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (jobPos2Role != null) {
			clearCache(jobPos2Role);
		}

		return jobPos2Role;
	}

	@Override
	public JobPos2Role updateImpl(org.oep.usermgt.model.JobPos2Role jobPos2Role)
		throws SystemException {
		jobPos2Role = toUnwrappedModel(jobPos2Role);

		boolean isNew = jobPos2Role.isNew();

		JobPos2RoleModelImpl jobPos2RoleModelImpl = (JobPos2RoleModelImpl)jobPos2Role;

		Session session = null;

		try {
			session = openSession();

			if (jobPos2Role.isNew()) {
				session.save(jobPos2Role);

				jobPos2Role.setNew(false);
			}
			else {
				session.merge(jobPos2Role);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !JobPos2RoleModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((jobPos2RoleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						jobPos2RoleModelImpl.getOriginalRoleId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_R, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R,
					args);

				args = new Object[] { jobPos2RoleModelImpl.getRoleId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_R, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_R,
					args);
			}

			if ((jobPos2RoleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JP.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						jobPos2RoleModelImpl.getOriginalJobPosId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_JP, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JP,
					args);

				args = new Object[] { jobPos2RoleModelImpl.getJobPosId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_JP, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JP,
					args);
			}
		}

		EntityCacheUtil.putResult(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
			JobPos2RoleImpl.class, jobPos2Role.getPrimaryKey(), jobPos2Role);

		return jobPos2Role;
	}

	protected JobPos2Role toUnwrappedModel(JobPos2Role jobPos2Role) {
		if (jobPos2Role instanceof JobPos2RoleImpl) {
			return jobPos2Role;
		}

		JobPos2RoleImpl jobPos2RoleImpl = new JobPos2RoleImpl();

		jobPos2RoleImpl.setNew(jobPos2Role.isNew());
		jobPos2RoleImpl.setPrimaryKey(jobPos2Role.getPrimaryKey());

		jobPos2RoleImpl.setJobPosId(jobPos2Role.getJobPosId());
		jobPos2RoleImpl.setRoleId(jobPos2Role.getRoleId());

		return jobPos2RoleImpl;
	}

	/**
	 * Returns the jobpos to role with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the jobpos to role
	 * @return the jobpos to role
	 * @throws org.oep.usermgt.NoSuchJobPos2RoleException if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos2Role findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJobPos2RoleException, SystemException {
		JobPos2Role jobPos2Role = fetchByPrimaryKey(primaryKey);

		if (jobPos2Role == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJobPos2RoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return jobPos2Role;
	}

	/**
	 * Returns the jobpos to role with the primary key or throws a {@link org.oep.usermgt.NoSuchJobPos2RoleException} if it could not be found.
	 *
	 * @param jobPos2RolePK the primary key of the jobpos to role
	 * @return the jobpos to role
	 * @throws org.oep.usermgt.NoSuchJobPos2RoleException if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos2Role findByPrimaryKey(JobPos2RolePK jobPos2RolePK)
		throws NoSuchJobPos2RoleException, SystemException {
		return findByPrimaryKey((Serializable)jobPos2RolePK);
	}

	/**
	 * Returns the jobpos to role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jobpos to role
	 * @return the jobpos to role, or <code>null</code> if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos2Role fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		JobPos2Role jobPos2Role = (JobPos2Role)EntityCacheUtil.getResult(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
				JobPos2RoleImpl.class, primaryKey);

		if (jobPos2Role == _nullJobPos2Role) {
			return null;
		}

		if (jobPos2Role == null) {
			Session session = null;

			try {
				session = openSession();

				jobPos2Role = (JobPos2Role)session.get(JobPos2RoleImpl.class,
						primaryKey);

				if (jobPos2Role != null) {
					cacheResult(jobPos2Role);
				}
				else {
					EntityCacheUtil.putResult(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
						JobPos2RoleImpl.class, primaryKey, _nullJobPos2Role);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(JobPos2RoleModelImpl.ENTITY_CACHE_ENABLED,
					JobPos2RoleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return jobPos2Role;
	}

	/**
	 * Returns the jobpos to role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jobPos2RolePK the primary key of the jobpos to role
	 * @return the jobpos to role, or <code>null</code> if a jobpos to role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos2Role fetchByPrimaryKey(JobPos2RolePK jobPos2RolePK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)jobPos2RolePK);
	}

	/**
	 * Returns all the jobpos to roles.
	 *
	 * @return the jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos2Role> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jobpos to roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of jobpos to roles
	 * @param end the upper bound of the range of jobpos to roles (not inclusive)
	 * @return the range of jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos2Role> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jobpos to roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPos2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of jobpos to roles
	 * @param end the upper bound of the range of jobpos to roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jobpos to roles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos2Role> findAll(int start, int end,
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

		List<JobPos2Role> list = (List<JobPos2Role>)FinderCacheUtil.getResult(finderPath,
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
					sql = sql.concat(JobPos2RoleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<JobPos2Role>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<JobPos2Role>(list);
				}
				else {
					list = (List<JobPos2Role>)QueryUtil.list(q, getDialect(),
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
		for (JobPos2Role jobPos2Role : findAll()) {
			remove(jobPos2Role);
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
						"value.object.listener.org.oep.usermgt.model.JobPos2Role")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<JobPos2Role>> listenersList = new ArrayList<ModelListener<JobPos2Role>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<JobPos2Role>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(JobPos2RoleImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_JOBPOS2ROLE = "SELECT jobPos2Role FROM JobPos2Role jobPos2Role";
	private static final String _SQL_SELECT_JOBPOS2ROLE_WHERE = "SELECT jobPos2Role FROM JobPos2Role jobPos2Role WHERE ";
	private static final String _SQL_COUNT_JOBPOS2ROLE = "SELECT COUNT(jobPos2Role) FROM JobPos2Role jobPos2Role";
	private static final String _SQL_COUNT_JOBPOS2ROLE_WHERE = "SELECT COUNT(jobPos2Role) FROM JobPos2Role jobPos2Role WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jobPos2Role.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No JobPos2Role exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No JobPos2Role exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(JobPos2RolePersistenceImpl.class);
	private static JobPos2Role _nullJobPos2Role = new JobPos2RoleImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<JobPos2Role> toCacheModel() {
				return _nullJobPos2RoleCacheModel;
			}
		};

	private static CacheModel<JobPos2Role> _nullJobPos2RoleCacheModel = new CacheModel<JobPos2Role>() {
			@Override
			public JobPos2Role toEntityModel() {
				return _nullJobPos2Role;
			}
		};
}