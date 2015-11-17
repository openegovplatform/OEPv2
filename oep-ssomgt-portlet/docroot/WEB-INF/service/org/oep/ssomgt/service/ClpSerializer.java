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

package org.oep.ssomgt.service;

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

import org.oep.ssomgt.model.AppMessageClp;
import org.oep.ssomgt.model.AppRole2EmployeeClp;
import org.oep.ssomgt.model.AppRole2JobPosClp;
import org.oep.ssomgt.model.AppRoleClp;
import org.oep.ssomgt.model.ApplicationClp;
import org.oep.ssomgt.model.UserSyncClp;

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
						"oep-ssomgt-portlet-deployment-context");

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
							"oep-ssomgt-portlet-deployment-context");

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
				_servletContextName = "oep-ssomgt-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(ApplicationClp.class.getName())) {
			return translateInputApplication(oldModel);
		}

		if (oldModelClassName.equals(AppMessageClp.class.getName())) {
			return translateInputAppMessage(oldModel);
		}

		if (oldModelClassName.equals(AppRoleClp.class.getName())) {
			return translateInputAppRole(oldModel);
		}

		if (oldModelClassName.equals(AppRole2EmployeeClp.class.getName())) {
			return translateInputAppRole2Employee(oldModel);
		}

		if (oldModelClassName.equals(AppRole2JobPosClp.class.getName())) {
			return translateInputAppRole2JobPos(oldModel);
		}

		if (oldModelClassName.equals(UserSyncClp.class.getName())) {
			return translateInputUserSync(oldModel);
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

	public static Object translateInputApplication(BaseModel<?> oldModel) {
		ApplicationClp oldClpModel = (ApplicationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getApplicationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAppMessage(BaseModel<?> oldModel) {
		AppMessageClp oldClpModel = (AppMessageClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAppMessageRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAppRole(BaseModel<?> oldModel) {
		AppRoleClp oldClpModel = (AppRoleClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAppRoleRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAppRole2Employee(BaseModel<?> oldModel) {
		AppRole2EmployeeClp oldClpModel = (AppRole2EmployeeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAppRole2EmployeeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAppRole2JobPos(BaseModel<?> oldModel) {
		AppRole2JobPosClp oldClpModel = (AppRole2JobPosClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAppRole2JobPosRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUserSync(BaseModel<?> oldModel) {
		UserSyncClp oldClpModel = (UserSyncClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUserSyncRemoteModel();

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
					"org.oep.ssomgt.model.impl.ApplicationImpl")) {
			return translateOutputApplication(oldModel);
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

		if (oldModelClassName.equals("org.oep.ssomgt.model.impl.AppMessageImpl")) {
			return translateOutputAppMessage(oldModel);
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

		if (oldModelClassName.equals("org.oep.ssomgt.model.impl.AppRoleImpl")) {
			return translateOutputAppRole(oldModel);
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
					"org.oep.ssomgt.model.impl.AppRole2EmployeeImpl")) {
			return translateOutputAppRole2Employee(oldModel);
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
					"org.oep.ssomgt.model.impl.AppRole2JobPosImpl")) {
			return translateOutputAppRole2JobPos(oldModel);
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

		if (oldModelClassName.equals("org.oep.ssomgt.model.impl.UserSyncImpl")) {
			return translateOutputUserSync(oldModel);
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

		if (className.equals("org.oep.ssomgt.AppCodeRangeLengthException")) {
			return new org.oep.ssomgt.AppCodeRangeLengthException();
		}

		if (className.equals("org.oep.ssomgt.AppNameRangeLengthException")) {
			return new org.oep.ssomgt.AppNameRangeLengthException();
		}

		if (className.equals("org.oep.ssomgt.AppPinRangeLengthException")) {
			return new org.oep.ssomgt.AppPinRangeLengthException();
		}

		if (className.equals("org.oep.ssomgt.AppUrlRangeLengthException")) {
			return new org.oep.ssomgt.AppUrlRangeLengthException();
		}

		if (className.equals("org.oep.ssomgt.DuplicateAppCodeException")) {
			return new org.oep.ssomgt.DuplicateAppCodeException();
		}

		if (className.equals("org.oep.ssomgt.DuplicateRoleCodeException")) {
			return new org.oep.ssomgt.DuplicateRoleCodeException();
		}

		if (className.equals("org.oep.ssomgt.PublicKeyRangeLengthException")) {
			return new org.oep.ssomgt.PublicKeyRangeLengthException();
		}

		if (className.equals("org.oep.ssomgt.RoleCodeRangeLengthException")) {
			return new org.oep.ssomgt.RoleCodeRangeLengthException();
		}

		if (className.equals("org.oep.ssomgt.RoleNameRangeLengthException")) {
			return new org.oep.ssomgt.RoleNameRangeLengthException();
		}

		if (className.equals("org.oep.ssomgt.NoSuchApplicationException")) {
			return new org.oep.ssomgt.NoSuchApplicationException();
		}

		if (className.equals("org.oep.ssomgt.NoSuchAppMessageException")) {
			return new org.oep.ssomgt.NoSuchAppMessageException();
		}

		if (className.equals("org.oep.ssomgt.NoSuchAppRoleException")) {
			return new org.oep.ssomgt.NoSuchAppRoleException();
		}

		if (className.equals("org.oep.ssomgt.NoSuchAppRole2EmployeeException")) {
			return new org.oep.ssomgt.NoSuchAppRole2EmployeeException();
		}

		if (className.equals("org.oep.ssomgt.NoSuchAppRole2JobPosException")) {
			return new org.oep.ssomgt.NoSuchAppRole2JobPosException();
		}

		if (className.equals("org.oep.ssomgt.NoSuchUserSyncException")) {
			return new org.oep.ssomgt.NoSuchUserSyncException();
		}

		return throwable;
	}

	public static Object translateOutputApplication(BaseModel<?> oldModel) {
		ApplicationClp newModel = new ApplicationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setApplicationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAppMessage(BaseModel<?> oldModel) {
		AppMessageClp newModel = new AppMessageClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAppMessageRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAppRole(BaseModel<?> oldModel) {
		AppRoleClp newModel = new AppRoleClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAppRoleRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAppRole2Employee(BaseModel<?> oldModel) {
		AppRole2EmployeeClp newModel = new AppRole2EmployeeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAppRole2EmployeeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAppRole2JobPos(BaseModel<?> oldModel) {
		AppRole2JobPosClp newModel = new AppRole2JobPosClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAppRole2JobPosRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUserSync(BaseModel<?> oldModel) {
		UserSyncClp newModel = new UserSyncClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUserSyncRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}