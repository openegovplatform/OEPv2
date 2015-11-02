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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.core.ssomgt.NoSuchApplicationException;
import org.oep.core.ssomgt.model.Application;
import org.oep.core.ssomgt.model.impl.ApplicationImpl;
import org.oep.core.ssomgt.model.impl.ApplicationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ApplicationPersistence
 * @see ApplicationUtil
 * @generated
 */
public class ApplicationPersistenceImpl extends BasePersistenceImpl<Application>
	implements ApplicationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ApplicationUtil} to access the application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ApplicationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, ApplicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, ApplicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, ApplicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, ApplicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC",
			new String[] { Long.class.getName() },
			ApplicationModelImpl.COMPANYID_COLUMN_BITMASK |
			ApplicationModelImpl.SEQUENCENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the applications where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Application> findByC(long companyId) throws SystemException {
		return findByC(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the applications where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @return the range of matching applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Application> findByC(long companyId, int start, int end)
		throws SystemException {
		return findByC(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the applications where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Application> findByC(long companyId, int start, int end,
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

		List<Application> list = (List<Application>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Application application : list) {
				if ((companyId != application.getCompanyId())) {
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

			query.append(_SQL_SELECT_APPLICATION_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Application>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Application>(list);
				}
				else {
					list = (List<Application>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first application in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching application
	 * @throws org.oep.core.ssomgt.NoSuchApplicationException if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application findByC_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchApplicationException, SystemException {
		Application application = fetchByC_First(companyId, orderByComparator);

		if (application != null) {
			return application;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplicationException(msg.toString());
	}

	/**
	 * Returns the first application in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching application, or <code>null</code> if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application fetchByC_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Application> list = findByC(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last application in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching application
	 * @throws org.oep.core.ssomgt.NoSuchApplicationException if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application findByC_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchApplicationException, SystemException {
		Application application = fetchByC_Last(companyId, orderByComparator);

		if (application != null) {
			return application;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplicationException(msg.toString());
	}

	/**
	 * Returns the last application in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching application, or <code>null</code> if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application fetchByC_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC(companyId);

		if (count == 0) {
			return null;
		}

		List<Application> list = findByC(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the applications before and after the current application in the ordered set where companyId = &#63;.
	 *
	 * @param applicationId the primary key of the current application
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next application
	 * @throws org.oep.core.ssomgt.NoSuchApplicationException if a application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application[] findByC_PrevAndNext(long applicationId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchApplicationException, SystemException {
		Application application = findByPrimaryKey(applicationId);

		Session session = null;

		try {
			session = openSession();

			Application[] array = new ApplicationImpl[3];

			array[0] = getByC_PrevAndNext(session, application, companyId,
					orderByComparator, true);

			array[1] = application;

			array[2] = getByC_PrevAndNext(session, application, companyId,
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

	protected Application getByC_PrevAndNext(Session session,
		Application application, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPLICATION_WHERE);

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
			query.append(ApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(application);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Application> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the applications where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC(long companyId) throws SystemException {
		for (Application application : findByC(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(application);
		}
	}

	/**
	 * Returns the number of applications where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching applications
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

			query.append(_SQL_COUNT_APPLICATION_WHERE);

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

	private static final String _FINDER_COLUMN_C_COMPANYID_2 = "application.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, ApplicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, ApplicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			ApplicationModelImpl.COMPANYID_COLUMN_BITMASK |
			ApplicationModelImpl.GROUPID_COLUMN_BITMASK |
			ApplicationModelImpl.SEQUENCENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the applications where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Application> findByC_G(long companyId, long groupId)
		throws SystemException {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the applications where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @return the range of matching applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Application> findByC_G(long companyId, long groupId, int start,
		int end) throws SystemException {
		return findByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the applications where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Application> findByC_G(long companyId, long groupId, int start,
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

		List<Application> list = (List<Application>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Application application : list) {
				if ((companyId != application.getCompanyId()) ||
						(groupId != application.getGroupId())) {
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

			query.append(_SQL_SELECT_APPLICATION_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApplicationModelImpl.ORDER_BY_JPQL);
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
					list = (List<Application>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Application>(list);
				}
				else {
					list = (List<Application>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first application in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching application
	 * @throws org.oep.core.ssomgt.NoSuchApplicationException if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application findByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchApplicationException, SystemException {
		Application application = fetchByC_G_First(companyId, groupId,
				orderByComparator);

		if (application != null) {
			return application;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplicationException(msg.toString());
	}

	/**
	 * Returns the first application in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching application, or <code>null</code> if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application fetchByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Application> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last application in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching application
	 * @throws org.oep.core.ssomgt.NoSuchApplicationException if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application findByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchApplicationException, SystemException {
		Application application = fetchByC_G_Last(companyId, groupId,
				orderByComparator);

		if (application != null) {
			return application;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplicationException(msg.toString());
	}

	/**
	 * Returns the last application in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching application, or <code>null</code> if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application fetchByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_G(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<Application> list = findByC_G(companyId, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the applications before and after the current application in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param applicationId the primary key of the current application
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next application
	 * @throws org.oep.core.ssomgt.NoSuchApplicationException if a application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application[] findByC_G_PrevAndNext(long applicationId,
		long companyId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchApplicationException, SystemException {
		Application application = findByPrimaryKey(applicationId);

		Session session = null;

		try {
			session = openSession();

			Application[] array = new ApplicationImpl[3];

			array[0] = getByC_G_PrevAndNext(session, application, companyId,
					groupId, orderByComparator, true);

			array[1] = application;

			array[2] = getByC_G_PrevAndNext(session, application, companyId,
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

	protected Application getByC_G_PrevAndNext(Session session,
		Application application, long companyId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPLICATION_WHERE);

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
			query.append(ApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(application);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Application> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the applications where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G(long companyId, long groupId)
		throws SystemException {
		for (Application application : findByC_G(companyId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(application);
		}
	}

	/**
	 * Returns the number of applications where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching applications
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

			query.append(_SQL_COUNT_APPLICATION_WHERE);

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

	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "application.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "application.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_AC = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, ApplicationImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByAC",
			new String[] { String.class.getName() },
			ApplicationModelImpl.APPCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_AC = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAC",
			new String[] { String.class.getName() });

	/**
	 * Returns the application where appCode = &#63; or throws a {@link org.oep.core.ssomgt.NoSuchApplicationException} if it could not be found.
	 *
	 * @param appCode the app code
	 * @return the matching application
	 * @throws org.oep.core.ssomgt.NoSuchApplicationException if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application findByAC(String appCode)
		throws NoSuchApplicationException, SystemException {
		Application application = fetchByAC(appCode);

		if (application == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("appCode=");
			msg.append(appCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchApplicationException(msg.toString());
		}

		return application;
	}

	/**
	 * Returns the application where appCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param appCode the app code
	 * @return the matching application, or <code>null</code> if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application fetchByAC(String appCode) throws SystemException {
		return fetchByAC(appCode, true);
	}

	/**
	 * Returns the application where appCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param appCode the app code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching application, or <code>null</code> if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application fetchByAC(String appCode, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { appCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_AC,
					finderArgs, this);
		}

		if (result instanceof Application) {
			Application application = (Application)result;

			if (!Validator.equals(appCode, application.getAppCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_APPLICATION_WHERE);

			boolean bindAppCode = false;

			if (appCode == null) {
				query.append(_FINDER_COLUMN_AC_APPCODE_1);
			}
			else if (appCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AC_APPCODE_3);
			}
			else {
				bindAppCode = true;

				query.append(_FINDER_COLUMN_AC_APPCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAppCode) {
					qPos.add(appCode);
				}

				List<Application> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AC,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ApplicationPersistenceImpl.fetchByAC(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Application application = list.get(0);

					result = application;

					cacheResult(application);

					if ((application.getAppCode() == null) ||
							!application.getAppCode().equals(appCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AC,
							finderArgs, application);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_AC, finderArgs);

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
			return (Application)result;
		}
	}

	/**
	 * Removes the application where appCode = &#63; from the database.
	 *
	 * @param appCode the app code
	 * @return the application that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application removeByAC(String appCode)
		throws NoSuchApplicationException, SystemException {
		Application application = findByAC(appCode);

		return remove(application);
	}

	/**
	 * Returns the number of applications where appCode = &#63;.
	 *
	 * @param appCode the app code
	 * @return the number of matching applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAC(String appCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_AC;

		Object[] finderArgs = new Object[] { appCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_APPLICATION_WHERE);

			boolean bindAppCode = false;

			if (appCode == null) {
				query.append(_FINDER_COLUMN_AC_APPCODE_1);
			}
			else if (appCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AC_APPCODE_3);
			}
			else {
				bindAppCode = true;

				query.append(_FINDER_COLUMN_AC_APPCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAppCode) {
					qPos.add(appCode);
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

	private static final String _FINDER_COLUMN_AC_APPCODE_1 = "application.appCode IS NULL";
	private static final String _FINDER_COLUMN_AC_APPCODE_2 = "application.appCode = ?";
	private static final String _FINDER_COLUMN_AC_APPCODE_3 = "(application.appCode IS NULL OR application.appCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_AC_P = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, ApplicationImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByAC_P",
			new String[] { String.class.getName(), String.class.getName() },
			ApplicationModelImpl.APPCODE_COLUMN_BITMASK |
			ApplicationModelImpl.APPPIN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_AC_P = new FinderPath(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAC_P",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the application where appCode = &#63; and appPin = &#63; or throws a {@link org.oep.core.ssomgt.NoSuchApplicationException} if it could not be found.
	 *
	 * @param appCode the app code
	 * @param appPin the app pin
	 * @return the matching application
	 * @throws org.oep.core.ssomgt.NoSuchApplicationException if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application findByAC_P(String appCode, String appPin)
		throws NoSuchApplicationException, SystemException {
		Application application = fetchByAC_P(appCode, appPin);

		if (application == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("appCode=");
			msg.append(appCode);

			msg.append(", appPin=");
			msg.append(appPin);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchApplicationException(msg.toString());
		}

		return application;
	}

	/**
	 * Returns the application where appCode = &#63; and appPin = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param appCode the app code
	 * @param appPin the app pin
	 * @return the matching application, or <code>null</code> if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application fetchByAC_P(String appCode, String appPin)
		throws SystemException {
		return fetchByAC_P(appCode, appPin, true);
	}

	/**
	 * Returns the application where appCode = &#63; and appPin = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param appCode the app code
	 * @param appPin the app pin
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching application, or <code>null</code> if a matching application could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application fetchByAC_P(String appCode, String appPin,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { appCode, appPin };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_AC_P,
					finderArgs, this);
		}

		if (result instanceof Application) {
			Application application = (Application)result;

			if (!Validator.equals(appCode, application.getAppCode()) ||
					!Validator.equals(appPin, application.getAppPin())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_APPLICATION_WHERE);

			boolean bindAppCode = false;

			if (appCode == null) {
				query.append(_FINDER_COLUMN_AC_P_APPCODE_1);
			}
			else if (appCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AC_P_APPCODE_3);
			}
			else {
				bindAppCode = true;

				query.append(_FINDER_COLUMN_AC_P_APPCODE_2);
			}

			boolean bindAppPin = false;

			if (appPin == null) {
				query.append(_FINDER_COLUMN_AC_P_APPPIN_1);
			}
			else if (appPin.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AC_P_APPPIN_3);
			}
			else {
				bindAppPin = true;

				query.append(_FINDER_COLUMN_AC_P_APPPIN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAppCode) {
					qPos.add(appCode);
				}

				if (bindAppPin) {
					qPos.add(appPin);
				}

				List<Application> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AC_P,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ApplicationPersistenceImpl.fetchByAC_P(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Application application = list.get(0);

					result = application;

					cacheResult(application);

					if ((application.getAppCode() == null) ||
							!application.getAppCode().equals(appCode) ||
							(application.getAppPin() == null) ||
							!application.getAppPin().equals(appPin)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AC_P,
							finderArgs, application);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_AC_P,
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
			return (Application)result;
		}
	}

	/**
	 * Removes the application where appCode = &#63; and appPin = &#63; from the database.
	 *
	 * @param appCode the app code
	 * @param appPin the app pin
	 * @return the application that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application removeByAC_P(String appCode, String appPin)
		throws NoSuchApplicationException, SystemException {
		Application application = findByAC_P(appCode, appPin);

		return remove(application);
	}

	/**
	 * Returns the number of applications where appCode = &#63; and appPin = &#63;.
	 *
	 * @param appCode the app code
	 * @param appPin the app pin
	 * @return the number of matching applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAC_P(String appCode, String appPin)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_AC_P;

		Object[] finderArgs = new Object[] { appCode, appPin };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_APPLICATION_WHERE);

			boolean bindAppCode = false;

			if (appCode == null) {
				query.append(_FINDER_COLUMN_AC_P_APPCODE_1);
			}
			else if (appCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AC_P_APPCODE_3);
			}
			else {
				bindAppCode = true;

				query.append(_FINDER_COLUMN_AC_P_APPCODE_2);
			}

			boolean bindAppPin = false;

			if (appPin == null) {
				query.append(_FINDER_COLUMN_AC_P_APPPIN_1);
			}
			else if (appPin.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AC_P_APPPIN_3);
			}
			else {
				bindAppPin = true;

				query.append(_FINDER_COLUMN_AC_P_APPPIN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAppCode) {
					qPos.add(appCode);
				}

				if (bindAppPin) {
					qPos.add(appPin);
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

	private static final String _FINDER_COLUMN_AC_P_APPCODE_1 = "application.appCode IS NULL AND ";
	private static final String _FINDER_COLUMN_AC_P_APPCODE_2 = "application.appCode = ? AND ";
	private static final String _FINDER_COLUMN_AC_P_APPCODE_3 = "(application.appCode IS NULL OR application.appCode = '') AND ";
	private static final String _FINDER_COLUMN_AC_P_APPPIN_1 = "application.appPin IS NULL";
	private static final String _FINDER_COLUMN_AC_P_APPPIN_2 = "application.appPin = ?";
	private static final String _FINDER_COLUMN_AC_P_APPPIN_3 = "(application.appPin IS NULL OR application.appPin = '')";

	public ApplicationPersistenceImpl() {
		setModelClass(Application.class);
	}

	/**
	 * Caches the application in the entity cache if it is enabled.
	 *
	 * @param application the application
	 */
	@Override
	public void cacheResult(Application application) {
		EntityCacheUtil.putResult(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationImpl.class, application.getPrimaryKey(), application);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AC,
			new Object[] { application.getAppCode() }, application);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AC_P,
			new Object[] { application.getAppCode(), application.getAppPin() },
			application);

		application.resetOriginalValues();
	}

	/**
	 * Caches the applications in the entity cache if it is enabled.
	 *
	 * @param applications the applications
	 */
	@Override
	public void cacheResult(List<Application> applications) {
		for (Application application : applications) {
			if (EntityCacheUtil.getResult(
						ApplicationModelImpl.ENTITY_CACHE_ENABLED,
						ApplicationImpl.class, application.getPrimaryKey()) == null) {
				cacheResult(application);
			}
			else {
				application.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all applications.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ApplicationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ApplicationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the application.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Application application) {
		EntityCacheUtil.removeResult(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationImpl.class, application.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(application);
	}

	@Override
	public void clearCache(List<Application> applications) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Application application : applications) {
			EntityCacheUtil.removeResult(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
				ApplicationImpl.class, application.getPrimaryKey());

			clearUniqueFindersCache(application);
		}
	}

	protected void cacheUniqueFindersCache(Application application) {
		if (application.isNew()) {
			Object[] args = new Object[] { application.getAppCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_AC, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AC, args, application);

			args = new Object[] {
					application.getAppCode(), application.getAppPin()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_AC_P, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AC_P, args,
				application);
		}
		else {
			ApplicationModelImpl applicationModelImpl = (ApplicationModelImpl)application;

			if ((applicationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_AC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { application.getAppCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_AC, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AC, args,
					application);
			}

			if ((applicationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_AC_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						application.getAppCode(), application.getAppPin()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_AC_P, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AC_P, args,
					application);
			}
		}
	}

	protected void clearUniqueFindersCache(Application application) {
		ApplicationModelImpl applicationModelImpl = (ApplicationModelImpl)application;

		Object[] args = new Object[] { application.getAppCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AC, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_AC, args);

		if ((applicationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_AC.getColumnBitmask()) != 0) {
			args = new Object[] { applicationModelImpl.getOriginalAppCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AC, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_AC, args);
		}

		args = new Object[] { application.getAppCode(), application.getAppPin() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AC_P, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_AC_P, args);

		if ((applicationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_AC_P.getColumnBitmask()) != 0) {
			args = new Object[] {
					applicationModelImpl.getOriginalAppCode(),
					applicationModelImpl.getOriginalAppPin()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AC_P, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_AC_P, args);
		}
	}

	/**
	 * Creates a new application with the primary key. Does not add the application to the database.
	 *
	 * @param applicationId the primary key for the new application
	 * @return the new application
	 */
	@Override
	public Application create(long applicationId) {
		Application application = new ApplicationImpl();

		application.setNew(true);
		application.setPrimaryKey(applicationId);

		return application;
	}

	/**
	 * Removes the application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param applicationId the primary key of the application
	 * @return the application that was removed
	 * @throws org.oep.core.ssomgt.NoSuchApplicationException if a application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application remove(long applicationId)
		throws NoSuchApplicationException, SystemException {
		return remove((Serializable)applicationId);
	}

	/**
	 * Removes the application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the application
	 * @return the application that was removed
	 * @throws org.oep.core.ssomgt.NoSuchApplicationException if a application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application remove(Serializable primaryKey)
		throws NoSuchApplicationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Application application = (Application)session.get(ApplicationImpl.class,
					primaryKey);

			if (application == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchApplicationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(application);
		}
		catch (NoSuchApplicationException nsee) {
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
	protected Application removeImpl(Application application)
		throws SystemException {
		application = toUnwrappedModel(application);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(application)) {
				application = (Application)session.get(ApplicationImpl.class,
						application.getPrimaryKeyObj());
			}

			if (application != null) {
				session.delete(application);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (application != null) {
			clearCache(application);
		}

		return application;
	}

	@Override
	public Application updateImpl(
		org.oep.core.ssomgt.model.Application application)
		throws SystemException {
		application = toUnwrappedModel(application);

		boolean isNew = application.isNew();

		ApplicationModelImpl applicationModelImpl = (ApplicationModelImpl)application;

		Session session = null;

		try {
			session = openSession();

			if (application.isNew()) {
				session.save(application);

				application.setNew(false);
			}
			else {
				session.evict(application);
				session.saveOrUpdate(application);
			}

			session.flush();
			session.clear();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ApplicationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((applicationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						applicationModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);

				args = new Object[] { applicationModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);
			}

			if ((applicationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						applicationModelImpl.getOriginalCompanyId(),
						applicationModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);

				args = new Object[] {
						applicationModelImpl.getCompanyId(),
						applicationModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);
			}
		}

		EntityCacheUtil.putResult(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationImpl.class, application.getPrimaryKey(), application);

		clearUniqueFindersCache(application);
		cacheUniqueFindersCache(application);

		application.resetOriginalValues();

		return application;
	}

	protected Application toUnwrappedModel(Application application) {
		if (application instanceof ApplicationImpl) {
			return application;
		}

		ApplicationImpl applicationImpl = new ApplicationImpl();

		applicationImpl.setNew(application.isNew());
		applicationImpl.setPrimaryKey(application.getPrimaryKey());

		applicationImpl.setApplicationId(application.getApplicationId());
		applicationImpl.setUserId(application.getUserId());
		applicationImpl.setGroupId(application.getGroupId());
		applicationImpl.setCompanyId(application.getCompanyId());
		applicationImpl.setCreateDate(application.getCreateDate());
		applicationImpl.setModifiedDate(application.getModifiedDate());
		applicationImpl.setAppCode(application.getAppCode());
		applicationImpl.setAppName(application.getAppName());
		applicationImpl.setAppPin(application.getAppPin());
		applicationImpl.setAppUrl(application.getAppUrl());
		applicationImpl.setAppBigIcon(application.getAppBigIcon());
		applicationImpl.setAppSmallIcon(application.getAppSmallIcon());
		applicationImpl.setPingTime(application.getPingTime());
		applicationImpl.setSequenceNo(application.getSequenceNo());

		return applicationImpl;
	}

	/**
	 * Returns the application with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the application
	 * @return the application
	 * @throws org.oep.core.ssomgt.NoSuchApplicationException if a application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application findByPrimaryKey(Serializable primaryKey)
		throws NoSuchApplicationException, SystemException {
		Application application = fetchByPrimaryKey(primaryKey);

		if (application == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchApplicationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return application;
	}

	/**
	 * Returns the application with the primary key or throws a {@link org.oep.core.ssomgt.NoSuchApplicationException} if it could not be found.
	 *
	 * @param applicationId the primary key of the application
	 * @return the application
	 * @throws org.oep.core.ssomgt.NoSuchApplicationException if a application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application findByPrimaryKey(long applicationId)
		throws NoSuchApplicationException, SystemException {
		return findByPrimaryKey((Serializable)applicationId);
	}

	/**
	 * Returns the application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the application
	 * @return the application, or <code>null</code> if a application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Application application = (Application)EntityCacheUtil.getResult(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
				ApplicationImpl.class, primaryKey);

		if (application == _nullApplication) {
			return null;
		}

		if (application == null) {
			Session session = null;

			try {
				session = openSession();

				application = (Application)session.get(ApplicationImpl.class,
						primaryKey);

				if (application != null) {
					cacheResult(application);
				}
				else {
					EntityCacheUtil.putResult(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
						ApplicationImpl.class, primaryKey, _nullApplication);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ApplicationModelImpl.ENTITY_CACHE_ENABLED,
					ApplicationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return application;
	}

	/**
	 * Returns the application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param applicationId the primary key of the application
	 * @return the application, or <code>null</code> if a application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Application fetchByPrimaryKey(long applicationId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)applicationId);
	}

	/**
	 * Returns all the applications.
	 *
	 * @return the applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Application> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @return the range of applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Application> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Application> findAll(int start, int end,
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

		List<Application> list = (List<Application>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_APPLICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APPLICATION;

				if (pagination) {
					sql = sql.concat(ApplicationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Application>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Application>(list);
				}
				else {
					list = (List<Application>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the applications from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Application application : findAll()) {
			remove(application);
		}
	}

	/**
	 * Returns the number of applications.
	 *
	 * @return the number of applications
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

				Query q = session.createQuery(_SQL_COUNT_APPLICATION);

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
	 * Initializes the application persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.ssomgt.model.Application")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Application>> listenersList = new ArrayList<ModelListener<Application>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Application>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ApplicationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_APPLICATION = "SELECT application FROM Application application";
	private static final String _SQL_SELECT_APPLICATION_WHERE = "SELECT application FROM Application application WHERE ";
	private static final String _SQL_COUNT_APPLICATION = "SELECT COUNT(application) FROM Application application";
	private static final String _SQL_COUNT_APPLICATION_WHERE = "SELECT COUNT(application) FROM Application application WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "application.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Application exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Application exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ApplicationPersistenceImpl.class);
	private static Application _nullApplication = new ApplicationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Application> toCacheModel() {
				return _nullApplicationCacheModel;
			}
		};

	private static CacheModel<Application> _nullApplicationCacheModel = new CacheModel<Application>() {
			@Override
			public Application toEntityModel() {
				return _nullApplication;
			}
		};
}