package org.oep.usermgt.action;

import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;


import org.oep.usermgt.action.JobPosKeys;
import org.oep.usermgt.action.PortletKeys;
import org.oep.usermgt.model.JobPos;
import org.oep.usermgt.service.JobPosLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextThreadLocal;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;


public class JobPosPortlet extends MVCPortlet {
	
	public void addEdit(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException, IOException {

		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal
					.getServiceContext();
			UploadRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(request);
			String title = ParamUtil.getString(uploadRequest,JobPosKeys.AddEditAttributes.TITLE, PortletKeys.TEXT_BOX);
			String positionCatNo = ParamUtil.getString(uploadRequest,JobPosKeys.AddEditAttributes.POSITIONCATNO, PortletKeys.TEXT_BOX);
			long workingUnitId = ParamUtil.getLong(uploadRequest,JobPosKeys.AddEditAttributes.WORKINGUNITID);
			int leader = ParamUtil.getInteger(uploadRequest,JobPosKeys.AddEditAttributes.LEADER);
			Long editId = ParamUtil.getLong(uploadRequest,
					JobPosKeys.AddEditAttributes.EDIT_ID,
					PortletKeys.LONG_DEFAULT);

			// Date pingTime = new Date();
			if (editId == PortletKeys.LONG_DEFAULT) {
				JobPosLocalServiceUtil.addJobPos(title, positionCatNo, workingUnitId, leader, serviceContext);
				//System.out.println(" sssss  " + name + " " + address);
			} else {
				JobPos jobPos = JobPosLocalServiceUtil
						.getJobPos(editId);
			
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

	public void delete(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException {
		long deleteId = ParamUtil.getLong(request,
				JobPosKeys.BaseJobPosAttributes.DELETE_ID,
				PortletKeys.LONG_DEFAULT);

		JobPosLocalServiceUtil.removeJobPos(deleteId);

		response.sendRedirect(ParamUtil.getString(request,
				PortletKeys.REDIRECT_PAGE));
	}

	public void edit(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException {
		long editId = ParamUtil.getLong(request,
				JobPosKeys.BaseJobPosAttributes.EDIT_ID,
				PortletKeys.LONG_DEFAULT);

		JobPos application = JobPosLocalServiceUtil
				.getJobPos(editId);
		setParameterIntoResponse(response, application);

		if (!SessionErrors.isEmpty(request)) {
			response.sendRedirect(ParamUtil.getString(request,
					PortletKeys.REDIRECT_PAGE));
		} else {
			PortalUtil.copyRequestParameters(request, response);
		}
	}

	private void setParameterIntoResponse(ActionResponse response,
			JobPos jobPos) {
		response.setRenderParameter(JobPosKeys.AddEditAttributes.TITLE,String.valueOf(jobPos.getTitle()));
		response.setRenderParameter(JobPosKeys.AddEditAttributes.POSITIONCATNO,String.valueOf(jobPos.getPositionCatNo()));
		response.setRenderParameter(JobPosKeys.AddEditAttributes.WORKINGUNITID,String.valueOf(jobPos.getWorkingUnitId()));
		response.setRenderParameter(JobPosKeys.AddEditAttributes.LEADER,String.valueOf(jobPos.getLeader()));

	}

	public void search(ActionRequest request, ActionResponse response) {

	}

	

	private static Log _log = LogFactoryUtil.getLog(JobPosPortlet.class);
}