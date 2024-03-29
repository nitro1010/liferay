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

package com.liferay.taglib.ui;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portlet.ratings.model.RatingsEntry;
import com.liferay.portlet.ratings.model.RatingsStats;
import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Brian Wing Shun Chan
 * @author Shuyang Zhou
 */
public class RatingsTag extends IncludeTag {

	public void setClassName(String className) {
		_className = className;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	public void setNumberOfStars(int numberOfStars) {
		_numberOfStars = numberOfStars;
	}

	public void setRatingsEntry(RatingsEntry ratingsEntry) {
		_ratingsEntry = ratingsEntry;

		_setRatingsEntry = true;
	}

	public void setRatingsStats(RatingsStats ratingsStats) {
		_ratingsStats = ratingsStats;

		_setRatingsStats = true;
	}

	public void setType(String type) {
		_type = type;
	}

	public void setUrl(String url) {
		_url = url;
	}

	@Override
	protected void cleanUp() {
		_className = null;
		_classPK = 0;
		_numberOfStars = _DEFAULT_NUMBER_OF_STARS;
		_ratingsEntry = null;
		_ratingsStats = null;
		_setRatingsEntry = false;
		_setRatingsStats = false;
		_type = "stars";
		_url = null;
	}

	@Override
	protected String getPage() {
		return _PAGE;
	}

	@Override
	protected boolean isCleanUpSetAttributes() {
		return _CLEAN_UP_SET_ATTRIBUTES;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		request.setAttribute("liferay-ui:ratings:className", _className);
		request.setAttribute(
			"liferay-ui:ratings:classPK", String.valueOf(_classPK));
		request.setAttribute(
			"liferay-ui:ratings:numberOfStars", String.valueOf(_numberOfStars));
		request.setAttribute("liferay-ui:ratings:ratingsEntry", _ratingsEntry);
		request.setAttribute("liferay-ui:ratings:ratingsStats", _ratingsStats);
		request.setAttribute(
			"liferay-ui:ratings:setRatingsEntry",
			String.valueOf(_setRatingsEntry));
		request.setAttribute(
			"liferay-ui:ratings:setRatingsStats",
			String.valueOf(_setRatingsStats));
		request.setAttribute("liferay-ui:ratings:type", _type);
		request.setAttribute("liferay-ui:ratings:url", _url);
	}

	private static final boolean _CLEAN_UP_SET_ATTRIBUTES = true;

	private static final int _DEFAULT_NUMBER_OF_STARS = GetterUtil.getInteger(
		PropsUtil.get(PropsKeys.RATINGS_DEFAULT_NUMBER_OF_STARS));

	private static final String _PAGE = "/html/taglib/ui/ratings/page.jsp";

	private String _className;
	private long _classPK;
	private int _numberOfStars = _DEFAULT_NUMBER_OF_STARS;
	private RatingsEntry _ratingsEntry;
	private RatingsStats _ratingsStats;
	private boolean _setRatingsEntry;
	private boolean _setRatingsStats;
	private String _type = "stars";
	private String _url;

}