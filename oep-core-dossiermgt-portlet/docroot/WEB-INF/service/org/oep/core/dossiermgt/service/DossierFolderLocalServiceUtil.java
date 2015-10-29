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
 * Provides the local service utility for DossierFolder. This utility wraps
 * {@link org.oep.core.dossiermgt.service.impl.DossierFolderLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see DossierFolderLocalService
 * @see org.oep.core.dossiermgt.service.base.DossierFolderLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.DossierFolderLocalServiceImpl
 * @generated
 */
public class DossierFolderLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.DossierFolderLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dossier folder to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFolder the dossier folder
	* @return the dossier folder that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierFolder addDossierFolder(
		org.oep.core.dossiermgt.model.DossierFolder dossierFolder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDossierFolder(dossierFolder);
	}

	/**
	* Creates a new dossier folder with the primary key. Does not add the dossier folder to the database.
	*
	* @param dossierFolderId the primary key for the new dossier folder
	* @return the new dossier folder
	*/
	public static org.oep.core.dossiermgt.model.DossierFolder createDossierFolder(
		long dossierFolderId) {
		return getService().createDossierFolder(dossierFolderId);
	}

	/**
	* Deletes the dossier folder with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFolderId the primary key of the dossier folder
	* @return the dossier folder that was removed
	* @throws PortalException if a dossier folder with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierFolder deleteDossierFolder(
		long dossierFolderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierFolder(dossierFolderId);
	}

	/**
	* Deletes the dossier folder from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFolder the dossier folder
	* @return the dossier folder that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierFolder deleteDossierFolder(
		org.oep.core.dossiermgt.model.DossierFolder dossierFolder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierFolder(dossierFolder);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierFolderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.dossiermgt.model.DossierFolder fetchDossierFolder(
		long dossierFolderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossierFolder(dossierFolderId);
	}

	/**
	* Returns the dossier folder with the matching UUID and company.
	*
	* @param uuid the dossier folder's UUID
	* @param companyId the primary key of the company
	* @return the matching dossier folder, or <code>null</code> if a matching dossier folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierFolder fetchDossierFolderByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossierFolderByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the dossier folder matching the UUID and group.
	*
	* @param uuid the dossier folder's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier folder, or <code>null</code> if a matching dossier folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierFolder fetchDossierFolderByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossierFolderByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the dossier folder with the primary key.
	*
	* @param dossierFolderId the primary key of the dossier folder
	* @return the dossier folder
	* @throws PortalException if a dossier folder with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierFolder getDossierFolder(
		long dossierFolderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierFolder(dossierFolderId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the dossier folder with the matching UUID and company.
	*
	* @param uuid the dossier folder's UUID
	* @param companyId the primary key of the company
	* @return the matching dossier folder
	* @throws PortalException if a matching dossier folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierFolder getDossierFolderByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierFolderByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the dossier folder matching the UUID and group.
	*
	* @param uuid the dossier folder's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier folder
	* @throws PortalException if a matching dossier folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierFolder getDossierFolderByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierFolderByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<org.oep.core.dossiermgt.model.DossierFolder> getDossierFolders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierFolders(start, end);
	}

	/**
	* Returns the number of dossier folders.
	*
	* @return the number of dossier folders
	* @throws SystemException if a system exception occurred
	*/
	public static int getDossierFoldersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierFoldersCount();
	}

	/**
	* Updates the dossier folder in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierFolder the dossier folder
	* @return the dossier folder that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierFolder updateDossierFolder(
		org.oep.core.dossiermgt.model.DossierFolder dossierFolder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDossierFolder(dossierFolder);
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
	* ThÃƒÂªm UI xem danh sÃƒÂ¡ch hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param folderName tÃƒÂªn UI xem danh sÃƒÂ¡ch hÃ¡Â»â€œ sÃ†Â¡
	* @param parentDossierFolderId mÃƒÂ£ cÃ¡Â»Â§a UI xem danh sÃƒÂ¡ch hÃ¡Â»â€œ sÃ†Â¡ cha
	* @param sequenceNo sÃ¡Â»â€˜ thÃ¡Â»Â© tÃ¡Â»Â± UI xem danh sÃƒÂ¡ch hÃ¡Â»â€œ sÃ†Â¡
	* @param procedureFilter Ã„â€˜iÃ¡Â»ï¿½u kiÃ¡Â»â€¡n lÃ¡Â»ï¿½c theo thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh, cÃƒÂ¡c mÃƒÂ£ cÃƒÂ¡ch nhau bÃ¡Â»Å¸i dÃ¡ÂºÂ¥u ;
	* @param statusFilter Ã„â€˜iÃ¡Â»ï¿½u kiÃ¡Â»â€¡n lÃ¡Â»ï¿½c theo trÃ¡ÂºÂ¡ng thÃƒÂ¡i
	* @param tagFilter Ã„â€˜iÃ¡Â»ï¿½u kiÃ¡Â»â€¡n lÃ¡Â»ï¿½c theo tag
	* @param filterByOrganization lÃ¡Â»ï¿½c hÃ¡Â»â€œ sÃ†Â¡ theo tÃ¡Â»â€¢ chÃ¡Â»Â©c mÃƒÂ  ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng thuÃ¡Â»â„¢c vÃ¡Â»ï¿½
	* @param filterByUser lÃ¡Â»ï¿½c hÃ¡Â»â€œ sÃ†Â¡ chÃ¡Â»â€° do ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng tÃ¡ÂºÂ¡o ra
	* @param orderBy Ã„â€˜iÃ¡Â»ï¿½u kiÃ¡Â»â€¡n sÃ¡ÂºÂ¯p xÃ¡ÂºÂ¿p cÃ¡Â»Â§a cÃƒÂ¡c hÃ¡Â»â€œ sÃ†Â¡
	* @param counting cÃ¡Â»ï¿½ Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u Ã„â€˜Ã¡ÂºÂ¿m sÃ¡Â»â€˜ hÃ¡Â»â€œ sÃ†Â¡ trÃƒÂªn menu
	* @return: new dossier folder
	*/
	public static org.oep.core.dossiermgt.model.DossierFolder addDossierFolder(
		java.lang.String folderName, long parentDossierFolderId,
		int sequenceNo, java.lang.String procedureFilter,
		java.lang.String statusFilter, java.lang.String tagFilter,
		int filterByOrganization, int filterByUser, java.lang.String orderBy,
		int counting, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierFolder(folderName, parentDossierFolderId,
			sequenceNo, procedureFilter, statusFilter, tagFilter,
			filterByOrganization, filterByUser, orderBy, counting,
			serviceContext);
	}

	public static org.oep.core.dossiermgt.model.DossierFolder updateDossierFolder(
		long id, java.lang.String folderName, long parentDossierFolderId,
		int sequenceNo, java.lang.String procedureFilter,
		java.lang.String statusFilter, java.lang.String tagFilter,
		int filterByOrganization, int filterByUser, java.lang.String orderBy,
		int counting, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDossierFolder(id, folderName, parentDossierFolderId,
			sequenceNo, procedureFilter, statusFilter, tagFilter,
			filterByOrganization, filterByUser, orderBy, counting,
			serviceContext);
	}

	public static void updateDossierFolderResources(
		org.oep.core.dossiermgt.model.DossierFolder dossierFolder,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDossierFolderResources(dossierFolder, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeDossierFolder(
		org.oep.core.dossiermgt.model.DossierFolder dossierFolder)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossierFolder(dossierFolder);
	}

	public static void removeDossierFolder(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossierFolder(id);
	}

	public static void addDossierFolderResources(
		org.oep.core.dossiermgt.model.DossierFolder dossierFolder,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierFolderResources(dossierFolder, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addDossierFolderResources(
		org.oep.core.dossiermgt.model.DossierFolder dossierFolder,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierFolderResources(dossierFolder, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addDossierFolderResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addDossierFolderResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DossierFolderLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DossierFolderLocalService.class.getName());

			if (invokableLocalService instanceof DossierFolderLocalService) {
				_service = (DossierFolderLocalService)invokableLocalService;
			}
			else {
				_service = new DossierFolderLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DossierFolderLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DossierFolderLocalService service) {
	}

	private static DossierFolderLocalService _service;
}