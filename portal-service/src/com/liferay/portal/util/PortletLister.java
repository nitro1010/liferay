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

package com.liferay.portal.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.TreeView;
import com.liferay.portal.model.LayoutTypePortlet;
import com.liferay.portal.model.User;

import javax.servlet.ServletContext;

/**
 * @author Jorge Ferrer
 * @author Dennis Ju
 * @author Brian Wing Shun Chan
 */
public interface PortletLister {

	public TreeView getTreeView() throws PortalException, SystemException;

	public void setIncludeInstanceablePortlets(
		boolean includeInstanceablePortlets);

	public void setIteratePortlets(boolean iteratePortlets);

	public void setLayoutTypePortlet(LayoutTypePortlet layoutTypePortlet);

	public void setRootNodeName(String rootNodeName);

	public void setServletContext(ServletContext servletContext);

	public void setUser(User user);

}