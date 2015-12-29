package org.oep.usermgt.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.oep.usermgt.action.WorkingUnitKeys;
import org.oep.usermgt.action.PortletKeys;
import org.oep.usermgt.model.JobPos;
import org.oep.usermgt.model.WorkingUnit;
import org.oep.usermgt.service.JobPos2RoleLocalServiceUtil;
import org.oep.usermgt.service.JobPosLocalServiceUtil;
import org.oep.usermgt.service.WorkingUnitLocalServiceUtil;
import org.oep.usermgt.util.ManagerLdap;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.User;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextThreadLocal;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import org.oep.datamgt.service.DictDataLocalServiceUtil;
import org.oep.datamgt.model.DictData;

public class WorkingUnitPortlet extends MVCPortlet {
	/*
	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
			String textSearch = ParamUtil.getString(request,
					WorkingUnitKeys.BaseWorkingUnitAttributes.TEXTSEARCH,
					PortletKeys.TEXT_BOX);
			String thu = ParamUtil.getString(request,"test",
					PortletKeys.TEXT_BOX);
			System.out.println(" ssss  " + textSearch);
			System.out.println(" ssss 1 " + thu);
			super.render(request, response);
				GroupConstants.
	}
*/
	public void addEdit(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException, IOException {

		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal
					.getServiceContext();
			UploadRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(request);
			String govAgencyId = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.GOVAGENCYID,
					PortletKeys.TEXT_BOX);
			String name = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.NAME,
					PortletKeys.TEXT_BOX);
			String enName = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.ENNAME,
					PortletKeys.TEXT_BOX);
			long parentWorkingUnitId = ParamUtil.getLong(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.PARENTWORKINGUNITID);
			long organizationId = ParamUtil.getLong(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.ORGANIZATIONID);
			String address = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.ADDRESS,
					PortletKeys.TEXT_BOX);
			String cityNo = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.CITYNO,
					PortletKeys.TEXT_BOX);
			
			String cityName = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.CITYNAME,
					PortletKeys.TEXT_BOX);
			if (cityNo != null && !cityNo.equals("") && (cityName == null || cityName.equals(""))){
				cityName = cityNo.split(":")[1];
				cityNo = cityNo.split(":")[0];
			}
			String districtNo = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.DISTRICTNO,
					PortletKeys.TEXT_BOX);
			String districtName = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.DISTRICTNAME,
					PortletKeys.TEXT_BOX);
			if (districtNo != null && !districtNo.equals("") && (districtName == null || districtName.equals(""))){
				districtName = districtNo.split(":")[1];
				districtNo = districtNo.split(":")[0];
			}
			String wardNo = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.WARDNO,
					PortletKeys.TEXT_BOX);
			String wardName = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.WARDNAME,
					PortletKeys.TEXT_BOX);
			if (wardNo != null && !wardNo.equals("") && (wardName == null || wardName.equals(""))){
				wardName = wardNo.split(":")[1];
				wardNo = wardNo.split(":")[0];
			}
			String gpsPosition = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.GPSPOSITION,
					PortletKeys.TEXT_BOX);
			String telNo = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.TELNO,
					PortletKeys.TEXT_BOX);
			String fax = ParamUtil
					.getString(uploadRequest,
							WorkingUnitKeys.AddEditAttributes.FAX,
							PortletKeys.TEXT_BOX);
			String email = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.EMAIL,
					PortletKeys.TEXT_BOX);
			String website = ParamUtil.getString(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.WEBSITE,
					PortletKeys.TEXT_BOX);
			long  localSiteId = ParamUtil.getLong(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.LOCALSITEID);
			int  isEmployer = 0;
			if (ParamUtil.getBoolean(uploadRequest,WorkingUnitKeys.AddEditAttributes.ISEMPLOYER, PortletKeys.CHECK_BOX)){
				System.out.println(ParamUtil.getBoolean(uploadRequest,WorkingUnitKeys.AddEditAttributes.ISEMPLOYER, PortletKeys.CHECK_BOX));
				isEmployer = 1;
			}
			long editId = ParamUtil.getLong(uploadRequest,
					WorkingUnitKeys.AddEditAttributes.EDIT_ID,
					PortletKeys.LONG_DEFAULT);
			
			if (organizationId == PortletKeys.LONG_DEFAULT){
				
				//Organization og = OrganizationLocalServiceUtil.addOrganization
				//		(serviceContext.getUserId(),
				//		0,	name, "regular-organization",  
				//		0, 	0, 0,"",true, serviceContext);
				//organizationId = og.getOrganizationId();
						
			}
			// Date pingTime = new Date();
			if (editId == PortletKeys.LONG_DEFAULT) {
				WorkingUnitLocalServiceUtil.addWorkingUnit(organizationId,
						govAgencyId, name, enName, parentWorkingUnitId,
						address, cityNo, cityName, districtNo, districtName,
						wardNo, wardName, gpsPosition, telNo, fax, email,
						website,localSiteId,isEmployer, serviceContext);
				//System.out.println(" sssss  " + name + " " + address);
			} else {
				WorkingUnit workingUnit = WorkingUnitLocalServiceUtil
						.getWorkingUnit(editId);
				workingUnit.setOrganizationId(organizationId);
				workingUnit.setGovAgencyId(govAgencyId);
				workingUnit.setName(name);
				workingUnit.setEnName(enName);
				workingUnit.setParentWorkingUnitId(parentWorkingUnitId);
				workingUnit.setAddress(address);
				workingUnit.setCityNo(cityNo);
				workingUnit.setCityName(cityName);
				workingUnit.setDistrictNo(districtNo);
				workingUnit.setDistrictName(districtName);
				workingUnit.setWardNo(wardNo);
				workingUnit.setWardName(wardName);
				workingUnit.setGpsPosition(gpsPosition);
				workingUnit.setTelNo(telNo);
				workingUnit.setFax(fax);
				workingUnit.setEmail(email);
				workingUnit.setWebsite(website);
				workingUnit.setIsEmployer(isEmployer);
				workingUnit.setLocalSiteId(localSiteId);
				workingUnit.setOrganizationId(organizationId);
				WorkingUnitLocalServiceUtil.saveWorkingUnit(workingUnit,
						serviceContext);
			}
		}
		if (!SessionErrors.isEmpty(request)) {
			PortalUtil.copyRequestParameters(request, response);
		} else {
			response.sendRedirect(ParamUtil.getString(request,
					PortletKeys.REDIRECT_PAGE));
		}
	}

	public void delete(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException {
		long deleteId = ParamUtil.getLong(request,
				WorkingUnitKeys.BaseWorkingUnitAttributes.DELETE_ID,
				PortletKeys.LONG_DEFAULT);

		WorkingUnitLocalServiceUtil.removeWorkingUnit(deleteId);

		response.sendRedirect(ParamUtil.getString(request,
				PortletKeys.REDIRECT_PAGE));
	}
	

	public void edit(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException {
		long editId = ParamUtil.getLong(request,
				WorkingUnitKeys.BaseWorkingUnitAttributes.EDIT_ID,
				PortletKeys.LONG_DEFAULT);

		WorkingUnit application = WorkingUnitLocalServiceUtil
				.getWorkingUnit(editId);
		setParameterIntoResponse(response, application);

		if (!SessionErrors.isEmpty(request)) {
			response.sendRedirect(ParamUtil.getString(request,
					PortletKeys.REDIRECT_PAGE));
		} else {
			PortalUtil.copyRequestParameters(request, response);
		}
	}
	
	private void setParameterIntoResponse(ActionResponse response,
			WorkingUnit workingUnit) {
		response.setRenderParameter(
				WorkingUnitKeys.AddEditAttributes.ORGANIZATIONID,
				String.valueOf(workingUnit.getOrganizationId()));
		response.setRenderParameter(
				WorkingUnitKeys.AddEditAttributes.GOVAGENCYID,
				String.valueOf(workingUnit.getGovAgencyId()));
		response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.NAME,
				String.valueOf(workingUnit.getName()));
		response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.ENNAME,
				String.valueOf(workingUnit.getEnName()));
		response.setRenderParameter(
				WorkingUnitKeys.AddEditAttributes.PARENTWORKINGUNITID,
				String.valueOf(workingUnit.getParentWorkingUnitId()));
		response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.ADDRESS,
				String.valueOf(workingUnit.getAddress()));
		response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.LOCALSITEID,
				String.valueOf(workingUnit.getLocalSiteId()));
		response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.ISEMPLOYER,
				String.valueOf(workingUnit.getIsEmployer()==1));
		//response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.CITYNO,
		//		String.valueOf(workingUnit.getCityNo()));
		if (workingUnit.getCityNo() == null && workingUnit.getCityNo().equals("")){
			response.setRenderParameter(
					WorkingUnitKeys.AddEditAttributes.CITYNAME,"");
		}else {
		response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.CITYNAME,
				String.valueOf(workingUnit.getCityNo()+":" +workingUnit.getCityName()));
		}
	//	response.setRenderParameter(
	//			WorkingUnitKeys.AddEditAttributes.DISTRICTNO,
	//			String.valueOf(workingUnit.getDistrictNo()));
		if (workingUnit.getDistrictNo() == null && workingUnit.getDistrictNo().equals("")){
			response.setRenderParameter(
					WorkingUnitKeys.AddEditAttributes.DISTRICTNAME,"");
		}else {
			response.setRenderParameter(
					WorkingUnitKeys.AddEditAttributes.DISTRICTNAME,
					String.valueOf(workingUnit.getDistrictNo()+":"+workingUnit.getDistrictName()));
		}
		
