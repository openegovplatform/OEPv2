package org.oep.datamgt.action;

import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;

import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;



import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

public class ConfigurationActionImpl extends DefaultConfigurationAction {

	@Override
	public void processAction(
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse)
		throws Exception {

		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		if (!cmd.equals(Constants.UPDATE)) {
			return;
		}

	//	ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
//			WebKeys.THEME_DISPLAY);

		//ShoppingPreferences preferences = ShoppingPreferences.getInstance(
		//	themeDisplay.getCompanyId(), themeDisplay.getScopeGroupId());
//
//		String tabs2 = ParamUtil.getString(actionRequest, "tabs2");
//		String tabs3 = ParamUtil.getString(actionRequest, "tabs3");

		
	}
}

	