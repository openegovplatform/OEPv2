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

package org.oep.dossiermgt.service.persistence;

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
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.dossiermgt.NoSuchDocFileVersionException;
import org.oep.dossiermgt.model.DocFileVersion;
import org.oep.dossiermgt.model.impl.DocFileVersionImpl;
import org.oep.dossiermgt.model.impl.DocFileVersionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the doc file version service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DocFileVersionPersistence
 * @see DocFileVersionUtil
 * @generated
 */
public class DocFileVersionPersistenceImpl extends BasePersistenceImpl<DocFileVersion>
	implements DocFileVersionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DocFileVersionUtil} to access the doc file version persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DocFileVersionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionModelImpl.FINDER_CACHE_ENABLED,
			DocFileVersionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionModelImpl.FINDER_CACHE_ENABLED,
			DocFileVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionModelImpl.FINDER_CACHE_ENABLED,
			DocFileVersionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionModelImpl.FINDER_CACHE_ENABLED,
			DocFileVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			DocFileVersionModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the doc file versions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching doc file versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocFileVersion> findByUuid(String uuid)
		throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the doc file versions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of doc file versions
	 * @param end the upper bound of the range of doc file versions (not inclusive)
	 * @return the range of matching doc file versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocFileVersion> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the doc file versions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of doc file versions
	 * @param end the upper bound of the range of doc file versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching doc file versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocFileVersion> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<DocFileVersion> list = (List<DocFileVersion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocFileVersion docFileVersion : list) {
				if (!Validator.equals(uuid, docFileVersion.getUuid())) {
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

			query.append(_SQL_SELECT_DOCFILEVERSION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocFileVersionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<DocFileVersion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocFileVersion>(list);
				}
				else {
					list = (List<DocFileVersion>)QueryUtil.list(q,
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
	 * Returns the first doc file version in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching doc file version
	 * @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a matching doc file version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchDocFileVersionException, SystemException {
		DocFileVersion docFileVersion = fetchByUuid_First(uuid,
				orderByComparator);

		if (docFileVersion != null) {
			return docFileVersion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocFileVersionException(msg.toString());
	}

	/**
	 * Returns the first doc file version in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching doc file version, or <code>null</code> if a matching doc file version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<DocFileVersion> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last doc file version in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching doc file version
	 * @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a matching doc file version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchDocFileVersionException, SystemException {
		DocFileVersion docFileVersion = fetchByUuid_Last(uuid, orderByComparator);

		if (docFileVersion != null) {
			return docFileVersion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocFileVersionException(msg.toString());
	}

	/**
	 * Returns the last doc file version in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching doc file version, or <code>null</code> if a matching doc file version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DocFileVersion> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the doc file versions before and after the current doc file version in the ordered set where uuid = &#63;.
	 *
	 * @param docFileVersionId the primary key of the current doc file version
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next doc file version
	 * @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a doc file version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion[] findByUuid_PrevAndNext(long docFileVersionId,
		String uuid, OrderByComparator orderByComparator)
		throws NoSuchDocFileVersionException, SystemException {
		DocFileVersion docFileVersion = findByPrimaryKey(docFileVersionId);

		Session session = null;

		try {
			session = openSession();

			DocFileVersion[] array = new DocFileVersionImpl[3];

			array[0] = getByUuid_PrevAndNext(session, docFileVersion, uuid,
					orderByComparator, true);

			array[1] = docFileVersion;

			array[2] = getByUuid_PrevAndNext(session, docFileVersion, uuid,
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

	protected DocFileVersion getByUuid_PrevAndNext(Session session,
		DocFileVersion docFileVersion, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCFILEVERSION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
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
			query.append(DocFileVersionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(docFileVersion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocFileVersion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the doc file versions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (DocFileVersion docFileVersion : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(docFileVersion);
		}
	}

	/**
	 * Returns the number of doc file versions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching doc file versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCFILEVERSION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "docFileVersion.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "docFileVersion.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(docFileVersion.uuid IS NULL OR docFileVersion.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionModelImpl.FINDER_CACHE_ENABLED,
			DocFileVersionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			DocFileVersionModelImpl.UUID_COLUMN_BITMASK |
			DocFileVersionModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the doc file version where uuid = &#63; and groupId = &#63; or throws a {@link org.oep.dossiermgt.NoSuchDocFileVersionException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching doc file version
	 * @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a matching doc file version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion findByUUID_G(String uuid, long groupId)
		throws NoSuchDocFileVersionException, SystemException {
		DocFileVersion docFileVersion = fetchByUUID_G(uuid, groupId);

		if (docFileVersion == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDocFileVersionException(msg.toString());
		}

		return docFileVersion;
	}

	/**
	 * Returns the doc file version where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching doc file version, or <code>null</code> if a matching doc file version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the doc file version where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching doc file version, or <code>null</code> if a matching doc file version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof DocFileVersion) {
			DocFileVersion docFileVersion = (DocFileVersion)result;

			if (!Validator.equals(uuid, docFileVersion.getUuid()) ||
					(groupId != docFileVersion.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DOCFILEVERSION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<DocFileVersion> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					DocFileVersion docFileVersion = list.get(0);

					result = docFileVersion;

					cacheResult(docFileVersion);

					if ((docFileVersion.getUuid() == null) ||
							!docFileVersion.getUuid().equals(uuid) ||
							(docFileVersion.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, docFileVersion);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
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
			return (DocFileVersion)result;
		}
	}

	/**
	 * Removes the doc file version where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the doc file version that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion removeByUUID_G(String uuid, long groupId)
		throws NoSuchDocFileVersionException, SystemException {
		DocFileVersion docFileVersion = findByUUID_G(uuid, groupId);

		return remove(docFileVersion);
	}

	/**
	 * Returns the number of doc file versions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching doc file versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOCFILEVERSION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "docFileVersion.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "docFileVersion.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(docFileVersion.uuid IS NULL OR docFileVersion.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "docFileVersion.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionModelImpl.FINDER_CACHE_ENABLED,
			DocFileVersionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionModelImpl.FINDER_CACHE_ENABLED,
			DocFileVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			DocFileVersionModelImpl.UUID_COLUMN_BITMASK |
			DocFileVersionModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the doc file versions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching doc file versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocFileVersion> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the doc file versions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of doc file versions
	 * @param end the upper bound of the range of doc file versions (not inclusive)
	 * @return the range of matching doc file versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocFileVersion> findByUuid_C(String uuid, long companyId,
		int start, int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the doc file versions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of doc file versions
	 * @param end the upper bound of the range of doc file versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching doc file versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocFileVersion> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<DocFileVersion> list = (List<DocFileVersion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocFileVersion docFileVersion : list) {
				if (!Validator.equals(uuid, docFileVersion.getUuid()) ||
						(companyId != docFileVersion.getCompanyId())) {
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

			query.append(_SQL_SELECT_DOCFILEVERSION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocFileVersionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<DocFileVersion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocFileVersion>(list);
				}
				else {
					list = (List<DocFileVersion>)QueryUtil.list(q,
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
	 * Returns the first doc file version in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching doc file version
	 * @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a matching doc file version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDocFileVersionException, SystemException {
		DocFileVersion docFileVersion = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (docFileVersion != null) {
			return docFileVersion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocFileVersionException(msg.toString());
	}

	/**
	 * Returns the first doc file version in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching doc file version, or <code>null</code> if a matching doc file version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DocFileVersion> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last doc file version in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching doc file version
	 * @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a matching doc file version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDocFileVersionException, SystemException {
		DocFileVersion docFileVersion = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (docFileVersion != null) {
			return docFileVersion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocFileVersionException(msg.toString());
	}

	/**
	 * Returns the last doc file version in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching doc file version, or <code>null</code> if a matching doc file version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<DocFileVersion> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the doc file versions before and after the current doc file version in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param docFileVersionId the primary key of the current doc file version
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next doc file version
	 * @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a doc file version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion[] findByUuid_C_PrevAndNext(long docFileVersionId,
		String uuid, long companyId, OrderByComparator orderByComparator)
		throws NoSuchDocFileVersionException, SystemException {
		DocFileVersion docFileVersion = findByPrimaryKey(docFileVersionId);

		Session session = null;

		try {
			session = openSession();

			DocFileVersion[] array = new DocFileVersionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, docFileVersion, uuid,
					companyId, orderByComparator, true);

			array[1] = docFileVersion;

			array[2] = getByUuid_C_PrevAndNext(session, docFileVersion, uuid,
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

	protected DocFileVersion getByUuid_C_PrevAndNext(Session session,
		DocFileVersion docFileVersion, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCFILEVERSION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(DocFileVersionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(docFileVersion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocFileVersion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the doc file versions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (DocFileVersion docFileVersion : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(docFileVersion);
		}
	}

	/**
	 * Returns the number of doc file versions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching doc file versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOCFILEVERSION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "docFileVersion.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "docFileVersion.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(docFileVersion.uuid IS NULL OR docFileVersion.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "docFileVersion.companyId = ?";

	public DocFileVersionPersistenceImpl() {
		setModelClass(DocFileVersion.class);
	}

	/**
	 * Caches the doc file version in the entity cache if it is enabled.
	 *
	 * @param docFileVersion the doc file version
	 */
	@Override
	public void cacheResult(DocFileVersion docFileVersion) {
		EntityCacheUtil.putResult(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionImpl.class, docFileVersion.getPrimaryKey(),
			docFileVersion);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { docFileVersion.getUuid(), docFileVersion.getGroupId() },
			docFileVersion);

		docFileVersion.resetOriginalValues();
	}

	/**
	 * Caches the doc file versions in the entity cache if it is enabled.
	 *
	 * @param docFileVersions the doc file versions
	 */
	@Override
	public void cacheResult(List<DocFileVersion> docFileVersions) {
		for (DocFileVersion docFileVersion : docFileVersions) {
			if (EntityCacheUtil.getResult(
						DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
						DocFileVersionImpl.class, docFileVersion.getPrimaryKey()) == null) {
				cacheResult(docFileVersion);
			}
			else {
				docFileVersion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all doc file versions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DocFileVersionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DocFileVersionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the doc file version.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DocFileVersion docFileVersion) {
		EntityCacheUtil.removeResult(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionImpl.class, docFileVersion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(docFileVersion);
	}

	@Override
	public void clearCache(List<DocFileVersion> docFileVersions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DocFileVersion docFileVersion : docFileVersions) {
			EntityCacheUtil.removeResult(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
				DocFileVersionImpl.class, docFileVersion.getPrimaryKey());

			clearUniqueFindersCache(docFileVersion);
		}
	}

	protected void cacheUniqueFindersCache(DocFileVersion docFileVersion) {
		if (docFileVersion.isNew()) {
			Object[] args = new Object[] {
					docFileVersion.getUuid(), docFileVersion.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				docFileVersion);
		}
		else {
			DocFileVersionModelImpl docFileVersionModelImpl = (DocFileVersionModelImpl)docFileVersion;

			if ((docFileVersionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						docFileVersion.getUuid(), docFileVersion.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					docFileVersion);
			}
		}
	}

	protected void clearUniqueFindersCache(DocFileVersion docFileVersion) {
		DocFileVersionModelImpl docFileVersionModelImpl = (DocFileVersionModelImpl)docFileVersion;

		Object[] args = new Object[] {
				docFileVersion.getUuid(), docFileVersion.getGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((docFileVersionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					docFileVersionModelImpl.getOriginalUuid(),
					docFileVersionModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new doc file version with the primary key. Does not add the doc file version to the database.
	 *
	 * @param docFileVersionId the primary key for the new doc file version
	 * @return the new doc file version
	 */
	@Override
	public DocFileVersion create(long docFileVersionId) {
		DocFileVersion docFileVersion = new DocFileVersionImpl();

		docFileVersion.setNew(true);
		docFileVersion.setPrimaryKey(docFileVersionId);

		String uuid = PortalUUIDUtil.generate();

		docFileVersion.setUuid(uuid);

		return docFileVersion;
	}

	/**
	 * Removes the doc file version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docFileVersionId the primary key of the doc file version
	 * @return the doc file version that was removed
	 * @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a doc file version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion remove(long docFileVersionId)
		throws NoSuchDocFileVersionException, SystemException {
		return remove((Serializable)docFileVersionId);
	}

	/**
	 * Removes the doc file version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the doc file version
	 * @return the doc file version that was removed
	 * @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a doc file version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion remove(Serializable primaryKey)
		throws NoSuchDocFileVersionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DocFileVersion docFileVersion = (DocFileVersion)session.get(DocFileVersionImpl.class,
					primaryKey);

			if (docFileVersion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocFileVersionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(docFileVersion);
		}
		catch (NoSuchDocFileVersionException nsee) {
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
	protected DocFileVersion removeImpl(DocFileVersion docFileVersion)
		throws SystemException {
		docFileVersion = toUnwrappedModel(docFileVersion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(docFileVersion)) {
				docFileVersion = (DocFileVersion)session.get(DocFileVersionImpl.class,
						docFileVersion.getPrimaryKeyObj());
			}

			if (docFileVersion != null) {
				session.delete(docFileVersion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (docFileVersion != null) {
			clearCache(docFileVersion);
		}

		return docFileVersion;
	}

	@Override
	public DocFileVersion updateImpl(
		org.oep.dossiermgt.model.DocFileVersion docFileVersion)
		throws SystemException {
		docFileVersion = toUnwrappedModel(docFileVersion);

		boolean isNew = docFileVersion.isNew();

		DocFileVersionModelImpl docFileVersionModelImpl = (DocFileVersionModelImpl)docFileVersion;

		if (Validator.isNull(docFileVersion.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			docFileVersion.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (docFileVersion.isNew()) {
				session.save(docFileVersion);

				docFileVersion.setNew(false);
			}
			else {
				session.merge(docFileVersion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DocFileVersionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((docFileVersionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						docFileVersionModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { docFileVersionModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((docFileVersionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						docFileVersionModelImpl.getOriginalUuid(),
						docFileVersionModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						docFileVersionModelImpl.getUuid(),
						docFileVersionModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		EntityCacheUtil.putResult(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
			DocFileVersionImpl.class, docFileVersion.getPrimaryKey(),
			docFileVersion);

		clearUniqueFindersCache(docFileVersion);
		cacheUniqueFindersCache(docFileVersion);

		return docFileVersion;
	}

	protected DocFileVersion toUnwrappedModel(DocFileVersion docFileVersion) {
		if (docFileVersion instanceof DocFileVersionImpl) {
			return docFileVersion;
		}

		DocFileVersionImpl docFileVersionImpl = new DocFileVersionImpl();

		docFileVersionImpl.setNew(docFileVersion.isNew());
		docFileVersionImpl.setPrimaryKey(docFileVersion.getPrimaryKey());

		docFileVersionImpl.setUuid(docFileVersion.getUuid());
		docFileVersionImpl.setDocFileVersionId(docFileVersion.getDocFileVersionId());
		docFileVersionImpl.setUserId(docFileVersion.getUserId());
		docFileVersionImpl.setGroupId(docFileVersion.getGroupId());
		docFileVersionImpl.setCompanyId(docFileVersion.getCompanyId());
		docFileVersionImpl.setCreateDate(docFileVersion.getCreateDate());
		docFileVersionImpl.setDocFileId(docFileVersion.getDocFileId());
		docFileVersionImpl.setFileEntryId(docFileVersion.getFileEntryId());
		docFileVersionImpl.setXmlContent(docFileVersion.getXmlContent());
		docFileVersionImpl.setEbMessageId(docFileVersion.getEbMessageId());

		return docFileVersionImpl;
	}

	/**
	 * Returns the doc file version with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the doc file version
	 * @return the doc file version
	 * @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a doc file version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocFileVersionException, SystemException {
		DocFileVersion docFileVersion = fetchByPrimaryKey(primaryKey);

		if (docFileVersion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocFileVersionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return docFileVersion;
	}

	/**
	 * Returns the doc file version with the primary key or throws a {@link org.oep.dossiermgt.NoSuchDocFileVersionException} if it could not be found.
	 *
	 * @param docFileVersionId the primary key of the doc file version
	 * @return the doc file version
	 * @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a doc file version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion findByPrimaryKey(long docFileVersionId)
		throws NoSuchDocFileVersionException, SystemException {
		return findByPrimaryKey((Serializable)docFileVersionId);
	}

	/**
	 * Returns the doc file version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the doc file version
	 * @return the doc file version, or <code>null</code> if a doc file version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DocFileVersion docFileVersion = (DocFileVersion)EntityCacheUtil.getResult(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
				DocFileVersionImpl.class, primaryKey);

		if (docFileVersion == _nullDocFileVersion) {
			return null;
		}

		if (docFileVersion == null) {
			Session session = null;

			try {
				session = openSession();

				docFileVersion = (DocFileVersion)session.get(DocFileVersionImpl.class,
						primaryKey);

				if (docFileVersion != null) {
					cacheResult(docFileVersion);
				}
				else {
					EntityCacheUtil.putResult(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
						DocFileVersionImpl.class, primaryKey,
						_nullDocFileVersion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DocFileVersionModelImpl.ENTITY_CACHE_ENABLED,
					DocFileVersionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return docFileVersion;
	}

	/**
	 * Returns the doc file version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param docFileVersionId the primary key of the doc file version
	 * @return the doc file version, or <code>null</code> if a doc file version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocFileVersion fetchByPrimaryKey(long docFileVersionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)docFileVersionId);
	}

	/**
	 * Returns all the doc file versions.
	 *
	 * @return the doc file versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocFileVersion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the doc file versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of doc file versions
	 * @param end the upper bound of the range of doc file versions (not inclusive)
	 * @return the range of doc file versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocFileVersion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the doc file versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of doc file versions
	 * @param end the upper bound of the range of doc file versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of doc file versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocFileVersion> findAll(int start, int end,
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

		List<DocFileVersion> list = (List<DocFileVersion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCFILEVERSION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCFILEVERSION;

				if (pagination) {
					sql = sql.concat(DocFileVersionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DocFileVersion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocFileVersion>(list);
				}
				else {
					list = (List<DocFileVersion>)QueryUtil.list(q,
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
	 * Removes all the doc file versions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DocFileVersion docFileVersion : findAll()) {
			remove(docFileVersion);
		}
	}

	/**
	 * Returns the number of doc file versions.
	 *
	 * @return the number of doc file versions
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

				Query q = session.createQuery(_SQL_COUNT_DOCFILEVERSION);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the doc file version persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.dossiermgt.model.DocFileVersion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DocFileVersion>> listenersList = new ArrayList<ModelListener<DocFileVersion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DocFileVersion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DocFileVersionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOCFILEVERSION = "SELECT docFileVersion FROM DocFileVersion docFileVersion";
	private static final String _SQL_SELECT_DOCFILEVERSION_WHERE = "SELECT docFileVersion FROM DocFileVersion docFileVersion WHERE ";
	private static final String _SQL_COUNT_DOCFILEVERSION = "SELECT COUNT(docFileVersion) FROM DocFileVersion docFileVersion";
	private static final String _SQL_COUNT_DOCFILEVERSION_WHERE = "SELECT COUNT(docFileVersion) FROM DocFileVersion docFileVersion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "docFileVersion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DocFileVersion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DocFileVersion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DocFileVersionPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static DocFileVersion _nullDocFileVersion = new DocFileVersionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DocFileVersion> toCacheModel() {
				return _nullDocFileVersionCacheModel;
			}
		};

	private static CacheModel<DocFileVersion> _nullDocFileVersionCacheModel = new CacheModel<DocFileVersion>() {
			@Override
			public DocFileVersion toEntityModel() {
				return _nullDocFileVersion;
			}
		};
}