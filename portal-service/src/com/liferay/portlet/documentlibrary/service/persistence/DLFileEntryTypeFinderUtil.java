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

package com.liferay.portlet.documentlibrary.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author Brian Wing Shun Chan
 */
public class DLFileEntryTypeFinderUtil {
	public static int countByKeywords(long companyId, long[] groupIds,
		java.lang.String keywords, boolean includeBasicFileEntryType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByKeywords(companyId, groupIds, keywords,
			includeBasicFileEntryType);
	}

	public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType> findByKeywords(
		long companyId, long[] groupIds, java.lang.String keywords,
		boolean includeBasicFileEntryType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByKeywords(companyId, groupIds, keywords,
			includeBasicFileEntryType, start, end, orderByComparator);
	}

	public static DLFileEntryTypeFinder getFinder() {
		if (_finder == null) {
			_finder = (DLFileEntryTypeFinder)PortalBeanLocatorUtil.locate(DLFileEntryTypeFinder.class.getName());

			ReferenceRegistry.registerReference(DLFileEntryTypeFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DLFileEntryTypeFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DLFileEntryTypeFinderUtil.class,
			"_finder");
	}

	private static DLFileEntryTypeFinder _finder;
}