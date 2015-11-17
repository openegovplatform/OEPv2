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

package org.oep.processmgt.service.persistence;

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

import org.oep.processmgt.NoSuchDossierProcessException;
import org.oep.processmgt.model.DossierProcess;
import org.oep.processmgt.model.impl.DossierProcessImpl;
import org.oep.processmgt.model.impl.DossierProcessModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier process service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcessPersistence
 * @see DossierProcessUtil
 * @generated
 */
public class DossierProcessPersistenceImpl extends BasePersistenceImpl<DossierProcess>
	implements DossierProcessPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierProcessUtil} to access the dossier process persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierProcessImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessModelImpl.FINDER_CACHE_ENABLED,
			DossierProcessImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessModelImpl.FINDER_CACHE_ENABLED,
			DossierProcessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C = new FinderPath(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessModelImpl.FINDER_CACHE_ENABLED,
			DossierProcessImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C = new FinderPath(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessModelImpl.FINDER_CACHE_ENABLED,
			DossierProcessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC",
			new String[] { Long.class.getName() },
			DossierProcessModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dossier processes where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> findByC(long companyId)
		throws SystemException {
		return findByC(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier processes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dossier processes
	 * @param end the upper bound of the range of dossier processes (not inclusive)
	 * @return the range of matching dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> findByC(long companyId, int start, int end)
		throws SystemException {
		return findByC(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier processes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dossier processes
	 * @param end the upper bound of the range of dossier processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> findByC(long companyId, int start, int end,
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

		List<DossierProcess> list = (List<DossierProcess>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProcess dossierProcess : list) {
				if ((companyId != dossierProcess.getCompanyId())) {
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

			query.append(_SQL_SELECT_DOSSIERPROCESS_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcessModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<DossierProcess>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProcess>(list);
				}
				else {
					list = (List<DossierProcess>)QueryUtil.list(q,
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
	 * Returns the first dossier process in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier process
	 * @throws org.oep.processmgt.NoSuchDossierProcessException if a matching dossier process could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess findByC_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcessException, SystemException {
		DossierProcess dossierProcess = fetchByC_First(companyId,
				orderByComparator);

		if (dossierProcess != null) {
			return dossierProcess;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcessException(msg.toString());
	}

	/**
	 * Returns the first dossier process in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier process, or <code>null</code> if a matching dossier process could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess fetchByC_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierProcess> list = findByC(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier process in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier process
	 * @throws org.oep.processmgt.NoSuchDossierProcessException if a matching dossier process could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess findByC_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcessException, SystemException {
		DossierProcess dossierProcess = fetchByC_Last(companyId,
				orderByComparator);

		if (dossierProcess != null) {
			return dossierProcess;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcessException(msg.toString());
	}

	/**
	 * Returns the last dossier process in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier process, or <code>null</code> if a matching dossier process could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess fetchByC_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC(companyId);

		if (count == 0) {
			return null;
		}

		List<DossierProcess> list = findByC(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier processes before and after the current dossier process in the ordered set where companyId = &#63;.
	 *
	 * @param dossierProcessId the primary key of the current dossier process
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier process
	 * @throws org.oep.processmgt.NoSuchDossierProcessException if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess[] findByC_PrevAndNext(long dossierProcessId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchDossierProcessException, SystemException {
		DossierProcess dossierProcess = findByPrimaryKey(dossierProcessId);

		Session session = null;

		try {
			session = openSession();

			DossierProcess[] array = new DossierProcessImpl[3];

			array[0] = getByC_PrevAndNext(session, dossierProcess, companyId,
					orderByComparator, true);

			array[1] = dossierProcess;

			array[2] = getByC_PrevAndNext(session, dossierProcess, companyId,
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

	protected DossierProcess getByC_PrevAndNext(Session session,
		DossierProcess dossierProcess, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROCESS_WHERE);

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
			query.append(DossierProcessModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProcess);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProcess> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier processes where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC(long companyId) throws SystemException {
		for (DossierProcess dossierProcess : findByC(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierProcess);
		}
	}

	/**
	 * Returns the number of dossier processes where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching dossier processes
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

			query.append(_SQL_COUNT_DOSSIERPROCESS_WHERE);

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

	private static final String _FINDER_COLUMN_C_COMPANYID_2 = "dossierProcess.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G = new FinderPath(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessModelImpl.FINDER_CACHE_ENABLED,
			DossierProcessImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G = new FinderPath(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessModelImpl.FINDER_CACHE_ENABLED,
			DossierProcessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			DossierProcessModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierProcessModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dossier processes where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> findByC_G(long companyId, long groupId)
		throws SystemException {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier processes where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dossier processes
	 * @param end the upper bound of the range of dossier processes (not inclusive)
	 * @return the range of matching dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> findByC_G(long companyId, long groupId,
		int start, int end) throws SystemException {
		return findByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier processes where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dossier processes
	 * @param end the upper bound of the range of dossier processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> findByC_G(long companyId, long groupId,
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

		List<DossierProcess> list = (List<DossierProcess>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProcess dossierProcess : list) {
				if ((companyId != dossierProcess.getCompanyId()) ||
						(groupId != dossierProcess.getGroupId())) {
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

			query.append(_SQL_SELECT_DOSSIERPROCESS_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcessModelImpl.ORDER_BY_JPQL);
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
					list = (List<DossierProcess>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProcess>(list);
				}
				else {
					list = (List<DossierProcess>)QueryUtil.list(q,
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
	 * Returns the first dossier process in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier process
	 * @throws org.oep.processmgt.NoSuchDossierProcessException if a matching dossier process could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess findByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcessException, SystemException {
		DossierProcess dossierProcess = fetchByC_G_First(companyId, groupId,
				orderByComparator);

		if (dossierProcess != null) {
			return dossierProcess;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcessException(msg.toString());
	}

	/**
	 * Returns the first dossier process in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier process, or <code>null</code> if a matching dossier process could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess fetchByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierProcess> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier process in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier process
	 * @throws org.oep.processmgt.NoSuchDossierProcessException if a matching dossier process could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess findByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcessException, SystemException {
		DossierProcess dossierProcess = fetchByC_G_Last(companyId, groupId,
				orderByComparator);

		if (dossierProcess != null) {
			return dossierProcess;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcessException(msg.toString());
	}

	/**
	 * Returns the last dossier process in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier process, or <code>null</code> if a matching dossier process could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess fetchByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_G(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<DossierProcess> list = findByC_G(companyId, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier processes before and after the current dossier process in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param dossierProcessId the primary key of the current dossier process
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier process
	 * @throws org.oep.processmgt.NoSuchDossierProcessException if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess[] findByC_G_PrevAndNext(long dossierProcessId,
		long companyId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchDossierProcessException, SystemException {
		DossierProcess dossierProcess = findByPrimaryKey(dossierProcessId);

		Session session = null;

		try {
			session = openSession();

			DossierProcess[] array = new DossierProcessImpl[3];

			array[0] = getByC_G_PrevAndNext(session, dossierProcess, companyId,
					groupId, orderByComparator, true);

			array[1] = dossierProcess;

			array[2] = getByC_G_PrevAndNext(session, dossierProcess, companyId,
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

	protected DossierProcess getByC_G_PrevAndNext(Session session,
		DossierProcess dossierProcess, long companyId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROCESS_WHERE);

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
			query.append(DossierProcessModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProcess);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProcess> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier processes where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G(long companyId, long groupId)
		throws SystemException {
		for (DossierProcess dossierProcess : findByC_G(companyId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierProcess);
		}
	}

	/**
	 * Returns the number of dossier processes where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching dossier processes
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

			query.append(_SQL_COUNT_DOSSIERPROCESS_WHERE);

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

	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "dossierProcess.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "dossierProcess.groupId = ?";

	public DossierProcessPersistenceImpl() {
		setModelClass(DossierProcess.class);
	}

	/**
	 * Caches the dossier process in the entity cache if it is enabled.
	 *
	 * @param dossierProcess the dossier process
	 */
	@Override
	public void cacheResult(DossierProcess dossierProcess) {
		EntityCacheUtil.putResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessImpl.class, dossierProcess.getPrimaryKey(),
			dossierProcess);

		dossierProcess.resetOriginalValues();
	}

	/**
	 * Caches the dossier processes in the entity cache if it is enabled.
	 *
	 * @param dossierProcesses the dossier processes
	 */
	@Override
	public void cacheResult(List<DossierProcess> dossierProcesses) {
		for (DossierProcess dossierProcess : dossierProcesses) {
			if (EntityCacheUtil.getResult(
						DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcessImpl.class, dossierProcess.getPrimaryKey()) == null) {
				cacheResult(dossierProcess);
			}
			else {
				dossierProcess.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier processes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierProcessImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierProcessImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier process.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierProcess dossierProcess) {
		EntityCacheUtil.removeResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessImpl.class, dossierProcess.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierProcess> dossierProcesses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierProcess dossierProcess : dossierProcesses) {
			EntityCacheUtil.removeResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcessImpl.class, dossierProcess.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier process with the primary key. Does not add the dossier process to the database.
	 *
	 * @param dossierProcessId the primary key for the new dossier process
	 * @return the new dossier process
	 */
	@Override
	public DossierProcess create(long dossierProcessId) {
		DossierProcess dossierProcess = new DossierProcessImpl();

		dossierProcess.setNew(true);
		dossierProcess.setPrimaryKey(dossierProcessId);

		return dossierProcess;
	}

	/**
	 * Removes the dossier process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProcessId the primary key of the dossier process
	 * @return the dossier process that was removed
	 * @throws org.oep.processmgt.NoSuchDossierProcessException if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess remove(long dossierProcessId)
		throws NoSuchDossierProcessException, SystemException {
		return remove((Serializable)dossierProcessId);
	}

	/**
	 * Removes the dossier process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier process
	 * @return the dossier process that was removed
	 * @throws org.oep.processmgt.NoSuchDossierProcessException if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess remove(Serializable primaryKey)
		throws NoSuchDossierProcessException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierProcess dossierProcess = (DossierProcess)session.get(DossierProcessImpl.class,
					primaryKey);

			if (dossierProcess == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierProcessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierProcess);
		}
		catch (NoSuchDossierProcessException nsee) {
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
	protected DossierProcess removeImpl(DossierProcess dossierProcess)
		throws SystemException {
		dossierProcess = toUnwrappedModel(dossierProcess);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierProcess)) {
				dossierProcess = (DossierProcess)session.get(DossierProcessImpl.class,
						dossierProcess.getPrimaryKeyObj());
			}

			if (dossierProcess != null) {
				session.delete(dossierProcess);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierProcess != null) {
			clearCache(dossierProcess);
		}

		return dossierProcess;
	}

	@Override
	public DossierProcess updateImpl(
		org.oep.processmgt.model.DossierProcess dossierProcess)
		throws SystemException {
		dossierProcess = toUnwrappedModel(dossierProcess);

		boolean isNew = dossierProcess.isNew();

		DossierProcessModelImpl dossierProcessModelImpl = (DossierProcessModelImpl)dossierProcess;

		Session session = null;

		try {
			session = openSession();

			if (dossierProcess.isNew()) {
				session.save(dossierProcess);

				dossierProcess.setNew(false);
			}
			else {
				session.merge(dossierProcess);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DossierProcessModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dossierProcessModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcessModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);

				args = new Object[] { dossierProcessModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);
			}

			if ((dossierProcessModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcessModelImpl.getOriginalCompanyId(),
						dossierProcessModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);

				args = new Object[] {
						dossierProcessModelImpl.getCompanyId(),
						dossierProcessModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);
			}
		}

		EntityCacheUtil.putResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcessImpl.class, dossierProcess.getPrimaryKey(),
			dossierProcess);

		return dossierProcess;
	}

	protected DossierProcess toUnwrappedModel(DossierProcess dossierProcess) {
		if (dossierProcess instanceof DossierProcessImpl) {
			return dossierProcess;
		}

		DossierProcessImpl dossierProcessImpl = new DossierProcessImpl();

		dossierProcessImpl.setNew(dossierProcess.isNew());
		dossierProcessImpl.setPrimaryKey(dossierProcess.getPrimaryKey());

		dossierProcessImpl.setDossierProcessId(dossierProcess.getDossierProcessId());
		dossierProcessImpl.setUserId(dossierProcess.getUserId());
		dossierProcessImpl.setGroupId(dossierProcess.getGroupId());
		dossierProcessImpl.setCompanyId(dossierProcess.getCompanyId());
		dossierProcessImpl.setCreateDate(dossierProcess.getCreateDate());
		dossierProcessImpl.setModifiedDate(dossierProcess.getModifiedDate());

		return dossierProcessImpl;
	}

	/**
	 * Returns the dossier process with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier process
	 * @return the dossier process
	 * @throws org.oep.processmgt.NoSuchDossierProcessException if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierProcessException, SystemException {
		DossierProcess dossierProcess = fetchByPrimaryKey(primaryKey);

		if (dossierProcess == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierProcessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierProcess;
	}

	/**
	 * Returns the dossier process with the primary key or throws a {@link org.oep.processmgt.NoSuchDossierProcessException} if it could not be found.
	 *
	 * @param dossierProcessId the primary key of the dossier process
	 * @return the dossier process
	 * @throws org.oep.processmgt.NoSuchDossierProcessException if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess findByPrimaryKey(long dossierProcessId)
		throws NoSuchDossierProcessException, SystemException {
		return findByPrimaryKey((Serializable)dossierProcessId);
	}

	/**
	 * Returns the dossier process with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier process
	 * @return the dossier process, or <code>null</code> if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierProcess dossierProcess = (DossierProcess)EntityCacheUtil.getResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcessImpl.class, primaryKey);

		if (dossierProcess == _nullDossierProcess) {
			return null;
		}

		if (dossierProcess == null) {
			Session session = null;

			try {
				session = openSession();

				dossierProcess = (DossierProcess)session.get(DossierProcessImpl.class,
						primaryKey);

				if (dossierProcess != null) {
					cacheResult(dossierProcess);
				}
				else {
					EntityCacheUtil.putResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcessImpl.class, primaryKey,
						_nullDossierProcess);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierProcessModelImpl.ENTITY_CACHE_ENABLED,
					DossierProcessImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierProcess;
	}

	/**
	 * Returns the dossier process with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierProcessId the primary key of the dossier process
	 * @return the dossier process, or <code>null</code> if a dossier process with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProcess fetchByPrimaryKey(long dossierProcessId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierProcessId);
	}

	/**
	 * Returns all the dossier processes.
	 *
	 * @return the dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier processes
	 * @param end the upper bound of the range of dossier processes (not inclusive)
	 * @return the range of dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier processes
	 * @param end the upper bound of the range of dossier processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier processes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProcess> findAll(int start, int end,
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

		List<DossierProcess> list = (List<DossierProcess>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERPROCESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERPROCESS;

				if (pagination) {
					sql = sql.concat(DossierProcessModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierProcess>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProcess>(list);
				}
				else {
					list = (List<DossierProcess>)QueryUtil.list(q,
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
	 * Removes all the dossier processes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierProcess dossierProcess : findAll()) {
			remove(dossierProcess);
		}
	}

	/**
	 * Returns the number of dossier processes.
	 *
	 * @return the number of dossier processes
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERPROCESS);

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
	 * Initializes the dossier process persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.processmgt.model.DossierProcess")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierProcess>> listenersList = new ArrayList<ModelListener<DossierProcess>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierProcess>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierProcessImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERPROCESS = "SELECT dossierProcess FROM DossierProcess dossierProcess";
	private static final String _SQL_SELECT_DOSSIERPROCESS_WHERE = "SELECT dossierProcess FROM DossierProcess dossierProcess WHERE ";
	private static final String _SQL_COUNT_DOSSIERPROCESS = "SELECT COUNT(dossierProcess) FROM DossierProcess dossierProcess";
	private static final String _SQL_COUNT_DOSSIERPROCESS_WHERE = "SELECT COUNT(dossierProcess) FROM DossierProcess dossierProcess WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierProcess.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierProcess exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DossierProcess exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierProcessPersistenceImpl.class);
	private static DossierProcess _nullDossierProcess = new DossierProcessImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierProcess> toCacheModel() {
				return _nullDossierProcessCacheModel;
			}
		};

	private static CacheModel<DossierProcess> _nullDossierProcessCacheModel = new CacheModel<DossierProcess>() {
			@Override
			public DossierProcess toEntityModel() {
				return _nullDossierProcess;
			}
		};
}