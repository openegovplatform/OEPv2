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

package org.oep.core.dossiermgt.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.oep.core.dossiermgt.model.DossierProc;
import org.oep.core.dossiermgt.service.DossierProcService;
import org.oep.core.dossiermgt.service.persistence.DocFilePersistence;
import org.oep.core.dossiermgt.service.persistence.DocFileVersionPersistence;
import org.oep.core.dossiermgt.service.persistence.DocTemplatePersistence;
import org.oep.core.dossiermgt.service.persistence.DossierDoc2TemplatePersistence;
import org.oep.core.dossiermgt.service.persistence.DossierDocPersistence;
import org.oep.core.dossiermgt.service.persistence.DossierFolder2RolePersistence;
import org.oep.core.dossiermgt.service.persistence.DossierFolderPersistence;
import org.oep.core.dossiermgt.service.persistence.DossierPersistence;
import org.oep.core.dossiermgt.service.persistence.DossierProc2AgentPersistence;
import org.oep.core.dossiermgt.service.persistence.DossierProcPersistence;
import org.oep.core.dossiermgt.service.persistence.PaymentConfigPersistence;
import org.oep.core.dossiermgt.service.persistence.PaymentFile2DossierPersistence;
import org.oep.core.dossiermgt.service.persistence.PaymentFilePersistence;
import org.oep.core.dossiermgt.service.persistence.PaymentRequestPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the dossier proc remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.core.dossiermgt.service.impl.DossierProcServiceImpl}.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.impl.DossierProcServiceImpl
 * @see org.oep.core.dossiermgt.service.DossierProcServiceUtil
 * @generated
 */
