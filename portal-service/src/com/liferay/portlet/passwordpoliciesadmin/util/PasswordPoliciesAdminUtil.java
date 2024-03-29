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

package com.liferay.portlet.passwordpoliciesadmin.util;

import com.liferay.portal.kernel.util.OrderByComparator;

/**
 * @author Brian Wing Shun Chan
 */
public class PasswordPoliciesAdminUtil {

	public static OrderByComparator getPasswordPolicyOrderByComparator(
		String orderByCol, String orderByType) {

		return getPasswordPoliciesAdmin().getPasswordPolicyOrderByComparator(
			orderByCol, orderByType);
	}

	public static PasswordPoliciesAdmin getPasswordPoliciesAdmin() {
		return _passwordPoliciesAdmin;
	}

	public void setPasswordPoliciesAdmin(
			PasswordPoliciesAdmin passwordPoliciesAdmin) {

		_passwordPoliciesAdmin = passwordPoliciesAdmin;
	}

	private static PasswordPoliciesAdmin _passwordPoliciesAdmin;

}