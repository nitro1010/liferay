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

package com.liferay.portal.util.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.UserGroup;

/**
 * @author Brian Wing Shun Chan
 */
public class UserGroupNameComparator extends OrderByComparator {

	public static final String ORDER_BY_ASC = "UserGroup.name ASC";

	public static final String ORDER_BY_DESC = "UserGroup.name DESC";

	public static final String[] ORDER_BY_FIELDS = {"name"};

	public UserGroupNameComparator() {
		this(false);
	}

	public UserGroupNameComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		UserGroup userGroup1 = (UserGroup)obj1;
		UserGroup userGroup2 = (UserGroup)obj2;

		int value = userGroup1.getName().compareTo(userGroup2.getName());

		if (_ascending) {
			return value;
		}
		else {
			return -value;
		}
	}

	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}

	@Override
	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

	@Override
	public boolean isAscending() {
		return _ascending;
	}

	private boolean _ascending;

}