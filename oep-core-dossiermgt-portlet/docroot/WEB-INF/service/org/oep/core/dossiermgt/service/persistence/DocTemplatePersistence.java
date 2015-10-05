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

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.core.dossiermgt.model.DocTemplate;

/**
 * The persistence interface for the doc template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DocTemplatePersistenceImpl
 * @see DocTemplateUtil
 * @generated
 */
public interface DocTemplatePersistence extends BasePersistence<DocTemplate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocTemplateUtil} to access the doc template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the doc templates where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching doc templates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first doc template in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doc template
	* @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate findByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException;

	/**
	* Returns the first doc template in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doc template, or <code>null</code> if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate fetchByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last doc template in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doc template
	* @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate findByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException;

	/**
	* Returns the last doc template in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doc template, or <code>null</code> if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate fetchByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.core.dossiermgt.model.DocTemplate[] findByC_PrevAndNext(
		long docTemplateId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException;

	/**
	* Removes all the doc templates where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of doc templates where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching doc templates
	* @throws SystemException if a system exception occurred
	*/
	public int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the doc templates where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching doc templates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.core.dossiermgt.model.DocTemplate findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException;

	/**
	* Returns the first doc template in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doc template, or <code>null</code> if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.core.dossiermgt.model.DocTemplate findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException;

	/**
	* Returns the last doc template in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doc template, or <code>null</code> if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate fetchByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.core.dossiermgt.model.DocTemplate[] findByC_G_PrevAndNext(
		long docTemplateId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException;

	/**
	* Removes all the doc templates where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of doc templates where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching doc templates
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.core.dossiermgt.model.DocTemplate findByC_G_TNO(
		long companyId, long groupId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException;

	/**
	* Returns the doc template where companyId = &#63; and groupId = &#63; and templateNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param templateNo the template no
	* @return the matching doc template, or <code>null</code> if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate fetchByC_G_TNO(
		long companyId, long groupId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.core.dossiermgt.model.DocTemplate fetchByC_G_TNO(
		long companyId, long groupId, java.lang.String templateNo,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the doc template where companyId = &#63; and groupId = &#63; and templateNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param templateNo the template no
	* @return the doc template that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate removeByC_G_TNO(
		long companyId, long groupId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException;

	/**
	* Returns the number of doc templates where companyId = &#63; and groupId = &#63; and templateNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param templateNo the template no
	* @return the number of matching doc templates
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_TNO(long companyId, long groupId,
		java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the doc template where companyId = &#63; and templateNo = &#63; or throws a {@link org.oep.core.dossiermgt.NoSuchDocTemplateException} if it could not be found.
	*
	* @param companyId the company ID
	* @param templateNo the template no
	* @return the matching doc template
	* @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate findByC_TNO(
		long companyId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException;

	/**
	* Returns the doc template where companyId = &#63; and templateNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param templateNo the template no
	* @return the matching doc template, or <code>null</code> if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate fetchByC_TNO(
		long companyId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the doc template where companyId = &#63; and templateNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param templateNo the template no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching doc template, or <code>null</code> if a matching doc template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate fetchByC_TNO(
		long companyId, java.lang.String templateNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the doc template where companyId = &#63; and templateNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param templateNo the template no
	* @return the doc template that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate removeByC_TNO(
		long companyId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException;

	/**
	* Returns the number of doc templates where companyId = &#63; and templateNo = &#63;.
	*
	* @param companyId the company ID
	* @param templateNo the template no
	* @return the number of matching doc templates
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_TNO(long companyId, java.lang.String templateNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the doc template in the entity cache if it is enabled.
	*
	* @param docTemplate the doc template
	*/
	public void cacheResult(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate);

	/**
	* Caches the doc templates in the entity cache if it is enabled.
	*
	* @param docTemplates the doc templates
	*/
	public void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.DocTemplate> docTemplates);

	/**
	* Creates a new doc template with the primary key. Does not add the doc template to the database.
	*
	* @param docTemplateId the primary key for the new doc template
	* @return the new doc template
	*/
	public org.oep.core.dossiermgt.model.DocTemplate create(long docTemplateId);

	/**
	* Removes the doc template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docTemplateId the primary key of the doc template
	* @return the doc template that was removed
	* @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate remove(long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException;

	public org.oep.core.dossiermgt.model.DocTemplate updateImpl(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the doc template with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDocTemplateException} if it could not be found.
	*
	* @param docTemplateId the primary key of the doc template
	* @return the doc template
	* @throws org.oep.core.dossiermgt.NoSuchDocTemplateException if a doc template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate findByPrimaryKey(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDocTemplateException;

	/**
	* Returns the doc template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docTemplateId the primary key of the doc template
	* @return the doc template, or <code>null</code> if a doc template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DocTemplate fetchByPrimaryKey(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the doc templates.
	*
	* @return the doc templates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the doc templates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of doc templates.
	*
	* @return the number of doc templates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}