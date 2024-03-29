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

package com.liferay.portal.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ResourceCode service. Represents a row in the &quot;ResourceCode&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.ResourceCodeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.ResourceCodeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResourceCode
 * @see com.liferay.portal.model.impl.ResourceCodeImpl
 * @see com.liferay.portal.model.impl.ResourceCodeModelImpl
 * @generated
 */
public interface ResourceCodeModel extends BaseModel<ResourceCode> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a resource code model instance should use the {@link ResourceCode} interface instead.
	 */

	/**
	 * Returns the primary key of this resource code.
	 *
	 * @return the primary key of this resource code
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this resource code.
	 *
	 * @param primaryKey the primary key of this resource code
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the code ID of this resource code.
	 *
	 * @return the code ID of this resource code
	 */
	public long getCodeId();

	/**
	 * Sets the code ID of this resource code.
	 *
	 * @param codeId the code ID of this resource code
	 */
	public void setCodeId(long codeId);

	/**
	 * Returns the company ID of this resource code.
	 *
	 * @return the company ID of this resource code
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this resource code.
	 *
	 * @param companyId the company ID of this resource code
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the name of this resource code.
	 *
	 * @return the name of this resource code
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this resource code.
	 *
	 * @param name the name of this resource code
	 */
	public void setName(String name);

	/**
	 * Returns the scope of this resource code.
	 *
	 * @return the scope of this resource code
	 */
	public int getScope();

	/**
	 * Sets the scope of this resource code.
	 *
	 * @param scope the scope of this resource code
	 */
	public void setScope(int scope);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(ResourceCode resourceCode);

	public int hashCode();

	public CacheModel<ResourceCode> toCacheModel();

	public ResourceCode toEscapedModel();

	public String toString();

	public String toXmlString();
}