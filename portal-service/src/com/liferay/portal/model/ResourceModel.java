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
 * The base model interface for the Resource service. Represents a row in the &quot;Resource_&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.ResourceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.ResourceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Resource
 * @see com.liferay.portal.model.impl.ResourceImpl
 * @see com.liferay.portal.model.impl.ResourceModelImpl
 * @generated
 */
public interface ResourceModel extends BaseModel<Resource> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a resource model instance should use the {@link Resource} interface instead.
	 */

	/**
	 * Returns the primary key of this resource.
	 *
	 * @return the primary key of this resource
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this resource.
	 *
	 * @param primaryKey the primary key of this resource
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the resource ID of this resource.
	 *
	 * @return the resource ID of this resource
	 */
	public long getResourceId();

	/**
	 * Sets the resource ID of this resource.
	 *
	 * @param resourceId the resource ID of this resource
	 */
	public void setResourceId(long resourceId);

	/**
	 * Returns the code ID of this resource.
	 *
	 * @return the code ID of this resource
	 */
	public long getCodeId();

	/**
	 * Sets the code ID of this resource.
	 *
	 * @param codeId the code ID of this resource
	 */
	public void setCodeId(long codeId);

	/**
	 * Returns the prim key of this resource.
	 *
	 * @return the prim key of this resource
	 */
	@AutoEscape
	public String getPrimKey();

	/**
	 * Sets the prim key of this resource.
	 *
	 * @param primKey the prim key of this resource
	 */
	public void setPrimKey(String primKey);

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

	public int compareTo(Resource resource);

	public int hashCode();

	public CacheModel<Resource> toCacheModel();

	public Resource toEscapedModel();

	public String toString();

	public String toXmlString();
}