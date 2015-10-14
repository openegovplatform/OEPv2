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

package org.oep.core.processmgt.service;

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

import org.oep.core.processmgt.model.DossierProcessClp;
import org.oep.core.processmgt.model.DossierStep2RoleClp;
import org.oep.core.processmgt.model.DossierStepClp;
import org.oep.core.processmgt.model.ProcessOrder2UserClp;
import org.oep.core.processmgt.model.ProcessOrderClp;
import org.oep.core.processmgt.model.StatisticByUserClp;
import org.oep.core.processmgt.model.StepTransitionClp;
import org.oep.core.processmgt.model.TransitionHistoryClp;
import org.oep.core.processmgt.model.UserAssignmentClp;

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
						"oep-core-processmgt-portlet-deployment-context");

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
							"oep-core-processmgt-portlet-deployment-context");

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
				_servletContextName = "oep-core-processmgt-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(DossierProcessClp.class.getName())) {
			return translateInputDossierProcess(oldModel);
		}

		if (oldModelClassName.equals(DossierStepClp.class.getName())) {
			return translateInputDossierStep(oldModel);
		}

		if (oldModelClassName.equals(DossierStep2RoleClp.class.getName())) {
			return translateInputDossierStep2Role(oldModel);
		}

		if (oldModelClassName.equals(ProcessOrderClp.class.getName())) {
			return translateInputProcessOrder(oldModel);
		}

		if (oldModelClassName.equals(ProcessOrder2UserClp.class.getName())) {
			return translateInputProcessOrder2User(oldModel);
		}

		if (oldModelClassName.equals(StatisticByUserClp.class.getName())) {
			return translateInputStatisticByUser(oldModel);
		}

		if (oldModelClassName.equals(StepTransitionClp.class.getName())) {
			return translateInputStepTransition(oldModel);
		}

		if (oldModelClassName.equals(TransitionHistoryClp.class.getName())) {
			return translateInputTransitionHistory(oldModel);
		}

		if (oldModelClassName.equals(UserAssignmentClp.class.getName())) {
			return translateInputUserAssignment(oldModel);
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

	public static Object translateInputDossierProcess(BaseModel<?> oldModel) {
		DossierProcessClp oldClpModel = (DossierProcessClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDossierProcessRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDossierStep(BaseModel<?> oldModel) {
		DossierStepClp oldClpModel = (DossierStepClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDossierStepRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDossierStep2Role(BaseModel<?> oldModel) {
		DossierStep2RoleClp oldClpModel = (DossierStep2RoleClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDossierStep2RoleRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputProcessOrder(BaseModel<?> oldModel) {
		ProcessOrderClp oldClpModel = (ProcessOrderClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getProcessOrderRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputProcessOrder2User(BaseModel<?> oldModel) {
		ProcessOrder2UserClp oldClpModel = (ProcessOrder2UserClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getProcessOrder2UserRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputStatisticByUser(BaseModel<?> oldModel) {
		StatisticByUserClp oldClpModel = (StatisticByUserClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getStatisticByUserRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputStepTransition(BaseModel<?> oldModel) {
		StepTransitionClp oldClpModel = (StepTransitionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getStepTransitionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTransitionHistory(BaseModel<?> oldModel) {
		TransitionHistoryClp oldClpModel = (TransitionHistoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTransitionHistoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUserAssignment(BaseModel<?> oldModel) {
		UserAssignmentClp oldClpModel = (UserAssignmentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUserAssignmentRemoteModel();

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
					"org.oep.core.processmgt.model.impl.DossierProcessImpl")) {
			return translateOutputDossierProcess(oldModel);
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
					"org.oep.core.processmgt.model.impl.DossierStepImpl")) {
			return translateOutputDossierStep(oldModel);
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
					"org.oep.core.processmgt.model.impl.DossierStep2RoleImpl")) {
			return translateOutputDossierStep2Role(oldModel);
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
					"org.oep.core.processmgt.model.impl.ProcessOrderImpl")) {
			return translateOutputProcessOrder(oldModel);
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
					"org.oep.core.processmgt.model.impl.ProcessOrder2UserImpl")) {
			return translateOutputProcessOrder2User(oldModel);
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
					"org.oep.core.processmgt.model.impl.StatisticByUserImpl")) {
			return translateOutputStatisticByUser(oldModel);
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
					"org.oep.core.processmgt.model.impl.StepTransitionImpl")) {
			return translateOutputStepTransition(oldModel);
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
					"org.oep.core.processmgt.model.impl.TransitionHistoryImpl")) {
			return translateOutputTransitionHistory(oldModel);
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
					"org.oep.core.processmgt.model.impl.UserAssignmentImpl")) {
			return translateOutputUserAssignment(oldModel);
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
					"org.oep.core.processmgt.NoSuchDossierProcessException")) {
			return new org.oep.core.processmgt.NoSuchDossierProcessException();
		}

		if (className.equals(
					"org.oep.core.processmgt.NoSuchDossierStepException")) {
			return new org.oep.core.processmgt.NoSuchDossierStepException();
		}

		if (className.equals(
					"org.oep.core.processmgt.NoSuchDossierStep2RoleException")) {
			return new org.oep.core.processmgt.NoSuchDossierStep2RoleException();
		}

		if (className.equals(
					"org.oep.core.processmgt.NoSuchProcessOrderException")) {
			return new org.oep.core.processmgt.NoSuchProcessOrderException();
		}

		if (className.equals(
					"org.oep.core.processmgt.NoSuchProcessOrder2UserException")) {
			return new org.oep.core.processmgt.NoSuchProcessOrder2UserException();
		}

		if (className.equals(
					"org.oep.core.processmgt.NoSuchStatisticByUserException")) {
			return new org.oep.core.processmgt.NoSuchStatisticByUserException();
		}

		if (className.equals(
					"org.oep.core.processmgt.NoSuchStepTransitionException")) {
			return new org.oep.core.processmgt.NoSuchStepTransitionException();
		}

		if (className.equals(
					"org.oep.core.processmgt.NoSuchTransitionHistoryException")) {
			return new org.oep.core.processmgt.NoSuchTransitionHistoryException();
		}

		if (className.equals(
					"org.oep.core.processmgt.NoSuchUserAssignmentException")) {
			return new org.oep.core.processmgt.NoSuchUserAssignmentException();
		}

		return throwable;
	}

	public static Object translateOutputDossierProcess(BaseModel<?> oldModel) {
		DossierProcessClp newModel = new DossierProcessClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDossierProcessRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDossierStep(BaseModel<?> oldModel) {
		DossierStepClp newModel = new DossierStepClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDossierStepRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDossierStep2Role(BaseModel<?> oldModel) {
		DossierStep2RoleClp newModel = new DossierStep2RoleClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDossierStep2RoleRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputProcessOrder(BaseModel<?> oldModel) {
		ProcessOrderClp newModel = new ProcessOrderClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setProcessOrderRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputProcessOrder2User(BaseModel<?> oldModel) {
		ProcessOrder2UserClp newModel = new ProcessOrder2UserClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setProcessOrder2UserRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputStatisticByUser(BaseModel<?> oldModel) {
		StatisticByUserClp newModel = new StatisticByUserClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setStatisticByUserRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputStepTransition(BaseModel<?> oldModel) {
		StepTransitionClp newModel = new StepTransitionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setStepTransitionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTransitionHistory(BaseModel<?> oldModel) {
		TransitionHistoryClp newModel = new TransitionHistoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTransitionHistoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUserAssignment(BaseModel<?> oldModel) {
		UserAssignmentClp newModel = new UserAssignmentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUserAssignmentRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}