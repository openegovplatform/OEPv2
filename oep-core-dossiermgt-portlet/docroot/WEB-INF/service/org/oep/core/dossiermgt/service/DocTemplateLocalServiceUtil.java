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

package org.oep.core.dossiermgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DocTemplate. This utility wraps
 * {@link org.oep.core.dossiermgt.service.impl.DocTemplateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see DocTemplateLocalService
 * @see org.oep.core.dossiermgt.service.base.DocTemplateLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.DocTemplateLocalServiceImpl
 * @generated
 */
public class DocTemplateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.DocTemplateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the doc template to the database. Also notifies the appropriate model listeners.
	*
	* @param docTemplate the doc template
	* @return the doc template that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate addDocTemplate(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDocTemplate(docTemplate);
	}

	/**
	* Creates a new doc template with the primary key. Does not add the doc template to the database.
	*
	* @param docTemplateId the primary key for the new doc template
	* @return the new doc template
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate createDocTemplate(
		long docTemplateId) {
		return getService().createDocTemplate(docTemplateId);
	}

	/**
	* Deletes the doc template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docTemplateId the primary key of the doc template
	* @return the doc template that was removed
	* @throws PortalException if a doc template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate deleteDocTemplate(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDocTemplate(docTemplateId);
	}

	/**
	* Deletes the doc template from the database. Also notifies the appropriate model listeners.
	*
	* @param docTemplate the doc template
	* @return the doc template that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate deleteDocTemplate(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDocTemplate(docTemplate);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.oep.core.dossiermgt.model.DocTemplate fetchDocTemplate(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDocTemplate(docTemplateId);
	}

	/**
	* Returns the doc template with the primary key.
	*
	* @param docTemplateId the primary key of the doc template
	* @return the doc template
	* @throws PortalException if a doc template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate getDocTemplate(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocTemplate(docTemplateId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> getDocTemplates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocTemplates(start, end);
	}

	/**
	* Returns the number of doc templates.
	*
	* @return the number of doc templates
	* @throws SystemException if a system exception occurred
	*/
	public static int getDocTemplatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocTemplatesCount();
	}

	/**
	* Updates the doc template in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docTemplate the doc template
	* @return the doc template that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate updateDocTemplate(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDocTemplate(docTemplate);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDossierDocDocTemplate(long dossierDocId,
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDossierDocDocTemplate(dossierDocId, docTemplateId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDossierDocDocTemplate(long dossierDocId,
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDossierDocDocTemplate(dossierDocId, docTemplate);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDossierDocDocTemplates(long dossierDocId,
		long[] docTemplateIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDossierDocDocTemplates(dossierDocId, docTemplateIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDossierDocDocTemplates(long dossierDocId,
		java.util.List<org.oep.core.dossiermgt.model.DocTemplate> DocTemplates)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDossierDocDocTemplates(dossierDocId, DocTemplates);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearDossierDocDocTemplates(long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearDossierDocDocTemplates(dossierDocId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDossierDocDocTemplate(long dossierDocId,
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDossierDocDocTemplate(dossierDocId, docTemplateId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDossierDocDocTemplate(long dossierDocId,
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDossierDocDocTemplate(dossierDocId, docTemplate);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDossierDocDocTemplates(long dossierDocId,
		long[] docTemplateIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDossierDocDocTemplates(dossierDocId, docTemplateIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDossierDocDocTemplates(long dossierDocId,
		java.util.List<org.oep.core.dossiermgt.model.DocTemplate> DocTemplates)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDossierDocDocTemplates(dossierDocId, DocTemplates);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> getDossierDocDocTemplates(
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierDocDocTemplates(dossierDocId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> getDossierDocDocTemplates(
		long dossierDocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierDocDocTemplates(dossierDocId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> getDossierDocDocTemplates(
		long dossierDocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDossierDocDocTemplates(dossierDocId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getDossierDocDocTemplatesCount(long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierDocDocTemplatesCount(dossierDocId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasDossierDocDocTemplate(long dossierDocId,
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasDossierDocDocTemplate(dossierDocId, docTemplateId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasDossierDocDocTemplates(long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasDossierDocDocTemplates(dossierDocId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setDossierDocDocTemplates(long dossierDocId,
		long[] docTemplateIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setDossierDocDocTemplates(dossierDocId, docTemplateIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â„¢t biÃ¡Â»Æ’u mÃ¡ÂºÂ«u tÃƒÂ i liÃ¡Â»â€¡u
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param templateNo mÃƒÂ£ biÃ¡Â»Æ’u mÃ¡ÂºÂ«u
	* @param title TiÃƒÂªu Ã„â€˜Ã¡Â»ï¿½ biÃ¡Â»Æ’u mÃ¡ÂºÂ«u
	* @param enTitle TiÃƒÂªu Ã„â€˜Ã¡Â»ï¿½ TiÃ¡ÂºÂ¿ng Anh cÃ¡Â»Â§a biÃ¡Â»Æ’u mÃ¡ÂºÂ«u
	* @param fileEntryId MÃƒÂ£ tÃƒÂ i liÃ¡Â»â€¡u mÃ¡ÂºÂ«u bÃ¡ÂºÂ±ng module quÃ¡ÂºÂ£n lÃƒÂ½ phÃ†Â°Ã†Â¡ng tiÃ¡Â»â€¡n
	* @return: biÃ¡Â»Æ’u mÃ¡ÂºÂ«u tÃƒÂ i liÃ¡Â»â€¡u mÃ¡Â»â€ºi tÃ¡ÂºÂ¡o
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate addDocTemplate(
		java.lang.String templateNo, java.lang.String title,
		java.lang.String enTitle, long fileEntryId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDocTemplate(templateNo, title, enTitle, fileEntryId,
			serviceContext);
	}

	/**
	* SÃ¡Â»Â­a thÃƒÂ´ng tin mÃ¡Â»â„¢t biÃ¡Â»Æ’u mÃ¡ÂºÂ«u tÃƒÂ i liÃ¡Â»â€¡u
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ tÃ¡Â»Â± tÃ„Æ’ng biÃ¡Â»Æ’u mÃ¡ÂºÂ«u
	* @param templateNo mÃƒÂ£ biÃ¡Â»Æ’u mÃ¡ÂºÂ«u
	* @param title TiÃƒÂªu Ã„â€˜Ã¡Â»ï¿½ biÃ¡Â»Æ’u mÃ¡ÂºÂ«u
	* @param enTitle TiÃƒÂªu Ã„â€˜Ã¡Â»ï¿½ TiÃ¡ÂºÂ¿ng Anh cÃ¡Â»Â§a biÃ¡Â»Æ’u mÃ¡ÂºÂ«u
	* @param fileEntryId MÃƒÂ£ tÃƒÂ i liÃ¡Â»â€¡u mÃ¡ÂºÂ«u bÃ¡ÂºÂ±ng module quÃ¡ÂºÂ£n lÃƒÂ½ phÃ†Â°Ã†Â¡ng tiÃ¡Â»â€¡n
	* @return: biÃ¡Â»Æ’u mÃ¡ÂºÂ«u tÃƒÂ i liÃ¡Â»â€¡u Ã„â€˜Ã†Â°Ã¡Â»Â£c sÃ¡Â»Â­a
	*/
	public static org.oep.core.dossiermgt.model.DocTemplate updateDocTemplate(
		long id, java.lang.String templateNo, java.lang.String title,
		java.lang.String enTitle, long fileEntryId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDocTemplate(id, templateNo, title, enTitle,
			fileEntryId, serviceContext);
	}

	public static void updateDocTemplateResources(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDocTemplateResources(docTemplate, groupPermissions,
			guestPermissions, serviceContext);
	}

	/**
	* XÃƒÂ³a thÃƒÂ´ng tin biÃ¡Â»Æ’u mÃ¡ÂºÂ«u tÃƒÂ i liÃ¡Â»â€¡u
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param docTemplate Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng biÃ¡Â»Æ’u mÃ¡ÂºÂ«u cÃ¡ÂºÂ§n xÃƒÂ³a
	* @return
	*/
	public static void removeDocTemplate(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDocTemplate(docTemplate);
	}

	/**
	* XÃƒÂ³a thÃƒÂ´ng tin biÃ¡Â»Æ’u mÃ¡ÂºÂ«u tÃƒÂ i liÃ¡Â»â€¡u
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ tÃ¡Â»Â± tÃ„Æ’ng biÃ¡Â»Æ’u mÃ¡ÂºÂ«u cÃ¡ÂºÂ§n xÃƒÂ³a
	* @return
	*/
	public static void removeDocTemplate(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDocTemplate(id);
	}

	public static void addDocTemplateResources(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDocTemplateResources(docTemplate, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addDocTemplateResources(
		org.oep.core.dossiermgt.model.DocTemplate docTemplate,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDocTemplateResources(docTemplate, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addDocTemplateResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDocTemplateResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByLikeTitle(
		java.lang.String title, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByLikeTitle(title, startIndex, endIndex, serviceContext);
	}

	public static int countByLikeTitle(java.lang.String title,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByLikeTitle(title, serviceContext);
	}

	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> findByGroupLikeTitle(
		java.lang.String title, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGroupLikeTitle(title, startIndex, endIndex,
			serviceContext);
	}

	public static int countByGroupLikeTitle(java.lang.String title,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByGroupLikeTitle(title, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DocTemplateLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DocTemplateLocalService.class.getName());

			if (invokableLocalService instanceof DocTemplateLocalService) {
				_service = (DocTemplateLocalService)invokableLocalService;
			}
			else {
				_service = new DocTemplateLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DocTemplateLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DocTemplateLocalService service) {
	}

	private static DocTemplateLocalService _service;
}