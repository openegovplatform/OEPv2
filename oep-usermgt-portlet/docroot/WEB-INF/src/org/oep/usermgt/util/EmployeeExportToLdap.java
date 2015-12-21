package org.oep.usermgt.util;

import java.util.Properties;

import javax.naming.Binding;

import javax.naming.Context;

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


import org.oep.usermgt.model.Employee;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropertiesUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;

import com.liferay.portal.security.ldap.Modifications;
import com.liferay.portal.security.ldap.UserConverterKeys;
import com.liferay.portal.service.ServiceContext;
//import com.liferay.portal.service.;


public class EmployeeExportToLdap {
	String[][] zimbraProperty = new String[][] {

			{ "zimbraMailTransport", "lmtp:dev.vast.vn:7025" },
			{ "zimbraAccountStatus", "active" },
			{ "zimbraMailStatus", "enabled" },
			{ "zimbraAuthTokenValidityValue", "1" },
			{ "zimbraMailHost", "dev.vast.vn" }

   };
	
	public void updateLdapEmployee(Modifications mods , Employee emp,Properties userMappings) throws NamingException{
		  mods.addItem("homephone",emp.getHomeTel());
	      mods.addItem("mobile",emp.getMobile());
	      mods.addItem("zimbramaildeliveryaddress",emp.getEmail());
	     // mods.a
	      String[] tg = emp.getFullName().split(" ");
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
			mods.addItem(userMappings.getProperty(UserConverterKeys.EMAIL_ADDRESS),emp.getEmail());
			mods.addItem(userMappings.getProperty(UserConverterKeys.FULL_NAME),emp.getFullName());
			mods.addItem(userMappings.getProperty(UserConverterKeys.FIRST_NAME),firstName);
			mods.addItem(userMappings.getProperty(UserConverterKeys.MIDDLE_NAME),middleName);
			mods.addItem(userMappings.getProperty(UserConverterKeys.LAST_NAME),lastName);
	}
	public void updateLdapEmployeePass(Modifications mods, User user,Properties userMappings) throws SystemException{
		mods.addItem(userMappings.getProperty(UserConverterKeys.PASSWORD),getEncryptedPasswordForLDAP(user, userMappings));
	}
	
	public void updateLdapZimbra(Modifications mods,User user) throws NamingException{
		//Modifications mods = Modifications.getInstance();
        for (int i = 0; i < 5;i++){
        	 mods.addItem(zimbraProperty[i][0],zimbraProperty[i][1]);
        }
        mods.addItem("zimbramaildeliveryaddress",user.getEmailAddress());
	}
	
	public void employeeToLdap(ServiceContext serviceContext, User user, Employee employ) throws Exception{
		long companyId = serviceContext.getCompanyId();
		System.out.println("  Cai mui to  ");
		Properties userMappings = PropertiesUtil.load(PrefsPropsUtil.getString(
				companyId, PropsKeys.LDAP_USER_MAPPINGS));
		LdapContext ctx = getContext(serviceContext.getCompanyId());
		Binding binding = getUser(ctx,companyId, user.getScreenName());
		System.out.println("  binding  " + binding);
		StringBuilder sb = new StringBuilder();
		
		sb.append(userMappings.getProperty("screenName"));
		sb.append(StringPool.EQUAL);
		sb.append(user.getScreenName());
		sb.append(StringPool.COMMA);
		sb.append(getUsersDN(companyId));
		String name = sb.toString();
		
		System.out.println("  helllo  " + name);
		Modifications mods = Modifications.getInstance();
		if (binding == null) {
			Attributes atrm = getLDAPUserAttributes(user,userMappings);
			System.out.println("111 " + atrm);
			//ctx = getContext(serviceContext.getCompanyId());
			ctx.bind(name, new PortalLDAPContext(atrm));
			updateLdapZimbra(mods,user);
			ModificationItem[] modItems = mods.getItems();
	        ctx.modifyAttributes(name, modItems);
			
		}else {
			this.updateLdapEmployee(mods, employ, userMappings);
			ModificationItem[] modItems = mods.getItems();
			//String name = sb.toString();
	        ctx.modifyAttributes(name, modItems);
		}
	}
	
