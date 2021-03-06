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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreateFileLocalService}.
 *
 * @author trungdk
 * @see CreateFileLocalService
 * @generated
 */
public class CreateFileLocalServiceWrapper implements CreateFileLocalService,
	ServiceWrapper<CreateFileLocalService> {
	public CreateFileLocalServiceWrapper(
		CreateFileLocalService createFileLocalService) {
		_createFileLocalService = createFileLocalService;
	}

	/**
	* Adds the create file to the database. Also notifies the appropriate model listeners.
	*
	* @param createFile the create file
	* @return the create file that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.CreateFile addCreateFile(
		org.oep.core.processmgt.model.CreateFile createFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.addCreateFile(createFile);
	}

	/**
	* Creates a new create file with the primary key. Does not add the create file to the database.
	*
	* @param createFileId the primary key for the new create file
	* @return the new create file
	*/
	@Override
	public org.oep.core.processmgt.model.CreateFile createCreateFile(
		long createFileId) {
		return _createFileLocalService.createCreateFile(createFileId);
	}

	/**
	* Deletes the create file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param createFileId the primary key of the create file
	* @return the create file that was removed
	* @throws PortalException if a create file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.CreateFile deleteCreateFile(
		long createFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.deleteCreateFile(createFileId);
	}

	/**
	* Deletes the create file from the database. Also notifies the appropriate model listeners.
	*
	* @param createFile the create file
	* @return the create file that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.CreateFile deleteCreateFile(
		org.oep.core.processmgt.model.CreateFile createFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.deleteCreateFile(createFile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _createFileLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.CreateFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.CreateFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.processmgt.model.CreateFile fetchCreateFile(
		long createFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.fetchCreateFile(createFileId);
	}

	/**
	* Returns the create file with the primary key.
	*
	* @param createFileId the primary key of the create file
	* @return the create file
	* @throws PortalException if a create file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.CreateFile getCreateFile(
		long createFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.getCreateFile(createFileId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the create files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.CreateFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of create files
	* @param end the upper bound of the range of create files (not inclusive)
	* @return the range of create files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.processmgt.model.CreateFile> getCreateFiles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.getCreateFiles(start, end);
	}

	/**
	* Returns the number of create files.
	*
	* @return the number of create files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCreateFilesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.getCreateFilesCount();
	}

	/**
	* Updates the create file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param createFile the create file
	* @return the create file that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.CreateFile updateCreateFile(
		org.oep.core.processmgt.model.CreateFile createFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.updateCreateFile(createFile);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _createFileLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_createFileLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _createFileLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* ThÃƒÂªm vÃ¡ÂºÂ¿t hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃ¡ÂºÂ¡o ra tÃ¡ÂºÂ¡i cÃƒÂ¡c bÃ†Â°Ã¡Â»â€ºc trong quy trÃƒÂ¬nh xÃ¡Â»Â­ lÃƒÂ½
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param dossierProcessId nÃ¡ÂºÂ±m trong quy trÃƒÂ¬nh nÃƒÂ o
	* @param dossierStepId nÃ¡ÂºÂ±m tÃ¡ÂºÂ¡i bÃ†Â°Ã¡Â»â€ºc xÃ¡Â»Â­ lÃƒÂ½ nÃƒÂ o
	* @param stepDate thÃ¡Â»ï¿½i gian bÃ¡ÂºÂ¯t Ã„â€˜Ã¡ÂºÂ§u cÃ¡Â»Â§a bÃ†Â°Ã¡Â»â€ºc
	* @param docFileId file hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃ¡ÂºÂ¡o ra bÃ¡Â»Å¸i form xÃ¡Â»Â­ lÃƒÂ½
	* @return: vÃ¡ÂºÂ¿t hÃ¡Â»â€œ sÃ†Â¡ cÃ¡Â»Â§a quy trÃƒÂ¬nh mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃ¡ÂºÂ¡o
	*/
	@Override
	public org.oep.core.processmgt.model.CreateFile addCreateFile(
		long processOrderId, long dossierStepId, java.util.Date stepDate,
		long docFileId, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.addCreateFile(processOrderId,
			dossierStepId, stepDate, docFileId, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin vÃ¡ÂºÂ¿t hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃ¡ÂºÂ¡o ra tÃ¡ÂºÂ¡i cÃƒÂ¡c bÃ†Â°Ã¡Â»â€ºc trong quy trÃƒÂ¬nh xÃ¡Â»Â­ lÃƒÂ½
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ vÃ¡ÂºÂ¿t hÃ¡Â»â€œ sÃ†Â¡ tÃ¡ÂºÂ¡i cÃƒÂ¡c bÃ†Â°Ã¡Â»â€ºc trong quy trÃƒÂ¬nh
	* @param dossierProcessId nÃ¡ÂºÂ±m trong quy trÃƒÂ¬nh nÃƒÂ o
	* @param dossierStepId nÃ¡ÂºÂ±m tÃ¡ÂºÂ¡i bÃ†Â°Ã¡Â»â€ºc xÃ¡Â»Â­ lÃƒÂ½ nÃƒÂ o
	* @param stepDate thÃ¡Â»ï¿½i gian bÃ¡ÂºÂ¯t Ã„â€˜Ã¡ÂºÂ§u cÃ¡Â»Â§a bÃ†Â°Ã¡Â»â€ºc
	* @param docFileId file hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃ¡ÂºÂ¡o ra bÃ¡Â»Å¸i form xÃ¡Â»Â­ lÃƒÂ½
	* @return: vÃ¡ÂºÂ¿t hÃ¡Â»â€œ sÃ†Â¡ cÃ¡Â»Â§a quy trÃƒÂ¬nh mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	@Override
	public org.oep.core.processmgt.model.CreateFile updateCreateFile(long id,
		long processOrderId, long dossierStepId, java.util.Date stepDate,
		long docFileId, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _createFileLocalService.updateCreateFile(id, processOrderId,
			dossierStepId, stepDate, docFileId, serviceContext);
	}

	@Override
	public void updateCreateFileResources(
		org.oep.core.processmgt.model.CreateFile createFile,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_createFileLocalService.updateCreateFileResources(createFile,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeCreateFile(
		org.oep.core.processmgt.model.CreateFile createFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_createFileLocalService.removeCreateFile(createFile);
	}

	@Override
	public void removeCreateFile(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_createFileLocalService.removeCreateFile(id);
	}

	@Override
	public void addCreateFileResources(
		org.oep.core.processmgt.model.CreateFile createFile,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_createFileLocalService.addCreateFileResources(createFile,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addCreateFileResources(
		org.oep.core.processmgt.model.CreateFile createFile,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_createFileLocalService.addCreateFileResources(createFile,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addCreateFileResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_createFileLocalService.addCreateFileResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CreateFileLocalService getWrappedCreateFileLocalService() {
		return _createFileLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCreateFileLocalService(
		CreateFileLocalService createFileLocalService) {
		_createFileLocalService = createFileLocalService;
	}

	@Override
	public CreateFileLocalService getWrappedService() {
		return _createFileLocalService;
	}

	@Override
	public void setWrappedService(CreateFileLocalService createFileLocalService) {
		_createFileLocalService = createFileLocalService;
	}

	private CreateFileLocalService _createFileLocalService;
}