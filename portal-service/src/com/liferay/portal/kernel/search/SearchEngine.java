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

package com.liferay.portal.kernel.search;

import com.liferay.portal.kernel.cluster.Priority;

/**
 * @author Bruno Farache
 * @author Michael C. Han
 */
public interface SearchEngine {

	public Priority getClusteredWritePriority();

	public IndexSearcher getIndexSearcher();

	public IndexWriter getIndexWriter();

	public String getName();

	public String getVendor();

	public boolean isClusteredWrite();

	public boolean isLuceneBased();

}