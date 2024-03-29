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
import com.liferay.portal.model.Role;

/**
 * @author Brian Wing Shun Chan
 */
public class RoleTypeComparator extends OrderByComparator {

	public static final String ORDER_BY_ASC = "Role_.type_ ASC, Role_.name ASC";

	public static final String ORDER_BY_DESC =
		"Role_.type_ DESC, Role_.name DESC";

	public static final String[] ORDER_BY_FIELDS = {"type", "name"};

	public RoleTypeComparator() {
		this(false);
	}

	public RoleTypeComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		Role role1 = (Role)obj1;
		Role role2 = (Role)obj2;

		int value = 0;

		if (role1.getType() > role2.getType()) {
			value = 1;
		}
		else if (role1.getType() < role2.getType()) {
			value = -1;
		}

		if (value == 0) {
			value = role1.getName().compareTo(role2.getName());
		}

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