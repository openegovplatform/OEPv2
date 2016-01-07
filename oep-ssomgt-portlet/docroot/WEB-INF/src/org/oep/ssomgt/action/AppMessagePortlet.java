package org.oep.ssomgt.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.oep.ssomgt.NoSuchApplicationException;
import org.oep.ssomgt.model.AppRole;
import org.oep.ssomgt.model.AppRole2Employee;
import org.oep.ssomgt.model.Application;
import org.oep.ssomgt.service.AppRole2EmployeeLocalServiceUtil;
import org.oep.ssomgt.service.AppRoleLocalServiceUtil;
import org.oep.ssomgt.service.ApplicationLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextThreadLocal;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AppMessagePortlet
 */
public class AppMessagePortlet extends MVCPortlet {
	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		String fromApplication = ParamUtil.getString(resourceRequest, AppMessageKeys.SearchAttributes.FROM_APPLICATION, PortletKeys.TEXT_BOX);
		ServiceContext serviceContext = ServiceContextThreadLocal
				.getServiceContext();
		List<AppRole> lstAppRoles = new ArrayList<AppRole>();
		try {
			Application app = ApplicationLocalServiceUtil.getByAppCode(fromApplication);
			lstAppRoles = AppRoleLocalServiceUtil.findByCompanyGroupApplication(app.getApplicationId(), serviceContext);
		} catch (NoSuchApplicationException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} catch (SystemException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
				
		JSONArray lstUser = JSONFactoryUtil.getJSONFactory().createJSONArray();
		long[] appRoleIds = new long[lstAppRoles.size()];
		List<AppRole2Employee> lstA2E = new ArrayList<AppRole2Employee>(); 
		for (int i = 0; i < lstAppRoles.size(); i++) {
			appRoleIds[i] = lstAppRoles.get(i).getAppRoleId();
		}
		
		try {
			lstA2E = AppRole2EmployeeLocalServiceUtil.findByArrayOfAppRole(appRoleIds, serviceContext);
		} catch (SystemException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		for (AppRole2Employee a2e : lstA2E) {
			JSONObject jsonObject = JSONFactoryUtil
								.createJSONObject(); 
			User user;
			try {
				user = UserLocalServiceUtil.getUser(a2e.getUserId());
				jsonObject.put("screenName", user.getScreenName());
				jsonObject.put("userId", user.getUserId());
				lstUser.put(jsonObject);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		resourceResponse.setContentType("application/json");
		resourceResponse.setCharacterEncoding("UTF-8");
		resourceResponse.getWriter().write(lstUser.toString());
	}
}
