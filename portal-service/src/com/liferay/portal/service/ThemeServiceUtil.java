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

package com.liferay.portal.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the theme remote service. This utility wraps {@link com.liferay.portal.service.impl.ThemeServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ThemeService
 * @see com.liferay.portal.service.base.ThemeServiceBaseImpl
 * @see com.liferay.portal.service.impl.ThemeServiceImpl
 * @generated
 */
public class ThemeServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.ThemeServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static java.util.List<com.liferay.portal.model.Theme> getThemes(
		long companyId) {
		return getService().getThemes(companyId);
	}

	public static com.liferay.portal.kernel.json.JSONArray getWARThemes() {
		return getService().getWARThemes();
	}

	public static ThemeService getService() {
		if (_service == null) {
			_service = (ThemeService)PortalBeanLocatorUtil.locate(ThemeService.class.getName());

			ReferenceRegistry.registerReference(ThemeServiceUtil.class,
				"_service");
			MethodCache.remove(ThemeService.class);
		}

		return _service;
	}

	public void setService(ThemeService service) {
		MethodCache.remove(ThemeService.class);

		_service = service;

		ReferenceRegistry.registerReference(ThemeServiceUtil.class, "_service");
		MethodCache.remove(ThemeService.class);
	}

	private static ThemeService _service;
}