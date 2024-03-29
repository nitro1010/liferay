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

package com.liferay.portal.kernel.servlet;

import javax.servlet.ServletContext;

/**
 * @author Shuyang Zhou
 * @author Brian Wing Shun Chan
 */
public class ServletVersionDetector {

	public static boolean is2_5() {
		if (_2_5 != null) {
			return _2_5.booleanValue();
		}

		try {
			ServletContext.class.getMethod("getContextPath");

			_2_5 = Boolean.TRUE;
		}
		catch (Exception e) {
			_2_5 = Boolean.FALSE;
		}

		return _2_5.booleanValue();
	}

	private static Boolean _2_5;

}