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

import org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;
import org.oep.core.datamgt.dictionary.model.DictAttribute;
import org.oep.core.datamgt.dictionary.model.impl.DictAttributeImpl;
import org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dictionary attribute service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TrungDK
 * @see DictAttributePersistence
 * @see DictAttributeUtil
 * @generated
 */
public class DictAttributePersistenceImpl extends BasePersistenceImpl<DictAttribute>
	implements DictAttributePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DictAttributeUtil} to access the dictionary attribute persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DictAttributeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED,
			DictAttributeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED,
			DictAttributeImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED,
			DictAttributeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED,
			DictAttributeImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByC", new String[] { Long.class.getName() },
			DictAttributeModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dictionary attributes where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findByC(long companyId)
		throws SystemException {
		return findByC(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary attributes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dictionary attributes
	 * @param end the upper bound of the range of dictionary attributes (not inclusive)
	 * @return the range of matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findByC(long companyId, int start, int end)
		throws SystemException {
		return findByC(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary attributes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dictionary attributes
	 * @param end the upper bound of the range of dictionary attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findByC(long companyId, int start, int end,
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

		List<DictAttribute> list = (List<DictAttribute>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictAttribute dictAttribute : list) {
				if ((companyId != dictAttribute.getCompanyId())) {
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

			query.append(_SQL_SELECT_DICTATTRIBUTE_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictAttributeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<DictAttribute>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictAttribute>(list);
				}
				else {
					list = (List<DictAttribute>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary attribute in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute findByC_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = fetchByC_First(companyId,
				orderByComparator);

		if (dictAttribute != null) {
			return dictAttribute;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictAttributeException(msg.toString());
	}

	/**
	 * Returns the first dictionary attribute in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute fetchByC_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictAttribute> list = findByC(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary attribute in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute findByC_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = fetchByC_Last(companyId, orderByComparator);

		if (dictAttribute != null) {
			return dictAttribute;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictAttributeException(msg.toString());
	}

	/**
	 * Returns the last dictionary attribute in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute fetchByC_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC(companyId);

		if (count == 0) {
			return null;
		}

		List<DictAttribute> list = findByC(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where companyId = &#63;.
	 *
	 * @param dictAttributeId the primary key of the current dictionary attribute
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute[] findByC_PrevAndNext(long dictAttributeId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = findByPrimaryKey(dictAttributeId);

		Session session = null;

		try {
			session = openSession();

			DictAttribute[] array = new DictAttributeImpl[3];

			array[0] = getByC_PrevAndNext(session, dictAttribute, companyId,
					orderByComparator, true);

			array[1] = dictAttribute;

			array[2] = getByC_PrevAndNext(session, dictAttribute, companyId,
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

	protected DictAttribute getByC_PrevAndNext(Session session,
		DictAttribute dictAttribute, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTATTRIBUTE_WHERE);

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
			query.append(DictAttributeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictAttribute);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictAttribute> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary attributes where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC(long companyId) throws SystemException {
		for (DictAttribute dictAttribute : findByC(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictAttribute);
		}
	}

	/**
	 * Returns the number of dictionary attributes where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching dictionary attributes
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

			query.append(_SQL_COUNT_DICTATTRIBUTE_WHERE);

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

	private static final String _FINDER_COLUMN_C_COMPANYID_2 = "dictAttribute.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_CN = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED,
			DictAttributeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_CN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED,
			DictAttributeImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByC_CN",
			new String[] { Long.class.getName(), String.class.getName() },
			DictAttributeModelImpl.COMPANYID_COLUMN_BITMASK |
			DictAttributeModelImpl.COLLECTIONNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_CN = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_CN",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dictionary attributes where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @return the matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findByC_CN(long companyId, String collectionName)
		throws SystemException {
		return findByC_CN(companyId, collectionName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary attributes where companyId = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary attributes
	 * @param end the upper bound of the range of dictionary attributes (not inclusive)
	 * @return the range of matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findByC_CN(long companyId,
		String collectionName, int start, int end) throws SystemException {
		return findByC_CN(companyId, collectionName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary attributes where companyId = &#63; and collectionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param start the lower bound of the range of dictionary attributes
	 * @param end the upper bound of the range of dictionary attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findByC_CN(long companyId,
		String collectionName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<DictAttribute> list = (List<DictAttribute>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictAttribute dictAttribute : list) {
				if ((companyId != dictAttribute.getCompanyId()) ||
						!Validator.equals(collectionName,
							dictAttribute.getCollectionName())) {
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

			query.append(_SQL_SELECT_DICTATTRIBUTE_WHERE);

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
				query.append(DictAttributeModelImpl.ORDER_BY_JPQL);
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
					list = (List<DictAttribute>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictAttribute>(list);
				}
				else {
					list = (List<DictAttribute>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute findByC_CN_First(long companyId,
		String collectionName, OrderByComparator orderByComparator)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = fetchByC_CN_First(companyId,
				collectionName, orderByComparator);

		if (dictAttribute != null) {
			return dictAttribute;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictAttributeException(msg.toString());
	}

	/**
	 * Returns the first dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute fetchByC_CN_First(long companyId,
		String collectionName, OrderByComparator orderByComparator)
		throws SystemException {
		List<DictAttribute> list = findByC_CN(companyId, collectionName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute findByC_CN_Last(long companyId, String collectionName,
		OrderByComparator orderByComparator)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = fetchByC_CN_Last(companyId,
				collectionName, orderByComparator);

		if (dictAttribute != null) {
			return dictAttribute;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictAttributeException(msg.toString());
	}

	/**
	 * Returns the last dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute fetchByC_CN_Last(long companyId,
		String collectionName, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_CN(companyId, collectionName);

		if (count == 0) {
			return null;
		}

		List<DictAttribute> list = findByC_CN(companyId, collectionName,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param dictAttributeId the primary key of the current dictionary attribute
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute[] findByC_CN_PrevAndNext(long dictAttributeId,
		long companyId, String collectionName,
		OrderByComparator orderByComparator)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = findByPrimaryKey(dictAttributeId);

		Session session = null;

		try {
			session = openSession();

			DictAttribute[] array = new DictAttributeImpl[3];

			array[0] = getByC_CN_PrevAndNext(session, dictAttribute, companyId,
					collectionName, orderByComparator, true);

			array[1] = dictAttribute;

			array[2] = getByC_CN_PrevAndNext(session, dictAttribute, companyId,
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

	protected DictAttribute getByC_CN_PrevAndNext(Session session,
		DictAttribute dictAttribute, long companyId, String collectionName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTATTRIBUTE_WHERE);

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
			query.append(DictAttributeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dictAttribute);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictAttribute> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary attributes where companyId = &#63; and collectionName = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_CN(long companyId, String collectionName)
		throws SystemException {
		for (DictAttribute dictAttribute : findByC_CN(companyId,
				collectionName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictAttribute);
		}
	}

	/**
	 * Returns the number of dictionary attributes where companyId = &#63; and collectionName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @return the number of matching dictionary attributes
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

			query.append(_SQL_COUNT_DICTATTRIBUTE_WHERE);

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

	private static final String _FINDER_COLUMN_C_CN_COMPANYID_2 = "dictAttribute.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_CN_COLLECTIONNAME_1 = "dictAttribute.collectionName IS NULL";
	private static final String _FINDER_COLUMN_C_CN_COLLECTIONNAME_2 = "dictAttribute.collectionName = ?";
	private static final String _FINDER_COLUMN_C_CN_COLLECTIONNAME_3 = "(dictAttribute.collectionName IS NULL OR dictAttribute.collectionName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_CN_DT = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED,
			DictAttributeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_CN_DT",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN_DT =
		new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED,
			DictAttributeImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByC_CN_DT",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			DictAttributeModelImpl.COMPANYID_COLUMN_BITMASK |
			DictAttributeModelImpl.COLLECTIONNAME_COLUMN_BITMASK |
			DictAttributeModelImpl.DATATYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_CN_DT = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_CN_DT",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataType the data type
	 * @return the matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findByC_CN_DT(long companyId,
		String collectionName, String dataType) throws SystemException {
		return findByC_CN_DT(companyId, collectionName, dataType,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataType the data type
	 * @param start the lower bound of the range of dictionary attributes
	 * @param end the upper bound of the range of dictionary attributes (not inclusive)
	 * @return the range of matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findByC_CN_DT(long companyId,
		String collectionName, String dataType, int start, int end)
		throws SystemException {
		return findByC_CN_DT(companyId, collectionName, dataType, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataType the data type
	 * @param start the lower bound of the range of dictionary attributes
	 * @param end the upper bound of the range of dictionary attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findByC_CN_DT(long companyId,
		String collectionName, String dataType, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN_DT;
			finderArgs = new Object[] { companyId, collectionName, dataType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_CN_DT;
			finderArgs = new Object[] {
					companyId, collectionName, dataType,
					
					start, end, orderByComparator
				};
		}

		List<DictAttribute> list = (List<DictAttribute>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictAttribute dictAttribute : list) {
				if ((companyId != dictAttribute.getCompanyId()) ||
						!Validator.equals(collectionName,
							dictAttribute.getCollectionName()) ||
						!Validator.equals(dataType, dictAttribute.getDataType())) {
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

			query.append(_SQL_SELECT_DICTATTRIBUTE_WHERE);

			query.append(_FINDER_COLUMN_C_CN_DT_COMPANYID_2);

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_C_CN_DT_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_CN_DT_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_C_CN_DT_COLLECTIONNAME_2);
			}

			boolean bindDataType = false;

			if (dataType == null) {
				query.append(_FINDER_COLUMN_C_CN_DT_DATATYPE_1);
			}
			else if (dataType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_CN_DT_DATATYPE_3);
			}
			else {
				bindDataType = true;

				query.append(_FINDER_COLUMN_C_CN_DT_DATATYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictAttributeModelImpl.ORDER_BY_JPQL);
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

				if (bindDataType) {
					qPos.add(dataType);
				}

				if (!pagination) {
					list = (List<DictAttribute>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictAttribute>(list);
				}
				else {
					list = (List<DictAttribute>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataType the data type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute findByC_CN_DT_First(long companyId,
		String collectionName, String dataType,
		OrderByComparator orderByComparator)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = fetchByC_CN_DT_First(companyId,
				collectionName, dataType, orderByComparator);

		if (dictAttribute != null) {
			return dictAttribute;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(", dataType=");
		msg.append(dataType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictAttributeException(msg.toString());
	}

	/**
	 * Returns the first dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataType the data type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute fetchByC_CN_DT_First(long companyId,
		String collectionName, String dataType,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictAttribute> list = findByC_CN_DT(companyId, collectionName,
				dataType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataType the data type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute findByC_CN_DT_Last(long companyId,
		String collectionName, String dataType,
		OrderByComparator orderByComparator)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = fetchByC_CN_DT_Last(companyId,
				collectionName, dataType, orderByComparator);

		if (dictAttribute != null) {
			return dictAttribute;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", collectionName=");
		msg.append(collectionName);

		msg.append(", dataType=");
		msg.append(dataType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictAttributeException(msg.toString());
	}

	/**
	 * Returns the last dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataType the data type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute fetchByC_CN_DT_Last(long companyId,
		String collectionName, String dataType,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_CN_DT(companyId, collectionName, dataType);

		if (count == 0) {
			return null;
		}

		List<DictAttribute> list = findByC_CN_DT(companyId, collectionName,
				dataType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	 *
	 * @param dictAttributeId the primary key of the current dictionary attribute
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataType the data type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute[] findByC_CN_DT_PrevAndNext(long dictAttributeId,
		long companyId, String collectionName, String dataType,
		OrderByComparator orderByComparator)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = findByPrimaryKey(dictAttributeId);

		Session session = null;

		try {
			session = openSession();

			DictAttribute[] array = new DictAttributeImpl[3];

			array[0] = getByC_CN_DT_PrevAndNext(session, dictAttribute,
					companyId, collectionName, dataType, orderByComparator, true);

			array[1] = dictAttribute;

			array[2] = getByC_CN_DT_PrevAndNext(session, dictAttribute,
					companyId, collectionName, dataType, orderByComparator,
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

	protected DictAttribute getByC_CN_DT_PrevAndNext(Session session,
		DictAttribute dictAttribute, long companyId, String collectionName,
		String dataType, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTATTRIBUTE_WHERE);

		query.append(_FINDER_COLUMN_C_CN_DT_COMPANYID_2);

		boolean bindCollectionName = false;

		if (collectionName == null) {
			query.append(_FINDER_COLUMN_C_CN_DT_COLLECTIONNAME_1);
		}
		else if (collectionName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_CN_DT_COLLECTIONNAME_3);
		}
		else {
			bindCollectionName = true;

			query.append(_FINDER_COLUMN_C_CN_DT_COLLECTIONNAME_2);
		}

		boolean bindDataType = false;

		if (dataType == null) {
			query.append(_FINDER_COLUMN_C_CN_DT_DATATYPE_1);
		}
		else if (dataType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_CN_DT_DATATYPE_3);
		}
		else {
			bindDataType = true;

			query.append(_FINDER_COLUMN_C_CN_DT_DATATYPE_2);
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
			query.append(DictAttributeModelImpl.ORDER_BY_JPQL);
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

		if (bindDataType) {
			qPos.add(dataType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictAttribute);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictAttribute> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataType the data type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_CN_DT(long companyId, String collectionName,
		String dataType) throws SystemException {
		for (DictAttribute dictAttribute : findByC_CN_DT(companyId,
				collectionName, dataType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(dictAttribute);
		}
	}

	/**
	 * Returns the number of dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param collectionName the collection name
	 * @param dataType the data type
	 * @return the number of matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_CN_DT(long companyId, String collectionName,
		String dataType) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_CN_DT;

		Object[] finderArgs = new Object[] { companyId, collectionName, dataType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DICTATTRIBUTE_WHERE);

			query.append(_FINDER_COLUMN_C_CN_DT_COMPANYID_2);

			boolean bindCollectionName = false;

			if (collectionName == null) {
				query.append(_FINDER_COLUMN_C_CN_DT_COLLECTIONNAME_1);
			}
			else if (collectionName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_CN_DT_COLLECTIONNAME_3);
			}
			else {
				bindCollectionName = true;

				query.append(_FINDER_COLUMN_C_CN_DT_COLLECTIONNAME_2);
			}

			boolean bindDataType = false;

			if (dataType == null) {
				query.append(_FINDER_COLUMN_C_CN_DT_DATATYPE_1);
			}
			else if (dataType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_CN_DT_DATATYPE_3);
			}
			else {
				bindDataType = true;

				query.append(_FINDER_COLUMN_C_CN_DT_DATATYPE_2);
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

				if (bindDataType) {
					qPos.add(dataType);
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

	private static final String _FINDER_COLUMN_C_CN_DT_COMPANYID_2 = "dictAttribute.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_CN_DT_COLLECTIONNAME_1 = "dictAttribute.collectionName IS NULL AND ";
	private static final String _FINDER_COLUMN_C_CN_DT_COLLECTIONNAME_2 = "dictAttribute.collectionName = ? AND ";
	private static final String _FINDER_COLUMN_C_CN_DT_COLLECTIONNAME_3 = "(dictAttribute.collectionName IS NULL OR dictAttribute.collectionName = '') AND ";
	private static final String _FINDER_COLUMN_C_CN_DT_DATATYPE_1 = "dictAttribute.dataType IS NULL";
	private static final String _FINDER_COLUMN_C_CN_DT_DATATYPE_2 = "dictAttribute.dataType = ?";
	private static final String _FINDER_COLUMN_C_CN_DT_DATATYPE_3 = "(dictAttribute.dataType IS NULL OR dictAttribute.dataType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DT = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED,
			DictAttributeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_DT",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DT = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED,
			DictAttributeImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByC_DT",
			new String[] { Long.class.getName(), String.class.getName() },
			DictAttributeModelImpl.COMPANYID_COLUMN_BITMASK |
			DictAttributeModelImpl.DATATYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_DT = new FinderPath(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_DT",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dictionary attributes where companyId = &#63; and dataType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataType the data type
	 * @return the matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findByC_DT(long companyId, String dataType)
		throws SystemException {
		return findByC_DT(companyId, dataType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary attributes where companyId = &#63; and dataType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param dataType the data type
	 * @param start the lower bound of the range of dictionary attributes
	 * @param end the upper bound of the range of dictionary attributes (not inclusive)
	 * @return the range of matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findByC_DT(long companyId, String dataType,
		int start, int end) throws SystemException {
		return findByC_DT(companyId, dataType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary attributes where companyId = &#63; and dataType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param dataType the data type
	 * @param start the lower bound of the range of dictionary attributes
	 * @param end the upper bound of the range of dictionary attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findByC_DT(long companyId, String dataType,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DT;
			finderArgs = new Object[] { companyId, dataType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_DT;
			finderArgs = new Object[] {
					companyId, dataType,
					
					start, end, orderByComparator
				};
		}

		List<DictAttribute> list = (List<DictAttribute>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictAttribute dictAttribute : list) {
				if ((companyId != dictAttribute.getCompanyId()) ||
						!Validator.equals(dataType, dictAttribute.getDataType())) {
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

			query.append(_SQL_SELECT_DICTATTRIBUTE_WHERE);

			query.append(_FINDER_COLUMN_C_DT_COMPANYID_2);

			boolean bindDataType = false;

			if (dataType == null) {
				query.append(_FINDER_COLUMN_C_DT_DATATYPE_1);
			}
			else if (dataType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DT_DATATYPE_3);
			}
			else {
				bindDataType = true;

				query.append(_FINDER_COLUMN_C_DT_DATATYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictAttributeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindDataType) {
					qPos.add(dataType);
				}

				if (!pagination) {
					list = (List<DictAttribute>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictAttribute>(list);
				}
				else {
					list = (List<DictAttribute>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataType the data type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute findByC_DT_First(long companyId, String dataType,
		OrderByComparator orderByComparator)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = fetchByC_DT_First(companyId, dataType,
				orderByComparator);

		if (dictAttribute != null) {
			return dictAttribute;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", dataType=");
		msg.append(dataType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictAttributeException(msg.toString());
	}

	/**
	 * Returns the first dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataType the data type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute fetchByC_DT_First(long companyId, String dataType,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictAttribute> list = findByC_DT(companyId, dataType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataType the data type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute findByC_DT_Last(long companyId, String dataType,
		OrderByComparator orderByComparator)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = fetchByC_DT_Last(companyId, dataType,
				orderByComparator);

		if (dictAttribute != null) {
			return dictAttribute;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", dataType=");
		msg.append(dataType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictAttributeException(msg.toString());
	}

	/**
	 * Returns the last dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataType the data type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute fetchByC_DT_Last(long companyId, String dataType,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_DT(companyId, dataType);

		if (count == 0) {
			return null;
		}

		List<DictAttribute> list = findByC_DT(companyId, dataType, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	 *
	 * @param dictAttributeId the primary key of the current dictionary attribute
	 * @param companyId the company ID
	 * @param dataType the data type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute[] findByC_DT_PrevAndNext(long dictAttributeId,
		long companyId, String dataType, OrderByComparator orderByComparator)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = findByPrimaryKey(dictAttributeId);

		Session session = null;

		try {
			session = openSession();

			DictAttribute[] array = new DictAttributeImpl[3];

			array[0] = getByC_DT_PrevAndNext(session, dictAttribute, companyId,
					dataType, orderByComparator, true);

			array[1] = dictAttribute;

			array[2] = getByC_DT_PrevAndNext(session, dictAttribute, companyId,
					dataType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictAttribute getByC_DT_PrevAndNext(Session session,
		DictAttribute dictAttribute, long companyId, String dataType,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTATTRIBUTE_WHERE);

		query.append(_FINDER_COLUMN_C_DT_COMPANYID_2);

		boolean bindDataType = false;

		if (dataType == null) {
			query.append(_FINDER_COLUMN_C_DT_DATATYPE_1);
		}
		else if (dataType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_DT_DATATYPE_3);
		}
		else {
			bindDataType = true;

			query.append(_FINDER_COLUMN_C_DT_DATATYPE_2);
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
			query.append(DictAttributeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindDataType) {
			qPos.add(dataType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictAttribute);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictAttribute> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary attributes where companyId = &#63; and dataType = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param dataType the data type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_DT(long companyId, String dataType)
		throws SystemException {
		for (DictAttribute dictAttribute : findByC_DT(companyId, dataType,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictAttribute);
		}
	}

	/**
	 * Returns the number of dictionary attributes where companyId = &#63; and dataType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param dataType the data type
	 * @return the number of matching dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_DT(long companyId, String dataType)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_DT;

		Object[] finderArgs = new Object[] { companyId, dataType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTATTRIBUTE_WHERE);

			query.append(_FINDER_COLUMN_C_DT_COMPANYID_2);

			boolean bindDataType = false;

			if (dataType == null) {
				query.append(_FINDER_COLUMN_C_DT_DATATYPE_1);
			}
			else if (dataType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_DT_DATATYPE_3);
			}
			else {
				bindDataType = true;

				query.append(_FINDER_COLUMN_C_DT_DATATYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindDataType) {
					qPos.add(dataType);
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

	private static final String _FINDER_COLUMN_C_DT_COMPANYID_2 = "dictAttribute.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_DT_DATATYPE_1 = "dictAttribute.dataType IS NULL";
	private static final String _FINDER_COLUMN_C_DT_DATATYPE_2 = "dictAttribute.dataType = ?";
	private static final String _FINDER_COLUMN_C_DT_DATATYPE_3 = "(dictAttribute.dataType IS NULL OR dictAttribute.dataType = '')";

	public DictAttributePersistenceImpl() {
		setModelClass(DictAttribute.class);
	}

	/**
	 * Caches the dictionary attribute in the entity cache if it is enabled.
	 *
	 * @param dictAttribute the dictionary attribute
	 */
	@Override
	public void cacheResult(DictAttribute dictAttribute) {
		EntityCacheUtil.putResult(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeImpl.class, dictAttribute.getPrimaryKey(),
			dictAttribute);

		dictAttribute.resetOriginalValues();
	}

	/**
	 * Caches the dictionary attributes in the entity cache if it is enabled.
	 *
	 * @param dictAttributes the dictionary attributes
	 */
	@Override
	public void cacheResult(List<DictAttribute> dictAttributes) {
		for (DictAttribute dictAttribute : dictAttributes) {
			if (EntityCacheUtil.getResult(
						DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
						DictAttributeImpl.class, dictAttribute.getPrimaryKey()) == null) {
				cacheResult(dictAttribute);
			}
			else {
				dictAttribute.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dictionary attributes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DictAttributeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DictAttributeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dictionary attribute.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DictAttribute dictAttribute) {
		EntityCacheUtil.removeResult(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeImpl.class, dictAttribute.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DictAttribute> dictAttributes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DictAttribute dictAttribute : dictAttributes) {
			EntityCacheUtil.removeResult(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
				DictAttributeImpl.class, dictAttribute.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dictionary attribute with the primary key. Does not add the dictionary attribute to the database.
	 *
	 * @param dictAttributeId the primary key for the new dictionary attribute
	 * @return the new dictionary attribute
	 */
	@Override
	public DictAttribute create(long dictAttributeId) {
		DictAttribute dictAttribute = new DictAttributeImpl();

		dictAttribute.setNew(true);
		dictAttribute.setPrimaryKey(dictAttributeId);

		return dictAttribute;
	}

	/**
	 * Removes the dictionary attribute with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dictAttributeId the primary key of the dictionary attribute
	 * @return the dictionary attribute that was removed
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute remove(long dictAttributeId)
		throws NoSuchDictAttributeException, SystemException {
		return remove((Serializable)dictAttributeId);
	}

	/**
	 * Removes the dictionary attribute with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dictionary attribute
	 * @return the dictionary attribute that was removed
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute remove(Serializable primaryKey)
		throws NoSuchDictAttributeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DictAttribute dictAttribute = (DictAttribute)session.get(DictAttributeImpl.class,
					primaryKey);

			if (dictAttribute == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDictAttributeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dictAttribute);
		}
		catch (NoSuchDictAttributeException nsee) {
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
	protected DictAttribute removeImpl(DictAttribute dictAttribute)
		throws SystemException {
		dictAttribute = toUnwrappedModel(dictAttribute);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dictAttribute)) {
				dictAttribute = (DictAttribute)session.get(DictAttributeImpl.class,
						dictAttribute.getPrimaryKeyObj());
			}

			if (dictAttribute != null) {
				session.delete(dictAttribute);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dictAttribute != null) {
			clearCache(dictAttribute);
		}

		return dictAttribute;
	}

	@Override
	public DictAttribute updateImpl(
		org.oep.core.datamgt.dictionary.model.DictAttribute dictAttribute)
		throws SystemException {
		dictAttribute = toUnwrappedModel(dictAttribute);

		boolean isNew = dictAttribute.isNew();

		DictAttributeModelImpl dictAttributeModelImpl = (DictAttributeModelImpl)dictAttribute;

		Session session = null;

		try {
			session = openSession();

			if (dictAttribute.isNew()) {
				session.save(dictAttribute);

				dictAttribute.setNew(false);
			}
			else {
				session.merge(dictAttribute);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DictAttributeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dictAttributeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictAttributeModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);

				args = new Object[] { dictAttributeModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);
			}

			if ((dictAttributeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictAttributeModelImpl.getOriginalCompanyId(),
						dictAttributeModelImpl.getOriginalCollectionName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN,
					args);

				args = new Object[] {
						dictAttributeModelImpl.getCompanyId(),
						dictAttributeModelImpl.getCollectionName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_CN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN,
					args);
			}

			if ((dictAttributeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN_DT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictAttributeModelImpl.getOriginalCompanyId(),
						dictAttributeModelImpl.getOriginalCollectionName(),
						dictAttributeModelImpl.getOriginalDataType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_CN_DT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN_DT,
					args);

				args = new Object[] {
						dictAttributeModelImpl.getCompanyId(),
						dictAttributeModelImpl.getCollectionName(),
						dictAttributeModelImpl.getDataType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_CN_DT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_CN_DT,
					args);
			}

			if ((dictAttributeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictAttributeModelImpl.getOriginalCompanyId(),
						dictAttributeModelImpl.getOriginalDataType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DT,
					args);

				args = new Object[] {
						dictAttributeModelImpl.getCompanyId(),
						dictAttributeModelImpl.getDataType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_DT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_DT,
					args);
			}
		}

		EntityCacheUtil.putResult(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
			DictAttributeImpl.class, dictAttribute.getPrimaryKey(),
			dictAttribute);

		return dictAttribute;
	}

	protected DictAttribute toUnwrappedModel(DictAttribute dictAttribute) {
		if (dictAttribute instanceof DictAttributeImpl) {
			return dictAttribute;
		}

		DictAttributeImpl dictAttributeImpl = new DictAttributeImpl();

		dictAttributeImpl.setNew(dictAttribute.isNew());
		dictAttributeImpl.setPrimaryKey(dictAttribute.getPrimaryKey());

		dictAttributeImpl.setDictAttributeId(dictAttribute.getDictAttributeId());
		dictAttributeImpl.setCompanyId(dictAttribute.getCompanyId());
		dictAttributeImpl.setUserId(dictAttribute.getUserId());
		dictAttributeImpl.setGroupId(dictAttribute.getGroupId());
		dictAttributeImpl.setCreateDate(dictAttribute.getCreateDate());
		dictAttributeImpl.setModifiedDate(dictAttribute.getModifiedDate());
		dictAttributeImpl.setCollectionName(dictAttribute.getCollectionName());
		dictAttributeImpl.setName(dictAttribute.getName());
		dictAttributeImpl.setTitle(dictAttribute.getTitle());
		dictAttributeImpl.setDataType(dictAttribute.getDataType());

		return dictAttributeImpl;
	}

	/**
	 * Returns the dictionary attribute with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dictionary attribute
	 * @return the dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDictAttributeException, SystemException {
		DictAttribute dictAttribute = fetchByPrimaryKey(primaryKey);

		if (dictAttribute == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDictAttributeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dictAttribute;
	}

	/**
	 * Returns the dictionary attribute with the primary key or throws a {@link org.oep.core.datamgt.dictionary.NoSuchDictAttributeException} if it could not be found.
	 *
	 * @param dictAttributeId the primary key of the dictionary attribute
	 * @return the dictionary attribute
	 * @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute findByPrimaryKey(long dictAttributeId)
		throws NoSuchDictAttributeException, SystemException {
		return findByPrimaryKey((Serializable)dictAttributeId);
	}

	/**
	 * Returns the dictionary attribute with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dictionary attribute
	 * @return the dictionary attribute, or <code>null</code> if a dictionary attribute with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DictAttribute dictAttribute = (DictAttribute)EntityCacheUtil.getResult(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
				DictAttributeImpl.class, primaryKey);

		if (dictAttribute == _nullDictAttribute) {
			return null;
		}

		if (dictAttribute == null) {
			Session session = null;

			try {
				session = openSession();

				dictAttribute = (DictAttribute)session.get(DictAttributeImpl.class,
						primaryKey);

				if (dictAttribute != null) {
					cacheResult(dictAttribute);
				}
				else {
					EntityCacheUtil.putResult(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
						DictAttributeImpl.class, primaryKey, _nullDictAttribute);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DictAttributeModelImpl.ENTITY_CACHE_ENABLED,
					DictAttributeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dictAttribute;
	}

	/**
	 * Returns the dictionary attribute with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dictAttributeId the primary key of the dictionary attribute
	 * @return the dictionary attribute, or <code>null</code> if a dictionary attribute with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictAttribute fetchByPrimaryKey(long dictAttributeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dictAttributeId);
	}

	/**
	 * Returns all the dictionary attributes.
	 *
	 * @return the dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary attributes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dictionary attributes
	 * @param end the upper bound of the range of dictionary attributes (not inclusive)
	 * @return the range of dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary attributes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dictionary attributes
	 * @param end the upper bound of the range of dictionary attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dictionary attributes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictAttribute> findAll(int start, int end,
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

		List<DictAttribute> list = (List<DictAttribute>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DICTATTRIBUTE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DICTATTRIBUTE;

				if (pagination) {
					sql = sql.concat(DictAttributeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DictAttribute>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictAttribute>(list);
				}
				else {
					list = (List<DictAttribute>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dictionary attributes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DictAttribute dictAttribute : findAll()) {
			remove(dictAttribute);
		}
	}

	/**
	 * Returns the number of dictionary attributes.
	 *
	 * @return the number of dictionary attributes
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

				Query q = session.createQuery(_SQL_COUNT_DICTATTRIBUTE);

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
	 * Initializes the dictionary attribute persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.datamgt.dictionary.model.DictAttribute")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DictAttribute>> listenersList = new ArrayList<ModelListener<DictAttribute>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DictAttribute>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DictAttributeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DICTATTRIBUTE = "SELECT dictAttribute FROM DictAttribute dictAttribute";
	private static final String _SQL_SELECT_DICTATTRIBUTE_WHERE = "SELECT dictAttribute FROM DictAttribute dictAttribute WHERE ";
	private static final String _SQL_COUNT_DICTATTRIBUTE = "SELECT COUNT(dictAttribute) FROM DictAttribute dictAttribute";
	private static final String _SQL_COUNT_DICTATTRIBUTE_WHERE = "SELECT COUNT(dictAttribute) FROM DictAttribute dictAttribute WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dictAttribute.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DictAttribute exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DictAttribute exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DictAttributePersistenceImpl.class);
	private static DictAttribute _nullDictAttribute = new DictAttributeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DictAttribute> toCacheModel() {
				return _nullDictAttributeCacheModel;
			}
		};

	private static CacheModel<DictAttribute> _nullDictAttributeCacheModel = new CacheModel<DictAttribute>() {
			@Override
			public DictAttribute toEntityModel() {
				return _nullDictAttribute;
			}
		};
}