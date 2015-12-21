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

import org.oep.usermgt.action.WorkingUnitPortlet;
import org.oep.usermgt.model.Employee;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.log.LogUtil;
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


public class ManagerLdap {

	String[][] zimbraProperty = new String[][] {

	
	{ "zimbraMailTransport", "lmtp:dev.vast.vn:7025" },
			{ "zimbraAccountStatus", "active" },
			{ "zimbraMailStatus", "enabled" },
			{ "zimbraAuthTokenValidityValue", "1" },
			{ "zimbraPrefSortOrder", "BDLV:,CAL:,CLV:,CNS:,CNSRC:,CNTGT:,CV:,TKL:,TV:" }

	};
	String[] zimbrazimletuserpropertiesstr = new String[]{
			"com_zimbra_social:social_emailLastUpdateDate:2015/12/21",
			"com_zimbra_social:social_pref_cardWidthList:400px",
			"com_zimbra_social:social_pref_numberofTweetsSearchesToReturn:50",
			"com_zimbra_social:social_pref_SocialMailUpdateOn:true",
			"com_zimbra_social:social_pref_autoShortenURLOn:true",
			"com_zimbra_social:social_pref_socializeBtnOn:false",
			"com_zimbra_social:social_pref_diggPopularIsOn:true",
			"com_zimbra_social:social_pref_numberofTweetsToReturn:50",
			"com_zimbra_social:social_pref_tweetmemePopularIsOn:false",
			"com_zimbra_social:social_pref_dontShowWelcomeScreenOn:false",
			"com_zimbra_social:social_pref_trendsPopularIsOn:true",
			"com_zimbra_social:social_pref_showTweetAlertsOn:true",
			"com_zimbra_social:social_alertUpdateTime:1450682707431"
	};
	//zimbramaildeliveryaddress=zimbraMailDeliveryAddress: testsso@dev.vast.vn
	public void updateLdapZimbra(LdapContext ctx ,User user,String name) throws NamingException{
		Modifications mods = Modifications.getInstance();
        for (int i = 0; i < 5;i++){
        	 mods.addItem(zimbraProperty[i][0],zimbraProperty[i][1]);
        }
        mods.addItem("zimbramaildeliveryaddress",user.getEmailAddress());
        ModificationItem[] modItems = mods.getItems();
        ctx.modifyAttributes(name, modItems);
        //= getContext(serviceContext.getCompanyId());
		
	}
	public Properties getUserMappings(long companyId) throws Exception {
		Properties userMappings = PropertiesUtil.load(PrefsPropsUtil.getString(
				companyId, PropsKeys.LDAP_USER_MAPPINGS));
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
		//System.out.println("TTTTTTTTT " + baseDN + " --------- "  + filter.toString() + "  ==== " + cons + "");
		ctx.close();

		if (enu.hasMoreElements()) {
			Binding binding = enu.nextElement();
		//	System.out.println("TTTTTTTTT " + binding);
			return binding;
		} else {
			return null;
		}
	}

	public boolean getIsZimbraLdap(long companyId){
		boolean isZimbraLdap = false;
		try {
			
			isZimbraLdap = PrefsPropsUtil.getBoolean(LADAP_ZIMBRA);
		//	System.out.println("hello   dung " + isZimbraLdap);	
		} catch (Exception e) {
		//	System.out.println("hello   sai ");
			isZimbraLdap = false;
		}
	    return isZimbraLdap;
	}
	
	public void updateLdapEmployee(LdapContext ctx, Employee emp,Properties userMappings,String name) throws NamingException{
		Modifications mods = Modifications.getInstance();  
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
			ModificationItem[] modItems = mods.getItems();
			ctx.modifyAttributes(name, modItems);
	}
	
