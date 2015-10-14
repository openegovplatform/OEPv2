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

import org.oep.core.dossiermgt.model.DossierDoc;

/**
 * The persistence interface for the dossier doc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierDocPersistenceImpl
 * @see DossierDocUtil
 * @generated
 */
public interface DossierDocPersistence extends BasePersistence<DossierDoc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierDocUtil} to access the dossier doc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dossier doc in the entity cache if it is enabled.
	*
	* @param dossierDoc the dossier doc
	*/
	public void cacheResult(org.oep.core.dossiermgt.model.DossierDoc dossierDoc);

	/**
	* Caches the dossier docs in the entity cache if it is enabled.
	*
	* @param dossierDocs the dossier docs
	*/
	public void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.DossierDoc> dossierDocs);

	/**
	* Creates a new dossier doc with the primary key. Does not add the dossier doc to the database.
	*
	* @param dossierDocId the primary key for the new dossier doc
	* @return the new dossier doc
	*/
	public org.oep.core.dossiermgt.model.DossierDoc create(long dossierDocId);

	/**
	* Removes the dossier doc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierDocId the primary key of the dossier doc
	* @return the dossier doc that was removed
	* @throws org.oep.core.dossiermgt.NoSuchDossierDocException if a dossier doc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierDoc remove(long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierDocException;

	public org.oep.core.dossiermgt.model.DossierDoc updateImpl(
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier doc with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierDocException} if it could not be found.
	*
	* @param dossierDocId the primary key of the dossier doc
	* @return the dossier doc
	* @throws org.oep.core.dossiermgt.NoSuchDossierDocException if a dossier doc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierDoc findByPrimaryKey(
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierDocException;

	/**
	* Returns the dossier doc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierDocId the primary key of the dossier doc
	* @return the dossier doc, or <code>null</code> if a dossier doc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.DossierDoc fetchByPrimaryKey(
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier docs.
	*
	* @return the dossier docs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierDoc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier docs
	* @param end the upper bound of the range of dossier docs (not inclusive)
	* @return the range of dossier docs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierDoc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier docs
	* @param end the upper bound of the range of dossier docs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier docs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DossierDoc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossier docs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier docs.
	*
	* @return the number of dossier docs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the doc templates associated with the dossier doc.
	*
	* @param pk the primary key of the dossier doc
	* @return the doc templates associated with the dossier doc
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> getDocTemplates(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the doc templates associated with the dossier doc.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the dossier doc
	* @param start the lower bound of the range of dossier docs
	* @param end the upper bound of the range of dossier docs (not inclusive)
	* @return the range of doc templates associated with the dossier doc
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> getDocTemplates(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the doc templates associated with the dossier doc.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the dossier doc
	* @param start the lower bound of the range of dossier docs
	* @param end the upper bound of the range of dossier docs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of doc templates associated with the dossier doc
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.DocTemplate> getDocTemplates(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of doc templates associated with the dossier doc.
	*
	* @param pk the primary key of the dossier doc
	* @return the number of doc templates associated with the dossier doc
	* @throws SystemException if a system exception occurred
	*/
	public int getDocTemplatesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the doc template is associated with the dossier doc.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplatePK the primary key of the doc template
	* @return <code>true</code> if the doc template is associated with the dossier doc; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsDocTemplate(long pk, long docTemplatePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the dossier doc has any doc templates associated with it.
	*
	* @param pk the primary key of the dossier doc to check for associations with doc templates
	* @return <code>true</code> if the dossier doc has any doc templates associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsDocTemplates(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the dossier doc and the doc template. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplatePK the primary key of the doc template
	* @throws SystemException if a system exception occurred
	*/
	public void addDocTemplate(long pk, long docTemplatePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the dossier doc and the doc template. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplate the doc template
	* @throws SystemException if a system exception occurred
	*/
	public void addDocTemplate(long pk,
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the dossier doc and the doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplatePKs the primary keys of the doc templates
	* @throws SystemException if a system exception occurred
	*/
	public void addDocTemplates(long pk, long[] docTemplatePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the dossier doc and the doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplates the doc templates
	* @throws SystemException if a system exception occurred
	*/
	public void addDocTemplates(long pk,
		java.util.List<org.oep.core.dossiermgt.model.DocTemplate> docTemplates)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the dossier doc and its doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc to clear the associated doc templates from
	* @throws SystemException if a system exception occurred
	*/
	public void clearDocTemplates(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the dossier doc and the doc template. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplatePK the primary key of the doc template
	* @throws SystemException if a system exception occurred
	*/
	public void removeDocTemplate(long pk, long docTemplatePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the dossier doc and the doc template. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplate the doc template
	* @throws SystemException if a system exception occurred
	*/
	public void removeDocTemplate(long pk,
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the dossier doc and the doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplatePKs the primary keys of the doc templates
	* @throws SystemException if a system exception occurred
	*/
	public void removeDocTemplates(long pk, long[] docTemplatePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the dossier doc and the doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplates the doc templates
	* @throws SystemException if a system exception occurred
	*/
	public void removeDocTemplates(long pk,
		java.util.List<org.oep.core.dossiermgt.model.DocTemplate> docTemplates)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the doc templates associated with the dossier doc, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplatePKs the primary keys of the doc templates to be associated with the dossier doc
	* @throws SystemException if a system exception occurred
	*/
	public void setDocTemplates(long pk, long[] docTemplatePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the doc templates associated with the dossier doc, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplates the doc templates to be associated with the dossier doc
	* @throws SystemException if a system exception occurred
	*/
	public void setDocTemplates(long pk,
		java.util.List<org.oep.core.dossiermgt.model.DocTemplate> docTemplates)
		throws com.liferay.portal.kernel.exception.SystemException;
}