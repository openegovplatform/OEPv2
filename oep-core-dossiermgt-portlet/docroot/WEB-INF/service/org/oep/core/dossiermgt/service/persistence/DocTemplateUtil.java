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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.dossiermgt.model.DocTemplate;

import java.util.List;

/**
 * The persistence utility for the doc template service. This utility wraps {@link DocTemplatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DocTemplatePersistence
 * @see DocTemplatePersistenceImpl
 * @generated
 */
public class DocTemplateUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DocTemplate docTemplate) {
		getPersistence().clearCache(docTemplate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DocTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DocTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DocTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DocTemplate update(DocTemplate docTemplate)
		throws SystemException {
		return getPersistence().update(docTemplate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DocTemplate update(DocTemplate docTemplate,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(docTemplate, serviceContext);
	}

	/**
	* Returns all the doc templates where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching doc templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId);
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
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end);
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
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end, orderByComparator);
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
	public static org.oep.core.dossiermgt.model.DocTemplate findByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException {
		return getPersistence().findByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the first doc template in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doc template, or <code>null</code> if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate fetchByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_First(companyId, orderByComparator);
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
	public static org.oep.core.dossiermgt.model.DocTemplate findByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException {
		return getPersistence().findByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last doc template in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doc template, or <code>null</code> if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate fetchByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_Last(companyId, orderByComparator);
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
	public static org.oep.core.dossiermgt.model.DocTemplate[] findByC_PrevAndNext(
		long docTemplateId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException {
		return getPersistence()
				   .findByC_PrevAndNext(docTemplateId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the doc templates where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC(companyId);
	}

	/**
	* Returns the number of doc templates where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching doc templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC(companyId);
	}

	/**
	* Returns all the doc templates where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching doc templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId);
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
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId, start, end);
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
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
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
	public static org.oep.core.dossiermgt.model.DocTemplate findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
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
	public static org.oep.core.dossiermgt.model.DocTemplate fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_First(companyId, groupId, orderByComparator);
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
	public static org.oep.core.dossiermgt.model.DocTemplate findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
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
	public static org.oep.core.dossiermgt.model.DocTemplate fetchByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_Last(companyId, groupId, orderByComparator);
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
	public static org.oep.core.dossiermgt.model.DocTemplate[] findByC_G_PrevAndNext(
		long docTemplateId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException {
		return getPersistence()
				   .findByC_G_PrevAndNext(docTemplateId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the doc templates where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G(companyId, groupId);
	}

	/**
	* Returns the number of doc templates where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching doc templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(companyId, groupId);
	}

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
	public static org.oep.core.dossiermgt.model.DocTemplate findByC_G_TNO(
		long companyId, long groupId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException {
		return getPersistence().findByC_G_TNO(companyId, groupId, templateNo);
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
	public static org.oep.core.dossiermgt.model.DocTemplate fetchByC_G_TNO(
		long companyId, long groupId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_G_TNO(companyId, groupId, templateNo);
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
	public static org.oep.core.dossiermgt.model.DocTemplate fetchByC_G_TNO(
		long companyId, long groupId, java.lang.String templateNo,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_TNO(companyId, groupId, templateNo,
			retrieveFromCache);
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
	public static org.oep.core.dossiermgt.model.DocTemplate removeByC_G_TNO(
		long companyId, long groupId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException {
		return getPersistence().removeByC_G_TNO(companyId, groupId, templateNo);
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
	public static int countByC_G_TNO(long companyId, long groupId,
		java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_TNO(companyId, groupId, templateNo);
	}

	/**
	* Returns the doc template where companyId = &#63; and templateNo = &#63; or throws a {@link org.oep.core.dossiermgt.NoSuchDocTemplateException} if it could not be found.
	*
	* @param companyId the company ID
	* @param templateNo the template no
	* @return the matching doc template
	* @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate findByC_TNO(
		long companyId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException {
		return getPersistence().findByC_TNO(companyId, templateNo);
	}

	/**
	* Returns the doc template where companyId = &#63; and templateNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param templateNo the template no
	* @return the matching doc template, or <code>null</code> if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate fetchByC_TNO(
		long companyId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_TNO(companyId, templateNo);
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
	public static org.oep.core.dossiermgt.model.DocTemplate fetchByC_TNO(
		long companyId, java.lang.String templateNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_TNO(companyId, templateNo, retrieveFromCache);
	}

	/**
	* Removes the doc template where companyId = &#63; and templateNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param templateNo the template no
	* @return the doc template that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate removeByC_TNO(
		long companyId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException {
		return getPersistence().removeByC_TNO(companyId, templateNo);
	}

	/**
	* Returns the number of doc templates where companyId = &#63; and templateNo = &#63;.
	*
	* @param companyId the company ID
	* @param templateNo the template no
	* @return the number of matching doc templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_TNO(long companyId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_TNO(companyId, templateNo);
	}

	/**
	* Caches the doc template in the entity cache if it is enabled.
	*
	* @param docTemplate the doc template
	*/
	public static void cacheResult(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate) {
		getPersistence().cacheResult(docTemplate);
	}

	/**
	* Caches the doc templates in the entity cache if it is enabled.
	*
	* @param docTemplates the doc templates
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.DocTemplate> docTemplates) {
		getPersistence().cacheResult(docTemplates);
	}

	/**
	* Creates a new doc template with the primary key. Does not add the doc template to the database.
	*
	* @param docTemplateId the primary key for the new doc template
	* @return the new doc template
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate create(
		long docTemplateId) {
		return getPersistence().create(docTemplateId);
	}

	/**
	* Removes the doc template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docTemplateId the primary key of the doc template
	* @return the doc template that was removed
	* @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate remove(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException {
		return getPersistence().remove(docTemplateId);
	}

	public static org.oep.core.dossiermgt.model.DocTemplate updateImpl(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(docTemplate);
	}

	/**
	* Returns the doc template with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDocTemplateException} if it could not be found.
	*
	* @param docTemplateId the primary key of the doc template
	* @return the doc template
	* @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate findByPrimaryKey(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException {
		return getPersistence().findByPrimaryKey(docTemplateId);
	}

	/**
	* Returns the doc template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docTemplateId the primary key of the doc template
	* @return the doc template, or <code>null</code> if a doc template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate fetchByPrimaryKey(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(docTemplateId);
	}

	/**
	* Returns all the doc templates.
	*
	* @return the doc templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the doc templates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of doc templates.
	*
	* @return the number of doc templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DocTemplatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DocTemplatePersistence)PortletBeanLocatorUtil.locate(org.oep.core.dossiermgt.service.ClpSerializer.getServletContextName(),
					DocTemplatePersistence.class.getName());

			ReferenceRegistry.registerReference(DocTemplateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DocTemplatePersistence persistence) {
	}

	private static DocTemplatePersistence _persistence;
}