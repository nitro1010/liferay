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

package com.liferay.portal.kernel.workflow.permission;

import com.liferay.portal.security.permission.PermissionChecker;

/**
 * @author Jorge Ferrer
 */
public class WorkflowPermissionUtil {

	public static WorkflowPermission getWorkflowPermission() {
		return _workflowPermission;
	}

	public static Boolean hasPermission(
		PermissionChecker permissionChecker, long groupId, String className,
		long classPK, String actionId) {

		return getWorkflowPermission().hasPermission(
			permissionChecker, groupId, className, classPK, actionId);
	}

	public void setWorkflowPermission(WorkflowPermission WorkflowPermission) {
		_workflowPermission = WorkflowPermission;
	}

	private static WorkflowPermission _workflowPermission;

}