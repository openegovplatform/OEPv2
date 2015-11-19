package org.oep.usermgt.action;

import java.io.IOException;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.ModificationItem;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.log.LogUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropertiesUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.ldap.LDAPUser;
import com.liferay.portal.security.ldap.Modifications;
import com.liferay.portal.security.ldap.PortalLDAPExporter;
import com.liferay.portal.security.ldap.PortalLDAPExporterUtil;
import com.liferay.portal.security.ldap.PortalToLDAPConverter;
import com.liferay.portal.security.ldap.UserConverterKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextThreadLocal;
import com.liferay.portal.service.UserLocalServiceUtil;

public class Test {
	/*
	public Properties getUserMappings(long companyId) throws Exception {
		Properties userMappings = PropertiesUtil.load(PrefsPropsUtil.getString(
				companyId, PropsKeys.LDAP_USER_MAPPINGS));
		
		System.out.println("hello   " + PropsKeys.LDAP_USER_MAPPINGS);	
		
		
		System.out.println("hello   " + userMappings);	
		LogUtil.debug(_log, userMappings);

		return userMappings;
	}

	public Binding getUser(long companyId, String screenName) throws Exception {

		LdapContext ctx = getContext(companyId);

		if (ctx == null) {
			return null;
		}

		String baseDN = PrefsPropsUtil.getString(companyId,
				PropsKeys.LDAP_BASE_DN);

		Properties userMappings = getUserMappings(companyId);

		StringBuilder filter = new StringBuilder();

		filter.append(StringPool.OPEN_PARENTHESIS);
		filter.append(userMappings.getProperty("screenName"));
		filter.append(StringPool.EQUAL);
		filter.append(screenName);
		filter.append(StringPool.CLOSE_PARENTHESIS);

		SearchControls cons = new SearchControls(SearchControls.SUBTREE_SCOPE,
				1, 0, null, false, false);

		NamingEnumeration<SearchResult> enu = ctx.search(baseDN,
				filter.toString(), cons);
		System.out.println("TTTTTTTTT " + baseDN + " --------- "  + filter.toString() + "  ==== " + cons + "");
		ctx.close();

		if (enu.hasMoreElements()) {
			Binding binding = enu.nextElement();
			System.out.println("TTTTTTTTT " + binding);
			return binding;
		} else {
			return null;
		}
	}

	public void getLdapServerId(){
		
	}
	public void testLdap(ActionRequest request, ActionResponse response)
			throws Exception {
		ServiceContext serviceContext = ServiceContextThreadLocal
				.getServiceContext();
		long companyId = serviceContext.getCompanyId();
		User user = UserLocalServiceUtil.getUser(10987);
	//	String StringPool.PERIOD +
		Properties userMappings = getUserMappings(serviceContext.getCompanyId());
		Binding binding = getUser(companyId, user.getScreenName());
		String name = StringPool.BLANK;
		System.out.println("  NEW  --------- " + PrefsPropsUtil.getString(companyId, PropsKeys.LDAP_USER_IMPL));
	//	long preferredLDAPServerId = LDAPSettingsUtil.getPreferredLDAPServerId(
	//			companyId, user.getScreenName());
	//	System.out.println(" -------- " + preferredLDAPServerId);
	//	long ldapServerId = PortalLDAPUtil.getLdapServerId(companyId, user.getScreenName(), user.getEmailAddress());
		
	//	System.out.println(" -------- " + "   ----    " + LDAPSettingsUtil.getPropertyPostfix(preferredLDAPServerId));
		if (binding == null) {

			// Generate full DN based on user DN

			StringBuilder sb = new StringBuilder();

			sb.append(userMappings.getProperty("screenName"));
			sb.append(StringPool.EQUAL);
			sb.append(user.getScreenName());
			sb.append(StringPool.COMMA);
			sb.append(getUsersDN(companyId));

			name = sb.toString();
			Map<String, Serializable> expandoBridgeAttributes = null; 
			//PortalToLDAPConverter tg = PortalToLDAPConverter.class;
			//LDAPSettingsUtil.getAuthSearchFilter(ldapServerId, companyId, emailAddress, screenName, userId)
			
			System.out.println(user.getFullName() +  "   " + user.getUserId());
			PortalLDAPExporterUtil.exportToLDAP(user, expandoBridgeAttributes);
			//PortalLDAPExporterUtil.
			// Create new user in LDAP

			LDAPUser ldapUser = (LDAPUser) Class.forName(
					PrefsPropsUtil.getString(companyId, PropsKeys.LDAP_USER_IMPL)).newInstance();
			//PortalToLDAPConverter _portalToLDAPConverter = new DefaultLDAPToPortalConverter();
			//ldapUser.setUser(user);
			//System.out.println("  NEW " + ldapUser.getUserExpandoAttributes());
			//Attributes attributes = _portalToLDAPConverter.getLDAPUserAttributes(
			//		ldapServerId, user, userMappings);
			// ctx.bind(name, ldapUser);
		} else {

			// Modify existing LDAP user record

			name = getNameInNamespace(companyId, binding);

			Modifications mods = Modifications.getInstance();

			mods.addItem(userMappings.getProperty("firstName"),
					user.getFirstName());
			mods.addItem(userMappings.getProperty("lastName"),
					user.getLastName());

			ModificationItem[] modItems = mods.getItems();
			System.out.println("  ADDDD " + name + " ------ "  +  modItems.length + "  ---- " + binding);
			// ctx.modifyAttributes(name, modItems);
		}

		response.sendRedirect(ParamUtil.getString(request,
				PortletKeys.REDIRECT_PAGE));
	}

	public LdapContext getContext(long companyId) throws Exception {
		String baseProviderURL = PrefsPropsUtil.getString(companyId,
				PropsKeys.LDAP_BASE_PROVIDER_URL);
		String pricipal = PrefsPropsUtil.getString(companyId,
				PropsKeys.LDAP_SECURITY_PRINCIPAL);
		String credentials = PrefsPropsUtil.getString(companyId,
				PropsKeys.LDAP_SECURITY_CREDENTIALS);
		return getContext(companyId, baseProviderURL, pricipal, credentials);
	}

	public String getUsersDN(long companyId) throws Exception {
		return PrefsPropsUtil.getString(companyId, PropsKeys.LDAP_USERS_DN);
	}

	public LdapContext getContext(long companyId, String providerURL,
			String pricipal, String credentials) throws Exception {

		Properties env = new Properties();

		env.put(Context.INITIAL_CONTEXT_FACTORY, PrefsPropsUtil.getString(
				companyId, PropsKeys.LDAP_FACTORY_INITIAL));
		env.put(Context.PROVIDER_URL, providerURL);
		env.put(Context.SECURITY_PRINCIPAL, pricipal);
		env.put(Context.SECURITY_CREDENTIALS, credentials);
		env.put(Context.REFERRAL,
				PrefsPropsUtil.getString(companyId, PropsKeys.LDAP_REFERRAL));
		System.out.println(env + "---1---- " + providerURL + "  ........  " + credentials + " ...  " + pricipal + " ...  " + PrefsPropsUtil.getString(companyId, PropsKeys.LDAP_REFERRAL));
		LogUtil.debug(_log, env);

		LdapContext ctx = null;

		try {
			ctx = new InitialLdapContext(env, null);
		} catch (Exception e) {
			if (_log.isWarnEnabled()) {
				_log.warn("Failed to bind to the LDAP server");
			}

			if (_log.isDebugEnabled()) {
				_log.debug(e);
			}
		}

		return ctx;
	}

	public String getNameInNamespace(long companyId, Binding binding)
			throws Exception {

		String baseDN = PrefsPropsUtil.getString(companyId,
				PropsKeys.LDAP_BASE_DN);

		if (Validator.isNull(baseDN)) {
			return binding.getName();
		} else {
			StringBuilder sb = new StringBuilder();

			sb.append(binding.getName());
			sb.append(StringPool.COMMA);
			sb.append(baseDN);

			return sb.toString();
		}
	}
	public void look() {

	    // Set up the environment for creating the initial context
	    Hashtable<String, Object> env = new Hashtable<String, Object>(11);
	    env
	        .put(Context.INITIAL_CONTEXT_FACTORY,
	            "com.sun.jndi.ldap.LdapCtxFactory");
	    env.put(Context.PROVIDER_URL, "ldap://dev.vast.vn:389");

	    try {
	      // Create the initial context
	      Context ctx = new InitialContext(env);

	      // Perform lookup and cast to target type
	      LdapContext b = (LdapContext) ctx.lookup("cn=Rosanna Lee,ou=People");

	      System.out.println(b);

	      // Close the context when we're done
	      ctx.close();
	    } catch (NamingException e) {
	      System.out.println("Lookup failed: " + e);
	    }
	}
	protected void addAttributeMapping(
			String attributeName, Object attributeValue, Attributes attributes) {

			if (Validator.isNotNull(attributeName) && (attributeValue != null)) {
				attributes.put(attributeName, attributeValue);
			}
		}

		protected void addAttributeMapping(
			String attributeName, String attributeValue, Attributes attributes) {

			if (Validator.isNotNull(attributeName) &&
				Validator.isNotNull(attributeValue)) {

				attributes.put(attributeName, attributeValue);
			}
		}
		
		/*
		public Attributes getLDAPUserAttributes(
				long ldapServerId, User user, Properties userMappings)
			throws SystemException {

			Attributes attributes = new BasicAttributes(true);

			Attribute objectClass = new BasicAttribute(_OBJECT_CLASS);

		//	String postfix = LDAPSettingsUtil.getPropertyPostfix(ldapServerId);

			String[] defaultObjectClasses = PrefsPropsUtil.getStringArray(
				user.getCompanyId(),PropsKeys.LDAP_USER_DEFAULT_OBJECT_CLASSES,
				StringPool.COMMA);

			for (int i = 0; i < defaultObjectClasses.length; i++) {
				objectClass.add(defaultObjectClasses[i]);
			}
			
			attributes.put(objectClass);
			
			addAttributeMapping(
				userMappings.getProperty(UserConverterKeys.UUID), user.getUuid(),
				attributes);
			addAttributeMapping(
				userMappings.getProperty(UserConverterKeys.SCREEN_NAME),
				user.getScreenName(), attributes);
			addAttributeMapping(
				userMappings.getProperty(UserConverterKeys.PASSWORD),
				getEncryptedPasswordForLDAP(user, userMappings), attributes);
			addAttributeMapping(
				userMappings.getProperty(UserConverterKeys.EMAIL_ADDRESS),
				user.getEmailAddress(), attributes);
			addAttributeMapping(
				userMappings.getProperty(UserConverterKeys.FULL_NAME),
				user.getFullName(), attributes);
			addAttributeMapping(
				userMappings.getProperty(UserConverterKeys.FIRST_NAME),
				user.getFirstName(), attributes);
			addAttributeMapping(
				userMappings.getProperty(UserConverterKeys.MIDDLE_NAME),
				user.getMiddleName(), attributes);
			addAttributeMapping(
				userMappings.getProperty(UserConverterKeys.LAST_NAME),
				user.getLastName(), attributes);
			addAttributeMapping(
				userMappings.getProperty(UserConverterKeys.JOB_TITLE),
				user.getJobTitle(), attributes);
			addAttributeMapping(
				userMappings.getProperty(UserConverterKeys.PORTRAIT),
				getUserPortrait(user), attributes);
			addAttributeMapping(
				userMappings.getProperty(UserConverterKeys.STATUS),
				String.valueOf(user.getStatus()), attributes);

			return attributes;
		}
		*/
	/*
	private static Log _log = LogFactoryUtil.getLog(WorkingUnitPortlet.class);
	private static final String _OBJECT_CLASS = "objectclass";
	*/
}
