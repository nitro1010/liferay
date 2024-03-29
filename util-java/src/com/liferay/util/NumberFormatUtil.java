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

package com.liferay.util;

import java.text.NumberFormat;

/**
 * @author Brian Wing Shun Chan
 */
public class NumberFormatUtil {

	public static String format(
		NumberFormat numberFormat, double number, double defaultValue) {

		if ((Double.isNaN(number)) || (Double.isInfinite(number))) {
			return numberFormat.format(defaultValue);
		}
		else {
			return numberFormat.format(number);
		}
	}

	public static String format(
		NumberFormat numberFormat, float number, float defaultValue) {

		if ((Float.isNaN(number)) || (Float.isInfinite(number))) {
			return numberFormat.format(defaultValue);
		}
		else {
			return numberFormat.format(number);
		}
	}

}