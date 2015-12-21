package org.oep.usermgt.util;

import javax.naming.Name;
import javax.naming.NameNotFoundException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttributes;

import com.liferay.portal.kernel.ldap.DummyDirContext;
import com.liferay.portal.kernel.util.Validator;

public class PortalLDAPContext extends DummyDirContext {

	public PortalLDAPContext(Attributes attributes) {
		_attributes = attributes;
	}

	public PortalLDAPContext(boolean ignoreCase) {
		_attributes = new BasicAttributes(ignoreCase);
	}

	public void addAttribute(String name, Object object) {
		_attributes.put(name, object);
	}

	public Attributes getAttributes() {
		return _attributes;
	}

	@Override
	public Attributes getAttributes(Name name) throws NamingException {
		return getAttributes(name.toString());
	}

	@Override
	public Attributes getAttributes(Name name, String[] ids)
		throws NamingException {

		return getAttributes(name.toString(), ids);
	}

	@Override
	public Attributes getAttributes(String name) throws NamingException {
		if (Validator.isNotNull(name)) {
			throw new NameNotFoundException();
		}

		return (Attributes)_attributes.clone();
	}

	@Override
	public Attributes getAttributes(String name, String[] ids)
		throws NamingException {

		if (Validator.isNotNull(name)) {
			throw new NameNotFoundException();
		}

		Attributes attributes = new BasicAttributes(true);

		for (int i = 0; i < ids.length; i++) {
			Attribute attribute = _attributes.get(ids[i]);

			if (attribute != null) {
				attributes.put(attribute);
			}
		}

		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		_attributes = attributes;
	}

	private Attributes _attributes;

}