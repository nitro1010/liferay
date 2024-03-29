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

package com.liferay.portlet.ratings.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author Brian Wing Shun Chan
 */
public class RatingsStatsFinderUtil {
	public static java.util.List<com.liferay.portlet.ratings.model.RatingsStats> findByC_C(
		long classNameId, java.util.List<java.lang.Long> classPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByC_C(classNameId, classPKs);
	}

	public static RatingsStatsFinder getFinder() {
		if (_finder == null) {
			_finder = (RatingsStatsFinder)PortalBeanLocatorUtil.locate(RatingsStatsFinder.class.getName());

			ReferenceRegistry.registerReference(RatingsStatsFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(RatingsStatsFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(RatingsStatsFinderUtil.class,
			"_finder");
	}

	private static RatingsStatsFinder _finder;
}