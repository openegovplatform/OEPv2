package org.oep.core.utilities.dossiermgt.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.oep.core.dossiermgt.model.DocTemplate;
import org.oep.core.dossiermgt.service.DocTemplateLocalServiceUtil;
import org.oep.core.utilities.dossiermgt.DocTemplateKeys;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextThreadLocal;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class DocTemplatePortlet
 */
public class DocTemplatePortlet extends MVCPortlet {
 
	public void addDocTemplate(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortletException {
		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
		try {
			String templateNo = ParamUtil.getString(actionRequest, "templateNo");
			String title = ParamUtil.getString(actionRequest, "title");
			String enTitle = ParamUtil.getString(actionRequest, "enTitle");
			String _uuid = ParamUtil.getString(actionRequest, "fileEntryUuid");
			DLFileEntry fileEntry = DLFileEntryLocalServiceUtil.getFileEntryByUuidAndGroupId(_uuid, serviceContext.getScopeGroupId());
			DocTemplate docTemplate = DocTemplateLocalServiceUtil.addDocTemplate(templateNo, title, enTitle, fileEntry.getFileEntryId(), serviceContext);
			
			if (docTemplate != null) {
				SessionMessages.add(actionRequest.getPortletSession(), DocTemplateKeys.SuccessMessageKeys.ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_DOCTEMPLATE_SUCCESS_ADDNEW);
				_log.info("doc template have been added successfylly");
			} else {
				_log.error("There is an Erron in adding doc template");
			}
			actionResponse.setRenderParameter("mvcPath",
					"/html/dossiermgt/portlet/doctemplate/edit_doctemplate.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateDocTemplate(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortletException {
		try {
			ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
			long docTemplateId = ParamUtil.getLong(actionRequest, "docTemplateId");
			String templateNo = ParamUtil.getString(actionRequest, "templateNo");
			String title = ParamUtil.getString(actionRequest, "title");
			String enTitle = ParamUtil.getString(actionRequest, "enTitle");
			String _uuid = ParamUtil.getString(actionRequest, "fileEntryUuid", "");
			DLFileEntry fileEntry = null;
			if (!"".equals(_uuid)) {
				fileEntry = DLFileEntryLocalServiceUtil.getFileEntryByUuidAndGroupId(_uuid, serviceContext.getScopeGroupId());				
			}
			DocTemplate docTemplate = DocTemplateLocalServiceUtil.getDocTemplate(docTemplateId);
			if (docTemplate != null) {
				if (fileEntry != null) {
					docTemplate = DocTemplateLocalServiceUtil.updateDocTemplate(docTemplateId, templateNo, title, enTitle, fileEntry.getFileEntryId(), serviceContext);					
				}
				else {
					docTemplate = DocTemplateLocalServiceUtil.updateDocTemplate(docTemplateId, templateNo, title, enTitle, docTemplate.getFileEntryId(), serviceContext);										
				}
				if (docTemplate != null) {
					SessionMessages.add(actionRequest.getPortletSession(), DocTemplateKeys.SuccessMessageKeys.ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_DOCTEMPLATE_SUCCESS_UPDATE);
					_log.info("doc template have been updated successfylly");
				} else {
					_log.error("There is an error in update doc template");
				}
			} else {
				_log.error("Could not find doc template.");
			}
			actionResponse.setRenderParameter("mvcPath",
					"/html/dossiermgt/portlet/doctemplate/list_doctemplate.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteDocTemplate(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortletException {
		try {
			long docTemplateId = ParamUtil.getLong(actionRequest, "docTemplateId");
			DocTemplateLocalServiceUtil.deleteDocTemplate(docTemplateId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DocTemplatePortlet.class);
	
}