	public void changePassord(ServiceContext serviceContext, User user, String password) throws Exception{
		long companyId = serviceContext.getCompanyId();
		Properties userMappings = getUserMappings(serviceContext.getCompanyId());
		Binding binding = getUser(companyId, user.getScreenName());
		System.out.println("bingging " + binding);
		System.out.println("Pass " + user.getPassword());
	    String name = StringPool.BLANK;
		StringBuilder sb = new StringBuilder();
		LdapContext ctx = getContext(serviceContext.getCompanyId());
        sb = new StringBuilder();
		sb.append(userMappings.getProperty("screenName"));
		sb.append(StringPool.EQUAL);
		sb.append(user.getScreenName());
		sb.append(StringPool.COMMA);
		sb.append(getUsersDN(companyId));
		name = sb.toString();
		Modifications mods = Modifications.getInstance();  
		mods.addItem(userMappings.getProperty(UserConverterKeys.PASSWORD),password);
		ModificationItem[] modItems = mods.getItems();
		if (binding != null) {
			ctx.modifyAttributes(name, modItems);
		}
		
	}
	public void ExportToLdap(ServiceContext serviceContext,User user,Employee emp, String password)
			throws Exception {
		
		long companyId = serviceContext.getCompanyId();
		Properties userMappings = getUserMappings(serviceContext.getCompanyId());
		Binding binding = getUser(companyId, user.getScreenName());
		System.out.println (" binding :  " + binding);
		
		System.out.println (" Pass :  " + user.getPasswordUnencrypted());
		//System.out.println (" PASSWORD_ENCRYPTION :  " + PrefsPropsUtil.getString(
		///		user.getCompanyId(),PropsKeys.LDAP_AUTH_PASSWORD_ENCRYPTION_ALGORITHM));
			
	    String name = StringPool.BLANK;
		StringBuilder sb = new StringBuilder();
		LdapContext ctx = getContext(serviceContext.getCompanyId());
        sb = new StringBuilder();
		sb.append(userMappings.getProperty("screenName"));
		sb.append(StringPool.EQUAL);
		sb.append(user.getScreenName());
		sb.append(StringPool.COMMA);
		sb.append(getUsersDN(companyId));
		name = sb.toString();
		if (binding == null) {
			Attributes mm = getLDAPUserAttributes(user,userMappings,password);
		    ctx.bind(name, new PortalLDAPContext(mm));
		    changePassord(serviceContext,user,password);
		    //updateLdapZimbra(ctx,user,name);
		} else {
			this.updateLdapEmployee(ctx, emp, userMappings,name);
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
		
	
		public Attributes getLDAPUserAttributes(
				User user, Properties userMappings, String password)
			throws SystemException {

			Attributes attributes = new BasicAttributes(true);

			Attribute objectClass = new BasicAttribute(_OBJECT_CLASS);
			Attribute zimbrazimletuserproperties = new BasicAttribute(ZIMBRA_ZIMLET_USER_PROPERTIES);

			for (int i = 0; i < zimbrazimletuserpropertiesstr.length; i++) {
				zimbrazimletuserproperties.add(zimbrazimletuserpropertiesstr[i]);
			}
			attributes.put(zimbrazimletuserproperties);
		//	String postfix = LDAPSettingsUtil.getPropertyPostfix(ldapServerId);

			String[] defaultObjectClasses = PrefsPropsUtil.getStringArray(
				user.getCompanyId(),PropsKeys.LDAP_USER_DEFAULT_OBJECT_CLASSES,
				StringPool.COMMA);

			for (int i = 0; i < defaultObjectClasses.length; i++) {
				System.out.println("11111  : " + defaultObjectClasses[i]);
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
					password, attributes);
			//addAttributeMapping(
			//	userMappings.getProperty(UserConverterKeys.PASSWORD),
			//	getEncryptedPasswordForLDAP(user, userMappings), attributes);
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
			//addAttributeMapping(
			//	userMappings.getProperty(UserConverterKeys.STATUS),
			//	String.valueOf(user.getStatus()), attributes);
			for (int i = 0; i < 5;i++){
				addAttributeMapping(
						zimbraProperty[i][0],
						zimbraProperty[i][1], attributes);
	        	// mods.addItem(zimbraProperty[i][0],zimbraProperty[i][1]);
	        }
			
			String mailhost = PrefsPropsUtil.getString(
				user.getCompanyId(),
				LADAP_ZIMBRA_MAILHOST);
			if (mailhost != null && !mailhost.equals("")){
				addAttributeMapping(
						"zimbraMailHost",
						mailhost, attributes);
			}
			return attributes;
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
	private static Log _log = LogFactoryUtil.getLog(WorkingUnitPortlet.class);
	private static final String _OBJECT_CLASS = "objectclass";
	private static final String LADAP_ZIMBRA= "ldap.auth.zimbra";
	private static final String LADAP_ZIMBRA_MAILHOST= "ldap.auth.zimbra.mailhost";
	private static final String ZIMBRA_ZIMLET_USER_PROPERTIES = "zimbrazimletuserproperties";
	
}
