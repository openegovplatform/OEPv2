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

package org.oep.usermgt.service;

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

import org.oep.usermgt.model.BusinessClp;
import org.oep.usermgt.model.CitizenClp;
import org.oep.usermgt.model.DelegacyClp;
import org.oep.usermgt.model.EmployeeClp;
import org.oep.usermgt.model.JobPos2RoleClp;
import org.oep.usermgt.model.JobPosClp;
import org.oep.usermgt.model.SubAccountClp;
import org.oep.usermgt.model.WorkingUnitClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NQMINH
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
						"oep-usermgt-portlet-deployment-context");

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
							"oep-usermgt-portlet-deployment-context");

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
				_servletContextName = "oep-usermgt-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(BusinessClp.class.getName())) {
			return translateInputBusiness(oldModel);
		}

		if (oldModelClassName.equals(CitizenClp.class.getName())) {
			return translateInputCitizen(oldModel);
		}

		if (oldModelClassName.equals(DelegacyClp.class.getName())) {
			return translateInputDelegacy(oldModel);
		}

		if (oldModelClassName.equals(EmployeeClp.class.getName())) {
			return translateInputEmployee(oldModel);
		}

		if (oldModelClassName.equals(JobPosClp.class.getName())) {
			return translateInputJobPos(oldModel);
		}

		if (oldModelClassName.equals(JobPos2RoleClp.class.getName())) {
			return translateInputJobPos2Role(oldModel);
		}

		if (oldModelClassName.equals(SubAccountClp.class.getName())) {
			return translateInputSubAccount(oldModel);
		}

		if (oldModelClassName.equals(WorkingUnitClp.class.getName())) {
			return translateInputWorkingUnit(oldModel);
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

	public static Object translateInputBusiness(BaseModel<?> oldModel) {
		BusinessClp oldClpModel = (BusinessClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getBusinessRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCitizen(BaseModel<?> oldModel) {
		CitizenClp oldClpModel = (CitizenClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCitizenRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDelegacy(BaseModel<?> oldModel) {
		DelegacyClp oldClpModel = (DelegacyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDelegacyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmployee(BaseModel<?> oldModel) {
		EmployeeClp oldClpModel = (EmployeeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmployeeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputJobPos(BaseModel<?> oldModel) {
		JobPosClp oldClpModel = (JobPosClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getJobPosRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputJobPos2Role(BaseModel<?> oldModel) {
		JobPos2RoleClp oldClpModel = (JobPos2RoleClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getJobPos2RoleRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSubAccount(BaseModel<?> oldModel) {
		SubAccountClp oldClpModel = (SubAccountClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSubAccountRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputWorkingUnit(BaseModel<?> oldModel) {
		WorkingUnitClp oldClpModel = (WorkingUnitClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getWorkingUnitRemoteModel();

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

		if (oldModelClassName.equals("org.oep.usermgt.model.impl.BusinessImpl")) {
			return translateOutputBusiness(oldModel);
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

		if (oldModelClassName.equals("org.oep.usermgt.model.impl.CitizenImpl")) {
			return translateOutputCitizen(oldModel);
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

		if (oldModelClassName.equals("org.oep.usermgt.model.impl.DelegacyImpl")) {
			return translateOutputDelegacy(oldModel);
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

		if (oldModelClassName.equals("org.oep.usermgt.model.impl.EmployeeImpl")) {
			return translateOutputEmployee(oldModel);
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

		if (oldModelClassName.equals("org.oep.usermgt.model.impl.JobPosImpl")) {
			return translateOutputJobPos(oldModel);
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
					"org.oep.usermgt.model.impl.JobPos2RoleImpl")) {
			return translateOutputJobPos2Role(oldModel);
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
					"org.oep.usermgt.model.impl.SubAccountImpl")) {
			return translateOutputSubAccount(oldModel);
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
					"org.oep.usermgt.model.impl.WorkingUnitImpl")) {
			return translateOutputWorkingUnit(oldModel);
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

		if (className.equals("org.oep.usermgt.BusinessNoException")) {
			return new org.oep.usermgt.BusinessNoException();
		}

		if (className.equals("org.oep.usermgt.CitizenFullNameException")) {
			return new org.oep.usermgt.CitizenFullNameException();
		}

		if (className.equals("org.oep.usermgt.CitizenIdentificationNoException")) {
			return new org.oep.usermgt.CitizenIdentificationNoException();
		}

		if (className.equals("org.oep.usermgt.CitizenMappingUserException")) {
			return new org.oep.usermgt.CitizenMappingUserException();
		}

		if (className.equals("org.oep.usermgt.CitizenNoException")) {
			return new org.oep.usermgt.CitizenNoException();
		}

		if (className.equals("org.oep.usermgt.DuplicateException")) {
			return new org.oep.usermgt.DuplicateException();
		}

		if (className.equals("org.oep.usermgt.EmployeeFullNameException")) {
			return new org.oep.usermgt.EmployeeFullNameException();
		}

		if (className.equals("org.oep.usermgt.EmployeeMappingUserException")) {
			return new org.oep.usermgt.EmployeeMappingUserException();
		}

		if (className.equals("org.oep.usermgt.NotFoundException")) {
			return new org.oep.usermgt.NotFoundException();
		}

		if (className.equals("org.oep.usermgt.NotIdentifiedException")) {
			return new org.oep.usermgt.NotIdentifiedException();
		}

		if (className.equals("org.oep.usermgt.NotPermissionException")) {
			return new org.oep.usermgt.NotPermissionException();
		}

		if (className.equals("org.oep.usermgt.SubAccountFullNameException")) {
			return new org.oep.usermgt.SubAccountFullNameException();
		}

		if (className.equals("org.oep.usermgt.WorkingRoleException")) {
			return new org.oep.usermgt.WorkingRoleException();
		}

		if (className.equals("org.oep.usermgt.WorkingUnitNameException")) {
			return new org.oep.usermgt.WorkingUnitNameException();
		}

		if (className.equals("org.oep.usermgt.NoSuchBusinessException")) {
			return new org.oep.usermgt.NoSuchBusinessException();
		}

		if (className.equals("org.oep.usermgt.NoSuchCitizenException")) {
			return new org.oep.usermgt.NoSuchCitizenException();
		}

		if (className.equals("org.oep.usermgt.NoSuchDelegacyException")) {
			return new org.oep.usermgt.NoSuchDelegacyException();
		}

		if (className.equals("org.oep.usermgt.NoSuchEmployeeException")) {
			return new org.oep.usermgt.NoSuchEmployeeException();
		}

		if (className.equals("org.oep.usermgt.NoSuchJobPosException")) {
			return new org.oep.usermgt.NoSuchJobPosException();
		}

		if (className.equals("org.oep.usermgt.NoSuchJobPos2RoleException")) {
			return new org.oep.usermgt.NoSuchJobPos2RoleException();
		}

		if (className.equals("org.oep.usermgt.NoSuchSubAccountException")) {
			return new org.oep.usermgt.NoSuchSubAccountException();
		}

		if (className.equals("org.oep.usermgt.NoSuchWorkingUnitException")) {
			return new org.oep.usermgt.NoSuchWorkingUnitException();
		}

		return throwable;
	}

	public static Object translateOutputBusiness(BaseModel<?> oldModel) {
		BusinessClp newModel = new BusinessClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setBusinessRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCitizen(BaseModel<?> oldModel) {
		CitizenClp newModel = new CitizenClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCitizenRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDelegacy(BaseModel<?> oldModel) {
		DelegacyClp newModel = new DelegacyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDelegacyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmployee(BaseModel<?> oldModel) {
		EmployeeClp newModel = new EmployeeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmployeeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputJobPos(BaseModel<?> oldModel) {
		JobPosClp newModel = new JobPosClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setJobPosRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputJobPos2Role(BaseModel<?> oldModel) {
		JobPos2RoleClp newModel = new JobPos2RoleClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setJobPos2RoleRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSubAccount(BaseModel<?> oldModel) {
		SubAccountClp newModel = new SubAccountClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSubAccountRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputWorkingUnit(BaseModel<?> oldModel) {
		WorkingUnitClp newModel = new WorkingUnitClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setWorkingUnitRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}