	public void updateLdapZimbra(LdapContext ctx ,User user,String name, Employee emp) throws NamingException{
		Modifications mods = Modifications.getInstance();
        for (int i = 0; i < 5;i++){
        	 mods.addItem(zimbraProperty[i][0],zimbraProperty[i][1]);
        }
        mods.addItem("zimbramaildeliveryaddress",user.getEmailAddress());
     
       // mods.addItem("company",user.getEmailAddress());
      //  mods.addItem("street",user.getEmailAddress());
       //.addItem("company",user.getEmailAddress());
       // mods.addItem("company",user.getEmailAddress());
    	//System.out.println("My  " + mods);
        ModificationItem[] modItems = mods.getItems();
        ctx.modifyAttributes(name, modItems);
        //= getContext(serviceContext.getCompanyId());
		
	}
	protected String getEncryptedPasswordForLDAP(
			User user, Properties userMappings)
		throws SystemException {

		String password = user.getPasswordUnencrypted();
		//

		if (Validator.isNull(password)) {
			return password;
		}

		String algorithm = PrefsPropsUtil.getString(
			user.getCompanyId(),
			PropsKeys.LDAP_AUTH_PASSWORD_ENCRYPTION_ALGORITHM);
		
		if (Validator.isNull(algorithm)) {
			return password;
		}

		try {
			StringBundler sb = new StringBundler(4);

	//		if (!algorithm.equals(PasswordEncryptor.TYPE_NONE)) {
		//		sb.append(StringPool.OPEN_CURLY_BRACE);
		//		sb.append(algorithm);
		//		sb.append(StringPool.CLOSE_CURLY_BRACE);
		//	}

			//sb.append(PasswordEncryptorUtil.encrypt(algorithm, password, null));

			String passwordKey = userMappings.getProperty(
				UserConverterKeys.PASSWORD);

			if (passwordKey.equals("unicodePwd")) {
				String quotedPassword = StringPool.QUOTE.concat(
					sb.toString()).concat(StringPool.QUOTE);

				byte[] unicodePassword = quotedPassword.getBytes("UTF-16LE");

				return new String(unicodePassword);
			}

			return sb.toString();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}	

		protected void addAttributeMapping(
			String attributeName, String attributeValue, Attributes attributes) {

			if (Validator.isNotNull(attributeName) &&
				Validator.isNotNull(attributeValue)) {

				attributes.put(attributeName, attributeValue);
			}
		}
	public Attributes getLDAPUserAttributes(
			User user, Properties userMappings)
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
		//addAttributeMapping(
		//	userMappings.getProperty(UserConverterKeys.PORTRAIT),
		//	getUserPortrait(user), attributes);
		addAttributeMapping(
			userMappings.getProperty(UserConverterKeys.STATUS),
			String.valueOf(user.getStatus()), attributes);
		
		return attributes;
	}

	public Properties getUserMappings(long companyId) throws Exception {
		Properties userMappings = PropertiesUtil.load(PrefsPropsUtil.getString(
				companyId, PropsKeys.LDAP_USER_MAPPINGS));
		return userMappings;
	}
	public Binding getUser(LdapContext ctx, long companyId, String screenName) throws Exception {


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
		///System.out.println("TTTTTTTTT " + baseDN + " --------- "  + filter.toString() + "  ==== " + cons + "");
		ctx.close();

		if (enu.hasMoreElements()) {
			Binding binding = enu.nextElement();
		//	System.out.println("TTTTTTTTT " + binding);
			return binding;
		} else {
			return null;
		}
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
	//	LogUtil.debug(_log, env);

		LdapContext ctx = null;

		try {
			ctx = new InitialLdapContext(env, null);
		} catch (Exception e) {
		//	if (_log.isWarnEnabled()) {
	//			_log.warn("Failed to bind to the LDAP server");
	//		}

		//	if (_log.isDebugEnabled()) {
	//			_log.debug(e);
	//		}
		}

		return ctx;
	}
	private static final String _OBJECT_CLASS = "objectclass";
	//private static final String _OBJECT_CLASS = "objectclass";
}
