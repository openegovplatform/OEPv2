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

package org.oep.usermgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.usermgt.model.JobPos;

import java.util.List;

/**
 * The persistence utility for the Job Pos service. This utility wraps {@link JobPosPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see JobPosPersistence
 * @see JobPosPersistenceImpl
 * @generated
 */
public class JobPosUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(JobPos jobPos) {
		getPersistence().clearCache(jobPos);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JobPos> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JobPos> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JobPos> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static JobPos update(JobPos jobPos) throws SystemException {
		return getPersistence().update(jobPos);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static JobPos update(JobPos jobPos, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(jobPos, serviceContext);
	}

	/**
	* Returns all the Job Poses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId);
	}

	/**
	* Returns a range of all the Job Poses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @return the range of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the Job Poses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first Job Pos in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos findByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence().findByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the first Job Pos in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos fetchByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the last Job Pos in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos findByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence().findByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last Job Pos in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos fetchByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the Job Poses before and after the current Job Pos in the ordered set where companyId = &#63;.
	*
	* @param jobPosId the primary key of the current Job Pos
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos[] findByC_PrevAndNext(
		long jobPosId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence()
				   .findByC_PrevAndNext(jobPosId, companyId, orderByComparator);
	}

	/**
	* Removes all the Job Poses where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC(companyId);
	}

	/**
	* Returns the number of Job Poses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC(companyId);
	}

	/**
	* Returns all the Job Poses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByG(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId);
	}

	/**
	* Returns a range of all the Job Poses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @return the range of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByG(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the Job Poses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByG(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first Job Pos in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos findByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence().findByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the first Job Pos in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos fetchByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the last Job Pos in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos findByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence().findByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last Job Pos in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos fetchByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the Job Poses before and after the current Job Pos in the ordered set where groupId = &#63;.
	*
	* @param jobPosId the primary key of the current Job Pos
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos[] findByG_PrevAndNext(
		long jobPosId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence()
				   .findByG_PrevAndNext(jobPosId, groupId, orderByComparator);
	}

	/**
	* Removes all the Job Poses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG(groupId);
	}

	/**
	* Returns the number of Job Poses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG(groupId);
	}

	/**
	* Returns all the Job Poses where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @return the matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByWU(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWU(workingUnitId);
	}

	/**
	* Returns a range of all the Job Poses where workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @return the range of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByWU(
		long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWU(workingUnitId, start, end);
	}

	/**
	* Returns an ordered range of all the Job Poses where workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByWU(
		long workingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWU(workingUnitId, start, end, orderByComparator);
	}

	/**
	* Returns the first Job Pos in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos findByWU_First(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence().findByWU_First(workingUnitId, orderByComparator);
	}

	/**
	* Returns the first Job Pos in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos fetchByWU_First(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByWU_First(workingUnitId, orderByComparator);
	}

	/**
	* Returns the last Job Pos in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos findByWU_Last(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence().findByWU_Last(workingUnitId, orderByComparator);
	}

	/**
	* Returns the last Job Pos in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos fetchByWU_Last(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByWU_Last(workingUnitId, orderByComparator);
	}

	/**
	* Returns the Job Poses before and after the current Job Pos in the ordered set where workingUnitId = &#63;.
	*
	* @param jobPosId the primary key of the current Job Pos
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos[] findByWU_PrevAndNext(
		long jobPosId, long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence()
				   .findByWU_PrevAndNext(jobPosId, workingUnitId,
			orderByComparator);
	}

	/**
	* Removes all the Job Poses where workingUnitId = &#63; from the database.
	*
	* @param workingUnitId the working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByWU(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByWU(workingUnitId);
	}

	/**
	* Returns the number of Job Poses where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @return the number of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByWU(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByWU(workingUnitId);
	}

	/**
	* Returns all the Job Poses where workingUnitId = &#63; and positionCatNo = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param positionCatNo the position cat no
	* @return the matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByWU_PCN(
		long workingUnitId, java.lang.String positionCatNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWU_PCN(workingUnitId, positionCatNo);
	}

	/**
	* Returns a range of all the Job Poses where workingUnitId = &#63; and positionCatNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param positionCatNo the position cat no
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @return the range of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByWU_PCN(
		long workingUnitId, java.lang.String positionCatNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWU_PCN(workingUnitId, positionCatNo, start, end);
	}

	/**
	* Returns an ordered range of all the Job Poses where workingUnitId = &#63; and positionCatNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param positionCatNo the position cat no
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByWU_PCN(
		long workingUnitId, java.lang.String positionCatNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWU_PCN(workingUnitId, positionCatNo, start, end,
			orderByComparator);
	}

	/**
	* Returns the first Job Pos in the ordered set where workingUnitId = &#63; and positionCatNo = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param positionCatNo the position cat no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos findByWU_PCN_First(
		long workingUnitId, java.lang.String positionCatNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence()
				   .findByWU_PCN_First(workingUnitId, positionCatNo,
			orderByComparator);
	}

	/**
	* Returns the first Job Pos in the ordered set where workingUnitId = &#63; and positionCatNo = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param positionCatNo the position cat no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos fetchByWU_PCN_First(
		long workingUnitId, java.lang.String positionCatNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWU_PCN_First(workingUnitId, positionCatNo,
			orderByComparator);
	}

	/**
	* Returns the last Job Pos in the ordered set where workingUnitId = &#63; and positionCatNo = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param positionCatNo the position cat no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos findByWU_PCN_Last(
		long workingUnitId, java.lang.String positionCatNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence()
				   .findByWU_PCN_Last(workingUnitId, positionCatNo,
			orderByComparator);
	}

	/**
	* Returns the last Job Pos in the ordered set where workingUnitId = &#63; and positionCatNo = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param positionCatNo the position cat no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos fetchByWU_PCN_Last(
		long workingUnitId, java.lang.String positionCatNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWU_PCN_Last(workingUnitId, positionCatNo,
			orderByComparator);
	}

	/**
	* Returns the Job Poses before and after the current Job Pos in the ordered set where workingUnitId = &#63; and positionCatNo = &#63;.
	*
	* @param jobPosId the primary key of the current Job Pos
	* @param workingUnitId the working unit ID
	* @param positionCatNo the position cat no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos[] findByWU_PCN_PrevAndNext(
		long jobPosId, long workingUnitId, java.lang.String positionCatNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence()
				   .findByWU_PCN_PrevAndNext(jobPosId, workingUnitId,
			positionCatNo, orderByComparator);
	}

	/**
	* Removes all the Job Poses where workingUnitId = &#63; and positionCatNo = &#63; from the database.
	*
	* @param workingUnitId the working unit ID
	* @param positionCatNo the position cat no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByWU_PCN(long workingUnitId,
		java.lang.String positionCatNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByWU_PCN(workingUnitId, positionCatNo);
	}

	/**
	* Returns the number of Job Poses where workingUnitId = &#63; and positionCatNo = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param positionCatNo the position cat no
	* @return the number of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByWU_PCN(long workingUnitId,
		java.lang.String positionCatNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByWU_PCN(workingUnitId, positionCatNo);
	}

	/**
	* Returns all the Job Poses where workingUnitId = &#63; and leader = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param leader the leader
	* @return the matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByWU_L(
		long workingUnitId, int leader)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWU_L(workingUnitId, leader);
	}

	/**
	* Returns a range of all the Job Poses where workingUnitId = &#63; and leader = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param leader the leader
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @return the range of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByWU_L(
		long workingUnitId, int leader, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWU_L(workingUnitId, leader, start, end);
	}

	/**
	* Returns an ordered range of all the Job Poses where workingUnitId = &#63; and leader = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param leader the leader
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findByWU_L(
		long workingUnitId, int leader, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWU_L(workingUnitId, leader, start, end,
			orderByComparator);
	}

	/**
	* Returns the first Job Pos in the ordered set where workingUnitId = &#63; and leader = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param leader the leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos findByWU_L_First(
		long workingUnitId, int leader,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence()
				   .findByWU_L_First(workingUnitId, leader, orderByComparator);
	}

	/**
	* Returns the first Job Pos in the ordered set where workingUnitId = &#63; and leader = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param leader the leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos fetchByWU_L_First(
		long workingUnitId, int leader,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWU_L_First(workingUnitId, leader, orderByComparator);
	}

	/**
	* Returns the last Job Pos in the ordered set where workingUnitId = &#63; and leader = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param leader the leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos findByWU_L_Last(
		long workingUnitId, int leader,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence()
				   .findByWU_L_Last(workingUnitId, leader, orderByComparator);
	}

	/**
	* Returns the last Job Pos in the ordered set where workingUnitId = &#63; and leader = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param leader the leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Job Pos, or <code>null</code> if a matching Job Pos could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos fetchByWU_L_Last(
		long workingUnitId, int leader,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWU_L_Last(workingUnitId, leader, orderByComparator);
	}

	/**
	* Returns the Job Poses before and after the current Job Pos in the ordered set where workingUnitId = &#63; and leader = &#63;.
	*
	* @param jobPosId the primary key of the current Job Pos
	* @param workingUnitId the working unit ID
	* @param leader the leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos[] findByWU_L_PrevAndNext(
		long jobPosId, long workingUnitId, int leader,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence()
				   .findByWU_L_PrevAndNext(jobPosId, workingUnitId, leader,
			orderByComparator);
	}

	/**
	* Removes all the Job Poses where workingUnitId = &#63; and leader = &#63; from the database.
	*
	* @param workingUnitId the working unit ID
	* @param leader the leader
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByWU_L(long workingUnitId, int leader)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByWU_L(workingUnitId, leader);
	}

	/**
	* Returns the number of Job Poses where workingUnitId = &#63; and leader = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param leader the leader
	* @return the number of matching Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByWU_L(long workingUnitId, int leader)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByWU_L(workingUnitId, leader);
	}

	/**
	* Caches the Job Pos in the entity cache if it is enabled.
	*
	* @param jobPos the Job Pos
	*/
	public static void cacheResult(org.oep.usermgt.model.JobPos jobPos) {
		getPersistence().cacheResult(jobPos);
	}

	/**
	* Caches the Job Poses in the entity cache if it is enabled.
	*
	* @param jobPoses the Job Poses
	*/
	public static void cacheResult(
		java.util.List<org.oep.usermgt.model.JobPos> jobPoses) {
		getPersistence().cacheResult(jobPoses);
	}

	/**
	* Creates a new Job Pos with the primary key. Does not add the Job Pos to the database.
	*
	* @param jobPosId the primary key for the new Job Pos
	* @return the new Job Pos
	*/
	public static org.oep.usermgt.model.JobPos create(long jobPosId) {
		return getPersistence().create(jobPosId);
	}

	/**
	* Removes the Job Pos with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPosId the primary key of the Job Pos
	* @return the Job Pos that was removed
	* @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos remove(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence().remove(jobPosId);
	}

	public static org.oep.usermgt.model.JobPos updateImpl(
		org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(jobPos);
	}

	/**
	* Returns the Job Pos with the primary key or throws a {@link org.oep.usermgt.NoSuchJobPosException} if it could not be found.
	*
	* @param jobPosId the primary key of the Job Pos
	* @return the Job Pos
	* @throws org.oep.usermgt.NoSuchJobPosException if a Job Pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos findByPrimaryKey(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.usermgt.NoSuchJobPosException {
		return getPersistence().findByPrimaryKey(jobPosId);
	}

	/**
	* Returns the Job Pos with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobPosId the primary key of the Job Pos
	* @return the Job Pos, or <code>null</code> if a Job Pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos fetchByPrimaryKey(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(jobPosId);
	}

	/**
	* Returns all the Job Poses.
	*
	* @return the Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Job Poses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @return the range of Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Job Poses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the Job Poses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Job Poses.
	*
	* @return the number of Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the employees associated with the Job Pos.
	*
	* @param pk the primary key of the Job Pos
	* @return the employees associated with the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Employee> getEmployees(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getEmployees(pk);
	}

	/**
	* Returns a range of all the employees associated with the Job Pos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the Job Pos
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @return the range of employees associated with the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Employee> getEmployees(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getEmployees(pk, start, end);
	}

	/**
	* Returns an ordered range of all the employees associated with the Job Pos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the Job Pos
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employees associated with the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.Employee> getEmployees(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getEmployees(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of employees associated with the Job Pos.
	*
	* @param pk the primary key of the Job Pos
	* @return the number of employees associated with the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getEmployeesSize(pk);
	}

	/**
	* Returns <code>true</code> if the employee is associated with the Job Pos.
	*
	* @param pk the primary key of the Job Pos
	* @param employeePK the primary key of the employee
	* @return <code>true</code> if the employee is associated with the Job Pos; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsEmployee(long pk, long employeePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsEmployee(pk, employeePK);
	}

	/**
	* Returns <code>true</code> if the Job Pos has any employees associated with it.
	*
	* @param pk the primary key of the Job Pos to check for associations with employees
	* @return <code>true</code> if the Job Pos has any employees associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsEmployees(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsEmployees(pk);
	}

	/**
	* Adds an association between the Job Pos and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Job Pos
	* @param employeePK the primary key of the employee
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployee(long pk, long employeePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addEmployee(pk, employeePK);
	}

	/**
	* Adds an association between the Job Pos and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Job Pos
	* @param employee the employee
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployee(long pk,
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addEmployee(pk, employee);
	}

	/**
	* Adds an association between the Job Pos and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Job Pos
	* @param employeePKs the primary keys of the employees
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployees(long pk, long[] employeePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addEmployees(pk, employeePKs);
	}

	/**
	* Adds an association between the Job Pos and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Job Pos
	* @param employees the employees
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployees(long pk,
		java.util.List<org.oep.usermgt.model.Employee> employees)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addEmployees(pk, employees);
	}

	/**
	* Clears all associations between the Job Pos and its employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Job Pos to clear the associated employees from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearEmployees(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearEmployees(pk);
	}

	/**
	* Removes the association between the Job Pos and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Job Pos
	* @param employeePK the primary key of the employee
	* @throws SystemException if a system exception occurred
	*/
	public static void removeEmployee(long pk, long employeePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeEmployee(pk, employeePK);
	}

	/**
	* Removes the association between the Job Pos and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Job Pos
	* @param employee the employee
	* @throws SystemException if a system exception occurred
	*/
	public static void removeEmployee(long pk,
		org.oep.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeEmployee(pk, employee);
	}

	/**
	* Removes the association between the Job Pos and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Job Pos
	* @param employeePKs the primary keys of the employees
	* @throws SystemException if a system exception occurred
	*/
	public static void removeEmployees(long pk, long[] employeePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeEmployees(pk, employeePKs);
	}

	/**
	* Removes the association between the Job Pos and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Job Pos
	* @param employees the employees
	* @throws SystemException if a system exception occurred
	*/
	public static void removeEmployees(long pk,
		java.util.List<org.oep.usermgt.model.Employee> employees)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeEmployees(pk, employees);
	}

	/**
	* Sets the employees associated with the Job Pos, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Job Pos
	* @param employeePKs the primary keys of the employees to be associated with the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public static void setEmployees(long pk, long[] employeePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setEmployees(pk, employeePKs);
	}

	/**
	* Sets the employees associated with the Job Pos, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Job Pos
	* @param employees the employees to be associated with the Job Pos
	* @throws SystemException if a system exception occurred
	*/
	public static void setEmployees(long pk,
		java.util.List<org.oep.usermgt.model.Employee> employees)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setEmployees(pk, employees);
	}

	public static JobPosPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (JobPosPersistence)PortletBeanLocatorUtil.locate(org.oep.usermgt.service.ClpSerializer.getServletContextName(),
					JobPosPersistence.class.getName());

			ReferenceRegistry.registerReference(JobPosUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(JobPosPersistence persistence) {
	}

	private static JobPosPersistence _persistence;
}