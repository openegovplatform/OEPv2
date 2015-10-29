package org.oep.core.datamgt.action;

import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.util.PortletKeys;



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

	