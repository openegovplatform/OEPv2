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

import org.oep.core.ssomgt.NoSuchAppRole2JobPosException;
import org.oep.core.ssomgt.model.AppRole2JobPos;
import org.oep.core.ssomgt.model.impl.AppRole2JobPosImpl;
import org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the app role2 job pos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see AppRole2JobPosPersistence
 * @see AppRole2JobPosUtil
 * @generated
 */
public class AppRole2JobPosPersistenceImpl extends BasePersistenceImpl<AppRole2JobPos>
	implements AppRole2JobPosPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AppRole2JobPosUtil} to access the app role2 job pos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AppRole2JobPosImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosModelImpl.FINDER_CACHE_ENABLED,
			AppRole2JobPosImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosModelImpl.FINDER_CACHE_ENABLED,
			AppRole2JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C = new FinderPath(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosModelImpl.FINDER_CACHE_ENABLED,
			AppRole2JobPosImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C = new FinderPath(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosModelImpl.FINDER_CACHE_ENABLED,
			AppRole2JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC",
			new String[] { Long.class.getName() },
			AppRole2JobPosModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the app role2 job poses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2JobPos> findByC(long companyId)
		throws SystemException {
		return findByC(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 job poses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of app role2 job poses
	 * @param end the upper bound of the range of app role2 job poses (not inclusive)
	 * @return the range of matching app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2JobPos> findByC(long companyId, int start, int end)
		throws SystemException {
		return findByC(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 job poses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of app role2 job poses
	 * @param end the upper bound of the range of app role2 job poses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2JobPos> findByC(long companyId, int start, int end,
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

		List<AppRole2JobPos> list = (List<AppRole2JobPos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole2JobPos appRole2JobPos : list) {
				if ((companyId != appRole2JobPos.getCompanyId())) {
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

			query.append(_SQL_SELECT_APPROLE2JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRole2JobPosModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<AppRole2JobPos>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2JobPos>(list);
				}
				else {
					list = (List<AppRole2JobPos>)QueryUtil.list(q,
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
	 * Returns the first app role2 job pos in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 job pos
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos findByC_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2JobPosException, SystemException {
		AppRole2JobPos appRole2JobPos = fetchByC_First(companyId,
				orderByComparator);

		if (appRole2JobPos != null) {
			return appRole2JobPos;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2JobPosException(msg.toString());
	}

	/**
	 * Returns the first app role2 job pos in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos fetchByC_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AppRole2JobPos> list = findByC(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app role2 job pos in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 job pos
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos findByC_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2JobPosException, SystemException {
		AppRole2JobPos appRole2JobPos = fetchByC_Last(companyId,
				orderByComparator);

		if (appRole2JobPos != null) {
			return appRole2JobPos;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2JobPosException(msg.toString());
	}

	/**
	 * Returns the last app role2 job pos in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos fetchByC_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC(companyId);

		if (count == 0) {
			return null;
		}

		List<AppRole2JobPos> list = findByC(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app role2 job poses before and after the current app role2 job pos in the ordered set where companyId = &#63;.
	 *
	 * @param appRole2JobPosId the primary key of the current app role2 job pos
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app role2 job pos
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos[] findByC_PrevAndNext(long appRole2JobPosId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchAppRole2JobPosException, SystemException {
		AppRole2JobPos appRole2JobPos = findByPrimaryKey(appRole2JobPosId);

		Session session = null;

		try {
			session = openSession();

			AppRole2JobPos[] array = new AppRole2JobPosImpl[3];

			array[0] = getByC_PrevAndNext(session, appRole2JobPos, companyId,
					orderByComparator, true);

			array[1] = appRole2JobPos;

			array[2] = getByC_PrevAndNext(session, appRole2JobPos, companyId,
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

	protected AppRole2JobPos getByC_PrevAndNext(Session session,
		AppRole2JobPos appRole2JobPos, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPROLE2JOBPOS_WHERE);

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
			query.append(AppRole2JobPosModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appRole2JobPos);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppRole2JobPos> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app role2 job poses where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC(long companyId) throws SystemException {
		for (AppRole2JobPos appRole2JobPos : findByC(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appRole2JobPos);
		}
	}

	/**
	 * Returns the number of app role2 job poses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching app role2 job poses
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

			query.append(_SQL_COUNT_APPROLE2JOBPOS_WHERE);

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

	private static final String _FINDER_COLUMN_C_COMPANYID_2 = "appRole2JobPos.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G = new FinderPath(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosModelImpl.FINDER_CACHE_ENABLED,
			AppRole2JobPosImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G = new FinderPath(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosModelImpl.FINDER_CACHE_ENABLED,
			AppRole2JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			AppRole2JobPosModelImpl.COMPANYID_COLUMN_BITMASK |
			AppRole2JobPosModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the app role2 job poses where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2JobPos> findByC_G(long companyId, long groupId)
		throws SystemException {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 job poses where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of app role2 job poses
	 * @param end the upper bound of the range of app role2 job poses (not inclusive)
	 * @return the range of matching app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2JobPos> findByC_G(long companyId, long groupId,
		int start, int end) throws SystemException {
		return findByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 job poses where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of app role2 job poses
	 * @param end the upper bound of the range of app role2 job poses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2JobPos> findByC_G(long companyId, long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<AppRole2JobPos> list = (List<AppRole2JobPos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole2JobPos appRole2JobPos : list) {
				if ((companyId != appRole2JobPos.getCompanyId()) ||
						(groupId != appRole2JobPos.getGroupId())) {
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

			query.append(_SQL_SELECT_APPROLE2JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRole2JobPosModelImpl.ORDER_BY_JPQL);
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
					list = (List<AppRole2JobPos>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2JobPos>(list);
				}
				else {
					list = (List<AppRole2JobPos>)QueryUtil.list(q,
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
	 * Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 job pos
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos findByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2JobPosException, SystemException {
		AppRole2JobPos appRole2JobPos = fetchByC_G_First(companyId, groupId,
				orderByComparator);

		if (appRole2JobPos != null) {
			return appRole2JobPos;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2JobPosException(msg.toString());
	}

	/**
	 * Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos fetchByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AppRole2JobPos> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 job pos
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos findByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2JobPosException, SystemException {
		AppRole2JobPos appRole2JobPos = fetchByC_G_Last(companyId, groupId,
				orderByComparator);

		if (appRole2JobPos != null) {
			return appRole2JobPos;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2JobPosException(msg.toString());
	}

	/**
	 * Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos fetchByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_G(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<AppRole2JobPos> list = findByC_G(companyId, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app role2 job poses before and after the current app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param appRole2JobPosId the primary key of the current app role2 job pos
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app role2 job pos
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos[] findByC_G_PrevAndNext(long appRole2JobPosId,
		long companyId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchAppRole2JobPosException, SystemException {
		AppRole2JobPos appRole2JobPos = findByPrimaryKey(appRole2JobPosId);

		Session session = null;

		try {
			session = openSession();

			AppRole2JobPos[] array = new AppRole2JobPosImpl[3];

			array[0] = getByC_G_PrevAndNext(session, appRole2JobPos, companyId,
					groupId, orderByComparator, true);

			array[1] = appRole2JobPos;

			array[2] = getByC_G_PrevAndNext(session, appRole2JobPos, companyId,
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

	protected AppRole2JobPos getByC_G_PrevAndNext(Session session,
		AppRole2JobPos appRole2JobPos, long companyId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPROLE2JOBPOS_WHERE);

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
			query.append(AppRole2JobPosModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appRole2JobPos);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppRole2JobPos> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app role2 job poses where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G(long companyId, long groupId)
		throws SystemException {
		for (AppRole2JobPos appRole2JobPos : findByC_G(companyId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appRole2JobPos);
		}
	}

	/**
	 * Returns the number of app role2 job poses where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching app role2 job poses
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

			query.append(_SQL_COUNT_APPROLE2JOBPOS_WHERE);

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

	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "appRole2JobPos.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "appRole2JobPos.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_AR = new FinderPath(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosModelImpl.FINDER_CACHE_ENABLED,
			AppRole2JobPosImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_G_AR",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_AR =
		new FinderPath(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosModelImpl.FINDER_CACHE_ENABLED,
			AppRole2JobPosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G_AR",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			AppRole2JobPosModelImpl.COMPANYID_COLUMN_BITMASK |
			AppRole2JobPosModelImpl.GROUPID_COLUMN_BITMASK |
			AppRole2JobPosModelImpl.APPROLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_AR = new FinderPath(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_AR",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @return the matching app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2JobPos> findByC_G_AR(long companyId, long groupId,
		long appRoleId) throws SystemException {
		return findByC_G_AR(companyId, groupId, appRoleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param start the lower bound of the range of app role2 job poses
	 * @param end the upper bound of the range of app role2 job poses (not inclusive)
	 * @return the range of matching app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2JobPos> findByC_G_AR(long companyId, long groupId,
		long appRoleId, int start, int end) throws SystemException {
		return findByC_G_AR(companyId, groupId, appRoleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param start the lower bound of the range of app role2 job poses
	 * @param end the upper bound of the range of app role2 job poses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2JobPos> findByC_G_AR(long companyId, long groupId,
		long appRoleId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_AR;
			finderArgs = new Object[] { companyId, groupId, appRoleId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_AR;
			finderArgs = new Object[] {
					companyId, groupId, appRoleId,
					
					start, end, orderByComparator
				};
		}

		List<AppRole2JobPos> list = (List<AppRole2JobPos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AppRole2JobPos appRole2JobPos : list) {
				if ((companyId != appRole2JobPos.getCompanyId()) ||
						(groupId != appRole2JobPos.getGroupId()) ||
						(appRoleId != appRole2JobPos.getAppRoleId())) {
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

			query.append(_SQL_SELECT_APPROLE2JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_C_G_AR_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_AR_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_AR_APPROLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AppRole2JobPosModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(appRoleId);

				if (!pagination) {
					list = (List<AppRole2JobPos>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2JobPos>(list);
				}
				else {
					list = (List<AppRole2JobPos>)QueryUtil.list(q,
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
	 * Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 job pos
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos findByC_G_AR_First(long companyId, long groupId,
		long appRoleId, OrderByComparator orderByComparator)
		throws NoSuchAppRole2JobPosException, SystemException {
		AppRole2JobPos appRole2JobPos = fetchByC_G_AR_First(companyId, groupId,
				appRoleId, orderByComparator);

		if (appRole2JobPos != null) {
			return appRole2JobPos;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", appRoleId=");
		msg.append(appRoleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2JobPosException(msg.toString());
	}

	/**
	 * Returns the first app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos fetchByC_G_AR_First(long companyId, long groupId,
		long appRoleId, OrderByComparator orderByComparator)
		throws SystemException {
		List<AppRole2JobPos> list = findByC_G_AR(companyId, groupId, appRoleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 job pos
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a matching app role2 job pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos findByC_G_AR_Last(long companyId, long groupId,
		long appRoleId, OrderByComparator orderByComparator)
		throws NoSuchAppRole2JobPosException, SystemException {
		AppRole2JobPos appRole2JobPos = fetchByC_G_AR_Last(companyId, groupId,
				appRoleId, orderByComparator);

		if (appRole2JobPos != null) {
			return appRole2JobPos;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", appRoleId=");
		msg.append(appRoleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAppRole2JobPosException(msg.toString());
	}

	/**
	 * Returns the last app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app role2 job pos, or <code>null</code> if a matching app role2 job pos could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos fetchByC_G_AR_Last(long companyId, long groupId,
		long appRoleId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_G_AR(companyId, groupId, appRoleId);

		if (count == 0) {
			return null;
		}

		List<AppRole2JobPos> list = findByC_G_AR(companyId, groupId, appRoleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the app role2 job poses before and after the current app role2 job pos in the ordered set where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param appRole2JobPosId the primary key of the current app role2 job pos
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app role2 job pos
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos[] findByC_G_AR_PrevAndNext(long appRole2JobPosId,
		long companyId, long groupId, long appRoleId,
		OrderByComparator orderByComparator)
		throws NoSuchAppRole2JobPosException, SystemException {
		AppRole2JobPos appRole2JobPos = findByPrimaryKey(appRole2JobPosId);

		Session session = null;

		try {
			session = openSession();

			AppRole2JobPos[] array = new AppRole2JobPosImpl[3];

			array[0] = getByC_G_AR_PrevAndNext(session, appRole2JobPos,
					companyId, groupId, appRoleId, orderByComparator, true);

			array[1] = appRole2JobPos;

			array[2] = getByC_G_AR_PrevAndNext(session, appRole2JobPos,
					companyId, groupId, appRoleId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppRole2JobPos getByC_G_AR_PrevAndNext(Session session,
		AppRole2JobPos appRole2JobPos, long companyId, long groupId,
		long appRoleId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPROLE2JOBPOS_WHERE);

		query.append(_FINDER_COLUMN_C_G_AR_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_AR_GROUPID_2);

		query.append(_FINDER_COLUMN_C_G_AR_APPROLEID_2);

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
			query.append(AppRole2JobPosModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(appRoleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(appRole2JobPos);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AppRole2JobPos> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G_AR(long companyId, long groupId, long appRoleId)
		throws SystemException {
		for (AppRole2JobPos appRole2JobPos : findByC_G_AR(companyId, groupId,
				appRoleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(appRole2JobPos);
		}
	}

	/**
	 * Returns the number of app role2 job poses where companyId = &#63; and groupId = &#63; and appRoleId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param appRoleId the app role ID
	 * @return the number of matching app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G_AR(long companyId, long groupId, long appRoleId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_AR;

		Object[] finderArgs = new Object[] { companyId, groupId, appRoleId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_APPROLE2JOBPOS_WHERE);

			query.append(_FINDER_COLUMN_C_G_AR_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_AR_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_AR_APPROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(appRoleId);

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

	private static final String _FINDER_COLUMN_C_G_AR_COMPANYID_2 = "appRole2JobPos.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_AR_GROUPID_2 = "appRole2JobPos.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_AR_APPROLEID_2 = "appRole2JobPos.appRoleId = ?";

	public AppRole2JobPosPersistenceImpl() {
		setModelClass(AppRole2JobPos.class);
	}

	/**
	 * Caches the app role2 job pos in the entity cache if it is enabled.
	 *
	 * @param appRole2JobPos the app role2 job pos
	 */
	@Override
	public void cacheResult(AppRole2JobPos appRole2JobPos) {
		EntityCacheUtil.putResult(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosImpl.class, appRole2JobPos.getPrimaryKey(),
			appRole2JobPos);

		appRole2JobPos.resetOriginalValues();
	}

	/**
	 * Caches the app role2 job poses in the entity cache if it is enabled.
	 *
	 * @param appRole2JobPoses the app role2 job poses
	 */
	@Override
	public void cacheResult(List<AppRole2JobPos> appRole2JobPoses) {
		for (AppRole2JobPos appRole2JobPos : appRole2JobPoses) {
			if (EntityCacheUtil.getResult(
						AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
						AppRole2JobPosImpl.class, appRole2JobPos.getPrimaryKey()) == null) {
				cacheResult(appRole2JobPos);
			}
			else {
				appRole2JobPos.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all app role2 job poses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AppRole2JobPosImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AppRole2JobPosImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the app role2 job pos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AppRole2JobPos appRole2JobPos) {
		EntityCacheUtil.removeResult(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosImpl.class, appRole2JobPos.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AppRole2JobPos> appRole2JobPoses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AppRole2JobPos appRole2JobPos : appRole2JobPoses) {
			EntityCacheUtil.removeResult(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
				AppRole2JobPosImpl.class, appRole2JobPos.getPrimaryKey());
		}
	}

	/**
	 * Creates a new app role2 job pos with the primary key. Does not add the app role2 job pos to the database.
	 *
	 * @param appRole2JobPosId the primary key for the new app role2 job pos
	 * @return the new app role2 job pos
	 */
	@Override
	public AppRole2JobPos create(long appRole2JobPosId) {
		AppRole2JobPos appRole2JobPos = new AppRole2JobPosImpl();

		appRole2JobPos.setNew(true);
		appRole2JobPos.setPrimaryKey(appRole2JobPosId);

		return appRole2JobPos;
	}

	/**
	 * Removes the app role2 job pos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appRole2JobPosId the primary key of the app role2 job pos
	 * @return the app role2 job pos that was removed
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos remove(long appRole2JobPosId)
		throws NoSuchAppRole2JobPosException, SystemException {
		return remove((Serializable)appRole2JobPosId);
	}

	/**
	 * Removes the app role2 job pos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the app role2 job pos
	 * @return the app role2 job pos that was removed
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos remove(Serializable primaryKey)
		throws NoSuchAppRole2JobPosException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AppRole2JobPos appRole2JobPos = (AppRole2JobPos)session.get(AppRole2JobPosImpl.class,
					primaryKey);

			if (appRole2JobPos == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAppRole2JobPosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(appRole2JobPos);
		}
		catch (NoSuchAppRole2JobPosException nsee) {
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
	protected AppRole2JobPos removeImpl(AppRole2JobPos appRole2JobPos)
		throws SystemException {
		appRole2JobPos = toUnwrappedModel(appRole2JobPos);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(appRole2JobPos)) {
				appRole2JobPos = (AppRole2JobPos)session.get(AppRole2JobPosImpl.class,
						appRole2JobPos.getPrimaryKeyObj());
			}

			if (appRole2JobPos != null) {
				session.delete(appRole2JobPos);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (appRole2JobPos != null) {
			clearCache(appRole2JobPos);
		}

		return appRole2JobPos;
	}

	@Override
	public AppRole2JobPos updateImpl(
		org.oep.core.ssomgt.model.AppRole2JobPos appRole2JobPos)
		throws SystemException {
		appRole2JobPos = toUnwrappedModel(appRole2JobPos);

		boolean isNew = appRole2JobPos.isNew();

		AppRole2JobPosModelImpl appRole2JobPosModelImpl = (AppRole2JobPosModelImpl)appRole2JobPos;

		Session session = null;

		try {
			session = openSession();

			if (appRole2JobPos.isNew()) {
				session.save(appRole2JobPos);

				appRole2JobPos.setNew(false);
			}
			else {
				session.merge(appRole2JobPos);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AppRole2JobPosModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((appRole2JobPosModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appRole2JobPosModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);

				args = new Object[] { appRole2JobPosModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);
			}

			if ((appRole2JobPosModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appRole2JobPosModelImpl.getOriginalCompanyId(),
						appRole2JobPosModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);

				args = new Object[] {
						appRole2JobPosModelImpl.getCompanyId(),
						appRole2JobPosModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);
			}

			if ((appRole2JobPosModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_AR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						appRole2JobPosModelImpl.getOriginalCompanyId(),
						appRole2JobPosModelImpl.getOriginalGroupId(),
						appRole2JobPosModelImpl.getOriginalAppRoleId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_AR, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_AR,
					args);

				args = new Object[] {
						appRole2JobPosModelImpl.getCompanyId(),
						appRole2JobPosModelImpl.getGroupId(),
						appRole2JobPosModelImpl.getAppRoleId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_AR, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_AR,
					args);
			}
		}

		EntityCacheUtil.putResult(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
			AppRole2JobPosImpl.class, appRole2JobPos.getPrimaryKey(),
			appRole2JobPos);

		return appRole2JobPos;
	}

	protected AppRole2JobPos toUnwrappedModel(AppRole2JobPos appRole2JobPos) {
		if (appRole2JobPos instanceof AppRole2JobPosImpl) {
			return appRole2JobPos;
		}

		AppRole2JobPosImpl appRole2JobPosImpl = new AppRole2JobPosImpl();

		appRole2JobPosImpl.setNew(appRole2JobPos.isNew());
		appRole2JobPosImpl.setPrimaryKey(appRole2JobPos.getPrimaryKey());

		appRole2JobPosImpl.setAppRole2JobPosId(appRole2JobPos.getAppRole2JobPosId());
		appRole2JobPosImpl.setUserId(appRole2JobPos.getUserId());
		appRole2JobPosImpl.setGroupId(appRole2JobPos.getGroupId());
		appRole2JobPosImpl.setCompanyId(appRole2JobPos.getCompanyId());
		appRole2JobPosImpl.setCreateDate(appRole2JobPos.getCreateDate());
		appRole2JobPosImpl.setAppRoleId(appRole2JobPos.getAppRoleId());
		appRole2JobPosImpl.setJobPostId(appRole2JobPos.getJobPostId());

		return appRole2JobPosImpl;
	}

	/**
	 * Returns the app role2 job pos with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the app role2 job pos
	 * @return the app role2 job pos
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAppRole2JobPosException, SystemException {
		AppRole2JobPos appRole2JobPos = fetchByPrimaryKey(primaryKey);

		if (appRole2JobPos == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAppRole2JobPosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return appRole2JobPos;
	}

	/**
	 * Returns the app role2 job pos with the primary key or throws a {@link org.oep.core.ssomgt.NoSuchAppRole2JobPosException} if it could not be found.
	 *
	 * @param appRole2JobPosId the primary key of the app role2 job pos
	 * @return the app role2 job pos
	 * @throws org.oep.core.ssomgt.NoSuchAppRole2JobPosException if a app role2 job pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos findByPrimaryKey(long appRole2JobPosId)
		throws NoSuchAppRole2JobPosException, SystemException {
		return findByPrimaryKey((Serializable)appRole2JobPosId);
	}

	/**
	 * Returns the app role2 job pos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the app role2 job pos
	 * @return the app role2 job pos, or <code>null</code> if a app role2 job pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AppRole2JobPos appRole2JobPos = (AppRole2JobPos)EntityCacheUtil.getResult(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
				AppRole2JobPosImpl.class, primaryKey);

		if (appRole2JobPos == _nullAppRole2JobPos) {
			return null;
		}

		if (appRole2JobPos == null) {
			Session session = null;

			try {
				session = openSession();

				appRole2JobPos = (AppRole2JobPos)session.get(AppRole2JobPosImpl.class,
						primaryKey);

				if (appRole2JobPos != null) {
					cacheResult(appRole2JobPos);
				}
				else {
					EntityCacheUtil.putResult(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
						AppRole2JobPosImpl.class, primaryKey,
						_nullAppRole2JobPos);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AppRole2JobPosModelImpl.ENTITY_CACHE_ENABLED,
					AppRole2JobPosImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return appRole2JobPos;
	}

	/**
	 * Returns the app role2 job pos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appRole2JobPosId the primary key of the app role2 job pos
	 * @return the app role2 job pos, or <code>null</code> if a app role2 job pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AppRole2JobPos fetchByPrimaryKey(long appRole2JobPosId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)appRole2JobPosId);
	}

	/**
	 * Returns all the app role2 job poses.
	 *
	 * @return the app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2JobPos> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the app role2 job poses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of app role2 job poses
	 * @param end the upper bound of the range of app role2 job poses (not inclusive)
	 * @return the range of app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2JobPos> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the app role2 job poses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRole2JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of app role2 job poses
	 * @param end the upper bound of the range of app role2 job poses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of app role2 job poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AppRole2JobPos> findAll(int start, int end,
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

		List<AppRole2JobPos> list = (List<AppRole2JobPos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_APPROLE2JOBPOS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APPROLE2JOBPOS;

				if (pagination) {
					sql = sql.concat(AppRole2JobPosModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AppRole2JobPos>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AppRole2JobPos>(list);
				}
				else {
					list = (List<AppRole2JobPos>)QueryUtil.list(q,
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
	 * Removes all the app role2 job poses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AppRole2JobPos appRole2JobPos : findAll()) {
			remove(appRole2JobPos);
		}
	}

	/**
	 * Returns the number of app role2 job poses.
	 *
	 * @return the number of app role2 job poses
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

				Query q = session.createQuery(_SQL_COUNT_APPROLE2JOBPOS);

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
	 * Initializes the app role2 job pos persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.ssomgt.model.AppRole2JobPos")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AppRole2JobPos>> listenersList = new ArrayList<ModelListener<AppRole2JobPos>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AppRole2JobPos>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AppRole2JobPosImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_APPROLE2JOBPOS = "SELECT appRole2JobPos FROM AppRole2JobPos appRole2JobPos";
	private static final String _SQL_SELECT_APPROLE2JOBPOS_WHERE = "SELECT appRole2JobPos FROM AppRole2JobPos appRole2JobPos WHERE ";
	private static final String _SQL_COUNT_APPROLE2JOBPOS = "SELECT COUNT(appRole2JobPos) FROM AppRole2JobPos appRole2JobPos";
	private static final String _SQL_COUNT_APPROLE2JOBPOS_WHERE = "SELECT COUNT(appRole2JobPos) FROM AppRole2JobPos appRole2JobPos WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "appRole2JobPos.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AppRole2JobPos exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AppRole2JobPos exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AppRole2JobPosPersistenceImpl.class);
	private static AppRole2JobPos _nullAppRole2JobPos = new AppRole2JobPosImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AppRole2JobPos> toCacheModel() {
				return _nullAppRole2JobPosCacheModel;
			}
		};

	private static CacheModel<AppRole2JobPos> _nullAppRole2JobPosCacheModel = new CacheModel<AppRole2JobPos>() {
			@Override
			public AppRole2JobPos toEntityModel() {
				return _nullAppRole2JobPos;
			}
		};
}