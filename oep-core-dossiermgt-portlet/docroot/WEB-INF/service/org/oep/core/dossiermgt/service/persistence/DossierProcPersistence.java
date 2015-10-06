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

import org.oep.core.dossiermgt.model.DossierProc;

/**
 * The persistence interface for the dossier proc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcPersistenceImpl
 * @see DossierProcUtil
 * @generated
 */
public interface DossierProcPersistence extends BasePersistence<DossierProc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierProcUtil} to access the dossier proc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dossier procs where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc[] findByC_PrevAndNext(
		long dossierProcId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Removes all the dossier procs where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc[] findByC_G_PrevAndNext(
		long dossierProcId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Removes all the dossier procs where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_U(
		long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_U(
		long companyId, long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_U(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_G_U_First(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_G_U_First(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_G_U_Last(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_G_U_Last(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc[] findByC_G_U_PrevAndNext(
		long dossierProcId, long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Removes all the dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G_U(long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_U(long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier proc where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63; or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcException} if it could not be found.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dossierProcNo the dossier proc no
	* @return the matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_G_DPN(
		long companyId, long groupId, java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the dossier proc where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dossierProcNo the dossier proc no
	* @return the matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_G_DPN(
		long companyId, long groupId, java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier proc where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dossierProcNo the dossier proc no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_G_DPN(
		long companyId, long groupId, java.lang.String dossierProcNo,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dossier proc where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dossierProcNo the dossier proc no
	* @return the dossier proc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc removeByC_G_DPN(
		long companyId, long groupId, java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dossierProcNo the dossier proc no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_DPN(long companyId, long groupId,
		java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs where companyId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_ANO(
		long companyId, java.lang.String administrationNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and administrationNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_ANO(
		long companyId, java.lang.String administrationNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and administrationNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_ANO(
		long companyId, java.lang.String administrationNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_ANO_First(
		long companyId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_ANO_First(
		long companyId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_ANO_Last(
		long companyId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_ANO_Last(
		long companyId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc[] findByC_ANO_PrevAndNext(
		long dossierProcId, long companyId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Removes all the dossier procs where companyId = &#63; and administrationNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_ANO(long companyId, java.lang.String administrationNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs where companyId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_ANO(long companyId, java.lang.String administrationNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_ANO(
		long companyId, long groupId, java.lang.String administrationNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_ANO(
		long companyId, long groupId, java.lang.String administrationNo,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_ANO(
		long companyId, long groupId, java.lang.String administrationNo,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_G_ANO_First(
		long companyId, long groupId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_G_ANO_First(
		long companyId, long groupId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_G_ANO_Last(
		long companyId, long groupId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_G_ANO_Last(
		long companyId, long groupId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc[] findByC_G_ANO_PrevAndNext(
		long dossierProcId, long companyId, long groupId,
		java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Removes all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G_ANO(long companyId, long groupId,
		java.lang.String administrationNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_ANO(long companyId, long groupId,
		java.lang.String administrationNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs where companyId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_DNO(
		long companyId, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_DNO(
		long companyId, java.lang.String domainNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_DNO(
		long companyId, java.lang.String domainNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_DNO_First(
		long companyId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_DNO_First(
		long companyId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_DNO_Last(
		long companyId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_DNO_Last(
		long companyId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc[] findByC_DNO_PrevAndNext(
		long dossierProcId, long companyId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Removes all the dossier procs where companyId = &#63; and domainNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_DNO(long companyId, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs where companyId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_DNO(long companyId, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_DNO(
		long companyId, long groupId, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_DNO(
		long companyId, long groupId, java.lang.String domainNo, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_DNO(
		long companyId, long groupId, java.lang.String domainNo, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_G_DNO_First(
		long companyId, long groupId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_G_DNO_First(
		long companyId, long groupId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_G_DNO_Last(
		long companyId, long groupId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_G_DNO_Last(
		long companyId, long groupId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc[] findByC_G_DNO_PrevAndNext(
		long dossierProcId, long companyId, long groupId,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Removes all the dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G_DNO(long companyId, long groupId,
		java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_DNO(long companyId, long groupId,
		java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_ANO_DNO(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_ANO_DNO(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_ANO_DNO(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_ANO_DNO_First(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_ANO_DNO_First(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_ANO_DNO_Last(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_ANO_DNO_Last(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc[] findByC_ANO_DNO_PrevAndNext(
		long dossierProcId, long companyId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Removes all the dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_ANO_DNO(long companyId,
		java.lang.String administrationNo, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_ANO_DNO(long companyId,
		java.lang.String administrationNo, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_ANO_DNO(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_ANO_DNO(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_ANO_DNO(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_G_ANO_DNO_First(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_G_ANO_DNO_First(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_G_ANO_DNO_Last(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_G_ANO_DNO_Last(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc[] findByC_G_ANO_DNO_PrevAndNext(
		long dossierProcId, long companyId, long groupId,
		java.lang.String administrationNo, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Removes all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G_ANO_DNO(long companyId, long groupId,
		java.lang.String administrationNo, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_ANO_DNO(long companyId, long groupId,
		java.lang.String administrationNo, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier proc where dossierProcNo = &#63; or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcException} if it could not be found.
	*
	* @param dossierProcNo the dossier proc no
	* @return the matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByDPN(
		java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the dossier proc where dossierProcNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierProcNo the dossier proc no
	* @return the matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByDPN(
		java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier proc where dossierProcNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierProcNo the dossier proc no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByDPN(
		java.lang.String dossierProcNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dossier proc where dossierProcNo = &#63; from the database.
	*
	* @param dossierProcNo the dossier proc no
	* @return the dossier proc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc removeByDPN(
		java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the number of dossier procs where dossierProcNo = &#63;.
	*
	* @param dossierProcNo the dossier proc no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByDPN(java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier proc in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the first dossier proc in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier proc in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the last dossier proc in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where groupId = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc[] findByGroupId_PrevAndNext(
		long dossierProcId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Removes all the dossier procs where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_AC(
		long companyId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param active the active
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_AC(
		long companyId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param active the active
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_AC(
		long companyId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_AC_First(
		long companyId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_AC_First(
		long companyId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByC_AC_Last(
		long companyId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByC_AC_Last(
		long companyId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc[] findByC_AC_PrevAndNext(
		long dossierProcId, long companyId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Removes all the dossier procs where companyId = &#63; and active = &#63; from the database.
	*
	* @param companyId the company ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_AC(long companyId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_AC(long companyId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByG_AC(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs where groupId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param active the active
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByG_AC(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs where groupId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param active the active
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByG_AC(
		long groupId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier proc in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByG_AC_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the first dossier proc in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByG_AC_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier proc in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByG_AC_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the last dossier proc in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByG_AC_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc[] findByG_AC_PrevAndNext(
		long dossierProcId, long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Removes all the dossier procs where groupId = &#63; and active = &#63; from the database.
	*
	* @param groupId the group ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_AC(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_AC(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dossier proc in the entity cache if it is enabled.
	*
	* @param dossierProc the dossier proc
	*/
	public void cacheResult(
		org.oep.core.dossiermgt.model.DossierProc dossierProc);

	/**
	* Caches the dossier procs in the entity cache if it is enabled.
	*
	* @param dossierProcs the dossier procs
	*/
	public void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.DossierProc> dossierProcs);

	/**
	* Creates a new dossier proc with the primary key. Does not add the dossier proc to the database.
	*
	* @param dossierProcId the primary key for the new dossier proc
	* @return the new dossier proc
	*/
	public org.oep.core.dossiermgt.model.DossierProc create(long dossierProcId);

	/**
	* Removes the dossier proc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc that was removed
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc remove(long dossierProcId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	public org.oep.core.dossiermgt.model.DossierProc updateImpl(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier proc with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcException} if it could not be found.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc findByPrimaryKey(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException;

	/**
	* Returns the dossier proc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc, or <code>null</code> if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierProc fetchByPrimaryKey(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier procs.
	*
	* @return the dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier procs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier procs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossier procs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier procs.
	*
	* @return the number of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}