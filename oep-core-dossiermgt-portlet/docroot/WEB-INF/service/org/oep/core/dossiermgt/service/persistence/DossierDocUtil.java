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

import org.oep.core.dossiermgt.model.DossierDoc;

import java.util.List;

/**
 * The persistence utility for the dossier doc service. This utility wraps {@link DossierDocPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierDocPersistence
 * @see DossierDocPersistenceImpl
 * @generated
 */
public class DossierDocUtil {
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
	public static void clearCache(DossierDoc dossierDoc) {
		getPersistence().clearCache(dossierDoc);
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
	public static List<DossierDoc> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DossierDoc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DossierDoc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DossierDoc update(DossierDoc dossierDoc)
		throws SystemException {
		return getPersistence().update(dossierDoc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DossierDoc update(DossierDoc dossierDoc,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dossierDoc, serviceContext);
	}

	/**
	* Caches the dossier doc in the entity cache if it is enabled.
	*
	* @param dossierDoc the dossier doc
	*/
	public static void cacheResult(
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc) {
		getPersistence().cacheResult(dossierDoc);
	}

	/**
	* Caches the dossier docs in the entity cache if it is enabled.
	*
	* @param dossierDocs the dossier docs
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.DossierDoc> dossierDocs) {
		getPersistence().cacheResult(dossierDocs);
	}

	/**
	* Creates a new dossier doc with the primary key. Does not add the dossier doc to the database.
	*
	* @param dossierDocId the primary key for the new dossier doc
	* @return the new dossier doc
	*/
	public static org.oep.core.dossiermgt.model.DossierDoc create(
		long dossierDocId) {
		return getPersistence().create(dossierDocId);
	}

	/**
	* Removes the dossier doc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierDocId the primary key of the dossier doc
	* @return the dossier doc that was removed
	* @throws org.oep.core.dossiermgt.NoSuchDossierDocException if a dossier doc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierDoc remove(
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierDocException {
		return getPersistence().remove(dossierDocId);
	}

	public static org.oep.core.dossiermgt.model.DossierDoc updateImpl(
		org.oep.core.dossiermgt.model.DossierDoc dossierDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dossierDoc);
	}

	/**
	* Returns the dossier doc with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierDocException} if it could not be found.
	*
	* @param dossierDocId the primary key of the dossier doc
	* @return the dossier doc
	* @throws org.oep.core.dossiermgt.NoSuchDossierDocException if a dossier doc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierDoc findByPrimaryKey(
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierDocException {
		return getPersistence().findByPrimaryKey(dossierDocId);
	}

	/**
	* Returns the dossier doc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierDocId the primary key of the dossier doc
	* @return the dossier doc, or <code>null</code> if a dossier doc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierDoc fetchByPrimaryKey(
		long dossierDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dossierDocId);
	}

	/**
	* Returns all the dossier docs.
	*
	* @return the dossier docs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierDoc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.oep.core.dossiermgt.model.DossierDoc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.oep.core.dossiermgt.model.DossierDoc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dossier docs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dossier docs.
	*
	* @return the number of dossier docs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the doc templates associated with the dossier doc.
	*
	* @param pk the primary key of the dossier doc
	* @return the doc templates associated with the dossier doc
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> getDocTemplates(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getDocTemplates(pk);
	}

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
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> getDocTemplates(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getDocTemplates(pk, start, end);
	}

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
	public static java.util.List<org.oep.core.dossiermgt.model.DocTemplate> getDocTemplates(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getDocTemplates(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of doc templates associated with the dossier doc.
	*
	* @param pk the primary key of the dossier doc
	* @return the number of doc templates associated with the dossier doc
	* @throws SystemException if a system exception occurred
	*/
	public static int getDocTemplatesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getDocTemplatesSize(pk);
	}

	/**
	* Returns <code>true</code> if the doc template is associated with the dossier doc.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplatePK the primary key of the doc template
	* @return <code>true</code> if the doc template is associated with the dossier doc; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsDocTemplate(long pk, long docTemplatePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsDocTemplate(pk, docTemplatePK);
	}

	/**
	* Returns <code>true</code> if the dossier doc has any doc templates associated with it.
	*
	* @param pk the primary key of the dossier doc to check for associations with doc templates
	* @return <code>true</code> if the dossier doc has any doc templates associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsDocTemplates(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsDocTemplates(pk);
	}

	/**
	* Adds an association between the dossier doc and the doc template. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplatePK the primary key of the doc template
	* @throws SystemException if a system exception occurred
	*/
	public static void addDocTemplate(long pk, long docTemplatePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addDocTemplate(pk, docTemplatePK);
	}

	/**
	* Adds an association between the dossier doc and the doc template. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplate the doc template
	* @throws SystemException if a system exception occurred
	*/
	public static void addDocTemplate(long pk,
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addDocTemplate(pk, docTemplate);
	}

	/**
	* Adds an association between the dossier doc and the doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplatePKs the primary keys of the doc templates
	* @throws SystemException if a system exception occurred
	*/
	public static void addDocTemplates(long pk, long[] docTemplatePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addDocTemplates(pk, docTemplatePKs);
	}

	/**
	* Adds an association between the dossier doc and the doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplates the doc templates
	* @throws SystemException if a system exception occurred
	*/
	public static void addDocTemplates(long pk,
		java.util.List<org.oep.core.dossiermgt.model.DocTemplate> docTemplates)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addDocTemplates(pk, docTemplates);
	}

