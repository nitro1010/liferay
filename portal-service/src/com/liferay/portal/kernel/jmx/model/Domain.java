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

package com.liferay.portal.kernel.jmx.model;

import com.liferay.portal.kernel.util.HashCode;
import com.liferay.portal.kernel.util.HashCodeFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.Serializable;

import java.util.List;

/**
 * @author Shuyang Zhou
 */
public class Domain implements Serializable {

	public Domain(String domainName) {
		_domainName = domainName;
	}

	public Domain(String domainName, List<MBean> mBeans) {
		_domainName = domainName;
		_mBeans = mBeans;
		_loaded = true;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Domain)) {
			return false;
		}

		Domain domain = (Domain)obj;

		if (Validator.equals(_domainName, domain._domainName)) {

			return true;
		}

		return false;
	}

	public String getDomainName() {
		return _domainName;
	}

	public List<MBean> getMBeans() {
		return _mBeans;
	}

	@Override
	public int hashCode() {
		HashCode hashCode = HashCodeFactoryUtil.getHashCode();

		hashCode.append(_domainName);

		return hashCode.toHashCode();
	}

	public boolean isLoaded() {
		return _loaded;
	}

	private String _domainName;
	private boolean _loaded;
	private List<MBean> _mBeans;

}