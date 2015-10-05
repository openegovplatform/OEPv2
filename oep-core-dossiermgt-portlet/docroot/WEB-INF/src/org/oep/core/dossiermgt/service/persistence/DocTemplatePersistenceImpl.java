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

import org.oep.core.dossiermgt.NoSuchDocTemplateException;
import org.oep.core.dossiermgt.model.DocTemplate;
import org.oep.core.dossiermgt.model.impl.DocTemplateImpl;
import org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the doc template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DocTemplatePersistence
 * @see DocTemplateUtil
 * @generated
 */
public class DocTemplatePersistenceImpl extends BasePersistenceImpl<DocTemplate>
	implements DocTemplatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DocTemplateUtil} to access the doc template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DocTemplateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, DocTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, DocTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, DocTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, DocTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC",
			new String[] { Long.class.getName() },
			DocTemplateModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the doc templates where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocTemplate> findByC(long companyId) throws SystemException {
		return findByC(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the doc templates where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of doc templates
	 * @param end the upper bound of the range of doc templates (not inclusive)
	 * @return the range of matching doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocTemplate> findByC(long companyId, int start, int end)
		throws SystemException {
		return findByC(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the doc templates where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of doc templates
	 * @param end the upper bound of the range of doc templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocTemplate> findByC(long companyId, int start, int end,
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

		List<DocTemplate> list = (List<DocTemplate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocTemplate docTemplate : list) {
				if ((companyId != docTemplate.getCompanyId())) {
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

			query.append(_SQL_SELECT_DOCTEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocTemplateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<DocTemplate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocTemplate>(list);
				}
				else {
					list = (List<DocTemplate>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first doc template in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching doc template
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate findByC_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDocTemplateException, SystemException {
		DocTemplate docTemplate = fetchByC_First(companyId, orderByComparator);

		if (docTemplate != null) {
			return docTemplate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocTemplateException(msg.toString());
	}

	/**
	 * Returns the first doc template in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching doc template, or <code>null</code> if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate fetchByC_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DocTemplate> list = findByC(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last doc template in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching doc template
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate findByC_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDocTemplateException, SystemException {
		DocTemplate docTemplate = fetchByC_Last(companyId, orderByComparator);

		if (docTemplate != null) {
			return docTemplate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocTemplateException(msg.toString());
	}

	/**
	 * Returns the last doc template in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching doc template, or <code>null</code> if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate fetchByC_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC(companyId);

		if (count == 0) {
			return null;
		}

		List<DocTemplate> list = findByC(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the doc templates before and after the current doc template in the ordered set where companyId = &#63;.
	 *
	 * @param docTemplateId the primary key of the current doc template
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next doc template
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate[] findByC_PrevAndNext(long docTemplateId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchDocTemplateException, SystemException {
		DocTemplate docTemplate = findByPrimaryKey(docTemplateId);

		Session session = null;

		try {
			session = openSession();

			DocTemplate[] array = new DocTemplateImpl[3];

			array[0] = getByC_PrevAndNext(session, docTemplate, companyId,
					orderByComparator, true);

			array[1] = docTemplate;

			array[2] = getByC_PrevAndNext(session, docTemplate, companyId,
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

	protected DocTemplate getByC_PrevAndNext(Session session,
		DocTemplate docTemplate, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCTEMPLATE_WHERE);

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
			query.append(DocTemplateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(docTemplate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocTemplate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the doc templates where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC(long companyId) throws SystemException {
		for (DocTemplate docTemplate : findByC(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(docTemplate);
		}
	}

	/**
	 * Returns the number of doc templates where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching doc templates
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

			query.append(_SQL_COUNT_DOCTEMPLATE_WHERE);

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

	private static final String _FINDER_COLUMN_C_COMPANYID_2 = "docTemplate.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, DocTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, DocTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			DocTemplateModelImpl.COMPANYID_COLUMN_BITMASK |
			DocTemplateModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the doc templates where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocTemplate> findByC_G(long companyId, long groupId)
		throws SystemException {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the doc templates where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of doc templates
	 * @param end the upper bound of the range of doc templates (not inclusive)
	 * @return the range of matching doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocTemplate> findByC_G(long companyId, long groupId, int start,
		int end) throws SystemException {
		return findByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the doc templates where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of doc templates
	 * @param end the upper bound of the range of doc templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocTemplate> findByC_G(long companyId, long groupId, int start,
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

		List<DocTemplate> list = (List<DocTemplate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocTemplate docTemplate : list) {
				if ((companyId != docTemplate.getCompanyId()) ||
						(groupId != docTemplate.getGroupId())) {
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

			query.append(_SQL_SELECT_DOCTEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocTemplateModelImpl.ORDER_BY_JPQL);
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
					list = (List<DocTemplate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocTemplate>(list);
				}
				else {
					list = (List<DocTemplate>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first doc template in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching doc template
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate findByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchDocTemplateException, SystemException {
		DocTemplate docTemplate = fetchByC_G_First(companyId, groupId,
				orderByComparator);

		if (docTemplate != null) {
			return docTemplate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocTemplateException(msg.toString());
	}

	/**
	 * Returns the first doc template in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching doc template, or <code>null</code> if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate fetchByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DocTemplate> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last doc template in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching doc template
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate findByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchDocTemplateException, SystemException {
		DocTemplate docTemplate = fetchByC_G_Last(companyId, groupId,
				orderByComparator);

		if (docTemplate != null) {
			return docTemplate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocTemplateException(msg.toString());
	}

	/**
	 * Returns the last doc template in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching doc template, or <code>null</code> if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate fetchByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_G(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<DocTemplate> list = findByC_G(companyId, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the doc templates before and after the current doc template in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param docTemplateId the primary key of the current doc template
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next doc template
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate[] findByC_G_PrevAndNext(long docTemplateId,
		long companyId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchDocTemplateException, SystemException {
		DocTemplate docTemplate = findByPrimaryKey(docTemplateId);

		Session session = null;

		try {
			session = openSession();

			DocTemplate[] array = new DocTemplateImpl[3];

			array[0] = getByC_G_PrevAndNext(session, docTemplate, companyId,
					groupId, orderByComparator, true);

			array[1] = docTemplate;

			array[2] = getByC_G_PrevAndNext(session, docTemplate, companyId,
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

	protected DocTemplate getByC_G_PrevAndNext(Session session,
		DocTemplate docTemplate, long companyId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCTEMPLATE_WHERE);

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
			query.append(DocTemplateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(docTemplate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocTemplate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the doc templates where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G(long companyId, long groupId)
		throws SystemException {
		for (DocTemplate docTemplate : findByC_G(companyId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(docTemplate);
		}
	}

	/**
	 * Returns the number of doc templates where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching doc templates
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

			query.append(_SQL_COUNT_DOCTEMPLATE_WHERE);

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

	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "docTemplate.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "docTemplate.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_G_TNO = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, DocTemplateImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_G_TNO",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			DocTemplateModelImpl.COMPANYID_COLUMN_BITMASK |
			DocTemplateModelImpl.GROUPID_COLUMN_BITMASK |
			DocTemplateModelImpl.TEMPLATENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_TNO = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_TNO",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns the doc template where companyId = &#63; and groupId = &#63; and templateNo = &#63; or throws a {@link org.oep.core.dossiermgt.NoSuchDocTemplateException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param templateNo the template no
	 * @return the matching doc template
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate findByC_G_TNO(long companyId, long groupId,
		String templateNo) throws NoSuchDocTemplateException, SystemException {
		DocTemplate docTemplate = fetchByC_G_TNO(companyId, groupId, templateNo);

		if (docTemplate == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", templateNo=");
			msg.append(templateNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDocTemplateException(msg.toString());
		}

		return docTemplate;
	}

	/**
	 * Returns the doc template where companyId = &#63; and groupId = &#63; and templateNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param templateNo the template no
	 * @return the matching doc template, or <code>null</code> if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate fetchByC_G_TNO(long companyId, long groupId,
		String templateNo) throws SystemException {
		return fetchByC_G_TNO(companyId, groupId, templateNo, true);
	}

	/**
	 * Returns the doc template where companyId = &#63; and groupId = &#63; and templateNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param templateNo the template no
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching doc template, or <code>null</code> if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate fetchByC_G_TNO(long companyId, long groupId,
		String templateNo, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, templateNo };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_G_TNO,
					finderArgs, this);
		}

		if (result instanceof DocTemplate) {
			DocTemplate docTemplate = (DocTemplate)result;

			if ((companyId != docTemplate.getCompanyId()) ||
					(groupId != docTemplate.getGroupId()) ||
					!Validator.equals(templateNo, docTemplate.getTemplateNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_DOCTEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_C_G_TNO_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_TNO_GROUPID_2);

			boolean bindTemplateNo = false;

			if (templateNo == null) {
				query.append(_FINDER_COLUMN_C_G_TNO_TEMPLATENO_1);
			}
			else if (templateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_G_TNO_TEMPLATENO_3);
			}
			else {
				bindTemplateNo = true;

				query.append(_FINDER_COLUMN_C_G_TNO_TEMPLATENO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (bindTemplateNo) {
					qPos.add(templateNo);
				}

				List<DocTemplate> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_TNO,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DocTemplatePersistenceImpl.fetchByC_G_TNO(long, long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DocTemplate docTemplate = list.get(0);

					result = docTemplate;

					cacheResult(docTemplate);

					if ((docTemplate.getCompanyId() != companyId) ||
							(docTemplate.getGroupId() != groupId) ||
							(docTemplate.getTemplateNo() == null) ||
							!docTemplate.getTemplateNo().equals(templateNo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_TNO,
							finderArgs, docTemplate);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G_TNO,
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
			return (DocTemplate)result;
		}
	}

	/**
	 * Removes the doc template where companyId = &#63; and groupId = &#63; and templateNo = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param templateNo the template no
	 * @return the doc template that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate removeByC_G_TNO(long companyId, long groupId,
		String templateNo) throws NoSuchDocTemplateException, SystemException {
		DocTemplate docTemplate = findByC_G_TNO(companyId, groupId, templateNo);

		return remove(docTemplate);
	}

	/**
	 * Returns the number of doc templates where companyId = &#63; and groupId = &#63; and templateNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param templateNo the template no
	 * @return the number of matching doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G_TNO(long companyId, long groupId, String templateNo)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_TNO;

		Object[] finderArgs = new Object[] { companyId, groupId, templateNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOCTEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_C_G_TNO_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_TNO_GROUPID_2);

			boolean bindTemplateNo = false;

			if (templateNo == null) {
				query.append(_FINDER_COLUMN_C_G_TNO_TEMPLATENO_1);
			}
			else if (templateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_G_TNO_TEMPLATENO_3);
			}
			else {
				bindTemplateNo = true;

				query.append(_FINDER_COLUMN_C_G_TNO_TEMPLATENO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (bindTemplateNo) {
					qPos.add(templateNo);
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

	private static final String _FINDER_COLUMN_C_G_TNO_COMPANYID_2 = "docTemplate.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_TNO_GROUPID_2 = "docTemplate.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_TNO_TEMPLATENO_1 = "docTemplate.templateNo IS NULL";
	private static final String _FINDER_COLUMN_C_G_TNO_TEMPLATENO_2 = "docTemplate.templateNo = ?";
	private static final String _FINDER_COLUMN_C_G_TNO_TEMPLATENO_3 = "(docTemplate.templateNo IS NULL OR docTemplate.templateNo = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_TNO = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, DocTemplateImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_TNO",
			new String[] { Long.class.getName(), String.class.getName() },
			DocTemplateModelImpl.COMPANYID_COLUMN_BITMASK |
			DocTemplateModelImpl.TEMPLATENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_TNO = new FinderPath(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_TNO",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the doc template where companyId = &#63; and templateNo = &#63; or throws a {@link org.oep.core.dossiermgt.NoSuchDocTemplateException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param templateNo the template no
	 * @return the matching doc template
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate findByC_TNO(long companyId, String templateNo)
		throws NoSuchDocTemplateException, SystemException {
		DocTemplate docTemplate = fetchByC_TNO(companyId, templateNo);

		if (docTemplate == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", templateNo=");
			msg.append(templateNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDocTemplateException(msg.toString());
		}

		return docTemplate;
	}

	/**
	 * Returns the doc template where companyId = &#63; and templateNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param templateNo the template no
	 * @return the matching doc template, or <code>null</code> if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate fetchByC_TNO(long companyId, String templateNo)
		throws SystemException {
		return fetchByC_TNO(companyId, templateNo, true);
	}

	/**
	 * Returns the doc template where companyId = &#63; and templateNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param templateNo the template no
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching doc template, or <code>null</code> if a matching doc template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate fetchByC_TNO(long companyId, String templateNo,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { companyId, templateNo };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_TNO,
					finderArgs, this);
		}

		if (result instanceof DocTemplate) {
			DocTemplate docTemplate = (DocTemplate)result;

			if ((companyId != docTemplate.getCompanyId()) ||
					!Validator.equals(templateNo, docTemplate.getTemplateNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DOCTEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_C_TNO_COMPANYID_2);

			boolean bindTemplateNo = false;

			if (templateNo == null) {
				query.append(_FINDER_COLUMN_C_TNO_TEMPLATENO_1);
			}
			else if (templateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_TNO_TEMPLATENO_3);
			}
			else {
				bindTemplateNo = true;

				query.append(_FINDER_COLUMN_C_TNO_TEMPLATENO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindTemplateNo) {
					qPos.add(templateNo);
				}

				List<DocTemplate> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_TNO,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DocTemplatePersistenceImpl.fetchByC_TNO(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DocTemplate docTemplate = list.get(0);

					result = docTemplate;

					cacheResult(docTemplate);

					if ((docTemplate.getCompanyId() != companyId) ||
							(docTemplate.getTemplateNo() == null) ||
							!docTemplate.getTemplateNo().equals(templateNo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_TNO,
							finderArgs, docTemplate);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_TNO,
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
			return (DocTemplate)result;
		}
	}

	/**
	 * Removes the doc template where companyId = &#63; and templateNo = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param templateNo the template no
	 * @return the doc template that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate removeByC_TNO(long companyId, String templateNo)
		throws NoSuchDocTemplateException, SystemException {
		DocTemplate docTemplate = findByC_TNO(companyId, templateNo);

		return remove(docTemplate);
	}

	/**
	 * Returns the number of doc templates where companyId = &#63; and templateNo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param templateNo the template no
	 * @return the number of matching doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_TNO(long companyId, String templateNo)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_TNO;

		Object[] finderArgs = new Object[] { companyId, templateNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOCTEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_C_TNO_COMPANYID_2);

			boolean bindTemplateNo = false;

			if (templateNo == null) {
				query.append(_FINDER_COLUMN_C_TNO_TEMPLATENO_1);
			}
			else if (templateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_TNO_TEMPLATENO_3);
			}
			else {
				bindTemplateNo = true;

				query.append(_FINDER_COLUMN_C_TNO_TEMPLATENO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindTemplateNo) {
					qPos.add(templateNo);
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

	private static final String _FINDER_COLUMN_C_TNO_COMPANYID_2 = "docTemplate.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_TNO_TEMPLATENO_1 = "docTemplate.templateNo IS NULL";
	private static final String _FINDER_COLUMN_C_TNO_TEMPLATENO_2 = "docTemplate.templateNo = ?";
	private static final String _FINDER_COLUMN_C_TNO_TEMPLATENO_3 = "(docTemplate.templateNo IS NULL OR docTemplate.templateNo = '')";

	public DocTemplatePersistenceImpl() {
		setModelClass(DocTemplate.class);
	}

	/**
	 * Caches the doc template in the entity cache if it is enabled.
	 *
	 * @param docTemplate the doc template
	 */
	@Override
	public void cacheResult(DocTemplate docTemplate) {
		EntityCacheUtil.putResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateImpl.class, docTemplate.getPrimaryKey(), docTemplate);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_TNO,
			new Object[] {
				docTemplate.getCompanyId(), docTemplate.getGroupId(),
				docTemplate.getTemplateNo()
			}, docTemplate);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_TNO,
			new Object[] { docTemplate.getCompanyId(), docTemplate.getTemplateNo() },
			docTemplate);

		docTemplate.resetOriginalValues();
	}

	/**
	 * Caches the doc templates in the entity cache if it is enabled.
	 *
	 * @param docTemplates the doc templates
	 */
	@Override
	public void cacheResult(List<DocTemplate> docTemplates) {
		for (DocTemplate docTemplate : docTemplates) {
			if (EntityCacheUtil.getResult(
						DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
						DocTemplateImpl.class, docTemplate.getPrimaryKey()) == null) {
				cacheResult(docTemplate);
			}
			else {
				docTemplate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all doc templates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DocTemplateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DocTemplateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the doc template.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DocTemplate docTemplate) {
		EntityCacheUtil.removeResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateImpl.class, docTemplate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(docTemplate);
	}

	@Override
	public void clearCache(List<DocTemplate> docTemplates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DocTemplate docTemplate : docTemplates) {
			EntityCacheUtil.removeResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
				DocTemplateImpl.class, docTemplate.getPrimaryKey());

			clearUniqueFindersCache(docTemplate);
		}
	}

	protected void cacheUniqueFindersCache(DocTemplate docTemplate) {
		if (docTemplate.isNew()) {
			Object[] args = new Object[] {
					docTemplate.getCompanyId(), docTemplate.getGroupId(),
					docTemplate.getTemplateNo()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_G_TNO, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_TNO, args,
				docTemplate);

			args = new Object[] {
					docTemplate.getCompanyId(), docTemplate.getTemplateNo()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_TNO, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_TNO, args,
				docTemplate);
		}
		else {
			DocTemplateModelImpl docTemplateModelImpl = (DocTemplateModelImpl)docTemplate;

			if ((docTemplateModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_G_TNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						docTemplate.getCompanyId(), docTemplate.getGroupId(),
						docTemplate.getTemplateNo()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_G_TNO, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_TNO, args,
					docTemplate);
			}

			if ((docTemplateModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_TNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						docTemplate.getCompanyId(), docTemplate.getTemplateNo()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_TNO, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_TNO, args,
					docTemplate);
			}
		}
	}

	protected void clearUniqueFindersCache(DocTemplate docTemplate) {
		DocTemplateModelImpl docTemplateModelImpl = (DocTemplateModelImpl)docTemplate;

		Object[] args = new Object[] {
				docTemplate.getCompanyId(), docTemplate.getGroupId(),
				docTemplate.getTemplateNo()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_TNO, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G_TNO, args);

		if ((docTemplateModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_G_TNO.getColumnBitmask()) != 0) {
			args = new Object[] {
					docTemplateModelImpl.getOriginalCompanyId(),
					docTemplateModelImpl.getOriginalGroupId(),
					docTemplateModelImpl.getOriginalTemplateNo()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G_TNO, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G_TNO, args);
		}

		args = new Object[] {
				docTemplate.getCompanyId(), docTemplate.getTemplateNo()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_TNO, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_TNO, args);

		if ((docTemplateModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_TNO.getColumnBitmask()) != 0) {
			args = new Object[] {
					docTemplateModelImpl.getOriginalCompanyId(),
					docTemplateModelImpl.getOriginalTemplateNo()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_TNO, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_TNO, args);
		}
	}

	/**
	 * Creates a new doc template with the primary key. Does not add the doc template to the database.
	 *
	 * @param docTemplateId the primary key for the new doc template
	 * @return the new doc template
	 */
	@Override
	public DocTemplate create(long docTemplateId) {
		DocTemplate docTemplate = new DocTemplateImpl();

		docTemplate.setNew(true);
		docTemplate.setPrimaryKey(docTemplateId);

		return docTemplate;
	}

	/**
	 * Removes the doc template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docTemplateId the primary key of the doc template
	 * @return the doc template that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate remove(long docTemplateId)
		throws NoSuchDocTemplateException, SystemException {
		return remove((Serializable)docTemplateId);
	}

	/**
	 * Removes the doc template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the doc template
	 * @return the doc template that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate remove(Serializable primaryKey)
		throws NoSuchDocTemplateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DocTemplate docTemplate = (DocTemplate)session.get(DocTemplateImpl.class,
					primaryKey);

			if (docTemplate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(docTemplate);
		}
		catch (NoSuchDocTemplateException nsee) {
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
	protected DocTemplate removeImpl(DocTemplate docTemplate)
		throws SystemException {
		docTemplate = toUnwrappedModel(docTemplate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(docTemplate)) {
				docTemplate = (DocTemplate)session.get(DocTemplateImpl.class,
						docTemplate.getPrimaryKeyObj());
			}

			if (docTemplate != null) {
				session.delete(docTemplate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (docTemplate != null) {
			clearCache(docTemplate);
		}

		return docTemplate;
	}

	@Override
	public DocTemplate updateImpl(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws SystemException {
		docTemplate = toUnwrappedModel(docTemplate);

		boolean isNew = docTemplate.isNew();

		DocTemplateModelImpl docTemplateModelImpl = (DocTemplateModelImpl)docTemplate;

		Session session = null;

		try {
			session = openSession();

			if (docTemplate.isNew()) {
				session.save(docTemplate);

				docTemplate.setNew(false);
			}
			else {
				session.merge(docTemplate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DocTemplateModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((docTemplateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						docTemplateModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);

				args = new Object[] { docTemplateModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C,
					args);
			}

			if ((docTemplateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						docTemplateModelImpl.getOriginalCompanyId(),
						docTemplateModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);

				args = new Object[] {
						docTemplateModelImpl.getCompanyId(),
						docTemplateModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);
			}
		}

		EntityCacheUtil.putResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DocTemplateImpl.class, docTemplate.getPrimaryKey(), docTemplate);

		clearUniqueFindersCache(docTemplate);
		cacheUniqueFindersCache(docTemplate);

		return docTemplate;
	}

	protected DocTemplate toUnwrappedModel(DocTemplate docTemplate) {
		if (docTemplate instanceof DocTemplateImpl) {
			return docTemplate;
		}

		DocTemplateImpl docTemplateImpl = new DocTemplateImpl();

		docTemplateImpl.setNew(docTemplate.isNew());
		docTemplateImpl.setPrimaryKey(docTemplate.getPrimaryKey());

		docTemplateImpl.setDocTemplateId(docTemplate.getDocTemplateId());
		docTemplateImpl.setUserId(docTemplate.getUserId());
		docTemplateImpl.setGroupId(docTemplate.getGroupId());
		docTemplateImpl.setCompanyId(docTemplate.getCompanyId());
		docTemplateImpl.setCreateDate(docTemplate.getCreateDate());
		docTemplateImpl.setModifiedDate(docTemplate.getModifiedDate());
		docTemplateImpl.setTemplateNo(docTemplate.getTemplateNo());
		docTemplateImpl.setTitle(docTemplate.getTitle());
		docTemplateImpl.setEnTitle(docTemplate.getEnTitle());
		docTemplateImpl.setFileEntryId(docTemplate.getFileEntryId());

		return docTemplateImpl;
	}

	/**
	 * Returns the doc template with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the doc template
	 * @return the doc template
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocTemplateException, SystemException {
		DocTemplate docTemplate = fetchByPrimaryKey(primaryKey);

		if (docTemplate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return docTemplate;
	}

	/**
	 * Returns the doc template with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDocTemplateException} if it could not be found.
	 *
	 * @param docTemplateId the primary key of the doc template
	 * @return the doc template
	 * @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate findByPrimaryKey(long docTemplateId)
		throws NoSuchDocTemplateException, SystemException {
		return findByPrimaryKey((Serializable)docTemplateId);
	}

	/**
	 * Returns the doc template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the doc template
	 * @return the doc template, or <code>null</code> if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DocTemplate docTemplate = (DocTemplate)EntityCacheUtil.getResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
				DocTemplateImpl.class, primaryKey);

		if (docTemplate == _nullDocTemplate) {
			return null;
		}

		if (docTemplate == null) {
			Session session = null;

			try {
				session = openSession();

				docTemplate = (DocTemplate)session.get(DocTemplateImpl.class,
						primaryKey);

				if (docTemplate != null) {
					cacheResult(docTemplate);
				}
				else {
					EntityCacheUtil.putResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
						DocTemplateImpl.class, primaryKey, _nullDocTemplate);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DocTemplateModelImpl.ENTITY_CACHE_ENABLED,
					DocTemplateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return docTemplate;
	}

	/**
	 * Returns the doc template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param docTemplateId the primary key of the doc template
	 * @return the doc template, or <code>null</code> if a doc template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocTemplate fetchByPrimaryKey(long docTemplateId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)docTemplateId);
	}

	/**
	 * Returns all the doc templates.
	 *
	 * @return the doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocTemplate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the doc templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of doc templates
	 * @param end the upper bound of the range of doc templates (not inclusive)
	 * @return the range of doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocTemplate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the doc templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of doc templates
	 * @param end the upper bound of the range of doc templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of doc templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocTemplate> findAll(int start, int end,
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

		List<DocTemplate> list = (List<DocTemplate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCTEMPLATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCTEMPLATE;

				if (pagination) {
					sql = sql.concat(DocTemplateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DocTemplate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocTemplate>(list);
				}
				else {
					list = (List<DocTemplate>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the doc templates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DocTemplate docTemplate : findAll()) {
			remove(docTemplate);
		}
	}

	/**
	 * Returns the number of doc templates.
	 *
	 * @return the number of doc templates
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

				Query q = session.createQuery(_SQL_COUNT_DOCTEMPLATE);

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
	 * Initializes the doc template persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.DocTemplate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DocTemplate>> listenersList = new ArrayList<ModelListener<DocTemplate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DocTemplate>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DocTemplateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOCTEMPLATE = "SELECT docTemplate FROM DocTemplate docTemplate";
	private static final String _SQL_SELECT_DOCTEMPLATE_WHERE = "SELECT docTemplate FROM DocTemplate docTemplate WHERE ";
	private static final String _SQL_COUNT_DOCTEMPLATE = "SELECT COUNT(docTemplate) FROM DocTemplate docTemplate";
	private static final String _SQL_COUNT_DOCTEMPLATE_WHERE = "SELECT COUNT(docTemplate) FROM DocTemplate docTemplate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "docTemplate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DocTemplate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DocTemplate exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DocTemplatePersistenceImpl.class);
	private static DocTemplate _nullDocTemplate = new DocTemplateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DocTemplate> toCacheModel() {
				return _nullDocTemplateCacheModel;
			}
		};

	private static CacheModel<DocTemplate> _nullDocTemplateCacheModel = new CacheModel<DocTemplate>() {
			@Override
			public DocTemplate toEntityModel() {
				return _nullDocTemplate;
			}
		};
}