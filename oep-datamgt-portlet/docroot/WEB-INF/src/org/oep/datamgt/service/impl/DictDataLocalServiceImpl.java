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

package org.oep.datamgt.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.oep.datamgt.DictCollectionNameException;
import org.oep.datamgt.DictDataDataCodeException;
import org.oep.datamgt.model.DictData;
import org.oep.datamgt.service.base.DictDataLocalServiceBaseImpl;
import org.oep.datamgt.service.impl.DictDataLocalServiceImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the dictionary data local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.datamgt.service.DictDataLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NQMINH
 * @see org.oep.datamgt.service.base.DictDataLocalServiceBaseImpl
 * @see org.oep.datamgt.service.DictDataLocalServiceUtil
 */
public class DictDataLocalServiceImpl extends DictDataLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.datamgt.service.DictDataLocalServiceUtil} to access the dictionary data local service.
	 */
	/** 
	 * comment for function
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  18-September-2015  trungdk    Create new
	 * @param
	 * @return:
	 */

	public DictData addDictData(String collectionName, String dataCode, String node_1, String node_2, String node_3, String node_4, String node_5, int dataLevel, String title, String description, Date validatedFrom, Date validatedTo, int status, ServiceContext serviceContext) throws SystemException, PortalException {
		validate(collectionName, dataCode, title, status);
		long id = counterLocalService.increment();
		DictData dictData = dictDataPersistence.create(id);
		Date now = new Date();
		
		dictData.setCollectionName(collectionName);
		dictData.setDataCode(dataCode);
		dictData.setNode_1(node_1);
		dictData.setNode_2(node_2);
		dictData.setNode_3(node_3);
		dictData.setNode_4(node_4);
		dictData.setNode_5(node_5);
		dictData.setDataLevel(dataLevel);
		dictData.setTitle(title);
		dictData.setDescription(description);
		dictData.setStatus(status);
		
		dictData.setCompanyId(serviceContext.getCompanyId());
		dictData.setGroupId(serviceContext.getScopeGroupId());
		dictData.setUserId(serviceContext.getUserId());
		dictData.setCreateDate(serviceContext.getCreateDate(now));
		dictData.setValidatedFrom(validatedFrom);
		dictData.setValidatedTo(validatedTo);
		
		dictDataPersistence.update(dictData);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dict data " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDictDataResources(dictData, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDictDataResources(dictData, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDictData(id);
	}
	

	public DictData updateDictData(long id, String collectionName, String dataCode, String node_1, String node_2, String node_3, String node_4, String node_5, int dataLevel, String title, String description, Date validatedFrom, Date validatedTo, int status, ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate(collectionName, dataCode, title, status);

		DictData dictData = dictDataPersistence.findByPrimaryKey(id);

		dictData.setModifiedDate(serviceContext.getModifiedDate(null));
		dictData.setCollectionName(collectionName);
		dictData.setDataCode(dataCode);
		dictData.setNode_1(node_1);
		dictData.setNode_2(node_2);
		dictData.setNode_3(node_3);
		dictData.setNode_4(node_4);
		dictData.setNode_5(node_5);
		dictData.setDataLevel(dataLevel);
		dictData.setTitle(title);
		dictData.setDescription(description);
		dictData.setStatus(status);
		dictData.setValidatedFrom(validatedFrom);
		dictData.setValidatedTo(validatedTo);
		
		dictDataPersistence.update(dictData);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDictDataResources(
				dictData, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDictData(dictData.getDictDataId());
	}

	public DictData saveDictData(DictData dictData, ServiceContext serviceContext) throws PortalException, SystemException {
		return updateDictData(dictData.getDictDataId(), dictData.getCollectionName(), dictData.getDataCode(), dictData.getNode_1(), dictData.getNode_2(), dictData.getNode_3(), dictData.getNode_4(), dictData.getNode_5(), dictData.getDataLevel(), dictData.getTitle(), dictData.getDescription(), dictData.getValidatedFrom(), dictData.getValidatedTo(), dictData.getStatus(), serviceContext);
	}
	
	public void updateDictDataResources(
			DictData dictData, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dictData.getCompanyId(), serviceContext.getGuestOrUserId(),
			DictData.class.getName(), dictData.getDictDataId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDictData(DictData dictData) throws PortalException, SystemException {
		dictDataPersistence.remove(dictData);
		resourceLocalService.deleteResource(dictData.getCompanyId(), DictData.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dictData.getDictDataId());
	}
	
	public void removeDictData(long id) throws PortalException, SystemException {
		DictData dictData = dictDataPersistence.findByPrimaryKey(id);
		removeDictData(dictData);
	}
	
	public DictData getDictData(long id) throws PortalException, SystemException {
		return dictDataPersistence.findByPrimaryKey(id);
	}

	public void addDictDataResources(DictData dictData, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dictData.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DictData.class.getName(), dictData.getDictDataId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDictDataResources(DictData dictData, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dictData.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DictData.class.getName(), dictData.getDictDataId(), groupPermissions, guestPermissions);
	}
	
	public void addDictDataResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DictData dictData = dictDataPersistence.findByPrimaryKey(id);
		addDictDataResources(dictData, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate(String collectionName, String dataCode, String title, int status) throws PortalException {
		if (Validator.isNull(collectionName)) {
			throw new DictCollectionNameException();
		}
		if (Validator.isNull(dataCode)) {
			throw new DictDataDataCodeException();
		}
	}
	
	/* CollectionName */
	public int countDictDataByCollectionName(String collectionName, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.countByC_CN(serviceContext.getCompanyId(), collectionName);
	}
	
	public List<DictData> getByCollectionName(String collectionName, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.findByC_CN(serviceContext.getCompanyId(), collectionName);
	}
	
	public List<DictData> getByCollectionName(String collectionName, int start, int end, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.findByC_CN(serviceContext.getCompanyId(), collectionName, start, end);
	}
	
	/* Group CollectionName */
	public int countDictDataByGroupCollectionName(String collectionName, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.countByG_CN(serviceContext.getScopeGroupId(), collectionName);
	}
	
	public List<DictData> getByGroupCollectionName(String collectionName, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.findByG_CN(serviceContext.getScopeGroupId(), collectionName);
	}
	
	public List<DictData> getByGroupCollectionName(String collectionName, int start, int end, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.findByC_CN(serviceContext.getScopeGroupId(), collectionName, start, end);
	}
	
	/* CollectionNam DataLevel */
	public int countDictDataByCollectionNameDataLevel(String collectionName, int dataLevel, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.countByC_CN_DL(serviceContext.getCompanyId(), collectionName, dataLevel);
	}
	
	public List<DictData> getByCollectionNameDataLevel(String collectionName, int dataLevel, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.findByC_CN_DL(serviceContext.getCompanyId(), collectionName, dataLevel);
	}
	
	public List<DictData> getByCollectionNameDataLevel(String collectionName, int dataLevel, int start, int end, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.findByC_CN_DL(serviceContext.getCompanyId(), collectionName, dataLevel,start,end);
	}
	
	/*Group CollectionNam DataLevel */
	public int countDictDataByGroupCollectionNameDataLevel(String collectionName, int dataLevel, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.countByG_CN_DL(serviceContext.getScopeGroupId(), collectionName, dataLevel);
	}
	
	public List<DictData> getByGroupCollectionNameDataLevel(String collectionName, int dataLevel, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.findByG_CN_DL(serviceContext.getScopeGroupId(), collectionName, dataLevel);
	}
	
	public List<DictData> getByGroupCollectionNameDataLevel(String collectionName, int dataLevel, int start, int end, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.findByG_CN_DL(serviceContext.getScopeGroupId(), collectionName, dataLevel,start,end);
	}
	/* DataLevel */
	public int countDictDataByByDataLevel(int dataLevel, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.countByC_DL(serviceContext.getCompanyId(), dataLevel);
	}
	
	public List<DictData> getByDataLevel(int dataLevel, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.findByC_DL(serviceContext.getCompanyId(), dataLevel);
	}
	
	public List<DictData> getByDataLevel(int dataLevel,int start, int end, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.findByC_DL(serviceContext.getCompanyId(), dataLevel,start,end);
	}
	
	/* Group DataLevel */
	public int countDictDataByByGroupDataLevel(int dataLevel, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.countByG_DL(serviceContext.getScopeGroupId(), dataLevel);
	}
	
	public List<DictData> getByGroupDataLevel(int dataLevel, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.findByG_DL(serviceContext.getScopeGroupId(), dataLevel);
	}
	
	public List<DictData> getByGroupDataLevel(int dataLevel,int start, int end, ServiceContext serviceContext) throws PortalException, SystemException {
		return dictDataPersistence.findByG_DL(serviceContext.getScopeGroupId(), dataLevel,start,end);
	}
	
	public List<DictData> findByDataCodeParent(String dataCode,String collectionName, String dataCodeParent, int datalevel,int status, ServiceContext serviceContext) throws SystemException {
		return dictDataFinder.findByCustomCondition(dataCode, collectionName, dataCodeParent, datalevel, null, null, status, serviceContext);
	}
	
	public List<DictData> findByGroupDataCodeParent(String dataCode,String collectionName, String dataCodeParent, int datalevel, int status,ServiceContext serviceContext) throws SystemException {
		return dictDataFinder.findByGroupCustomCondition(dataCode, collectionName, dataCodeParent, datalevel, null, null, status, serviceContext);
	}
	
	public List<DictData> findByCustomCondition(String dataCode,String collectionName, String dataCodeParent, int datalevel,Date validatedFrom, Date validatedTo,int status, ServiceContext serviceContext) throws SystemException {
		return dictDataFinder.findByCustomCondition(dataCode, collectionName, dataCodeParent, datalevel, validatedFrom, validatedTo, status, serviceContext);
	}
	
	public List<DictData> findByGroupCustomCondition(String dataCode,String collectionName, String dataCodeParent, int datalevel,Date validatedFrom, Date validatedTo, int status,ServiceContext serviceContext) throws SystemException {
		return dictDataFinder.findByCustomCondition(dataCode, collectionName, dataCodeParent, datalevel, validatedFrom, validatedTo, status, serviceContext);
	}
	
	/* DataLevel DataCode Theo node  DataLevel - 1*/
	public int countDictDataByDataLevelDataCode(String dataCode,String collectionName, String dataCodeParent, int datalevel,ServiceContext serviceContext) throws SystemException {
		return dictDataFinder.countByDataLevelDataCode(dataCode, collectionName, dataCodeParent, datalevel, serviceContext);
	}
	
	public List<DictData> findByDataLevelDataCode(String dataCode,String collectionName, String dataCodeParent, int datalevel,ServiceContext serviceContext) throws SystemException {
		return dictDataFinder.findByDataLevelDataCode(dataCode, collectionName, dataCodeParent, datalevel, serviceContext);
	}
	
	public List<DictData> findByDataLevelDataCode(String dataCode,String collectionName, String dataCodeParent, int datalevel,int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return dictDataFinder.findByDataLevelDataCode(dataCode, collectionName, dataCodeParent, datalevel, startIndex, endIndex, serviceContext);
	}
	
	public List<DictData> getByCollectionNameTree (String collectionName,int dataLevel, ServiceContext serviceContext) throws SystemException {
		ArrayList<DictData> kq = new ArrayList<DictData>();
		
		List<DictData> luu = dictDataPersistence.findByC_CN_DL(serviceContext.getCompanyId(), collectionName, 1);
		int i = 0;
		// System.out.println("  " + luu.size() + " " + serviceContext.getCompanyId() + " " + collectionName);
		 kq.addAll(luu);
		 while (i < kq.size()){ 
			 //System.out.println("  " + kq.size() + " " +kq.get(i).getTitle());
			 
			 List<DictData> tg = this.findByDataCodeParent("", collectionName, kq.get(i).getDataCode(), kq.get(i).getDataLevel(), 1, serviceContext);
			 i++;
			 //kq.add(luu.get(0));
		///	 System.out.println("  " + tg.size());
			 if (tg.size() > 0)  kq.addAll(i, tg);
		 }
		return kq;
	}
	private static Log _log = LogFactoryUtil.getLog(DictDataLocalServiceImpl.class);
}