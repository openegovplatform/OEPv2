/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.oep.core.processmgt;

import com.liferay.portal.NoSuchModelException;

/**
 * @author trungdk
 */
public class NoSuchProcessOrder2UserException extends NoSuchModelException {

	public NoSuchProcessOrder2UserException() {
		super();
	}

	public NoSuchProcessOrder2UserException(String msg) {
		super(msg);
	}

	public NoSuchProcessOrder2UserException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchProcessOrder2UserException(Throwable cause) {
		super(cause);
	}

}