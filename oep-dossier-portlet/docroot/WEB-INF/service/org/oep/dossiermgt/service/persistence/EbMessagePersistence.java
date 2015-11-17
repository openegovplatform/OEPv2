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

package org.oep.dossiermgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.dossiermgt.model.EbMessage;

/**
 * The persistence interface for the eb message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see EbMessagePersistenceImpl
 * @see EbMessageUtil
 * @generated
 */
public interface EbMessagePersistence extends BasePersistence<EbMessage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EbMessageUtil} to access the eb message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the eb message in the entity cache if it is enabled.
	*
	* @param ebMessage the eb message
	*/
	public void cacheResult(org.oep.dossiermgt.model.EbMessage ebMessage);

	/**
	* Caches the eb messages in the entity cache if it is enabled.
	*
	* @param ebMessages the eb messages
	*/
	public void cacheResult(
		java.util.List<org.oep.dossiermgt.model.EbMessage> ebMessages);

	/**
	* Creates a new eb message with the primary key. Does not add the eb message to the database.
	*
	* @param ebMessageId the primary key for the new eb message
	* @return the new eb message
	*/
	public org.oep.dossiermgt.model.EbMessage create(long ebMessageId);

	/**
	* Removes the eb message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ebMessageId the primary key of the eb message
	* @return the eb message that was removed
	* @throws org.oep.dossiermgt.NoSuchEbMessageException if a eb message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.EbMessage remove(long ebMessageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchEbMessageException;

	public org.oep.dossiermgt.model.EbMessage updateImpl(
		org.oep.dossiermgt.model.EbMessage ebMessage)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the eb message with the primary key or throws a {@link org.oep.dossiermgt.NoSuchEbMessageException} if it could not be found.
	*
	* @param ebMessageId the primary key of the eb message
	* @return the eb message
	* @throws org.oep.dossiermgt.NoSuchEbMessageException if a eb message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.EbMessage findByPrimaryKey(long ebMessageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchEbMessageException;

	/**
	* Returns the eb message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ebMessageId the primary key of the eb message
	* @return the eb message, or <code>null</code> if a eb message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dossiermgt.model.EbMessage fetchByPrimaryKey(
		long ebMessageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the eb messages.
	*
	* @return the eb messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.EbMessage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the eb messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.EbMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eb messages
	* @param end the upper bound of the range of eb messages (not inclusive)
	* @return the range of eb messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.EbMessage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the eb messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.EbMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eb messages
	* @param end the upper bound of the range of eb messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of eb messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dossiermgt.model.EbMessage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the eb messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of eb messages.
	*
	* @return the number of eb messages
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}