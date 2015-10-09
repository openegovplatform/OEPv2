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

package org.oep.core.datamgt.dictionary.service.persistence;

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

import org.oep.core.datamgt.dictionary.NoSuchDictDataException;
import org.oep.core.datamgt.dictionary.model.DictData;
import org.oep.core.datamgt.dictionary.model.impl.DictDataImpl;
import org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl;

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
 * @author TrungDK
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
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_DC",
			new String[] { String.class.getName(), Long.class.getName() },
			DictDataModelImpl.DATACODE_COLUMN_BITMASK |
			DictDataModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_DC = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_DC",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dictionary datas where dataCode = &#63; and companyId = &#63;.
	 *
	 * @param dataCode the data code
	 * @param companyId the company ID
	 * @return the matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DC(String dataCode, long companyId)
		throws SystemException {
		return findByC_DC(dataCode, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary datas where dataCode = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataCode the data code
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DC(String dataCode, long companyId,
		int start, int end) throws SystemException {
		return findByC_DC(dataCode, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas where dataCode = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataCode the data code
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictData> findByC_DC(String dataCode, long companyId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC;
			finderArgs = new Object[] { dataCode, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DC;
			finderArgs = new Object[] {
					dataCode, companyId,
					
					start, end, orderByComparator
				};
		}

		List<DictData> list = (List<DictData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictData dictData : list) {
				if (!Validator.equals(dataCode, dictData.getDataCode()) ||
						(companyId != dictData.getCompanyId())) {
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

			query.append(_FINDER_COLUMN_C_DC_COMPANYID_2);

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

				if (bindDataCode) {
					qPos.add(dataCode);
				}

				qPos.add(companyId);

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
	 * Returns the first dictionary data in the ordered set where dataCode = &#63; and companyId = &#63;.
	 *
	 * @param dataCode the data code
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_DC_First(String dataCode, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_DC_First(dataCode, companyId,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataCode=");
		msg.append(dataCode);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary data in the ordered set where dataCode = &#63; and companyId = &#63;.
	 *
	 * @param dataCode the data code
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_DC_First(String dataCode, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictData> list = findByC_DC(dataCode, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary data in the ordered set where dataCode = &#63; and companyId = &#63;.
	 *
	 * @param dataCode the data code
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_DC_Last(String dataCode, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_DC_Last(dataCode, companyId,
				orderByComparator);

		if (dictData != null) {
			return dictData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataCode=");
		msg.append(dataCode);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary data in the ordered set where dataCode = &#63; and companyId = &#63;.
	 *
	 * @param dataCode the data code
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_DC_Last(String dataCode, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_DC(dataCode, companyId);

		if (count == 0) {
			return null;
		}

		List<DictData> list = findByC_DC(dataCode, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary datas before and after the current dictionary data in the ordered set where dataCode = &#63; and companyId = &#63;.
	 *
	 * @param dictDataId the primary key of the current dictionary data
	 * @param dataCode the data code
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary data
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a dictionary data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData[] findByC_DC_PrevAndNext(long dictDataId, String dataCode,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByPrimaryKey(dictDataId);

		Session session = null;

		try {
			session = openSession();

			DictData[] array = new DictDataImpl[3];

			array[0] = getByC_DC_PrevAndNext(session, dictData, dataCode,
					companyId, orderByComparator, true);

			array[1] = dictData;

			array[2] = getByC_DC_PrevAndNext(session, dictData, dataCode,
					companyId, orderByComparator, false);

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
		DictData dictData, String dataCode, long companyId,
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

		query.append(_FINDER_COLUMN_C_DC_COMPANYID_2);

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

		if (bindDataCode) {
			qPos.add(dataCode);
		}

		qPos.add(companyId);

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
	 * Removes all the dictionary datas where dataCode = &#63; and companyId = &#63; from the database.
	 *
	 * @param dataCode the data code
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_DC(String dataCode, long companyId)
		throws SystemException {
		for (DictData dictData : findByC_DC(dataCode, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictData);
		}
	}

	/**
	 * Returns the number of dictionary datas where dataCode = &#63; and companyId = &#63;.
	 *
	 * @param dataCode the data code
	 * @param companyId the company ID
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_DC(String dataCode, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_DC;

		Object[] finderArgs = new Object[] { dataCode, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTDATA_WHERE);

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

			query.append(_FINDER_COLUMN_C_DC_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDataCode) {
					qPos.add(dataCode);
				}

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

	private static final String _FINDER_COLUMN_C_DC_DATACODE_1 = "dictData.dataCode IS NULL AND ";
	private static final String _FINDER_COLUMN_C_DC_DATACODE_2 = "dictData.dataCode = ? AND ";
	private static final String _FINDER_COLUMN_C_DC_DATACODE_3 = "(dictData.dataCode IS NULL OR dictData.dataCode = '') AND ";
	private static final String _FINDER_COLUMN_C_DC_COMPANYID_2 = "dictData.companyId = ?";
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a matching dictionary data could not be found
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a matching dictionary data could not be found
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a dictionary data with the primary key could not be found
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a matching dictionary data could not be found
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a matching dictionary data could not be found
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a dictionary data with the primary key could not be found
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a matching dictionary data could not be found
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a matching dictionary data could not be found
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a dictionary data with the primary key could not be found
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a matching dictionary data could not be found
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a matching dictionary data could not be found
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a dictionary data with the primary key could not be found
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
	public static final FinderPath FINDER_PATH_FETCH_BY_C_DC_CN_S = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, DictDataImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_DC_CN_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), String.class.getName()
			},
			DictDataModelImpl.COMPANYID_COLUMN_BITMASK |
			DictDataModelImpl.DATACODE_COLUMN_BITMASK |
			DictDataModelImpl.STATUS_COLUMN_BITMASK |
			DictDataModelImpl.COLLECTIONNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_DC_CN_S = new FinderPath(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_DC_CN_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), String.class.getName()
			});

	/**
	 * Returns the dictionary data where companyId = &#63; and dataCode = &#63; and status = &#63; and collectionName = &#63; or throws a {@link org.oep.core.datamgt.dictionary.NoSuchDictDataException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param status the status
	 * @param collectionName the collection name
	 * @return the matching dictionary data
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData findByC_DC_CN_S(long companyId, String dataCode,
		int status, String collectionName)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = fetchByC_DC_CN_S(companyId, dataCode, status,
				collectionName);

		if (dictData == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", dataCode=");
			msg.append(dataCode);

			msg.append(", status=");
			msg.append(status);

			msg.append(", collectionName=");
			msg.append(collectionName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDictDataException(msg.toString());
		}

		return dictData;
	}

	/**
	 * Returns the dictionary data where companyId = &#63; and dataCode = &#63; and status = &#63; and collectionName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param status the status
	 * @param collectionName the collection name
	 * @return the matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_DC_CN_S(long companyId, String dataCode,
		int status, String collectionName) throws SystemException {
		return fetchByC_DC_CN_S(companyId, dataCode, status, collectionName,
			true);
	}

	/**
	 * Returns the dictionary data where companyId = &#63; and dataCode = &#63; and status = &#63; and collectionName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param status the status
	 * @param collectionName the collection name
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData fetchByC_DC_CN_S(long companyId, String dataCode,
		int status, String collectionName, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, dataCode, status, collectionName
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_DC_CN_S,
					finderArgs, this);
		}

		if (result instanceof DictData) {
			DictData dictData = (DictData)result;

			if ((companyId != dictData.getCompanyId()) ||
					!Validator.equals(dataCode, dictData.getDataCode()) ||
					(status != dictData.getStatus()) ||
					!Validator.equals(collectionName,
						dictData.getCollectionName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

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

			query.append(_FINDER_COLUMN_C_DC_CN_S_STATUS_2);

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

				qPos.add(status);

				if (bindCollectionName) {
					qPos.add(collectionName);
				}

				List<DictData> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_DC_CN_S,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DictDataPersistenceImpl.fetchByC_DC_CN_S(long, String, int, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DictData dictData = list.get(0);

					result = dictData;

					cacheResult(dictData);

					if ((dictData.getCompanyId() != companyId) ||
							(dictData.getDataCode() == null) ||
							!dictData.getDataCode().equals(dataCode) ||
							(dictData.getStatus() != status) ||
							(dictData.getCollectionName() == null) ||
							!dictData.getCollectionName().equals(collectionName)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_DC_CN_S,
							finderArgs, dictData);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_DC_CN_S,
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
			return (DictData)result;
		}
	}

	/**
	 * Removes the dictionary data where companyId = &#63; and dataCode = &#63; and status = &#63; and collectionName = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param status the status
	 * @param collectionName the collection name
	 * @return the dictionary data that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictData removeByC_DC_CN_S(long companyId, String dataCode,
		int status, String collectionName)
		throws NoSuchDictDataException, SystemException {
		DictData dictData = findByC_DC_CN_S(companyId, dataCode, status,
				collectionName);

		return remove(dictData);
	}

	/**
	 * Returns the number of dictionary datas where companyId = &#63; and dataCode = &#63; and status = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataCode the data code
	 * @param status the status
	 * @param collectionName the collection name
	 * @return the number of matching dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_DC_CN_S(long companyId, String dataCode, int status,
		String collectionName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_DC_CN_S;

		Object[] finderArgs = new Object[] {
				companyId, dataCode, status, collectionName
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

			query.append(_FINDER_COLUMN_C_DC_CN_S_STATUS_2);

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

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_C_DC_CN_S_COMPANYID_2 = "dictData.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_S_DATACODE_1 = "dictData.dataCode IS NULL AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_S_DATACODE_2 = "dictData.dataCode = ? AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_S_DATACODE_3 = "(dictData.dataCode IS NULL OR dictData.dataCode = '') AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_S_STATUS_2 = "dictData.status = ? AND ";
	private static final String _FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_1 = "dictData.collectionName IS NULL";
	private static final String _FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_2 = "dictData.collectionName = ?";
	private static final String _FINDER_COLUMN_C_DC_CN_S_COLLECTIONNAME_3 = "(dictData.collectionName IS NULL OR dictData.collectionName = '')";

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

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_DC_CN_S,
			new Object[] {
				dictData.getCompanyId(), dictData.getDataCode(),
				dictData.getStatus(), dictData.getCollectionName()
			}, dictData);

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

		clearUniqueFindersCache(dictData);
	}

	@Override
	public void clearCache(List<DictData> dictDatas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DictData dictData : dictDatas) {
			EntityCacheUtil.removeResult(DictDataModelImpl.ENTITY_CACHE_ENABLED,
				DictDataImpl.class, dictData.getPrimaryKey());

			clearUniqueFindersCache(dictData);
		}
	}

	protected void cacheUniqueFindersCache(DictData dictData) {
		if (dictData.isNew()) {
			Object[] args = new Object[] {
					dictData.getCompanyId(), dictData.getDataCode(),
					dictData.getStatus(), dictData.getCollectionName()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_DC_CN_S, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_DC_CN_S, args,
				dictData);
		}
		else {
			DictDataModelImpl dictDataModelImpl = (DictDataModelImpl)dictData;

			if ((dictDataModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_DC_CN_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictData.getCompanyId(), dictData.getDataCode(),
						dictData.getStatus(), dictData.getCollectionName()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_DC_CN_S, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_DC_CN_S, args,
					dictData);
			}
		}
	}

	protected void clearUniqueFindersCache(DictData dictData) {
		DictDataModelImpl dictDataModelImpl = (DictDataModelImpl)dictData;

		Object[] args = new Object[] {
				dictData.getCompanyId(), dictData.getDataCode(),
				dictData.getStatus(), dictData.getCollectionName()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DC_CN_S, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_DC_CN_S, args);

		if ((dictDataModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_DC_CN_S.getColumnBitmask()) != 0) {
			args = new Object[] {
					dictDataModelImpl.getOriginalCompanyId(),
					dictDataModelImpl.getOriginalDataCode(),
					dictDataModelImpl.getOriginalStatus(),
					dictDataModelImpl.getOriginalCollectionName()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DC_CN_S, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_DC_CN_S, args);
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a dictionary data with the primary key could not be found
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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a dictionary data with the primary key could not be found
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
	public DictData updateImpl(
		org.oep.core.datamgt.dictionary.model.DictData dictData)
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
						dictDataModelImpl.getOriginalDataCode(),
						dictDataModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC,
					args);

				args = new Object[] {
						dictDataModelImpl.getDataCode(),
						dictDataModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DC,
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
		}

		EntityCacheUtil.putResult(DictDataModelImpl.ENTITY_CACHE_ENABLED,
			DictDataImpl.class, dictData.getPrimaryKey(), dictData);

		clearUniqueFindersCache(dictData);
		cacheUniqueFindersCache(dictData);

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
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a dictionary data with the primary key could not be found
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
	 * Returns the dictionary data with the primary key or throws a {@link org.oep.core.datamgt.dictionary.NoSuchDictDataException} if it could not be found.
	 *
	 * @param dictDataId the primary key of the dictionary data
	 * @return the dictionary data
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictDataException if a dictionary data with the primary key could not be found
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<org.oep.core.datamgt.dictionary.model.DictCollection> getDictCollections(
		long pk) throws SystemException {
		return getDictCollections(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the dictionary collections associated with the dictionary data.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the dictionary data
	 * @param start the lower bound of the range of dictionary datas
	 * @param end the upper bound of the range of dictionary datas (not inclusive)
	 * @return the range of dictionary collections associated with the dictionary data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.core.datamgt.dictionary.model.DictCollection> getDictCollections(
		long pk, int start, int end) throws SystemException {
		return getDictCollections(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections associated with the dictionary data.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<org.oep.core.datamgt.dictionary.model.DictCollection> getDictCollections(
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
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
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
		List<org.oep.core.datamgt.dictionary.model.DictCollection> dictCollections)
		throws SystemException {
		for (org.oep.core.datamgt.dictionary.model.DictCollection dictCollection : dictCollections) {
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
		org.oep.core.datamgt.dictionary.model.DictCollection dictCollection)
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
		List<org.oep.core.datamgt.dictionary.model.DictCollection> dictCollections)
		throws SystemException {
		for (org.oep.core.datamgt.dictionary.model.DictCollection dictCollection : dictCollections) {
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
		List<org.oep.core.datamgt.dictionary.model.DictCollection> dictCollections)
		throws SystemException {
		try {
			long[] dictCollectionPKs = new long[dictCollections.size()];

			for (int i = 0; i < dictCollections.size(); i++) {
				org.oep.core.datamgt.dictionary.model.DictCollection dictCollection =
					dictCollections.get(i);

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
						"value.object.listener.org.oep.core.datamgt.dictionary.model.DictData")));

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
	protected TableMapper<DictData, org.oep.core.datamgt.dictionary.model.DictCollection> dictDataToDictCollectionTableMapper;
	private static final String _SQL_SELECT_DICTDATA = "SELECT dictData FROM DictData dictData";
	private static final String _SQL_SELECT_DICTDATA_WHERE = "SELECT dictData FROM DictData dictData WHERE ";
	private static final String _SQL_COUNT_DICTDATA = "SELECT COUNT(dictData) FROM DictData dictData";
	private static final String _SQL_COUNT_DICTDATA_WHERE = "SELECT COUNT(dictData) FROM DictData dictData WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dictData.";
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