//		response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.WARDNO,
//				String.valueOf(workingUnit.getWardNo()));
		if (workingUnit.getWardNo() == null && workingUnit.getWardNo().equals("")){
			response.setRenderParameter(
					WorkingUnitKeys.AddEditAttributes.WARDNAME,"");
		}else {
		response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.WARDNAME,
				String.valueOf(workingUnit.getWardNo()+":"+workingUnit.getWardName()));
		}
		response.setRenderParameter(
				WorkingUnitKeys.AddEditAttributes.GPSPOSITION,
				String.valueOf(workingUnit.getGpsPosition()));
		response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.TELNO,
				String.valueOf(workingUnit.getTelNo()));
		response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.FAX,
				String.valueOf(workingUnit.getFax()));
		response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.EMAIL,
				String.valueOf(workingUnit.getEmail()));
		response.setRenderParameter(WorkingUnitKeys.AddEditAttributes.WEBSITE,
				String.valueOf(workingUnit.getWebsite()));
	}

	public void testLdap(ActionRequest request, ActionResponse response) throws Exception{
		ManagerLdap tg = new ManagerLdap();
		User user = UserLocalServiceUtil.getUser(30115);
		ServiceContext serviceContext = ServiceContextThreadLocal
				.getServiceContext();
		//tg.ExportToLdap(serviceContext, user);//(serviceContext,user);
	//	tg.look();
		if (!SessionErrors.isEmpty(request)) {
			response.sendRedirect(ParamUtil.getString(request,
					PortletKeys.REDIRECT_PAGE));
		} else {
			PortalUtil.copyRequestParameters(request, response);
		}
	}
	
	
	
	public void search(ActionRequest request, ActionResponse response) {

	}

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		String action = ParamUtil.getString(resourceRequest, "selectAction");
		ServiceContext serviceContext = ServiceContextThreadLocal
				.getServiceContext();
		if (action.equalsIgnoreCase("citySelected")) {
			String cityNo = ParamUtil.getString(resourceRequest,
					WorkingUnitKeys.AddEditAttributes.CITYNO);
			JSONArray districtNoList = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			
			List<DictData> districtList = new ArrayList<DictData>();
			try {
				if (cityNo != null && !cityNo.equals("")) {
					//_log.error("SystemException  + " + cityNo);
					districtList = DictDataLocalServiceUtil
							.findByDataLevelDataCode("",
									"OEP_ADMINISTRATIVE_REGION", cityNo.split(":")[0], 2,
									serviceContext);

					for (DictData districtObj : districtList) {
						JSONObject jsonObject = JSONFactoryUtil
								.createJSONObject(); 
						jsonObject.put("districtCode",
								districtObj.getDataCode()+":"+districtObj.getTitle());
						jsonObject.put("districtName", districtObj.getTitle());
						districtNoList.put(jsonObject);
						// districtNoList.put( + ":"
						// + );
					}
				}
			} catch (SystemException e) {
				_log.error("SystemException" + e);
			}
			jsonFeed.put("districtNameCode", districtNoList);
		}
		if (action.equalsIgnoreCase("districtSelected")) {
			String districtNo = ParamUtil.getString(resourceRequest,
					WorkingUnitKeys.AddEditAttributes.DISTRICTNO);
			JSONArray districtNoList = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();

			List<DictData> wardList = new ArrayList<DictData>();
			try {
				if (districtNo != null && !districtNo.equals("")) {
					wardList = DictDataLocalServiceUtil
							.findByDataLevelDataCode("",
									"OEP_ADMINISTRATIVE_REGION", districtNo.split(":")[0], 3,
									serviceContext);
					//_log.error("SystemException   " + districtNo + " "
					//		+ wardList.size());
					for (DictData districtObj : wardList) {
						JSONObject jsonObject = JSONFactoryUtil
								.createJSONObject(); // creating json object
														// parse the request
														// using json object

						jsonObject.put("wardCode", districtObj.getDataCode() + ":" + districtObj.getTitle());
						jsonObject.put("wardName", districtObj.getTitle());
						districtNoList.put(jsonObject);
						// districtNoList.put( + ":"
						// + );
					}
				}
			} catch (SystemException e) {
				_log.error("SystemException" + e);
			}
			jsonFeed.put("wardNameCode", districtNoList);
		}
		resourceResponse.setContentType("application/json");
		resourceResponse.setCharacterEncoding("UTF-8");
		resourceResponse.getWriter().write(jsonFeed.toString());
	}
	
	public void listChucDanh(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException {
		//long workingId = ParamUtil.getLong(request,
		//		WorkingUnitKeys.AddEditAttributes.WORKINGUNITID,
		//		PortletKeys.LONG_DEFAULT);
//
		//WorkingUnitLocalServiceUtil.removeWorkingUnit(deleteId);

		if (!SessionErrors.isEmpty(request)) {
			response.sendRedirect(ParamUtil.getString(request,
					PortletKeys.REDIRECT_PAGE));
		} else {
			PortalUtil.copyRequestParameters(request, response);
		}
	}
	public void listChucDanh1(ActionRequest request,
			ActionResponse response) throws PortletException, IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);
		System.out.println(" ----------- " +  themeDisplay.getPortletDisplay().getPortletName());
		String portletName = "jobposmanagement_WAR_oepusermgtportlet";
		String pageName = "/dichvucongtructuyen";
		//String portletName = "oepeserviceregisteronline_WAR_oepeserviceportlet";
		String dossierProcId = ParamUtil
				.getString(request, "dossierProcId", "");
		long plid = 0L;
		try {
			plid = LayoutLocalServiceUtil.getFriendlyURLLayout(
					themeDisplay.getScopeGroupId(), false, pageName).getPlid();
		} catch (Exception e) {
			e.printStackTrace();
		}
		long workingUnitId = ParamUtil
				.getLong(request, WorkingUnitKeys.BaseWorkingUnitAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);


		PortletURL redirectURL = PortletURLFactoryUtil.create(
				PortalUtil.getHttpServletRequest(request), portletName, themeDisplay.getPlid(),
				PortletRequest.RENDER_PHASE);
		redirectURL.setParameter(WorkingUnitKeys.BaseWorkingUnitAttributes.EDIT_ID, String.valueOf(workingUnitId)); 
		response.sendRedirect(redirectURL.toString());

	}
	public void listCanBo(ActionRequest request,
			ActionResponse response) throws PortletException, IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);
		//ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		String pageName = "/danh-sach-can-bo";
		String portletName = "employeemanagement_WAR_oepusermgtportlet";

		long plid = 0L;
		try {
			plid = LayoutLocalServiceUtil.getFriendlyURLLayout(
					themeDisplay.getScopeGroupId(), false, pageName).getPlid();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" ----------- " + pageName + "     " + themeDisplay.getPlid());
		
		long workingUnitId = ParamUtil
				.getLong(request, WorkingUnitKeys.BaseWorkingUnitAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);


		PortletURL redirectURL = PortletURLFactoryUtil.create(
				PortalUtil.getHttpServletRequest(request), portletName, plid,
				PortletRequest.RENDER_PHASE);
		redirectURL.setParameter(WorkingUnitKeys.BaseWorkingUnitAttributes.EDIT_ID, String.valueOf(workingUnitId)); 
		response.sendRedirect(redirectURL.toString());

	}
	public void addEditJobPos(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException, IOException {

		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal
					.getServiceContext();
			UploadRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(request);
			
			String title = ParamUtil.getString(uploadRequest,JobPosKeys.AddEditAttributes.TITLE, PortletKeys.TEXT_BOX);
			String positionCatNo = ParamUtil.getString(uploadRequest,JobPosKeys.AddEditAttributes.POSITIONCATNO, PortletKeys.TEXT_BOX);
			long workingUnitId = ParamUtil.getLong(uploadRequest,JobPosKeys.AddEditAttributes.WORKINGUNITID);
			long subWorkingUnitId = ParamUtil.getLong(uploadRequest,JobPosKeys.AddEditAttributes.SUBWORKINGUNITID);
			int leader = ParamUtil.getInteger(uploadRequest,JobPosKeys.AddEditAttributes.LEADER);
			
			Long editId = ParamUtil.getLong(uploadRequest,
					JobPosKeys.AddEditAttributes.EDIT_ID,
					PortletKeys.LONG_DEFAULT);
			//System.out.println(" sssss  " + title + " " + workingUnitId + " " + leader + " " + editId);
			// Date pingTime = new Date();
			if (editId == PortletKeys.LONG_DEFAULT) {
				JobPosLocalServiceUtil.addJobPos(title, positionCatNo, workingUnitId,subWorkingUnitId, leader, serviceContext);
				//System.out.println(" sssss  " + name + " " + address);
			} else {
				JobPos jobPos = JobPosLocalServiceUtil
						.getJobPos(editId);
				jobPos.setTitle(title);
				jobPos.setSubWorkingUnitId(subWorkingUnitId);
				jobPos.setPositionCatNo(positionCatNo);
				jobPos.setLeader(leader);
				JobPosLocalServiceUtil.saveJobPos(jobPos,
						serviceContext);
			}
		}
		if (!SessionErrors.isEmpty(request)) {
			PortalUtil.copyRequestParameters(request, response);
		} else {
			response.sendRedirect(ParamUtil.getString(request,
					PortletKeys.REDIRECT_PAGE));
		}
	}
	public void deleteJobPos(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException {
		long deleteId = ParamUtil.getLong(request,
				JobPosKeys.BaseJobPosAttributes.DELETE_ID,
				PortletKeys.LONG_DEFAULT);

		JobPosLocalServiceUtil.removeJobPos(deleteId);
	
		response.sendRedirect(ParamUtil.getString(request,
				PortletKeys.REDIRECT_PAGE));
	}

	public void editJobPos(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException {
		long editId = ParamUtil.getLong(request,
				JobPosKeys.BaseJobPosAttributes.EDIT_ID,
				PortletKeys.LONG_DEFAULT);

		JobPos application = JobPosLocalServiceUtil
				.getJobPos(editId);
		setParameterIntoResponseJobPos(response, application);

		if (!SessionErrors.isEmpty(request)) {
			response.sendRedirect(ParamUtil.getString(request,
					PortletKeys.REDIRECT_PAGE));
		} else {
			PortalUtil.copyRequestParameters(request, response);
		}
	}

	private void setParameterIntoResponseJobPos(ActionResponse response,
			JobPos jobPos) {
		response.setRenderParameter(JobPosKeys.AddEditAttributes.TITLE,String.valueOf(jobPos.getTitle()));
		response.setRenderParameter(JobPosKeys.AddEditAttributes.POSITIONCATNO,String.valueOf(jobPos.getPositionCatNo()));
		response.setRenderParameter(JobPosKeys.AddEditAttributes.SUBWORKINGUNITID,String.valueOf(jobPos.getSubWorkingUnitId()));
		response.setRenderParameter(JobPosKeys.AddEditAttributes.LEADER,String.valueOf(jobPos.getLeader()));
	}
	public void toNextPage(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException {
		//long workingId = ParamUtil.getLong(request,
		//		WorkingUnitKeys.AddEditAttributes.WORKINGUNITID,
		//		PortletKeys.LONG_DEFAULT);
//
		//WorkingUnitLocalServiceUtil.removeWorkingUnit(deleteId);

		if (!SessionErrors.isEmpty(request)) {
			response.sendRedirect(ParamUtil.getString(request,
					PortletKeys.REDIRECT_PAGE));
		} else {
			PortalUtil.copyRequestParameters(request, response);
		}
	}
	public void addEditJobPos2Role(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException, IOException {

		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal
					.getServiceContext();
			UploadRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(request);
			
			long roleId = ParamUtil.getLong(uploadRequest,JobPosKeys.AddEditAttributes.ROLEID);
			long jobPosId = ParamUtil.getLong(uploadRequest,JobPosKeys.AddEditAttributes.JOBPOSID);
			System.out.println(" sssss  " + roleId + " " + jobPosId);
			// Date pingTime = new Date();
			if (roleId != PortletKeys.LONG_DEFAULT && jobPosId !=  PortletKeys.LONG_DEFAULT) {
				JobPos2RoleLocalServiceUtil.addJobPos2Role(jobPosId, roleId, serviceContext);
				//System.out.println(" sssss  " + name + " " + address);
			} 
		}
		PortalUtil.copyRequestParameters(request, response);
		/*
		if (!SessionErrors.isEmpty(request)) {
			PortalUtil.copyRequestParameters(request, response);
		} else {
			response.sendRedirect(ParamUtil.getString(request,
					PortletKeys.REDIRECT_PAGE));
		}
		*/
	}
	public void deleteJobPos2Role(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException, IOException {

		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal
					.getServiceContext();
			UploadRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(request);
			
			long roleId = ParamUtil.getLong(uploadRequest,JobPosKeys.BaseJobPosAttributes.DELETE_ID);
			long jobPosId = ParamUtil.getLong(uploadRequest,JobPosKeys.AddEditAttributes.JOBPOSID);
			System.out.println(" sssss  " + roleId + " " + jobPosId);
			// Date pingTime = new Date();
			if (roleId != PortletKeys.LONG_DEFAULT && jobPosId !=  PortletKeys.LONG_DEFAULT) {
				JobPos2RoleLocalServiceUtil.removeJobPos2Role(jobPosId, roleId);//(jobPosId, roleId, serviceContext);
				//System.out.println(" sssss  " + name + " " + address);
			} 
		}
		PortalUtil.copyRequestParameters(request, response);
		/*
		if (!SessionErrors.isEmpty(request)) {
			PortalUtil.copyRequestParameters(request, response);
		} else {
			response.sendRedirect(ParamUtil.getString(request,
					PortletKeys.REDIRECT_PAGE));
		}
		*/
	}
	private static Log _log = LogFactoryUtil.getLog(WorkingUnitPortlet.class);
}
