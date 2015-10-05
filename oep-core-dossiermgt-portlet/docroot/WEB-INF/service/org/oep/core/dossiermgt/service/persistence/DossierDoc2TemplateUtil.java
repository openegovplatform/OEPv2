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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.dossiermgt.model.DossierDoc2Template;

import java.util.List;

/**
 * The persistence utility for the dossier doc2 template service. This utility wraps {@link DossierDoc2TemplatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierDoc2TemplatePersistence
 * @see DossierDoc2TemplatePersistenceImpl
 * @generated
 */
public class DossierDoc2TemplateUtil {
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
	public static void clearCache(DossierDoc2Template dossierDoc2Template) {
		getPersistence().clearCache(dossierDoc2Template);
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
	public static List<DossierDoc2Template> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DossierDoc2Template> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DossierDoc2Template> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DossierDoc2Template update(
		DossierDoc2Template dossierDoc2Template) throws SystemException {
		return getPersistence().update(dossierDoc2Template);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DossierDoc2Template update(
		DossierDoc2Template dossierDoc2Template, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dossierDoc2Template, serviceContext);
	}

	/**
	* Caches the dossier doc2 template in the entity cache if it is enabled.
	*
	* @param dossierDoc2Template the dossier doc2 template
	*/
	public static void cacheResult(
		org.oep.core.dossiermgt.model.DossierDoc2Template dossierDoc2Template) {
		getPersistence().cacheResult(dossierDoc2Template);
	}

	/**
	* Caches the dossier doc2 templates in the entity cache if it is enabled.
	*
	* @param dossierDoc2Templates the dossier doc2 templates
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.DossierDoc2Template> dossierDoc2Templates) {
		getPersistence().cacheResult(dossierDoc2Templates);
	}

	/**
	* Creates a new dossier doc2 template with the primary key. Does not add the dossier doc2 template to the database.
	*
	* @param dossierDoc2TemplatePK the primary key for the new dossier doc2 template
	* @return the new dossier doc2 template
	*/
	public static org.oep.core.dossiermgt.model.DossierDoc2Template create(
		org.oep.core.dossiermgt.service.persistence.DossierDoc2TemplatePK dossierDoc2TemplatePK) {
		return getPersistence().create(dossierDoc2TemplatePK);
	}

	/**
	* Removes the dossier doc2 template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierDoc2TemplatePK the primary key of the dossier doc2 template
	* @return the dossier doc2 template that was removed
	* @throws org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException if a dossier doc2 template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierDoc2Template remove(
		org.oep.core.dossiermgt.service.persistence.DossierDoc2TemplatePK dossierDoc2TemplatePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException {
		return getPersistence().remove(dossierDoc2TemplatePK);
	}

	public static org.oep.core.dossiermgt.model.DossierDoc2Template updateImpl(
		org.oep.core.dossiermgt.model.DossierDoc2Template dossierDoc2Template)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dossierDoc2Template);
	}

	/**
	* Returns the dossier doc2 template with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException} if it could not be found.
	*
	* @param dossierDoc2TemplatePK the primary key of the dossier doc2 template
	* @return the dossier doc2 template
	* @throws org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException if a dossier doc2 template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierDoc2Template findByPrimaryKey(
		org.oep.core.dossiermgt.service.persistence.DossierDoc2TemplatePK dossierDoc2TemplatePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException {
		return getPersistence().findByPrimaryKey(dossierDoc2TemplatePK);
	}

	/**
	* Returns the dossier doc2 template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierDoc2TemplatePK the primary key of the dossier doc2 template
	* @return the dossier doc2 template, or <code>null</code> if a dossier doc2 template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierDoc2Template fetchByPrimaryKey(
		org.oep.core.dossiermgt.service.persistence.DossierDoc2TemplatePK dossierDoc2TemplatePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dossierDoc2TemplatePK);
	}

	/**
	* Returns all the dossier doc2 templates.
	*
	* @return the dossier doc2 templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierDoc2Template> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dossier doc2 templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier doc2 templates
	* @param end the upper bound of the range of dossier doc2 templates (not inclusive)
	* @return the range of dossier doc2 templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierDoc2Template> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dossier doc2 templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDoc2TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier doc2 templates
	* @param end the upper bound of the range of dossier doc2 templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier doc2 templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierDoc2Template> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dossier doc2 templates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dossier doc2 templates.
	*
	* @return the number of dossier doc2 templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DossierDoc2TemplatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DossierDoc2TemplatePersistence)PortletBeanLocatorUtil.locate(org.oep.core.dossiermgt.service.ClpSerializer.getServletContextName(),
					DossierDoc2TemplatePersistence.class.getName());

			ReferenceRegistry.registerReference(DossierDoc2TemplateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DossierDoc2TemplatePersistence persistence) {
	}

	private static DossierDoc2TemplatePersistence _persistence;
}