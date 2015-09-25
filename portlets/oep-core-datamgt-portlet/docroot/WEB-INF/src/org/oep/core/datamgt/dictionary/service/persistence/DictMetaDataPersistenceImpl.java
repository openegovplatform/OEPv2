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

import org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException;
import org.oep.core.datamgt.dictionary.model.DictMetaData;
import org.oep.core.datamgt.dictionary.model.impl.DictMetaDataImpl;
import org.oep.core.datamgt.dictionary.model.impl.DictMetaDataModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dictionary meta data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TrungDK
 * @see DictMetaDataPersistence
 * @see DictMetaDataUtil
 * @generated
 */
public class DictMetaDataPersistenceImpl extends BasePersistenceImpl<DictMetaData>
	implements DictMetaDataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DictMetaDataUtil} to access the dictionary meta data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DictMetaDataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DictMetaDataModelImpl.FINDER_CACHE_ENABLED, DictMetaDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DictMetaDataModelImpl.FINDER_CACHE_ENABLED, DictMetaDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DictMetaDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DI = new FinderPath(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DictMetaDataModelImpl.FINDER_CACHE_ENABLED, DictMetaDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_DI",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DI = new FinderPath(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DictMetaDataModelImpl.FINDER_CACHE_ENABLED, DictMetaDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_DI",
			new String[] { Long.class.getName(), Long.class.getName() },
			DictMetaDataModelImpl.COMPANYID_COLUMN_BITMASK |
			DictMetaDataModelImpl.DICTDATAID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_DI = new FinderPath(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DictMetaDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_DI",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dictionary meta datas where companyId = &#63; and dictDataId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @return the matching dictionary meta datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictMetaData> findByC_DI(long companyId, long dictDataId)
		throws SystemException {
		return findByC_DI(companyId, dictDataId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary meta datas where companyId = &#63; and dictDataId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @param start the lower bound of the range of dictionary meta datas
	 * @param end the upper bound of the range of dictionary meta datas (not inclusive)
	 * @return the range of matching dictionary meta datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictMetaData> findByC_DI(long companyId, long dictDataId,
		int start, int end) throws SystemException {
		return findByC_DI(companyId, dictDataId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary meta datas where companyId = &#63; and dictDataId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @param start the lower bound of the range of dictionary meta datas
	 * @param end the upper bound of the range of dictionary meta datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary meta datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictMetaData> findByC_DI(long companyId, long dictDataId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DI;
			finderArgs = new Object[] { companyId, dictDataId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DI;
			finderArgs = new Object[] {
					companyId, dictDataId,
					
					start, end, orderByComparator
				};
		}

		List<DictMetaData> list = (List<DictMetaData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictMetaData dictMetaData : list) {
				if ((companyId != dictMetaData.getCompanyId()) ||
						(dictDataId != dictMetaData.getDictDataId())) {
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

			query.append(_SQL_SELECT_DICTMETADATA_WHERE);

			query.append(_FINDER_COLUMN_C_DI_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_DI_DICTDATAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictMetaDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(dictDataId);

				if (!pagination) {
					list = (List<DictMetaData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictMetaData>(list);
				}
				else {
					list = (List<DictMetaData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary meta data
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a matching dictionary meta data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData findByC_DI_First(long companyId, long dictDataId,
		OrderByComparator orderByComparator)
		throws NoSuchDictMetaDataException, SystemException {
		DictMetaData dictMetaData = fetchByC_DI_First(companyId, dictDataId,
				orderByComparator);

		if (dictMetaData != null) {
			return dictMetaData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", dictDataId=");
		msg.append(dictDataId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictMetaDataException(msg.toString());
	}

	/**
	 * Returns the first dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData fetchByC_DI_First(long companyId, long dictDataId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictMetaData> list = findByC_DI(companyId, dictDataId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary meta data
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a matching dictionary meta data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData findByC_DI_Last(long companyId, long dictDataId,
		OrderByComparator orderByComparator)
		throws NoSuchDictMetaDataException, SystemException {
		DictMetaData dictMetaData = fetchByC_DI_Last(companyId, dictDataId,
				orderByComparator);

		if (dictMetaData != null) {
			return dictMetaData;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", dictDataId=");
		msg.append(dictDataId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictMetaDataException(msg.toString());
	}

	/**
	 * Returns the last dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData fetchByC_DI_Last(long companyId, long dictDataId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_DI(companyId, dictDataId);

		if (count == 0) {
			return null;
		}

		List<DictMetaData> list = findByC_DI(companyId, dictDataId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary meta datas before and after the current dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	 *
	 * @param dictMetaDataId the primary key of the current dictionary meta data
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary meta data
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData[] findByC_DI_PrevAndNext(long dictMetaDataId,
		long companyId, long dictDataId, OrderByComparator orderByComparator)
		throws NoSuchDictMetaDataException, SystemException {
		DictMetaData dictMetaData = findByPrimaryKey(dictMetaDataId);

		Session session = null;

		try {
			session = openSession();

			DictMetaData[] array = new DictMetaDataImpl[3];

			array[0] = getByC_DI_PrevAndNext(session, dictMetaData, companyId,
					dictDataId, orderByComparator, true);

			array[1] = dictMetaData;

			array[2] = getByC_DI_PrevAndNext(session, dictMetaData, companyId,
					dictDataId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictMetaData getByC_DI_PrevAndNext(Session session,
		DictMetaData dictMetaData, long companyId, long dictDataId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTMETADATA_WHERE);

		query.append(_FINDER_COLUMN_C_DI_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_DI_DICTDATAID_2);

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
			query.append(DictMetaDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(dictDataId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictMetaData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictMetaData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary meta datas where companyId = &#63; and dictDataId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_DI(long companyId, long dictDataId)
		throws SystemException {
		for (DictMetaData dictMetaData : findByC_DI(companyId, dictDataId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictMetaData);
		}
	}

	/**
	 * Returns the number of dictionary meta datas where companyId = &#63; and dictDataId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @return the number of matching dictionary meta datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_DI(long companyId, long dictDataId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_DI;

		Object[] finderArgs = new Object[] { companyId, dictDataId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTMETADATA_WHERE);

			query.append(_FINDER_COLUMN_C_DI_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_DI_DICTDATAID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(dictDataId);

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

	private static final String _FINDER_COLUMN_C_DI_COMPANYID_2 = "dictMetaData.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_DI_DICTDATAID_2 = "dictMetaData.dictDataId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_DI_N = new FinderPath(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DictMetaDataModelImpl.FINDER_CACHE_ENABLED, DictMetaDataImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_DI_N",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			DictMetaDataModelImpl.COMPANYID_COLUMN_BITMASK |
			DictMetaDataModelImpl.DICTDATAID_COLUMN_BITMASK |
			DictMetaDataModelImpl.ATTRIBUTENAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_DI_N = new FinderPath(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DictMetaDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_DI_N",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns the dictionary meta data where companyId = &#63; and dictDataId = &#63; and attributeName = &#63; or throws a {@link org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @param attributeName the attribute name
	 * @return the matching dictionary meta data
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a matching dictionary meta data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData findByC_DI_N(long companyId, long dictDataId,
		String attributeName)
		throws NoSuchDictMetaDataException, SystemException {
		DictMetaData dictMetaData = fetchByC_DI_N(companyId, dictDataId,
				attributeName);

		if (dictMetaData == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", dictDataId=");
			msg.append(dictDataId);

			msg.append(", attributeName=");
			msg.append(attributeName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDictMetaDataException(msg.toString());
		}

		return dictMetaData;
	}

	/**
	 * Returns the dictionary meta data where companyId = &#63; and dictDataId = &#63; and attributeName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @param attributeName the attribute name
	 * @return the matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData fetchByC_DI_N(long companyId, long dictDataId,
		String attributeName) throws SystemException {
		return fetchByC_DI_N(companyId, dictDataId, attributeName, true);
	}

	/**
	 * Returns the dictionary meta data where companyId = &#63; and dictDataId = &#63; and attributeName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @param attributeName the attribute name
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData fetchByC_DI_N(long companyId, long dictDataId,
		String attributeName, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, dictDataId, attributeName };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_DI_N,
					finderArgs, this);
		}

		if (result instanceof DictMetaData) {
			DictMetaData dictMetaData = (DictMetaData)result;

			if ((companyId != dictMetaData.getCompanyId()) ||
					(dictDataId != dictMetaData.getDictDataId()) ||
					!Validator.equals(attributeName,
						dictMetaData.getAttributeName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_DICTMETADATA_WHERE);

			query.append(_FINDER_COLUMN_C_DI_N_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_DI_N_DICTDATAID_2);

			boolean bindAttributeName = false;

			if (attributeName == null) {
				query.append(_FINDER_COLUMN_C_DI_N_ATTRIBUTENAME_1);
			}
			else if (attributeName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DI_N_ATTRIBUTENAME_3);
			}
			else {
				bindAttributeName = true;

				query.append(_FINDER_COLUMN_C_DI_N_ATTRIBUTENAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(dictDataId);

				if (bindAttributeName) {
					qPos.add(attributeName);
				}

				List<DictMetaData> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_DI_N,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DictMetaDataPersistenceImpl.fetchByC_DI_N(long, long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DictMetaData dictMetaData = list.get(0);

					result = dictMetaData;

					cacheResult(dictMetaData);

					if ((dictMetaData.getCompanyId() != companyId) ||
							(dictMetaData.getDictDataId() != dictDataId) ||
							(dictMetaData.getAttributeName() == null) ||
							!dictMetaData.getAttributeName()
											 .equals(attributeName)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_DI_N,
							finderArgs, dictMetaData);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_DI_N,
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
			return (DictMetaData)result;
		}
	}

	/**
	 * Removes the dictionary meta data where companyId = &#63; and dictDataId = &#63; and attributeName = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @param attributeName the attribute name
	 * @return the dictionary meta data that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData removeByC_DI_N(long companyId, long dictDataId,
		String attributeName)
		throws NoSuchDictMetaDataException, SystemException {
		DictMetaData dictMetaData = findByC_DI_N(companyId, dictDataId,
				attributeName);

		return remove(dictMetaData);
	}

	/**
	 * Returns the number of dictionary meta datas where companyId = &#63; and dictDataId = &#63; and attributeName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dictDataId the dict data ID
	 * @param attributeName the attribute name
	 * @return the number of matching dictionary meta datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_DI_N(long companyId, long dictDataId,
		String attributeName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_DI_N;

		Object[] finderArgs = new Object[] { companyId, dictDataId, attributeName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DICTMETADATA_WHERE);

			query.append(_FINDER_COLUMN_C_DI_N_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_DI_N_DICTDATAID_2);

			boolean bindAttributeName = false;

			if (attributeName == null) {
				query.append(_FINDER_COLUMN_C_DI_N_ATTRIBUTENAME_1);
			}
			else if (attributeName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DI_N_ATTRIBUTENAME_3);
			}
			else {
				bindAttributeName = true;

				query.append(_FINDER_COLUMN_C_DI_N_ATTRIBUTENAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(dictDataId);

				if (bindAttributeName) {
					qPos.add(attributeName);
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

	private static final String _FINDER_COLUMN_C_DI_N_COMPANYID_2 = "dictMetaData.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_DI_N_DICTDATAID_2 = "dictMetaData.dictDataId = ? AND ";
	private static final String _FINDER_COLUMN_C_DI_N_ATTRIBUTENAME_1 = "dictMetaData.attributeName IS NULL";
	private static final String _FINDER_COLUMN_C_DI_N_ATTRIBUTENAME_2 = "dictMetaData.attributeName = ?";
	private static final String _FINDER_COLUMN_C_DI_N_ATTRIBUTENAME_3 = "(dictMetaData.attributeName IS NULL OR dictMetaData.attributeName = '')";

	public DictMetaDataPersistenceImpl() {
		setModelClass(DictMetaData.class);
	}

	/**
	 * Caches the dictionary meta data in the entity cache if it is enabled.
	 *
	 * @param dictMetaData the dictionary meta data
	 */
	@Override
	public void cacheResult(DictMetaData dictMetaData) {
		EntityCacheUtil.putResult(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DictMetaDataImpl.class, dictMetaData.getPrimaryKey(), dictMetaData);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_DI_N,
			new Object[] {
				dictMetaData.getCompanyId(), dictMetaData.getDictDataId(),
				dictMetaData.getAttributeName()
			}, dictMetaData);

		dictMetaData.resetOriginalValues();
	}

	/**
	 * Caches the dictionary meta datas in the entity cache if it is enabled.
	 *
	 * @param dictMetaDatas the dictionary meta datas
	 */
	@Override
	public void cacheResult(List<DictMetaData> dictMetaDatas) {
		for (DictMetaData dictMetaData : dictMetaDatas) {
			if (EntityCacheUtil.getResult(
						DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
						DictMetaDataImpl.class, dictMetaData.getPrimaryKey()) == null) {
				cacheResult(dictMetaData);
			}
			else {
				dictMetaData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dictionary meta datas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DictMetaDataImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DictMetaDataImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dictionary meta data.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DictMetaData dictMetaData) {
		EntityCacheUtil.removeResult(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DictMetaDataImpl.class, dictMetaData.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dictMetaData);
	}

	@Override
	public void clearCache(List<DictMetaData> dictMetaDatas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DictMetaData dictMetaData : dictMetaDatas) {
			EntityCacheUtil.removeResult(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
				DictMetaDataImpl.class, dictMetaData.getPrimaryKey());

			clearUniqueFindersCache(dictMetaData);
		}
	}

	protected void cacheUniqueFindersCache(DictMetaData dictMetaData) {
		if (dictMetaData.isNew()) {
			Object[] args = new Object[] {
					dictMetaData.getCompanyId(), dictMetaData.getDictDataId(),
					dictMetaData.getAttributeName()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_DI_N, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_DI_N, args,
				dictMetaData);
		}
		else {
			DictMetaDataModelImpl dictMetaDataModelImpl = (DictMetaDataModelImpl)dictMetaData;

			if ((dictMetaDataModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_DI_N.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictMetaData.getCompanyId(),
						dictMetaData.getDictDataId(),
						dictMetaData.getAttributeName()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_DI_N, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_DI_N, args,
					dictMetaData);
			}
		}
	}

	protected void clearUniqueFindersCache(DictMetaData dictMetaData) {
		DictMetaDataModelImpl dictMetaDataModelImpl = (DictMetaDataModelImpl)dictMetaData;

		Object[] args = new Object[] {
				dictMetaData.getCompanyId(), dictMetaData.getDictDataId(),
				dictMetaData.getAttributeName()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DI_N, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_DI_N, args);

		if ((dictMetaDataModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_DI_N.getColumnBitmask()) != 0) {
			args = new Object[] {
					dictMetaDataModelImpl.getOriginalCompanyId(),
					dictMetaDataModelImpl.getOriginalDictDataId(),
					dictMetaDataModelImpl.getOriginalAttributeName()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DI_N, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_DI_N, args);
		}
	}

	/**
	 * Creates a new dictionary meta data with the primary key. Does not add the dictionary meta data to the database.
	 *
	 * @param dictMetaDataId the primary key for the new dictionary meta data
	 * @return the new dictionary meta data
	 */
	@Override
	public DictMetaData create(long dictMetaDataId) {
		DictMetaData dictMetaData = new DictMetaDataImpl();

		dictMetaData.setNew(true);
		dictMetaData.setPrimaryKey(dictMetaDataId);

		return dictMetaData;
	}

	/**
	 * Removes the dictionary meta data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dictMetaDataId the primary key of the dictionary meta data
	 * @return the dictionary meta data that was removed
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData remove(long dictMetaDataId)
		throws NoSuchDictMetaDataException, SystemException {
		return remove((Serializable)dictMetaDataId);
	}

	/**
	 * Removes the dictionary meta data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dictionary meta data
	 * @return the dictionary meta data that was removed
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData remove(Serializable primaryKey)
		throws NoSuchDictMetaDataException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DictMetaData dictMetaData = (DictMetaData)session.get(DictMetaDataImpl.class,
					primaryKey);

			if (dictMetaData == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDictMetaDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dictMetaData);
		}
		catch (NoSuchDictMetaDataException nsee) {
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
	protected DictMetaData removeImpl(DictMetaData dictMetaData)
		throws SystemException {
		dictMetaData = toUnwrappedModel(dictMetaData);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dictMetaData)) {
				dictMetaData = (DictMetaData)session.get(DictMetaDataImpl.class,
						dictMetaData.getPrimaryKeyObj());
			}

			if (dictMetaData != null) {
				session.delete(dictMetaData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dictMetaData != null) {
			clearCache(dictMetaData);
		}

		return dictMetaData;
	}

	@Override
	public DictMetaData updateImpl(
		org.oep.core.datamgt.dictionary.model.DictMetaData dictMetaData)
		throws SystemException {
		dictMetaData = toUnwrappedModel(dictMetaData);

		boolean isNew = dictMetaData.isNew();

		DictMetaDataModelImpl dictMetaDataModelImpl = (DictMetaDataModelImpl)dictMetaData;

		Session session = null;

		try {
			session = openSession();

			if (dictMetaData.isNew()) {
				session.save(dictMetaData);

				dictMetaData.setNew(false);
			}
			else {
				session.merge(dictMetaData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DictMetaDataModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dictMetaDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictMetaDataModelImpl.getOriginalCompanyId(),
						dictMetaDataModelImpl.getOriginalDictDataId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DI, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DI,
					args);

				args = new Object[] {
						dictMetaDataModelImpl.getCompanyId(),
						dictMetaDataModelImpl.getDictDataId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DI, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DI,
					args);
			}
		}

		EntityCacheUtil.putResult(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DictMetaDataImpl.class, dictMetaData.getPrimaryKey(), dictMetaData);

		clearUniqueFindersCache(dictMetaData);
		cacheUniqueFindersCache(dictMetaData);

		return dictMetaData;
	}

	protected DictMetaData toUnwrappedModel(DictMetaData dictMetaData) {
		if (dictMetaData instanceof DictMetaDataImpl) {
			return dictMetaData;
		}

		DictMetaDataImpl dictMetaDataImpl = new DictMetaDataImpl();

		dictMetaDataImpl.setNew(dictMetaData.isNew());
		dictMetaDataImpl.setPrimaryKey(dictMetaData.getPrimaryKey());

		dictMetaDataImpl.setDictMetaDataId(dictMetaData.getDictMetaDataId());
		dictMetaDataImpl.setCompanyId(dictMetaData.getCompanyId());
		dictMetaDataImpl.setCreateDate(dictMetaData.getCreateDate());
		dictMetaDataImpl.setModifiedDate(dictMetaData.getModifiedDate());
		dictMetaDataImpl.setDictDataId(dictMetaData.getDictDataId());
		dictMetaDataImpl.setAttributeName(dictMetaData.getAttributeName());
		dictMetaDataImpl.setAttributeValue(dictMetaData.getAttributeValue());

		return dictMetaDataImpl;
	}

	/**
	 * Returns the dictionary meta data with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dictionary meta data
	 * @return the dictionary meta data
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDictMetaDataException, SystemException {
		DictMetaData dictMetaData = fetchByPrimaryKey(primaryKey);

		if (dictMetaData == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDictMetaDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dictMetaData;
	}

	/**
	 * Returns the dictionary meta data with the primary key or throws a {@link org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException} if it could not be found.
	 *
	 * @param dictMetaDataId the primary key of the dictionary meta data
	 * @return the dictionary meta data
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData findByPrimaryKey(long dictMetaDataId)
		throws NoSuchDictMetaDataException, SystemException {
		return findByPrimaryKey((Serializable)dictMetaDataId);
	}

	/**
	 * Returns the dictionary meta data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dictionary meta data
	 * @return the dictionary meta data, or <code>null</code> if a dictionary meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DictMetaData dictMetaData = (DictMetaData)EntityCacheUtil.getResult(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
				DictMetaDataImpl.class, primaryKey);

		if (dictMetaData == _nullDictMetaData) {
			return null;
		}

		if (dictMetaData == null) {
			Session session = null;

			try {
				session = openSession();

				dictMetaData = (DictMetaData)session.get(DictMetaDataImpl.class,
						primaryKey);

				if (dictMetaData != null) {
					cacheResult(dictMetaData);
				}
				else {
					EntityCacheUtil.putResult(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
						DictMetaDataImpl.class, primaryKey, _nullDictMetaData);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DictMetaDataModelImpl.ENTITY_CACHE_ENABLED,
					DictMetaDataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dictMetaData;
	}

	/**
	 * Returns the dictionary meta data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dictMetaDataId the primary key of the dictionary meta data
	 * @return the dictionary meta data, or <code>null</code> if a dictionary meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictMetaData fetchByPrimaryKey(long dictMetaDataId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dictMetaDataId);
	}

	/**
	 * Returns all the dictionary meta datas.
	 *
	 * @return the dictionary meta datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictMetaData> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary meta datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dictionary meta datas
	 * @param end the upper bound of the range of dictionary meta datas (not inclusive)
	 * @return the range of dictionary meta datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictMetaData> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary meta datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dictionary meta datas
	 * @param end the upper bound of the range of dictionary meta datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dictionary meta datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictMetaData> findAll(int start, int end,
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

		List<DictMetaData> list = (List<DictMetaData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DICTMETADATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DICTMETADATA;

				if (pagination) {
					sql = sql.concat(DictMetaDataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DictMetaData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictMetaData>(list);
				}
				else {
					list = (List<DictMetaData>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dictionary meta datas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DictMetaData dictMetaData : findAll()) {
			remove(dictMetaData);
		}
	}

	/**
	 * Returns the number of dictionary meta datas.
	 *
	 * @return the number of dictionary meta datas
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

				Query q = session.createQuery(_SQL_COUNT_DICTMETADATA);

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
	 * Initializes the dictionary meta data persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.datamgt.dictionary.model.DictMetaData")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DictMetaData>> listenersList = new ArrayList<ModelListener<DictMetaData>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DictMetaData>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DictMetaDataImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DICTMETADATA = "SELECT dictMetaData FROM DictMetaData dictMetaData";
	private static final String _SQL_SELECT_DICTMETADATA_WHERE = "SELECT dictMetaData FROM DictMetaData dictMetaData WHERE ";
	private static final String _SQL_COUNT_DICTMETADATA = "SELECT COUNT(dictMetaData) FROM DictMetaData dictMetaData";
	private static final String _SQL_COUNT_DICTMETADATA_WHERE = "SELECT COUNT(dictMetaData) FROM DictMetaData dictMetaData WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dictMetaData.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DictMetaData exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DictMetaData exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DictMetaDataPersistenceImpl.class);
	private static DictMetaData _nullDictMetaData = new DictMetaDataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DictMetaData> toCacheModel() {
				return _nullDictMetaDataCacheModel;
			}
		};

	private static CacheModel<DictMetaData> _nullDictMetaDataCacheModel = new CacheModel<DictMetaData>() {
			@Override
			public DictMetaData toEntityModel() {
				return _nullDictMetaData;
			}
		};
}