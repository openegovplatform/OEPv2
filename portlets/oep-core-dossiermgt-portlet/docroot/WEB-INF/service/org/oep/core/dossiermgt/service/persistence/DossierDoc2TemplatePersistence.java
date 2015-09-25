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

import org.oep.core.dossiermgt.model.DossierDoc2Template;

/**
 * The persistence interface for the dossier doc2 template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierDoc2TemplatePersistenceImpl
 * @see DossierDoc2TemplateUtil
 * @generated
 */
public interface DossierDoc2TemplatePersistence extends BasePersistence<DossierDoc2Template> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierDoc2TemplateUtil} to access the dossier doc2 template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dossier doc2 template in the entity cache if it is enabled.
	*
	* @param dossierDoc2Template the dossier doc2 template
	*/
	public void cacheResult(
		org.oep.core.dossiermgt.model.DossierDoc2Template dossierDoc2Template);

	/**
	* Caches the dossier doc2 templates in the entity cache if it is enabled.
	*
	* @param dossierDoc2Templates the dossier doc2 templates
	*/
	public void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.DossierDoc2Template> dossierDoc2Templates);

	/**
	* Creates a new dossier doc2 template with the primary key. Does not add the dossier doc2 template to the database.
	*
	* @param id the primary key for the new dossier doc2 template
	* @return the new dossier doc2 template
	*/
	public org.oep.core.dossiermgt.model.DossierDoc2Template create(long id);

	/**
	* Removes the dossier doc2 template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dossier doc2 template
	* @return the dossier doc2 template that was removed
	* @throws org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException if a dossier doc2 template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierDoc2Template remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException;

	public org.oep.core.dossiermgt.model.DossierDoc2Template updateImpl(
		org.oep.core.dossiermgt.model.DossierDoc2Template dossierDoc2Template)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier doc2 template with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException} if it could not be found.
	*
	* @param id the primary key of the dossier doc2 template
	* @return the dossier doc2 template
	* @throws org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException if a dossier doc2 template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierDoc2Template findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierDoc2TemplateException;

	/**
	* Returns the dossier doc2 template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dossier doc2 template
	* @return the dossier doc2 template, or <code>null</code> if a dossier doc2 template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierDoc2Template fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier doc2 templates.
	*
	* @return the dossier doc2 templates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierDoc2Template> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.dossiermgt.model.DossierDoc2Template> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.core.dossiermgt.model.DossierDoc2Template> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossier doc2 templates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier doc2 templates.
	*
	* @return the number of dossier doc2 templates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}