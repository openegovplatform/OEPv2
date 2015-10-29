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

package org.oep.core.dossiermgt.service.persistence;

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

import org.oep.core.dossiermgt.NoSuchDossierProcException;
import org.oep.core.dossiermgt.model.DossierProc;
import org.oep.core.dossiermgt.model.impl.DossierProcImpl;
import org.oep.core.dossiermgt.model.impl.DossierProcModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier proc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcPersistence
 * @see DossierProcUtil
 * @generated
 */
public class DossierProcPersistenceImpl extends BasePersistenceImpl<DossierProc>
	implements DossierProcPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierProcUtil} to access the dossier proc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierProcImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC",
			new String[] { Long.class.getName() },
			DossierProcModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dossier procs where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC(long companyId) throws SystemException {
		return findByC(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC(long companyId, int start, int end)
		throws SystemException {
		return findByC(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC(long companyId, int start, int end,
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

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProc dossierProc : list) {
				if ((companyId != dossierProc.getCompanyId())) {
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

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier proc in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_First(companyId, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the first dossier proc in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierProc> list = findByC(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_Last(companyId, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC(companyId);

		if (count == 0) {
			return null;
		}

		List<DossierProc> list = findByC(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63;.
	 *
	 * @param dossierProcId the primary key of the current dossier proc
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc[] findByC_PrevAndNext(long dossierProcId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByPrimaryKey(dossierProcId);

		Session session = null;

		try {
			session = openSession();

			DossierProc[] array = new DossierProcImpl[3];

			array[0] = getByC_PrevAndNext(session, dossierProc, companyId,
					orderByComparator, true);

			array[1] = dossierProc;

			array[2] = getByC_PrevAndNext(session, dossierProc, companyId,
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

	protected DossierProc getByC_PrevAndNext(Session session,
		DossierProc dossierProc, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

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
			query.append(DossierProcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier procs where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC(long companyId) throws SystemException {
		for (DossierProc dossierProc : findByC(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching dossier procs
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

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

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

	private static final String _FINDER_COLUMN_C_COMPANYID_2 = "dossierProc.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			DossierProcModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierProcModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dossier procs where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G(long companyId, long groupId)
		throws SystemException {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G(long companyId, long groupId, int start,
		int end) throws SystemException {
		return findByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G(long companyId, long groupId, int start,
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

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProc dossierProc : list) {
				if ((companyId != dossierProc.getCompanyId()) ||
						(groupId != dossierProc.getGroupId())) {
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

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcModelImpl.ORDER_BY_JPQL);
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
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_G_First(companyId, groupId,
				orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierProc> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_G_Last(companyId, groupId,
				orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_G(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<DossierProc> list = findByC_G(companyId, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param dossierProcId the primary key of the current dossier proc
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc[] findByC_G_PrevAndNext(long dossierProcId,
		long companyId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByPrimaryKey(dossierProcId);

		Session session = null;

		try {
			session = openSession();

			DossierProc[] array = new DossierProcImpl[3];

			array[0] = getByC_G_PrevAndNext(session, dossierProc, companyId,
					groupId, orderByComparator, true);

			array[1] = dossierProc;

			array[2] = getByC_G_PrevAndNext(session, dossierProc, companyId,
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

	protected DossierProc getByC_G_PrevAndNext(Session session,
		DossierProc dossierProc, long companyId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

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
			query.append(DossierProcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier procs where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G(long companyId, long groupId)
		throws SystemException {
		for (DossierProc dossierProc : findByC_G(companyId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching dossier procs
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

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

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

	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "dossierProc.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "dossierProc.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_U = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_G_U",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_U = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G_U",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			DossierProcModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierProcModelImpl.GROUPID_COLUMN_BITMASK |
			DossierProcModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_U = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_U",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G_U(long companyId, long groupId,
		long userId) throws SystemException {
		return findByC_G_U(companyId, groupId, userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G_U(long companyId, long groupId,
		long userId, int start, int end) throws SystemException {
		return findByC_G_U(companyId, groupId, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G_U(long companyId, long groupId,
		long userId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_U;
			finderArgs = new Object[] { companyId, groupId, userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_U;
			finderArgs = new Object[] {
					companyId, groupId, userId,
					
					start, end, orderByComparator
				};
		}

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProc dossierProc : list) {
				if ((companyId != dossierProc.getCompanyId()) ||
						(groupId != dossierProc.getGroupId()) ||
						(userId != dossierProc.getUserId())) {
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

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_G_U_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_U_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(userId);

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_G_U_First(long companyId, long groupId,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_G_U_First(companyId, groupId,
				userId, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_G_U_First(long companyId, long groupId,
		long userId, OrderByComparator orderByComparator)
		throws SystemException {
		List<DossierProc> list = findByC_G_U(companyId, groupId, userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_G_U_Last(long companyId, long groupId,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_G_U_Last(companyId, groupId, userId,
				orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_G_U_Last(long companyId, long groupId,
		long userId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_G_U(companyId, groupId, userId);

		if (count == 0) {
			return null;
		}

		List<DossierProc> list = findByC_G_U(companyId, groupId, userId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param dossierProcId the primary key of the current dossier proc
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc[] findByC_G_U_PrevAndNext(long dossierProcId,
		long companyId, long groupId, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByPrimaryKey(dossierProcId);

		Session session = null;

		try {
			session = openSession();

			DossierProc[] array = new DossierProcImpl[3];

			array[0] = getByC_G_U_PrevAndNext(session, dossierProc, companyId,
					groupId, userId, orderByComparator, true);

			array[1] = dossierProc;

			array[2] = getByC_G_U_PrevAndNext(session, dossierProc, companyId,
					groupId, userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierProc getByC_G_U_PrevAndNext(Session session,
		DossierProc dossierProc, long companyId, long groupId, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

		query.append(_FINDER_COLUMN_C_G_U_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_U_GROUPID_2);

		query.append(_FINDER_COLUMN_C_G_U_USERID_2);

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
			query.append(DossierProcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G_U(long companyId, long groupId, long userId)
		throws SystemException {
		for (DossierProc dossierProc : findByC_G_U(companyId, groupId, userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the number of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G_U(long companyId, long groupId, long userId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_U;

		Object[] finderArgs = new Object[] { companyId, groupId, userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_G_U_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_U_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_U_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_C_G_U_COMPANYID_2 = "dossierProc.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_U_GROUPID_2 = "dossierProc.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_U_USERID_2 = "dossierProc.userId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_G_DPN = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_G_DPN",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			DossierProcModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierProcModelImpl.GROUPID_COLUMN_BITMASK |
			DossierProcModelImpl.DOSSIERPROCNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_DPN = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_DPN",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns the dossier proc where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63; or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param dossierProcNo the dossier proc no
	 * @return the matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_G_DPN(long companyId, long groupId,
		String dossierProcNo)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_G_DPN(companyId, groupId,
				dossierProcNo);

		if (dossierProc == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", dossierProcNo=");
			msg.append(dossierProcNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDossierProcException(msg.toString());
		}

		return dossierProc;
	}

	/**
	 * Returns the dossier proc where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param dossierProcNo the dossier proc no
	 * @return the matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_G_DPN(long companyId, long groupId,
		String dossierProcNo) throws SystemException {
		return fetchByC_G_DPN(companyId, groupId, dossierProcNo, true);
	}

	/**
	 * Returns the dossier proc where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param dossierProcNo the dossier proc no
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_G_DPN(long companyId, long groupId,
		String dossierProcNo, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, dossierProcNo };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_G_DPN,
					finderArgs, this);
		}

		if (result instanceof DossierProc) {
			DossierProc dossierProc = (DossierProc)result;

			if ((companyId != dossierProc.getCompanyId()) ||
					(groupId != dossierProc.getGroupId()) ||
					!Validator.equals(dossierProcNo,
						dossierProc.getDossierProcNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_G_DPN_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_DPN_GROUPID_2);

			boolean bindDossierProcNo = false;

			if (dossierProcNo == null) {
				query.append(_FINDER_COLUMN_C_G_DPN_DOSSIERPROCNO_1);
			}
			else if (dossierProcNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_G_DPN_DOSSIERPROCNO_3);
			}
			else {
				bindDossierProcNo = true;

				query.append(_FINDER_COLUMN_C_G_DPN_DOSSIERPROCNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (bindDossierProcNo) {
					qPos.add(dossierProcNo);
				}

				List<DossierProc> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_DPN,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DossierProcPersistenceImpl.fetchByC_G_DPN(long, long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DossierProc dossierProc = list.get(0);

					result = dossierProc;

					cacheResult(dossierProc);

					if ((dossierProc.getCompanyId() != companyId) ||
							(dossierProc.getGroupId() != groupId) ||
							(dossierProc.getDossierProcNo() == null) ||
							!dossierProc.getDossierProcNo().equals(dossierProcNo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_DPN,
							finderArgs, dossierProc);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G_DPN,
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
			return (DossierProc)result;
		}
	}

	/**
	 * Removes the dossier proc where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param dossierProcNo the dossier proc no
	 * @return the dossier proc that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc removeByC_G_DPN(long companyId, long groupId,
		String dossierProcNo)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByC_G_DPN(companyId, groupId,
				dossierProcNo);

		return remove(dossierProc);
	}

	/**
	 * Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param dossierProcNo the dossier proc no
	 * @return the number of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G_DPN(long companyId, long groupId, String dossierProcNo)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_DPN;

		Object[] finderArgs = new Object[] { companyId, groupId, dossierProcNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_G_DPN_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_DPN_GROUPID_2);

			boolean bindDossierProcNo = false;

			if (dossierProcNo == null) {
				query.append(_FINDER_COLUMN_C_G_DPN_DOSSIERPROCNO_1);
			}
			else if (dossierProcNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_G_DPN_DOSSIERPROCNO_3);
			}
			else {
				bindDossierProcNo = true;

				query.append(_FINDER_COLUMN_C_G_DPN_DOSSIERPROCNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (bindDossierProcNo) {
					qPos.add(dossierProcNo);
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

	private static final String _FINDER_COLUMN_C_G_DPN_COMPANYID_2 = "dossierProc.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_DPN_GROUPID_2 = "dossierProc.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_DPN_DOSSIERPROCNO_1 = "dossierProc.dossierProcNo IS NULL";
	private static final String _FINDER_COLUMN_C_G_DPN_DOSSIERPROCNO_2 = "dossierProc.dossierProcNo = ?";
	private static final String _FINDER_COLUMN_C_G_DPN_DOSSIERPROCNO_3 = "(dossierProc.dossierProcNo IS NULL OR dossierProc.dossierProcNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_ANO = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_ANO",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ANO = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_ANO",
			new String[] { Long.class.getName(), String.class.getName() },
			DossierProcModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierProcModelImpl.ADMINISTRATIONNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_ANO = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_ANO",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dossier procs where companyId = &#63; and administrationNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @return the matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_ANO(long companyId, String administrationNo)
		throws SystemException {
		return findByC_ANO(companyId, administrationNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs where companyId = &#63; and administrationNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_ANO(long companyId,
		String administrationNo, int start, int end) throws SystemException {
		return findByC_ANO(companyId, administrationNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs where companyId = &#63; and administrationNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_ANO(long companyId,
		String administrationNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ANO;
			finderArgs = new Object[] { companyId, administrationNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_ANO;
			finderArgs = new Object[] {
					companyId, administrationNo,
					
					start, end, orderByComparator
				};
		}

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProc dossierProc : list) {
				if ((companyId != dossierProc.getCompanyId()) ||
						!Validator.equals(administrationNo,
							dossierProc.getAdministrationNo())) {
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

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_ANO_COMPANYID_2);

			boolean bindAdministrationNo = false;

			if (administrationNo == null) {
				query.append(_FINDER_COLUMN_C_ANO_ADMINISTRATIONNO_1);
			}
			else if (administrationNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_ANO_ADMINISTRATIONNO_3);
			}
			else {
				bindAdministrationNo = true;

				query.append(_FINDER_COLUMN_C_ANO_ADMINISTRATIONNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindAdministrationNo) {
					qPos.add(administrationNo);
				}

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_ANO_First(long companyId,
		String administrationNo, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_ANO_First(companyId,
				administrationNo, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", administrationNo=");
		msg.append(administrationNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_ANO_First(long companyId,
		String administrationNo, OrderByComparator orderByComparator)
		throws SystemException {
		List<DossierProc> list = findByC_ANO(companyId, administrationNo, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_ANO_Last(long companyId,
		String administrationNo, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_ANO_Last(companyId,
				administrationNo, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", administrationNo=");
		msg.append(administrationNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_ANO_Last(long companyId,
		String administrationNo, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_ANO(companyId, administrationNo);

		if (count == 0) {
			return null;
		}

		List<DossierProc> list = findByC_ANO(companyId, administrationNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	 *
	 * @param dossierProcId the primary key of the current dossier proc
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc[] findByC_ANO_PrevAndNext(long dossierProcId,
		long companyId, String administrationNo,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByPrimaryKey(dossierProcId);

		Session session = null;

		try {
			session = openSession();

			DossierProc[] array = new DossierProcImpl[3];

			array[0] = getByC_ANO_PrevAndNext(session, dossierProc, companyId,
					administrationNo, orderByComparator, true);

			array[1] = dossierProc;

			array[2] = getByC_ANO_PrevAndNext(session, dossierProc, companyId,
					administrationNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierProc getByC_ANO_PrevAndNext(Session session,
		DossierProc dossierProc, long companyId, String administrationNo,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

		query.append(_FINDER_COLUMN_C_ANO_COMPANYID_2);

		boolean bindAdministrationNo = false;

		if (administrationNo == null) {
			query.append(_FINDER_COLUMN_C_ANO_ADMINISTRATIONNO_1);
		}
		else if (administrationNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_ANO_ADMINISTRATIONNO_3);
		}
		else {
			bindAdministrationNo = true;

			query.append(_FINDER_COLUMN_C_ANO_ADMINISTRATIONNO_2);
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
			query.append(DossierProcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindAdministrationNo) {
			qPos.add(administrationNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier procs where companyId = &#63; and administrationNo = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_ANO(long companyId, String administrationNo)
		throws SystemException {
		for (DossierProc dossierProc : findByC_ANO(companyId, administrationNo,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs where companyId = &#63; and administrationNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @return the number of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_ANO(long companyId, String administrationNo)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_ANO;

		Object[] finderArgs = new Object[] { companyId, administrationNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_ANO_COMPANYID_2);

			boolean bindAdministrationNo = false;

			if (administrationNo == null) {
				query.append(_FINDER_COLUMN_C_ANO_ADMINISTRATIONNO_1);
			}
			else if (administrationNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_ANO_ADMINISTRATIONNO_3);
			}
			else {
				bindAdministrationNo = true;

				query.append(_FINDER_COLUMN_C_ANO_ADMINISTRATIONNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindAdministrationNo) {
					qPos.add(administrationNo);
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

	private static final String _FINDER_COLUMN_C_ANO_COMPANYID_2 = "dossierProc.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_ANO_ADMINISTRATIONNO_1 = "dossierProc.administrationNo IS NULL";
	private static final String _FINDER_COLUMN_C_ANO_ADMINISTRATIONNO_2 = "dossierProc.administrationNo = ?";
	private static final String _FINDER_COLUMN_C_ANO_ADMINISTRATIONNO_3 = "(dossierProc.administrationNo IS NULL OR dossierProc.administrationNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_ANO = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_G_ANO",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_ANO =
		new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G_ANO",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			DossierProcModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierProcModelImpl.GROUPID_COLUMN_BITMASK |
			DossierProcModelImpl.ADMINISTRATIONNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_ANO = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_ANO",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @return the matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G_ANO(long companyId, long groupId,
		String administrationNo) throws SystemException {
		return findByC_G_ANO(companyId, groupId, administrationNo,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G_ANO(long companyId, long groupId,
		String administrationNo, int start, int end) throws SystemException {
		return findByC_G_ANO(companyId, groupId, administrationNo, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G_ANO(long companyId, long groupId,
		String administrationNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_ANO;
			finderArgs = new Object[] { companyId, groupId, administrationNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_ANO;
			finderArgs = new Object[] {
					companyId, groupId, administrationNo,
					
					start, end, orderByComparator
				};
		}

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProc dossierProc : list) {
				if ((companyId != dossierProc.getCompanyId()) ||
						(groupId != dossierProc.getGroupId()) ||
						!Validator.equals(administrationNo,
							dossierProc.getAdministrationNo())) {
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

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_G_ANO_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_ANO_GROUPID_2);

			boolean bindAdministrationNo = false;

			if (administrationNo == null) {
				query.append(_FINDER_COLUMN_C_G_ANO_ADMINISTRATIONNO_1);
			}
			else if (administrationNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_G_ANO_ADMINISTRATIONNO_3);
			}
			else {
				bindAdministrationNo = true;

				query.append(_FINDER_COLUMN_C_G_ANO_ADMINISTRATIONNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (bindAdministrationNo) {
					qPos.add(administrationNo);
				}

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_G_ANO_First(long companyId, long groupId,
		String administrationNo, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_G_ANO_First(companyId, groupId,
				administrationNo, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", administrationNo=");
		msg.append(administrationNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_G_ANO_First(long companyId, long groupId,
		String administrationNo, OrderByComparator orderByComparator)
		throws SystemException {
		List<DossierProc> list = findByC_G_ANO(companyId, groupId,
				administrationNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_G_ANO_Last(long companyId, long groupId,
		String administrationNo, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_G_ANO_Last(companyId, groupId,
				administrationNo, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", administrationNo=");
		msg.append(administrationNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_G_ANO_Last(long companyId, long groupId,
		String administrationNo, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_G_ANO(companyId, groupId, administrationNo);

		if (count == 0) {
			return null;
		}

		List<DossierProc> list = findByC_G_ANO(companyId, groupId,
				administrationNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	 *
	 * @param dossierProcId the primary key of the current dossier proc
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc[] findByC_G_ANO_PrevAndNext(long dossierProcId,
		long companyId, long groupId, String administrationNo,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByPrimaryKey(dossierProcId);

		Session session = null;

		try {
			session = openSession();

			DossierProc[] array = new DossierProcImpl[3];

			array[0] = getByC_G_ANO_PrevAndNext(session, dossierProc,
					companyId, groupId, administrationNo, orderByComparator,
					true);

			array[1] = dossierProc;

			array[2] = getByC_G_ANO_PrevAndNext(session, dossierProc,
					companyId, groupId, administrationNo, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierProc getByC_G_ANO_PrevAndNext(Session session,
		DossierProc dossierProc, long companyId, long groupId,
		String administrationNo, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

		query.append(_FINDER_COLUMN_C_G_ANO_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_ANO_GROUPID_2);

		boolean bindAdministrationNo = false;

		if (administrationNo == null) {
			query.append(_FINDER_COLUMN_C_G_ANO_ADMINISTRATIONNO_1);
		}
		else if (administrationNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_G_ANO_ADMINISTRATIONNO_3);
		}
		else {
			bindAdministrationNo = true;

			query.append(_FINDER_COLUMN_C_G_ANO_ADMINISTRATIONNO_2);
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
			query.append(DossierProcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (bindAdministrationNo) {
			qPos.add(administrationNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G_ANO(long companyId, long groupId,
		String administrationNo) throws SystemException {
		for (DossierProc dossierProc : findByC_G_ANO(companyId, groupId,
				administrationNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @return the number of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G_ANO(long companyId, long groupId,
		String administrationNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_ANO;

		Object[] finderArgs = new Object[] { companyId, groupId, administrationNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_G_ANO_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_ANO_GROUPID_2);

			boolean bindAdministrationNo = false;

			if (administrationNo == null) {
				query.append(_FINDER_COLUMN_C_G_ANO_ADMINISTRATIONNO_1);
			}
			else if (administrationNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_G_ANO_ADMINISTRATIONNO_3);
			}
			else {
				bindAdministrationNo = true;

				query.append(_FINDER_COLUMN_C_G_ANO_ADMINISTRATIONNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (bindAdministrationNo) {
					qPos.add(administrationNo);
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

	private static final String _FINDER_COLUMN_C_G_ANO_COMPANYID_2 = "dossierProc.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_ANO_GROUPID_2 = "dossierProc.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_ANO_ADMINISTRATIONNO_1 = "dossierProc.administrationNo IS NULL";
	private static final String _FINDER_COLUMN_C_G_ANO_ADMINISTRATIONNO_2 = "dossierProc.administrationNo = ?";
	private static final String _FINDER_COLUMN_C_G_ANO_ADMINISTRATIONNO_3 = "(dossierProc.administrationNo IS NULL OR dossierProc.administrationNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DNO = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_DNO",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DNO = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_DNO",
			new String[] { Long.class.getName(), String.class.getName() },
			DossierProcModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierProcModelImpl.DOMAINNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_DNO = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_DNO",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dossier procs where companyId = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param domainNo the domain no
	 * @return the matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_DNO(long companyId, String domainNo)
		throws SystemException {
		return findByC_DNO(companyId, domainNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs where companyId = &#63; and domainNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param domainNo the domain no
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_DNO(long companyId, String domainNo,
		int start, int end) throws SystemException {
		return findByC_DNO(companyId, domainNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs where companyId = &#63; and domainNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param domainNo the domain no
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_DNO(long companyId, String domainNo,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DNO;
			finderArgs = new Object[] { companyId, domainNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DNO;
			finderArgs = new Object[] {
					companyId, domainNo,
					
					start, end, orderByComparator
				};
		}

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProc dossierProc : list) {
				if ((companyId != dossierProc.getCompanyId()) ||
						!Validator.equals(domainNo, dossierProc.getDomainNo())) {
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

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_DNO_COMPANYID_2);

			boolean bindDomainNo = false;

			if (domainNo == null) {
				query.append(_FINDER_COLUMN_C_DNO_DOMAINNO_1);
			}
			else if (domainNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DNO_DOMAINNO_3);
			}
			else {
				bindDomainNo = true;

				query.append(_FINDER_COLUMN_C_DNO_DOMAINNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindDomainNo) {
					qPos.add(domainNo);
				}

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_DNO_First(long companyId, String domainNo,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_DNO_First(companyId, domainNo,
				orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", domainNo=");
		msg.append(domainNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_DNO_First(long companyId, String domainNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierProc> list = findByC_DNO(companyId, domainNo, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_DNO_Last(long companyId, String domainNo,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_DNO_Last(companyId, domainNo,
				orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", domainNo=");
		msg.append(domainNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_DNO_Last(long companyId, String domainNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_DNO(companyId, domainNo);

		if (count == 0) {
			return null;
		}

		List<DossierProc> list = findByC_DNO(companyId, domainNo, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	 *
	 * @param dossierProcId the primary key of the current dossier proc
	 * @param companyId the company ID
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc[] findByC_DNO_PrevAndNext(long dossierProcId,
		long companyId, String domainNo, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByPrimaryKey(dossierProcId);

		Session session = null;

		try {
			session = openSession();

			DossierProc[] array = new DossierProcImpl[3];

			array[0] = getByC_DNO_PrevAndNext(session, dossierProc, companyId,
					domainNo, orderByComparator, true);

			array[1] = dossierProc;

			array[2] = getByC_DNO_PrevAndNext(session, dossierProc, companyId,
					domainNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierProc getByC_DNO_PrevAndNext(Session session,
		DossierProc dossierProc, long companyId, String domainNo,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

		query.append(_FINDER_COLUMN_C_DNO_COMPANYID_2);

		boolean bindDomainNo = false;

		if (domainNo == null) {
			query.append(_FINDER_COLUMN_C_DNO_DOMAINNO_1);
		}
		else if (domainNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_DNO_DOMAINNO_3);
		}
		else {
			bindDomainNo = true;

			query.append(_FINDER_COLUMN_C_DNO_DOMAINNO_2);
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
			query.append(DossierProcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindDomainNo) {
			qPos.add(domainNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier procs where companyId = &#63; and domainNo = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param domainNo the domain no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_DNO(long companyId, String domainNo)
		throws SystemException {
		for (DossierProc dossierProc : findByC_DNO(companyId, domainNo,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs where companyId = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param domainNo the domain no
	 * @return the number of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_DNO(long companyId, String domainNo)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_DNO;

		Object[] finderArgs = new Object[] { companyId, domainNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_DNO_COMPANYID_2);

			boolean bindDomainNo = false;

			if (domainNo == null) {
				query.append(_FINDER_COLUMN_C_DNO_DOMAINNO_1);
			}
			else if (domainNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DNO_DOMAINNO_3);
			}
			else {
				bindDomainNo = true;

				query.append(_FINDER_COLUMN_C_DNO_DOMAINNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindDomainNo) {
					qPos.add(domainNo);
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

	private static final String _FINDER_COLUMN_C_DNO_COMPANYID_2 = "dossierProc.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_DNO_DOMAINNO_1 = "dossierProc.domainNo IS NULL";
	private static final String _FINDER_COLUMN_C_DNO_DOMAINNO_2 = "dossierProc.domainNo = ?";
	private static final String _FINDER_COLUMN_C_DNO_DOMAINNO_3 = "(dossierProc.domainNo IS NULL OR dossierProc.domainNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_DNO = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_G_DNO",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_DNO =
		new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G_DNO",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			DossierProcModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierProcModelImpl.GROUPID_COLUMN_BITMASK |
			DossierProcModelImpl.DOMAINNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_DNO = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_DNO",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param domainNo the domain no
	 * @return the matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G_DNO(long companyId, long groupId,
		String domainNo) throws SystemException {
		return findByC_G_DNO(companyId, groupId, domainNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param domainNo the domain no
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G_DNO(long companyId, long groupId,
		String domainNo, int start, int end) throws SystemException {
		return findByC_G_DNO(companyId, groupId, domainNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param domainNo the domain no
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G_DNO(long companyId, long groupId,
		String domainNo, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_DNO;
			finderArgs = new Object[] { companyId, groupId, domainNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_DNO;
			finderArgs = new Object[] {
					companyId, groupId, domainNo,
					
					start, end, orderByComparator
				};
		}

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProc dossierProc : list) {
				if ((companyId != dossierProc.getCompanyId()) ||
						(groupId != dossierProc.getGroupId()) ||
						!Validator.equals(domainNo, dossierProc.getDomainNo())) {
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

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_G_DNO_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_DNO_GROUPID_2);

			boolean bindDomainNo = false;

			if (domainNo == null) {
				query.append(_FINDER_COLUMN_C_G_DNO_DOMAINNO_1);
			}
			else if (domainNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_G_DNO_DOMAINNO_3);
			}
			else {
				bindDomainNo = true;

				query.append(_FINDER_COLUMN_C_G_DNO_DOMAINNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (bindDomainNo) {
					qPos.add(domainNo);
				}

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_G_DNO_First(long companyId, long groupId,
		String domainNo, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_G_DNO_First(companyId, groupId,
				domainNo, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", domainNo=");
		msg.append(domainNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_G_DNO_First(long companyId, long groupId,
		String domainNo, OrderByComparator orderByComparator)
		throws SystemException {
		List<DossierProc> list = findByC_G_DNO(companyId, groupId, domainNo, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_G_DNO_Last(long companyId, long groupId,
		String domainNo, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_G_DNO_Last(companyId, groupId,
				domainNo, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", domainNo=");
		msg.append(domainNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_G_DNO_Last(long companyId, long groupId,
		String domainNo, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_G_DNO(companyId, groupId, domainNo);

		if (count == 0) {
			return null;
		}

		List<DossierProc> list = findByC_G_DNO(companyId, groupId, domainNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	 *
	 * @param dossierProcId the primary key of the current dossier proc
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc[] findByC_G_DNO_PrevAndNext(long dossierProcId,
		long companyId, long groupId, String domainNo,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByPrimaryKey(dossierProcId);

		Session session = null;

		try {
			session = openSession();

			DossierProc[] array = new DossierProcImpl[3];

			array[0] = getByC_G_DNO_PrevAndNext(session, dossierProc,
					companyId, groupId, domainNo, orderByComparator, true);

			array[1] = dossierProc;

			array[2] = getByC_G_DNO_PrevAndNext(session, dossierProc,
					companyId, groupId, domainNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierProc getByC_G_DNO_PrevAndNext(Session session,
		DossierProc dossierProc, long companyId, long groupId, String domainNo,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

		query.append(_FINDER_COLUMN_C_G_DNO_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_DNO_GROUPID_2);

		boolean bindDomainNo = false;

		if (domainNo == null) {
			query.append(_FINDER_COLUMN_C_G_DNO_DOMAINNO_1);
		}
		else if (domainNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_G_DNO_DOMAINNO_3);
		}
		else {
			bindDomainNo = true;

			query.append(_FINDER_COLUMN_C_G_DNO_DOMAINNO_2);
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
			query.append(DossierProcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (bindDomainNo) {
			qPos.add(domainNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param domainNo the domain no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G_DNO(long companyId, long groupId, String domainNo)
		throws SystemException {
		for (DossierProc dossierProc : findByC_G_DNO(companyId, groupId,
				domainNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param domainNo the domain no
	 * @return the number of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G_DNO(long companyId, long groupId, String domainNo)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_DNO;

		Object[] finderArgs = new Object[] { companyId, groupId, domainNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_G_DNO_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_DNO_GROUPID_2);

			boolean bindDomainNo = false;

			if (domainNo == null) {
				query.append(_FINDER_COLUMN_C_G_DNO_DOMAINNO_1);
			}
			else if (domainNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_G_DNO_DOMAINNO_3);
			}
			else {
				bindDomainNo = true;

				query.append(_FINDER_COLUMN_C_G_DNO_DOMAINNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (bindDomainNo) {
					qPos.add(domainNo);
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

	private static final String _FINDER_COLUMN_C_G_DNO_COMPANYID_2 = "dossierProc.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_DNO_GROUPID_2 = "dossierProc.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_DNO_DOMAINNO_1 = "dossierProc.domainNo IS NULL";
	private static final String _FINDER_COLUMN_C_G_DNO_DOMAINNO_2 = "dossierProc.domainNo = ?";
	private static final String _FINDER_COLUMN_C_G_DNO_DOMAINNO_3 = "(dossierProc.domainNo IS NULL OR dossierProc.domainNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_ANO_DNO =
		new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_ANO_DNO",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ANO_DNO =
		new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_ANO_DNO",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			DossierProcModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierProcModelImpl.ADMINISTRATIONNO_COLUMN_BITMASK |
			DossierProcModelImpl.DOMAINNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_ANO_DNO = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_ANO_DNO",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @return the matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_ANO_DNO(long companyId,
		String administrationNo, String domainNo) throws SystemException {
		return findByC_ANO_DNO(companyId, administrationNo, domainNo,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_ANO_DNO(long companyId,
		String administrationNo, String domainNo, int start, int end)
		throws SystemException {
		return findByC_ANO_DNO(companyId, administrationNo, domainNo, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_ANO_DNO(long companyId,
		String administrationNo, String domainNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ANO_DNO;
			finderArgs = new Object[] { companyId, administrationNo, domainNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_ANO_DNO;
			finderArgs = new Object[] {
					companyId, administrationNo, domainNo,
					
					start, end, orderByComparator
				};
		}

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProc dossierProc : list) {
				if ((companyId != dossierProc.getCompanyId()) ||
						!Validator.equals(administrationNo,
							dossierProc.getAdministrationNo()) ||
						!Validator.equals(domainNo, dossierProc.getDomainNo())) {
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

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_ANO_DNO_COMPANYID_2);

			boolean bindAdministrationNo = false;

			if (administrationNo == null) {
				query.append(_FINDER_COLUMN_C_ANO_DNO_ADMINISTRATIONNO_1);
			}
			else if (administrationNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_ANO_DNO_ADMINISTRATIONNO_3);
			}
			else {
				bindAdministrationNo = true;

				query.append(_FINDER_COLUMN_C_ANO_DNO_ADMINISTRATIONNO_2);
			}

			boolean bindDomainNo = false;

			if (domainNo == null) {
				query.append(_FINDER_COLUMN_C_ANO_DNO_DOMAINNO_1);
			}
			else if (domainNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_ANO_DNO_DOMAINNO_3);
			}
			else {
				bindDomainNo = true;

				query.append(_FINDER_COLUMN_C_ANO_DNO_DOMAINNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindAdministrationNo) {
					qPos.add(administrationNo);
				}

				if (bindDomainNo) {
					qPos.add(domainNo);
				}

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_ANO_DNO_First(long companyId,
		String administrationNo, String domainNo,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_ANO_DNO_First(companyId,
				administrationNo, domainNo, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", administrationNo=");
		msg.append(administrationNo);

		msg.append(", domainNo=");
		msg.append(domainNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_ANO_DNO_First(long companyId,
		String administrationNo, String domainNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierProc> list = findByC_ANO_DNO(companyId, administrationNo,
				domainNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_ANO_DNO_Last(long companyId,
		String administrationNo, String domainNo,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_ANO_DNO_Last(companyId,
				administrationNo, domainNo, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", administrationNo=");
		msg.append(administrationNo);

		msg.append(", domainNo=");
		msg.append(domainNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_ANO_DNO_Last(long companyId,
		String administrationNo, String domainNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_ANO_DNO(companyId, administrationNo, domainNo);

		if (count == 0) {
			return null;
		}

		List<DossierProc> list = findByC_ANO_DNO(companyId, administrationNo,
				domainNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param dossierProcId the primary key of the current dossier proc
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc[] findByC_ANO_DNO_PrevAndNext(long dossierProcId,
		long companyId, String administrationNo, String domainNo,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByPrimaryKey(dossierProcId);

		Session session = null;

		try {
			session = openSession();

			DossierProc[] array = new DossierProcImpl[3];

			array[0] = getByC_ANO_DNO_PrevAndNext(session, dossierProc,
					companyId, administrationNo, domainNo, orderByComparator,
					true);

			array[1] = dossierProc;

			array[2] = getByC_ANO_DNO_PrevAndNext(session, dossierProc,
					companyId, administrationNo, domainNo, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierProc getByC_ANO_DNO_PrevAndNext(Session session,
		DossierProc dossierProc, long companyId, String administrationNo,
		String domainNo, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

		query.append(_FINDER_COLUMN_C_ANO_DNO_COMPANYID_2);

		boolean bindAdministrationNo = false;

		if (administrationNo == null) {
			query.append(_FINDER_COLUMN_C_ANO_DNO_ADMINISTRATIONNO_1);
		}
		else if (administrationNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_ANO_DNO_ADMINISTRATIONNO_3);
		}
		else {
			bindAdministrationNo = true;

			query.append(_FINDER_COLUMN_C_ANO_DNO_ADMINISTRATIONNO_2);
		}

		boolean bindDomainNo = false;

		if (domainNo == null) {
			query.append(_FINDER_COLUMN_C_ANO_DNO_DOMAINNO_1);
		}
		else if (domainNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_ANO_DNO_DOMAINNO_3);
		}
		else {
			bindDomainNo = true;

			query.append(_FINDER_COLUMN_C_ANO_DNO_DOMAINNO_2);
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
			query.append(DossierProcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindAdministrationNo) {
			qPos.add(administrationNo);
		}

		if (bindDomainNo) {
			qPos.add(domainNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_ANO_DNO(long companyId, String administrationNo,
		String domainNo) throws SystemException {
		for (DossierProc dossierProc : findByC_ANO_DNO(companyId,
				administrationNo, domainNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @return the number of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_ANO_DNO(long companyId, String administrationNo,
		String domainNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_ANO_DNO;

		Object[] finderArgs = new Object[] { companyId, administrationNo, domainNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_ANO_DNO_COMPANYID_2);

			boolean bindAdministrationNo = false;

			if (administrationNo == null) {
				query.append(_FINDER_COLUMN_C_ANO_DNO_ADMINISTRATIONNO_1);
			}
			else if (administrationNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_ANO_DNO_ADMINISTRATIONNO_3);
			}
			else {
				bindAdministrationNo = true;

				query.append(_FINDER_COLUMN_C_ANO_DNO_ADMINISTRATIONNO_2);
			}

			boolean bindDomainNo = false;

			if (domainNo == null) {
				query.append(_FINDER_COLUMN_C_ANO_DNO_DOMAINNO_1);
			}
			else if (domainNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_ANO_DNO_DOMAINNO_3);
			}
			else {
				bindDomainNo = true;

				query.append(_FINDER_COLUMN_C_ANO_DNO_DOMAINNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindAdministrationNo) {
					qPos.add(administrationNo);
				}

				if (bindDomainNo) {
					qPos.add(domainNo);
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

	private static final String _FINDER_COLUMN_C_ANO_DNO_COMPANYID_2 = "dossierProc.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_ANO_DNO_ADMINISTRATIONNO_1 = "dossierProc.administrationNo IS NULL AND ";
	private static final String _FINDER_COLUMN_C_ANO_DNO_ADMINISTRATIONNO_2 = "dossierProc.administrationNo = ? AND ";
	private static final String _FINDER_COLUMN_C_ANO_DNO_ADMINISTRATIONNO_3 = "(dossierProc.administrationNo IS NULL OR dossierProc.administrationNo = '') AND ";
	private static final String _FINDER_COLUMN_C_ANO_DNO_DOMAINNO_1 = "dossierProc.domainNo IS NULL";
	private static final String _FINDER_COLUMN_C_ANO_DNO_DOMAINNO_2 = "dossierProc.domainNo = ?";
	private static final String _FINDER_COLUMN_C_ANO_DNO_DOMAINNO_3 = "(dossierProc.domainNo IS NULL OR dossierProc.domainNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_ANO_DNO =
		new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_G_ANO_DNO",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_ANO_DNO =
		new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G_ANO_DNO",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			},
			DossierProcModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierProcModelImpl.GROUPID_COLUMN_BITMASK |
			DossierProcModelImpl.ADMINISTRATIONNO_COLUMN_BITMASK |
			DossierProcModelImpl.DOMAINNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_ANO_DNO = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_ANO_DNO",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @return the matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G_ANO_DNO(long companyId, long groupId,
		String administrationNo, String domainNo) throws SystemException {
		return findByC_G_ANO_DNO(companyId, groupId, administrationNo,
			domainNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G_ANO_DNO(long companyId, long groupId,
		String administrationNo, String domainNo, int start, int end)
		throws SystemException {
		return findByC_G_ANO_DNO(companyId, groupId, administrationNo,
			domainNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_G_ANO_DNO(long companyId, long groupId,
		String administrationNo, String domainNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_ANO_DNO;
			finderArgs = new Object[] {
					companyId, groupId, administrationNo, domainNo
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G_ANO_DNO;
			finderArgs = new Object[] {
					companyId, groupId, administrationNo, domainNo,
					
					start, end, orderByComparator
				};
		}

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProc dossierProc : list) {
				if ((companyId != dossierProc.getCompanyId()) ||
						(groupId != dossierProc.getGroupId()) ||
						!Validator.equals(administrationNo,
							dossierProc.getAdministrationNo()) ||
						!Validator.equals(domainNo, dossierProc.getDomainNo())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_G_ANO_DNO_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_ANO_DNO_GROUPID_2);

			boolean bindAdministrationNo = false;

			if (administrationNo == null) {
				query.append(_FINDER_COLUMN_C_G_ANO_DNO_ADMINISTRATIONNO_1);
			}
			else if (administrationNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_G_ANO_DNO_ADMINISTRATIONNO_3);
			}
			else {
				bindAdministrationNo = true;

				query.append(_FINDER_COLUMN_C_G_ANO_DNO_ADMINISTRATIONNO_2);
			}

			boolean bindDomainNo = false;

			if (domainNo == null) {
				query.append(_FINDER_COLUMN_C_G_ANO_DNO_DOMAINNO_1);
			}
			else if (domainNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_G_ANO_DNO_DOMAINNO_3);
			}
			else {
				bindDomainNo = true;

				query.append(_FINDER_COLUMN_C_G_ANO_DNO_DOMAINNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (bindAdministrationNo) {
					qPos.add(administrationNo);
				}

				if (bindDomainNo) {
					qPos.add(domainNo);
				}

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_G_ANO_DNO_First(long companyId, long groupId,
		String administrationNo, String domainNo,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_G_ANO_DNO_First(companyId, groupId,
				administrationNo, domainNo, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", administrationNo=");
		msg.append(administrationNo);

		msg.append(", domainNo=");
		msg.append(domainNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_G_ANO_DNO_First(long companyId, long groupId,
		String administrationNo, String domainNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierProc> list = findByC_G_ANO_DNO(companyId, groupId,
				administrationNo, domainNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_G_ANO_DNO_Last(long companyId, long groupId,
		String administrationNo, String domainNo,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_G_ANO_DNO_Last(companyId, groupId,
				administrationNo, domainNo, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", administrationNo=");
		msg.append(administrationNo);

		msg.append(", domainNo=");
		msg.append(domainNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_G_ANO_DNO_Last(long companyId, long groupId,
		String administrationNo, String domainNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_G_ANO_DNO(companyId, groupId, administrationNo,
				domainNo);

		if (count == 0) {
			return null;
		}

		List<DossierProc> list = findByC_G_ANO_DNO(companyId, groupId,
				administrationNo, domainNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param dossierProcId the primary key of the current dossier proc
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc[] findByC_G_ANO_DNO_PrevAndNext(long dossierProcId,
		long companyId, long groupId, String administrationNo, String domainNo,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByPrimaryKey(dossierProcId);

		Session session = null;

		try {
			session = openSession();

			DossierProc[] array = new DossierProcImpl[3];

			array[0] = getByC_G_ANO_DNO_PrevAndNext(session, dossierProc,
					companyId, groupId, administrationNo, domainNo,
					orderByComparator, true);

			array[1] = dossierProc;

			array[2] = getByC_G_ANO_DNO_PrevAndNext(session, dossierProc,
					companyId, groupId, administrationNo, domainNo,
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

	protected DossierProc getByC_G_ANO_DNO_PrevAndNext(Session session,
		DossierProc dossierProc, long companyId, long groupId,
		String administrationNo, String domainNo,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

		query.append(_FINDER_COLUMN_C_G_ANO_DNO_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_ANO_DNO_GROUPID_2);

		boolean bindAdministrationNo = false;

		if (administrationNo == null) {
			query.append(_FINDER_COLUMN_C_G_ANO_DNO_ADMINISTRATIONNO_1);
		}
		else if (administrationNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_G_ANO_DNO_ADMINISTRATIONNO_3);
		}
		else {
			bindAdministrationNo = true;

			query.append(_FINDER_COLUMN_C_G_ANO_DNO_ADMINISTRATIONNO_2);
		}

		boolean bindDomainNo = false;

		if (domainNo == null) {
			query.append(_FINDER_COLUMN_C_G_ANO_DNO_DOMAINNO_1);
		}
		else if (domainNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_G_ANO_DNO_DOMAINNO_3);
		}
		else {
			bindDomainNo = true;

			query.append(_FINDER_COLUMN_C_G_ANO_DNO_DOMAINNO_2);
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
			query.append(DossierProcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (bindAdministrationNo) {
			qPos.add(administrationNo);
		}

		if (bindDomainNo) {
			qPos.add(domainNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G_ANO_DNO(long companyId, long groupId,
		String administrationNo, String domainNo) throws SystemException {
		for (DossierProc dossierProc : findByC_G_ANO_DNO(companyId, groupId,
				administrationNo, domainNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param administrationNo the administration no
	 * @param domainNo the domain no
	 * @return the number of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G_ANO_DNO(long companyId, long groupId,
		String administrationNo, String domainNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_ANO_DNO;

		Object[] finderArgs = new Object[] {
				companyId, groupId, administrationNo, domainNo
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_G_ANO_DNO_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_ANO_DNO_GROUPID_2);

			boolean bindAdministrationNo = false;

			if (administrationNo == null) {
				query.append(_FINDER_COLUMN_C_G_ANO_DNO_ADMINISTRATIONNO_1);
			}
			else if (administrationNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_G_ANO_DNO_ADMINISTRATIONNO_3);
			}
			else {
				bindAdministrationNo = true;

				query.append(_FINDER_COLUMN_C_G_ANO_DNO_ADMINISTRATIONNO_2);
			}

			boolean bindDomainNo = false;

			if (domainNo == null) {
				query.append(_FINDER_COLUMN_C_G_ANO_DNO_DOMAINNO_1);
			}
			else if (domainNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_G_ANO_DNO_DOMAINNO_3);
			}
			else {
				bindDomainNo = true;

				query.append(_FINDER_COLUMN_C_G_ANO_DNO_DOMAINNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (bindAdministrationNo) {
					qPos.add(administrationNo);
				}

				if (bindDomainNo) {
					qPos.add(domainNo);
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

	private static final String _FINDER_COLUMN_C_G_ANO_DNO_COMPANYID_2 = "dossierProc.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_ANO_DNO_GROUPID_2 = "dossierProc.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_ANO_DNO_ADMINISTRATIONNO_1 = "dossierProc.administrationNo IS NULL AND ";
	private static final String _FINDER_COLUMN_C_G_ANO_DNO_ADMINISTRATIONNO_2 = "dossierProc.administrationNo = ? AND ";
	private static final String _FINDER_COLUMN_C_G_ANO_DNO_ADMINISTRATIONNO_3 = "(dossierProc.administrationNo IS NULL OR dossierProc.administrationNo = '') AND ";
	private static final String _FINDER_COLUMN_C_G_ANO_DNO_DOMAINNO_1 = "dossierProc.domainNo IS NULL";
	private static final String _FINDER_COLUMN_C_G_ANO_DNO_DOMAINNO_2 = "dossierProc.domainNo = ?";
	private static final String _FINDER_COLUMN_C_G_ANO_DNO_DOMAINNO_3 = "(dossierProc.domainNo IS NULL OR dossierProc.domainNo = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_DPN = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByDPN",
			new String[] { String.class.getName() },
			DossierProcModelImpl.DOSSIERPROCNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DPN = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDPN",
			new String[] { String.class.getName() });

	/**
	 * Returns the dossier proc where dossierProcNo = &#63; or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcException} if it could not be found.
	 *
	 * @param dossierProcNo the dossier proc no
	 * @return the matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByDPN(String dossierProcNo)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByDPN(dossierProcNo);

		if (dossierProc == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierProcNo=");
			msg.append(dossierProcNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDossierProcException(msg.toString());
		}

		return dossierProc;
	}

	/**
	 * Returns the dossier proc where dossierProcNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierProcNo the dossier proc no
	 * @return the matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByDPN(String dossierProcNo)
		throws SystemException {
		return fetchByDPN(dossierProcNo, true);
	}

	/**
	 * Returns the dossier proc where dossierProcNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierProcNo the dossier proc no
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByDPN(String dossierProcNo,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { dossierProcNo };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DPN,
					finderArgs, this);
		}

		if (result instanceof DossierProc) {
			DossierProc dossierProc = (DossierProc)result;

			if (!Validator.equals(dossierProcNo, dossierProc.getDossierProcNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			boolean bindDossierProcNo = false;

			if (dossierProcNo == null) {
				query.append(_FINDER_COLUMN_DPN_DOSSIERPROCNO_1);
			}
			else if (dossierProcNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DPN_DOSSIERPROCNO_3);
			}
			else {
				bindDossierProcNo = true;

				query.append(_FINDER_COLUMN_DPN_DOSSIERPROCNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierProcNo) {
					qPos.add(dossierProcNo);
				}

				List<DossierProc> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DPN,
						finderArgs, list);
				}
				else {
					DossierProc dossierProc = list.get(0);

					result = dossierProc;

					cacheResult(dossierProc);

					if ((dossierProc.getDossierProcNo() == null) ||
							!dossierProc.getDossierProcNo().equals(dossierProcNo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DPN,
							finderArgs, dossierProc);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DPN,
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
			return (DossierProc)result;
		}
	}

	/**
	 * Removes the dossier proc where dossierProcNo = &#63; from the database.
	 *
	 * @param dossierProcNo the dossier proc no
	 * @return the dossier proc that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc removeByDPN(String dossierProcNo)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByDPN(dossierProcNo);

		return remove(dossierProc);
	}

	/**
	 * Returns the number of dossier procs where dossierProcNo = &#63;.
	 *
	 * @param dossierProcNo the dossier proc no
	 * @return the number of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDPN(String dossierProcNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DPN;

		Object[] finderArgs = new Object[] { dossierProcNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

			boolean bindDossierProcNo = false;

			if (dossierProcNo == null) {
				query.append(_FINDER_COLUMN_DPN_DOSSIERPROCNO_1);
			}
			else if (dossierProcNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DPN_DOSSIERPROCNO_3);
			}
			else {
				bindDossierProcNo = true;

				query.append(_FINDER_COLUMN_DPN_DOSSIERPROCNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierProcNo) {
					qPos.add(dossierProcNo);
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

	private static final String _FINDER_COLUMN_DPN_DOSSIERPROCNO_1 = "dossierProc.dossierProcNo IS NULL";
	private static final String _FINDER_COLUMN_DPN_DOSSIERPROCNO_2 = "dossierProc.dossierProcNo = ?";
	private static final String _FINDER_COLUMN_DPN_DOSSIERPROCNO_3 = "(dossierProc.dossierProcNo IS NULL OR dossierProc.dossierProcNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			DossierProcModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dossier procs where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProc dossierProc : list) {
				if ((groupId != dossierProc.getGroupId())) {
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

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier proc in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByGroupId_First(groupId,
				orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the first dossier proc in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierProc> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier proc in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByGroupId_Last(groupId, orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the last dossier proc in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<DossierProc> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier procs before and after the current dossier proc in the ordered set where groupId = &#63;.
	 *
	 * @param dossierProcId the primary key of the current dossier proc
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc[] findByGroupId_PrevAndNext(long dossierProcId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByPrimaryKey(dossierProcId);

		Session session = null;

		try {
			session = openSession();

			DossierProc[] array = new DossierProcImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, dossierProc, groupId,
					orderByComparator, true);

			array[1] = dossierProc;

			array[2] = getByGroupId_PrevAndNext(session, dossierProc, groupId,
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

	protected DossierProc getByGroupId_PrevAndNext(Session session,
		DossierProc dossierProc, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(DossierProcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier procs where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (DossierProc dossierProc : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "dossierProc.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_AC = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_AC",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_AC = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_AC",
			new String[] { Long.class.getName(), Integer.class.getName() },
			DossierProcModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierProcModelImpl.STATUSACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_AC = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_AC",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dossier procs where companyId = &#63; and statusActive = &#63;.
	 *
	 * @param companyId the company ID
	 * @param statusActive the status active
	 * @return the matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_AC(long companyId, int statusActive)
		throws SystemException {
		return findByC_AC(companyId, statusActive, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs where companyId = &#63; and statusActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statusActive the status active
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_AC(long companyId, int statusActive,
		int start, int end) throws SystemException {
		return findByC_AC(companyId, statusActive, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs where companyId = &#63; and statusActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statusActive the status active
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByC_AC(long companyId, int statusActive,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_AC;
			finderArgs = new Object[] { companyId, statusActive };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_AC;
			finderArgs = new Object[] {
					companyId, statusActive,
					
					start, end, orderByComparator
				};
		}

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProc dossierProc : list) {
				if ((companyId != dossierProc.getCompanyId()) ||
						(statusActive != dossierProc.getStatusActive())) {
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

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_AC_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_AC_STATUSACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(statusActive);

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and statusActive = &#63;.
	 *
	 * @param companyId the company ID
	 * @param statusActive the status active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_AC_First(long companyId, int statusActive,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_AC_First(companyId, statusActive,
				orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", statusActive=");
		msg.append(statusActive);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the first dossier proc in the ordered set where companyId = &#63; and statusActive = &#63;.
	 *
	 * @param companyId the company ID
	 * @param statusActive the status active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_AC_First(long companyId, int statusActive,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierProc> list = findByC_AC(companyId, statusActive, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and statusActive = &#63;.
	 *
	 * @param companyId the company ID
	 * @param statusActive the status active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByC_AC_Last(long companyId, int statusActive,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByC_AC_Last(companyId, statusActive,
				orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", statusActive=");
		msg.append(statusActive);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the last dossier proc in the ordered set where companyId = &#63; and statusActive = &#63;.
	 *
	 * @param companyId the company ID
	 * @param statusActive the status active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByC_AC_Last(long companyId, int statusActive,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_AC(companyId, statusActive);

		if (count == 0) {
			return null;
		}

		List<DossierProc> list = findByC_AC(companyId, statusActive, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and statusActive = &#63;.
	 *
	 * @param dossierProcId the primary key of the current dossier proc
	 * @param companyId the company ID
	 * @param statusActive the status active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc[] findByC_AC_PrevAndNext(long dossierProcId,
		long companyId, int statusActive, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByPrimaryKey(dossierProcId);

		Session session = null;

		try {
			session = openSession();

			DossierProc[] array = new DossierProcImpl[3];

			array[0] = getByC_AC_PrevAndNext(session, dossierProc, companyId,
					statusActive, orderByComparator, true);

			array[1] = dossierProc;

			array[2] = getByC_AC_PrevAndNext(session, dossierProc, companyId,
					statusActive, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierProc getByC_AC_PrevAndNext(Session session,
		DossierProc dossierProc, long companyId, int statusActive,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

		query.append(_FINDER_COLUMN_C_AC_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_AC_STATUSACTIVE_2);

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
			query.append(DossierProcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(statusActive);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier procs where companyId = &#63; and statusActive = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param statusActive the status active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_AC(long companyId, int statusActive)
		throws SystemException {
		for (DossierProc dossierProc : findByC_AC(companyId, statusActive,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs where companyId = &#63; and statusActive = &#63;.
	 *
	 * @param companyId the company ID
	 * @param statusActive the status active
	 * @return the number of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_AC(long companyId, int statusActive)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_AC;

		Object[] finderArgs = new Object[] { companyId, statusActive };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_C_AC_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_AC_STATUSACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(statusActive);

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

	private static final String _FINDER_COLUMN_C_AC_COMPANYID_2 = "dossierProc.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_AC_STATUSACTIVE_2 = "dossierProc.statusActive = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_AC = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_AC",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_AC = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, DossierProcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_AC",
			new String[] { Long.class.getName(), Integer.class.getName() },
			DossierProcModelImpl.GROUPID_COLUMN_BITMASK |
			DossierProcModelImpl.STATUSACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_AC = new FinderPath(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_AC",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dossier procs where groupId = &#63; and statusActive = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusActive the status active
	 * @return the matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByG_AC(long groupId, int statusActive)
		throws SystemException {
		return findByG_AC(groupId, statusActive, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs where groupId = &#63; and statusActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusActive the status active
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByG_AC(long groupId, int statusActive,
		int start, int end) throws SystemException {
		return findByG_AC(groupId, statusActive, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs where groupId = &#63; and statusActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusActive the status active
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findByG_AC(long groupId, int statusActive,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_AC;
			finderArgs = new Object[] { groupId, statusActive };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_AC;
			finderArgs = new Object[] {
					groupId, statusActive,
					
					start, end, orderByComparator
				};
		}

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierProc dossierProc : list) {
				if ((groupId != dossierProc.getGroupId()) ||
						(statusActive != dossierProc.getStatusActive())) {
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

			query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_G_AC_GROUPID_2);

			query.append(_FINDER_COLUMN_G_AC_STATUSACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierProcModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusActive);

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier proc in the ordered set where groupId = &#63; and statusActive = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusActive the status active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByG_AC_First(long groupId, int statusActive,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByG_AC_First(groupId, statusActive,
				orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusActive=");
		msg.append(statusActive);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the first dossier proc in the ordered set where groupId = &#63; and statusActive = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusActive the status active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByG_AC_First(long groupId, int statusActive,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierProc> list = findByG_AC(groupId, statusActive, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier proc in the ordered set where groupId = &#63; and statusActive = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusActive the status active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByG_AC_Last(long groupId, int statusActive,
		OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByG_AC_Last(groupId, statusActive,
				orderByComparator);

		if (dossierProc != null) {
			return dossierProc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusActive=");
		msg.append(statusActive);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierProcException(msg.toString());
	}

	/**
	 * Returns the last dossier proc in the ordered set where groupId = &#63; and statusActive = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusActive the status active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByG_AC_Last(long groupId, int statusActive,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_AC(groupId, statusActive);

		if (count == 0) {
			return null;
		}

		List<DossierProc> list = findByG_AC(groupId, statusActive, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier procs before and after the current dossier proc in the ordered set where groupId = &#63; and statusActive = &#63;.
	 *
	 * @param dossierProcId the primary key of the current dossier proc
	 * @param groupId the group ID
	 * @param statusActive the status active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc[] findByG_AC_PrevAndNext(long dossierProcId,
		long groupId, int statusActive, OrderByComparator orderByComparator)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = findByPrimaryKey(dossierProcId);

		Session session = null;

		try {
			session = openSession();

			DossierProc[] array = new DossierProcImpl[3];

			array[0] = getByG_AC_PrevAndNext(session, dossierProc, groupId,
					statusActive, orderByComparator, true);

			array[1] = dossierProc;

			array[2] = getByG_AC_PrevAndNext(session, dossierProc, groupId,
					statusActive, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierProc getByG_AC_PrevAndNext(Session session,
		DossierProc dossierProc, long groupId, int statusActive,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERPROC_WHERE);

		query.append(_FINDER_COLUMN_G_AC_GROUPID_2);

		query.append(_FINDER_COLUMN_G_AC_STATUSACTIVE_2);

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
			query.append(DossierProcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusActive);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierProc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierProc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier procs where groupId = &#63; and statusActive = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusActive the status active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_AC(long groupId, int statusActive)
		throws SystemException {
		for (DossierProc dossierProc : findByG_AC(groupId, statusActive,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs where groupId = &#63; and statusActive = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusActive the status active
	 * @return the number of matching dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_AC(long groupId, int statusActive)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_AC;

		Object[] finderArgs = new Object[] { groupId, statusActive };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERPROC_WHERE);

			query.append(_FINDER_COLUMN_G_AC_GROUPID_2);

			query.append(_FINDER_COLUMN_G_AC_STATUSACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusActive);

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

	private static final String _FINDER_COLUMN_G_AC_GROUPID_2 = "dossierProc.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_AC_STATUSACTIVE_2 = "dossierProc.statusActive = ?";

	public DossierProcPersistenceImpl() {
		setModelClass(DossierProc.class);
	}

	/**
	 * Caches the dossier proc in the entity cache if it is enabled.
	 *
	 * @param dossierProc the dossier proc
	 */
	@Override
	public void cacheResult(DossierProc dossierProc) {
		EntityCacheUtil.putResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcImpl.class, dossierProc.getPrimaryKey(), dossierProc);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_DPN,
			new Object[] {
				dossierProc.getCompanyId(), dossierProc.getGroupId(),
				dossierProc.getDossierProcNo()
			}, dossierProc);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DPN,
			new Object[] { dossierProc.getDossierProcNo() }, dossierProc);

		dossierProc.resetOriginalValues();
	}

	/**
	 * Caches the dossier procs in the entity cache if it is enabled.
	 *
	 * @param dossierProcs the dossier procs
	 */
	@Override
	public void cacheResult(List<DossierProc> dossierProcs) {
		for (DossierProc dossierProc : dossierProcs) {
			if (EntityCacheUtil.getResult(
						DossierProcModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcImpl.class, dossierProc.getPrimaryKey()) == null) {
				cacheResult(dossierProc);
			}
			else {
				dossierProc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier procs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierProcImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierProcImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier proc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierProc dossierProc) {
		EntityCacheUtil.removeResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcImpl.class, dossierProc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dossierProc);
	}

	@Override
	public void clearCache(List<DossierProc> dossierProcs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierProc dossierProc : dossierProcs) {
			EntityCacheUtil.removeResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcImpl.class, dossierProc.getPrimaryKey());

			clearUniqueFindersCache(dossierProc);
		}
	}

	protected void cacheUniqueFindersCache(DossierProc dossierProc) {
		if (dossierProc.isNew()) {
			Object[] args = new Object[] {
					dossierProc.getCompanyId(), dossierProc.getGroupId(),
					dossierProc.getDossierProcNo()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_G_DPN, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_DPN, args,
				dossierProc);

			args = new Object[] { dossierProc.getDossierProcNo() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DPN, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DPN, args,
				dossierProc);
		}
		else {
			DossierProcModelImpl dossierProcModelImpl = (DossierProcModelImpl)dossierProc;

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_G_DPN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProc.getCompanyId(), dossierProc.getGroupId(),
						dossierProc.getDossierProcNo()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_G_DPN, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_DPN, args,
					dossierProc);
			}

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DPN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dossierProc.getDossierProcNo() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DPN, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DPN, args,
					dossierProc);
			}
		}
	}

	protected void clearUniqueFindersCache(DossierProc dossierProc) {
		DossierProcModelImpl dossierProcModelImpl = (DossierProcModelImpl)dossierProc;

		Object[] args = new Object[] {
				dossierProc.getCompanyId(), dossierProc.getGroupId(),
				dossierProc.getDossierProcNo()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_DPN, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G_DPN, args);

		if ((dossierProcModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_G_DPN.getColumnBitmask()) != 0) {
			args = new Object[] {
					dossierProcModelImpl.getOriginalCompanyId(),
					dossierProcModelImpl.getOriginalGroupId(),
					dossierProcModelImpl.getOriginalDossierProcNo()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_DPN, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G_DPN, args);
		}

		args = new Object[] { dossierProc.getDossierProcNo() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DPN, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DPN, args);

		if ((dossierProcModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DPN.getColumnBitmask()) != 0) {
			args = new Object[] { dossierProcModelImpl.getOriginalDossierProcNo() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DPN, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DPN, args);
		}
	}

	/**
	 * Creates a new dossier proc with the primary key. Does not add the dossier proc to the database.
	 *
	 * @param dossierProcId the primary key for the new dossier proc
	 * @return the new dossier proc
	 */
	@Override
	public DossierProc create(long dossierProcId) {
		DossierProc dossierProc = new DossierProcImpl();

		dossierProc.setNew(true);
		dossierProc.setPrimaryKey(dossierProcId);

		return dossierProc;
	}

	/**
	 * Removes the dossier proc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierProcId the primary key of the dossier proc
	 * @return the dossier proc that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc remove(long dossierProcId)
		throws NoSuchDossierProcException, SystemException {
		return remove((Serializable)dossierProcId);
	}

	/**
	 * Removes the dossier proc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier proc
	 * @return the dossier proc that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc remove(Serializable primaryKey)
		throws NoSuchDossierProcException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierProc dossierProc = (DossierProc)session.get(DossierProcImpl.class,
					primaryKey);

			if (dossierProc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierProcException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierProc);
		}
		catch (NoSuchDossierProcException nsee) {
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
	protected DossierProc removeImpl(DossierProc dossierProc)
		throws SystemException {
		dossierProc = toUnwrappedModel(dossierProc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierProc)) {
				dossierProc = (DossierProc)session.get(DossierProcImpl.class,
						dossierProc.getPrimaryKeyObj());
			}

			if (dossierProc != null) {
				session.delete(dossierProc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierProc != null) {
			clearCache(dossierProc);
		}

		return dossierProc;
	}

	@Override
	public DossierProc updateImpl(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws SystemException {
		dossierProc = toUnwrappedModel(dossierProc);

		boolean isNew = dossierProc.isNew();

		DossierProcModelImpl dossierProcModelImpl = (DossierProcModelImpl)dossierProc;

		Session session = null;

		try {
			session = openSession();

			if (dossierProc.isNew()) {
				session.save(dossierProc);

				dossierProc.setNew(false);
			}
			else {
				session.merge(dossierProc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DossierProcModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);

				args = new Object[] { dossierProcModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);
			}

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcModelImpl.getOriginalCompanyId(),
						dossierProcModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);

				args = new Object[] {
						dossierProcModelImpl.getCompanyId(),
						dossierProcModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);
			}

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcModelImpl.getOriginalCompanyId(),
						dossierProcModelImpl.getOriginalGroupId(),
						dossierProcModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_U,
					args);

				args = new Object[] {
						dossierProcModelImpl.getCompanyId(),
						dossierProcModelImpl.getGroupId(),
						dossierProcModelImpl.getUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_U,
					args);
			}

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ANO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcModelImpl.getOriginalCompanyId(),
						dossierProcModelImpl.getOriginalAdministrationNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_ANO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ANO,
					args);

				args = new Object[] {
						dossierProcModelImpl.getCompanyId(),
						dossierProcModelImpl.getAdministrationNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_ANO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ANO,
					args);
			}

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_ANO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcModelImpl.getOriginalCompanyId(),
						dossierProcModelImpl.getOriginalGroupId(),
						dossierProcModelImpl.getOriginalAdministrationNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_ANO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_ANO,
					args);

				args = new Object[] {
						dossierProcModelImpl.getCompanyId(),
						dossierProcModelImpl.getGroupId(),
						dossierProcModelImpl.getAdministrationNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_ANO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_ANO,
					args);
			}

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcModelImpl.getOriginalCompanyId(),
						dossierProcModelImpl.getOriginalDomainNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DNO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DNO,
					args);

				args = new Object[] {
						dossierProcModelImpl.getCompanyId(),
						dossierProcModelImpl.getDomainNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DNO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DNO,
					args);
			}

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_DNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcModelImpl.getOriginalCompanyId(),
						dossierProcModelImpl.getOriginalGroupId(),
						dossierProcModelImpl.getOriginalDomainNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_DNO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_DNO,
					args);

				args = new Object[] {
						dossierProcModelImpl.getCompanyId(),
						dossierProcModelImpl.getGroupId(),
						dossierProcModelImpl.getDomainNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_DNO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_DNO,
					args);
			}

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ANO_DNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcModelImpl.getOriginalCompanyId(),
						dossierProcModelImpl.getOriginalAdministrationNo(),
						dossierProcModelImpl.getOriginalDomainNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_ANO_DNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ANO_DNO,
					args);

				args = new Object[] {
						dossierProcModelImpl.getCompanyId(),
						dossierProcModelImpl.getAdministrationNo(),
						dossierProcModelImpl.getDomainNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_ANO_DNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ANO_DNO,
					args);
			}

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_ANO_DNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcModelImpl.getOriginalCompanyId(),
						dossierProcModelImpl.getOriginalGroupId(),
						dossierProcModelImpl.getOriginalAdministrationNo(),
						dossierProcModelImpl.getOriginalDomainNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_ANO_DNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_ANO_DNO,
					args);

				args = new Object[] {
						dossierProcModelImpl.getCompanyId(),
						dossierProcModelImpl.getGroupId(),
						dossierProcModelImpl.getAdministrationNo(),
						dossierProcModelImpl.getDomainNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_ANO_DNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G_ANO_DNO,
					args);
			}

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { dossierProcModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_AC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcModelImpl.getOriginalCompanyId(),
						dossierProcModelImpl.getOriginalStatusActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_AC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_AC,
					args);

				args = new Object[] {
						dossierProcModelImpl.getCompanyId(),
						dossierProcModelImpl.getStatusActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_AC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_AC,
					args);
			}

			if ((dossierProcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_AC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierProcModelImpl.getOriginalGroupId(),
						dossierProcModelImpl.getOriginalStatusActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_AC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_AC,
					args);

				args = new Object[] {
						dossierProcModelImpl.getGroupId(),
						dossierProcModelImpl.getStatusActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_AC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_AC,
					args);
			}
		}

		EntityCacheUtil.putResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
			DossierProcImpl.class, dossierProc.getPrimaryKey(), dossierProc);

		clearUniqueFindersCache(dossierProc);
		cacheUniqueFindersCache(dossierProc);

		return dossierProc;
	}

	protected DossierProc toUnwrappedModel(DossierProc dossierProc) {
		if (dossierProc instanceof DossierProcImpl) {
			return dossierProc;
		}

		DossierProcImpl dossierProcImpl = new DossierProcImpl();

		dossierProcImpl.setNew(dossierProc.isNew());
		dossierProcImpl.setPrimaryKey(dossierProc.getPrimaryKey());

		dossierProcImpl.setDossierProcId(dossierProc.getDossierProcId());
		dossierProcImpl.setUserId(dossierProc.getUserId());
		dossierProcImpl.setGroupId(dossierProc.getGroupId());
		dossierProcImpl.setCompanyId(dossierProc.getCompanyId());
		dossierProcImpl.setCreateDate(dossierProc.getCreateDate());
		dossierProcImpl.setModifiedDate(dossierProc.getModifiedDate());
		dossierProcImpl.setDossierProcNo(dossierProc.getDossierProcNo());
		dossierProcImpl.setName(dossierProc.getName());
		dossierProcImpl.setEnName(dossierProc.getEnName());
		dossierProcImpl.setShortName(dossierProc.getShortName());
		dossierProcImpl.setProcessDescription(dossierProc.getProcessDescription());
		dossierProcImpl.setMethodDescription(dossierProc.getMethodDescription());
		dossierProcImpl.setDossierDescription(dossierProc.getDossierDescription());
		dossierProcImpl.setConditionDescription(dossierProc.getConditionDescription());
		dossierProcImpl.setDurationDescription(dossierProc.getDurationDescription());
		dossierProcImpl.setActorsDescription(dossierProc.getActorsDescription());
		dossierProcImpl.setResultsDescription(dossierProc.getResultsDescription());
		dossierProcImpl.setRecordsDescription(dossierProc.getRecordsDescription());
		dossierProcImpl.setFeeDescription(dossierProc.getFeeDescription());
		dossierProcImpl.setInstructionsDescription(dossierProc.getInstructionsDescription());
		dossierProcImpl.setAdministrationNo(dossierProc.getAdministrationNo());
		dossierProcImpl.setAdministrationName(dossierProc.getAdministrationName());
		dossierProcImpl.setDomainNo(dossierProc.getDomainNo());
		dossierProcImpl.setDomainName(dossierProc.getDomainName());
		dossierProcImpl.setForCitizen(dossierProc.getForCitizen());
		dossierProcImpl.setForBusiness(dossierProc.getForBusiness());
		dossierProcImpl.setEffectDate(dossierProc.getEffectDate());
		dossierProcImpl.setExpireDate(dossierProc.getExpireDate());
		dossierProcImpl.setStatusActive(dossierProc.getStatusActive());

		return dossierProcImpl;
	}

	/**
	 * Returns the dossier proc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc
	 * @return the dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierProcException, SystemException {
		DossierProc dossierProc = fetchByPrimaryKey(primaryKey);

		if (dossierProc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierProcException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierProc;
	}

	/**
	 * Returns the dossier proc with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcException} if it could not be found.
	 *
	 * @param dossierProcId the primary key of the dossier proc
	 * @return the dossier proc
	 * @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc findByPrimaryKey(long dossierProcId)
		throws NoSuchDossierProcException, SystemException {
		return findByPrimaryKey((Serializable)dossierProcId);
	}

	/**
	 * Returns the dossier proc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier proc
	 * @return the dossier proc, or <code>null</code> if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierProc dossierProc = (DossierProc)EntityCacheUtil.getResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
				DossierProcImpl.class, primaryKey);

		if (dossierProc == _nullDossierProc) {
			return null;
		}

		if (dossierProc == null) {
			Session session = null;

			try {
				session = openSession();

				dossierProc = (DossierProc)session.get(DossierProcImpl.class,
						primaryKey);

				if (dossierProc != null) {
					cacheResult(dossierProc);
				}
				else {
					EntityCacheUtil.putResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
						DossierProcImpl.class, primaryKey, _nullDossierProc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierProcModelImpl.ENTITY_CACHE_ENABLED,
					DossierProcImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierProc;
	}

	/**
	 * Returns the dossier proc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierProcId the primary key of the dossier proc
	 * @return the dossier proc, or <code>null</code> if a dossier proc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierProc fetchByPrimaryKey(long dossierProcId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierProcId);
	}

	/**
	 * Returns all the dossier procs.
	 *
	 * @return the dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier procs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @return the range of dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier procs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier procs
	 * @param end the upper bound of the range of dossier procs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier procs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierProc> findAll(int start, int end,
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

		List<DossierProc> list = (List<DossierProc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERPROC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERPROC;

				if (pagination) {
					sql = sql.concat(DossierProcModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierProc>(list);
				}
				else {
					list = (List<DossierProc>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dossier procs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierProc dossierProc : findAll()) {
			remove(dossierProc);
		}
	}

	/**
	 * Returns the number of dossier procs.
	 *
	 * @return the number of dossier procs
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERPROC);

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
	 * Initializes the dossier proc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.DossierProc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierProc>> listenersList = new ArrayList<ModelListener<DossierProc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierProc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierProcImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERPROC = "SELECT dossierProc FROM DossierProc dossierProc";
	private static final String _SQL_SELECT_DOSSIERPROC_WHERE = "SELECT dossierProc FROM DossierProc dossierProc WHERE ";
	private static final String _SQL_COUNT_DOSSIERPROC = "SELECT COUNT(dossierProc) FROM DossierProc dossierProc";
	private static final String _SQL_COUNT_DOSSIERPROC_WHERE = "SELECT COUNT(dossierProc) FROM DossierProc dossierProc WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierProc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierProc exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DossierProc exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierProcPersistenceImpl.class);
	private static DossierProc _nullDossierProc = new DossierProcImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierProc> toCacheModel() {
				return _nullDossierProcCacheModel;
			}
		};

	private static CacheModel<DossierProc> _nullDossierProcCacheModel = new CacheModel<DossierProc>() {
			@Override
			public DossierProc toEntityModel() {
				return _nullDossierProc;
			}
		};
}