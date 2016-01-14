package org.oep.usermgt.util;

import java.util.ArrayList;
import java.util.List;

import org.oep.usermgt.dto.SelectionDataDTO;
import org.oep.usermgt.model.WorkingUnit;
import org.oep.usermgt.service.WorkingUnitLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Group;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
public class CustomAUIUtil {

	public static ArrayList<SelectionDataDTO> getListGroup(long id, long companyId){
		ArrayList<SelectionDataDTO> myList = new ArrayList<SelectionDataDTO>();
		ArrayList<SelectionDataDTO> groupsLuu = new ArrayList<SelectionDataDTO>();
		try {
			int count = GroupLocalServiceUtil.getGroupsCount();
			List<Group>  groupList = GroupLocalServiceUtil.getGroups(0, count);
			for (int index = 0; index < groupList.size();index++){
				if (groupList.get(index).isSite()){
					SelectionDataDTO tg = new SelectionDataDTO();
					tg.setId(groupList.get(index).getGroupId());
					tg.setName(groupList.get(index).getDescriptiveName());
					tg.setParent(groupList.get(index).getParentGroupId());
					if (groupList.get(index).getParentGroupId() != 0){
						boolean f = true;
						for (int k = 0; k < myList.size(); k++){
							if (tg.getParent() == myList.get(k).getId()){
								tg.setLevel(myList.get(k).getLevel()+1);
								myList.add(k+1,tg);
								f = false;
								break;
							}
						}
						if (f){
							tg.setLevel(0);
							groupsLuu.add(tg);
						}
					}else {
						tg.setLevel(0);
						myList.add(tg);
					}
					
				}
			}
			for (int index = 0; index < groupsLuu.size();index++){
				boolean f = true;
				for (int k = 0; k < myList.size(); k++){
					if (groupsLuu.get(index).getParent() == myList.get(k).getId()){
						groupsLuu.get(index).setLevel(myList.get(k).getLevel()+1);
						myList.add(k+1,groupsLuu.get(index));
						f = false;
						break;
					}
				}
				if (f){
					myList.add(groupsLuu.get(index));
				}
			}
			
		} catch (SystemException | PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myList;
	}
	
	public static ArrayList<SelectionDataDTO> getListWorkingUnit(ServiceContext serviceContext){
		ArrayList<SelectionDataDTO> myList = new ArrayList<SelectionDataDTO>();
		ArrayList<SelectionDataDTO> groupsLuu = new ArrayList<SelectionDataDTO>();
		try {
			List<WorkingUnit> dsWorkingUnit = WorkingUnitLocalServiceUtil.getByCompany(serviceContext);
			for (int index = 0; index < dsWorkingUnit.size();index++){
					SelectionDataDTO tg = new SelectionDataDTO();
					tg.setId(dsWorkingUnit.get(index).getWorkingUnitId());
					tg.setName(dsWorkingUnit.get(index).getName());
					tg.setParent(dsWorkingUnit.get(index).getParentWorkingUnitId());
					if (dsWorkingUnit.get(index).getParentWorkingUnitId() != 0){
						boolean f = true;
						for (int k = 0; k < myList.size(); k++){
							if (tg.getParent() == myList.get(k).getId()){
								tg.setLevel(myList.get(k).getLevel()+1);
								myList.add(k+1,tg);
								f = false;
								break;
							}
						}
						if (f){
							tg.setLevel(0);
							groupsLuu.add(tg);
						}
					}else {
						tg.setLevel(0);
						myList.add(tg);
					}
					
				}
		
			for (int index = 0; index < groupsLuu.size();index++){
				boolean f = true;
				for (int k = 0; k < myList.size(); k++){
					if (groupsLuu.get(index).getParent() == myList.get(k).getId()){
						groupsLuu.get(index).setLevel(myList.get(k).getLevel()+1);
						myList.add(k+1,groupsLuu.get(index));
						f = false;
						break;
					}
				}
				if (f){
					myList.add(groupsLuu.get(index));
				}
			}
			
		} catch (SystemException | PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myList;
	}
}
