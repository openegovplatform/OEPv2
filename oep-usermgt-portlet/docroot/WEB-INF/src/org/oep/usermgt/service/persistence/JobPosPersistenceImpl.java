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

import com.liferay.portal.kernel.bean.BeanReference;
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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import org.oep.usermgt.NoSuchJobPosException;
import org.oep.usermgt.model.JobPos;
import org.oep.usermgt.model.impl.JobPosImpl;
import org.oep.usermgt.model.impl.JobPosModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the Job Pos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see JobPosPersistence
 * @see JobPosUtil
 * @generated
 */
public class JobPosPersistenceImpl extends BasePersistenceImpl<JobPos>
	implements JobPosPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link JobPosUtil} to access the Job Pos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = JobPosImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC",
			new String[] { Long.class.getName() },
			JobPosModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the Job Poses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByC(long companyId) throws SystemException {
		return findByC(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Job Poses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @return the range of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByC(long companyId, int start, int end)
		throws SystemException {
		return findByC(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Job Poses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByC(long companyId, int start, int end,
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

		List<JobPos> list = (List<JobPos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (JobPos jobPos : list) {
				if ((companyId != jobPos.getCompanyId())) {
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

			query.append(_SQL_SELECT_JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(JobPosModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<JobPos>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<JobPos>(list);
				}
				else {
					list = (List<JobPos>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first Job Pos in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos findByC_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = fetchByC_First(companyId, orderByComparator);

		if (jobPos != null) {
			return jobPos;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPosException(msg.toString());
	}

	/**
	 * Returns the first Job Pos in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos fetchByC_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<JobPos> list = findByC(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Job Pos in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos findByC_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = fetchByC_Last(companyId, orderByComparator);

		if (jobPos != null) {
			return jobPos;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPosException(msg.toString());
	}

	/**
	 * Returns the last Job Pos in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos fetchByC_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC(companyId);

		if (count == 0) {
			return null;
		}

		List<JobPos> list = findByC(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Job Poses before and after the current Job Pos in the ordered set where companyId = &#63;.
	 *
	 * @param jobPosId the primary key of the current Job Pos
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos[] findByC_PrevAndNext(long jobPosId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = findByPrimaryKey(jobPosId);

		Session session = null;

		try {
			session = openSession();

			JobPos[] array = new JobPosImpl[3];

			array[0] = getByC_PrevAndNext(session, jobPos, companyId,
					orderByComparator, true);

			array[1] = jobPos;

			array[2] = getByC_PrevAndNext(session, jobPos, companyId,
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

	protected JobPos getByC_PrevAndNext(Session session, JobPos jobPos,
		long companyId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JOBPOS_WHERE);

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
			query.append(JobPosModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jobPos);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<JobPos> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Job Poses where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC(long companyId) throws SystemException {
		for (JobPos jobPos : findByC(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(jobPos);
		}
	}

	/**
	 * Returns the number of Job Poses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching Job Poses
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

			query.append(_SQL_COUNT_JOBPOS_WHERE);

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

	private static final String _FINDER_COLUMN_C_COMPANYID_2 = "jobPos.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG",
			new String[] { Long.class.getName() },
			JobPosModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the Job Poses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByG(long groupId) throws SystemException {
		return findByG(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Job Poses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @return the range of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByG(long groupId, int start, int end)
		throws SystemException {
		return findByG(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Job Poses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByG(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<JobPos> list = (List<JobPos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (JobPos jobPos : list) {
				if ((groupId != jobPos.getGroupId())) {
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

			query.append(_SQL_SELECT_JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(JobPosModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<JobPos>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<JobPos>(list);
				}
				else {
					list = (List<JobPos>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first Job Pos in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos findByG_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = fetchByG_First(groupId, orderByComparator);

		if (jobPos != null) {
			return jobPos;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPosException(msg.toString());
	}

	/**
	 * Returns the first Job Pos in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos fetchByG_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<JobPos> list = findByG(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Job Pos in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos findByG_Last(long groupId, OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = fetchByG_Last(groupId, orderByComparator);

		if (jobPos != null) {
			return jobPos;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPosException(msg.toString());
	}

	/**
	 * Returns the last Job Pos in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos fetchByG_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG(groupId);

		if (count == 0) {
			return null;
		}

		List<JobPos> list = findByG(groupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Job Poses before and after the current Job Pos in the ordered set where groupId = &#63;.
	 *
	 * @param jobPosId the primary key of the current Job Pos
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos[] findByG_PrevAndNext(long jobPosId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = findByPrimaryKey(jobPosId);

		Session session = null;

		try {
			session = openSession();

			JobPos[] array = new JobPosImpl[3];

			array[0] = getByG_PrevAndNext(session, jobPos, groupId,
					orderByComparator, true);

			array[1] = jobPos;

			array[2] = getByG_PrevAndNext(session, jobPos, groupId,
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

	protected JobPos getByG_PrevAndNext(Session session, JobPos jobPos,
		long groupId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JOBPOS_WHERE);

		query.append(_FINDER_COLUMN_G_GROUPID_2);

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
			query.append(JobPosModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jobPos);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<JobPos> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Job Poses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG(long groupId) throws SystemException {
		for (JobPos jobPos : findByG(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(jobPos);
		}
	}

	/**
	 * Returns the number of Job Poses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_G_GROUPID_2 = "jobPos.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WU = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByWU",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByWU",
			new String[] { Long.class.getName() },
			JobPosModelImpl.WORKINGUNITID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WU = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByWU",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the Job Poses where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @return the matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByWU(long workingUnitId) throws SystemException {
		return findByWU(workingUnitId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the Job Poses where workingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @return the range of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByWU(long workingUnitId, int start, int end)
		throws SystemException {
		return findByWU(workingUnitId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Job Poses where workingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByWU(long workingUnitId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU;
			finderArgs = new Object[] { workingUnitId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WU;
			finderArgs = new Object[] {
					workingUnitId,
					
					start, end, orderByComparator
				};
		}

		List<JobPos> list = (List<JobPos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (JobPos jobPos : list) {
				if ((workingUnitId != jobPos.getWorkingUnitId())) {
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

			query.append(_SQL_SELECT_JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_WU_WORKINGUNITID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(JobPosModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

				if (!pagination) {
					list = (List<JobPos>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<JobPos>(list);
				}
				else {
					list = (List<JobPos>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first Job Pos in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos findByWU_First(long workingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = fetchByWU_First(workingUnitId, orderByComparator);

		if (jobPos != null) {
			return jobPos;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPosException(msg.toString());
	}

	/**
	 * Returns the first Job Pos in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos fetchByWU_First(long workingUnitId,
		OrderByComparator orderByComparator) throws SystemException {
		List<JobPos> list = findByWU(workingUnitId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Job Pos in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos findByWU_Last(long workingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = fetchByWU_Last(workingUnitId, orderByComparator);

		if (jobPos != null) {
			return jobPos;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPosException(msg.toString());
	}

	/**
	 * Returns the last Job Pos in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos fetchByWU_Last(long workingUnitId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByWU(workingUnitId);

		if (count == 0) {
			return null;
		}

		List<JobPos> list = findByWU(workingUnitId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Job Poses before and after the current Job Pos in the ordered set where workingUnitId = &#63;.
	 *
	 * @param jobPosId the primary key of the current Job Pos
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos[] findByWU_PrevAndNext(long jobPosId, long workingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = findByPrimaryKey(jobPosId);

		Session session = null;

		try {
			session = openSession();

			JobPos[] array = new JobPosImpl[3];

			array[0] = getByWU_PrevAndNext(session, jobPos, workingUnitId,
					orderByComparator, true);

			array[1] = jobPos;

			array[2] = getByWU_PrevAndNext(session, jobPos, workingUnitId,
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

	protected JobPos getByWU_PrevAndNext(Session session, JobPos jobPos,
		long workingUnitId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JOBPOS_WHERE);

		query.append(_FINDER_COLUMN_WU_WORKINGUNITID_2);

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
			query.append(JobPosModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(workingUnitId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jobPos);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<JobPos> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Job Poses where workingUnitId = &#63; from the database.
	 *
	 * @param workingUnitId the working unit ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByWU(long workingUnitId) throws SystemException {
		for (JobPos jobPos : findByWU(workingUnitId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(jobPos);
		}
	}

	/**
	 * Returns the number of Job Poses where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @return the number of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByWU(long workingUnitId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WU;

		Object[] finderArgs = new Object[] { workingUnitId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_WU_WORKINGUNITID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

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

	private static final String _FINDER_COLUMN_WU_WORKINGUNITID_2 = "jobPos.workingUnitId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WU_PCN = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByWU_PCN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_PCN =
		new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByWU_PCN",
			new String[] { Long.class.getName(), String.class.getName() },
			JobPosModelImpl.WORKINGUNITID_COLUMN_BITMASK |
			JobPosModelImpl.POSITIONCATNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WU_PCN = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByWU_PCN",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the Job Poses where workingUnitId = &#63; and positionCatNo = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param positionCatNo the position cat no
	 * @return the matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByWU_PCN(long workingUnitId, String positionCatNo)
		throws SystemException {
		return findByWU_PCN(workingUnitId, positionCatNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Job Poses where workingUnitId = &#63; and positionCatNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param positionCatNo the position cat no
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @return the range of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByWU_PCN(long workingUnitId, String positionCatNo,
		int start, int end) throws SystemException {
		return findByWU_PCN(workingUnitId, positionCatNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Job Poses where workingUnitId = &#63; and positionCatNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param positionCatNo the position cat no
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByWU_PCN(long workingUnitId, String positionCatNo,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_PCN;
			finderArgs = new Object[] { workingUnitId, positionCatNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WU_PCN;
			finderArgs = new Object[] {
					workingUnitId, positionCatNo,
					
					start, end, orderByComparator
				};
		}

		List<JobPos> list = (List<JobPos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (JobPos jobPos : list) {
				if ((workingUnitId != jobPos.getWorkingUnitId()) ||
						!Validator.equals(positionCatNo,
							jobPos.getPositionCatNo())) {
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

			query.append(_SQL_SELECT_JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_WU_PCN_WORKINGUNITID_2);

			boolean bindPositionCatNo = false;

			if (positionCatNo == null) {
				query.append(_FINDER_COLUMN_WU_PCN_POSITIONCATNO_1);
			}
			else if (positionCatNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_WU_PCN_POSITIONCATNO_3);
			}
			else {
				bindPositionCatNo = true;

				query.append(_FINDER_COLUMN_WU_PCN_POSITIONCATNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(JobPosModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

				if (bindPositionCatNo) {
					qPos.add(positionCatNo);
				}

				if (!pagination) {
					list = (List<JobPos>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<JobPos>(list);
				}
				else {
					list = (List<JobPos>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first Job Pos in the ordered set where workingUnitId = &#63; and positionCatNo = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param positionCatNo the position cat no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos findByWU_PCN_First(long workingUnitId, String positionCatNo,
		OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = fetchByWU_PCN_First(workingUnitId, positionCatNo,
				orderByComparator);

		if (jobPos != null) {
			return jobPos;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(", positionCatNo=");
		msg.append(positionCatNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPosException(msg.toString());
	}

	/**
	 * Returns the first Job Pos in the ordered set where workingUnitId = &#63; and positionCatNo = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param positionCatNo the position cat no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos fetchByWU_PCN_First(long workingUnitId, String positionCatNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<JobPos> list = findByWU_PCN(workingUnitId, positionCatNo, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Job Pos in the ordered set where workingUnitId = &#63; and positionCatNo = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param positionCatNo the position cat no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos findByWU_PCN_Last(long workingUnitId, String positionCatNo,
		OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = fetchByWU_PCN_Last(workingUnitId, positionCatNo,
				orderByComparator);

		if (jobPos != null) {
			return jobPos;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(", positionCatNo=");
		msg.append(positionCatNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPosException(msg.toString());
	}

	/**
	 * Returns the last Job Pos in the ordered set where workingUnitId = &#63; and positionCatNo = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param positionCatNo the position cat no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos fetchByWU_PCN_Last(long workingUnitId, String positionCatNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByWU_PCN(workingUnitId, positionCatNo);

		if (count == 0) {
			return null;
		}

		List<JobPos> list = findByWU_PCN(workingUnitId, positionCatNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Job Poses before and after the current Job Pos in the ordered set where workingUnitId = &#63; and positionCatNo = &#63;.
	 *
	 * @param jobPosId the primary key of the current Job Pos
	 * @param workingUnitId the working unit ID
	 * @param positionCatNo the position cat no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos[] findByWU_PCN_PrevAndNext(long jobPosId, long workingUnitId,
		String positionCatNo, OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = findByPrimaryKey(jobPosId);

		Session session = null;

		try {
			session = openSession();

			JobPos[] array = new JobPosImpl[3];

			array[0] = getByWU_PCN_PrevAndNext(session, jobPos, workingUnitId,
					positionCatNo, orderByComparator, true);

			array[1] = jobPos;

			array[2] = getByWU_PCN_PrevAndNext(session, jobPos, workingUnitId,
					positionCatNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected JobPos getByWU_PCN_PrevAndNext(Session session, JobPos jobPos,
		long workingUnitId, String positionCatNo,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JOBPOS_WHERE);

		query.append(_FINDER_COLUMN_WU_PCN_WORKINGUNITID_2);

		boolean bindPositionCatNo = false;

		if (positionCatNo == null) {
			query.append(_FINDER_COLUMN_WU_PCN_POSITIONCATNO_1);
		}
		else if (positionCatNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_WU_PCN_POSITIONCATNO_3);
		}
		else {
			bindPositionCatNo = true;

			query.append(_FINDER_COLUMN_WU_PCN_POSITIONCATNO_2);
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
			query.append(JobPosModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(workingUnitId);

		if (bindPositionCatNo) {
			qPos.add(positionCatNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jobPos);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<JobPos> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Job Poses where workingUnitId = &#63; and positionCatNo = &#63; from the database.
	 *
	 * @param workingUnitId the working unit ID
	 * @param positionCatNo the position cat no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByWU_PCN(long workingUnitId, String positionCatNo)
		throws SystemException {
		for (JobPos jobPos : findByWU_PCN(workingUnitId, positionCatNo,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(jobPos);
		}
	}

	/**
	 * Returns the number of Job Poses where workingUnitId = &#63; and positionCatNo = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param positionCatNo the position cat no
	 * @return the number of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByWU_PCN(long workingUnitId, String positionCatNo)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WU_PCN;

		Object[] finderArgs = new Object[] { workingUnitId, positionCatNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_WU_PCN_WORKINGUNITID_2);

			boolean bindPositionCatNo = false;

			if (positionCatNo == null) {
				query.append(_FINDER_COLUMN_WU_PCN_POSITIONCATNO_1);
			}
			else if (positionCatNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_WU_PCN_POSITIONCATNO_3);
			}
			else {
				bindPositionCatNo = true;

				query.append(_FINDER_COLUMN_WU_PCN_POSITIONCATNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

				if (bindPositionCatNo) {
					qPos.add(positionCatNo);
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

	private static final String _FINDER_COLUMN_WU_PCN_WORKINGUNITID_2 = "jobPos.workingUnitId = ? AND ";
	private static final String _FINDER_COLUMN_WU_PCN_POSITIONCATNO_1 = "jobPos.positionCatNo IS NULL";
	private static final String _FINDER_COLUMN_WU_PCN_POSITIONCATNO_2 = "jobPos.positionCatNo = ?";
	private static final String _FINDER_COLUMN_WU_PCN_POSITIONCATNO_3 = "(jobPos.positionCatNo IS NULL OR jobPos.positionCatNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WU_L = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByWU_L",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_L = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByWU_L",
			new String[] { Long.class.getName(), Integer.class.getName() },
			JobPosModelImpl.WORKINGUNITID_COLUMN_BITMASK |
			JobPosModelImpl.LEADER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WU_L = new FinderPath(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByWU_L",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the Job Poses where workingUnitId = &#63; and leader = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param leader the leader
	 * @return the matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByWU_L(long workingUnitId, int leader)
		throws SystemException {
		return findByWU_L(workingUnitId, leader, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Job Poses where workingUnitId = &#63; and leader = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param leader the leader
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @return the range of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByWU_L(long workingUnitId, int leader, int start,
		int end) throws SystemException {
		return findByWU_L(workingUnitId, leader, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Job Poses where workingUnitId = &#63; and leader = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param leader the leader
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findByWU_L(long workingUnitId, int leader, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_L;
			finderArgs = new Object[] { workingUnitId, leader };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WU_L;
			finderArgs = new Object[] {
					workingUnitId, leader,
					
					start, end, orderByComparator
				};
		}

		List<JobPos> list = (List<JobPos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (JobPos jobPos : list) {
				if ((workingUnitId != jobPos.getWorkingUnitId()) ||
						(leader != jobPos.getLeader())) {
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

			query.append(_SQL_SELECT_JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_WU_L_WORKINGUNITID_2);

			query.append(_FINDER_COLUMN_WU_L_LEADER_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(JobPosModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

				qPos.add(leader);

				if (!pagination) {
					list = (List<JobPos>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<JobPos>(list);
				}
				else {
					list = (List<JobPos>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first Job Pos in the ordered set where workingUnitId = &#63; and leader = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param leader the leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos findByWU_L_First(long workingUnitId, int leader,
		OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = fetchByWU_L_First(workingUnitId, leader,
				orderByComparator);

		if (jobPos != null) {
			return jobPos;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(", leader=");
		msg.append(leader);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPosException(msg.toString());
	}

	/**
	 * Returns the first Job Pos in the ordered set where workingUnitId = &#63; and leader = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param leader the leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos fetchByWU_L_First(long workingUnitId, int leader,
		OrderByComparator orderByComparator) throws SystemException {
		List<JobPos> list = findByWU_L(workingUnitId, leader, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Job Pos in the ordered set where workingUnitId = &#63; and leader = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param leader the leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos findByWU_L_Last(long workingUnitId, int leader,
		OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = fetchByWU_L_Last(workingUnitId, leader,
				orderByComparator);

		if (jobPos != null) {
			return jobPos;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(", leader=");
		msg.append(leader);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJobPosException(msg.toString());
	}

	/**
	 * Returns the last Job Pos in the ordered set where workingUnitId = &#63; and leader = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param leader the leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos fetchByWU_L_Last(long workingUnitId, int leader,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByWU_L(workingUnitId, leader);

		if (count == 0) {
			return null;
		}

		List<JobPos> list = findByWU_L(workingUnitId, leader, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Job Poses before and after the current Job Pos in the ordered set where workingUnitId = &#63; and leader = &#63;.
	 *
	 * @param jobPosId the primary key of the current Job Pos
	 * @param workingUnitId the working unit ID
	 * @param leader the leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos[] findByWU_L_PrevAndNext(long jobPosId, long workingUnitId,
		int leader, OrderByComparator orderByComparator)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = findByPrimaryKey(jobPosId);

		Session session = null;

		try {
			session = openSession();

			JobPos[] array = new JobPosImpl[3];

			array[0] = getByWU_L_PrevAndNext(session, jobPos, workingUnitId,
					leader, orderByComparator, true);

			array[1] = jobPos;

			array[2] = getByWU_L_PrevAndNext(session, jobPos, workingUnitId,
					leader, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected JobPos getByWU_L_PrevAndNext(Session session, JobPos jobPos,
		long workingUnitId, int leader, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JOBPOS_WHERE);

		query.append(_FINDER_COLUMN_WU_L_WORKINGUNITID_2);

		query.append(_FINDER_COLUMN_WU_L_LEADER_2);

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
			query.append(JobPosModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(workingUnitId);

		qPos.add(leader);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jobPos);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<JobPos> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Job Poses where workingUnitId = &#63; and leader = &#63; from the database.
	 *
	 * @param workingUnitId the working unit ID
	 * @param leader the leader
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByWU_L(long workingUnitId, int leader)
		throws SystemException {
		for (JobPos jobPos : findByWU_L(workingUnitId, leader,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(jobPos);
		}
	}

	/**
	 * Returns the number of Job Poses where workingUnitId = &#63; and leader = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param leader the leader
	 * @return the number of matching Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByWU_L(long workingUnitId, int leader)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WU_L;

		Object[] finderArgs = new Object[] { workingUnitId, leader };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_WU_L_WORKINGUNITID_2);

			query.append(_FINDER_COLUMN_WU_L_LEADER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

				qPos.add(leader);

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

	private static final String _FINDER_COLUMN_WU_L_WORKINGUNITID_2 = "jobPos.workingUnitId = ? AND ";
	private static final String _FINDER_COLUMN_WU_L_LEADER_2 = "jobPos.leader = ?";

	public JobPosPersistenceImpl() {
		setModelClass(JobPos.class);
	}

	/**
	 * Caches the Job Pos in the entity cache if it is enabled.
	 *
	 * @param jobPos the Job Pos
	 */
	@Override
	public void cacheResult(JobPos jobPos) {
		EntityCacheUtil.putResult(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosImpl.class, jobPos.getPrimaryKey(), jobPos);

		jobPos.resetOriginalValues();
	}

	/**
	 * Caches the Job Poses in the entity cache if it is enabled.
	 *
	 * @param jobPoses the Job Poses
	 */
	@Override
	public void cacheResult(List<JobPos> jobPoses) {
		for (JobPos jobPos : jobPoses) {
			if (EntityCacheUtil.getResult(
						JobPosModelImpl.ENTITY_CACHE_ENABLED, JobPosImpl.class,
						jobPos.getPrimaryKey()) == null) {
				cacheResult(jobPos);
			}
			else {
				jobPos.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Job Poses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(JobPosImpl.class.getName());
		}

		EntityCacheUtil.clearCache(JobPosImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Job Pos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JobPos jobPos) {
		EntityCacheUtil.removeResult(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosImpl.class, jobPos.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<JobPos> jobPoses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (JobPos jobPos : jobPoses) {
			EntityCacheUtil.removeResult(JobPosModelImpl.ENTITY_CACHE_ENABLED,
				JobPosImpl.class, jobPos.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Job Pos with the primary key. Does not add the Job Pos to the database.
	 *
	 * @param jobPosId the primary key for the new Job Pos
	 * @return the new Job Pos
	 */
	@Override
	public JobPos create(long jobPosId) {
		JobPos jobPos = new JobPosImpl();

		jobPos.setNew(true);
		jobPos.setPrimaryKey(jobPosId);

		return jobPos;
	}

	/**
	 * Removes the Job Pos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jobPosId the primary key of the Job Pos
	 * @return the Job Pos that was removed
	 * @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos remove(long jobPosId)
		throws NoSuchJobPosException, SystemException {
		return remove((Serializable)jobPosId);
	}

	/**
	 * Removes the Job Pos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Job Pos
	 * @return the Job Pos that was removed
	 * @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos remove(Serializable primaryKey)
		throws NoSuchJobPosException, SystemException {
		Session session = null;

		try {
			session = openSession();

			JobPos jobPos = (JobPos)session.get(JobPosImpl.class, primaryKey);

			if (jobPos == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJobPosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(jobPos);
		}
		catch (NoSuchJobPosException nsee) {
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
	protected JobPos removeImpl(JobPos jobPos) throws SystemException {
		jobPos = toUnwrappedModel(jobPos);

		jobPosToEmployeeTableMapper.deleteLeftPrimaryKeyTableMappings(jobPos.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jobPos)) {
				jobPos = (JobPos)session.get(JobPosImpl.class,
						jobPos.getPrimaryKeyObj());
			}

			if (jobPos != null) {
				session.delete(jobPos);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (jobPos != null) {
			clearCache(jobPos);
		}

		return jobPos;
	}

	@Override
	public JobPos updateImpl(org.oep.usermgt.model.JobPos jobPos)
		throws SystemException {
		jobPos = toUnwrappedModel(jobPos);

		boolean isNew = jobPos.isNew();

		JobPosModelImpl jobPosModelImpl = (JobPosModelImpl)jobPos;

		Session session = null;

		try {
			session = openSession();

			if (jobPos.isNew()) {
				session.save(jobPos);

				jobPos.setNew(false);
			}
			else {
				session.merge(jobPos);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !JobPosModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((jobPosModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						jobPosModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);

				args = new Object[] { jobPosModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);
			}

			if ((jobPosModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						jobPosModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G,
					args);

				args = new Object[] { jobPosModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G,
					args);
			}

			if ((jobPosModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						jobPosModelImpl.getOriginalWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WU, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU,
					args);

				args = new Object[] { jobPosModelImpl.getWorkingUnitId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WU, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU,
					args);
			}

			if ((jobPosModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_PCN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						jobPosModelImpl.getOriginalWorkingUnitId(),
						jobPosModelImpl.getOriginalPositionCatNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WU_PCN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_PCN,
					args);

				args = new Object[] {
						jobPosModelImpl.getWorkingUnitId(),
						jobPosModelImpl.getPositionCatNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WU_PCN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_PCN,
					args);
			}

			if ((jobPosModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						jobPosModelImpl.getOriginalWorkingUnitId(),
						jobPosModelImpl.getOriginalLeader()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WU_L, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_L,
					args);

				args = new Object[] {
						jobPosModelImpl.getWorkingUnitId(),
						jobPosModelImpl.getLeader()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WU_L, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WU_L,
					args);
			}
		}

		EntityCacheUtil.putResult(JobPosModelImpl.ENTITY_CACHE_ENABLED,
			JobPosImpl.class, jobPos.getPrimaryKey(), jobPos);

		return jobPos;
	}

	protected JobPos toUnwrappedModel(JobPos jobPos) {
		if (jobPos instanceof JobPosImpl) {
			return jobPos;
		}

		JobPosImpl jobPosImpl = new JobPosImpl();

		jobPosImpl.setNew(jobPos.isNew());
		jobPosImpl.setPrimaryKey(jobPos.getPrimaryKey());

		jobPosImpl.setJobPosId(jobPos.getJobPosId());
		jobPosImpl.setCompanyId(jobPos.getCompanyId());
		jobPosImpl.setGroupId(jobPos.getGroupId());
		jobPosImpl.setUserId(jobPos.getUserId());
		jobPosImpl.setCreateDate(jobPos.getCreateDate());
		jobPosImpl.setModifiedDate(jobPos.getModifiedDate());
		jobPosImpl.setTitle(jobPos.getTitle());
		jobPosImpl.setPositionCatNo(jobPos.getPositionCatNo());
		jobPosImpl.setWorkingUnitId(jobPos.getWorkingUnitId());
		jobPosImpl.setSubWorkingUnitId(jobPos.getSubWorkingUnitId());
		jobPosImpl.setLeader(jobPos.getLeader());

		return jobPosImpl;
	}

	/**
	 * Returns the Job Pos with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Job Pos
	 * @return the Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJobPosException, SystemException {
		JobPos jobPos = fetchByPrimaryKey(primaryKey);

		if (jobPos == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJobPosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return jobPos;
	}

	/**
	 * Returns the Job Pos with the primary key or throws a {@link org.oep.usermgt.NoSuchJobPosException} if it could not be found.
	 *
	 * @param jobPosId the primary key of the Job Pos
	 * @return the Job Pos
	 * @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos findByPrimaryKey(long jobPosId)
		throws NoSuchJobPosException, SystemException {
		return findByPrimaryKey((Serializable)jobPosId);
	}

	/**
	 * Returns the Job Pos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Job Pos
	 * @return the Job Pos, or <code>null</code> if a Job Pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		JobPos jobPos = (JobPos)EntityCacheUtil.getResult(JobPosModelImpl.ENTITY_CACHE_ENABLED,
				JobPosImpl.class, primaryKey);

		if (jobPos == _nullJobPos) {
			return null;
		}

		if (jobPos == null) {
			Session session = null;

			try {
				session = openSession();

				jobPos = (JobPos)session.get(JobPosImpl.class, primaryKey);

				if (jobPos != null) {
					cacheResult(jobPos);
				}
				else {
					EntityCacheUtil.putResult(JobPosModelImpl.ENTITY_CACHE_ENABLED,
						JobPosImpl.class, primaryKey, _nullJobPos);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(JobPosModelImpl.ENTITY_CACHE_ENABLED,
					JobPosImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return jobPos;
	}

	/**
	 * Returns the Job Pos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jobPosId the primary key of the Job Pos
	 * @return the Job Pos, or <code>null</code> if a Job Pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobPos fetchByPrimaryKey(long jobPosId) throws SystemException {
		return fetchByPrimaryKey((Serializable)jobPosId);
	}

	/**
	 * Returns all the Job Poses.
	 *
	 * @return the Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Job Poses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @return the range of Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Job Poses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> findAll(int start, int end,
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

		List<JobPos> list = (List<JobPos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_JOBPOS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JOBPOS;

				if (pagination) {
					sql = sql.concat(JobPosModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<JobPos>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<JobPos>(list);
				}
				else {
					list = (List<JobPos>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the Job Poses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (JobPos jobPos : findAll()) {
			remove(jobPos);
		}
	}

	/**
	 * Returns the number of Job Poses.
	 *
	 * @return the number of Job Poses
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

				Query q = session.createQuery(_SQL_COUNT_JOBPOS);

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
	 * Returns all the employees associated with the Job Pos.
	 *
	 * @param pk the primary key of the Job Pos
	 * @return the employees associated with the Job Pos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.usermgt.model.Employee> getEmployees(long pk)
		throws SystemException {
		return getEmployees(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the employees associated with the Job Pos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the Job Pos
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @return the range of employees associated with the Job Pos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.usermgt.model.Employee> getEmployees(long pk,
		int start, int end) throws SystemException {
		return getEmployees(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employees associated with the Job Pos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the Job Pos
	 * @param start the lower bound of the range of Job Poses
	 * @param end the upper bound of the range of Job Poses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employees associated with the Job Pos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.usermgt.model.Employee> getEmployees(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return jobPosToEmployeeTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of employees associated with the Job Pos.
	 *
	 * @param pk the primary key of the Job Pos
	 * @return the number of employees associated with the Job Pos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getEmployeesSize(long pk) throws SystemException {
		long[] pks = jobPosToEmployeeTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the employee is associated with the Job Pos.
	 *
	 * @param pk the primary key of the Job Pos
	 * @param employeePK the primary key of the employee
	 * @return <code>true</code> if the employee is associated with the Job Pos; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsEmployee(long pk, long employeePK)
		throws SystemException {
		return jobPosToEmployeeTableMapper.containsTableMapping(pk, employeePK);
	}

	/**
	 * Returns <code>true</code> if the Job Pos has any employees associated with it.
	 *
	 * @param pk the primary key of the Job Pos to check for associations with employees
	 * @return <code>true</code> if the Job Pos has any employees associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsEmployees(long pk) throws SystemException {
		if (getEmployeesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the Job Pos and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the Job Pos
	 * @param employeePK the primary key of the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployee(long pk, long employeePK) throws SystemException {
		jobPosToEmployeeTableMapper.addTableMapping(pk, employeePK);
	}

	/**
	 * Adds an association between the Job Pos and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the Job Pos
	 * @param employee the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployee(long pk, org.oep.usermgt.model.Employee employee)
		throws SystemException {
		jobPosToEmployeeTableMapper.addTableMapping(pk, employee.getPrimaryKey());
	}

	/**
	 * Adds an association between the Job Pos and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the Job Pos
	 * @param employeePKs the primary keys of the employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployees(long pk, long[] employeePKs)
		throws SystemException {
		for (long employeePK : employeePKs) {
			jobPosToEmployeeTableMapper.addTableMapping(pk, employeePK);
		}
	}

	/**
	 * Adds an association between the Job Pos and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the Job Pos
	 * @param employees the employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployees(long pk,
		List<org.oep.usermgt.model.Employee> employees)
		throws SystemException {
		for (org.oep.usermgt.model.Employee employee : employees) {
			jobPosToEmployeeTableMapper.addTableMapping(pk,
				employee.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the Job Pos and its employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the Job Pos to clear the associated employees from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearEmployees(long pk) throws SystemException {
		jobPosToEmployeeTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the Job Pos and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the Job Pos
	 * @param employeePK the primary key of the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeEmployee(long pk, long employeePK)
		throws SystemException {
		jobPosToEmployeeTableMapper.deleteTableMapping(pk, employeePK);
	}

	/**
	 * Removes the association between the Job Pos and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the Job Pos
	 * @param employee the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeEmployee(long pk, org.oep.usermgt.model.Employee employee)
		throws SystemException {
		jobPosToEmployeeTableMapper.deleteTableMapping(pk,
			employee.getPrimaryKey());
	}

	/**
	 * Removes the association between the Job Pos and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the Job Pos
	 * @param employeePKs the primary keys of the employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeEmployees(long pk, long[] employeePKs)
		throws SystemException {
		for (long employeePK : employeePKs) {
			jobPosToEmployeeTableMapper.deleteTableMapping(pk, employeePK);
		}
	}

	/**
	 * Removes the association between the Job Pos and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the Job Pos
	 * @param employees the employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeEmployees(long pk,
		List<org.oep.usermgt.model.Employee> employees)
		throws SystemException {
		for (org.oep.usermgt.model.Employee employee : employees) {
			jobPosToEmployeeTableMapper.deleteTableMapping(pk,
				employee.getPrimaryKey());
		}
	}

	/**
	 * Sets the employees associated with the Job Pos, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the Job Pos
	 * @param employeePKs the primary keys of the employees to be associated with the Job Pos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setEmployees(long pk, long[] employeePKs)
		throws SystemException {
		Set<Long> newEmployeePKsSet = SetUtil.fromArray(employeePKs);
		Set<Long> oldEmployeePKsSet = SetUtil.fromArray(jobPosToEmployeeTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeEmployeePKsSet = new HashSet<Long>(oldEmployeePKsSet);

		removeEmployeePKsSet.removeAll(newEmployeePKsSet);

		for (long removeEmployeePK : removeEmployeePKsSet) {
			jobPosToEmployeeTableMapper.deleteTableMapping(pk, removeEmployeePK);
		}

		newEmployeePKsSet.removeAll(oldEmployeePKsSet);

		for (long newEmployeePK : newEmployeePKsSet) {
			jobPosToEmployeeTableMapper.addTableMapping(pk, newEmployeePK);
		}
	}

	/**
	 * Sets the employees associated with the Job Pos, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the Job Pos
	 * @param employees the employees to be associated with the Job Pos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setEmployees(long pk,
		List<org.oep.usermgt.model.Employee> employees)
		throws SystemException {
		try {
			long[] employeePKs = new long[employees.size()];

			for (int i = 0; i < employees.size(); i++) {
				org.oep.usermgt.model.Employee employee = employees.get(i);

				employeePKs[i] = employee.getPrimaryKey();
			}

			setEmployees(pk, employeePKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(JobPosModelImpl.MAPPING_TABLE_OEP_USERMGT_EMPLOYEE2JOBPOS_NAME);
		}
	}

	/**
	 * Initializes the Job Pos persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.usermgt.model.JobPos")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<JobPos>> listenersList = new ArrayList<ModelListener<JobPos>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<JobPos>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		jobPosToEmployeeTableMapper = TableMapperFactory.getTableMapper("oep_usermgt_employee2jobpos",
				"jobPosId", "employeeId", this, employeePersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(JobPosImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = EmployeePersistence.class)
	protected EmployeePersistence employeePersistence;
	protected TableMapper<JobPos, org.oep.usermgt.model.Employee> jobPosToEmployeeTableMapper;
	private static final String _SQL_SELECT_JOBPOS = "SELECT jobPos FROM JobPos jobPos";
	private static final String _SQL_SELECT_JOBPOS_WHERE = "SELECT jobPos FROM JobPos jobPos WHERE ";
	private static final String _SQL_COUNT_JOBPOS = "SELECT COUNT(jobPos) FROM JobPos jobPos";
	private static final String _SQL_COUNT_JOBPOS_WHERE = "SELECT COUNT(jobPos) FROM JobPos jobPos WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jobPos.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No JobPos exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No JobPos exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(JobPosPersistenceImpl.class);
	private static JobPos _nullJobPos = new JobPosImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<JobPos> toCacheModel() {
				return _nullJobPosCacheModel;
			}
		};

	private static CacheModel<JobPos> _nullJobPosCacheModel = new CacheModel<JobPos>() {
			@Override
			public JobPos toEntityModel() {
				return _nullJobPos;
			}
		};
}