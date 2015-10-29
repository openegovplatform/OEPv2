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

package org.oep.core.datamgt.service.persistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
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
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import org.oep.core.datamgt.NoSuchDictDataException;
import org.oep.core.datamgt.model.DictData;
import org.oep.core.datamgt.model.impl.DictDataImpl;
import org.oep.core.datamgt.model.impl.DictDataModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dictionary data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see DictDataPersistence
 * @see DictDataUtil
 * @generated
 */
public class DictDataPersistenceImpl extends BasePersistenceImpl<DictData>
	implements DictDataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DictDataUtil} to access the dictionary data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DictDataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DC = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_DC",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_DC",
			new String[] { Long.class.getName(), String.class.getName() },
			DictDataModelImpl.COMPANYID_COLUMN_BITMASK |
			DictDataModelImpl.DATACODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_DC = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_DC",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dictionary datas where companyId = &#63; and dataCode = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DC(long companyId, String dataCode)
		throws SystemException {
		return findByC_DC(companyId, dataCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where companyId = &#63; and dataCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DC(long companyId, String dataCode,
		int start, int end) throws SystemException {
		return findByC_DC(companyId, dataCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where companyId = &#63; and dataCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DC(long companyId, String dataCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC;
			finderArgs = new Object[] { companyId, dataCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DC;
			finderArgs = new Object[] {
					companyId, dataCode,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if ((companyId != dictData.getCompanyId()) ||
						!Validator.equals(dataCode, dictData.getDataCode())) {
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

			query.append(_SQL_SELECT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_C_DC_COMPANYID_2);

			boolean bindDataCode = false;

			if (dataCode == null) {
				query.append(_FINDER_COLUMN_C_DC_DATACODE_1);
			}
			else if (dataCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DC_DATACODE_3);
			}
			else {
				bindDataCode = true;

				query.append(_FINDER_COLUMN_C_DC_DATACODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindDataCode) {
					qPos.add(dataCode);
				}

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_DC_First(long companyId, String dataCode,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_DC_First(companyId, dataCode,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", dataCode=");
		msg.append(dataCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_DC_First(long companyId, String dataCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictData> list = findByC_DC(companyId, dataCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_DC_Last(long companyId, String dataCode,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_DC_Last(companyId, dataCode,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", dataCode=");
		msg.append(dataCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_DC_Last(long companyId, String dataCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_DC(companyId, dataCode);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByC_DC(companyId, dataCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByC_DC_PrevAndNext(long dictDataId, long companyId,
		String dataCode, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByC_DC_PrevAndNext(session, dictData, companyId,
					dataCode, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByC_DC_PrevAndNext(session, dictData, companyId,
					dataCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData getByC_DC_PrevAndNext(Session session,
		DictData dictData, long companyId, String dataCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_C_DC_COMPANYID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_C_DC_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_DC_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_C_DC_DATACODE_2);
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
			query.append(DictDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindDataCode) {
			qPos.add(dataCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary datas where companyId = &#63; and dataCode = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_DC(long companyId, String dataCode)
		throws SystemException {
		for (DictData dictData : findByC_DC(companyId, dataCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where companyId = &#63; and dataCode = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_DC(long companyId, String dataCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_DC;

		Object[] finderArgs = new Object[] { companyId, dataCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_C_DC_COMPANYID_2);

			boolean bindDataCode = false;

			if (dataCode == null) {
				query.append(_FINDER_COLUMN_C_DC_DATACODE_1);
			}
			else if (dataCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DC_DATACODE_3);
			}
			else {
				bindDataCode = true;

				query.append(_FINDER_COLUMN_C_DC_DATACODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindDataCode) {
					qPos.add(dataCode);
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

	private static final String _FINDER_COLUMN_C_DC_COMPANYID_2 = "dictData.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_DC_DATACODE_1 = "dictData.dataCode IS NULL";
	private static final String _FINDER_COLUMN_C_DC_DATACODE_2 = "dictData.dataCode = ?";
	private static final String _FINDER_COLUMN_C_DC_DATACODE_3 = "(dictData.dataCode IS NULL OR dictData.dataCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DC = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_DC",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_DC",
			new String[] { Long.class.getName(), String.class.getName() },
			DictDataModelImpl.GROUPID_COLUMN_BITMASK |
			DictDataModelImpl.DATACODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_DC = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_DC",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dictionary datas where groupId = &#63; and dataCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_DC(long groupId, String dataCode)
		throws SystemException {
		return findByG_DC(groupId, dataCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where groupId = &#63; and dataCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_DC(long groupId, String dataCode, int start,
		int end) throws SystemException {
		return findByG_DC(groupId, dataCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where groupId = &#63; and dataCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_DC(long groupId, String dataCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC;
			finderArgs = new Object[] { groupId, dataCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DC;
			finderArgs = new Object[] {
					groupId, dataCode,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if ((groupId != dictData.getGroupId()) ||
						!Validator.equals(dataCode, dictData.getDataCode())) {
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

			query.append(_SQL_SELECT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_G_DC_GROUPID_2);

			boolean bindDataCode = false;

			if (dataCode == null) {
				query.append(_FINDER_COLUMN_G_DC_DATACODE_1);
			}
			else if (dataCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_DC_DATACODE_3);
			}
			else {
				bindDataCode = true;

				query.append(_FINDER_COLUMN_G_DC_DATACODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDataCode) {
					qPos.add(dataCode);
				}

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByG_DC_First(long groupId, String dataCode,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByG_DC_First(groupId, dataCode,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dataCode=");
		msg.append(dataCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByG_DC_First(long groupId, String dataCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictData> list = findByG_DC(groupId, dataCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByG_DC_Last(long groupId, String dataCode,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByG_DC_Last(groupId, dataCode,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dataCode=");
		msg.append(dataCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByG_DC_Last(long groupId, String dataCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_DC(groupId, dataCode);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByG_DC(groupId, dataCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByG_DC_PrevAndNext(long dictDataId, long groupId,
		String dataCode, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByG_DC_PrevAndNext(session, dictData, groupId,
					dataCode, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByG_DC_PrevAndNext(session, dictData, groupId,
					dataCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData getByG_DC_PrevAndNext(Session session,
		DictData dictData, long groupId, String dataCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_G_DC_GROUPID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_G_DC_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_G_DC_DATACODE_2);
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
			query.append(DictDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindDataCode) {
			qPos.add(dataCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @return the matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_DC(long groupId, String dataCode)
		throws SystemException {
		return filterFindByG_DC(groupId, dataCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_DC(long groupId, String dataCode,
		int start, int end) throws SystemException {
		return filterFindByG_DC(groupId, dataCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas that the user has permissions to view where groupId = &#63; and dataCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_DC(long groupId, String dataCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_DC(groupId, dataCode, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_DC_GROUPID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_G_DC_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_G_DC_DATACODE_2);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(DictDataModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, DictDataImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, DictDataImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			if (bindDataCode) {
				qPos.add(dataCode);
			}

			return (List<DictData>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set of dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] filterFindByG_DC_PrevAndNext(long dictDataId,
		long groupId, String dataCode, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_DC_PrevAndNext(dictDataId, groupId, dataCode,
				orderByComparator);
		}

		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = filterGetByG_DC_PrevAndNext(session, dictData, groupId,
					dataCode, orderByComparator, true);

			array[1] = dictData;

			array[2] = filterGetByG_DC_PrevAndNext(session, dictData, groupId,
					dataCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData filterGetByG_DC_PrevAndNext(Session session,
		DictData dictData, long groupId, String dataCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_DC_GROUPID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_G_DC_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_G_DC_DATACODE_2);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(DictDataModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, DictDataImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, DictDataImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindDataCode) {
			qPos.add(dataCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary datas where groupId = &#63; and dataCode = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_DC(long groupId, String dataCode)
		throws SystemException {
		for (DictData dictData : findByG_DC(groupId, dataCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where groupId = &#63; and dataCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_DC(long groupId, String dataCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_DC;

		Object[] finderArgs = new Object[] { groupId, dataCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_G_DC_GROUPID_2);

			boolean bindDataCode = false;

			if (dataCode == null) {
				query.append(_FINDER_COLUMN_G_DC_DATACODE_1);
			}
			else if (dataCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_DC_DATACODE_3);
			}
			else {
				bindDataCode = true;

				query.append(_FINDER_COLUMN_G_DC_DATACODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDataCode) {
					qPos.add(dataCode);
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

	/**
	 * Returns the number of dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @return the number of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByG_DC(long groupId, String dataCode)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByG_DC(groupId, dataCode);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_G_DC_GROUPID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_G_DC_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_G_DC_DATACODE_2);
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			if (bindDataCode) {
				qPos.add(dataCode);
			}

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_G_DC_GROUPID_2 = "dictData.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_DC_DATACODE_1 = "dictData.dataCode IS NULL";
	private static final String _FINDER_COLUMN_G_DC_DATACODE_2 = "dictData.dataCode = ?";
	private static final String _FINDER_COLUMN_G_DC_DATACODE_3 = "(dictData.dataCode IS NULL OR dictData.dataCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_CN_DL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_CN_DL",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN_DL =
		new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_CN_DL",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			DictDataModelImpl.COMPANYID_COLUMN_BITMASK |
			DictDataModelImpl.COLLECTIONNAME_COLUMN_BITMASK |
			DictDataModelImpl.DATALEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_CN_DL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_CN_DL",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_CN_DL(long companyId, String collectionName,
		int dataLevel) throws SystemException {
		return findByC_CN_DL(companyId, collectionName, dataLevel,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_CN_DL(long companyId, String collectionName,
		int dataLevel, int start, int end) throws SystemException {
		return findByC_CN_DL(companyId, collectionName, dataLevel, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_CN_DL(long companyId, String collectionName,
		int dataLevel, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN_DL;
			finderArgs = new Object[] { companyId, collectionName, dataLevel };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_CN_DL;
			finderArgs = new Object[] {
					companyId, collectionName, dataLevel,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if ((companyId != dictData.getCompanyId()) ||
						!Validator.equals(collectionName,
							dictData.getCollectionName()) ||
						(dataLevel != dictData.getDataLevel())) {
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

			query.append(_SQL_SELECT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_C_CN_DL_COMPANYID_2);

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_C_CN_DL_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_CN_DL_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_C_CN_DL_COLLECTIONNAME_2);
			}

			query.append(_FINDER_COLUMN_C_CN_DL_DATALEVEL_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				qPos.add(dataLevel);

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_CN_DL_First(long companyId, String collectionName,
		int dataLevel, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_CN_DL_First(companyId, collectionName,
				dataLevel, orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(", dataLevel=");
		msg.append(dataLevel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_CN_DL_First(long companyId, String collectionName,
		int dataLevel, OrderByComparator orderByComparator)
		throws SystemException {
		List<DictData> list = findByC_CN_DL(companyId, collectionName,
				dataLevel, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_CN_DL_Last(long companyId, String collectionName,
		int dataLevel, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_CN_DL_Last(companyId, collectionName,
				dataLevel, orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(", dataLevel=");
		msg.append(dataLevel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_CN_DL_Last(long companyId, String collectionName,
		int dataLevel, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_CN_DL(companyId, collectionName, dataLevel);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByC_CN_DL(companyId, collectionName,
				dataLevel, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByC_CN_DL_PrevAndNext(long dictDataId,
		long companyId, String collectionName, int dataLevel,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByC_CN_DL_PrevAndNext(session, dictData, companyId,
					collectionName, dataLevel, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByC_CN_DL_PrevAndNext(session, dictData, companyId,
					collectionName, dataLevel, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData getByC_CN_DL_PrevAndNext(Session session,
		DictData dictData, long companyId, String collectionName,
		int dataLevel, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_C_CN_DL_COMPANYID_2);

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_C_CN_DL_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_CN_DL_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_C_CN_DL_COLLECTIONNAME_2);
		}

		query.append(_FINDER_COLUMN_C_CN_DL_DATALEVEL_2);

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
			query.append(DictDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindCollectionName) {
			qPos.add(collectionName);
		}

		qPos.add(dataLevel);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_CN_DL(long companyId, String collectionName,
		int dataLevel) throws SystemException {
		for (DictData dictData : findByC_CN_DL(companyId, collectionName,
				dataLevel, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_CN_DL(long companyId, String collectionName,
		int dataLevel) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_CN_DL;

		Object[] finderArgs = new Object[] { companyId, collectionName, dataLevel };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_C_CN_DL_COMPANYID_2);

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_C_CN_DL_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_CN_DL_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_C_CN_DL_COLLECTIONNAME_2);
			}

			query.append(_FINDER_COLUMN_C_CN_DL_DATALEVEL_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				qPos.add(dataLevel);

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

	private static final String _FINDER_COLUMN_C_CN_DL_COMPANYID_2 = "dictData.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_CN_DL_COLLECTIONNAME_1 = "dictData.collectionName IS NULL AND ";
	private static final String _FINDER_COLUMN_C_CN_DL_COLLECTIONNAME_2 = "dictData.collectionName = ? AND ";
	private static final String _FINDER_COLUMN_C_CN_DL_COLLECTIONNAME_3 = "(dictData.collectionName IS NULL OR dictData.collectionName = '') AND ";
	private static final String _FINDER_COLUMN_C_CN_DL_DATALEVEL_2 = "dictData.dataLevel = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_CN_DL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_CN_DL",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN_DL =
		new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_CN_DL",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			DictDataModelImpl.GROUPID_COLUMN_BITMASK |
			DictDataModelImpl.COLLECTIONNAME_COLUMN_BITMASK |
			DictDataModelImpl.DATALEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_CN_DL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_CN_DL",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_CN_DL(long groupId, String collectionName,
		int dataLevel) throws SystemException {
		return findByG_CN_DL(groupId, collectionName, dataLevel,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_CN_DL(long groupId, String collectionName,
		int dataLevel, int start, int end) throws SystemException {
		return findByG_CN_DL(groupId, collectionName, dataLevel, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_CN_DL(long groupId, String collectionName,
		int dataLevel, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN_DL;
			finderArgs = new Object[] { groupId, collectionName, dataLevel };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_CN_DL;
			finderArgs = new Object[] {
					groupId, collectionName, dataLevel,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if ((groupId != dictData.getGroupId()) ||
						!Validator.equals(collectionName,
							dictData.getCollectionName()) ||
						(dataLevel != dictData.getDataLevel())) {
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

			query.append(_SQL_SELECT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_G_CN_DL_GROUPID_2);

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_2);
			}

			query.append(_FINDER_COLUMN_G_CN_DL_DATALEVEL_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				qPos.add(dataLevel);

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByG_CN_DL_First(long groupId, String collectionName,
		int dataLevel, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByG_CN_DL_First(groupId, collectionName,
				dataLevel, orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(", dataLevel=");
		msg.append(dataLevel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByG_CN_DL_First(long groupId, String collectionName,
		int dataLevel, OrderByComparator orderByComparator)
		throws SystemException {
		List<DictData> list = findByG_CN_DL(groupId, collectionName, dataLevel,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByG_CN_DL_Last(long groupId, String collectionName,
		int dataLevel, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByG_CN_DL_Last(groupId, collectionName,
				dataLevel, orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(", dataLevel=");
		msg.append(dataLevel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByG_CN_DL_Last(long groupId, String collectionName,
		int dataLevel, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByG_CN_DL(groupId, collectionName, dataLevel);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByG_CN_DL(groupId, collectionName, dataLevel,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByG_CN_DL_PrevAndNext(long dictDataId, long groupId,
		String collectionName, int dataLevel,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByG_CN_DL_PrevAndNext(session, dictData, groupId,
					collectionName, dataLevel, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByG_CN_DL_PrevAndNext(session, dictData, groupId,
					collectionName, dataLevel, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData getByG_CN_DL_PrevAndNext(Session session,
		DictData dictData, long groupId, String collectionName, int dataLevel,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_G_CN_DL_GROUPID_2);

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_2);
		}

		query.append(_FINDER_COLUMN_G_CN_DL_DATALEVEL_2);

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
			query.append(DictDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindCollectionName) {
			qPos.add(collectionName);
		}

		qPos.add(dataLevel);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @return the matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_CN_DL(long groupId,
		String collectionName, int dataLevel) throws SystemException {
		return filterFindByG_CN_DL(groupId, collectionName, dataLevel,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_CN_DL(long groupId,
		String collectionName, int dataLevel, int start, int end)
		throws SystemException {
		return filterFindByG_CN_DL(groupId, collectionName, dataLevel, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas that the user has permissions to view where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_CN_DL(long groupId,
		String collectionName, int dataLevel, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_CN_DL(groupId, collectionName, dataLevel, start,
				end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_CN_DL_GROUPID_2);

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_2);
		}

		query.append(_FINDER_COLUMN_G_CN_DL_DATALEVEL_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(DictDataModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, DictDataImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, DictDataImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			if (bindCollectionName) {
				qPos.add(collectionName);
			}

			qPos.add(dataLevel);

			return (List<DictData>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set of dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] filterFindByG_CN_DL_PrevAndNext(long dictDataId,
		long groupId, String collectionName, int dataLevel,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_CN_DL_PrevAndNext(dictDataId, groupId,
				collectionName, dataLevel, orderByComparator);
		}

		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = filterGetByG_CN_DL_PrevAndNext(session, dictData,
					groupId, collectionName, dataLevel, orderByComparator, true);

			array[1] = dictData;

			array[2] = filterGetByG_CN_DL_PrevAndNext(session, dictData,
					groupId, collectionName, dataLevel, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData filterGetByG_CN_DL_PrevAndNext(Session session,
		DictData dictData, long groupId, String collectionName, int dataLevel,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_CN_DL_GROUPID_2);

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_2);
		}

		query.append(_FINDER_COLUMN_G_CN_DL_DATALEVEL_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(DictDataModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, DictDataImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, DictDataImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindCollectionName) {
			qPos.add(collectionName);
		}

		qPos.add(dataLevel);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_CN_DL(long groupId, String collectionName,
		int dataLevel) throws SystemException {
		for (DictData dictData : findByG_CN_DL(groupId, collectionName,
				dataLevel, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_CN_DL(long groupId, String collectionName, int dataLevel)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_CN_DL;

		Object[] finderArgs = new Object[] { groupId, collectionName, dataLevel };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_G_CN_DL_GROUPID_2);

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_2);
			}

			query.append(_FINDER_COLUMN_G_CN_DL_DATALEVEL_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				qPos.add(dataLevel);

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

	/**
	 * Returns the number of dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param dataLevel the data level
	 * @return the number of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByG_CN_DL(long groupId, String collectionName,
		int dataLevel) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByG_CN_DL(groupId, collectionName, dataLevel);
		}

		StringBundler query = new StringBundler(4);

		query.append(_FILTER_SQL_COUNT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_G_CN_DL_GROUPID_2);

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_2);
		}

		query.append(_FINDER_COLUMN_G_CN_DL_DATALEVEL_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			if (bindCollectionName) {
				qPos.add(collectionName);
			}

			qPos.add(dataLevel);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_G_CN_DL_GROUPID_2 = "dictData.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_1 = "dictData.collectionName IS NULL AND ";
	private static final String _FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_2 = "dictData.collectionName = ? AND ";
	private static final String _FINDER_COLUMN_G_CN_DL_COLLECTIONNAME_3 = "(dictData.collectionName IS NULL OR dictData.collectionName = '') AND ";
	private static final String _FINDER_COLUMN_G_CN_DL_DATALEVEL_2 = "dictData.dataLevel = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_CN = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_CN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_CN",
			new String[] { Long.class.getName(), String.class.getName() },
			DictDataModelImpl.COMPANYID_COLUMN_BITMASK |
			DictDataModelImpl.COLLECTIONNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_CN = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_CN",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dictionary datas where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_CN(long companyId, String collectionName)
		throws SystemException {
		return findByC_CN(companyId, collectionName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where companyId = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_CN(long companyId, String collectionName,
		int start, int end) throws SystemException {
		return findByC_CN(companyId, collectionName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where companyId = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_CN(long companyId, String collectionName,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN;
			finderArgs = new Object[] { companyId, collectionName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_CN;
			finderArgs = new Object[] {
					companyId, collectionName,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if ((companyId != dictData.getCompanyId()) ||
						!Validator.equals(collectionName,
							dictData.getCollectionName())) {
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

			query.append(_SQL_SELECT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_C_CN_COMPANYID_2);

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_C_CN_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_CN_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_C_CN_COLLECTIONNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_CN_First(long companyId, String collectionName,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_CN_First(companyId, collectionName,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_CN_First(long companyId, String collectionName,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictData> list = findByC_CN(companyId, collectionName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_CN_Last(long companyId, String collectionName,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_CN_Last(companyId, collectionName,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_CN_Last(long companyId, String collectionName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_CN(companyId, collectionName);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByC_CN(companyId, collectionName, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByC_CN_PrevAndNext(long dictDataId, long companyId,
		String collectionName, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByC_CN_PrevAndNext(session, dictData, companyId,
					collectionName, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByC_CN_PrevAndNext(session, dictData, companyId,
					collectionName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData getByC_CN_PrevAndNext(Session session,
		DictData dictData, long companyId, String collectionName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_C_CN_COMPANYID_2);

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_C_CN_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_CN_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_C_CN_COLLECTIONNAME_2);
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
			query.append(DictDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindCollectionName) {
			qPos.add(collectionName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary datas where companyId = &#63; and collectionName = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_CN(long companyId, String collectionName)
		throws SystemException {
		for (DictData dictData : findByC_CN(companyId, collectionName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_CN(long companyId, String collectionName)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_CN;

		Object[] finderArgs = new Object[] { companyId, collectionName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_C_CN_COMPANYID_2);

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_C_CN_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_CN_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_C_CN_COLLECTIONNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindCollectionName) {
					qPos.add(collectionName);
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

	private static final String _FINDER_COLUMN_C_CN_COMPANYID_2 = "dictData.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_CN_COLLECTIONNAME_1 = "dictData.collectionName IS NULL";
	private static final String _FINDER_COLUMN_C_CN_COLLECTIONNAME_2 = "dictData.collectionName = ?";
	private static final String _FINDER_COLUMN_C_CN_COLLECTIONNAME_3 = "(dictData.collectionName IS NULL OR dictData.collectionName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_CN = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_CN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_CN",
			new String[] { Long.class.getName(), String.class.getName() },
			DictDataModelImpl.GROUPID_COLUMN_BITMASK |
			DictDataModelImpl.COLLECTIONNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_CN = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_CN",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dictionary datas where groupId = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_CN(long groupId, String collectionName)
		throws SystemException {
		return findByG_CN(groupId, collectionName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where groupId = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_CN(long groupId, String collectionName,
		int start, int end) throws SystemException {
		return findByG_CN(groupId, collectionName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where groupId = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_CN(long groupId, String collectionName,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN;
			finderArgs = new Object[] { groupId, collectionName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_CN;
			finderArgs = new Object[] {
					groupId, collectionName,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if ((groupId != dictData.getGroupId()) ||
						!Validator.equals(collectionName,
							dictData.getCollectionName())) {
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

			query.append(_SQL_SELECT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_G_CN_GROUPID_2);

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByG_CN_First(long groupId, String collectionName,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByG_CN_First(groupId, collectionName,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByG_CN_First(long groupId, String collectionName,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictData> list = findByG_CN(groupId, collectionName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByG_CN_Last(long groupId, String collectionName,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByG_CN_Last(groupId, collectionName,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByG_CN_Last(long groupId, String collectionName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_CN(groupId, collectionName);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByG_CN(groupId, collectionName, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByG_CN_PrevAndNext(long dictDataId, long groupId,
		String collectionName, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByG_CN_PrevAndNext(session, dictData, groupId,
					collectionName, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByG_CN_PrevAndNext(session, dictData, groupId,
					collectionName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData getByG_CN_PrevAndNext(Session session,
		DictData dictData, long groupId, String collectionName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_G_CN_GROUPID_2);

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_2);
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
			query.append(DictDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindCollectionName) {
			qPos.add(collectionName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @return the matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_CN(long groupId, String collectionName)
		throws SystemException {
		return filterFindByG_CN(groupId, collectionName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_CN(long groupId, String collectionName,
		int start, int end) throws SystemException {
		return filterFindByG_CN(groupId, collectionName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas that the user has permissions to view where groupId = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_CN(long groupId, String collectionName,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_CN(groupId, collectionName, start, end,
				orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_CN_GROUPID_2);

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_2);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(DictDataModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, DictDataImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, DictDataImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			if (bindCollectionName) {
				qPos.add(collectionName);
			}

			return (List<DictData>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set of dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] filterFindByG_CN_PrevAndNext(long dictDataId,
		long groupId, String collectionName, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_CN_PrevAndNext(dictDataId, groupId, collectionName,
				orderByComparator);
		}

		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = filterGetByG_CN_PrevAndNext(session, dictData, groupId,
					collectionName, orderByComparator, true);

			array[1] = dictData;

			array[2] = filterGetByG_CN_PrevAndNext(session, dictData, groupId,
					collectionName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData filterGetByG_CN_PrevAndNext(Session session,
		DictData dictData, long groupId, String collectionName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_CN_GROUPID_2);

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_2);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(DictDataModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, DictDataImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, DictDataImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindCollectionName) {
			qPos.add(collectionName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary datas where groupId = &#63; and collectionName = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_CN(long groupId, String collectionName)
		throws SystemException {
		for (DictData dictData : findByG_CN(groupId, collectionName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where groupId = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_CN(long groupId, String collectionName)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_CN;

		Object[] finderArgs = new Object[] { groupId, collectionName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_G_CN_GROUPID_2);

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindCollectionName) {
					qPos.add(collectionName);
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

	/**
	 * Returns the number of dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param collectionName the collection name
	 * @return the number of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByG_CN(long groupId, String collectionName)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByG_CN(groupId, collectionName);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_G_CN_GROUPID_2);

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_CN_COLLECTIONNAME_2);
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			if (bindCollectionName) {
				qPos.add(collectionName);
			}

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_G_CN_GROUPID_2 = "dictData.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_CN_COLLECTIONNAME_1 = "dictData.collectionName IS NULL";
	private static final String _FINDER_COLUMN_G_CN_COLLECTIONNAME_2 = "dictData.collectionName = ?";
	private static final String _FINDER_COLUMN_G_CN_COLLECTIONNAME_3 = "(dictData.collectionName IS NULL OR dictData.collectionName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DC_CN = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_DC_CN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC_CN =
		new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_DC_CN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			DictDataModelImpl.GROUPID_COLUMN_BITMASK |
			DictDataModelImpl.DATACODE_COLUMN_BITMASK |
			DictDataModelImpl.COLLECTIONNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_DC_CN = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_DC_CN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_DC_CN(long groupId, String dataCode,
		String collectionName) throws SystemException {
		return findByG_DC_CN(groupId, dataCode, collectionName,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_DC_CN(long groupId, String dataCode,
		String collectionName, int start, int end) throws SystemException {
		return findByG_DC_CN(groupId, dataCode, collectionName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_DC_CN(long groupId, String dataCode,
		String collectionName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC_CN;
			finderArgs = new Object[] { groupId, dataCode, collectionName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DC_CN;
			finderArgs = new Object[] {
					groupId, dataCode, collectionName,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if ((groupId != dictData.getGroupId()) ||
						!Validator.equals(dataCode, dictData.getDataCode()) ||
						!Validator.equals(collectionName,
							dictData.getCollectionName())) {
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

			query.append(_SQL_SELECT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_G_DC_CN_GROUPID_2);

			boolean bindDataCode = false;

			if (dataCode == null) {
				query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_1);
			}
			else if (dataCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_3);
			}
			else {
				bindDataCode = true;

				query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_2);
			}

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDataCode) {
					qPos.add(dataCode);
				}

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByG_DC_CN_First(long groupId, String dataCode,
		String collectionName, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByG_DC_CN_First(groupId, dataCode,
				collectionName, orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dataCode=");
		msg.append(dataCode);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByG_DC_CN_First(long groupId, String dataCode,
		String collectionName, OrderByComparator orderByComparator)
		throws SystemException {
		List<DictData> list = findByG_DC_CN(groupId, dataCode, collectionName,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByG_DC_CN_Last(long groupId, String dataCode,
		String collectionName, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByG_DC_CN_Last(groupId, dataCode,
				collectionName, orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dataCode=");
		msg.append(dataCode);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByG_DC_CN_Last(long groupId, String dataCode,
		String collectionName, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByG_DC_CN(groupId, dataCode, collectionName);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByG_DC_CN(groupId, dataCode, collectionName,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByG_DC_CN_PrevAndNext(long dictDataId, long groupId,
		String dataCode, String collectionName,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByG_DC_CN_PrevAndNext(session, dictData, groupId,
					dataCode, collectionName, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByG_DC_CN_PrevAndNext(session, dictData, groupId,
					dataCode, collectionName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData getByG_DC_CN_PrevAndNext(Session session,
		DictData dictData, long groupId, String dataCode,
		String collectionName, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_G_DC_CN_GROUPID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_2);
		}

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_2);
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
			query.append(DictDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindDataCode) {
			qPos.add(dataCode);
		}

		if (bindCollectionName) {
			qPos.add(collectionName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @return the matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_DC_CN(long groupId, String dataCode,
		String collectionName) throws SystemException {
		return filterFindByG_DC_CN(groupId, dataCode, collectionName,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_DC_CN(long groupId, String dataCode,
		String collectionName, int start, int end) throws SystemException {
		return filterFindByG_DC_CN(groupId, dataCode, collectionName, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas that the user has permissions to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_DC_CN(long groupId, String dataCode,
		String collectionName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_DC_CN(groupId, dataCode, collectionName, start, end,
				orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_DC_CN_GROUPID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_2);
		}

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_2);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(DictDataModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, DictDataImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, DictDataImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			if (bindDataCode) {
				qPos.add(dataCode);
			}

			if (bindCollectionName) {
				qPos.add(collectionName);
			}

			return (List<DictData>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set of dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] filterFindByG_DC_CN_PrevAndNext(long dictDataId,
		long groupId, String dataCode, String collectionName,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_DC_CN_PrevAndNext(dictDataId, groupId, dataCode,
				collectionName, orderByComparator);
		}

		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = filterGetByG_DC_CN_PrevAndNext(session, dictData,
					groupId, dataCode, collectionName, orderByComparator, true);

			array[1] = dictData;

			array[2] = filterGetByG_DC_CN_PrevAndNext(session, dictData,
					groupId, dataCode, collectionName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData filterGetByG_DC_CN_PrevAndNext(Session session,
		DictData dictData, long groupId, String dataCode,
		String collectionName, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_DC_CN_GROUPID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_2);
		}

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_2);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(DictDataModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, DictDataImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, DictDataImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindDataCode) {
			qPos.add(dataCode);
		}

		if (bindCollectionName) {
			qPos.add(collectionName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_DC_CN(long groupId, String dataCode,
		String collectionName) throws SystemException {
		for (DictData dictData : findByG_DC_CN(groupId, dataCode,
				collectionName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_DC_CN(long groupId, String dataCode,
		String collectionName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_DC_CN;

		Object[] finderArgs = new Object[] { groupId, dataCode, collectionName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_G_DC_CN_GROUPID_2);

			boolean bindDataCode = false;

			if (dataCode == null) {
				query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_1);
			}
			else if (dataCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_3);
			}
			else {
				bindDataCode = true;

				query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_2);
			}

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDataCode) {
					qPos.add(dataCode);
				}

				if (bindCollectionName) {
					qPos.add(collectionName);
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

	/**
	 * Returns the number of dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @return the number of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByG_DC_CN(long groupId, String dataCode,
		String collectionName) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByG_DC_CN(groupId, dataCode, collectionName);
		}

		StringBundler query = new StringBundler(4);

		query.append(_FILTER_SQL_COUNT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_G_DC_CN_GROUPID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_G_DC_CN_DATACODE_2);
		}

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_2);
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			if (bindDataCode) {
				qPos.add(dataCode);
			}

			if (bindCollectionName) {
				qPos.add(collectionName);
			}

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_G_DC_CN_GROUPID_2 = "dictData.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_DC_CN_DATACODE_1 = "dictData.dataCode IS NULL AND ";
	private static final String _FINDER_COLUMN_G_DC_CN_DATACODE_2 = "dictData.dataCode = ? AND ";
	private static final String _FINDER_COLUMN_G_DC_CN_DATACODE_3 = "(dictData.dataCode IS NULL OR dictData.dataCode = '') AND ";
	private static final String _FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_1 = "dictData.collectionName IS NULL";
	private static final String _FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_2 = "dictData.collectionName = ?";
	private static final String _FINDER_COLUMN_G_DC_CN_COLLECTIONNAME_3 = "(dictData.collectionName IS NULL OR dictData.collectionName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DC_CN = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_DC_CN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC_CN =
		new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_DC_CN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			DictDataModelImpl.COMPANYID_COLUMN_BITMASK |
			DictDataModelImpl.DATACODE_COLUMN_BITMASK |
			DictDataModelImpl.COLLECTIONNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_DC_CN = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_DC_CN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DC_CN(long companyId, String dataCode,
		String collectionName) throws SystemException {
		return findByC_DC_CN(companyId, dataCode, collectionName,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DC_CN(long companyId, String dataCode,
		String collectionName, int start, int end) throws SystemException {
		return findByC_DC_CN(companyId, dataCode, collectionName, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DC_CN(long companyId, String dataCode,
		String collectionName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC_CN;
			finderArgs = new Object[] { companyId, dataCode, collectionName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DC_CN;
			finderArgs = new Object[] {
					companyId, dataCode, collectionName,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if ((companyId != dictData.getCompanyId()) ||
						!Validator.equals(dataCode, dictData.getDataCode()) ||
						!Validator.equals(collectionName,
							dictData.getCollectionName())) {
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

			query.append(_SQL_SELECT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_C_DC_CN_COMPANYID_2);

			boolean bindDataCode = false;

			if (dataCode == null) {
				query.append(_FINDER_COLUMN_C_DC_CN_DATACODE_1);
			}
			else if (dataCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DC_CN_DATACODE_3);
			}
			else {
				bindDataCode = true;

				query.append(_FINDER_COLUMN_C_DC_CN_DATACODE_2);
			}

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_C_DC_CN_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DC_CN_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_C_DC_CN_COLLECTIONNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindDataCode) {
					qPos.add(dataCode);
				}

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_DC_CN_First(long companyId, String dataCode,
		String collectionName, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_DC_CN_First(companyId, dataCode,
				collectionName, orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", dataCode=");
		msg.append(dataCode);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_DC_CN_First(long companyId, String dataCode,
		String collectionName, OrderByComparator orderByComparator)
		throws SystemException {
		List<DictData> list = findByC_DC_CN(companyId, dataCode,
				collectionName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_DC_CN_Last(long companyId, String dataCode,
		String collectionName, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_DC_CN_Last(companyId, dataCode,
				collectionName, orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", dataCode=");
		msg.append(dataCode);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_DC_CN_Last(long companyId, String dataCode,
		String collectionName, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_DC_CN(companyId, dataCode, collectionName);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByC_DC_CN(companyId, dataCode,
				collectionName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByC_DC_CN_PrevAndNext(long dictDataId,
		long companyId, String dataCode, String collectionName,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByC_DC_CN_PrevAndNext(session, dictData, companyId,
					dataCode, collectionName, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByC_DC_CN_PrevAndNext(session, dictData, companyId,
					dataCode, collectionName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData getByC_DC_CN_PrevAndNext(Session session,
		DictData dictData, long companyId, String dataCode,
		String collectionName, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_C_DC_CN_COMPANYID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_C_DC_CN_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_DC_CN_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_C_DC_CN_DATACODE_2);
		}

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_C_DC_CN_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_DC_CN_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_C_DC_CN_COLLECTIONNAME_2);
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
			query.append(DictDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindDataCode) {
			qPos.add(dataCode);
		}

		if (bindCollectionName) {
			qPos.add(collectionName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_DC_CN(long companyId, String dataCode,
		String collectionName) throws SystemException {
		for (DictData dictData : findByC_DC_CN(companyId, dataCode,
				collectionName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_DC_CN(long companyId, String dataCode,
		String collectionName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_DC_CN;

		Object[] finderArgs = new Object[] { companyId, dataCode, collectionName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_C_DC_CN_COMPANYID_2);

			boolean bindDataCode = false;

			if (dataCode == null) {
				query.append(_FINDER_COLUMN_C_DC_CN_DATACODE_1);
			}
			else if (dataCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DC_CN_DATACODE_3);
			}
			else {
				bindDataCode = true;

				query.append(_FINDER_COLUMN_C_DC_CN_DATACODE_2);
			}

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_C_DC_CN_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DC_CN_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_C_DC_CN_COLLECTIONNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindDataCode) {
					qPos.add(dataCode);
				}

				if (bindCollectionName) {
					qPos.add(collectionName);
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

	private static final String _FINDER_COLUMN_C_DC_CN_COMPANYID_2 = "dictData.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_DATACODE_1 = "dictData.dataCode IS NULL AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_DATACODE_2 = "dictData.dataCode = ? AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_DATACODE_3 = "(dictData.dataCode IS NULL OR dictData.dataCode = '') AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_COLLECTIONNAME_1 = "dictData.collectionName IS NULL";
	private static final String _FINDER_COLUMN_C_DC_CN_COLLECTIONNAME_2 = "dictData.collectionName = ?";
	private static final String _FINDER_COLUMN_C_DC_CN_COLLECTIONNAME_3 = "(dictData.collectionName IS NULL OR dictData.collectionName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_DL",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_DL",
			new String[] { Long.class.getName(), Integer.class.getName() },
			DictDataModelImpl.GROUPID_COLUMN_BITMASK |
			DictDataModelImpl.DATALEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_DL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_DL",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dictionary datas where groupId = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_DL(long groupId, int dataLevel)
		throws SystemException {
		return findByG_DL(groupId, dataLevel, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where groupId = &#63; and dataLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_DL(long groupId, int dataLevel, int start,
		int end) throws SystemException {
		return findByG_DL(groupId, dataLevel, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where groupId = &#63; and dataLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_DL(long groupId, int dataLevel, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DL;
			finderArgs = new Object[] { groupId, dataLevel };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DL;
			finderArgs = new Object[] {
					groupId, dataLevel,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if ((groupId != dictData.getGroupId()) ||
						(dataLevel != dictData.getDataLevel())) {
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

			query.append(_SQL_SELECT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_G_DL_GROUPID_2);

			query.append(_FINDER_COLUMN_G_DL_DATALEVEL_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(dataLevel);

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByG_DL_First(long groupId, int dataLevel,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByG_DL_First(groupId, dataLevel,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dataLevel=");
		msg.append(dataLevel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByG_DL_First(long groupId, int dataLevel,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictData> list = findByG_DL(groupId, dataLevel, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByG_DL_Last(long groupId, int dataLevel,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByG_DL_Last(groupId, dataLevel,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dataLevel=");
		msg.append(dataLevel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByG_DL_Last(long groupId, int dataLevel,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_DL(groupId, dataLevel);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByG_DL(groupId, dataLevel, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByG_DL_PrevAndNext(long dictDataId, long groupId,
		int dataLevel, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByG_DL_PrevAndNext(session, dictData, groupId,
					dataLevel, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByG_DL_PrevAndNext(session, dictData, groupId,
					dataLevel, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData getByG_DL_PrevAndNext(Session session,
		DictData dictData, long groupId, int dataLevel,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_G_DL_GROUPID_2);

		query.append(_FINDER_COLUMN_G_DL_DATALEVEL_2);

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
			query.append(DictDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(dataLevel);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dictionary datas that the user has permission to view where groupId = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @return the matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_DL(long groupId, int dataLevel)
		throws SystemException {
		return filterFindByG_DL(groupId, dataLevel, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas that the user has permission to view where groupId = &#63; and dataLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_DL(long groupId, int dataLevel,
		int start, int end) throws SystemException {
		return filterFindByG_DL(groupId, dataLevel, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas that the user has permissions to view where groupId = &#63; and dataLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_DL(long groupId, int dataLevel,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_DL(groupId, dataLevel, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_DL_GROUPID_2);

		query.append(_FINDER_COLUMN_G_DL_DATALEVEL_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(DictDataModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, DictDataImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, DictDataImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			qPos.add(dataLevel);

			return (List<DictData>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set of dictionary datas that the user has permission to view where groupId = &#63; and dataLevel = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] filterFindByG_DL_PrevAndNext(long dictDataId,
		long groupId, int dataLevel, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_DL_PrevAndNext(dictDataId, groupId, dataLevel,
				orderByComparator);
		}

		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = filterGetByG_DL_PrevAndNext(session, dictData, groupId,
					dataLevel, orderByComparator, true);

			array[1] = dictData;

			array[2] = filterGetByG_DL_PrevAndNext(session, dictData, groupId,
					dataLevel, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData filterGetByG_DL_PrevAndNext(Session session,
		DictData dictData, long groupId, int dataLevel,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_DL_GROUPID_2);

		query.append(_FINDER_COLUMN_G_DL_DATALEVEL_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(DictDataModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, DictDataImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, DictDataImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(dataLevel);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary datas where groupId = &#63; and dataLevel = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_DL(long groupId, int dataLevel)
		throws SystemException {
		for (DictData dictData : findByG_DL(groupId, dataLevel,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where groupId = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_DL(long groupId, int dataLevel)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_DL;

		Object[] finderArgs = new Object[] { groupId, dataLevel };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_G_DL_GROUPID_2);

			query.append(_FINDER_COLUMN_G_DL_DATALEVEL_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(dataLevel);

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

	/**
	 * Returns the number of dictionary datas that the user has permission to view where groupId = &#63; and dataLevel = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataLevel the data level
	 * @return the number of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByG_DL(long groupId, int dataLevel)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByG_DL(groupId, dataLevel);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_G_DL_GROUPID_2);

		query.append(_FINDER_COLUMN_G_DL_DATALEVEL_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			qPos.add(dataLevel);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_G_DL_GROUPID_2 = "dictData.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_DL_DATALEVEL_2 = "dictData.dataLevel = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_DL",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_DL",
			new String[] { Long.class.getName(), Integer.class.getName() },
			DictDataModelImpl.COMPANYID_COLUMN_BITMASK |
			DictDataModelImpl.DATALEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_DL = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_DL",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dictionary datas where companyId = &#63; and dataLevel = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataLevel the data level
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DL(long companyId, int dataLevel)
		throws SystemException {
		return findByC_DL(companyId, dataLevel, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where companyId = &#63; and dataLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param dataLevel the data level
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DL(long companyId, int dataLevel, int start,
		int end) throws SystemException {
		return findByC_DL(companyId, dataLevel, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where companyId = &#63; and dataLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param dataLevel the data level
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DL(long companyId, int dataLevel, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DL;
			finderArgs = new Object[] { companyId, dataLevel };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DL;
			finderArgs = new Object[] {
					companyId, dataLevel,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if ((companyId != dictData.getCompanyId()) ||
						(dataLevel != dictData.getDataLevel())) {
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

			query.append(_SQL_SELECT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_C_DL_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_DL_DATALEVEL_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(dataLevel);

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_DL_First(long companyId, int dataLevel,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_DL_First(companyId, dataLevel,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", dataLevel=");
		msg.append(dataLevel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_DL_First(long companyId, int dataLevel,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictData> list = findByC_DL(companyId, dataLevel, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_DL_Last(long companyId, int dataLevel,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_DL_Last(companyId, dataLevel,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", dataLevel=");
		msg.append(dataLevel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_DL_Last(long companyId, int dataLevel,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_DL(companyId, dataLevel);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByC_DL(companyId, dataLevel, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param companyId the company ID
	 * @param dataLevel the data level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByC_DL_PrevAndNext(long dictDataId, long companyId,
		int dataLevel, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByC_DL_PrevAndNext(session, dictData, companyId,
					dataLevel, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByC_DL_PrevAndNext(session, dictData, companyId,
					dataLevel, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData getByC_DL_PrevAndNext(Session session,
		DictData dictData, long companyId, int dataLevel,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_C_DL_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_DL_DATALEVEL_2);

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
			query.append(DictDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(dataLevel);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary datas where companyId = &#63; and dataLevel = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param dataLevel the data level
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_DL(long companyId, int dataLevel)
		throws SystemException {
		for (DictData dictData : findByC_DL(companyId, dataLevel,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where companyId = &#63; and dataLevel = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataLevel the data level
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_DL(long companyId, int dataLevel)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_DL;

		Object[] finderArgs = new Object[] { companyId, dataLevel };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_C_DL_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_DL_DATALEVEL_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(dataLevel);

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

	private static final String _FINDER_COLUMN_C_DL_COMPANYID_2 = "dictData.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_DL_DATALEVEL_2 = "dictData.dataLevel = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DC_CN_S =
		new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_DC_CN_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC_CN_S =
		new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_DC_CN_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			DictDataModelImpl.GROUPID_COLUMN_BITMASK |
			DictDataModelImpl.DATACODE_COLUMN_BITMASK |
			DictDataModelImpl.COLLECTIONNAME_COLUMN_BITMASK |
			DictDataModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_DC_CN_S = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_DC_CN_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_DC_CN_S(long groupId, String dataCode,
		String collectionName, int status) throws SystemException {
		return findByG_DC_CN_S(groupId, dataCode, collectionName, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_DC_CN_S(long groupId, String dataCode,
		String collectionName, int status, int start, int end)
		throws SystemException {
		return findByG_DC_CN_S(groupId, dataCode, collectionName, status,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByG_DC_CN_S(long groupId, String dataCode,
		String collectionName, int status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC_CN_S;
			finderArgs = new Object[] { groupId, dataCode, collectionName, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DC_CN_S;
			finderArgs = new Object[] {
					groupId, dataCode, collectionName, status,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if ((groupId != dictData.getGroupId()) ||
						!Validator.equals(dataCode, dictData.getDataCode()) ||
						!Validator.equals(collectionName,
							dictData.getCollectionName()) ||
						(status != dictData.getStatus())) {
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

			query.append(_SQL_SELECT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_G_DC_CN_S_GROUPID_2);

			boolean bindDataCode = false;

			if (dataCode == null) {
				query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_1);
			}
			else if (dataCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_3);
			}
			else {
				bindDataCode = true;

				query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_2);
			}

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_2);
			}

			query.append(_FINDER_COLUMN_G_DC_CN_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDataCode) {
					qPos.add(dataCode);
				}

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				qPos.add(status);

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByG_DC_CN_S_First(long groupId, String dataCode,
		String collectionName, int status, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByG_DC_CN_S_First(groupId, dataCode,
				collectionName, status, orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dataCode=");
		msg.append(dataCode);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByG_DC_CN_S_First(long groupId, String dataCode,
		String collectionName, int status, OrderByComparator orderByComparator)
		throws SystemException {
		List<DictData> list = findByG_DC_CN_S(groupId, dataCode,
				collectionName, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByG_DC_CN_S_Last(long groupId, String dataCode,
		String collectionName, int status, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByG_DC_CN_S_Last(groupId, dataCode,
				collectionName, status, orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dataCode=");
		msg.append(dataCode);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByG_DC_CN_S_Last(long groupId, String dataCode,
		String collectionName, int status, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByG_DC_CN_S(groupId, dataCode, collectionName, status);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByG_DC_CN_S(groupId, dataCode,
				collectionName, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByG_DC_CN_S_PrevAndNext(long dictDataId,
		long groupId, String dataCode, String collectionName, int status,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByG_DC_CN_S_PrevAndNext(session, dictData, groupId,
					dataCode, collectionName, status, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByG_DC_CN_S_PrevAndNext(session, dictData, groupId,
					dataCode, collectionName, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData getByG_DC_CN_S_PrevAndNext(Session session,
		DictData dictData, long groupId, String dataCode,
		String collectionName, int status, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_G_DC_CN_S_GROUPID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_2);
		}

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_2);
		}

		query.append(_FINDER_COLUMN_G_DC_CN_S_STATUS_2);

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
			query.append(DictDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindDataCode) {
			qPos.add(dataCode);
		}

		if (bindCollectionName) {
			qPos.add(collectionName);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @return the matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_DC_CN_S(long groupId, String dataCode,
		String collectionName, int status) throws SystemException {
		return filterFindByG_DC_CN_S(groupId, dataCode, collectionName, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_DC_CN_S(long groupId, String dataCode,
		String collectionName, int status, int start, int end)
		throws SystemException {
		return filterFindByG_DC_CN_S(groupId, dataCode, collectionName, status,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas that the user has permissions to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> filterFindByG_DC_CN_S(long groupId, String dataCode,
		String collectionName, int status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_DC_CN_S(groupId, dataCode, collectionName, status,
				start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_DC_CN_S_GROUPID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_2);
		}

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_2);
		}

		query.append(_FINDER_COLUMN_G_DC_CN_S_STATUS_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(DictDataModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, DictDataImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, DictDataImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			if (bindDataCode) {
				qPos.add(dataCode);
			}

			if (bindCollectionName) {
				qPos.add(collectionName);
			}

			qPos.add(status);

			return (List<DictData>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set of dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] filterFindByG_DC_CN_S_PrevAndNext(long dictDataId,
		long groupId, String dataCode, String collectionName, int status,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_DC_CN_S_PrevAndNext(dictDataId, groupId, dataCode,
				collectionName, status, orderByComparator);
		}

		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = filterGetByG_DC_CN_S_PrevAndNext(session, dictData,
					groupId, dataCode, collectionName, status,
					orderByComparator, true);

			array[1] = dictData;

			array[2] = filterGetByG_DC_CN_S_PrevAndNext(session, dictData,
					groupId, dataCode, collectionName, status,
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

	protected DictData filterGetByG_DC_CN_S_PrevAndNext(Session session,
		DictData dictData, long groupId, String dataCode,
		String collectionName, int status, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_DC_CN_S_GROUPID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_2);
		}

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_2);
		}

		query.append(_FINDER_COLUMN_G_DC_CN_S_STATUS_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(DictDataModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, DictDataImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, DictDataImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindDataCode) {
			qPos.add(dataCode);
		}

		if (bindCollectionName) {
			qPos.add(collectionName);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_DC_CN_S(long groupId, String dataCode,
		String collectionName, int status) throws SystemException {
		for (DictData dictData : findByG_DC_CN_S(groupId, dataCode,
				collectionName, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_DC_CN_S(long groupId, String dataCode,
		String collectionName, int status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_DC_CN_S;

		Object[] finderArgs = new Object[] {
				groupId, dataCode, collectionName, status
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_G_DC_CN_S_GROUPID_2);

			boolean bindDataCode = false;

			if (dataCode == null) {
				query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_1);
			}
			else if (dataCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_3);
			}
			else {
				bindDataCode = true;

				query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_2);
			}

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_2);
			}

			query.append(_FINDER_COLUMN_G_DC_CN_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDataCode) {
					qPos.add(dataCode);
				}

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				qPos.add(status);

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

	/**
	 * Returns the number of dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @return the number of matching dictionary datas that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByG_DC_CN_S(long groupId, String dataCode,
		String collectionName, int status) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByG_DC_CN_S(groupId, dataCode, collectionName, status);
		}

		StringBundler query = new StringBundler(5);

		query.append(_FILTER_SQL_COUNT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_G_DC_CN_S_GROUPID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_G_DC_CN_S_DATACODE_2);
		}

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_2);
		}

		query.append(_FINDER_COLUMN_G_DC_CN_S_STATUS_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				DictData.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			if (bindDataCode) {
				qPos.add(dataCode);
			}

			if (bindCollectionName) {
				qPos.add(collectionName);
			}

			qPos.add(status);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_G_DC_CN_S_GROUPID_2 = "dictData.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_DC_CN_S_DATACODE_1 = "dictData.dataCode IS NULL AND ";
	private static final String _FINDER_COLUMN_G_DC_CN_S_DATACODE_2 = "dictData.dataCode = ? AND ";
	private static final String _FINDER_COLUMN_G_DC_CN_S_DATACODE_3 = "(dictData.dataCode IS NULL OR dictData.dataCode = '') AND ";
	private static final String _FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_1 = "dictData.collectionName IS NULL AND ";
	private static final String _FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_2 = "dictData.collectionName = ? AND ";
	private static final String _FINDER_COLUMN_G_DC_CN_S_COLLECTIONNAME_3 = "(dictData.collectionName IS NULL OR dictData.collectionName = '') AND ";
	private static final String _FINDER_COLUMN_G_DC_CN_S_STATUS_2 = "dictData.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DC_CN_S =
		new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_DC_CN_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC_CN_S =
		new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_DC_CN_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			DictDataModelImpl.COMPANYID_COLUMN_BITMASK |
			DictDataModelImpl.DATACODE_COLUMN_BITMASK |
			DictDataModelImpl.COLLECTIONNAME_COLUMN_BITMASK |
			DictDataModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_DC_CN_S = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_DC_CN_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DC_CN_S(long companyId, String dataCode,
		String collectionName, int status) throws SystemException {
		return findByC_DC_CN_S(companyId, dataCode, collectionName, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DC_CN_S(long companyId, String dataCode,
		String collectionName, int status, int start, int end)
		throws SystemException {
		return findByC_DC_CN_S(companyId, dataCode, collectionName, status,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DC_CN_S(long companyId, String dataCode,
		String collectionName, int status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC_CN_S;
			finderArgs = new Object[] {
					companyId, dataCode, collectionName, status
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DC_CN_S;
			finderArgs = new Object[] {
					companyId, dataCode, collectionName, status,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if ((companyId != dictData.getCompanyId()) ||
						!Validator.equals(dataCode, dictData.getDataCode()) ||
						!Validator.equals(collectionName,
							dictData.getCollectionName()) ||
						(status != dictData.getStatus())) {
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

			query.append(_SQL_SELECT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_C_DC_CN_S_COMPANYID_2);

			boolean bindDataCode = false;

			if (dataCode == null) {
				query.append(_FINDER_COLUMN_C_DC_CN_S_DATACODE_1);
			}
			else if (dataCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DC_CN_S_DATACODE_3);
			}
			else {
				bindDataCode = true;

				query.append(_FINDER_COLUMN_C_DC_CN_S_DATACODE_2);
			}

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_2);
			}

			query.append(_FINDER_COLUMN_C_DC_CN_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindDataCode) {
					qPos.add(dataCode);
				}

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				qPos.add(status);

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_DC_CN_S_First(long companyId, String dataCode,
		String collectionName, int status, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_DC_CN_S_First(companyId, dataCode,
				collectionName, status, orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", dataCode=");
		msg.append(dataCode);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_DC_CN_S_First(long companyId, String dataCode,
		String collectionName, int status, OrderByComparator orderByComparator)
		throws SystemException {
		List<DictData> list = findByC_DC_CN_S(companyId, dataCode,
				collectionName, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_DC_CN_S_Last(long companyId, String dataCode,
		String collectionName, int status, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_DC_CN_S_Last(companyId, dataCode,
				collectionName, status, orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", dataCode=");
		msg.append(dataCode);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_DC_CN_S_Last(long companyId, String dataCode,
		String collectionName, int status, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_DC_CN_S(companyId, dataCode, collectionName, status);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByC_DC_CN_S(companyId, dataCode,
				collectionName, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByC_DC_CN_S_PrevAndNext(long dictDataId,
		long companyId, String dataCode, String collectionName, int status,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByC_DC_CN_S_PrevAndNext(session, dictData, companyId,
					dataCode, collectionName, status, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByC_DC_CN_S_PrevAndNext(session, dictData, companyId,
					dataCode, collectionName, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictData getByC_DC_CN_S_PrevAndNext(Session session,
		DictData dictData, long companyId, String dataCode,
		String collectionName, int status, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTDATA_WHERE);

		query.append(_FINDER_COLUMN_C_DC_CN_S_COMPANYID_2);

		boolean bindDataCode = false;

		if (dataCode == null) {
			query.append(_FINDER_COLUMN_C_DC_CN_S_DATACODE_1);
		}
		else if (dataCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_DC_CN_S_DATACODE_3);
		}
		else {
			bindDataCode = true;

			query.append(_FINDER_COLUMN_C_DC_CN_S_DATACODE_2);
		}

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_2);
		}

		query.append(_FINDER_COLUMN_C_DC_CN_S_STATUS_2);

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
			query.append(DictDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindDataCode) {
			qPos.add(dataCode);
		}

		if (bindCollectionName) {
			qPos.add(collectionName);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_DC_CN_S(long companyId, String dataCode,
		String collectionName, int status) throws SystemException {
		for (DictData dictData : findByC_DC_CN_S(companyId, dataCode,
				collectionName, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param collectionName the collection name
	 * @param status the status
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_DC_CN_S(long companyId, String dataCode,
		String collectionName, int status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_DC_CN_S;

		Object[] finderArgs = new Object[] {
				companyId, dataCode, collectionName, status
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

			query.append(_FINDER_COLUMN_C_DC_CN_S_COMPANYID_2);

			boolean bindDataCode = false;

			if (dataCode == null) {
				query.append(_FINDER_COLUMN_C_DC_CN_S_DATACODE_1);
			}
			else if (dataCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DC_CN_S_DATACODE_3);
			}
			else {
				bindDataCode = true;

				query.append(_FINDER_COLUMN_C_DC_CN_S_DATACODE_2);
			}

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_2);
			}

			query.append(_FINDER_COLUMN_C_DC_CN_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindDataCode) {
					qPos.add(dataCode);
				}

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_C_DC_CN_S_COMPANYID_2 = "dictData.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_S_DATACODE_1 = "dictData.dataCode IS NULL AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_S_DATACODE_2 = "dictData.dataCode = ? AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_S_DATACODE_3 = "(dictData.dataCode IS NULL OR dictData.dataCode = '') AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_1 = "dictData.collectionName IS NULL AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_2 = "dictData.collectionName = ? AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_3 = "(dictData.collectionName IS NULL OR dictData.collectionName = '') AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_S_STATUS_2 = "dictData.status = ?";

	public DictDataPersistenceImpl() {
		setModelClass(DictData.class);
	}

	/**
	 * Caches the dictionary data in the entity cache if it is enabled.
	 *
	 * @param dictData the dictionary data
	 */
	@Override
	public void cacheResult(DictData dictData) {
		EntityCacheUtil.putResult(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataImpl.class, dictData.getPrimaryKey(), dictData);

		dictData.resetOriginalValues();
	}

	/**
	 * Caches the dictionary datas in the entity cache if it is enabled.
	 *
	 * @param dictDatas the dictionary datas
	 */
	@Override
	public void cacheResult(List<DictData> dictDatas) {
		for (DictData dictData : dictDatas) {
			if (EntityCacheUtil.getResult(
						DictDataModelImpl.ENTITY_CACHE_ENABLED,
						DictDataImpl.class, dictData.getPrimaryKey()) == null) {
				cacheResult(dictData);
			}
			else {
				dictData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dictionary datas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DictDataImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DictDataImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dictionary data.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DictData dictData) {
		EntityCacheUtil.removeResult(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataImpl.class, dictData.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DictData> dictDatas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DictData dictData : dictDatas) {
			EntityCacheUtil.removeResult(DictDataModelImpl.ENTITY_CACHE_ENABLED,
				DictDataImpl.class, dictData.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dictionary data with the primary key. Does not add the dictionary data to the database.
	 *
	 * @param dictDataId the primary key for the new dictionary data
	 * @return the new dictionary data
	 */
	@Override
	public DictData create(long dictDataId) {
		DictData dictData = new DictDataImpl();

		dictData.setNew(true);
		dictData.setPrimaryKey(dictDataId);

		return dictData;
	}

	/**
	 * Removes the dictionary data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dictDataId the primary key of the dictionary data
	 * @return the dictionary data that was removed
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData remove(long dictDataId)
		throws NoSuchDictDataException, SystemException {
		return remove((Serializable)dictDataId);
	}

	/**
	 * Removes the dictionary data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dictionary data
	 * @return the dictionary data that was removed
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData remove(Serializable primaryKey)
		throws NoSuchDictDataException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DictData dictData = (DictData)session.get(DictDataImpl.class,
					primaryKey);

			if (dictData == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDictDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dictData);
		}
		catch (NoSuchDictDataException nsee) {
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
	protected DictData removeImpl(DictData dictData) throws SystemException {
		dictData = toUnwrappedModel(dictData);

		dictDataToDictCollectionTableMapper.deleteLeftPrimaryKeyTableMappings(dictData.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dictData)) {
				dictData = (DictData)session.get(DictDataImpl.class,
						dictData.getPrimaryKeyObj());
			}

			if (dictData != null) {
				session.delete(dictData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dictData != null) {
			clearCache(dictData);
		}

		return dictData;
	}

	@Override
	public DictData updateImpl(org.oep.core.datamgt.model.DictData dictData)
		throws SystemException {
		dictData = toUnwrappedModel(dictData);

		boolean isNew = dictData.isNew();

		DictDataModelImpl dictDataModelImpl = (DictDataModelImpl)dictData;

		Session session = null;

		try {
			session = openSession();

			if (dictData.isNew()) {
				session.save(dictData);

				dictData.setNew(false);
			}
			else {
				session.merge(dictData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DictDataModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictDataModelImpl.getOriginalCompanyId(),
						dictDataModelImpl.getOriginalDataCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC,
					args);

				args = new Object[] {
						dictDataModelImpl.getCompanyId(),
						dictDataModelImpl.getDataCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC,
					args);
			}

			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictDataModelImpl.getOriginalGroupId(),
						dictDataModelImpl.getOriginalDataCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_DC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC,
					args);

				args = new Object[] {
						dictDataModelImpl.getGroupId(),
						dictDataModelImpl.getDataCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_DC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC,
					args);
			}

			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN_DL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictDataModelImpl.getOriginalCompanyId(),
						dictDataModelImpl.getOriginalCollectionName(),
						dictDataModelImpl.getOriginalDataLevel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_CN_DL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN_DL,
					args);

				args = new Object[] {
						dictDataModelImpl.getCompanyId(),
						dictDataModelImpl.getCollectionName(),
						dictDataModelImpl.getDataLevel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_CN_DL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN_DL,
					args);
			}

			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN_DL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictDataModelImpl.getOriginalGroupId(),
						dictDataModelImpl.getOriginalCollectionName(),
						dictDataModelImpl.getOriginalDataLevel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_CN_DL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN_DL,
					args);

				args = new Object[] {
						dictDataModelImpl.getGroupId(),
						dictDataModelImpl.getCollectionName(),
						dictDataModelImpl.getDataLevel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_CN_DL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN_DL,
					args);
			}

			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictDataModelImpl.getOriginalCompanyId(),
						dictDataModelImpl.getOriginalCollectionName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN,
					args);

				args = new Object[] {
						dictDataModelImpl.getCompanyId(),
						dictDataModelImpl.getCollectionName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN,
					args);
			}

			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictDataModelImpl.getOriginalGroupId(),
						dictDataModelImpl.getOriginalCollectionName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN,
					args);

				args = new Object[] {
						dictDataModelImpl.getGroupId(),
						dictDataModelImpl.getCollectionName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN,
					args);
			}

			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC_CN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictDataModelImpl.getOriginalGroupId(),
						dictDataModelImpl.getOriginalDataCode(),
						dictDataModelImpl.getOriginalCollectionName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_DC_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC_CN,
					args);

				args = new Object[] {
						dictDataModelImpl.getGroupId(),
						dictDataModelImpl.getDataCode(),
						dictDataModelImpl.getCollectionName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_DC_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC_CN,
					args);
			}

			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC_CN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictDataModelImpl.getOriginalCompanyId(),
						dictDataModelImpl.getOriginalDataCode(),
						dictDataModelImpl.getOriginalCollectionName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DC_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC_CN,
					args);

				args = new Object[] {
						dictDataModelImpl.getCompanyId(),
						dictDataModelImpl.getDataCode(),
						dictDataModelImpl.getCollectionName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DC_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC_CN,
					args);
			}

			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictDataModelImpl.getOriginalGroupId(),
						dictDataModelImpl.getOriginalDataLevel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_DL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DL,
					args);

				args = new Object[] {
						dictDataModelImpl.getGroupId(),
						dictDataModelImpl.getDataLevel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_DL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DL,
					args);
			}

			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictDataModelImpl.getOriginalCompanyId(),
						dictDataModelImpl.getOriginalDataLevel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DL,
					args);

				args = new Object[] {
						dictDataModelImpl.getCompanyId(),
						dictDataModelImpl.getDataLevel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DL,
					args);
			}

			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC_CN_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictDataModelImpl.getOriginalGroupId(),
						dictDataModelImpl.getOriginalDataCode(),
						dictDataModelImpl.getOriginalCollectionName(),
						dictDataModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_DC_CN_S,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC_CN_S,
					args);

				args = new Object[] {
						dictDataModelImpl.getGroupId(),
						dictDataModelImpl.getDataCode(),
						dictDataModelImpl.getCollectionName(),
						dictDataModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_DC_CN_S,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DC_CN_S,
					args);
			}

			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC_CN_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictDataModelImpl.getOriginalCompanyId(),
						dictDataModelImpl.getOriginalDataCode(),
						dictDataModelImpl.getOriginalCollectionName(),
						dictDataModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DC_CN_S,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC_CN_S,
					args);

				args = new Object[] {
						dictDataModelImpl.getCompanyId(),
						dictDataModelImpl.getDataCode(),
						dictDataModelImpl.getCollectionName(),
						dictDataModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DC_CN_S,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC_CN_S,
					args);
			}
		}

		EntityCacheUtil.putResult(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataImpl.class, dictData.getPrimaryKey(), dictData);

		return dictData;
	}

	protected DictData toUnwrappedModel(DictData dictData) {
		if (dictData instanceof DictDataImpl) {
			return dictData;
		}

		DictDataImpl dictDataImpl = new DictDataImpl();

		dictDataImpl.setNew(dictData.isNew());
		dictDataImpl.setPrimaryKey(dictData.getPrimaryKey());

		dictDataImpl.setDictDataId(dictData.getDictDataId());
		dictDataImpl.setCompanyId(dictData.getCompanyId());
		dictDataImpl.setGroupId(dictData.getGroupId());
		dictDataImpl.setUserId(dictData.getUserId());
		dictDataImpl.setCreateDate(dictData.getCreateDate());
		dictDataImpl.setModifiedDate(dictData.getModifiedDate());
		dictDataImpl.setCollectionName(dictData.getCollectionName());
		dictDataImpl.setDataCode(dictData.getDataCode());
		dictDataImpl.setNode_1(dictData.getNode_1());
		dictDataImpl.setNode_2(dictData.getNode_2());
		dictDataImpl.setNode_3(dictData.getNode_3());
		dictDataImpl.setNode_4(dictData.getNode_4());
		dictDataImpl.setNode_5(dictData.getNode_5());
		dictDataImpl.setDataLevel(dictData.getDataLevel());
		dictDataImpl.setTitle(dictData.getTitle());
		dictDataImpl.setDescription(dictData.getDescription());
		dictDataImpl.setValidatedFrom(dictData.getValidatedFrom());
		dictDataImpl.setValidatedTo(dictData.getValidatedTo());
		dictDataImpl.setStatus(dictData.getStatus());

		return dictDataImpl;
	}

	/**
	 * Returns the dictionary data with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dictionary data
	 * @return the dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByPrimaryKey(primaryKey);

		if (dictData == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDictDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dictData;
	}

	/**
	 * Returns the dictionary data with the primary key or throws a {@link org.oep.core.datamgt.NoSuchDictDataException} if it could not be found.
	 *
	 * @param dictDataId the primary key of the dictionary data
	 * @return the dictionary data
	 * @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByPrimaryKey(long dictDataId)
		throws NoSuchDictDataException, SystemException {
		return findByPrimaryKey((Serializable)dictDataId);
	}

	/**
	 * Returns the dictionary data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dictionary data
	 * @return the dictionary data, or <code>null</code> if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DictData dictData = (DictData)EntityCacheUtil.getResult(DictDataModelImpl.ENTITY_CACHE_ENABLED,
				DictDataImpl.class, primaryKey);

		if (dictData == _nullDictData) {
			return null;
		}

		if (dictData == null) {
			Session session = null;

			try {
				session = openSession();

				dictData = (DictData)session.get(DictDataImpl.class, primaryKey);

				if (dictData != null) {
					cacheResult(dictData);
				}
				else {
					EntityCacheUtil.putResult(DictDataModelImpl.ENTITY_CACHE_ENABLED,
						DictDataImpl.class, primaryKey, _nullDictData);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DictDataModelImpl.ENTITY_CACHE_ENABLED,
					DictDataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dictData;
	}

	/**
	 * Returns the dictionary data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dictDataId the primary key of the dictionary data
	 * @return the dictionary data, or <code>null</code> if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByPrimaryKey(long dictDataId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dictDataId);
	}

	/**
	 * Returns all the dictionary datas.
	 *
	 * @return the dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findAll(int start, int end,
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

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DICTDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DICTDATA;

				if (pagination) {
					sql = sql.concat(DictDataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictData>(list);
				}
				else {
					list = (List<DictData>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dictionary datas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DictData dictData : findAll()) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas.
	 *
	 * @return the number of dictionary datas
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

				Query q = session.createQuery(_SQL_COUNT_DICTDATA);

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
	 * Returns all the dictionary collections associated with the dictionary data.
	 *
	 * @param pk the primary key of the dictionary data
	 * @return the dictionary collections associated with the dictionary data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.core.datamgt.model.DictCollection> getDictCollections(
		long pk) throws SystemException {
		return getDictCollections(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the dictionary collections associated with the dictionary data.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the dictionary data
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of dictionary collections associated with the dictionary data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.core.datamgt.model.DictCollection> getDictCollections(
		long pk, int start, int end) throws SystemException {
		return getDictCollections(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections associated with the dictionary data.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the dictionary data
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dictionary collections associated with the dictionary data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.core.datamgt.model.DictCollection> getDictCollections(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return dictDataToDictCollectionTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of dictionary collections associated with the dictionary data.
	 *
	 * @param pk the primary key of the dictionary data
	 * @return the number of dictionary collections associated with the dictionary data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getDictCollectionsSize(long pk) throws SystemException {
		long[] pks = dictDataToDictCollectionTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the dictionary collection is associated with the dictionary data.
	 *
	 * @param pk the primary key of the dictionary data
	 * @param dictCollectionPK the primary key of the dictionary collection
	 * @return <code>true</code> if the dictionary collection is associated with the dictionary data; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsDictCollection(long pk, long dictCollectionPK)
		throws SystemException {
		return dictDataToDictCollectionTableMapper.containsTableMapping(pk,
			dictCollectionPK);
	}

	/**
	 * Returns <code>true</code> if the dictionary data has any dictionary collections associated with it.
	 *
	 * @param pk the primary key of the dictionary data to check for associations with dictionary collections
	 * @return <code>true</code> if the dictionary data has any dictionary collections associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsDictCollections(long pk) throws SystemException {
		if (getDictCollectionsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the dictionary data and the dictionary collection. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary data
	 * @param dictCollectionPK the primary key of the dictionary collection
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addDictCollection(long pk, long dictCollectionPK)
		throws SystemException {
		dictDataToDictCollectionTableMapper.addTableMapping(pk, dictCollectionPK);
	}

	/**
	 * Adds an association between the dictionary data and the dictionary collection. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary data
	 * @param dictCollection the dictionary collection
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addDictCollection(long pk,
		org.oep.core.datamgt.model.DictCollection dictCollection)
		throws SystemException {
		dictDataToDictCollectionTableMapper.addTableMapping(pk,
			dictCollection.getPrimaryKey());
	}

	/**
	 * Adds an association between the dictionary data and the dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary data
	 * @param dictCollectionPKs the primary keys of the dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addDictCollections(long pk, long[] dictCollectionPKs)
		throws SystemException {
		for (long dictCollectionPK : dictCollectionPKs) {
			dictDataToDictCollectionTableMapper.addTableMapping(pk,
				dictCollectionPK);
		}
	}

	/**
	 * Adds an association between the dictionary data and the dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary data
	 * @param dictCollections the dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addDictCollections(long pk,
		List<org.oep.core.datamgt.model.DictCollection> dictCollections)
		throws SystemException {
		for (org.oep.core.datamgt.model.DictCollection dictCollection : dictCollections) {
			dictDataToDictCollectionTableMapper.addTableMapping(pk,
				dictCollection.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the dictionary data and its dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary data to clear the associated dictionary collections from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearDictCollections(long pk) throws SystemException {
		dictDataToDictCollectionTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the dictionary data and the dictionary collection. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary data
	 * @param dictCollectionPK the primary key of the dictionary collection
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeDictCollection(long pk, long dictCollectionPK)
		throws SystemException {
		dictDataToDictCollectionTableMapper.deleteTableMapping(pk,
			dictCollectionPK);
	}

	/**
	 * Removes the association between the dictionary data and the dictionary collection. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary data
	 * @param dictCollection the dictionary collection
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeDictCollection(long pk,
		org.oep.core.datamgt.model.DictCollection dictCollection)
		throws SystemException {
		dictDataToDictCollectionTableMapper.deleteTableMapping(pk,
			dictCollection.getPrimaryKey());
	}

	/**
	 * Removes the association between the dictionary data and the dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary data
	 * @param dictCollectionPKs the primary keys of the dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeDictCollections(long pk, long[] dictCollectionPKs)
		throws SystemException {
		for (long dictCollectionPK : dictCollectionPKs) {
			dictDataToDictCollectionTableMapper.deleteTableMapping(pk,
				dictCollectionPK);
		}
	}

	/**
	 * Removes the association between the dictionary data and the dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary data
	 * @param dictCollections the dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeDictCollections(long pk,
		List<org.oep.core.datamgt.model.DictCollection> dictCollections)
		throws SystemException {
		for (org.oep.core.datamgt.model.DictCollection dictCollection : dictCollections) {
			dictDataToDictCollectionTableMapper.deleteTableMapping(pk,
				dictCollection.getPrimaryKey());
		}
	}

	/**
	 * Sets the dictionary collections associated with the dictionary data, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary data
	 * @param dictCollectionPKs the primary keys of the dictionary collections to be associated with the dictionary data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setDictCollections(long pk, long[] dictCollectionPKs)
		throws SystemException {
		Set<Long> newDictCollectionPKsSet = SetUtil.fromArray(dictCollectionPKs);
		Set<Long> oldDictCollectionPKsSet = SetUtil.fromArray(dictDataToDictCollectionTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeDictCollectionPKsSet = new HashSet<Long>(oldDictCollectionPKsSet);

		removeDictCollectionPKsSet.removeAll(newDictCollectionPKsSet);

		for (long removeDictCollectionPK : removeDictCollectionPKsSet) {
			dictDataToDictCollectionTableMapper.deleteTableMapping(pk,
				removeDictCollectionPK);
		}

		newDictCollectionPKsSet.removeAll(oldDictCollectionPKsSet);

		for (long newDictCollectionPK : newDictCollectionPKsSet) {
			dictDataToDictCollectionTableMapper.addTableMapping(pk,
				newDictCollectionPK);
		}
	}

	/**
	 * Sets the dictionary collections associated with the dictionary data, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary data
	 * @param dictCollections the dictionary collections to be associated with the dictionary data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setDictCollections(long pk,
		List<org.oep.core.datamgt.model.DictCollection> dictCollections)
		throws SystemException {
		try {
			long[] dictCollectionPKs = new long[dictCollections.size()];

			for (int i = 0; i < dictCollections.size(); i++) {
				org.oep.core.datamgt.model.DictCollection dictCollection = dictCollections.get(i);

				dictCollectionPKs[i] = dictCollection.getPrimaryKey();
			}

			setDictCollections(pk, dictCollectionPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(DictDataModelImpl.MAPPING_TABLE_OEP_DATAMGT_DICTDATA2COLLECTION_NAME);
		}
	}

	/**
	 * Initializes the dictionary data persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.datamgt.model.DictData")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DictData>> listenersList = new ArrayList<ModelListener<DictData>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DictData>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		dictDataToDictCollectionTableMapper = TableMapperFactory.getTableMapper("oep_datamgt_dictdata2collection",
				"dictDataId", "dictCollectionId", this,
				dictCollectionPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DictDataImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = DictCollectionPersistence.class)
	protected DictCollectionPersistence dictCollectionPersistence;
	protected TableMapper<DictData, org.oep.core.datamgt.model.DictCollection> dictDataToDictCollectionTableMapper;
	private static final String _SQL_SELECT_DICTDATA = "SELECT dictData FROM DictData dictData";
	private static final String _SQL_SELECT_DICTDATA_WHERE = "SELECT dictData FROM DictData dictData WHERE ";
	private static final String _SQL_COUNT_DICTDATA = "SELECT COUNT(dictData) FROM DictData dictData";
	private static final String _SQL_COUNT_DICTDATA_WHERE = "SELECT COUNT(dictData) FROM DictData dictData WHERE ";
	private static final String _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN = "dictData.dictDataId";
	private static final String _FILTER_SQL_SELECT_DICTDATA_WHERE = "SELECT DISTINCT {dictData.*} FROM oep_datamgt_dictdata dictData WHERE ";
	private static final String _FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {oep_datamgt_dictdata.*} FROM (SELECT DISTINCT dictData.dictDataId FROM oep_datamgt_dictdata dictData WHERE ";
	private static final String _FILTER_SQL_SELECT_DICTDATA_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN oep_datamgt_dictdata ON TEMP_TABLE.dictDataId = oep_datamgt_dictdata.dictDataId";
	private static final String _FILTER_SQL_COUNT_DICTDATA_WHERE = "SELECT COUNT(DISTINCT dictData.dictDataId) AS COUNT_VALUE FROM oep_datamgt_dictdata dictData WHERE ";
	private static final String _FILTER_ENTITY_ALIAS = "dictData";
	private static final String _FILTER_ENTITY_TABLE = "oep_datamgt_dictdata";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dictData.";
	private static final String _ORDER_BY_ENTITY_TABLE = "oep_datamgt_dictdata.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DictData exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DictData exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DictDataPersistenceImpl.class);
	private static DictData _nullDictData = new DictDataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DictData> toCacheModel() {
				return _nullDictDataCacheModel;
			}
		};

	private static CacheModel<DictData> _nullDictDataCacheModel = new CacheModel<DictData>() {
			@Override
			public DictData toEntityModel() {
				return _nullDictData;
			}
		};
}