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

package org.oep.core.processmgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.core.processmgt.model.CreateFile;

/**
 * The persistence interface for the create file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see CreateFilePersistenceImpl
 * @see CreateFileUtil
 * @generated
 */
public interface CreateFilePersistence extends BasePersistence<CreateFile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreateFileUtil} to access the create file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the create file in the entity cache if it is enabled.
	*
	* @param createFile the create file
	*/
	public void cacheResult(org.oep.core.processmgt.model.CreateFile createFile);

	/**
	* Caches the create files in the entity cache if it is enabled.
	*
	* @param createFiles the create files
	*/
	public void cacheResult(
		java.util.List<org.oep.core.processmgt.model.CreateFile> createFiles);

	/**
	* Creates a new create file with the primary key. Does not add the create file to the database.
	*
	* @param createFileId the primary key for the new create file
	* @return the new create file
	*/
	public org.oep.core.processmgt.model.CreateFile create(long createFileId);

	/**
	* Removes the create file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param createFileId the primary key of the create file
	* @return the create file that was removed
	* @throws org.oep.core.processmgt.NoSuchCreateFileException if a create file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.processmgt.model.CreateFile remove(long createFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.processmgt.NoSuchCreateFileException;

	public org.oep.core.processmgt.model.CreateFile updateImpl(
		org.oep.core.processmgt.model.CreateFile createFile)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the create file with the primary key or throws a {@link org.oep.core.processmgt.NoSuchCreateFileException} if it could not be found.
	*
	* @param createFileId the primary key of the create file
	* @return the create file
	* @throws org.oep.core.processmgt.NoSuchCreateFileException if a create file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.processmgt.model.CreateFile findByPrimaryKey(
		long createFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.processmgt.NoSuchCreateFileException;

	/**
	* Returns the create file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param createFileId the primary key of the create file
	* @return the create file, or <code>null</code> if a create file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.processmgt.model.CreateFile fetchByPrimaryKey(
		long createFileId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the create files.
	*
	* @return the create files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.processmgt.model.CreateFile> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.processmgt.model.CreateFile> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the create files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.CreateFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of create files
	* @param end the upper bound of the range of create files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of create files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.processmgt.model.CreateFile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the create files from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of create files.
	*
	* @return the number of create files
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}