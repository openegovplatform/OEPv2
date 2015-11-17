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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import org.oep.dossiermgt.model.DocFileClp;
import org.oep.dossiermgt.model.DocFileVersionClp;
import org.oep.dossiermgt.model.DocTemplateClp;
import org.oep.dossiermgt.model.DossierClp;
import org.oep.dossiermgt.model.DossierDocClp;
import org.oep.dossiermgt.model.DossierFolder2RoleClp;
import org.oep.dossiermgt.model.DossierFolderClp;
import org.oep.dossiermgt.model.DossierProcAgentClp;
import org.oep.dossiermgt.model.DossierProcBookmarkClp;
import org.oep.dossiermgt.model.DossierProcClp;
import org.oep.dossiermgt.model.DossierTagClp;
import org.oep.dossiermgt.model.EbMessageClp;
import org.oep.dossiermgt.model.EbPartnerShipClp;
import org.oep.dossiermgt.model.PaymentConfigClp;
import org.oep.dossiermgt.model.PaymentFileClp;
import org.oep.dossiermgt.model.PaymentRequestClp;
import org.oep.dossiermgt.model.ProfileDataClp;
import org.oep.dossiermgt.model.StatisticByAgencyClp;
import org.oep.dossiermgt.model.StatisticByDayClp;
import org.oep.dossiermgt.model.StatisticByDomainClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author trungdk
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"oep-dossier-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"oep-dossier-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "oep-dossier-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(DocFileClp.class.getName())) {
			return translateInputDocFile(oldModel);
		}

		if (oldModelClassName.equals(DocFileVersionClp.class.getName())) {
			return translateInputDocFileVersion(oldModel);
		}

		if (oldModelClassName.equals(DocTemplateClp.class.getName())) {
			return translateInputDocTemplate(oldModel);
		}

		if (oldModelClassName.equals(DossierClp.class.getName())) {
			return translateInputDossier(oldModel);
		}

		if (oldModelClassName.equals(DossierDocClp.class.getName())) {
			return translateInputDossierDoc(oldModel);
		}

		if (oldModelClassName.equals(DossierFolderClp.class.getName())) {
			return translateInputDossierFolder(oldModel);
		}

		if (oldModelClassName.equals(DossierFolder2RoleClp.class.getName())) {
			return translateInputDossierFolder2Role(oldModel);
		}

		if (oldModelClassName.equals(DossierProcClp.class.getName())) {
			return translateInputDossierProc(oldModel);
		}

		if (oldModelClassName.equals(DossierProcAgentClp.class.getName())) {
			return translateInputDossierProcAgent(oldModel);
		}

		if (oldModelClassName.equals(DossierProcBookmarkClp.class.getName())) {
			return translateInputDossierProcBookmark(oldModel);
		}

		if (oldModelClassName.equals(DossierTagClp.class.getName())) {
			return translateInputDossierTag(oldModel);
		}

		if (oldModelClassName.equals(EbMessageClp.class.getName())) {
			return translateInputEbMessage(oldModel);
		}

		if (oldModelClassName.equals(EbPartnerShipClp.class.getName())) {
			return translateInputEbPartnerShip(oldModel);
		}

		if (oldModelClassName.equals(PaymentConfigClp.class.getName())) {
			return translateInputPaymentConfig(oldModel);
		}

		if (oldModelClassName.equals(PaymentFileClp.class.getName())) {
			return translateInputPaymentFile(oldModel);
		}

		if (oldModelClassName.equals(PaymentRequestClp.class.getName())) {
			return translateInputPaymentRequest(oldModel);
		}

		if (oldModelClassName.equals(ProfileDataClp.class.getName())) {
			return translateInputProfileData(oldModel);
		}

		if (oldModelClassName.equals(StatisticByAgencyClp.class.getName())) {
			return translateInputStatisticByAgency(oldModel);
		}

		if (oldModelClassName.equals(StatisticByDayClp.class.getName())) {
			return translateInputStatisticByDay(oldModel);
		}

		if (oldModelClassName.equals(StatisticByDomainClp.class.getName())) {
			return translateInputStatisticByDomain(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputDocFile(BaseModel<?> oldModel) {
		DocFileClp oldClpModel = (DocFileClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDocFileRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDocFileVersion(BaseModel<?> oldModel) {
		DocFileVersionClp oldClpModel = (DocFileVersionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDocFileVersionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDocTemplate(BaseModel<?> oldModel) {
		DocTemplateClp oldClpModel = (DocTemplateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDocTemplateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDossier(BaseModel<?> oldModel) {
		DossierClp oldClpModel = (DossierClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDossierRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDossierDoc(BaseModel<?> oldModel) {
		DossierDocClp oldClpModel = (DossierDocClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDossierDocRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDossierFolder(BaseModel<?> oldModel) {
		DossierFolderClp oldClpModel = (DossierFolderClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDossierFolderRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDossierFolder2Role(BaseModel<?> oldModel) {
		DossierFolder2RoleClp oldClpModel = (DossierFolder2RoleClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDossierFolder2RoleRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDossierProc(BaseModel<?> oldModel) {
		DossierProcClp oldClpModel = (DossierProcClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDossierProcRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDossierProcAgent(BaseModel<?> oldModel) {
		DossierProcAgentClp oldClpModel = (DossierProcAgentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDossierProcAgentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDossierProcBookmark(
		BaseModel<?> oldModel) {
		DossierProcBookmarkClp oldClpModel = (DossierProcBookmarkClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDossierProcBookmarkRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDossierTag(BaseModel<?> oldModel) {
		DossierTagClp oldClpModel = (DossierTagClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDossierTagRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEbMessage(BaseModel<?> oldModel) {
		EbMessageClp oldClpModel = (EbMessageClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEbMessageRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEbPartnerShip(BaseModel<?> oldModel) {
		EbPartnerShipClp oldClpModel = (EbPartnerShipClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEbPartnerShipRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPaymentConfig(BaseModel<?> oldModel) {
		PaymentConfigClp oldClpModel = (PaymentConfigClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPaymentConfigRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPaymentFile(BaseModel<?> oldModel) {
		PaymentFileClp oldClpModel = (PaymentFileClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPaymentFileRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPaymentRequest(BaseModel<?> oldModel) {
		PaymentRequestClp oldClpModel = (PaymentRequestClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPaymentRequestRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputProfileData(BaseModel<?> oldModel) {
		ProfileDataClp oldClpModel = (ProfileDataClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getProfileDataRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputStatisticByAgency(BaseModel<?> oldModel) {
		StatisticByAgencyClp oldClpModel = (StatisticByAgencyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getStatisticByAgencyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputStatisticByDay(BaseModel<?> oldModel) {
		StatisticByDayClp oldClpModel = (StatisticByDayClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getStatisticByDayRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputStatisticByDomain(BaseModel<?> oldModel) {
		StatisticByDomainClp oldClpModel = (StatisticByDomainClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getStatisticByDomainRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.DocFileImpl")) {
			return translateOutputDocFile(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.DocFileVersionImpl")) {
			return translateOutputDocFileVersion(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.DocTemplateImpl")) {
			return translateOutputDocTemplate(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.DossierImpl")) {
			return translateOutputDossier(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.DossierDocImpl")) {
			return translateOutputDossierDoc(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.DossierFolderImpl")) {
			return translateOutputDossierFolder(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.DossierFolder2RoleImpl")) {
			return translateOutputDossierFolder2Role(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.DossierProcImpl")) {
			return translateOutputDossierProc(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.DossierProcAgentImpl")) {
			return translateOutputDossierProcAgent(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.DossierProcBookmarkImpl")) {
			return translateOutputDossierProcBookmark(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.DossierTagImpl")) {
			return translateOutputDossierTag(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.EbMessageImpl")) {
			return translateOutputEbMessage(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.EbPartnerShipImpl")) {
			return translateOutputEbPartnerShip(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.PaymentConfigImpl")) {
			return translateOutputPaymentConfig(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.PaymentFileImpl")) {
			return translateOutputPaymentFile(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.PaymentRequestImpl")) {
			return translateOutputPaymentRequest(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.ProfileDataImpl")) {
			return translateOutputProfileData(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.StatisticByAgencyImpl")) {
			return translateOutputStatisticByAgency(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.StatisticByDayImpl")) {
			return translateOutputStatisticByDay(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.oep.dossiermgt.model.impl.StatisticByDomainImpl")) {
			return translateOutputStatisticByDomain(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"org.oep.dossiermgt.DossierProcEffectExpireDateException")) {
			return new org.oep.dossiermgt.DossierProcEffectExpireDateException();
		}

		if (className.equals("org.oep.dossiermgt.DossierProcNoException")) {
			return new org.oep.dossiermgt.DossierProcNoException();
		}

		if (className.equals(
					"org.oep.dossiermgt.DupplicateDocTemplateException")) {
			return new org.oep.dossiermgt.DupplicateDocTemplateException();
		}

		if (className.equals("org.oep.dossiermgt.DupplicateDossierException")) {
			return new org.oep.dossiermgt.DupplicateDossierException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchAdministrationException")) {
			return new org.oep.dossiermgt.NoSuchAdministrationException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchDocTemplateException")) {
			return new org.oep.dossiermgt.NoSuchDocTemplateException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchDomainException")) {
			return new org.oep.dossiermgt.NoSuchDomainException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchDossierException")) {
			return new org.oep.dossiermgt.NoSuchDossierException();
		}

		if (className.equals("org.oep.dossiermgt.TemplateNoException")) {
			return new org.oep.dossiermgt.TemplateNoException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchDocFileException")) {
			return new org.oep.dossiermgt.NoSuchDocFileException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchDocFileVersionException")) {
			return new org.oep.dossiermgt.NoSuchDocFileVersionException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchDocTemplateException")) {
			return new org.oep.dossiermgt.NoSuchDocTemplateException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchDossierException")) {
			return new org.oep.dossiermgt.NoSuchDossierException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchDossierDocException")) {
			return new org.oep.dossiermgt.NoSuchDossierDocException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchDossierFolderException")) {
			return new org.oep.dossiermgt.NoSuchDossierFolderException();
		}

		if (className.equals(
					"org.oep.dossiermgt.NoSuchDossierFolder2RoleException")) {
			return new org.oep.dossiermgt.NoSuchDossierFolder2RoleException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchDossierProcException")) {
			return new org.oep.dossiermgt.NoSuchDossierProcException();
		}

		if (className.equals(
					"org.oep.dossiermgt.NoSuchDossierProcAgentException")) {
			return new org.oep.dossiermgt.NoSuchDossierProcAgentException();
		}

		if (className.equals(
					"org.oep.dossiermgt.NoSuchDossierProcBookmarkException")) {
			return new org.oep.dossiermgt.NoSuchDossierProcBookmarkException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchDossierTagException")) {
			return new org.oep.dossiermgt.NoSuchDossierTagException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchEbMessageException")) {
			return new org.oep.dossiermgt.NoSuchEbMessageException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchEbPartnerShipException")) {
			return new org.oep.dossiermgt.NoSuchEbPartnerShipException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchPaymentConfigException")) {
			return new org.oep.dossiermgt.NoSuchPaymentConfigException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchPaymentFileException")) {
			return new org.oep.dossiermgt.NoSuchPaymentFileException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchPaymentRequestException")) {
			return new org.oep.dossiermgt.NoSuchPaymentRequestException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchProfileDataException")) {
			return new org.oep.dossiermgt.NoSuchProfileDataException();
		}

		if (className.equals(
					"org.oep.dossiermgt.NoSuchStatisticByAgencyException")) {
			return new org.oep.dossiermgt.NoSuchStatisticByAgencyException();
		}

		if (className.equals("org.oep.dossiermgt.NoSuchStatisticByDayException")) {
			return new org.oep.dossiermgt.NoSuchStatisticByDayException();
		}

		if (className.equals(
					"org.oep.dossiermgt.NoSuchStatisticByDomainException")) {
			return new org.oep.dossiermgt.NoSuchStatisticByDomainException();
		}

		return throwable;
	}

	public static Object translateOutputDocFile(BaseModel<?> oldModel) {
		DocFileClp newModel = new DocFileClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDocFileRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDocFileVersion(BaseModel<?> oldModel) {
		DocFileVersionClp newModel = new DocFileVersionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDocFileVersionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDocTemplate(BaseModel<?> oldModel) {
		DocTemplateClp newModel = new DocTemplateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDocTemplateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDossier(BaseModel<?> oldModel) {
		DossierClp newModel = new DossierClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDossierRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDossierDoc(BaseModel<?> oldModel) {
		DossierDocClp newModel = new DossierDocClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDossierDocRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDossierFolder(BaseModel<?> oldModel) {
		DossierFolderClp newModel = new DossierFolderClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDossierFolderRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDossierFolder2Role(
		BaseModel<?> oldModel) {
		DossierFolder2RoleClp newModel = new DossierFolder2RoleClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDossierFolder2RoleRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDossierProc(BaseModel<?> oldModel) {
		DossierProcClp newModel = new DossierProcClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDossierProcRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDossierProcAgent(BaseModel<?> oldModel) {
		DossierProcAgentClp newModel = new DossierProcAgentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDossierProcAgentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDossierProcBookmark(
		BaseModel<?> oldModel) {
		DossierProcBookmarkClp newModel = new DossierProcBookmarkClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDossierProcBookmarkRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDossierTag(BaseModel<?> oldModel) {
		DossierTagClp newModel = new DossierTagClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDossierTagRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEbMessage(BaseModel<?> oldModel) {
		EbMessageClp newModel = new EbMessageClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEbMessageRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEbPartnerShip(BaseModel<?> oldModel) {
		EbPartnerShipClp newModel = new EbPartnerShipClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEbPartnerShipRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPaymentConfig(BaseModel<?> oldModel) {
		PaymentConfigClp newModel = new PaymentConfigClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPaymentConfigRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPaymentFile(BaseModel<?> oldModel) {
		PaymentFileClp newModel = new PaymentFileClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPaymentFileRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPaymentRequest(BaseModel<?> oldModel) {
		PaymentRequestClp newModel = new PaymentRequestClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPaymentRequestRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputProfileData(BaseModel<?> oldModel) {
		ProfileDataClp newModel = new ProfileDataClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setProfileDataRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputStatisticByAgency(BaseModel<?> oldModel) {
		StatisticByAgencyClp newModel = new StatisticByAgencyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setStatisticByAgencyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputStatisticByDay(BaseModel<?> oldModel) {
		StatisticByDayClp newModel = new StatisticByDayClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setStatisticByDayRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputStatisticByDomain(BaseModel<?> oldModel) {
		StatisticByDomainClp newModel = new StatisticByDomainClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setStatisticByDomainRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}