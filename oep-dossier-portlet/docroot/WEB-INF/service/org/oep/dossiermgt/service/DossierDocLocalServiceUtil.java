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

package org.oep.dossiermgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DossierDoc. This utility wraps
 * {@link org.oep.dossiermgt.service.impl.DossierDocLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see DossierDocLocalService
 * @see org.oep.dossiermgt.service.base.DossierDocLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.impl.DossierDocLocalServiceImpl
 * @generated
 */
public class DossierDocLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.dossiermgt.service.impl.DossierDocLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dossier doc to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierDoc the dossier doc
	* @return the dossier doc that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DossierDoc addDossierDoc(
		org.oep.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDossierDoc(dossierDoc);
	}

	/**
	* Creates a new dossier doc with the primary key. Does not add the dossier doc to the database.
	*
	* @param dossierDocId the primary key for the new dossier doc
	* @return the new dossier doc
	*/
	public static org.oep.dossiermgt.model.DossierDoc createDossierDoc(
		long dossierDocId) {
		return getService().createDossierDoc(dossierDocId);
	}

	/**
	* Deletes the dossier doc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierDocId the primary key of the dossier doc
	* @return the dossier doc that was removed
	* @throws PortalException if a dossier doc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DossierDoc deleteDossierDoc(
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierDoc(dossierDocId);
	}

	/**
	* Deletes the dossier doc from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierDoc the dossier doc
	* @return the dossier doc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DossierDoc deleteDossierDoc(
		org.oep.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierDoc(dossierDoc);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.dossiermgt.model.DossierDoc fetchDossierDoc(
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossierDoc(dossierDocId);
	}

	/**
	* Returns the dossier doc with the primary key.
	*
	* @param dossierDocId the primary key of the dossier doc
	* @return the dossier doc
	* @throws PortalException if a dossier doc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DossierDoc getDossierDoc(
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierDoc(dossierDocId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier docs
	* @param end the upper bound of the range of dossier docs (not inclusive)
	* @return the range of dossier docs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DossierDoc> getDossierDocs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierDocs(start, end);
	}

	/**
	* Returns the number of dossier docs.
	*
	* @return the number of dossier docs
	* @throws SystemException if a system exception occurred
	*/
	public static int getDossierDocsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierDocsCount();
	}

	/**
	* Updates the dossier doc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierDoc the dossier doc
	* @return the dossier doc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DossierDoc updateDossierDoc(
		org.oep.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDossierDoc(dossierDoc);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDocTemplateDossierDoc(long docTemplateId,
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDocTemplateDossierDoc(docTemplateId, dossierDocId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDocTemplateDossierDoc(long docTemplateId,
		org.oep.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDocTemplateDossierDoc(docTemplateId, dossierDoc);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDocTemplateDossierDocs(long docTemplateId,
		long[] dossierDocIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDocTemplateDossierDocs(docTemplateId, dossierDocIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addDocTemplateDossierDocs(long docTemplateId,
		java.util.List<org.oep.dossiermgt.model.DossierDoc> DossierDocs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addDocTemplateDossierDocs(docTemplateId, DossierDocs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearDocTemplateDossierDocs(long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearDocTemplateDossierDocs(docTemplateId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDocTemplateDossierDoc(long docTemplateId,
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDocTemplateDossierDoc(docTemplateId, dossierDocId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDocTemplateDossierDoc(long docTemplateId,
		org.oep.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDocTemplateDossierDoc(docTemplateId, dossierDoc);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDocTemplateDossierDocs(long docTemplateId,
		long[] dossierDocIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDocTemplateDossierDocs(docTemplateId, dossierDocIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDocTemplateDossierDocs(long docTemplateId,
		java.util.List<org.oep.dossiermgt.model.DossierDoc> DossierDocs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDocTemplateDossierDocs(docTemplateId, DossierDocs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DossierDoc> getDocTemplateDossierDocs(
		long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocTemplateDossierDocs(docTemplateId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DossierDoc> getDocTemplateDossierDocs(
		long docTemplateId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocTemplateDossierDocs(docTemplateId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DossierDoc> getDocTemplateDossierDocs(
		long docTemplateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDocTemplateDossierDocs(docTemplateId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getDocTemplateDossierDocsCount(long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocTemplateDossierDocsCount(docTemplateId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasDocTemplateDossierDoc(long docTemplateId,
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasDocTemplateDossierDoc(docTemplateId, dossierDocId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasDocTemplateDossierDocs(long docTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasDocTemplateDossierDocs(docTemplateId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setDocTemplateDossierDocs(long docTemplateId,
		long[] dossierDocIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setDocTemplateDossierDocs(docTemplateId, dossierDocIds);
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
	* ThÃƒÂªm mÃ¡Â»â€ºi thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param dossierProcId mÃƒÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param dossierDocNo mÃƒÂ£ Ã„â€˜Ã¡Â»â€¹nh danh thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param dossierDocName tÃƒÂªn thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param note ghi chÃƒÂº
	* @param sequenceNo sÃ¡Â»â€˜ thÃ¡Â»Â© tÃ¡Â»Â± thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param defaultDocTemplateId biÃ¡Â»Æ’u mÃ¡ÂºÂ«u ngÃ¡ÂºÂ§m Ã„â€˜Ã¡Â»â€¹nh cÃ¡Â»Â§a hÃ¡Â»â€œ sÃ†Â¡
	* @param dossierDocType loÃ¡ÂºÂ¡i thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param numberOfFile sÃ¡Â»â€˜ lÃ†Â°Ã¡Â»Â£ng tÃƒÂ i liÃ¡Â»â€¡u tÃ¡Â»â€˜i Ã„â€˜a
	* @param splitSubDossier cÃ¡Â»ï¿½ Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u phÃƒÂ¢n thÃƒÂ nh hÃ¡Â»â€œ sÃ†Â¡ con
	* @param onlineForm thÃƒÂ nh phÃ¡ÂºÂ§n khai trÃ¡Â»Â±c tuyÃ¡ÂºÂ¿n
	* @return: thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi tÃ¡ÂºÂ¡o
	*/
	public static org.oep.dossiermgt.model.DossierDoc addDossierDoc(
		long dossierProcId, java.lang.String dossierDocNo,
		java.lang.String dossierDocName, java.lang.String note, int sequenceNo,
		long defaultDocTemplateId, int dossierDocType, int numberOfFile,
		java.lang.String onlineForm,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierDoc(dossierProcId, dossierDocNo, dossierDocName,
			note, sequenceNo, defaultDocTemplateId, dossierDocType,
			numberOfFile, onlineForm, serviceContext);
	}

	/**
	* ChÃ¡Â»â€°nh sÃ¡Â»Â­a thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param dossierProcId mÃƒÂ£ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param dossierDocNo mÃƒÂ£ Ã„â€˜Ã¡Â»â€¹nh danh thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param dossierDocName tÃƒÂªn thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param note ghi chÃƒÂº
	* @param sequenceNo sÃ¡Â»â€˜ thÃ¡Â»Â© tÃ¡Â»Â± thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param defaultDocTemplateId biÃ¡Â»Æ’u mÃ¡ÂºÂ«u ngÃ¡ÂºÂ§m Ã„â€˜Ã¡Â»â€¹nh cÃ¡Â»Â§a hÃ¡Â»â€œ sÃ†Â¡
	* @param dossierDocType loÃ¡ÂºÂ¡i thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡
	* @param numberOfFile sÃ¡Â»â€˜ lÃ†Â°Ã¡Â»Â£ng tÃƒÂ i liÃ¡Â»â€¡u tÃ¡Â»â€˜i Ã„â€˜a
	* @param splitSubDossier cÃ¡Â»ï¿½ Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u phÃƒÂ¢n thÃƒÂ nh hÃ¡Â»â€œ sÃ†Â¡ con
	* @param onlineForm thÃƒÂ nh phÃ¡ÂºÂ§n khai trÃ¡Â»Â±c tuyÃ¡ÂºÂ¿n
	* @return: thÃƒÂ nh phÃ¡ÂºÂ§n hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi tÃ¡ÂºÂ¡o
	*/
	public static org.oep.dossiermgt.model.DossierDoc updateDossierDoc(
		long id, long dossierProcId, java.lang.String dossierDocNo,
		java.lang.String dossierDocName, java.lang.String note, int sequenceNo,
		long defaultDocTemplateId, int dossierDocType, int numberOfFile,
		java.lang.String onlineForm,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDossierDoc(id, dossierProcId, dossierDocNo,
			dossierDocName, note, sequenceNo, defaultDocTemplateId,
			dossierDocType, numberOfFile, onlineForm, serviceContext);
	}

	public static void updateDossierDocResources(
		org.oep.dossiermgt.model.DossierDoc dossierDoc,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDossierDocResources(dossierDoc, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeDossierDoc(
		org.oep.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossierDoc(dossierDoc);
	}

	public static void removeDossierDoc(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossierDoc(id);
	}

	public static void addDossierDocResources(
		org.oep.dossiermgt.model.DossierDoc dossierDoc,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierDocResources(dossierDoc, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addDossierDocResources(
		org.oep.dossiermgt.model.DossierDoc dossierDoc,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierDocResources(dossierDoc, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addDossierDocResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierDocResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DossierDocLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DossierDocLocalService.class.getName());

			if (invokableLocalService instanceof DossierDocLocalService) {
				_service = (DossierDocLocalService)invokableLocalService;
			}
			else {
				_service = new DossierDocLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DossierDocLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DossierDocLocalService service) {
	}

	private static DossierDocLocalService _service;
}