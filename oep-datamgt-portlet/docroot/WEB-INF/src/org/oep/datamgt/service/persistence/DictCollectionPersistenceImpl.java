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

package org.oep.datamgt.service.persistence;

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
import com.liferay.portal.kernel.util.CharPool;
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

import org.oep.datamgt.NoSuchDictCollectionException;
import org.oep.datamgt.model.DictCollection;
import org.oep.datamgt.model.impl.DictCollectionImpl;
import org.oep.datamgt.model.impl.DictCollectionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dictionary collection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see DictCollectionPersistence
 * @see DictCollectionUtil
 * @generated
 */
public class DictCollectionPersistenceImpl extends BasePersistenceImpl<DictCollection>
	implements DictCollectionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DictCollectionUtil} to access the dictionary collection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DictCollectionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_N = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_N",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_N",
			new String[] { Long.class.getName(), String.class.getName() },
			DictCollectionModelImpl.GROUPID_COLUMN_BITMASK |
			DictCollectionModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_N = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_N",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dictionary collections where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG_N(long groupId, String name)
		throws SystemException {
		return findByG_N(groupId, name, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dictionary collections where groupId = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @return the range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG_N(long groupId, String name, int start,
		int end) throws SystemException {
		return findByG_N(groupId, name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections where groupId = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG_N(long groupId, String name, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N;
			finderArgs = new Object[] { groupId, name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_N;
			finderArgs = new Object[] {
					groupId, name,
					
					start, end, orderByComparator
				};
		}

		List<DictCollection> list = (List<DictCollection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictCollection dictCollection : list) {
				if ((groupId != dictCollection.getGroupId()) ||
						!Validator.equals(name, dictCollection.getName())) {
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

			query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_G_N_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_N_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_N_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_N_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				if (!pagination) {
					list = (List<DictCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictCollection>(list);
				}
				else {
					list = (List<DictCollection>)QueryUtil.list(q,
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
	 * Returns the first dictionary collection in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByG_N_First(long groupId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByG_N_First(groupId, name,
				orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the first dictionary collection in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByG_N_First(long groupId, String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictCollection> list = findByG_N(groupId, name, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary collection in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByG_N_Last(long groupId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByG_N_Last(groupId, name,
				orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the last dictionary collection in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByG_N_Last(long groupId, String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_N(groupId, name);

		if (count == 0) {
			return null;
		}

		List<DictCollection> list = findByG_N(groupId, name, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary collections before and after the current dictionary collection in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param dictCollectionId the primary key of the current dictionary collection
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection[] findByG_N_PrevAndNext(long dictCollectionId,
		long groupId, String name, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = findByPrimaryKey(dictCollectionId);

		Session session = null;

		try {
			session = openSession();

			DictCollection[] array = new DictCollectionImpl[3];

			array[0] = getByG_N_PrevAndNext(session, dictCollection, groupId,
					name, orderByComparator, true);

			array[1] = dictCollection;

			array[2] = getByG_N_PrevAndNext(session, dictCollection, groupId,
					name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictCollection getByG_N_PrevAndNext(Session session,
		DictCollection dictCollection, long groupId, String name,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

		query.append(_FINDER_COLUMN_G_N_GROUPID_2);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_G_N_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_N_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_G_N_NAME_2);
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
			query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictCollection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictCollection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary collections where groupId = &#63; and name = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_N(long groupId, String name)
		throws SystemException {
		for (DictCollection dictCollection : findByG_N(groupId, name,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictCollection);
		}
	}

	/**
	 * Returns the number of dictionary collections where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the number of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_N(long groupId, String name) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_N;

		Object[] finderArgs = new Object[] { groupId, name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_G_N_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_N_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_N_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_N_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_G_N_GROUPID_2 = "dictCollection.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_N_NAME_1 = "dictCollection.name IS NULL";
	private static final String _FINDER_COLUMN_G_N_NAME_2 = "dictCollection.name = ?";
	private static final String _FINDER_COLUMN_G_N_NAME_3 = "(dictCollection.name IS NULL OR dictCollection.name = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_N = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_N",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_N = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_N",
			new String[] { Long.class.getName(), String.class.getName() },
			DictCollectionModelImpl.COMPANYID_COLUMN_BITMASK |
			DictCollectionModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_N = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_N",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dictionary collections where companyId = &#63; and name = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC_N(long companyId, String name)
		throws SystemException {
		return findByC_N(companyId, name, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dictionary collections where companyId = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @return the range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC_N(long companyId, String name,
		int start, int end) throws SystemException {
		return findByC_N(companyId, name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections where companyId = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC_N(long companyId, String name,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_N;
			finderArgs = new Object[] { companyId, name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_N;
			finderArgs = new Object[] {
					companyId, name,
					
					start, end, orderByComparator
				};
		}

		List<DictCollection> list = (List<DictCollection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictCollection dictCollection : list) {
				if ((companyId != dictCollection.getCompanyId()) ||
						!Validator.equals(name, dictCollection.getName())) {
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

			query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_C_N_COMPANYID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_C_N_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_N_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_C_N_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindName) {
					qPos.add(name);
				}

				if (!pagination) {
					list = (List<DictCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictCollection>(list);
				}
				else {
					list = (List<DictCollection>)QueryUtil.list(q,
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
	 * Returns the first dictionary collection in the ordered set where companyId = &#63; and name = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByC_N_First(long companyId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByC_N_First(companyId, name,
				orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the first dictionary collection in the ordered set where companyId = &#63; and name = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByC_N_First(long companyId, String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictCollection> list = findByC_N(companyId, name, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary collection in the ordered set where companyId = &#63; and name = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByC_N_Last(long companyId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByC_N_Last(companyId, name,
				orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the last dictionary collection in the ordered set where companyId = &#63; and name = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByC_N_Last(long companyId, String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_N(companyId, name);

		if (count == 0) {
			return null;
		}

		List<DictCollection> list = findByC_N(companyId, name, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary collections before and after the current dictionary collection in the ordered set where companyId = &#63; and name = &#63;.
	 *
	 * @param dictCollectionId the primary key of the current dictionary collection
	 * @param companyId the company ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection[] findByC_N_PrevAndNext(long dictCollectionId,
		long companyId, String name, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = findByPrimaryKey(dictCollectionId);

		Session session = null;

		try {
			session = openSession();

			DictCollection[] array = new DictCollectionImpl[3];

			array[0] = getByC_N_PrevAndNext(session, dictCollection, companyId,
					name, orderByComparator, true);

			array[1] = dictCollection;

			array[2] = getByC_N_PrevAndNext(session, dictCollection, companyId,
					name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictCollection getByC_N_PrevAndNext(Session session,
		DictCollection dictCollection, long companyId, String name,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

		query.append(_FINDER_COLUMN_C_N_COMPANYID_2);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_C_N_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_N_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_C_N_NAME_2);
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
			query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictCollection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictCollection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary collections where companyId = &#63; and name = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_N(long companyId, String name)
		throws SystemException {
		for (DictCollection dictCollection : findByC_N(companyId, name,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictCollection);
		}
	}

	/**
	 * Returns the number of dictionary collections where companyId = &#63; and name = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the number of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_N(long companyId, String name)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_N;

		Object[] finderArgs = new Object[] { companyId, name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_C_N_COMPANYID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_C_N_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_N_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_C_N_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_C_N_COMPANYID_2 = "dictCollection.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_N_NAME_1 = "dictCollection.name IS NULL";
	private static final String _FINDER_COLUMN_C_N_NAME_2 = "dictCollection.name = ?";
	private static final String _FINDER_COLUMN_C_N_NAME_3 = "(dictCollection.name IS NULL OR dictCollection.name = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_LIKEN = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_LikeN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_C_LIKEN = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByC_LikeN",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dictionary collections where companyId = &#63; and name LIKE &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC_LikeN(long companyId, String name)
		throws SystemException {
		return findByC_LikeN(companyId, name, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary collections where companyId = &#63; and name LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @return the range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC_LikeN(long companyId, String name,
		int start, int end) throws SystemException {
		return findByC_LikeN(companyId, name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections where companyId = &#63; and name LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC_LikeN(long companyId, String name,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_LIKEN;
		finderArgs = new Object[] { companyId, name, start, end, orderByComparator };

		List<DictCollection> list = (List<DictCollection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictCollection dictCollection : list) {
				if ((companyId != dictCollection.getCompanyId()) ||
						!StringUtil.wildcardMatches(dictCollection.getName(),
							name, CharPool.UNDERLINE, CharPool.PERCENT,
							CharPool.BACK_SLASH, true)) {
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

			query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_C_LIKEN_COMPANYID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_C_LIKEN_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_LIKEN_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_C_LIKEN_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindName) {
					qPos.add(name);
				}

				if (!pagination) {
					list = (List<DictCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictCollection>(list);
				}
				else {
					list = (List<DictCollection>)QueryUtil.list(q,
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
	 * Returns the first dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByC_LikeN_First(long companyId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByC_LikeN_First(companyId, name,
				orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the first dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByC_LikeN_First(long companyId, String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictCollection> list = findByC_LikeN(companyId, name, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByC_LikeN_Last(long companyId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByC_LikeN_Last(companyId, name,
				orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the last dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByC_LikeN_Last(long companyId, String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_LikeN(companyId, name);

		if (count == 0) {
			return null;
		}

		List<DictCollection> list = findByC_LikeN(companyId, name, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary collections before and after the current dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63;.
	 *
	 * @param dictCollectionId the primary key of the current dictionary collection
	 * @param companyId the company ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection[] findByC_LikeN_PrevAndNext(long dictCollectionId,
		long companyId, String name, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = findByPrimaryKey(dictCollectionId);

		Session session = null;

		try {
			session = openSession();

			DictCollection[] array = new DictCollectionImpl[3];

			array[0] = getByC_LikeN_PrevAndNext(session, dictCollection,
					companyId, name, orderByComparator, true);

			array[1] = dictCollection;

			array[2] = getByC_LikeN_PrevAndNext(session, dictCollection,
					companyId, name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictCollection getByC_LikeN_PrevAndNext(Session session,
		DictCollection dictCollection, long companyId, String name,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

		query.append(_FINDER_COLUMN_C_LIKEN_COMPANYID_2);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_C_LIKEN_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_LIKEN_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_C_LIKEN_NAME_2);
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
			query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictCollection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictCollection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary collections where companyId = &#63; and name LIKE &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_LikeN(long companyId, String name)
		throws SystemException {
		for (DictCollection dictCollection : findByC_LikeN(companyId, name,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictCollection);
		}
	}

	/**
	 * Returns the number of dictionary collections where companyId = &#63; and name LIKE &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the number of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_LikeN(long companyId, String name)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_C_LIKEN;

		Object[] finderArgs = new Object[] { companyId, name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_C_LIKEN_COMPANYID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_C_LIKEN_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_LIKEN_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_C_LIKEN_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_C_LIKEN_COMPANYID_2 = "dictCollection.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_LIKEN_NAME_1 = "dictCollection.name LIKE NULL";
	private static final String _FINDER_COLUMN_C_LIKEN_NAME_2 = "dictCollection.name LIKE ?";
	private static final String _FINDER_COLUMN_C_LIKEN_NAME_3 = "(dictCollection.name IS NULL OR dictCollection.name LIKE '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LIKEN = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_LikeN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_LIKEN = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByG_LikeN",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dictionary collections where groupId = &#63; and name LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG_LikeN(long groupId, String name)
		throws SystemException {
		return findByG_LikeN(groupId, name, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary collections where groupId = &#63; and name LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @return the range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG_LikeN(long groupId, String name,
		int start, int end) throws SystemException {
		return findByG_LikeN(groupId, name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections where groupId = &#63; and name LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG_LikeN(long groupId, String name,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LIKEN;
		finderArgs = new Object[] { groupId, name, start, end, orderByComparator };

		List<DictCollection> list = (List<DictCollection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictCollection dictCollection : list) {
				if ((groupId != dictCollection.getGroupId()) ||
						!StringUtil.wildcardMatches(dictCollection.getName(),
							name, CharPool.UNDERLINE, CharPool.PERCENT,
							CharPool.BACK_SLASH, true)) {
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

			query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_G_LIKEN_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_LIKEN_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_LIKEN_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_LIKEN_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				if (!pagination) {
					list = (List<DictCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictCollection>(list);
				}
				else {
					list = (List<DictCollection>)QueryUtil.list(q,
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
	 * Returns the first dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByG_LikeN_First(long groupId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByG_LikeN_First(groupId, name,
				orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the first dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByG_LikeN_First(long groupId, String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictCollection> list = findByG_LikeN(groupId, name, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByG_LikeN_Last(long groupId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByG_LikeN_Last(groupId, name,
				orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the last dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByG_LikeN_Last(long groupId, String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_LikeN(groupId, name);

		if (count == 0) {
			return null;
		}

		List<DictCollection> list = findByG_LikeN(groupId, name, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary collections before and after the current dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63;.
	 *
	 * @param dictCollectionId the primary key of the current dictionary collection
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection[] findByG_LikeN_PrevAndNext(long dictCollectionId,
		long groupId, String name, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = findByPrimaryKey(dictCollectionId);

		Session session = null;

		try {
			session = openSession();

			DictCollection[] array = new DictCollectionImpl[3];

			array[0] = getByG_LikeN_PrevAndNext(session, dictCollection,
					groupId, name, orderByComparator, true);

			array[1] = dictCollection;

			array[2] = getByG_LikeN_PrevAndNext(session, dictCollection,
					groupId, name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictCollection getByG_LikeN_PrevAndNext(Session session,
		DictCollection dictCollection, long groupId, String name,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

		query.append(_FINDER_COLUMN_G_LIKEN_GROUPID_2);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_G_LIKEN_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_LIKEN_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_G_LIKEN_NAME_2);
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
			query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictCollection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictCollection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary collections where groupId = &#63; and name LIKE &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_LikeN(long groupId, String name)
		throws SystemException {
		for (DictCollection dictCollection : findByG_LikeN(groupId, name,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictCollection);
		}
	}

	/**
	 * Returns the number of dictionary collections where groupId = &#63; and name LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the number of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_LikeN(long groupId, String name)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_LIKEN;

		Object[] finderArgs = new Object[] { groupId, name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_G_LIKEN_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_LIKEN_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_LIKEN_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_LIKEN_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_G_LIKEN_GROUPID_2 = "dictCollection.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_LIKEN_NAME_1 = "dictCollection.name LIKE NULL";
	private static final String _FINDER_COLUMN_G_LIKEN_NAME_2 = "dictCollection.name LIKE ?";
	private static final String _FINDER_COLUMN_G_LIKEN_NAME_3 = "(dictCollection.name IS NULL OR dictCollection.name LIKE '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_N_V = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByC_N_V",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			DictCollectionModelImpl.COMPANYID_COLUMN_BITMASK |
			DictCollectionModelImpl.NAME_COLUMN_BITMASK |
			DictCollectionModelImpl.VERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_N_V = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_N_V",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns the dictionary collection where companyId = &#63; and name = &#63; and version = &#63; or throws a {@link org.oep.datamgt.NoSuchDictCollectionException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @return the matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByC_N_V(long companyId, String name,
		String version) throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByC_N_V(companyId, name, version);

		if (dictCollection == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", name=");
			msg.append(name);

			msg.append(", version=");
			msg.append(version);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDictCollectionException(msg.toString());
		}

		return dictCollection;
	}

	/**
	 * Returns the dictionary collection where companyId = &#63; and name = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @return the matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByC_N_V(long companyId, String name,
		String version) throws SystemException {
		return fetchByC_N_V(companyId, name, version, true);
	}

	/**
	 * Returns the dictionary collection where companyId = &#63; and name = &#63; and version = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByC_N_V(long companyId, String name,
		String version, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { companyId, name, version };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_N_V,
					finderArgs, this);
		}

		if (result instanceof DictCollection) {
			DictCollection dictCollection = (DictCollection)result;

			if ((companyId != dictCollection.getCompanyId()) ||
					!Validator.equals(name, dictCollection.getName()) ||
					!Validator.equals(version, dictCollection.getVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_C_N_V_COMPANYID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_C_N_V_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_N_V_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_C_N_V_NAME_2);
			}

			boolean bindVersion = false;

			if (version == null) {
				query.append(_FINDER_COLUMN_C_N_V_VERSION_1);
			}
			else if (version.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_N_V_VERSION_3);
			}
			else {
				bindVersion = true;

				query.append(_FINDER_COLUMN_C_N_V_VERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindName) {
					qPos.add(name);
				}

				if (bindVersion) {
					qPos.add(version);
				}

				List<DictCollection> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_N_V,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DictCollectionPersistenceImpl.fetchByC_N_V(long, String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DictCollection dictCollection = list.get(0);

					result = dictCollection;

					cacheResult(dictCollection);

					if ((dictCollection.getCompanyId() != companyId) ||
							(dictCollection.getName() == null) ||
							!dictCollection.getName().equals(name) ||
							(dictCollection.getVersion() == null) ||
							!dictCollection.getVersion().equals(version)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_N_V,
							finderArgs, dictCollection);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_N_V,
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
			return (DictCollection)result;
		}
	}

	/**
	 * Removes the dictionary collection where companyId = &#63; and name = &#63; and version = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @return the dictionary collection that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection removeByC_N_V(long companyId, String name,
		String version) throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = findByC_N_V(companyId, name, version);

		return remove(dictCollection);
	}

	/**
	 * Returns the number of dictionary collections where companyId = &#63; and name = &#63; and version = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @return the number of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_N_V(long companyId, String name, String version)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_N_V;

		Object[] finderArgs = new Object[] { companyId, name, version };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_C_N_V_COMPANYID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_C_N_V_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_N_V_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_C_N_V_NAME_2);
			}

			boolean bindVersion = false;

			if (version == null) {
				query.append(_FINDER_COLUMN_C_N_V_VERSION_1);
			}
			else if (version.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_N_V_VERSION_3);
			}
			else {
				bindVersion = true;

				query.append(_FINDER_COLUMN_C_N_V_VERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindName) {
					qPos.add(name);
				}

				if (bindVersion) {
					qPos.add(version);
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

	private static final String _FINDER_COLUMN_C_N_V_COMPANYID_2 = "dictCollection.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_N_V_NAME_1 = "dictCollection.name IS NULL AND ";
	private static final String _FINDER_COLUMN_C_N_V_NAME_2 = "dictCollection.name = ? AND ";
	private static final String _FINDER_COLUMN_C_N_V_NAME_3 = "(dictCollection.name IS NULL OR dictCollection.name = '') AND ";
	private static final String _FINDER_COLUMN_C_N_V_VERSION_1 = "dictCollection.version IS NULL";
	private static final String _FINDER_COLUMN_C_N_V_VERSION_2 = "dictCollection.version = ?";
	private static final String _FINDER_COLUMN_C_N_V_VERSION_3 = "(dictCollection.version IS NULL OR dictCollection.version = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_N_V = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByG_N_V",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			DictCollectionModelImpl.GROUPID_COLUMN_BITMASK |
			DictCollectionModelImpl.NAME_COLUMN_BITMASK |
			DictCollectionModelImpl.VERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_N_V = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_N_V",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns the dictionary collection where groupId = &#63; and name = &#63; and version = &#63; or throws a {@link org.oep.datamgt.NoSuchDictCollectionException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @return the matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByG_N_V(long groupId, String name, String version)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByG_N_V(groupId, name, version);

		if (dictCollection == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", name=");
			msg.append(name);

			msg.append(", version=");
			msg.append(version);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDictCollectionException(msg.toString());
		}

		return dictCollection;
	}

	/**
	 * Returns the dictionary collection where groupId = &#63; and name = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @return the matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByG_N_V(long groupId, String name, String version)
		throws SystemException {
		return fetchByG_N_V(groupId, name, version, true);
	}

	/**
	 * Returns the dictionary collection where groupId = &#63; and name = &#63; and version = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByG_N_V(long groupId, String name,
		String version, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, name, version };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_N_V,
					finderArgs, this);
		}

		if (result instanceof DictCollection) {
			DictCollection dictCollection = (DictCollection)result;

			if ((groupId != dictCollection.getGroupId()) ||
					!Validator.equals(name, dictCollection.getName()) ||
					!Validator.equals(version, dictCollection.getVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_G_N_V_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_N_V_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_N_V_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_N_V_NAME_2);
			}

			boolean bindVersion = false;

			if (version == null) {
				query.append(_FINDER_COLUMN_G_N_V_VERSION_1);
			}
			else if (version.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_N_V_VERSION_3);
			}
			else {
				bindVersion = true;

				query.append(_FINDER_COLUMN_G_N_V_VERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				if (bindVersion) {
					qPos.add(version);
				}

				List<DictCollection> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_N_V,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DictCollectionPersistenceImpl.fetchByG_N_V(long, String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DictCollection dictCollection = list.get(0);

					result = dictCollection;

					cacheResult(dictCollection);

					if ((dictCollection.getGroupId() != groupId) ||
							(dictCollection.getName() == null) ||
							!dictCollection.getName().equals(name) ||
							(dictCollection.getVersion() == null) ||
							!dictCollection.getVersion().equals(version)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_N_V,
							finderArgs, dictCollection);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_N_V,
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
			return (DictCollection)result;
		}
	}

	/**
	 * Removes the dictionary collection where groupId = &#63; and name = &#63; and version = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @return the dictionary collection that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection removeByG_N_V(long groupId, String name,
		String version) throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = findByG_N_V(groupId, name, version);

		return remove(dictCollection);
	}

	/**
	 * Returns the number of dictionary collections where groupId = &#63; and name = &#63; and version = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @return the number of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_N_V(long groupId, String name, String version)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_N_V;

		Object[] finderArgs = new Object[] { groupId, name, version };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_G_N_V_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_N_V_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_N_V_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_N_V_NAME_2);
			}

			boolean bindVersion = false;

			if (version == null) {
				query.append(_FINDER_COLUMN_G_N_V_VERSION_1);
			}
			else if (version.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_N_V_VERSION_3);
			}
			else {
				bindVersion = true;

				query.append(_FINDER_COLUMN_G_N_V_VERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				if (bindVersion) {
					qPos.add(version);
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

	private static final String _FINDER_COLUMN_G_N_V_GROUPID_2 = "dictCollection.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_N_V_NAME_1 = "dictCollection.name IS NULL AND ";
	private static final String _FINDER_COLUMN_G_N_V_NAME_2 = "dictCollection.name = ? AND ";
	private static final String _FINDER_COLUMN_G_N_V_NAME_3 = "(dictCollection.name IS NULL OR dictCollection.name = '') AND ";
	private static final String _FINDER_COLUMN_G_N_V_VERSION_1 = "dictCollection.version IS NULL";
	private static final String _FINDER_COLUMN_G_N_V_VERSION_2 = "dictCollection.version = ?";
	private static final String _FINDER_COLUMN_G_N_V_VERSION_3 = "(dictCollection.version IS NULL OR dictCollection.version = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_LIKEN_V =
		new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_LikeN_V",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_C_LIKEN_V =
		new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByC_LikeN_V",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @return the matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC_LikeN_V(long companyId, String name,
		String version) throws SystemException {
		return findByC_LikeN_V(companyId, name, version, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @return the range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC_LikeN_V(long companyId, String name,
		String version, int start, int end) throws SystemException {
		return findByC_LikeN_V(companyId, name, version, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC_LikeN_V(long companyId, String name,
		String version, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_LIKEN_V;
		finderArgs = new Object[] {
				companyId, name, version,
				
				start, end, orderByComparator
			};

		List<DictCollection> list = (List<DictCollection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictCollection dictCollection : list) {
				if ((companyId != dictCollection.getCompanyId()) ||
						!StringUtil.wildcardMatches(dictCollection.getName(),
							name, CharPool.UNDERLINE, CharPool.PERCENT,
							CharPool.BACK_SLASH, true) ||
						!Validator.equals(version, dictCollection.getVersion())) {
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

			query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_C_LIKEN_V_COMPANYID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_C_LIKEN_V_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_LIKEN_V_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_C_LIKEN_V_NAME_2);
			}

			boolean bindVersion = false;

			if (version == null) {
				query.append(_FINDER_COLUMN_C_LIKEN_V_VERSION_1);
			}
			else if (version.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_LIKEN_V_VERSION_3);
			}
			else {
				bindVersion = true;

				query.append(_FINDER_COLUMN_C_LIKEN_V_VERSION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindName) {
					qPos.add(name);
				}

				if (bindVersion) {
					qPos.add(version);
				}

				if (!pagination) {
					list = (List<DictCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictCollection>(list);
				}
				else {
					list = (List<DictCollection>)QueryUtil.list(q,
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
	 * Returns the first dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByC_LikeN_V_First(long companyId, String name,
		String version, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByC_LikeN_V_First(companyId, name,
				version, orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", name=");
		msg.append(name);

		msg.append(", version=");
		msg.append(version);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the first dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByC_LikeN_V_First(long companyId, String name,
		String version, OrderByComparator orderByComparator)
		throws SystemException {
		List<DictCollection> list = findByC_LikeN_V(companyId, name, version,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByC_LikeN_V_Last(long companyId, String name,
		String version, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByC_LikeN_V_Last(companyId, name,
				version, orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", name=");
		msg.append(name);

		msg.append(", version=");
		msg.append(version);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the last dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByC_LikeN_V_Last(long companyId, String name,
		String version, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_LikeN_V(companyId, name, version);

		if (count == 0) {
			return null;
		}

		List<DictCollection> list = findByC_LikeN_V(companyId, name, version,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary collections before and after the current dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param dictCollectionId the primary key of the current dictionary collection
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection[] findByC_LikeN_V_PrevAndNext(long dictCollectionId,
		long companyId, String name, String version,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = findByPrimaryKey(dictCollectionId);

		Session session = null;

		try {
			session = openSession();

			DictCollection[] array = new DictCollectionImpl[3];

			array[0] = getByC_LikeN_V_PrevAndNext(session, dictCollection,
					companyId, name, version, orderByComparator, true);

			array[1] = dictCollection;

			array[2] = getByC_LikeN_V_PrevAndNext(session, dictCollection,
					companyId, name, version, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictCollection getByC_LikeN_V_PrevAndNext(Session session,
		DictCollection dictCollection, long companyId, String name,
		String version, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

		query.append(_FINDER_COLUMN_C_LIKEN_V_COMPANYID_2);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_C_LIKEN_V_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_LIKEN_V_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_C_LIKEN_V_NAME_2);
		}

		boolean bindVersion = false;

		if (version == null) {
			query.append(_FINDER_COLUMN_C_LIKEN_V_VERSION_1);
		}
		else if (version.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_LIKEN_V_VERSION_3);
		}
		else {
			bindVersion = true;

			query.append(_FINDER_COLUMN_C_LIKEN_V_VERSION_2);
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
			query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindName) {
			qPos.add(name);
		}

		if (bindVersion) {
			qPos.add(version);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictCollection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictCollection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_LikeN_V(long companyId, String name, String version)
		throws SystemException {
		for (DictCollection dictCollection : findByC_LikeN_V(companyId, name,
				version, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictCollection);
		}
	}

	/**
	 * Returns the number of dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @return the number of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_LikeN_V(long companyId, String name, String version)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_C_LIKEN_V;

		Object[] finderArgs = new Object[] { companyId, name, version };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_C_LIKEN_V_COMPANYID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_C_LIKEN_V_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_LIKEN_V_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_C_LIKEN_V_NAME_2);
			}

			boolean bindVersion = false;

			if (version == null) {
				query.append(_FINDER_COLUMN_C_LIKEN_V_VERSION_1);
			}
			else if (version.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_LIKEN_V_VERSION_3);
			}
			else {
				bindVersion = true;

				query.append(_FINDER_COLUMN_C_LIKEN_V_VERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindName) {
					qPos.add(name);
				}

				if (bindVersion) {
					qPos.add(version);
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

	private static final String _FINDER_COLUMN_C_LIKEN_V_COMPANYID_2 = "dictCollection.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_LIKEN_V_NAME_1 = "dictCollection.name LIKE NULL AND ";
	private static final String _FINDER_COLUMN_C_LIKEN_V_NAME_2 = "dictCollection.name LIKE ? AND ";
	private static final String _FINDER_COLUMN_C_LIKEN_V_NAME_3 = "(dictCollection.name IS NULL OR dictCollection.name LIKE '') AND ";
	private static final String _FINDER_COLUMN_C_LIKEN_V_VERSION_1 = "dictCollection.version IS NULL";
	private static final String _FINDER_COLUMN_C_LIKEN_V_VERSION_2 = "dictCollection.version = ?";
	private static final String _FINDER_COLUMN_C_LIKEN_V_VERSION_3 = "(dictCollection.version IS NULL OR dictCollection.version = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LIKEN_V =
		new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_LikeN_V",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_LIKEN_V =
		new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByG_LikeN_V",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @return the matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG_LikeN_V(long groupId, String name,
		String version) throws SystemException {
		return findByG_LikeN_V(groupId, name, version, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @return the range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG_LikeN_V(long groupId, String name,
		String version, int start, int end) throws SystemException {
		return findByG_LikeN_V(groupId, name, version, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG_LikeN_V(long groupId, String name,
		String version, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LIKEN_V;
		finderArgs = new Object[] {
				groupId, name, version,
				
				start, end, orderByComparator
			};

		List<DictCollection> list = (List<DictCollection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictCollection dictCollection : list) {
				if ((groupId != dictCollection.getGroupId()) ||
						!StringUtil.wildcardMatches(dictCollection.getName(),
							name, CharPool.UNDERLINE, CharPool.PERCENT,
							CharPool.BACK_SLASH, true) ||
						!Validator.equals(version, dictCollection.getVersion())) {
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

			query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_G_LIKEN_V_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_LIKEN_V_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_LIKEN_V_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_LIKEN_V_NAME_2);
			}

			boolean bindVersion = false;

			if (version == null) {
				query.append(_FINDER_COLUMN_G_LIKEN_V_VERSION_1);
			}
			else if (version.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_LIKEN_V_VERSION_3);
			}
			else {
				bindVersion = true;

				query.append(_FINDER_COLUMN_G_LIKEN_V_VERSION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				if (bindVersion) {
					qPos.add(version);
				}

				if (!pagination) {
					list = (List<DictCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictCollection>(list);
				}
				else {
					list = (List<DictCollection>)QueryUtil.list(q,
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
	 * Returns the first dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByG_LikeN_V_First(long groupId, String name,
		String version, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByG_LikeN_V_First(groupId, name,
				version, orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", name=");
		msg.append(name);

		msg.append(", version=");
		msg.append(version);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the first dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByG_LikeN_V_First(long groupId, String name,
		String version, OrderByComparator orderByComparator)
		throws SystemException {
		List<DictCollection> list = findByG_LikeN_V(groupId, name, version, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByG_LikeN_V_Last(long groupId, String name,
		String version, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByG_LikeN_V_Last(groupId, name,
				version, orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", name=");
		msg.append(name);

		msg.append(", version=");
		msg.append(version);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the last dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByG_LikeN_V_Last(long groupId, String name,
		String version, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByG_LikeN_V(groupId, name, version);

		if (count == 0) {
			return null;
		}

		List<DictCollection> list = findByG_LikeN_V(groupId, name, version,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary collections before and after the current dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param dictCollectionId the primary key of the current dictionary collection
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection[] findByG_LikeN_V_PrevAndNext(long dictCollectionId,
		long groupId, String name, String version,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = findByPrimaryKey(dictCollectionId);

		Session session = null;

		try {
			session = openSession();

			DictCollection[] array = new DictCollectionImpl[3];

			array[0] = getByG_LikeN_V_PrevAndNext(session, dictCollection,
					groupId, name, version, orderByComparator, true);

			array[1] = dictCollection;

			array[2] = getByG_LikeN_V_PrevAndNext(session, dictCollection,
					groupId, name, version, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictCollection getByG_LikeN_V_PrevAndNext(Session session,
		DictCollection dictCollection, long groupId, String name,
		String version, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

		query.append(_FINDER_COLUMN_G_LIKEN_V_GROUPID_2);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_G_LIKEN_V_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_LIKEN_V_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_G_LIKEN_V_NAME_2);
		}

		boolean bindVersion = false;

		if (version == null) {
			query.append(_FINDER_COLUMN_G_LIKEN_V_VERSION_1);
		}
		else if (version.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_LIKEN_V_VERSION_3);
		}
		else {
			bindVersion = true;

			query.append(_FINDER_COLUMN_G_LIKEN_V_VERSION_2);
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
			query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindName) {
			qPos.add(name);
		}

		if (bindVersion) {
			qPos.add(version);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictCollection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictCollection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_LikeN_V(long groupId, String name, String version)
		throws SystemException {
		for (DictCollection dictCollection : findByG_LikeN_V(groupId, name,
				version, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictCollection);
		}
	}

	/**
	 * Returns the number of dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param version the version
	 * @return the number of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_LikeN_V(long groupId, String name, String version)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_LIKEN_V;

		Object[] finderArgs = new Object[] { groupId, name, version };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_G_LIKEN_V_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_LIKEN_V_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_LIKEN_V_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_LIKEN_V_NAME_2);
			}

			boolean bindVersion = false;

			if (version == null) {
				query.append(_FINDER_COLUMN_G_LIKEN_V_VERSION_1);
			}
			else if (version.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_LIKEN_V_VERSION_3);
			}
			else {
				bindVersion = true;

				query.append(_FINDER_COLUMN_G_LIKEN_V_VERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				if (bindVersion) {
					qPos.add(version);
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

	private static final String _FINDER_COLUMN_G_LIKEN_V_GROUPID_2 = "dictCollection.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_LIKEN_V_NAME_1 = "dictCollection.name LIKE NULL AND ";
	private static final String _FINDER_COLUMN_G_LIKEN_V_NAME_2 = "dictCollection.name LIKE ? AND ";
	private static final String _FINDER_COLUMN_G_LIKEN_V_NAME_3 = "(dictCollection.name IS NULL OR dictCollection.name LIKE '') AND ";
	private static final String _FINDER_COLUMN_G_LIKEN_V_VERSION_1 = "dictCollection.version IS NULL";
	private static final String _FINDER_COLUMN_G_LIKEN_V_VERSION_2 = "dictCollection.version = ?";
	private static final String _FINDER_COLUMN_G_LIKEN_V_VERSION_3 = "(dictCollection.version IS NULL OR dictCollection.version = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_N_S = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_N_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N_S = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_N_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			DictCollectionModelImpl.GROUPID_COLUMN_BITMASK |
			DictCollectionModelImpl.NAME_COLUMN_BITMASK |
			DictCollectionModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_N_S = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_N_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the dictionary collections where groupId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param status the status
	 * @return the matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG_N_S(long groupId, String name,
		int status) throws SystemException {
		return findByG_N_S(groupId, name, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary collections where groupId = &#63; and name = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param status the status
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @return the range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG_N_S(long groupId, String name,
		int status, int start, int end) throws SystemException {
		return findByG_N_S(groupId, name, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections where groupId = &#63; and name = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param status the status
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG_N_S(long groupId, String name,
		int status, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N_S;
			finderArgs = new Object[] { groupId, name, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_N_S;
			finderArgs = new Object[] {
					groupId, name, status,
					
					start, end, orderByComparator
				};
		}

		List<DictCollection> list = (List<DictCollection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictCollection dictCollection : list) {
				if ((groupId != dictCollection.getGroupId()) ||
						!Validator.equals(name, dictCollection.getName()) ||
						(status != dictCollection.getStatus())) {
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

			query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_G_N_S_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_N_S_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_N_S_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_N_S_NAME_2);
			}

			query.append(_FINDER_COLUMN_G_N_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				qPos.add(status);

				if (!pagination) {
					list = (List<DictCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictCollection>(list);
				}
				else {
					list = (List<DictCollection>)QueryUtil.list(q,
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
	 * Returns the first dictionary collection in the ordered set where groupId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByG_N_S_First(long groupId, String name,
		int status, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByG_N_S_First(groupId, name,
				status, orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", name=");
		msg.append(name);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the first dictionary collection in the ordered set where groupId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByG_N_S_First(long groupId, String name,
		int status, OrderByComparator orderByComparator)
		throws SystemException {
		List<DictCollection> list = findByG_N_S(groupId, name, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary collection in the ordered set where groupId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByG_N_S_Last(long groupId, String name,
		int status, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByG_N_S_Last(groupId, name,
				status, orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", name=");
		msg.append(name);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the last dictionary collection in the ordered set where groupId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByG_N_S_Last(long groupId, String name,
		int status, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByG_N_S(groupId, name, status);

		if (count == 0) {
			return null;
		}

		List<DictCollection> list = findByG_N_S(groupId, name, status,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary collections before and after the current dictionary collection in the ordered set where groupId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param dictCollectionId the primary key of the current dictionary collection
	 * @param groupId the group ID
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection[] findByG_N_S_PrevAndNext(long dictCollectionId,
		long groupId, String name, int status,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = findByPrimaryKey(dictCollectionId);

		Session session = null;

		try {
			session = openSession();

			DictCollection[] array = new DictCollectionImpl[3];

			array[0] = getByG_N_S_PrevAndNext(session, dictCollection, groupId,
					name, status, orderByComparator, true);

			array[1] = dictCollection;

			array[2] = getByG_N_S_PrevAndNext(session, dictCollection, groupId,
					name, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictCollection getByG_N_S_PrevAndNext(Session session,
		DictCollection dictCollection, long groupId, String name, int status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

		query.append(_FINDER_COLUMN_G_N_S_GROUPID_2);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_G_N_S_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_N_S_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_G_N_S_NAME_2);
		}

		query.append(_FINDER_COLUMN_G_N_S_STATUS_2);

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
			query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindName) {
			qPos.add(name);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictCollection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictCollection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary collections where groupId = &#63; and name = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_N_S(long groupId, String name, int status)
		throws SystemException {
		for (DictCollection dictCollection : findByG_N_S(groupId, name, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictCollection);
		}
	}

	/**
	 * Returns the number of dictionary collections where groupId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param status the status
	 * @return the number of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_N_S(long groupId, String name, int status)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_N_S;

		Object[] finderArgs = new Object[] { groupId, name, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_G_N_S_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_N_S_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_N_S_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_N_S_NAME_2);
			}

			query.append(_FINDER_COLUMN_G_N_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_G_N_S_GROUPID_2 = "dictCollection.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_N_S_NAME_1 = "dictCollection.name IS NULL AND ";
	private static final String _FINDER_COLUMN_G_N_S_NAME_2 = "dictCollection.name = ? AND ";
	private static final String _FINDER_COLUMN_G_N_S_NAME_3 = "(dictCollection.name IS NULL OR dictCollection.name = '') AND ";
	private static final String _FINDER_COLUMN_G_N_S_STATUS_2 = "dictCollection.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_N_S = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_N_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_N_S = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_N_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			DictCollectionModelImpl.COMPANYID_COLUMN_BITMASK |
			DictCollectionModelImpl.NAME_COLUMN_BITMASK |
			DictCollectionModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_N_S = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_N_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the dictionary collections where companyId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param status the status
	 * @return the matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC_N_S(long companyId, String name,
		int status) throws SystemException {
		return findByC_N_S(companyId, name, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary collections where companyId = &#63; and name = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param status the status
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @return the range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC_N_S(long companyId, String name,
		int status, int start, int end) throws SystemException {
		return findByC_N_S(companyId, name, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections where companyId = &#63; and name = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param status the status
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC_N_S(long companyId, String name,
		int status, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_N_S;
			finderArgs = new Object[] { companyId, name, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_N_S;
			finderArgs = new Object[] {
					companyId, name, status,
					
					start, end, orderByComparator
				};
		}

		List<DictCollection> list = (List<DictCollection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictCollection dictCollection : list) {
				if ((companyId != dictCollection.getCompanyId()) ||
						!Validator.equals(name, dictCollection.getName()) ||
						(status != dictCollection.getStatus())) {
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

			query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_C_N_S_COMPANYID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_C_N_S_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_N_S_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_C_N_S_NAME_2);
			}

			query.append(_FINDER_COLUMN_C_N_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindName) {
					qPos.add(name);
				}

				qPos.add(status);

				if (!pagination) {
					list = (List<DictCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictCollection>(list);
				}
				else {
					list = (List<DictCollection>)QueryUtil.list(q,
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
	 * Returns the first dictionary collection in the ordered set where companyId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByC_N_S_First(long companyId, String name,
		int status, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByC_N_S_First(companyId, name,
				status, orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", name=");
		msg.append(name);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the first dictionary collection in the ordered set where companyId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByC_N_S_First(long companyId, String name,
		int status, OrderByComparator orderByComparator)
		throws SystemException {
		List<DictCollection> list = findByC_N_S(companyId, name, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary collection in the ordered set where companyId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByC_N_S_Last(long companyId, String name,
		int status, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByC_N_S_Last(companyId, name,
				status, orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", name=");
		msg.append(name);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the last dictionary collection in the ordered set where companyId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByC_N_S_Last(long companyId, String name,
		int status, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_N_S(companyId, name, status);

		if (count == 0) {
			return null;
		}

		List<DictCollection> list = findByC_N_S(companyId, name, status,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary collections before and after the current dictionary collection in the ordered set where companyId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param dictCollectionId the primary key of the current dictionary collection
	 * @param companyId the company ID
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection[] findByC_N_S_PrevAndNext(long dictCollectionId,
		long companyId, String name, int status,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = findByPrimaryKey(dictCollectionId);

		Session session = null;

		try {
			session = openSession();

			DictCollection[] array = new DictCollectionImpl[3];

			array[0] = getByC_N_S_PrevAndNext(session, dictCollection,
					companyId, name, status, orderByComparator, true);

			array[1] = dictCollection;

			array[2] = getByC_N_S_PrevAndNext(session, dictCollection,
					companyId, name, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DictCollection getByC_N_S_PrevAndNext(Session session,
		DictCollection dictCollection, long companyId, String name, int status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

		query.append(_FINDER_COLUMN_C_N_S_COMPANYID_2);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_C_N_S_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_N_S_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_C_N_S_NAME_2);
		}

		query.append(_FINDER_COLUMN_C_N_S_STATUS_2);

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
			query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindName) {
			qPos.add(name);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictCollection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictCollection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary collections where companyId = &#63; and name = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_N_S(long companyId, String name, int status)
		throws SystemException {
		for (DictCollection dictCollection : findByC_N_S(companyId, name,
				status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictCollection);
		}
	}

	/**
	 * Returns the number of dictionary collections where companyId = &#63; and name = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param status the status
	 * @return the number of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_N_S(long companyId, String name, int status)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_N_S;

		Object[] finderArgs = new Object[] { companyId, name, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_C_N_S_COMPANYID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_C_N_S_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_N_S_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_C_N_S_NAME_2);
			}

			query.append(_FINDER_COLUMN_C_N_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_C_N_S_COMPANYID_2 = "dictCollection.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_N_S_NAME_1 = "dictCollection.name IS NULL AND ";
	private static final String _FINDER_COLUMN_C_N_S_NAME_2 = "dictCollection.name = ? AND ";
	private static final String _FINDER_COLUMN_C_N_S_NAME_3 = "(dictCollection.name IS NULL OR dictCollection.name = '') AND ";
	private static final String _FINDER_COLUMN_C_N_S_STATUS_2 = "dictCollection.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC",
			new String[] { Long.class.getName() },
			DictCollectionModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dictionary collections where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC(long companyId)
		throws SystemException {
		return findByC(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary collections where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @return the range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC(long companyId, int start, int end)
		throws SystemException {
		return findByC(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByC(long companyId, int start, int end,
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

		List<DictCollection> list = (List<DictCollection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictCollection dictCollection : list) {
				if ((companyId != dictCollection.getCompanyId())) {
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

			query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<DictCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictCollection>(list);
				}
				else {
					list = (List<DictCollection>)QueryUtil.list(q,
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
	 * Returns the first dictionary collection in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByC_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByC_First(companyId,
				orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the first dictionary collection in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByC_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictCollection> list = findByC(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary collection in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByC_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByC_Last(companyId,
				orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the last dictionary collection in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByC_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC(companyId);

		if (count == 0) {
			return null;
		}

		List<DictCollection> list = findByC(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary collections before and after the current dictionary collection in the ordered set where companyId = &#63;.
	 *
	 * @param dictCollectionId the primary key of the current dictionary collection
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection[] findByC_PrevAndNext(long dictCollectionId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = findByPrimaryKey(dictCollectionId);

		Session session = null;

		try {
			session = openSession();

			DictCollection[] array = new DictCollectionImpl[3];

			array[0] = getByC_PrevAndNext(session, dictCollection, companyId,
					orderByComparator, true);

			array[1] = dictCollection;

			array[2] = getByC_PrevAndNext(session, dictCollection, companyId,
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

	protected DictCollection getByC_PrevAndNext(Session session,
		DictCollection dictCollection, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

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
			query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictCollection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictCollection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary collections where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC(long companyId) throws SystemException {
		for (DictCollection dictCollection : findByC(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictCollection);
		}
	}

	/**
	 * Returns the number of dictionary collections where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching dictionary collections
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

			query.append(_SQL_COUNT_DICTCOLLECTION_WHERE);

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

	private static final String _FINDER_COLUMN_C_COMPANYID_2 = "dictCollection.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED,
			DictCollectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG",
			new String[] { Long.class.getName() },
			DictCollectionModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G = new FinderPath(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dictionary collections where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG(long groupId) throws SystemException {
		return findByG(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary collections where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @return the range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG(long groupId, int start, int end)
		throws SystemException {
		return findByG(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findByG(long groupId, int start, int end,
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

		List<DictCollection> list = (List<DictCollection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DictCollection dictCollection : list) {
				if ((groupId != dictCollection.getGroupId())) {
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

			query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

			query.append(_FINDER_COLUMN_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<DictCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictCollection>(list);
				}
				else {
					list = (List<DictCollection>)QueryUtil.list(q,
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
	 * Returns the first dictionary collection in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByG_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByG_First(groupId,
				orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the first dictionary collection in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByG_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DictCollection> list = findByG(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dictionary collection in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByG_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByG_Last(groupId, orderByComparator);

		if (dictCollection != null) {
			return dictCollection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDictCollectionException(msg.toString());
	}

	/**
	 * Returns the last dictionary collection in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByG_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG(groupId);

		if (count == 0) {
			return null;
		}

		List<DictCollection> list = findByG(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dictionary collections before and after the current dictionary collection in the ordered set where groupId = &#63;.
	 *
	 * @param dictCollectionId the primary key of the current dictionary collection
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection[] findByG_PrevAndNext(long dictCollectionId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = findByPrimaryKey(dictCollectionId);

		Session session = null;

		try {
			session = openSession();

			DictCollection[] array = new DictCollectionImpl[3];

			array[0] = getByG_PrevAndNext(session, dictCollection, groupId,
					orderByComparator, true);

			array[1] = dictCollection;

			array[2] = getByG_PrevAndNext(session, dictCollection, groupId,
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

	protected DictCollection getByG_PrevAndNext(Session session,
		DictCollection dictCollection, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DICTCOLLECTION_WHERE);

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
			query.append(DictCollectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dictCollection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DictCollection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dictionary collections where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG(long groupId) throws SystemException {
		for (DictCollection dictCollection : findByG(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dictCollection);
		}
	}

	/**
	 * Returns the number of dictionary collections where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching dictionary collections
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

			query.append(_SQL_COUNT_DICTCOLLECTION_WHERE);

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

	private static final String _FINDER_COLUMN_G_GROUPID_2 = "dictCollection.groupId = ?";

	public DictCollectionPersistenceImpl() {
		setModelClass(DictCollection.class);
	}

	/**
	 * Caches the dictionary collection in the entity cache if it is enabled.
	 *
	 * @param dictCollection the dictionary collection
	 */
	@Override
	public void cacheResult(DictCollection dictCollection) {
		EntityCacheUtil.putResult(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionImpl.class, dictCollection.getPrimaryKey(),
			dictCollection);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_N_V,
			new Object[] {
				dictCollection.getCompanyId(), dictCollection.getName(),
				dictCollection.getVersion()
			}, dictCollection);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_N_V,
			new Object[] {
				dictCollection.getGroupId(), dictCollection.getName(),
				dictCollection.getVersion()
			}, dictCollection);

		dictCollection.resetOriginalValues();
	}

	/**
	 * Caches the dictionary collections in the entity cache if it is enabled.
	 *
	 * @param dictCollections the dictionary collections
	 */
	@Override
	public void cacheResult(List<DictCollection> dictCollections) {
		for (DictCollection dictCollection : dictCollections) {
			if (EntityCacheUtil.getResult(
						DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
						DictCollectionImpl.class, dictCollection.getPrimaryKey()) == null) {
				cacheResult(dictCollection);
			}
			else {
				dictCollection.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dictionary collections.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DictCollectionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DictCollectionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dictionary collection.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DictCollection dictCollection) {
		EntityCacheUtil.removeResult(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionImpl.class, dictCollection.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dictCollection);
	}

	@Override
	public void clearCache(List<DictCollection> dictCollections) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DictCollection dictCollection : dictCollections) {
			EntityCacheUtil.removeResult(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
				DictCollectionImpl.class, dictCollection.getPrimaryKey());

			clearUniqueFindersCache(dictCollection);
		}
	}

	protected void cacheUniqueFindersCache(DictCollection dictCollection) {
		if (dictCollection.isNew()) {
			Object[] args = new Object[] {
					dictCollection.getCompanyId(), dictCollection.getName(),
					dictCollection.getVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_N_V, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_N_V, args,
				dictCollection);

			args = new Object[] {
					dictCollection.getGroupId(), dictCollection.getName(),
					dictCollection.getVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_N_V, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_N_V, args,
				dictCollection);
		}
		else {
			DictCollectionModelImpl dictCollectionModelImpl = (DictCollectionModelImpl)dictCollection;

			if ((dictCollectionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_N_V.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictCollection.getCompanyId(), dictCollection.getName(),
						dictCollection.getVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_N_V, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_N_V, args,
					dictCollection);
			}

			if ((dictCollectionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_N_V.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictCollection.getGroupId(), dictCollection.getName(),
						dictCollection.getVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_N_V, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_N_V, args,
					dictCollection);
			}
		}
	}

	protected void clearUniqueFindersCache(DictCollection dictCollection) {
		DictCollectionModelImpl dictCollectionModelImpl = (DictCollectionModelImpl)dictCollection;

		Object[] args = new Object[] {
				dictCollection.getCompanyId(), dictCollection.getName(),
				dictCollection.getVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_N_V, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_N_V, args);

		if ((dictCollectionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_N_V.getColumnBitmask()) != 0) {
			args = new Object[] {
					dictCollectionModelImpl.getOriginalCompanyId(),
					dictCollectionModelImpl.getOriginalName(),
					dictCollectionModelImpl.getOriginalVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_N_V, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_N_V, args);
		}

		args = new Object[] {
				dictCollection.getGroupId(), dictCollection.getName(),
				dictCollection.getVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_N_V, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_N_V, args);

		if ((dictCollectionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_N_V.getColumnBitmask()) != 0) {
			args = new Object[] {
					dictCollectionModelImpl.getOriginalGroupId(),
					dictCollectionModelImpl.getOriginalName(),
					dictCollectionModelImpl.getOriginalVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_N_V, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_N_V, args);
		}
	}

	/**
	 * Creates a new dictionary collection with the primary key. Does not add the dictionary collection to the database.
	 *
	 * @param dictCollectionId the primary key for the new dictionary collection
	 * @return the new dictionary collection
	 */
	@Override
	public DictCollection create(long dictCollectionId) {
		DictCollection dictCollection = new DictCollectionImpl();

		dictCollection.setNew(true);
		dictCollection.setPrimaryKey(dictCollectionId);

		return dictCollection;
	}

	/**
	 * Removes the dictionary collection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dictCollectionId the primary key of the dictionary collection
	 * @return the dictionary collection that was removed
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection remove(long dictCollectionId)
		throws NoSuchDictCollectionException, SystemException {
		return remove((Serializable)dictCollectionId);
	}

	/**
	 * Removes the dictionary collection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dictionary collection
	 * @return the dictionary collection that was removed
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection remove(Serializable primaryKey)
		throws NoSuchDictCollectionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DictCollection dictCollection = (DictCollection)session.get(DictCollectionImpl.class,
					primaryKey);

			if (dictCollection == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDictCollectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dictCollection);
		}
		catch (NoSuchDictCollectionException nsee) {
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
	protected DictCollection removeImpl(DictCollection dictCollection)
		throws SystemException {
		dictCollection = toUnwrappedModel(dictCollection);

		dictCollectionToDictDataTableMapper.deleteLeftPrimaryKeyTableMappings(dictCollection.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dictCollection)) {
				dictCollection = (DictCollection)session.get(DictCollectionImpl.class,
						dictCollection.getPrimaryKeyObj());
			}

			if (dictCollection != null) {
				session.delete(dictCollection);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dictCollection != null) {
			clearCache(dictCollection);
		}

		return dictCollection;
	}

	@Override
	public DictCollection updateImpl(
		org.oep.datamgt.model.DictCollection dictCollection)
		throws SystemException {
		dictCollection = toUnwrappedModel(dictCollection);

		boolean isNew = dictCollection.isNew();

		DictCollectionModelImpl dictCollectionModelImpl = (DictCollectionModelImpl)dictCollection;

		Session session = null;

		try {
			session = openSession();

			if (dictCollection.isNew()) {
				session.save(dictCollection);

				dictCollection.setNew(false);
			}
			else {
				session.merge(dictCollection);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DictCollectionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dictCollectionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictCollectionModelImpl.getOriginalGroupId(),
						dictCollectionModelImpl.getOriginalName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_N, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N,
					args);

				args = new Object[] {
						dictCollectionModelImpl.getGroupId(),
						dictCollectionModelImpl.getName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_N, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N,
					args);
			}

			if ((dictCollectionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_N.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictCollectionModelImpl.getOriginalCompanyId(),
						dictCollectionModelImpl.getOriginalName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_N, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_N,
					args);

				args = new Object[] {
						dictCollectionModelImpl.getCompanyId(),
						dictCollectionModelImpl.getName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_N, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_N,
					args);
			}

			if ((dictCollectionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictCollectionModelImpl.getOriginalGroupId(),
						dictCollectionModelImpl.getOriginalName(),
						dictCollectionModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_N_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N_S,
					args);

				args = new Object[] {
						dictCollectionModelImpl.getGroupId(),
						dictCollectionModelImpl.getName(),
						dictCollectionModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_N_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N_S,
					args);
			}

			if ((dictCollectionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_N_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictCollectionModelImpl.getOriginalCompanyId(),
						dictCollectionModelImpl.getOriginalName(),
						dictCollectionModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_N_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_N_S,
					args);

				args = new Object[] {
						dictCollectionModelImpl.getCompanyId(),
						dictCollectionModelImpl.getName(),
						dictCollectionModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_N_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_N_S,
					args);
			}

			if ((dictCollectionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictCollectionModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);

				args = new Object[] { dictCollectionModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);
			}

			if ((dictCollectionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dictCollectionModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G,
					args);

				args = new Object[] { dictCollectionModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G,
					args);
			}
		}

		EntityCacheUtil.putResult(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
			DictCollectionImpl.class, dictCollection.getPrimaryKey(),
			dictCollection);

		clearUniqueFindersCache(dictCollection);
		cacheUniqueFindersCache(dictCollection);

		return dictCollection;
	}

	protected DictCollection toUnwrappedModel(DictCollection dictCollection) {
		if (dictCollection instanceof DictCollectionImpl) {
			return dictCollection;
		}

		DictCollectionImpl dictCollectionImpl = new DictCollectionImpl();

		dictCollectionImpl.setNew(dictCollection.isNew());
		dictCollectionImpl.setPrimaryKey(dictCollection.getPrimaryKey());

		dictCollectionImpl.setDictCollectionId(dictCollection.getDictCollectionId());
		dictCollectionImpl.setCompanyId(dictCollection.getCompanyId());
		dictCollectionImpl.setGroupId(dictCollection.getGroupId());
		dictCollectionImpl.setUserId(dictCollection.getUserId());
		dictCollectionImpl.setCreateDate(dictCollection.getCreateDate());
		dictCollectionImpl.setModifiedDate(dictCollection.getModifiedDate());
		dictCollectionImpl.setName(dictCollection.getName());
		dictCollectionImpl.setVersion(dictCollection.getVersion());
		dictCollectionImpl.setTitle(dictCollection.getTitle());
		dictCollectionImpl.setValidatedFrom(dictCollection.getValidatedFrom());
		dictCollectionImpl.setValidatedTo(dictCollection.getValidatedTo());
		dictCollectionImpl.setStatus(dictCollection.getStatus());

		return dictCollectionImpl;
	}

	/**
	 * Returns the dictionary collection with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dictionary collection
	 * @return the dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDictCollectionException, SystemException {
		DictCollection dictCollection = fetchByPrimaryKey(primaryKey);

		if (dictCollection == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDictCollectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dictCollection;
	}

	/**
	 * Returns the dictionary collection with the primary key or throws a {@link org.oep.datamgt.NoSuchDictCollectionException} if it could not be found.
	 *
	 * @param dictCollectionId the primary key of the dictionary collection
	 * @return the dictionary collection
	 * @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection findByPrimaryKey(long dictCollectionId)
		throws NoSuchDictCollectionException, SystemException {
		return findByPrimaryKey((Serializable)dictCollectionId);
	}

	/**
	 * Returns the dictionary collection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dictionary collection
	 * @return the dictionary collection, or <code>null</code> if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DictCollection dictCollection = (DictCollection)EntityCacheUtil.getResult(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
				DictCollectionImpl.class, primaryKey);

		if (dictCollection == _nullDictCollection) {
			return null;
		}

		if (dictCollection == null) {
			Session session = null;

			try {
				session = openSession();

				dictCollection = (DictCollection)session.get(DictCollectionImpl.class,
						primaryKey);

				if (dictCollection != null) {
					cacheResult(dictCollection);
				}
				else {
					EntityCacheUtil.putResult(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
						DictCollectionImpl.class, primaryKey,
						_nullDictCollection);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DictCollectionModelImpl.ENTITY_CACHE_ENABLED,
					DictCollectionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dictCollection;
	}

	/**
	 * Returns the dictionary collection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dictCollectionId the primary key of the dictionary collection
	 * @return the dictionary collection, or <code>null</code> if a dictionary collection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DictCollection fetchByPrimaryKey(long dictCollectionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dictCollectionId);
	}

	/**
	 * Returns all the dictionary collections.
	 *
	 * @return the dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionary collections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @return the range of dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary collections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dictionary collections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DictCollection> findAll(int start, int end,
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

		List<DictCollection> list = (List<DictCollection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DICTCOLLECTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DICTCOLLECTION;

				if (pagination) {
					sql = sql.concat(DictCollectionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DictCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DictCollection>(list);
				}
				else {
					list = (List<DictCollection>)QueryUtil.list(q,
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
	 * Removes all the dictionary collections from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DictCollection dictCollection : findAll()) {
			remove(dictCollection);
		}
	}

	/**
	 * Returns the number of dictionary collections.
	 *
	 * @return the number of dictionary collections
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

				Query q = session.createQuery(_SQL_COUNT_DICTCOLLECTION);

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
	 * Returns all the dictionary datas associated with the dictionary collection.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @return the dictionary datas associated with the dictionary collection
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.datamgt.model.DictData> getDictDatas(long pk)
		throws SystemException {
		return getDictDatas(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the dictionary datas associated with the dictionary collection.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @return the range of dictionary datas associated with the dictionary collection
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.datamgt.model.DictData> getDictDatas(long pk,
		int start, int end) throws SystemException {
		return getDictDatas(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionary datas associated with the dictionary collection.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param start the lower bound of the range of dictionary collections
	 * @param end the upper bound of the range of dictionary collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dictionary datas associated with the dictionary collection
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.oep.datamgt.model.DictData> getDictDatas(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return dictCollectionToDictDataTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of dictionary datas associated with the dictionary collection.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @return the number of dictionary datas associated with the dictionary collection
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getDictDatasSize(long pk) throws SystemException {
		long[] pks = dictCollectionToDictDataTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the dictionary data is associated with the dictionary collection.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param dictDataPK the primary key of the dictionary data
	 * @return <code>true</code> if the dictionary data is associated with the dictionary collection; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsDictData(long pk, long dictDataPK)
		throws SystemException {
		return dictCollectionToDictDataTableMapper.containsTableMapping(pk,
			dictDataPK);
	}

	/**
	 * Returns <code>true</code> if the dictionary collection has any dictionary datas associated with it.
	 *
	 * @param pk the primary key of the dictionary collection to check for associations with dictionary datas
	 * @return <code>true</code> if the dictionary collection has any dictionary datas associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsDictDatas(long pk) throws SystemException {
		if (getDictDatasSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the dictionary collection and the dictionary data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param dictDataPK the primary key of the dictionary data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addDictData(long pk, long dictDataPK) throws SystemException {
		dictCollectionToDictDataTableMapper.addTableMapping(pk, dictDataPK);
	}

	/**
	 * Adds an association between the dictionary collection and the dictionary data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param dictData the dictionary data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addDictData(long pk, org.oep.datamgt.model.DictData dictData)
		throws SystemException {
		dictCollectionToDictDataTableMapper.addTableMapping(pk,
			dictData.getPrimaryKey());
	}

	/**
	 * Adds an association between the dictionary collection and the dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param dictDataPKs the primary keys of the dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addDictDatas(long pk, long[] dictDataPKs)
		throws SystemException {
		for (long dictDataPK : dictDataPKs) {
			dictCollectionToDictDataTableMapper.addTableMapping(pk, dictDataPK);
		}
	}

	/**
	 * Adds an association between the dictionary collection and the dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param dictDatas the dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addDictDatas(long pk,
		List<org.oep.datamgt.model.DictData> dictDatas)
		throws SystemException {
		for (org.oep.datamgt.model.DictData dictData : dictDatas) {
			dictCollectionToDictDataTableMapper.addTableMapping(pk,
				dictData.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the dictionary collection and its dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary collection to clear the associated dictionary datas from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearDictDatas(long pk) throws SystemException {
		dictCollectionToDictDataTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the dictionary collection and the dictionary data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param dictDataPK the primary key of the dictionary data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeDictData(long pk, long dictDataPK)
		throws SystemException {
		dictCollectionToDictDataTableMapper.deleteTableMapping(pk, dictDataPK);
	}

	/**
	 * Removes the association between the dictionary collection and the dictionary data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param dictData the dictionary data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeDictData(long pk, org.oep.datamgt.model.DictData dictData)
		throws SystemException {
		dictCollectionToDictDataTableMapper.deleteTableMapping(pk,
			dictData.getPrimaryKey());
	}

	/**
	 * Removes the association between the dictionary collection and the dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param dictDataPKs the primary keys of the dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeDictDatas(long pk, long[] dictDataPKs)
		throws SystemException {
		for (long dictDataPK : dictDataPKs) {
			dictCollectionToDictDataTableMapper.deleteTableMapping(pk,
				dictDataPK);
		}
	}

	/**
	 * Removes the association between the dictionary collection and the dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param dictDatas the dictionary datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeDictDatas(long pk,
		List<org.oep.datamgt.model.DictData> dictDatas)
		throws SystemException {
		for (org.oep.datamgt.model.DictData dictData : dictDatas) {
			dictCollectionToDictDataTableMapper.deleteTableMapping(pk,
				dictData.getPrimaryKey());
		}
	}

	/**
	 * Sets the dictionary datas associated with the dictionary collection, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param dictDataPKs the primary keys of the dictionary datas to be associated with the dictionary collection
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setDictDatas(long pk, long[] dictDataPKs)
		throws SystemException {
		Set<Long> newDictDataPKsSet = SetUtil.fromArray(dictDataPKs);
		Set<Long> oldDictDataPKsSet = SetUtil.fromArray(dictCollectionToDictDataTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeDictDataPKsSet = new HashSet<Long>(oldDictDataPKsSet);

		removeDictDataPKsSet.removeAll(newDictDataPKsSet);

		for (long removeDictDataPK : removeDictDataPKsSet) {
			dictCollectionToDictDataTableMapper.deleteTableMapping(pk,
				removeDictDataPK);
		}

		newDictDataPKsSet.removeAll(oldDictDataPKsSet);

		for (long newDictDataPK : newDictDataPKsSet) {
			dictCollectionToDictDataTableMapper.addTableMapping(pk,
				newDictDataPK);
		}
	}

	/**
	 * Sets the dictionary datas associated with the dictionary collection, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the dictionary collection
	 * @param dictDatas the dictionary datas to be associated with the dictionary collection
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setDictDatas(long pk,
		List<org.oep.datamgt.model.DictData> dictDatas)
		throws SystemException {
		try {
			long[] dictDataPKs = new long[dictDatas.size()];

			for (int i = 0; i < dictDatas.size(); i++) {
				org.oep.datamgt.model.DictData dictData = dictDatas.get(i);

				dictDataPKs[i] = dictData.getPrimaryKey();
			}

			setDictDatas(pk, dictDataPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(DictCollectionModelImpl.MAPPING_TABLE_OEP_DATAMGT_DICTDATA2COLLECTION_NAME);
		}
	}

	/**
	 * Initializes the dictionary collection persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.datamgt.model.DictCollection")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DictCollection>> listenersList = new ArrayList<ModelListener<DictCollection>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DictCollection>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		dictCollectionToDictDataTableMapper = TableMapperFactory.getTableMapper("oep_datamgt_dictdata2collection",
				"dictCollectionId", "dictDataId", this, dictDataPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DictCollectionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = DictDataPersistence.class)
	protected DictDataPersistence dictDataPersistence;
	protected TableMapper<DictCollection, org.oep.datamgt.model.DictData> dictCollectionToDictDataTableMapper;
	private static final String _SQL_SELECT_DICTCOLLECTION = "SELECT dictCollection FROM DictCollection dictCollection";
	private static final String _SQL_SELECT_DICTCOLLECTION_WHERE = "SELECT dictCollection FROM DictCollection dictCollection WHERE ";
	private static final String _SQL_COUNT_DICTCOLLECTION = "SELECT COUNT(dictCollection) FROM DictCollection dictCollection";
	private static final String _SQL_COUNT_DICTCOLLECTION_WHERE = "SELECT COUNT(dictCollection) FROM DictCollection dictCollection WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dictCollection.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DictCollection exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DictCollection exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DictCollectionPersistenceImpl.class);
	private static DictCollection _nullDictCollection = new DictCollectionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DictCollection> toCacheModel() {
				return _nullDictCollectionCacheModel;
			}
		};

	private static CacheModel<DictCollection> _nullDictCollectionCacheModel = new CacheModel<DictCollection>() {
			@Override
			public DictCollection toEntityModel() {
				return _nullDictCollection;
			}
		};
}