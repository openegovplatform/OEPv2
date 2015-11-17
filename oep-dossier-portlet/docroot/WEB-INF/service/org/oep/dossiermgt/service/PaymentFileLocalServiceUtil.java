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
 * Provides the local service utility for PaymentFile. This utility wraps
 * {@link org.oep.dossiermgt.service.impl.PaymentFileLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see PaymentFileLocalService
 * @see org.oep.dossiermgt.service.base.PaymentFileLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.impl.PaymentFileLocalServiceImpl
 * @generated
 */
public class PaymentFileLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.dossiermgt.service.impl.PaymentFileLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the payment file to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFile the payment file
	* @return the payment file that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.PaymentFile addPaymentFile(
		org.oep.dossiermgt.model.PaymentFile paymentFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPaymentFile(paymentFile);
	}

	/**
	* Creates a new payment file with the primary key. Does not add the payment file to the database.
	*
	* @param paymentFileId the primary key for the new payment file
	* @return the new payment file
	*/
	public static org.oep.dossiermgt.model.PaymentFile createPaymentFile(
		long paymentFileId) {
		return getService().createPaymentFile(paymentFileId);
	}

	/**
	* Deletes the payment file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFileId the primary key of the payment file
	* @return the payment file that was removed
	* @throws PortalException if a payment file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.PaymentFile deletePaymentFile(
		long paymentFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePaymentFile(paymentFileId);
	}

	/**
	* Deletes the payment file from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFile the payment file
	* @return the payment file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.PaymentFile deletePaymentFile(
		org.oep.dossiermgt.model.PaymentFile paymentFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePaymentFile(paymentFile);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.dossiermgt.model.PaymentFile fetchPaymentFile(
		long paymentFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPaymentFile(paymentFileId);
	}

	/**
	* Returns the payment file with the matching UUID and company.
	*
	* @param uuid the payment file's UUID
	* @param companyId the primary key of the company
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.PaymentFile fetchPaymentFileByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPaymentFileByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the payment file matching the UUID and group.
	*
	* @param uuid the payment file's UUID
	* @param groupId the primary key of the group
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.PaymentFile fetchPaymentFileByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPaymentFileByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the payment file with the primary key.
	*
	* @param paymentFileId the primary key of the payment file
	* @return the payment file
	* @throws PortalException if a payment file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.PaymentFile getPaymentFile(
		long paymentFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPaymentFile(paymentFileId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the payment file with the matching UUID and company.
	*
	* @param uuid the payment file's UUID
	* @param companyId the primary key of the company
	* @return the matching payment file
	* @throws PortalException if a matching payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.PaymentFile getPaymentFileByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPaymentFileByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the payment file matching the UUID and group.
	*
	* @param uuid the payment file's UUID
	* @param groupId the primary key of the group
	* @return the matching payment file
	* @throws PortalException if a matching payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.PaymentFile getPaymentFileByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPaymentFileByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the payment files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of payment files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.PaymentFile> getPaymentFiles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPaymentFiles(start, end);
	}

	/**
	* Returns the number of payment files.
	*
	* @return the number of payment files
	* @throws SystemException if a system exception occurred
	*/
	public static int getPaymentFilesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPaymentFilesCount();
	}

	/**
	* Updates the payment file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentFile the payment file
	* @return the payment file that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.PaymentFile updatePaymentFile(
		org.oep.dossiermgt.model.PaymentFile paymentFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePaymentFile(paymentFile);
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
	* Add payment file
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new payment file
	*/
	public static org.oep.dossiermgt.model.PaymentFile addPaymentFile(
		long organizationId, java.lang.String govAgencyId,
		java.lang.String govAgencyName, java.lang.String subjectId,
		java.lang.String subjectType, java.lang.String subjectName, int amount,
		java.lang.String paymentType, java.lang.String paymentDescription,
		java.lang.String transactionInfo, long fileEntryId,
		java.util.Date checkingDate, long checkingUserId,
		java.lang.String checkingUserName, int checkingResult,
		java.lang.String checkingNote, long ebMessageId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addPaymentFile(organizationId, govAgencyId, govAgencyName,
			subjectId, subjectType, subjectName, amount, paymentType,
			paymentDescription, transactionInfo, fileEntryId, checkingDate,
			checkingUserId, checkingUserName, checkingResult, checkingNote,
			ebMessageId, serviceContext);
	}

	public static org.oep.dossiermgt.model.PaymentFile updatePaymentFile(
		long id, long organizationId, java.lang.String govAgencyId,
		java.lang.String govAgencyName, java.lang.String subjectId,
		java.lang.String subjectType, java.lang.String subjectName, int amount,
		java.lang.String paymentType, java.lang.String paymentDescription,
		java.lang.String transactionInfo, long fileEntryId,
		java.util.Date checkingDate, long checkingUserId,
		java.lang.String checkingUserName, int checkingResult,
		java.lang.String checkingNote, long ebMessageId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatePaymentFile(id, organizationId, govAgencyId,
			govAgencyName, subjectId, subjectType, subjectName, amount,
			paymentType, paymentDescription, transactionInfo, fileEntryId,
			checkingDate, checkingUserId, checkingUserName, checkingResult,
			checkingNote, ebMessageId, serviceContext);
	}

	public static void updatePaymentFileResources(
		org.oep.dossiermgt.model.PaymentFile paymentFile,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updatePaymentFileResources(paymentFile, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removePaymentFile(
		org.oep.dossiermgt.model.PaymentFile paymentFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removePaymentFile(paymentFile);
	}

	public static void removePaymentFile(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removePaymentFile(id);
	}

	public static void addPaymentFileResources(
		org.oep.dossiermgt.model.PaymentFile paymentFile,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addPaymentFileResources(paymentFile, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addPaymentFileResources(
		org.oep.dossiermgt.model.PaymentFile paymentFile,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addPaymentFileResources(paymentFile, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addPaymentFileResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addPaymentFileResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static PaymentFileLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PaymentFileLocalService.class.getName());

			if (invokableLocalService instanceof PaymentFileLocalService) {
				_service = (PaymentFileLocalService)invokableLocalService;
			}
			else {
				_service = new PaymentFileLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(PaymentFileLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PaymentFileLocalService service) {
	}

	private static PaymentFileLocalService _service;
}