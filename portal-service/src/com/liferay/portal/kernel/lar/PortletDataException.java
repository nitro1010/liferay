/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.kernel.lar;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Raymond Augé
 */
public class PortletDataException extends PortalException {

	public static final int DEFAULT = 1;

	public static final int END_DATE_IS_MISSING_START_DATE = 1;

	public static final int FUTURE_END_DATE = 2;

	public static final int FUTURE_START_DATE = 3;

	public static final int START_DATE_AFTER_END_DATE = 4;

	public static final int START_DATE_IS_MISSING_END_DATE = 5;

	public PortletDataException() {
		super();
	}

	public PortletDataException(int type) {
		_type = type;
	}

	public PortletDataException(String msg) {
		super(msg);
	}

	public PortletDataException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public PortletDataException(Throwable cause) {
		super(cause);
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_type = type;
	}

	private int _type = DEFAULT;

}