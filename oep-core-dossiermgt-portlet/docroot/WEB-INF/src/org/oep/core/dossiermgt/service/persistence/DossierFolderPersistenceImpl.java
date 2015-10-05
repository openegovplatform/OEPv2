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

import org.oep.core.dossiermgt.NoSuchDossierFolderException;
import org.oep.core.dossiermgt.model.DossierFolder;
import org.oep.core.dossiermgt.model.impl.DossierFolderImpl;
import org.oep.core.dossiermgt.model.impl.DossierFolderModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dossier folder service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierFolderPersistence
 * @see DossierFolderUtil
 * @generated
 */
public class DossierFolderPersistenceImpl extends BasePersistenceImpl<DossierFolder>
	implements DossierFolderPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierFolderUtil} to access the dossier folder persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierFolderImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolderModelImpl.FINDER_CACHE_ENABLED,
			DossierFolderImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolderModelImpl.FINDER_CACHE_ENABLED,
			DossierFolderImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolderModelImpl.FINDER_CACHE_ENABLED,
			DossierFolderImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolderModelImpl.FINDER_CACHE_ENABLED,
			DossierFolderImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid", new String[] { String.class.getName() },
			DossierFolderModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dossier folders where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dossier folders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFolder> findByUuid(String uuid)
		throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier folders where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dossier folders
	 * @param end the upper bound of the range of dossier folders (not inclusive)
	 * @return the range of matching dossier folders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFolder> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier folders where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dossier folders
	 * @param end the upper bound of the range of dossier folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier folders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFolder> findByUuid(String uuid, int start, int end,
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

		List<DossierFolder> list = (List<DossierFolder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierFolder dossierFolder : list) {
				if (!Validator.equals(uuid, dossierFolder.getUuid())) {
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

			query.append(_SQL_SELECT_DOSSIERFOLDER_WHERE);

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
				query.append(DossierFolderModelImpl.ORDER_BY_JPQL);
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
					list = (List<DossierFolder>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierFolder>(list);
				}
				else {
					list = (List<DossierFolder>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier folder in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier folder
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolderException if a matching dossier folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFolderException, SystemException {
		DossierFolder dossierFolder = fetchByUuid_First(uuid, orderByComparator);

		if (dossierFolder != null) {
			return dossierFolder;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFolderException(msg.toString());
	}

	/**
	 * Returns the first dossier folder in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier folder, or <code>null</code> if a matching dossier folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierFolder> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier folder in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier folder
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolderException if a matching dossier folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFolderException, SystemException {
		DossierFolder dossierFolder = fetchByUuid_Last(uuid, orderByComparator);

		if (dossierFolder != null) {
			return dossierFolder;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFolderException(msg.toString());
	}

	/**
	 * Returns the last dossier folder in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier folder, or <code>null</code> if a matching dossier folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DossierFolder> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier folders before and after the current dossier folder in the ordered set where uuid = &#63;.
	 *
	 * @param dossierFolderId the primary key of the current dossier folder
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier folder
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolderException if a dossier folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder[] findByUuid_PrevAndNext(long dossierFolderId,
		String uuid, OrderByComparator orderByComparator)
		throws NoSuchDossierFolderException, SystemException {
		DossierFolder dossierFolder = findByPrimaryKey(dossierFolderId);

		Session session = null;

		try {
			session = openSession();

			DossierFolder[] array = new DossierFolderImpl[3];

			array[0] = getByUuid_PrevAndNext(session, dossierFolder, uuid,
					orderByComparator, true);

			array[1] = dossierFolder;

			array[2] = getByUuid_PrevAndNext(session, dossierFolder, uuid,
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

	protected DossierFolder getByUuid_PrevAndNext(Session session,
		DossierFolder dossierFolder, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERFOLDER_WHERE);

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
			query.append(DossierFolderModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dossierFolder);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierFolder> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier folders where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (DossierFolder dossierFolder : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dossierFolder);
		}
	}

	/**
	 * Returns the number of dossier folders where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dossier folders
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

			query.append(_SQL_COUNT_DOSSIERFOLDER_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "dossierFolder.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "dossierFolder.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(dossierFolder.uuid IS NULL OR dossierFolder.uuid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolderModelImpl.FINDER_CACHE_ENABLED,
			DossierFolderImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolderModelImpl.FINDER_CACHE_ENABLED,
			DossierFolderImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			DossierFolderModelImpl.UUID_COLUMN_BITMASK |
			DossierFolderModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dossier folders where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dossier folders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFolder> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier folders where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dossier folders
	 * @param end the upper bound of the range of dossier folders (not inclusive)
	 * @return the range of matching dossier folders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFolder> findByUuid_C(String uuid, long companyId,
		int start, int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier folders where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dossier folders
	 * @param end the upper bound of the range of dossier folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier folders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFolder> findByUuid_C(String uuid, long companyId,
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

		List<DossierFolder> list = (List<DossierFolder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierFolder dossierFolder : list) {
				if (!Validator.equals(uuid, dossierFolder.getUuid()) ||
						(companyId != dossierFolder.getCompanyId())) {
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

			query.append(_SQL_SELECT_DOSSIERFOLDER_WHERE);

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
				query.append(DossierFolderModelImpl.ORDER_BY_JPQL);
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
					list = (List<DossierFolder>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierFolder>(list);
				}
				else {
					list = (List<DossierFolder>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier folder in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier folder
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolderException if a matching dossier folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFolderException, SystemException {
		DossierFolder dossierFolder = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (dossierFolder != null) {
			return dossierFolder;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFolderException(msg.toString());
	}

	/**
	 * Returns the first dossier folder in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier folder, or <code>null</code> if a matching dossier folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierFolder> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier folder in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier folder
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolderException if a matching dossier folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFolderException, SystemException {
		DossierFolder dossierFolder = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (dossierFolder != null) {
			return dossierFolder;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFolderException(msg.toString());
	}

	/**
	 * Returns the last dossier folder in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier folder, or <code>null</code> if a matching dossier folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<DossierFolder> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier folders before and after the current dossier folder in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param dossierFolderId the primary key of the current dossier folder
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier folder
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolderException if a dossier folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder[] findByUuid_C_PrevAndNext(long dossierFolderId,
		String uuid, long companyId, OrderByComparator orderByComparator)
		throws NoSuchDossierFolderException, SystemException {
		DossierFolder dossierFolder = findByPrimaryKey(dossierFolderId);

		Session session = null;

		try {
			session = openSession();

			DossierFolder[] array = new DossierFolderImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, dossierFolder, uuid,
					companyId, orderByComparator, true);

			array[1] = dossierFolder;

			array[2] = getByUuid_C_PrevAndNext(session, dossierFolder, uuid,
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

	protected DossierFolder getByUuid_C_PrevAndNext(Session session,
		DossierFolder dossierFolder, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERFOLDER_WHERE);

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
			query.append(DossierFolderModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dossierFolder);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierFolder> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier folders where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (DossierFolder dossierFolder : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierFolder);
		}
	}

	/**
	 * Returns the number of dossier folders where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dossier folders
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

			query.append(_SQL_COUNT_DOSSIERFOLDER_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "dossierFolder.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "dossierFolder.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(dossierFolder.uuid IS NULL OR dossierFolder.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "dossierFolder.companyId = ?";

	public DossierFolderPersistenceImpl() {
		setModelClass(DossierFolder.class);
	}

	/**
	 * Caches the dossier folder in the entity cache if it is enabled.
	 *
	 * @param dossierFolder the dossier folder
	 */
	@Override
	public void cacheResult(DossierFolder dossierFolder) {
		EntityCacheUtil.putResult(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolderImpl.class, dossierFolder.getPrimaryKey(),
			dossierFolder);

		dossierFolder.resetOriginalValues();
	}

	/**
	 * Caches the dossier folders in the entity cache if it is enabled.
	 *
	 * @param dossierFolders the dossier folders
	 */
	@Override
	public void cacheResult(List<DossierFolder> dossierFolders) {
		for (DossierFolder dossierFolder : dossierFolders) {
			if (EntityCacheUtil.getResult(
						DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
						DossierFolderImpl.class, dossierFolder.getPrimaryKey()) == null) {
				cacheResult(dossierFolder);
			}
			else {
				dossierFolder.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier folders.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierFolderImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierFolderImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier folder.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierFolder dossierFolder) {
		EntityCacheUtil.removeResult(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolderImpl.class, dossierFolder.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierFolder> dossierFolders) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierFolder dossierFolder : dossierFolders) {
			EntityCacheUtil.removeResult(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
				DossierFolderImpl.class, dossierFolder.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier folder with the primary key. Does not add the dossier folder to the database.
	 *
	 * @param dossierFolderId the primary key for the new dossier folder
	 * @return the new dossier folder
	 */
	@Override
	public DossierFolder create(long dossierFolderId) {
		DossierFolder dossierFolder = new DossierFolderImpl();

		dossierFolder.setNew(true);
		dossierFolder.setPrimaryKey(dossierFolderId);

		String uuid = PortalUUIDUtil.generate();

		dossierFolder.setUuid(uuid);

		return dossierFolder;
	}

	/**
	 * Removes the dossier folder with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierFolderId the primary key of the dossier folder
	 * @return the dossier folder that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolderException if a dossier folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder remove(long dossierFolderId)
		throws NoSuchDossierFolderException, SystemException {
		return remove((Serializable)dossierFolderId);
	}

	/**
	 * Removes the dossier folder with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier folder
	 * @return the dossier folder that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolderException if a dossier folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder remove(Serializable primaryKey)
		throws NoSuchDossierFolderException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierFolder dossierFolder = (DossierFolder)session.get(DossierFolderImpl.class,
					primaryKey);

			if (dossierFolder == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierFolderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierFolder);
		}
		catch (NoSuchDossierFolderException nsee) {
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
	protected DossierFolder removeImpl(DossierFolder dossierFolder)
		throws SystemException {
		dossierFolder = toUnwrappedModel(dossierFolder);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierFolder)) {
				dossierFolder = (DossierFolder)session.get(DossierFolderImpl.class,
						dossierFolder.getPrimaryKeyObj());
			}

			if (dossierFolder != null) {
				session.delete(dossierFolder);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierFolder != null) {
			clearCache(dossierFolder);
		}

		return dossierFolder;
	}

	@Override
	public DossierFolder updateImpl(
		org.oep.core.dossiermgt.model.DossierFolder dossierFolder)
		throws SystemException {
		dossierFolder = toUnwrappedModel(dossierFolder);

		boolean isNew = dossierFolder.isNew();

		DossierFolderModelImpl dossierFolderModelImpl = (DossierFolderModelImpl)dossierFolder;

		if (Validator.isNull(dossierFolder.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			dossierFolder.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (dossierFolder.isNew()) {
				session.save(dossierFolder);

				dossierFolder.setNew(false);
			}
			else {
				session.merge(dossierFolder);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DossierFolderModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dossierFolderModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierFolderModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { dossierFolderModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((dossierFolderModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierFolderModelImpl.getOriginalUuid(),
						dossierFolderModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						dossierFolderModelImpl.getUuid(),
						dossierFolderModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		EntityCacheUtil.putResult(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
			DossierFolderImpl.class, dossierFolder.getPrimaryKey(),
			dossierFolder);

		return dossierFolder;
	}

	protected DossierFolder toUnwrappedModel(DossierFolder dossierFolder) {
		if (dossierFolder instanceof DossierFolderImpl) {
			return dossierFolder;
		}

		DossierFolderImpl dossierFolderImpl = new DossierFolderImpl();

		dossierFolderImpl.setNew(dossierFolder.isNew());
		dossierFolderImpl.setPrimaryKey(dossierFolder.getPrimaryKey());

		dossierFolderImpl.setUuid(dossierFolder.getUuid());
		dossierFolderImpl.setDossierFolderId(dossierFolder.getDossierFolderId());
		dossierFolderImpl.setCompanyId(dossierFolder.getCompanyId());
		dossierFolderImpl.setCreateDate(dossierFolder.getCreateDate());
		dossierFolderImpl.setModifiedDate(dossierFolder.getModifiedDate());
		dossierFolderImpl.setFolderName(dossierFolder.getFolderName());
		dossierFolderImpl.setParentDossierFolderId(dossierFolder.getParentDossierFolderId());
		dossierFolderImpl.setSequenceNo(dossierFolder.getSequenceNo());
		dossierFolderImpl.setProcedureFilter(dossierFolder.getProcedureFilter());
		dossierFolderImpl.setStatusFilter(dossierFolder.getStatusFilter());
		dossierFolderImpl.setFilterByOrganization(dossierFolder.getFilterByOrganization());
		dossierFolderImpl.setFilterByUser(dossierFolder.getFilterByUser());

		return dossierFolderImpl;
	}

	/**
	 * Returns the dossier folder with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier folder
	 * @return the dossier folder
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolderException if a dossier folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierFolderException, SystemException {
		DossierFolder dossierFolder = fetchByPrimaryKey(primaryKey);

		if (dossierFolder == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierFolderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierFolder;
	}

	/**
	 * Returns the dossier folder with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierFolderException} if it could not be found.
	 *
	 * @param dossierFolderId the primary key of the dossier folder
	 * @return the dossier folder
	 * @throws org.oep.core.dossiermgt.NoSuchDossierFolderException if a dossier folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder findByPrimaryKey(long dossierFolderId)
		throws NoSuchDossierFolderException, SystemException {
		return findByPrimaryKey((Serializable)dossierFolderId);
	}

	/**
	 * Returns the dossier folder with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier folder
	 * @return the dossier folder, or <code>null</code> if a dossier folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierFolder dossierFolder = (DossierFolder)EntityCacheUtil.getResult(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
				DossierFolderImpl.class, primaryKey);

		if (dossierFolder == _nullDossierFolder) {
			return null;
		}

		if (dossierFolder == null) {
			Session session = null;

			try {
				session = openSession();

				dossierFolder = (DossierFolder)session.get(DossierFolderImpl.class,
						primaryKey);

				if (dossierFolder != null) {
					cacheResult(dossierFolder);
				}
				else {
					EntityCacheUtil.putResult(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
						DossierFolderImpl.class, primaryKey, _nullDossierFolder);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierFolderModelImpl.ENTITY_CACHE_ENABLED,
					DossierFolderImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierFolder;
	}

	/**
	 * Returns the dossier folder with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierFolderId the primary key of the dossier folder
	 * @return the dossier folder, or <code>null</code> if a dossier folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFolder fetchByPrimaryKey(long dossierFolderId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierFolderId);
	}

	/**
	 * Returns all the dossier folders.
	 *
	 * @return the dossier folders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFolder> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier folders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier folders
	 * @param end the upper bound of the range of dossier folders (not inclusive)
	 * @return the range of dossier folders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFolder> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier folders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier folders
	 * @param end the upper bound of the range of dossier folders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier folders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFolder> findAll(int start, int end,
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

		List<DossierFolder> list = (List<DossierFolder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERFOLDER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERFOLDER;

				if (pagination) {
					sql = sql.concat(DossierFolderModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierFolder>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierFolder>(list);
				}
				else {
					list = (List<DossierFolder>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dossier folders from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierFolder dossierFolder : findAll()) {
			remove(dossierFolder);
		}
	}

	/**
	 * Returns the number of dossier folders.
	 *
	 * @return the number of dossier folders
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERFOLDER);

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
	 * Initializes the dossier folder persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.DossierFolder")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierFolder>> listenersList = new ArrayList<ModelListener<DossierFolder>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierFolder>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierFolderImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERFOLDER = "SELECT dossierFolder FROM DossierFolder dossierFolder";
	private static final String _SQL_SELECT_DOSSIERFOLDER_WHERE = "SELECT dossierFolder FROM DossierFolder dossierFolder WHERE ";
	private static final String _SQL_COUNT_DOSSIERFOLDER = "SELECT COUNT(dossierFolder) FROM DossierFolder dossierFolder";
	private static final String _SQL_COUNT_DOSSIERFOLDER_WHERE = "SELECT COUNT(dossierFolder) FROM DossierFolder dossierFolder WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierFolder.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierFolder exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DossierFolder exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierFolderPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static DossierFolder _nullDossierFolder = new DossierFolderImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierFolder> toCacheModel() {
				return _nullDossierFolderCacheModel;
			}
		};

	private static CacheModel<DossierFolder> _nullDossierFolderCacheModel = new CacheModel<DossierFolder>() {
			@Override
			public DossierFolder toEntityModel() {
				return _nullDossierFolder;
			}
		};
}