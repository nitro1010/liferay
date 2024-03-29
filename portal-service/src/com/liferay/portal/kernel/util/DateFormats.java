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

package com.liferay.portal.kernel.util;

import java.text.DateFormat;

import java.util.Locale;
import java.util.TimeZone;

/**
 * @author     Brian Wing Shun Chan
 * @deprecated Use {@link DateFormatFactoryUtil} or {@link
 *             FastDateFormatFactoryUtil}
 */
public class DateFormats {

	public static DateFormat getDate(Locale locale) {
		return DateFormatFactoryUtil.getDate(locale);
	}

	public static DateFormat getDate(Locale locale, TimeZone timeZone) {
		return DateFormatFactoryUtil.getDate(locale, timeZone);
	}

	public static DateFormat getDateTime(Locale locale) {
		return DateFormatFactoryUtil.getDateTime(locale);
	}

	public static DateFormat getDateTime(Locale locale, TimeZone timeZone) {
		return DateFormatFactoryUtil.getDateTime(locale, timeZone);
	}

	public static DateFormat getTime(Locale locale) {
		return DateFormatFactoryUtil.getTime(locale);
	}

	public static DateFormat getTime(Locale locale, TimeZone timeZone) {
		return DateFormatFactoryUtil.getTime(locale, timeZone);
	}

}