	/**
	* Clears all associations between the dossier doc and its doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc to clear the associated doc templates from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearDocTemplates(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearDocTemplates(pk);
	}

	/**
	* Removes the association between the dossier doc and the doc template. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplatePK the primary key of the doc template
	* @throws SystemException if a system exception occurred
	*/
	public static void removeDocTemplate(long pk, long docTemplatePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeDocTemplate(pk, docTemplatePK);
	}

	/**
	* Removes the association between the dossier doc and the doc template. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplate the doc template
	* @throws SystemException if a system exception occurred
	*/
	public static void removeDocTemplate(long pk,
		org.oep.core.dossiermgt.model.DocTemplate docTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeDocTemplate(pk, docTemplate);
	}

	/**
	* Removes the association between the dossier doc and the doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplatePKs the primary keys of the doc templates
	* @throws SystemException if a system exception occurred
	*/
	public static void removeDocTemplates(long pk, long[] docTemplatePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeDocTemplates(pk, docTemplatePKs);
	}

	/**
	* Removes the association between the dossier doc and the doc templates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplates the doc templates
	* @throws SystemException if a system exception occurred
	*/
	public static void removeDocTemplates(long pk,
		java.util.List<org.oep.core.dossiermgt.model.DocTemplate> docTemplates)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeDocTemplates(pk, docTemplates);
	}

	/**
	* Sets the doc templates associated with the dossier doc, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplatePKs the primary keys of the doc templates to be associated with the dossier doc
	* @throws SystemException if a system exception occurred
	*/
	public static void setDocTemplates(long pk, long[] docTemplatePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setDocTemplates(pk, docTemplatePKs);
	}

	/**
	* Sets the doc templates associated with the dossier doc, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dossier doc
	* @param docTemplates the doc templates to be associated with the dossier doc
	* @throws SystemException if a system exception occurred
	*/
	public static void setDocTemplates(long pk,
		java.util.List<org.oep.core.dossiermgt.model.DocTemplate> docTemplates)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setDocTemplates(pk, docTemplates);
	}

	public static DossierDocPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DossierDocPersistence)PortletBeanLocatorUtil.locate(org.oep.core.dossiermgt.service.ClpSerializer.getServletContextName(),
					DossierDocPersistence.class.getName());

			ReferenceRegistry.registerReference(DossierDocUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DossierDocPersistence persistence) {
	}

	private static DossierDocPersistence _persistence;
}