public abstract class DossierProcServiceBaseImpl extends BaseServiceImpl
	implements DossierProcService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.core.dossiermgt.service.DossierProcServiceUtil} to access the dossier proc remote service.
	 */

	/**
	 * Returns the doc file local service.
	 *
	 * @return the doc file local service
	 */
	public org.oep.core.dossiermgt.service.DocFileLocalService getDocFileLocalService() {
		return docFileLocalService;
	}

	/**
	 * Sets the doc file local service.
	 *
	 * @param docFileLocalService the doc file local service
	 */
	public void setDocFileLocalService(
		org.oep.core.dossiermgt.service.DocFileLocalService docFileLocalService) {
		this.docFileLocalService = docFileLocalService;
	}

	/**
	 * Returns the doc file remote service.
	 *
	 * @return the doc file remote service
	 */
	public org.oep.core.dossiermgt.service.DocFileService getDocFileService() {
		return docFileService;
	}

	/**
	 * Sets the doc file remote service.
	 *
	 * @param docFileService the doc file remote service
	 */
	public void setDocFileService(
		org.oep.core.dossiermgt.service.DocFileService docFileService) {
		this.docFileService = docFileService;
	}

	/**
	 * Returns the doc file persistence.
	 *
	 * @return the doc file persistence
	 */
	public DocFilePersistence getDocFilePersistence() {
		return docFilePersistence;
	}

	/**
	 * Sets the doc file persistence.
	 *
	 * @param docFilePersistence the doc file persistence
	 */
	public void setDocFilePersistence(DocFilePersistence docFilePersistence) {
		this.docFilePersistence = docFilePersistence;
	}

	/**
	 * Returns the doc file version local service.
	 *
	 * @return the doc file version local service
	 */
	public org.oep.core.dossiermgt.service.DocFileVersionLocalService getDocFileVersionLocalService() {
		return docFileVersionLocalService;
	}

	/**
	 * Sets the doc file version local service.
	 *
	 * @param docFileVersionLocalService the doc file version local service
	 */
	public void setDocFileVersionLocalService(
		org.oep.core.dossiermgt.service.DocFileVersionLocalService docFileVersionLocalService) {
		this.docFileVersionLocalService = docFileVersionLocalService;
	}

	/**
	 * Returns the doc file version remote service.
	 *
	 * @return the doc file version remote service
	 */
	public org.oep.core.dossiermgt.service.DocFileVersionService getDocFileVersionService() {
		return docFileVersionService;
	}

	/**
	 * Sets the doc file version remote service.
	 *
	 * @param docFileVersionService the doc file version remote service
	 */
	public void setDocFileVersionService(
		org.oep.core.dossiermgt.service.DocFileVersionService docFileVersionService) {
		this.docFileVersionService = docFileVersionService;
	}

	/**
	 * Returns the doc file version persistence.
	 *
	 * @return the doc file version persistence
	 */
	public DocFileVersionPersistence getDocFileVersionPersistence() {
		return docFileVersionPersistence;
	}

	/**
	 * Sets the doc file version persistence.
	 *
	 * @param docFileVersionPersistence the doc file version persistence
	 */
	public void setDocFileVersionPersistence(
		DocFileVersionPersistence docFileVersionPersistence) {
		this.docFileVersionPersistence = docFileVersionPersistence;
	}

	/**
	 * Returns the doc template local service.
	 *
	 * @return the doc template local service
	 */
	public org.oep.core.dossiermgt.service.DocTemplateLocalService getDocTemplateLocalService() {
		return docTemplateLocalService;
	}

	/**
	 * Sets the doc template local service.
	 *
	 * @param docTemplateLocalService the doc template local service
	 */
	public void setDocTemplateLocalService(
		org.oep.core.dossiermgt.service.DocTemplateLocalService docTemplateLocalService) {
		this.docTemplateLocalService = docTemplateLocalService;
	}

	/**
	 * Returns the doc template remote service.
	 *
	 * @return the doc template remote service
	 */
	public org.oep.core.dossiermgt.service.DocTemplateService getDocTemplateService() {
		return docTemplateService;
	}

	/**
	 * Sets the doc template remote service.
	 *
	 * @param docTemplateService the doc template remote service
	 */
	public void setDocTemplateService(
		org.oep.core.dossiermgt.service.DocTemplateService docTemplateService) {
		this.docTemplateService = docTemplateService;
	}

	/**
	 * Returns the doc template persistence.
	 *
	 * @return the doc template persistence
	 */
	public DocTemplatePersistence getDocTemplatePersistence() {
		return docTemplatePersistence;
	}

	/**
	 * Sets the doc template persistence.
	 *
	 * @param docTemplatePersistence the doc template persistence
	 */
	public void setDocTemplatePersistence(
		DocTemplatePersistence docTemplatePersistence) {
		this.docTemplatePersistence = docTemplatePersistence;
	}

	/**
	 * Returns the dossier local service.
	 *
	 * @return the dossier local service
	 */
	public org.oep.core.dossiermgt.service.DossierLocalService getDossierLocalService() {
		return dossierLocalService;
	}

	/**
	 * Sets the dossier local service.
	 *
	 * @param dossierLocalService the dossier local service
	 */
	public void setDossierLocalService(
		org.oep.core.dossiermgt.service.DossierLocalService dossierLocalService) {
		this.dossierLocalService = dossierLocalService;
	}

	/**
	 * Returns the dossier remote service.
	 *
	 * @return the dossier remote service
	 */
	public org.oep.core.dossiermgt.service.DossierService getDossierService() {
		return dossierService;
	}

	/**
	 * Sets the dossier remote service.
	 *
	 * @param dossierService the dossier remote service
	 */
	public void setDossierService(
		org.oep.core.dossiermgt.service.DossierService dossierService) {
		this.dossierService = dossierService;
	}

	/**
	 * Returns the dossier persistence.
	 *
	 * @return the dossier persistence
	 */
	public DossierPersistence getDossierPersistence() {
		return dossierPersistence;
	}

	/**
	 * Sets the dossier persistence.
	 *
	 * @param dossierPersistence the dossier persistence
	 */
	public void setDossierPersistence(DossierPersistence dossierPersistence) {
		this.dossierPersistence = dossierPersistence;
	}

	/**
	 * Returns the dossier doc local service.
	 *
	 * @return the dossier doc local service
	 */
	public org.oep.core.dossiermgt.service.DossierDocLocalService getDossierDocLocalService() {
		return dossierDocLocalService;
	}

	/**
	 * Sets the dossier doc local service.
	 *
	 * @param dossierDocLocalService the dossier doc local service
	 */
	public void setDossierDocLocalService(
		org.oep.core.dossiermgt.service.DossierDocLocalService dossierDocLocalService) {
		this.dossierDocLocalService = dossierDocLocalService;
	}

	/**
	 * Returns the dossier doc remote service.
	 *
	 * @return the dossier doc remote service
	 */
	public org.oep.core.dossiermgt.service.DossierDocService getDossierDocService() {
		return dossierDocService;
	}

	/**
	 * Sets the dossier doc remote service.
	 *
	 * @param dossierDocService the dossier doc remote service
	 */
	public void setDossierDocService(
		org.oep.core.dossiermgt.service.DossierDocService dossierDocService) {
		this.dossierDocService = dossierDocService;
	}

	/**
	 * Returns the dossier doc persistence.
	 *
	 * @return the dossier doc persistence
	 */
	public DossierDocPersistence getDossierDocPersistence() {
		return dossierDocPersistence;
	}

	/**
	 * Sets the dossier doc persistence.
	 *
	 * @param dossierDocPersistence the dossier doc persistence
	 */
	public void setDossierDocPersistence(
		DossierDocPersistence dossierDocPersistence) {
		this.dossierDocPersistence = dossierDocPersistence;
	}

	/**
	 * Returns the dossier doc2 template local service.
	 *
	 * @return the dossier doc2 template local service
	 */
	public org.oep.core.dossiermgt.service.DossierDoc2TemplateLocalService getDossierDoc2TemplateLocalService() {
		return dossierDoc2TemplateLocalService;
	}

	/**
	 * Sets the dossier doc2 template local service.
	 *
	 * @param dossierDoc2TemplateLocalService the dossier doc2 template local service
	 */
	public void setDossierDoc2TemplateLocalService(
		org.oep.core.dossiermgt.service.DossierDoc2TemplateLocalService dossierDoc2TemplateLocalService) {
		this.dossierDoc2TemplateLocalService = dossierDoc2TemplateLocalService;
	}

	/**
	 * Returns the dossier doc2 template remote service.
	 *
	 * @return the dossier doc2 template remote service
	 */
	public org.oep.core.dossiermgt.service.DossierDoc2TemplateService getDossierDoc2TemplateService() {
		return dossierDoc2TemplateService;
	}

	/**
	 * Sets the dossier doc2 template remote service.
	 *
	 * @param dossierDoc2TemplateService the dossier doc2 template remote service
	 */
	public void setDossierDoc2TemplateService(
		org.oep.core.dossiermgt.service.DossierDoc2TemplateService dossierDoc2TemplateService) {
		this.dossierDoc2TemplateService = dossierDoc2TemplateService;
	}

	/**
	 * Returns the dossier doc2 template persistence.
	 *
	 * @return the dossier doc2 template persistence
	 */
	public DossierDoc2TemplatePersistence getDossierDoc2TemplatePersistence() {
		return dossierDoc2TemplatePersistence;
	}

	/**
	 * Sets the dossier doc2 template persistence.
	 *
	 * @param dossierDoc2TemplatePersistence the dossier doc2 template persistence
	 */
	public void setDossierDoc2TemplatePersistence(
		DossierDoc2TemplatePersistence dossierDoc2TemplatePersistence) {
		this.dossierDoc2TemplatePersistence = dossierDoc2TemplatePersistence;
	}

	/**
	 * Returns the dossier folder local service.
	 *
	 * @return the dossier folder local service
	 */
	public org.oep.core.dossiermgt.service.DossierFolderLocalService getDossierFolderLocalService() {
		return dossierFolderLocalService;
	}

	/**
	 * Sets the dossier folder local service.
	 *
	 * @param dossierFolderLocalService the dossier folder local service
	 */
	public void setDossierFolderLocalService(
		org.oep.core.dossiermgt.service.DossierFolderLocalService dossierFolderLocalService) {
		this.dossierFolderLocalService = dossierFolderLocalService;
	}

	/**
	 * Returns the dossier folder remote service.
	 *
	 * @return the dossier folder remote service
	 */
	public org.oep.core.dossiermgt.service.DossierFolderService getDossierFolderService() {
		return dossierFolderService;
	}

	/**
	 * Sets the dossier folder remote service.
	 *
	 * @param dossierFolderService the dossier folder remote service
	 */
	public void setDossierFolderService(
		org.oep.core.dossiermgt.service.DossierFolderService dossierFolderService) {
		this.dossierFolderService = dossierFolderService;
	}

	/**
	 * Returns the dossier folder persistence.
	 *
	 * @return the dossier folder persistence
	 */
	public DossierFolderPersistence getDossierFolderPersistence() {
		return dossierFolderPersistence;
	}

	/**
	 * Sets the dossier folder persistence.
	 *
	 * @param dossierFolderPersistence the dossier folder persistence
	 */
	public void setDossierFolderPersistence(
		DossierFolderPersistence dossierFolderPersistence) {
		this.dossierFolderPersistence = dossierFolderPersistence;
	}

	/**
	 * Returns the dossier folder2 role local service.
	 *
	 * @return the dossier folder2 role local service
	 */
	public org.oep.core.dossiermgt.service.DossierFolder2RoleLocalService getDossierFolder2RoleLocalService() {
		return dossierFolder2RoleLocalService;
	}

	/**
	 * Sets the dossier folder2 role local service.
	 *
	 * @param dossierFolder2RoleLocalService the dossier folder2 role local service
	 */
	public void setDossierFolder2RoleLocalService(
		org.oep.core.dossiermgt.service.DossierFolder2RoleLocalService dossierFolder2RoleLocalService) {
		this.dossierFolder2RoleLocalService = dossierFolder2RoleLocalService;
	}

	/**
	 * Returns the dossier folder2 role remote service.
	 *
	 * @return the dossier folder2 role remote service
	 */
	public org.oep.core.dossiermgt.service.DossierFolder2RoleService getDossierFolder2RoleService() {
		return dossierFolder2RoleService;
	}

	/**
	 * Sets the dossier folder2 role remote service.
	 *
	 * @param dossierFolder2RoleService the dossier folder2 role remote service
	 */
	public void setDossierFolder2RoleService(
		org.oep.core.dossiermgt.service.DossierFolder2RoleService dossierFolder2RoleService) {
		this.dossierFolder2RoleService = dossierFolder2RoleService;
	}

	/**
	 * Returns the dossier folder2 role persistence.
	 *
	 * @return the dossier folder2 role persistence
	 */
	public DossierFolder2RolePersistence getDossierFolder2RolePersistence() {
		return dossierFolder2RolePersistence;
	}

	/**
	 * Sets the dossier folder2 role persistence.
	 *
	 * @param dossierFolder2RolePersistence the dossier folder2 role persistence
	 */
	public void setDossierFolder2RolePersistence(
		DossierFolder2RolePersistence dossierFolder2RolePersistence) {
		this.dossierFolder2RolePersistence = dossierFolder2RolePersistence;
	}

	/**
	 * Returns the dossier proc local service.
	 *
	 * @return the dossier proc local service
	 */
	public org.oep.core.dossiermgt.service.DossierProcLocalService getDossierProcLocalService() {
		return dossierProcLocalService;
	}

	/**
	 * Sets the dossier proc local service.
	 *
	 * @param dossierProcLocalService the dossier proc local service
	 */
	public void setDossierProcLocalService(
		org.oep.core.dossiermgt.service.DossierProcLocalService dossierProcLocalService) {
		this.dossierProcLocalService = dossierProcLocalService;
	}

	/**
	 * Returns the dossier proc remote service.
	 *
	 * @return the dossier proc remote service
	 */
	public org.oep.core.dossiermgt.service.DossierProcService getDossierProcService() {
		return dossierProcService;
	}

	/**
	 * Sets the dossier proc remote service.
	 *
	 * @param dossierProcService the dossier proc remote service
	 */
	public void setDossierProcService(
		org.oep.core.dossiermgt.service.DossierProcService dossierProcService) {
		this.dossierProcService = dossierProcService;
	}

	/**
	 * Returns the dossier proc persistence.
	 *
	 * @return the dossier proc persistence
	 */
	public DossierProcPersistence getDossierProcPersistence() {
		return dossierProcPersistence;
	}

	/**
	 * Sets the dossier proc persistence.
	 *
	 * @param dossierProcPersistence the dossier proc persistence
	 */
	public void setDossierProcPersistence(
		DossierProcPersistence dossierProcPersistence) {
		this.dossierProcPersistence = dossierProcPersistence;
	}

	/**
	 * Returns the dossier proc2 agent local service.
	 *
	 * @return the dossier proc2 agent local service
	 */
	public org.oep.core.dossiermgt.service.DossierProc2AgentLocalService getDossierProc2AgentLocalService() {
		return dossierProc2AgentLocalService;
	}

	/**
	 * Sets the dossier proc2 agent local service.
	 *
	 * @param dossierProc2AgentLocalService the dossier proc2 agent local service
	 */
	public void setDossierProc2AgentLocalService(
		org.oep.core.dossiermgt.service.DossierProc2AgentLocalService dossierProc2AgentLocalService) {
		this.dossierProc2AgentLocalService = dossierProc2AgentLocalService;
	}

	/**
	 * Returns the dossier proc2 agent remote service.
	 *
	 * @return the dossier proc2 agent remote service
	 */
	public org.oep.core.dossiermgt.service.DossierProc2AgentService getDossierProc2AgentService() {
		return dossierProc2AgentService;
	}

	/**
	 * Sets the dossier proc2 agent remote service.
	 *
	 * @param dossierProc2AgentService the dossier proc2 agent remote service
	 */
	public void setDossierProc2AgentService(
		org.oep.core.dossiermgt.service.DossierProc2AgentService dossierProc2AgentService) {
		this.dossierProc2AgentService = dossierProc2AgentService;
	}

	/**
	 * Returns the dossier proc2 agent persistence.
	 *
	 * @return the dossier proc2 agent persistence
	 */
	public DossierProc2AgentPersistence getDossierProc2AgentPersistence() {
		return dossierProc2AgentPersistence;
	}

	/**
	 * Sets the dossier proc2 agent persistence.
	 *
	 * @param dossierProc2AgentPersistence the dossier proc2 agent persistence
	 */
	public void setDossierProc2AgentPersistence(
		DossierProc2AgentPersistence dossierProc2AgentPersistence) {
		this.dossierProc2AgentPersistence = dossierProc2AgentPersistence;
	}

	/**
	 * Returns the payment config local service.
	 *
	 * @return the payment config local service
	 */
	public org.oep.core.dossiermgt.service.PaymentConfigLocalService getPaymentConfigLocalService() {
		return paymentConfigLocalService;
	}

	/**
	 * Sets the payment config local service.
	 *
	 * @param paymentConfigLocalService the payment config local service
	 */
	public void setPaymentConfigLocalService(
		org.oep.core.dossiermgt.service.PaymentConfigLocalService paymentConfigLocalService) {
		this.paymentConfigLocalService = paymentConfigLocalService;
	}

	/**
	 * Returns the payment config remote service.
	 *
	 * @return the payment config remote service
	 */
	public org.oep.core.dossiermgt.service.PaymentConfigService getPaymentConfigService() {
		return paymentConfigService;
	}

	/**
	 * Sets the payment config remote service.
	 *
	 * @param paymentConfigService the payment config remote service
	 */
	public void setPaymentConfigService(
		org.oep.core.dossiermgt.service.PaymentConfigService paymentConfigService) {
		this.paymentConfigService = paymentConfigService;
	}

	/**
	 * Returns the payment config persistence.
	 *
	 * @return the payment config persistence
	 */
	public PaymentConfigPersistence getPaymentConfigPersistence() {
		return paymentConfigPersistence;
	}

	/**
	 * Sets the payment config persistence.
	 *
	 * @param paymentConfigPersistence the payment config persistence
	 */
	public void setPaymentConfigPersistence(
		PaymentConfigPersistence paymentConfigPersistence) {
		this.paymentConfigPersistence = paymentConfigPersistence;
	}

	/**
	 * Returns the payment file local service.
	 *
	 * @return the payment file local service
	 */
	public org.oep.core.dossiermgt.service.PaymentFileLocalService getPaymentFileLocalService() {
		return paymentFileLocalService;
	}

	/**
	 * Sets the payment file local service.
	 *
	 * @param paymentFileLocalService the payment file local service
	 */
	public void setPaymentFileLocalService(
		org.oep.core.dossiermgt.service.PaymentFileLocalService paymentFileLocalService) {
		this.paymentFileLocalService = paymentFileLocalService;
	}

	/**
	 * Returns the payment file remote service.
	 *
	 * @return the payment file remote service
	 */
	public org.oep.core.dossiermgt.service.PaymentFileService getPaymentFileService() {
		return paymentFileService;
	}

	/**
	 * Sets the payment file remote service.
	 *
	 * @param paymentFileService the payment file remote service
	 */
	public void setPaymentFileService(
		org.oep.core.dossiermgt.service.PaymentFileService paymentFileService) {
		this.paymentFileService = paymentFileService;
	}

	/**
	 * Returns the payment file persistence.
	 *
	 * @return the payment file persistence
	 */
	public PaymentFilePersistence getPaymentFilePersistence() {
		return paymentFilePersistence;
	}

	/**
	 * Sets the payment file persistence.
	 *
	 * @param paymentFilePersistence the payment file persistence
	 */
	public void setPaymentFilePersistence(
		PaymentFilePersistence paymentFilePersistence) {
		this.paymentFilePersistence = paymentFilePersistence;
	}

	/**
	 * Returns the payment file2 dossier local service.
	 *
	 * @return the payment file2 dossier local service
	 */
	public org.oep.core.dossiermgt.service.PaymentFile2DossierLocalService getPaymentFile2DossierLocalService() {
		return paymentFile2DossierLocalService;
	}

	/**
	 * Sets the payment file2 dossier local service.
	 *
	 * @param paymentFile2DossierLocalService the payment file2 dossier local service
	 */
	public void setPaymentFile2DossierLocalService(
		org.oep.core.dossiermgt.service.PaymentFile2DossierLocalService paymentFile2DossierLocalService) {
		this.paymentFile2DossierLocalService = paymentFile2DossierLocalService;
	}

	/**
	 * Returns the payment file2 dossier remote service.
	 *
	 * @return the payment file2 dossier remote service
	 */
	public org.oep.core.dossiermgt.service.PaymentFile2DossierService getPaymentFile2DossierService() {
		return paymentFile2DossierService;
	}

	/**
	 * Sets the payment file2 dossier remote service.
	 *
	 * @param paymentFile2DossierService the payment file2 dossier remote service
	 */
	public void setPaymentFile2DossierService(
		org.oep.core.dossiermgt.service.PaymentFile2DossierService paymentFile2DossierService) {
		this.paymentFile2DossierService = paymentFile2DossierService;
	}

	/**
	 * Returns the payment file2 dossier persistence.
	 *
	 * @return the payment file2 dossier persistence
	 */
	public PaymentFile2DossierPersistence getPaymentFile2DossierPersistence() {
		return paymentFile2DossierPersistence;
	}

	/**
	 * Sets the payment file2 dossier persistence.
	 *
	 * @param paymentFile2DossierPersistence the payment file2 dossier persistence
	 */
	public void setPaymentFile2DossierPersistence(
		PaymentFile2DossierPersistence paymentFile2DossierPersistence) {
		this.paymentFile2DossierPersistence = paymentFile2DossierPersistence;
	}

	/**
	 * Returns the payment request local service.
	 *
	 * @return the payment request local service
	 */
	public org.oep.core.dossiermgt.service.PaymentRequestLocalService getPaymentRequestLocalService() {
		return paymentRequestLocalService;
	}

	/**
	 * Sets the payment request local service.
	 *
	 * @param paymentRequestLocalService the payment request local service
	 */
	public void setPaymentRequestLocalService(
		org.oep.core.dossiermgt.service.PaymentRequestLocalService paymentRequestLocalService) {
		this.paymentRequestLocalService = paymentRequestLocalService;
	}

	/**
	 * Returns the payment request remote service.
	 *
	 * @return the payment request remote service
	 */
	public org.oep.core.dossiermgt.service.PaymentRequestService getPaymentRequestService() {
		return paymentRequestService;
	}

	/**
	 * Sets the payment request remote service.
	 *
	 * @param paymentRequestService the payment request remote service
	 */
	public void setPaymentRequestService(
		org.oep.core.dossiermgt.service.PaymentRequestService paymentRequestService) {
		this.paymentRequestService = paymentRequestService;
	}

	/**
	 * Returns the payment request persistence.
	 *
	 * @return the payment request persistence
	 */
	public PaymentRequestPersistence getPaymentRequestPersistence() {
		return paymentRequestPersistence;
	}

	/**
	 * Sets the payment request persistence.
	 *
	 * @param paymentRequestPersistence the payment request persistence
	 */
	public void setPaymentRequestPersistence(
		PaymentRequestPersistence paymentRequestPersistence) {
		this.paymentRequestPersistence = paymentRequestPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return DossierProc.class;
	}

	protected String getModelClassName() {
		return DossierProc.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = dossierProcPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.oep.core.dossiermgt.service.DocFileLocalService.class)
	protected org.oep.core.dossiermgt.service.DocFileLocalService docFileLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.DocFileService.class)
	protected org.oep.core.dossiermgt.service.DocFileService docFileService;
	@BeanReference(type = DocFilePersistence.class)
	protected DocFilePersistence docFilePersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.DocFileVersionLocalService.class)
	protected org.oep.core.dossiermgt.service.DocFileVersionLocalService docFileVersionLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.DocFileVersionService.class)
	protected org.oep.core.dossiermgt.service.DocFileVersionService docFileVersionService;
	@BeanReference(type = DocFileVersionPersistence.class)
	protected DocFileVersionPersistence docFileVersionPersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.DocTemplateLocalService.class)
	protected org.oep.core.dossiermgt.service.DocTemplateLocalService docTemplateLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.DocTemplateService.class)
	protected org.oep.core.dossiermgt.service.DocTemplateService docTemplateService;
	@BeanReference(type = DocTemplatePersistence.class)
	protected DocTemplatePersistence docTemplatePersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierLocalService.class)
	protected org.oep.core.dossiermgt.service.DossierLocalService dossierLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierService.class)
	protected org.oep.core.dossiermgt.service.DossierService dossierService;
	@BeanReference(type = DossierPersistence.class)
	protected DossierPersistence dossierPersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierDocLocalService.class)
	protected org.oep.core.dossiermgt.service.DossierDocLocalService dossierDocLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierDocService.class)
	protected org.oep.core.dossiermgt.service.DossierDocService dossierDocService;
	@BeanReference(type = DossierDocPersistence.class)
	protected DossierDocPersistence dossierDocPersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierDoc2TemplateLocalService.class)
	protected org.oep.core.dossiermgt.service.DossierDoc2TemplateLocalService dossierDoc2TemplateLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierDoc2TemplateService.class)
	protected org.oep.core.dossiermgt.service.DossierDoc2TemplateService dossierDoc2TemplateService;
	@BeanReference(type = DossierDoc2TemplatePersistence.class)
	protected DossierDoc2TemplatePersistence dossierDoc2TemplatePersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierFolderLocalService.class)
	protected org.oep.core.dossiermgt.service.DossierFolderLocalService dossierFolderLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierFolderService.class)
	protected org.oep.core.dossiermgt.service.DossierFolderService dossierFolderService;
	@BeanReference(type = DossierFolderPersistence.class)
	protected DossierFolderPersistence dossierFolderPersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierFolder2RoleLocalService.class)
	protected org.oep.core.dossiermgt.service.DossierFolder2RoleLocalService dossierFolder2RoleLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierFolder2RoleService.class)
	protected org.oep.core.dossiermgt.service.DossierFolder2RoleService dossierFolder2RoleService;
	@BeanReference(type = DossierFolder2RolePersistence.class)
	protected DossierFolder2RolePersistence dossierFolder2RolePersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierProcLocalService.class)
	protected org.oep.core.dossiermgt.service.DossierProcLocalService dossierProcLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierProcService.class)
	protected org.oep.core.dossiermgt.service.DossierProcService dossierProcService;
	@BeanReference(type = DossierProcPersistence.class)
	protected DossierProcPersistence dossierProcPersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierProc2AgentLocalService.class)
	protected org.oep.core.dossiermgt.service.DossierProc2AgentLocalService dossierProc2AgentLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.DossierProc2AgentService.class)
	protected org.oep.core.dossiermgt.service.DossierProc2AgentService dossierProc2AgentService;
	@BeanReference(type = DossierProc2AgentPersistence.class)
	protected DossierProc2AgentPersistence dossierProc2AgentPersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.PaymentConfigLocalService.class)
	protected org.oep.core.dossiermgt.service.PaymentConfigLocalService paymentConfigLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.PaymentConfigService.class)
	protected org.oep.core.dossiermgt.service.PaymentConfigService paymentConfigService;
	@BeanReference(type = PaymentConfigPersistence.class)
	protected PaymentConfigPersistence paymentConfigPersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.PaymentFileLocalService.class)
	protected org.oep.core.dossiermgt.service.PaymentFileLocalService paymentFileLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.PaymentFileService.class)
	protected org.oep.core.dossiermgt.service.PaymentFileService paymentFileService;
	@BeanReference(type = PaymentFilePersistence.class)
	protected PaymentFilePersistence paymentFilePersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.PaymentFile2DossierLocalService.class)
	protected org.oep.core.dossiermgt.service.PaymentFile2DossierLocalService paymentFile2DossierLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.PaymentFile2DossierService.class)
	protected org.oep.core.dossiermgt.service.PaymentFile2DossierService paymentFile2DossierService;
	@BeanReference(type = PaymentFile2DossierPersistence.class)
	protected PaymentFile2DossierPersistence paymentFile2DossierPersistence;
	@BeanReference(type = org.oep.core.dossiermgt.service.PaymentRequestLocalService.class)
	protected org.oep.core.dossiermgt.service.PaymentRequestLocalService paymentRequestLocalService;
	@BeanReference(type = org.oep.core.dossiermgt.service.PaymentRequestService.class)
	protected org.oep.core.dossiermgt.service.PaymentRequestService paymentRequestService;
	@BeanReference(type = PaymentRequestPersistence.class)
	protected PaymentRequestPersistence paymentRequestPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private DossierProcServiceClpInvoker _clpInvoker = new DossierProcServiceClpInvoker();
}