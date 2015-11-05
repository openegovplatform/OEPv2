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

import org.oep.usermgt.NoSuchCitizenException;
import org.oep.usermgt.model.Citizen;
import org.oep.usermgt.model.impl.CitizenImpl;
import org.oep.usermgt.model.impl.CitizenModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the citizen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see CitizenPersistence
 * @see CitizenUtil
 * @generated
 */
public class CitizenPersistenceImpl extends BasePersistenceImpl<Citizen>
	implements CitizenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CitizenUtil} to access the citizen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CitizenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, CitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, CitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CN = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, CitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, CitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCN",
			new String[] { String.class.getName() },
			CitizenModelImpl.CITYNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CN = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the citizens where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @return the matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Citizen> findByCN(String cityNo) throws SystemException {
		return findByCN(cityNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizens where cityNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cityNo the city no
	 * @param start the lower bound of the range of citizens
	 * @param end the upper bound of the range of citizens (not inclusive)
	 * @return the range of matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Citizen> findByCN(String cityNo, int start, int end)
		throws SystemException {
		return findByCN(cityNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizens where cityNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cityNo the city no
	 * @param start the lower bound of the range of citizens
	 * @param end the upper bound of the range of citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Citizen> findByCN(String cityNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN;
			finderArgs = new Object[] { cityNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CN;
			finderArgs = new Object[] { cityNo, start, end, orderByComparator };
		}

		List<Citizen> list = (List<Citizen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Citizen citizen : list) {
				if (!Validator.equals(cityNo, citizen.getCityNo())) {
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

			query.append(_SQL_SELECT_CITIZEN_WHERE);

			boolean bindCityNo = false;

			if (cityNo == null) {
				query.append(_FINDER_COLUMN_CN_CITYNO_1);
			}
			else if (cityNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CN_CITYNO_3);
			}
			else {
				bindCityNo = true;

				query.append(_FINDER_COLUMN_CN_CITYNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCityNo) {
					qPos.add(cityNo);
				}

				if (!pagination) {
					list = (List<Citizen>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Citizen>(list);
				}
				else {
					list = (List<Citizen>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first citizen in the ordered set where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen findByCN_First(String cityNo,
		OrderByComparator orderByComparator)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = fetchByCN_First(cityNo, orderByComparator);

		if (citizen != null) {
			return citizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cityNo=");
		msg.append(cityNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenException(msg.toString());
	}

	/**
	 * Returns the first citizen in the ordered set where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen, or <code>null</code> if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen fetchByCN_First(String cityNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<Citizen> list = findByCN(cityNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last citizen in the ordered set where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen findByCN_Last(String cityNo,
		OrderByComparator orderByComparator)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = fetchByCN_Last(cityNo, orderByComparator);

		if (citizen != null) {
			return citizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cityNo=");
		msg.append(cityNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenException(msg.toString());
	}

	/**
	 * Returns the last citizen in the ordered set where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen, or <code>null</code> if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen fetchByCN_Last(String cityNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCN(cityNo);

		if (count == 0) {
			return null;
		}

		List<Citizen> list = findByCN(cityNo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the citizens before and after the current citizen in the ordered set where cityNo = &#63;.
	 *
	 * @param citizenId the primary key of the current citizen
	 * @param cityNo the city no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen[] findByCN_PrevAndNext(long citizenId, String cityNo,
		OrderByComparator orderByComparator)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = findByPrimaryKey(citizenId);

		Session session = null;

		try {
			session = openSession();

			Citizen[] array = new CitizenImpl[3];

			array[0] = getByCN_PrevAndNext(session, citizen, cityNo,
					orderByComparator, true);

			array[1] = citizen;

			array[2] = getByCN_PrevAndNext(session, citizen, cityNo,
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

	protected Citizen getByCN_PrevAndNext(Session session, Citizen citizen,
		String cityNo, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CITIZEN_WHERE);

		boolean bindCityNo = false;

		if (cityNo == null) {
			query.append(_FINDER_COLUMN_CN_CITYNO_1);
		}
		else if (cityNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CN_CITYNO_3);
		}
		else {
			bindCityNo = true;

			query.append(_FINDER_COLUMN_CN_CITYNO_2);
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
			query.append(CitizenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCityNo) {
			qPos.add(cityNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(citizen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Citizen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the citizens where cityNo = &#63; from the database.
	 *
	 * @param cityNo the city no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCN(String cityNo) throws SystemException {
		for (Citizen citizen : findByCN(cityNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(citizen);
		}
	}

	/**
	 * Returns the number of citizens where cityNo = &#63;.
	 *
	 * @param cityNo the city no
	 * @return the number of matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCN(String cityNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CN;

		Object[] finderArgs = new Object[] { cityNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CITIZEN_WHERE);

			boolean bindCityNo = false;

			if (cityNo == null) {
				query.append(_FINDER_COLUMN_CN_CITYNO_1);
			}
			else if (cityNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CN_CITYNO_3);
			}
			else {
				bindCityNo = true;

				query.append(_FINDER_COLUMN_CN_CITYNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCityNo) {
					qPos.add(cityNo);
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

	private static final String _FINDER_COLUMN_CN_CITYNO_1 = "citizen.cityNo IS NULL";
	private static final String _FINDER_COLUMN_CN_CITYNO_2 = "citizen.cityNo = ?";
	private static final String _FINDER_COLUMN_CN_CITYNO_3 = "(citizen.cityNo IS NULL OR citizen.cityNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DN = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, CitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, CitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDN",
			new String[] { String.class.getName() },
			CitizenModelImpl.DISTRICTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DN = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the citizens where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @return the matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Citizen> findByDN(String districtNo) throws SystemException {
		return findByDN(districtNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizens where districtNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param districtNo the district no
	 * @param start the lower bound of the range of citizens
	 * @param end the upper bound of the range of citizens (not inclusive)
	 * @return the range of matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Citizen> findByDN(String districtNo, int start, int end)
		throws SystemException {
		return findByDN(districtNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizens where districtNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param districtNo the district no
	 * @param start the lower bound of the range of citizens
	 * @param end the upper bound of the range of citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Citizen> findByDN(String districtNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN;
			finderArgs = new Object[] { districtNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DN;
			finderArgs = new Object[] { districtNo, start, end, orderByComparator };
		}

		List<Citizen> list = (List<Citizen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Citizen citizen : list) {
				if (!Validator.equals(districtNo, citizen.getDistrictNo())) {
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

			query.append(_SQL_SELECT_CITIZEN_WHERE);

			boolean bindDistrictNo = false;

			if (districtNo == null) {
				query.append(_FINDER_COLUMN_DN_DISTRICTNO_1);
			}
			else if (districtNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DN_DISTRICTNO_3);
			}
			else {
				bindDistrictNo = true;

				query.append(_FINDER_COLUMN_DN_DISTRICTNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDistrictNo) {
					qPos.add(districtNo);
				}

				if (!pagination) {
					list = (List<Citizen>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Citizen>(list);
				}
				else {
					list = (List<Citizen>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first citizen in the ordered set where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen findByDN_First(String districtNo,
		OrderByComparator orderByComparator)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = fetchByDN_First(districtNo, orderByComparator);

		if (citizen != null) {
			return citizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("districtNo=");
		msg.append(districtNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenException(msg.toString());
	}

	/**
	 * Returns the first citizen in the ordered set where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen, or <code>null</code> if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen fetchByDN_First(String districtNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<Citizen> list = findByDN(districtNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last citizen in the ordered set where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen findByDN_Last(String districtNo,
		OrderByComparator orderByComparator)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = fetchByDN_Last(districtNo, orderByComparator);

		if (citizen != null) {
			return citizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("districtNo=");
		msg.append(districtNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenException(msg.toString());
	}

	/**
	 * Returns the last citizen in the ordered set where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen, or <code>null</code> if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen fetchByDN_Last(String districtNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDN(districtNo);

		if (count == 0) {
			return null;
		}

		List<Citizen> list = findByDN(districtNo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the citizens before and after the current citizen in the ordered set where districtNo = &#63;.
	 *
	 * @param citizenId the primary key of the current citizen
	 * @param districtNo the district no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen[] findByDN_PrevAndNext(long citizenId, String districtNo,
		OrderByComparator orderByComparator)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = findByPrimaryKey(citizenId);

		Session session = null;

		try {
			session = openSession();

			Citizen[] array = new CitizenImpl[3];

			array[0] = getByDN_PrevAndNext(session, citizen, districtNo,
					orderByComparator, true);

			array[1] = citizen;

			array[2] = getByDN_PrevAndNext(session, citizen, districtNo,
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

	protected Citizen getByDN_PrevAndNext(Session session, Citizen citizen,
		String districtNo, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CITIZEN_WHERE);

		boolean bindDistrictNo = false;

		if (districtNo == null) {
			query.append(_FINDER_COLUMN_DN_DISTRICTNO_1);
		}
		else if (districtNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DN_DISTRICTNO_3);
		}
		else {
			bindDistrictNo = true;

			query.append(_FINDER_COLUMN_DN_DISTRICTNO_2);
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
			query.append(CitizenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDistrictNo) {
			qPos.add(districtNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(citizen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Citizen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the citizens where districtNo = &#63; from the database.
	 *
	 * @param districtNo the district no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDN(String districtNo) throws SystemException {
		for (Citizen citizen : findByDN(districtNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(citizen);
		}
	}

	/**
	 * Returns the number of citizens where districtNo = &#63;.
	 *
	 * @param districtNo the district no
	 * @return the number of matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDN(String districtNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DN;

		Object[] finderArgs = new Object[] { districtNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CITIZEN_WHERE);

			boolean bindDistrictNo = false;

			if (districtNo == null) {
				query.append(_FINDER_COLUMN_DN_DISTRICTNO_1);
			}
			else if (districtNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DN_DISTRICTNO_3);
			}
			else {
				bindDistrictNo = true;

				query.append(_FINDER_COLUMN_DN_DISTRICTNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDistrictNo) {
					qPos.add(districtNo);
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

	private static final String _FINDER_COLUMN_DN_DISTRICTNO_1 = "citizen.districtNo IS NULL";
	private static final String _FINDER_COLUMN_DN_DISTRICTNO_2 = "citizen.districtNo = ?";
	private static final String _FINDER_COLUMN_DN_DISTRICTNO_3 = "(citizen.districtNo IS NULL OR citizen.districtNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WN = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, CitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByWN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WN = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, CitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByWN",
			new String[] { String.class.getName() },
			CitizenModelImpl.WARDNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WN = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByWN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the citizens where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @return the matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Citizen> findByWN(String wardNo) throws SystemException {
		return findByWN(wardNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizens where wardNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param wardNo the ward no
	 * @param start the lower bound of the range of citizens
	 * @param end the upper bound of the range of citizens (not inclusive)
	 * @return the range of matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Citizen> findByWN(String wardNo, int start, int end)
		throws SystemException {
		return findByWN(wardNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizens where wardNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param wardNo the ward no
	 * @param start the lower bound of the range of citizens
	 * @param end the upper bound of the range of citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Citizen> findByWN(String wardNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WN;
			finderArgs = new Object[] { wardNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WN;
			finderArgs = new Object[] { wardNo, start, end, orderByComparator };
		}

		List<Citizen> list = (List<Citizen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Citizen citizen : list) {
				if (!Validator.equals(wardNo, citizen.getWardNo())) {
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

			query.append(_SQL_SELECT_CITIZEN_WHERE);

			boolean bindWardNo = false;

			if (wardNo == null) {
				query.append(_FINDER_COLUMN_WN_WARDNO_1);
			}
			else if (wardNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_WN_WARDNO_3);
			}
			else {
				bindWardNo = true;

				query.append(_FINDER_COLUMN_WN_WARDNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindWardNo) {
					qPos.add(wardNo);
				}

				if (!pagination) {
					list = (List<Citizen>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Citizen>(list);
				}
				else {
					list = (List<Citizen>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first citizen in the ordered set where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen findByWN_First(String wardNo,
		OrderByComparator orderByComparator)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = fetchByWN_First(wardNo, orderByComparator);

		if (citizen != null) {
			return citizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wardNo=");
		msg.append(wardNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenException(msg.toString());
	}

	/**
	 * Returns the first citizen in the ordered set where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen, or <code>null</code> if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen fetchByWN_First(String wardNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<Citizen> list = findByWN(wardNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last citizen in the ordered set where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen findByWN_Last(String wardNo,
		OrderByComparator orderByComparator)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = fetchByWN_Last(wardNo, orderByComparator);

		if (citizen != null) {
			return citizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wardNo=");
		msg.append(wardNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenException(msg.toString());
	}

	/**
	 * Returns the last citizen in the ordered set where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen, or <code>null</code> if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen fetchByWN_Last(String wardNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByWN(wardNo);

		if (count == 0) {
			return null;
		}

		List<Citizen> list = findByWN(wardNo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the citizens before and after the current citizen in the ordered set where wardNo = &#63;.
	 *
	 * @param citizenId the primary key of the current citizen
	 * @param wardNo the ward no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen[] findByWN_PrevAndNext(long citizenId, String wardNo,
		OrderByComparator orderByComparator)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = findByPrimaryKey(citizenId);

		Session session = null;

		try {
			session = openSession();

			Citizen[] array = new CitizenImpl[3];

			array[0] = getByWN_PrevAndNext(session, citizen, wardNo,
					orderByComparator, true);

			array[1] = citizen;

			array[2] = getByWN_PrevAndNext(session, citizen, wardNo,
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

	protected Citizen getByWN_PrevAndNext(Session session, Citizen citizen,
		String wardNo, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CITIZEN_WHERE);

		boolean bindWardNo = false;

		if (wardNo == null) {
			query.append(_FINDER_COLUMN_WN_WARDNO_1);
		}
		else if (wardNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_WN_WARDNO_3);
		}
		else {
			bindWardNo = true;

			query.append(_FINDER_COLUMN_WN_WARDNO_2);
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
			query.append(CitizenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindWardNo) {
			qPos.add(wardNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(citizen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Citizen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the citizens where wardNo = &#63; from the database.
	 *
	 * @param wardNo the ward no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByWN(String wardNo) throws SystemException {
		for (Citizen citizen : findByWN(wardNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(citizen);
		}
	}

	/**
	 * Returns the number of citizens where wardNo = &#63;.
	 *
	 * @param wardNo the ward no
	 * @return the number of matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByWN(String wardNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WN;

		Object[] finderArgs = new Object[] { wardNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CITIZEN_WHERE);

			boolean bindWardNo = false;

			if (wardNo == null) {
				query.append(_FINDER_COLUMN_WN_WARDNO_1);
			}
			else if (wardNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_WN_WARDNO_3);
			}
			else {
				bindWardNo = true;

				query.append(_FINDER_COLUMN_WN_WARDNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindWardNo) {
					qPos.add(wardNo);
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

	private static final String _FINDER_COLUMN_WN_WARDNO_1 = "citizen.wardNo IS NULL";
	private static final String _FINDER_COLUMN_WN_WARDNO_2 = "citizen.wardNo = ?";
	private static final String _FINDER_COLUMN_WN_WARDNO_3 = "(citizen.wardNo IS NULL OR citizen.wardNo = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_MU = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, CitizenImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMU",
			new String[] { Long.class.getName() },
			CitizenModelImpl.MAPPINGUSERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MU = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMU",
			new String[] { Long.class.getName() });

	/**
	 * Returns the citizen where mappingUserId = &#63; or throws a {@link org.oep.usermgt.NoSuchCitizenException} if it could not be found.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the matching citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen findByMU(long mappingUserId)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = fetchByMU(mappingUserId);

		if (citizen == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("mappingUserId=");
			msg.append(mappingUserId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCitizenException(msg.toString());
		}

		return citizen;
	}

	/**
	 * Returns the citizen where mappingUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the matching citizen, or <code>null</code> if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen fetchByMU(long mappingUserId) throws SystemException {
		return fetchByMU(mappingUserId, true);
	}

	/**
	 * Returns the citizen where mappingUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param mappingUserId the mapping user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching citizen, or <code>null</code> if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen fetchByMU(long mappingUserId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { mappingUserId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MU,
					finderArgs, this);
		}

		if (result instanceof Citizen) {
			Citizen citizen = (Citizen)result;

			if ((mappingUserId != citizen.getMappingUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CITIZEN_WHERE);

			query.append(_FINDER_COLUMN_MU_MAPPINGUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mappingUserId);

				List<Citizen> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MU,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CitizenPersistenceImpl.fetchByMU(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Citizen citizen = list.get(0);

					result = citizen;

					cacheResult(citizen);

					if ((citizen.getMappingUserId() != mappingUserId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MU,
							finderArgs, citizen);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MU, finderArgs);

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
			return (Citizen)result;
		}
	}

	/**
	 * Removes the citizen where mappingUserId = &#63; from the database.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the citizen that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen removeByMU(long mappingUserId)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = findByMU(mappingUserId);

		return remove(citizen);
	}

	/**
	 * Returns the number of citizens where mappingUserId = &#63;.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the number of matching citizens
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

			query.append(_SQL_COUNT_CITIZEN_WHERE);

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

	private static final String _FINDER_COLUMN_MU_MAPPINGUSERID_2 = "citizen.mappingUserId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_IN = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, CitizenImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByIN",
			new String[] { String.class.getName() },
			CitizenModelImpl.IDENTIFICATIONNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IN = new FinderPath(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIN",
			new String[] { String.class.getName() });

	/**
	 * Returns the citizen where identificationNo = &#63; or throws a {@link org.oep.usermgt.NoSuchCitizenException} if it could not be found.
	 *
	 * @param identificationNo the identification no
	 * @return the matching citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen findByIN(String identificationNo)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = fetchByIN(identificationNo);

		if (citizen == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("identificationNo=");
			msg.append(identificationNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCitizenException(msg.toString());
		}

		return citizen;
	}

	/**
	 * Returns the citizen where identificationNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param identificationNo the identification no
	 * @return the matching citizen, or <code>null</code> if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen fetchByIN(String identificationNo) throws SystemException {
		return fetchByIN(identificationNo, true);
	}

	/**
	 * Returns the citizen where identificationNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param identificationNo the identification no
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching citizen, or <code>null</code> if a matching citizen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen fetchByIN(String identificationNo, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { identificationNo };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_IN,
					finderArgs, this);
		}

		if (result instanceof Citizen) {
			Citizen citizen = (Citizen)result;

			if (!Validator.equals(identificationNo,
						citizen.getIdentificationNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CITIZEN_WHERE);

			boolean bindIdentificationNo = false;

			if (identificationNo == null) {
				query.append(_FINDER_COLUMN_IN_IDENTIFICATIONNO_1);
			}
			else if (identificationNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IN_IDENTIFICATIONNO_3);
			}
			else {
				bindIdentificationNo = true;

				query.append(_FINDER_COLUMN_IN_IDENTIFICATIONNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIdentificationNo) {
					qPos.add(identificationNo);
				}

				List<Citizen> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IN,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CitizenPersistenceImpl.fetchByIN(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Citizen citizen = list.get(0);

					result = citizen;

					cacheResult(citizen);

					if ((citizen.getIdentificationNo() == null) ||
							!citizen.getIdentificationNo()
										.equals(identificationNo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IN,
							finderArgs, citizen);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IN, finderArgs);

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
			return (Citizen)result;
		}
	}

	/**
	 * Removes the citizen where identificationNo = &#63; from the database.
	 *
	 * @param identificationNo the identification no
	 * @return the citizen that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen removeByIN(String identificationNo)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = findByIN(identificationNo);

		return remove(citizen);
	}

	/**
	 * Returns the number of citizens where identificationNo = &#63;.
	 *
	 * @param identificationNo the identification no
	 * @return the number of matching citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByIN(String identificationNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IN;

		Object[] finderArgs = new Object[] { identificationNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CITIZEN_WHERE);

			boolean bindIdentificationNo = false;

			if (identificationNo == null) {
				query.append(_FINDER_COLUMN_IN_IDENTIFICATIONNO_1);
			}
			else if (identificationNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IN_IDENTIFICATIONNO_3);
			}
			else {
				bindIdentificationNo = true;

				query.append(_FINDER_COLUMN_IN_IDENTIFICATIONNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIdentificationNo) {
					qPos.add(identificationNo);
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

	private static final String _FINDER_COLUMN_IN_IDENTIFICATIONNO_1 = "citizen.identificationNo IS NULL";
	private static final String _FINDER_COLUMN_IN_IDENTIFICATIONNO_2 = "citizen.identificationNo = ?";
	private static final String _FINDER_COLUMN_IN_IDENTIFICATIONNO_3 = "(citizen.identificationNo IS NULL OR citizen.identificationNo = '')";

	public CitizenPersistenceImpl() {
		setModelClass(Citizen.class);
	}

	/**
	 * Caches the citizen in the entity cache if it is enabled.
	 *
	 * @param citizen the citizen
	 */
	@Override
	public void cacheResult(Citizen citizen) {
		EntityCacheUtil.putResult(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenImpl.class, citizen.getPrimaryKey(), citizen);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MU,
			new Object[] { citizen.getMappingUserId() }, citizen);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IN,
			new Object[] { citizen.getIdentificationNo() }, citizen);

		citizen.resetOriginalValues();
	}

	/**
	 * Caches the citizens in the entity cache if it is enabled.
	 *
	 * @param citizens the citizens
	 */
	@Override
	public void cacheResult(List<Citizen> citizens) {
		for (Citizen citizen : citizens) {
			if (EntityCacheUtil.getResult(
						CitizenModelImpl.ENTITY_CACHE_ENABLED,
						CitizenImpl.class, citizen.getPrimaryKey()) == null) {
				cacheResult(citizen);
			}
			else {
				citizen.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all citizens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CitizenImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CitizenImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the citizen.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Citizen citizen) {
		EntityCacheUtil.removeResult(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenImpl.class, citizen.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(citizen);
	}

	@Override
	public void clearCache(List<Citizen> citizens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Citizen citizen : citizens) {
			EntityCacheUtil.removeResult(CitizenModelImpl.ENTITY_CACHE_ENABLED,
				CitizenImpl.class, citizen.getPrimaryKey());

			clearUniqueFindersCache(citizen);
		}
	}

	protected void cacheUniqueFindersCache(Citizen citizen) {
		if (citizen.isNew()) {
			Object[] args = new Object[] { citizen.getMappingUserId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MU, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MU, args, citizen);

			args = new Object[] { citizen.getIdentificationNo() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_IN, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IN, args, citizen);
		}
		else {
			CitizenModelImpl citizenModelImpl = (CitizenModelImpl)citizen;

			if ((citizenModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { citizen.getMappingUserId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MU, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MU, args, citizen);
			}

			if ((citizenModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_IN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { citizen.getIdentificationNo() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_IN, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IN, args, citizen);
			}
		}
	}

	protected void clearUniqueFindersCache(Citizen citizen) {
		CitizenModelImpl citizenModelImpl = (CitizenModelImpl)citizen;

		Object[] args = new Object[] { citizen.getMappingUserId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MU, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MU, args);

		if ((citizenModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MU.getColumnBitmask()) != 0) {
			args = new Object[] { citizenModelImpl.getOriginalMappingUserId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MU, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MU, args);
		}

		args = new Object[] { citizen.getIdentificationNo() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IN, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IN, args);

		if ((citizenModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_IN.getColumnBitmask()) != 0) {
			args = new Object[] { citizenModelImpl.getOriginalIdentificationNo() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IN, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IN, args);
		}
	}

	/**
	 * Creates a new citizen with the primary key. Does not add the citizen to the database.
	 *
	 * @param citizenId the primary key for the new citizen
	 * @return the new citizen
	 */
	@Override
	public Citizen create(long citizenId) {
		Citizen citizen = new CitizenImpl();

		citizen.setNew(true);
		citizen.setPrimaryKey(citizenId);

		return citizen;
	}

	/**
	 * Removes the citizen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param citizenId the primary key of the citizen
	 * @return the citizen that was removed
	 * @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen remove(long citizenId)
		throws NoSuchCitizenException, SystemException {
		return remove((Serializable)citizenId);
	}

	/**
	 * Removes the citizen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the citizen
	 * @return the citizen that was removed
	 * @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen remove(Serializable primaryKey)
		throws NoSuchCitizenException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Citizen citizen = (Citizen)session.get(CitizenImpl.class, primaryKey);

			if (citizen == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCitizenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(citizen);
		}
		catch (NoSuchCitizenException nsee) {
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
	protected Citizen removeImpl(Citizen citizen) throws SystemException {
		citizen = toUnwrappedModel(citizen);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(citizen)) {
				citizen = (Citizen)session.get(CitizenImpl.class,
						citizen.getPrimaryKeyObj());
			}

			if (citizen != null) {
				session.delete(citizen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (citizen != null) {
			clearCache(citizen);
		}

		return citizen;
	}

	@Override
	public Citizen updateImpl(org.oep.usermgt.model.Citizen citizen)
		throws SystemException {
		citizen = toUnwrappedModel(citizen);

		boolean isNew = citizen.isNew();

		CitizenModelImpl citizenModelImpl = (CitizenModelImpl)citizen;

		Session session = null;

		try {
			session = openSession();

			if (citizen.isNew()) {
				session.save(citizen);

				citizen.setNew(false);
			}
			else {
				session.merge(citizen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CitizenModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((citizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						citizenModelImpl.getOriginalCityNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN,
					args);

				args = new Object[] { citizenModelImpl.getCityNo() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CN,
					args);
			}

			if ((citizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						citizenModelImpl.getOriginalDistrictNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN,
					args);

				args = new Object[] { citizenModelImpl.getDistrictNo() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DN,
					args);
			}

			if ((citizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						citizenModelImpl.getOriginalWardNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WN,
					args);

				args = new Object[] { citizenModelImpl.getWardNo() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WN,
					args);
			}
		}

		EntityCacheUtil.putResult(CitizenModelImpl.ENTITY_CACHE_ENABLED,
			CitizenImpl.class, citizen.getPrimaryKey(), citizen);

		clearUniqueFindersCache(citizen);
		cacheUniqueFindersCache(citizen);

		return citizen;
	}

	protected Citizen toUnwrappedModel(Citizen citizen) {
		if (citizen instanceof CitizenImpl) {
			return citizen;
		}

		CitizenImpl citizenImpl = new CitizenImpl();

		citizenImpl.setNew(citizen.isNew());
		citizenImpl.setPrimaryKey(citizen.getPrimaryKey());

		citizenImpl.setCitizenId(citizen.getCitizenId());
		citizenImpl.setCompanyId(citizen.getCompanyId());
		citizenImpl.setUserId(citizen.getUserId());
		citizenImpl.setGroupId(citizen.getGroupId());
		citizenImpl.setCreateDate(citizen.getCreateDate());
		citizenImpl.setModifiedDate(citizen.getModifiedDate());
		citizenImpl.setMappingUserId(citizen.getMappingUserId());
		citizenImpl.setCitizenNo(citizen.getCitizenNo());
		citizenImpl.setFullName(citizen.getFullName());
		citizenImpl.setGender(citizen.getGender());
		citizenImpl.setIdentificationNo(citizen.getIdentificationNo());
		citizenImpl.setAddress(citizen.getAddress());
		citizenImpl.setCityNo(citizen.getCityNo());
		citizenImpl.setCityName(citizen.getCityName());
		citizenImpl.setDistrictNo(citizen.getDistrictNo());
		citizenImpl.setDistrictName(citizen.getDistrictName());
		citizenImpl.setWardNo(citizen.getWardNo());
		citizenImpl.setWardName(citizen.getWardName());
		citizenImpl.setHomeAddress(citizen.getHomeAddress());
		citizenImpl.setHomeTel(citizen.getHomeTel());
		citizenImpl.setMobile(citizen.getMobile());
		citizenImpl.setEmail(citizen.getEmail());
		citizenImpl.setShortName(citizen.getShortName());

		return citizenImpl;
	}

	/**
	 * Returns the citizen with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the citizen
	 * @return the citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCitizenException, SystemException {
		Citizen citizen = fetchByPrimaryKey(primaryKey);

		if (citizen == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCitizenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return citizen;
	}

	/**
	 * Returns the citizen with the primary key or throws a {@link org.oep.usermgt.NoSuchCitizenException} if it could not be found.
	 *
	 * @param citizenId the primary key of the citizen
	 * @return the citizen
	 * @throws org.oep.usermgt.NoSuchCitizenException if a citizen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen findByPrimaryKey(long citizenId)
		throws NoSuchCitizenException, SystemException {
		return findByPrimaryKey((Serializable)citizenId);
	}

	/**
	 * Returns the citizen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the citizen
	 * @return the citizen, or <code>null</code> if a citizen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Citizen citizen = (Citizen)EntityCacheUtil.getResult(CitizenModelImpl.ENTITY_CACHE_ENABLED,
				CitizenImpl.class, primaryKey);

		if (citizen == _nullCitizen) {
			return null;
		}

		if (citizen == null) {
			Session session = null;

			try {
				session = openSession();

				citizen = (Citizen)session.get(CitizenImpl.class, primaryKey);

				if (citizen != null) {
					cacheResult(citizen);
				}
				else {
					EntityCacheUtil.putResult(CitizenModelImpl.ENTITY_CACHE_ENABLED,
						CitizenImpl.class, primaryKey, _nullCitizen);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CitizenModelImpl.ENTITY_CACHE_ENABLED,
					CitizenImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return citizen;
	}

	/**
	 * Returns the citizen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param citizenId the primary key of the citizen
	 * @return the citizen, or <code>null</code> if a citizen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Citizen fetchByPrimaryKey(long citizenId) throws SystemException {
		return fetchByPrimaryKey((Serializable)citizenId);
	}

	/**
	 * Returns all the citizens.
	 *
	 * @return the citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Citizen> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of citizens
	 * @param end the upper bound of the range of citizens (not inclusive)
	 * @return the range of citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Citizen> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of citizens
	 * @param end the upper bound of the range of citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of citizens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Citizen> findAll(int start, int end,
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

		List<Citizen> list = (List<Citizen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CITIZEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CITIZEN;

				if (pagination) {
					sql = sql.concat(CitizenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Citizen>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Citizen>(list);
				}
				else {
					list = (List<Citizen>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the citizens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Citizen citizen : findAll()) {
			remove(citizen);
		}
	}

	/**
	 * Returns the number of citizens.
	 *
	 * @return the number of citizens
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

				Query q = session.createQuery(_SQL_COUNT_CITIZEN);

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
	 * Initializes the citizen persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.usermgt.model.Citizen")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Citizen>> listenersList = new ArrayList<ModelListener<Citizen>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Citizen>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CitizenImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CITIZEN = "SELECT citizen FROM Citizen citizen";
	private static final String _SQL_SELECT_CITIZEN_WHERE = "SELECT citizen FROM Citizen citizen WHERE ";
	private static final String _SQL_COUNT_CITIZEN = "SELECT COUNT(citizen) FROM Citizen citizen";
	private static final String _SQL_COUNT_CITIZEN_WHERE = "SELECT COUNT(citizen) FROM Citizen citizen WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "citizen.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Citizen exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Citizen exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CitizenPersistenceImpl.class);
	private static Citizen _nullCitizen = new CitizenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Citizen> toCacheModel() {
				return _nullCitizenCacheModel;
			}
		};

	private static CacheModel<Citizen> _nullCitizenCacheModel = new CacheModel<Citizen>() {
			@Override
			public Citizen toEntityModel() {
				return _nullCitizen;
			}
		};
}