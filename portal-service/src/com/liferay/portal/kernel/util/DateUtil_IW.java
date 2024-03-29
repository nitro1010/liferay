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

/**
 * @author Brian Wing Shun Chan
 */
public class DateUtil_IW {
	public static DateUtil_IW getInstance() {
		return _instance;
	}

	public int compareTo(java.util.Date date1, java.util.Date date2) {
		return DateUtil.compareTo(date1, date2);
	}

	public int compareTo(java.util.Date date1, java.util.Date date2,
		boolean ignoreMilliseconds) {
		return DateUtil.compareTo(date1, date2, ignoreMilliseconds);
	}

	public boolean equals(java.util.Date date1, java.util.Date date2) {
		return DateUtil.equals(date1, date2);
	}

	public boolean equals(java.util.Date date1, java.util.Date date2,
		boolean ignoreMilliseconds) {
		return DateUtil.equals(date1, date2, ignoreMilliseconds);
	}

	public java.lang.String getCurrentDate(java.lang.String pattern,
		java.util.Locale locale) {
		return DateUtil.getCurrentDate(pattern, locale);
	}

	public java.lang.String getCurrentDate(java.lang.String pattern,
		java.util.Locale locale, java.util.TimeZone timeZone) {
		return DateUtil.getCurrentDate(pattern, locale, timeZone);
	}

	public java.lang.String getDate(java.util.Date date,
		java.lang.String pattern, java.util.Locale locale) {
		return DateUtil.getDate(date, pattern, locale);
	}

	public java.lang.String getDate(java.util.Date date,
		java.lang.String pattern, java.util.Locale locale,
		java.util.TimeZone timeZone) {
		return DateUtil.getDate(date, pattern, locale, timeZone);
	}

	public int getDaysBetween(java.util.Date startDate, java.util.Date endDate,
		java.util.TimeZone timeZone) {
		return DateUtil.getDaysBetween(startDate, endDate, timeZone);
	}

	public java.text.DateFormat getISOFormat() {
		return DateUtil.getISOFormat();
	}

	public java.text.DateFormat getISOFormat(java.lang.String text) {
		return DateUtil.getISOFormat(text);
	}

	public java.text.DateFormat getISO8601Format() {
		return DateUtil.getISO8601Format();
	}

	public java.text.DateFormat getUTCFormat() {
		return DateUtil.getUTCFormat();
	}

	public java.text.DateFormat getUTCFormat(java.lang.String text) {
		return DateUtil.getUTCFormat(text);
	}

	public java.util.Date newDate() {
		return DateUtil.newDate();
	}

	public java.util.Date newDate(long date) {
		return DateUtil.newDate(date);
	}

	public long newTime() {
		return DateUtil.newTime();
	}

	private DateUtil_IW() {
	}

	private static DateUtil_IW _instance = new DateUtil_IW();
}