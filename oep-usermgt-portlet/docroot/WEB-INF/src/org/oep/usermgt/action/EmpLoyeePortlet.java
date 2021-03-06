package org.oep.usermgt.action;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.oep.usermgt.model.Employee;
import org.oep.usermgt.model.WorkingUnit;
import org.oep.usermgt.service.EmployeeLocalServiceUtil;
import org.oep.usermgt.service.JobPos2RoleLocalServiceUtil;
import org.oep.usermgt.service.WorkingUnitLocalServiceUtil;
import org.oep.usermgt.util.ManagerLdap;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.ServiceContextThreadLocal;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class EmpLoyeePortlet extends MVCPortlet {
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
	}
*/
	@Override
	 public void init() throws PortletException {
	  super.init();
	  copyRequestParameters = true;
	 }
	public void addEdit(ActionRequest request, ActionResponse response)
			throws Exception {

		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal
					.getServiceContext();
			UploadRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(request);
			long mappingUserId = PortletKeys.LONG_DEFAULT; //ParamUtil.getLong(uploadRequest,EmployeeKeys.AddEditAttributes.MAPPINGUSERID, PortletKeys.LONG_DEFAULT);
			long workingUnitId = ParamUtil.getLong(uploadRequest,EmployeeKeys.AddEditAttributes.WORKINGUNITID, PortletKeys.LONG_DEFAULT);
			long mainJobPosId = ParamUtil.getLong(uploadRequest,EmployeeKeys.AddEditAttributes.MAINJOBPOSID, PortletKeys.LONG_DEFAULT);
			String employeeNo = ParamUtil.getString(uploadRequest,EmployeeKeys.AddEditAttributes.EMPLOYEENO, PortletKeys.TEXT_BOX);
			String personelDocNo = ParamUtil.getString(uploadRequest,EmployeeKeys.AddEditAttributes.PERSONELDOCNO, PortletKeys.TEXT_BOX);
			String fullName = ParamUtil.getString(uploadRequest,EmployeeKeys.AddEditAttributes.FULLNAME, PortletKeys.TEXT_BOX);
			int gender = ParamUtil.getInteger(uploadRequest,EmployeeKeys.AddEditAttributes.GENDER, PortletKeys.DELTA);
			boolean createUser = ParamUtil.getBoolean(uploadRequest,EmployeeKeys.AddEditAttributes.ISCREATUSER, PortletKeys.CHECK_BOX);
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date birthdate = ParamUtil.getDate(uploadRequest,EmployeeKeys.AddEditAttributes.BIRTHDATE, dateFormat);
			String officeTel = ParamUtil.getString(uploadRequest,EmployeeKeys.AddEditAttributes.OFFICETEL, PortletKeys.TEXT_BOX);
			String homeTel = ParamUtil.getString(uploadRequest,EmployeeKeys.AddEditAttributes.HOMETEL, PortletKeys.TEXT_BOX);
			String mobile = ParamUtil.getString(uploadRequest,EmployeeKeys.AddEditAttributes.MOBILE, PortletKeys.TEXT_BOX);
			String email = ParamUtil.getString(uploadRequest,EmployeeKeys.AddEditAttributes.EMAIL, PortletKeys.TEXT_BOX);
			String screenName = ParamUtil.getString(uploadRequest,EmployeeKeys.AddEditAttributes.SCREENNAME, PortletKeys.TEXT_BOX);
			String password = ParamUtil.getString(uploadRequest,EmployeeKeys.AddEditAttributes.PASSWORD, PortletKeys.TEXT_BOX);
			String repassword = ParamUtil.getString(uploadRequest,EmployeeKeys.AddEditAttributes.REPASSWORD, PortletKeys.TEXT_BOX);
			//System.out.println(" ------- " + password);
			Long editId = ParamUtil.getLong(uploadRequest,
					EmployeeKeys.AddEditAttributes.EDIT_ID,
					PortletKeys.LONG_DEFAULT);
			ManagerLdap ld = new ManagerLdap();
			if (editId == PortletKeys.LONG_DEFAULT) {
				User user = null;
				if (createUser){
					user = this.addUser(request, screenName, password, repassword, birthdate, fullName, email, gender);
					mappingUserId = user.getUserId();
					
				}
				Employee employee = EmployeeLocalServiceUtil.addEmployee(mappingUserId, workingUnitId,mainJobPosId,
				employeeNo, fullName, officeTel, homeTel, mobile, email, personelDocNo, gender,
				birthdate, serviceContext);
				if (createUser && ld.getIsZimbraLdap(serviceContext.getCompanyId())){
					ld.ExportToLdap(serviceContext, user,employee,password);//(serviceContext, user, employee);
				}
				if (mappingUserId != PortletKeys.LONG_DEFAULT){
					this.addToSite(workingUnitId, mappingUserId);
				}
				
			} else {
				
				Employee employee = EmployeeLocalServiceUtil.getEmployee(editId);
				long workingUnitIdOld = employee.getWorkingUnitId();
				//System.out.println(" sssss  " + fullName + " " + mainJobPosId + "    " + workingUnitId +  "    " + employee.getMappingUserId());
				if (employee.getWorkingUnitId() != PortletKeys.LONG_DEFAULT){
					
				}
				User user = null;
				try{		
					user =	UserLocalServiceUtil.getUser(employee.getMappingUserId());
					user.setEmailAddress(email);
					//user.setEmailAddressVerified(true);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				if (createUser && user == null){
					System.out.println(" sssss  " + fullName + " " + mainJobPosId + "    " + workingUnitId +  "    " + employee.getMappingUserId());
					user = addUser(request, screenName, password, repassword, birthdate, fullName, email, gender);
				}else {
					///UserLocalServiceUtil.updatePassword(employee.getMappingUserId(), password, repassword, false);
				}
				if (user != null){
					
					employee.setMappingUserId(user.getUserId());
				}else {
					
				}
				employee.setWorkingUnitId(workingUnitId);
				employee.setMainJobPosId(mainJobPosId);
				employee.setEmployeeNo(employeeNo);
				employee.setFullName(fullName);
				employee.setOfficeTel(officeTel);
				employee.setHomeTel(homeTel);
				employee.setMobile(mobile);
				employee.setEmail(email);
				employee.setPersonelDocNo(personelDocNo);
				employee.setGender(gender);
				employee.setBirthdate(birthdate);
				EmployeeLocalServiceUtil.saveEmployee(employee,serviceContext);
				if (user != null && ld.getIsZimbraLdap(serviceContext.getCompanyId())){
					//ld.employeeToLdap(serviceContext, user, employee);
					ld.ExportToLdap(serviceContext, user,employee,password);
				}
				if (employee.getMappingUserId() != PortletKeys.LONG_DEFAULT){
					if (workingUnitIdOld != PortletKeys.LONG_DEFAULT){
						
						changeToShite(workingUnitIdOld, workingUnitId, user);
					}else {
						addToSite(workingUnitId, mappingUserId);
					}
				}
				
			}
		}
		if (!SessionErrors.isEmpty(request)) {
			PortalUtil.copyRequestParameters(request, response);
		} else {
			response.sendRedirect(ParamUtil.getString(request,
					PortletKeys.REDIRECT_PAGE));
		}
	}
	public void addToSite(long workingUnitId, long userId) throws PortalException, SystemException{
		WorkingUnit work = WorkingUnitLocalServiceUtil.getWorkingUnit(workingUnitId);
		if (work.getLocalSiteId() != PortletKeys.LONG_DEFAULT){ 
			GroupLocalServiceUtil.addUserGroup(userId, work.getLocalSiteId());
		}
	}
	public void changeToShite(long workingUnitIdOld,long workingUnitId, User user) throws PortalException, SystemException{
		WorkingUnit work = WorkingUnitLocalServiceUtil.getWorkingUnit(workingUnitId);
		WorkingUnit workold = WorkingUnitLocalServiceUtil.getWorkingUnit(workingUnitIdOld);
		long userId = user.getUserId();
		//Group group = GroupLocalServiceUtil.getG(companyId, userId);
		List<Group> groups = user.getGroups();
		boolean f = false;
		for (int i = 0; i < groups.size(); i++){
			if (groups.get(i).getGroupId() == workold.getLocalSiteId() ){
				f = true;
				break;
			}
		}
		if (work.getLocalSiteId()  != workold.getLocalSiteId() || !f){
			if (workold.getLocalSiteId() != PortletKeys.LONG_DEFAULT && f) {
				GroupLocalServiceUtil.deleteUserGroup(userId,
						workold.getLocalSiteId());
			}
			if (work.getLocalSiteId() != PortletKeys.LONG_DEFAULT) {
				System.out.println(" changeToShite " + workingUnitId + "  "  + work.getLocalSiteId() + "  " + userId);
				GroupLocalServiceUtil.addUserGroup(userId,
						work.getLocalSiteId());
				System.out.println(" changeToShite " + workingUnitId + "  "  + work.getLocalSiteId() + "  " + userId);
			}
		}
	}
	public void changePassword(ActionRequest request, ActionResponse response)
			throws Exception {

		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal
					.getServiceContext();
			UploadRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(request);
			
			Long editId = ParamUtil.getLong(uploadRequest,
					EmployeeKeys.AddEditAttributes.EDIT_ID,
					PortletKeys.LONG_DEFAULT);
			ManagerLdap ld = new ManagerLdap();
			if (editId != PortletKeys.LONG_DEFAULT) {
				Employee employee = EmployeeLocalServiceUtil.getEmployee(editId);
				//System.out.println(" sssss  " + fullName + " " + mainJobPosId + "    " + workingUnitId +  "    " + employee.getMappingUserId());
				User user = null;
				if (employee.getMappingUserId() !=  PortletKeys.LONG_DEFAULT){
				//	System.out.println(" Doi mat khau  " + employee.getMappingUserId() + password + "  " + repassword);
					String password = ParamUtil.getString(uploadRequest,EmployeeKeys.AddEditAttributes.PASSWORD, PortletKeys.TEXT_BOX);
					String repassword = ParamUtil.getString(uploadRequest,EmployeeKeys.AddEditAttributes.REPASSWORD, PortletKeys.TEXT_BOX);
				
					try{	
						Date now = new Date();
						//UserLocalServiceUtil.upd
						//UserLocalServiceUtil.updatePassword(employee.getMappingUserId(), password, repassword, false);
						//		false, false,  serviceContext.getCreateDate(now));
						
						UserLocalServiceUtil.updatePasswordManually(employee.getMappingUserId() , password, true, false, serviceContext.getCreateDate(now));
						user =	UserLocalServiceUtil.getUser(employee.getMappingUserId());
						
						if (user != null && ld.getIsZimbraLdap(serviceContext.getCompanyId())){
							//employee.setMappingUserId(user.getUserId());
							ld.changePassord(serviceContext, user,password);
						}
					} catch (Exception e) {
						System.out.println("Loi o day " + e.getMessage());
					}
				}
			}
				
		}
		if (!SessionErrors.isEmpty(request)) {
			PortalUtil.copyRequestParameters(request, response);
		} else {
			response.sendRedirect(ParamUtil.getString(request,
					PortletKeys.REDIRECT_PAGE));
		}
	}
	
	
	
	
	public User addUser(ServiceContext serviceContext, String screenName,String password,String repassword,
			Date birthdate,String fullName,String email) throws PortalException, SystemException{
		//boolean autoPassword
		String[] tg = fullName.split(" ");
		String firstName = tg[0];
		String middleName = "";
		String lastName = "";
		if (tg.length > 1){
			firstName = tg[tg.length-1];
			lastName = tg[0];
		}
		if (tg.length > 2){
			middleName = tg[1];
			for (int i = 2; i < tg.length -1;i++){
				middleName += " " +  tg[i];
			}
		}
		Calendar birthday = CalendarFactoryUtil.getCalendar(); 
		birthday.setTime(birthdate);
		long creatorUserId = 0;
		boolean autoPassword = false;
		//String password1 = "password";
		//String password2 = password1;
		boolean autoScreenName = false;
		//String screenName = "tck";
		String emailAddress = email;
		long facebookId = 0;
		String openId = StringPool.BLANK;
		Locale locale = LocaleUtil.getDefault();
	
		int prefixId = 0;
		int suffixId = 0;
		boolean male = true;
		int birthdayMonth = birthday.get(Calendar.MONTH);
		int birthdayDay = birthday.get(Calendar.DAY_OF_MONTH);
		int birthdayYear = birthday.get(Calendar.YEAR); 
		String jobTitle = StringPool.BLANK;
		long[] groupIds = null;
		long[] organizationIds = null;
		long[] roleIds = null;
		long[] userGroupIds = null;
		boolean sendEmail = false; 
		//Locale locale = LocaleUtil.US; 
	//	creatorUserId, companyId, autoPassword, password1, password2,
	//	autoScreenName, screenName, emailAddress, facebookId, openId,
	//	locale, firstName, middleName, lastName, prefixId, suffixId,
	//	male, birthdayMonth, birthdayDay, birthdayYear, jobTitle,
	//	groupIds, organizationIds, roleIds, userGroupIds, sendEmail,
//	serviceContext); 
		User user = UserLocalServiceUtil.addUser(creatorUserId, serviceContext.getCompanyId(), autoPassword, password, repassword,
					autoScreenName, screenName, emailAddress, facebookId, openId,
				locale, firstName, middleName, lastName, prefixId, suffixId,
					male, birthdayMonth, birthdayDay, birthdayYear, jobTitle,
					groupIds, organizationIds, roleIds, userGroupIds, sendEmail,
				serviceContext);
		
		return user;
	}
	public void delete(ActionRequest request, ActionResponse response)
			throws Exception {
		long deleteId = ParamUtil.getLong(request,EmployeeKeys.BaseEmployeeAttributes.DELETE_ID,
				PortletKeys.LONG_DEFAULT);
		Employee employee = EmployeeLocalServiceUtil.getEmployee(deleteId);
		if (employee.getMappingUserId() != PortletKeys.LONG_DEFAULT){
			User user = UserLocalServiceUtil.deleteUser(employee.getMappingUserId());
			ManagerLdap ld = new ManagerLdap();
			ServiceContext serviceContext = ServiceContextThreadLocal
					.getServiceContext();
			ld.changeActive(serviceContext, user, 0);
		}
		EmployeeLocalServiceUtil.removeEmployee(deleteId);
		response.sendRedirect(ParamUtil.getString(request,
				PortletKeys.REDIRECT_PAGE));
	}

	public void edit(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException {
		long editId = ParamUtil.getLong(request,
				EmployeeKeys.BaseEmployeeAttributes.EDIT_ID,
				PortletKeys.LONG_DEFAULT);

		Employee empLoyee = EmployeeLocalServiceUtil.getEmployee(editId);
		//System.out.println("Toi day " + editId);
		setParameterIntoResponse(response, empLoyee);

		if (!SessionErrors.isEmpty(request)) {
			response.sendRedirect(ParamUtil.getString(request,PortletKeys.REDIRECT_PAGE));
		} else {
			PortalUtil.copyRequestParameters(request, response);
		}
	}

	private void setParameterIntoResponse(ActionResponse response,
			Employee employee) throws PortalException, SystemException {
		response.setRenderParameter(EmployeeKeys.AddEditAttributes.MAPPINGUSERID,String.valueOf(employee.getMappingUserId()));
		response.setRenderParameter(EmployeeKeys.AddEditAttributes.WORKINGUNITID,String.valueOf(employee.getWorkingUnitId()));
		response.setRenderParameter(EmployeeKeys.AddEditAttributes.MAINJOBPOSID,String.valueOf(employee.getMainJobPosId()));
		response.setRenderParameter(EmployeeKeys.AddEditAttributes.EMPLOYEENO,String.valueOf(employee.getEmployeeNo()));
		response.setRenderParameter(EmployeeKeys.AddEditAttributes.PERSONELDOCNO,String.valueOf(employee.getPersonelDocNo()));
		response.setRenderParameter(EmployeeKeys.AddEditAttributes.FULLNAME,String.valueOf(employee.getFullName()));
		response.setRenderParameter(EmployeeKeys.AddEditAttributes.GENDER,String.valueOf(employee.getGender()));
		response.setRenderParameter(EmployeeKeys.AddEditAttributes.BIRTHDATE,String.valueOf(employee.getBirthdate()));
		response.setRenderParameter(EmployeeKeys.AddEditAttributes.OFFICETEL,String.valueOf(employee.getOfficeTel()));
		response.setRenderParameter(EmployeeKeys.AddEditAttributes.HOMETEL,String.valueOf(employee.getHomeTel()));
		response.setRenderParameter(EmployeeKeys.AddEditAttributes.MOBILE,String.valueOf(employee.getMobile()));
		response.setRenderParameter(EmployeeKeys.AddEditAttributes.EMAIL,String.valueOf(employee.getEmail()));
		if (employee.getMappingUserId() > 0){
			User user =  UserLocalServiceUtil.getUser(employee.getMappingUserId());
			response.setRenderParameter(EmployeeKeys.AddEditAttributes.SCREENNAME,String.valueOf(user.getScreenName()));
			//response.setRenderParameter(EmployeeKeys.AddEditAttributes.PASSWORD,String.valueOf(user.getPassword()));
			//response.setRenderParameter(EmployeeKeys.AddEditAttributes.REPASSWORD,String.valueOf(user.get()));
			response.setRenderParameter(EmployeeKeys.AddEditAttributes.ISCREATUSER,String.valueOf(1));
		}else {
			response.setRenderParameter(EmployeeKeys.AddEditAttributes.ISCREATUSER,String.valueOf(0));
		}
	}

	private User addUser(final ActionRequest request, String screenName,
			String password, String repassword, Date birthdate,
			String fullName, String email, int gender) throws PortalException,
			SystemException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		long creatorUserId = themeDisplay.getUserId(); // default liferay user
		long companyId = themeDisplay.getCompanyId(); // default company
		boolean autoPassword = true;
		String password1 = "";
		String password2 = "";
		boolean autoScreenName = true;

		String emailAddress = email;
		long facebookId = 0;
		String openId = "";
		Locale locale = themeDisplay.getLocale();
		String[] tg = fullName.split(" ");
		String firstName = tg[0];
		String middleName = "";
		String lastName = "";
		if (tg.length > 1) {
			firstName = tg[tg.length - 1];
			lastName = tg[0];
		}
		if (tg.length > 2) {
			middleName = tg[1];
			for (int i = 2; i < tg.length - 1; i++) {
				middleName += " " + tg[i];
			}
		}
		int prefixId = 0;
		int suffixId = 0;
		boolean male = gender == 1;
		Calendar birthday = CalendarFactoryUtil.getCalendar();
		birthday.setTime(birthdate);
		int birthdayMonth = birthday.get(Calendar.MONTH);
		int birthdayDay = birthday.get(Calendar.DAY_OF_MONTH);
		int birthdayYear = birthday.get(Calendar.YEAR);
		String jobTitle = "";

		long[] groupIds = null;
		long[] organizationIds = null;
		long[] roleIds = null;
		long[] userGroupIds = null;

		boolean sendEmail = false;

		ServiceContext serviceContext = ServiceContextFactory
				.getInstance(request);
		try {
		User user = UserLocalServiceUtil.addUser(creatorUserId, companyId,
				autoPassword, password1, password2, autoScreenName, screenName,
				emailAddress, facebookId, openId, locale, firstName,
				middleName, lastName, prefixId, suffixId, male, birthdayMonth,
				birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds,
				roleIds, userGroupIds, sendEmail, serviceContext);
		return user;
		} catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
		
	}
	public void addEditJobPos(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException, IOException {

		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal
					.getServiceContext();
			UploadRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(request);
			
			long employeeId = ParamUtil.getLong(uploadRequest,EmployeeKeys.BaseEmployeeAttributes.EDIT_ID);
			long jobPosId = ParamUtil.getLong(uploadRequest,EmployeeKeys.AddEditAttributes.JOBPOSID);
			// Date pingTime = new Date();
			if (employeeId != PortletKeys.LONG_DEFAULT && jobPosId !=  PortletKeys.LONG_DEFAULT) {
				//JobPos2RoleLocalServiceUtil.addJobPos2Role(jobPosId, roleId, serviceContext);
				EmployeeLocalServiceUtil.addEmployee2JoPos(employeeId, jobPosId);
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
	
	public void setDefaultJobPos(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException, IOException {
		System.out.println(" Ngu ngoc  " );
	

			
			long employeeId = ParamUtil.getLong(request,EmployeeKeys.BaseEmployeeAttributes.EDIT_ID);
			
			long mainJobPosId = ParamUtil.getLong(request,EmployeeKeys.AddEditAttributes.MAINJOBPOSID);
			// Date pingTime = new Date();
			System.out.println(employeeId + "   " +  mainJobPosId);
			if (employeeId != PortletKeys.LONG_DEFAULT && mainJobPosId !=  PortletKeys.LONG_DEFAULT) {
				//JobPos2RoleLocalServiceUtil.addJobPos2Role(jobPosId, roleId, serviceContext);
				Employee employee = EmployeeLocalServiceUtil.getEmployee(employeeId);
				employee.setMainJobPosId(mainJobPosId);
				EmployeeLocalServiceUtil.updateEmployee(employee);
				//EmployeeLocalServiceUtil.addEmployee2JoPos(employeeId, jobPosId);
				//System.out.println(" sssss  " + name + " " + address);

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
	public void deleteJobPos(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException, IOException {

		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal
					.getServiceContext();
			UploadRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(request);
			
			long employeeId = ParamUtil.getLong(uploadRequest,EmployeeKeys.BaseEmployeeAttributes.EDIT_ID);
			long jobPosId = ParamUtil.getLong(uploadRequest,EmployeeKeys.BaseEmployeeAttributes.DELETE_ID);
			System.out.println(" Xoa  " + employeeId + " " + jobPosId);
			// Date pingTime = new Date();
			if (employeeId != PortletKeys.LONG_DEFAULT && jobPosId !=  PortletKeys.LONG_DEFAULT) {
				//JobPos2RoleLocalServiceUtil.addJobPos2Role(jobPosId, roleId, serviceContext);
				EmployeeLocalServiceUtil.removeJobPos(employeeId, jobPosId);
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
	private static Log _log = LogFactoryUtil.getLog(EmpLoyeePortlet.class);
}
