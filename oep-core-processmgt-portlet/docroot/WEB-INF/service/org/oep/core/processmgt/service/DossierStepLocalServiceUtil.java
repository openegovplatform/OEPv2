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

package org.oep.core.processmgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DossierStep. This utility wraps
 * {@link org.oep.core.processmgt.service.impl.DossierStepLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see DossierStepLocalService
 * @see org.oep.core.processmgt.service.base.DossierStepLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.impl.DossierStepLocalServiceImpl
 * @generated
 */
public class DossierStepLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.processmgt.service.impl.DossierStepLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dossier step to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStep the dossier step
	* @return the dossier step that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierStep addDossierStep(
		org.oep.core.processmgt.model.DossierStep dossierStep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDossierStep(dossierStep);
	}

	/**
	* Creates a new dossier step with the primary key. Does not add the dossier step to the database.
	*
	* @param dossierStepId the primary key for the new dossier step
	* @return the new dossier step
	*/
	public static org.oep.core.processmgt.model.DossierStep createDossierStep(
		long dossierStepId) {
		return getService().createDossierStep(dossierStepId);
	}

	/**
	* Deletes the dossier step with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStepId the primary key of the dossier step
	* @return the dossier step that was removed
	* @throws PortalException if a dossier step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierStep deleteDossierStep(
		long dossierStepId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierStep(dossierStepId);
	}

	/**
	* Deletes the dossier step from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStep the dossier step
	* @return the dossier step that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierStep deleteDossierStep(
		org.oep.core.processmgt.model.DossierStep dossierStep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierStep(dossierStep);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.processmgt.model.DossierStep fetchDossierStep(
		long dossierStepId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossierStep(dossierStepId);
	}

	/**
	* Returns the dossier step with the primary key.
	*
	* @param dossierStepId the primary key of the dossier step
	* @return the dossier step
	* @throws PortalException if a dossier step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierStep getDossierStep(
		long dossierStepId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierStep(dossierStepId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier steps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier steps
	* @param end the upper bound of the range of dossier steps (not inclusive)
	* @return the range of dossier steps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.DossierStep> getDossierSteps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierSteps(start, end);
	}

	/**
	* Returns the number of dossier steps.
	*
	* @return the number of dossier steps
	* @throws SystemException if a system exception occurred
	*/
	public static int getDossierStepsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierStepsCount();
	}

	/**
	* Updates the dossier step in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierStep the dossier step
	* @return the dossier step that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierStep updateDossierStep(
		org.oep.core.processmgt.model.DossierStep dossierStep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDossierStep(dossierStep);
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
	* ThÃƒÂªm bÃ†Â°Ã¡Â»â€ºc trong quy trÃƒÂ¬nh mÃ¡Â»â€ºi
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param dossierProcessId mÃƒÂ£ quy trÃƒÂ¬nh xÃ¡Â»Â­ lÃƒÂ½ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param title tiÃƒÂªu Ã„â€˜Ã¡Â»ï¿½ bÃ†Â°Ã¡Â»â€ºc xÃ¡Â»Â­ lÃƒÂ½
	* @param sequenceNo sÃ¡Â»â€˜ thÃ¡Â»Â© tÃ¡Â»Â± bÃ†Â°Ã¡Â»â€ºc xÃ¡Â»Â­ lÃƒÂ½
	* @param daysDuration sÃ¡Â»â€˜ ngÃƒÂ y cÃ¡ÂºÂ§n thiÃ¡ÂºÂ¿t Ã„â€˜Ã¡Â»Æ’ xÃ¡Â»Â­ lÃƒÂ½ quy trÃƒÂ¬nh
	* @param doForm Form xÃ¡Â»Â­ lÃƒÂ½ riÃƒÂªng cho quy trÃƒÂ¬nh
	* @param formLabel TÃƒÂªn hiÃ¡Â»Æ’n thÃ¡Â»â€¹ nÃƒÂºt xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param rollback cÃ¡Â»ï¿½ Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u cho viÃ¡Â»â€¡c roolback trong quy trÃƒÂ¬nh
	* @return: bÃ†Â°Ã¡Â»â€ºc trong quy trÃƒÂ¬nh mÃ¡Â»â€ºi
	*/
	public static org.oep.core.processmgt.model.DossierStep addDossierStep(
		long dossierProcessId, java.lang.String title, int sequenceNo,
		int daysDuration, java.lang.String doForm, java.lang.String formLabel,
		int rollback, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierStep(dossierProcessId, title, sequenceNo,
			daysDuration, doForm, formLabel, rollback, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin bÃ†Â°Ã¡Â»â€ºc trong quy trÃƒÂ¬nh mÃ¡Â»â€ºi
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ bÃ†Â°Ã¡Â»â€ºc cÃ¡ÂºÂ§n cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	* @param dossierProcessId mÃƒÂ£ quy trÃƒÂ¬nh xÃ¡Â»Â­ lÃƒÂ½ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh
	* @param title tiÃƒÂªu Ã„â€˜Ã¡Â»ï¿½ bÃ†Â°Ã¡Â»â€ºc xÃ¡Â»Â­ lÃƒÂ½
	* @param sequenceNo sÃ¡Â»â€˜ thÃ¡Â»Â© tÃ¡Â»Â± bÃ†Â°Ã¡Â»â€ºc xÃ¡Â»Â­ lÃƒÂ½
	* @param daysDuration sÃ¡Â»â€˜ ngÃƒÂ y cÃ¡ÂºÂ§n thiÃ¡ÂºÂ¿t Ã„â€˜Ã¡Â»Æ’ xÃ¡Â»Â­ lÃƒÂ½ quy trÃƒÂ¬nh
	* @param doForm Form xÃ¡Â»Â­ lÃƒÂ½ riÃƒÂªng cho quy trÃƒÂ¬nh
	* @param formLabel TÃƒÂªn hiÃ¡Â»Æ’n thÃ¡Â»â€¹ nÃƒÂºt xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param rollback cÃ¡Â»ï¿½ Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u cho viÃ¡Â»â€¡c roolback trong quy trÃƒÂ¬nh
	* @return: bÃ†Â°Ã¡Â»â€ºc trong quy trÃƒÂ¬nh mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	public static org.oep.core.processmgt.model.DossierStep updateDossierStep(
		long id, long dossierProcessId, java.lang.String title, int sequenceNo,
		int daysDuration, java.lang.String doForm, java.lang.String formLabel,
		int rollback, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDossierStep(id, dossierProcessId, title, sequenceNo,
			daysDuration, doForm, formLabel, rollback, serviceContext);
	}

	public static void updateDossierStepResources(
		org.oep.core.processmgt.model.DossierStep dossierStep,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDossierStepResources(dossierStep, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeDossierStep(
		org.oep.core.processmgt.model.DossierStep dossierStep)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossierStep(dossierStep);
	}

	public static void removeDossierStep(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossierStep(id);
	}

	public static void addDossierStepResources(
		org.oep.core.processmgt.model.DossierStep dossierStep,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierStepResources(dossierStep, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addDossierStepResources(
		org.oep.core.processmgt.model.DossierStep dossierStep,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierStepResources(dossierStep, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addDossierStepResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierStepResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DossierStepLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DossierStepLocalService.class.getName());

			if (invokableLocalService instanceof DossierStepLocalService) {
				_service = (DossierStepLocalService)invokableLocalService;
			}
			else {
				_service = new DossierStepLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DossierStepLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DossierStepLocalService service) {
	}

	private static DossierStepLocalService _service;
}