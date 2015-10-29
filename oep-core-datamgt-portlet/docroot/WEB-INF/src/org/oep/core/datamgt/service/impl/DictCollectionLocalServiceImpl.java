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

package org.oep.core.datamgt.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.oep.core.datamgt.DictCollectionNameException;
import org.oep.core.datamgt.DictCollectionStatusException;
import org.oep.core.datamgt.DictCollectionTitleException;
import org.oep.core.datamgt.DictCollectionVersionException;
import org.oep.core.datamgt.model.DictCollection;
import org.oep.core.datamgt.service.impl.DictCollectionLocalServiceImpl;
import org.oep.core.datamgt.service.base.DictCollectionLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the dictionary collection local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.datamgt.service.DictCollectionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NQMINH
 * @see org.oep.core.datamgt.service.base.DictCollectionLocalServiceBaseImpl
 * @see org.oep.core.datamgt.service.DictCollectionLocalServiceUtil
 */
public class DictCollectionLocalServiceImpl
	extends DictCollectionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.datamgt.service.DictCollectionLocalServiceUtil} to access the dictionary collection local service.
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DictCollection addDictCollection(String name, String version, String title, Date validatedFrom, Date validatedTo, int status, ServiceContext serviceContext) throws SystemException, PortalException {
		validate(name, version, title, status);
		long id = counterLocalService.increment();
		DictCollection dictCollection = dictCollectionPersistence.create(id);
		Date now = new Date();
		
		dictCollection.setName(name);
		dictCollection.setVersion(version);
		dictCollection.setTitle(title);
		dictCollection.setStatus(status);
		dictCollection.setCompanyId(serviceContext.getCompanyId());
		dictCollection.setCreateDate(serviceContext.getCreateDate(now));
		dictCollection.setValidatedFrom(validatedFrom);
		dictCollection.setValidatedTo(validatedTo);
		
		dictCollectionPersistence.update(dictCollection);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dict collection " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDictCollectionResources(dictCollection, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDictCollectionResources(dictCollection, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDictCollection(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public DictCollection updateDictCollection(
			long id, String name, String version,
			String title, Date validatedFrom, Date validatedTo,
			int status, ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate(name, version, title, status);

		DictCollection dictCollection = dictCollectionPersistence.findByPrimaryKey(id);

		dictCollection.setModifiedDate(serviceContext.getModifiedDate(null));
		dictCollection.setName(name);
		dictCollection.setVersion(version);
		dictCollection.setTitle(title);
		dictCollection.setStatus(status);
		dictCollection.setValidatedFrom(validatedFrom);
		dictCollection.setValidatedTo(validatedTo);
		
		dictCollectionPersistence.update(dictCollection);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDictCollectionResources(
				dictCollection, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDictCollection(dictCollection.getDictCollectionId());
	}

	public void updateDictCollectionResources(
			DictCollection dictCollection, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dictCollection.getCompanyId(), serviceContext.getScopeGroupId(),
			DictCollection.class.getName(), dictCollection.getDictCollectionId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDictCollection(DictCollection dictCollection) throws PortalException, SystemException {
		dictCollectionPersistence.remove(dictCollection);
		resourceLocalService.deleteResource(dictCollection.getCompanyId(), DictCollection.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dictCollection.getDictCollectionId());
	}
	
	public void removeDictCollection(long id) throws PortalException, SystemException {
		DictCollection dictCollection = dictCollectionPersistence.findByPrimaryKey(id);
		removeDictCollection(dictCollection);
	}
	
	public DictCollection getDictCollection(long id) throws PortalException, SystemException {
		return dictCollectionPersistence.findByPrimaryKey(id);
	}

	public void addDictCollectionResources(DictCollection dictCollection, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dictCollection.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DictCollection.class.getName(), dictCollection.getDictCollectionId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDictCollectionResources(DictCollection dictCollection, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dictCollection.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DictCollection.class.getName(), dictCollection.getDictCollectionId(), groupPermissions, guestPermissions);
	}
	
	public void addDictCollectionResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DictCollection dictCollection = dictCollectionPersistence.findByPrimaryKey(id);
		addDictCollectionResources(dictCollection, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate(String name, String version, String title, int status) throws PortalException {
		if (Validator.isNull(name) || ("".equals(name.trim())) || (name.length() > 30)) {
			throw new DictCollectionNameException();
		}
		if (Validator.isNull(version) || ("".equals(version.trim())) || (version.length() > 30)) {
			throw new DictCollectionVersionException();
		}
		if (!Validator.isNull(title) && title.length() > 255) {
			throw new DictCollectionTitleException();
		}
		if (status > 3 || status < 0) {
			throw new DictCollectionStatusException();
		}
	}


	public List<DictCollection> getAllDictCollectionsByName(String collectionName, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.findByC_N(serviceContext.getCompanyId(), collectionName);
	}
	
	public List<String> getAllDictCollectionNames(ServiceContext serviceContext) throws SystemException {
		Collection<DictCollection> collects = dictCollectionPersistence.findByC(serviceContext.getCompanyId());
		List<String> result = new ArrayList<String>();
		for (DictCollection c : collects) {
			result.add(c.getName());
		}
		
		return result;
	}
	
	public List<String> getAllDictCollectionNames(long companyId) throws SystemException {
		Collection<DictCollection> collects = dictCollectionPersistence.findByC(companyId);
		List<String> result = new ArrayList<String>();
		for (DictCollection c : collects) {
			result.add(c.getName());
		}
		
		return result;
	}	
	/* Like Name */
	public int countDictCollectionByName(String name, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.countByC_N(serviceContext.getCompanyId(), name);
	}

	public List<DictCollection> getByName(String name, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.findByC_N(serviceContext.getCompanyId(), name);
	}
	
	public List<DictCollection> getByLikeName(String name, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.findByC_N(serviceContext.getCompanyId(), name, startIndex, endIndex);
	}
	
	/* Like Group Name */
	public int countDictCollectionByGroupName(String name, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.countByC_N(serviceContext.getScopeGroupId(), name);
	}

	public List<DictCollection> getByGroupName(String name, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.findByC_N(serviceContext.getScopeGroupId(), name);
	}
	
	public List<DictCollection> getByGroupName(String name, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.findByC_N(serviceContext.getScopeGroupId(), name, startIndex, endIndex);
	}
	
	/* Like Name Status*/
	public int countDictCollectionByNameStatus(String name,int status, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.countByC_N_S(serviceContext.getCompanyId(), name, status);
	}

	public List<DictCollection> getByNameStatus(String name, int status, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.findByC_N_S(serviceContext.getCompanyId(), name, status);
	}
	
	public List<DictCollection> getByNameStatus(String name, int status, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.findByC_N_S(serviceContext.getCompanyId(), name, status, startIndex, endIndex);
	}
	
	/* Like Group Name Status*/
	public int countDictCollectionByGroupNameStatus(String name,int status, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.countByC_N_S(serviceContext.getScopeGroupId(), name, status);
	}

	public List<DictCollection> getByGroupNameStatus(String name, int status, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.findByC_N_S(serviceContext.getScopeGroupId(), name, status);
	}
	
	public List<DictCollection> getByGroupNameStatus(String name, int status, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return dictCollectionPersistence.findByC_N_S(serviceContext.getScopeGroupId(), name, status, startIndex, endIndex);
	}
	
	private static Log _log = LogFactoryUtil.getLog(DictCollectionLocalServiceImpl.class);
	

	public List<DictCollection> findByLikeName(String name, int start, int end, ServiceContext serviceContext) throws SystemException {
		return dictCollectionFinder.findByLikeName(name, start, end, serviceContext);
	}
	
	public int countLikeByName(String name, ServiceContext serviceContext) throws SystemException {
		return dictCollectionFinder.countByLikeName(name, serviceContext);
	}	

	public List<DictCollection> findByCustomCondition(String name, String version, Date validatedFrom, Date validatedTo, int status, int start, int end, ServiceContext serviceContext) throws SystemException {
		return dictCollectionFinder.findByCustomCondition(name, version, validatedFrom, validatedTo, status, start, end, serviceContext);
	}
	
	public int countByCustomCondition(String name, String version, Date validatedFrom, Date validatedTo, int status, ServiceContext serviceContext) throws SystemException {
		return dictCollectionFinder.countByCustomCondition(name, version, validatedFrom, validatedTo, status, serviceContext);
	}	

}