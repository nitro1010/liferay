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

package com.liferay.portlet.shopping.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ShoppingCategory service. Represents a row in the &quot;ShoppingCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.shopping.model.impl.ShoppingCategoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.shopping.model.impl.ShoppingCategoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingCategory
 * @see com.liferay.portlet.shopping.model.impl.ShoppingCategoryImpl
 * @see com.liferay.portlet.shopping.model.impl.ShoppingCategoryModelImpl
 * @generated
 */
public interface ShoppingCategoryModel extends BaseModel<ShoppingCategory>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a shopping category model instance should use the {@link ShoppingCategory} interface instead.
	 */

	/**
	 * Returns the primary key of this shopping category.
	 *
	 * @return the primary key of this shopping category
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this shopping category.
	 *
	 * @param primaryKey the primary key of this shopping category
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the category ID of this shopping category.
	 *
	 * @return the category ID of this shopping category
	 */
	public long getCategoryId();

	/**
	 * Sets the category ID of this shopping category.
	 *
	 * @param categoryId the category ID of this shopping category
	 */
	public void setCategoryId(long categoryId);

	/**
	 * Returns the group ID of this shopping category.
	 *
	 * @return the group ID of this shopping category
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this shopping category.
	 *
	 * @param groupId the group ID of this shopping category
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this shopping category.
	 *
	 * @return the company ID of this shopping category
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this shopping category.
	 *
	 * @param companyId the company ID of this shopping category
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this shopping category.
	 *
	 * @return the user ID of this shopping category
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this shopping category.
	 *
	 * @param userId the user ID of this shopping category
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this shopping category.
	 *
	 * @return the user uuid of this shopping category
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this shopping category.
	 *
	 * @param userUuid the user uuid of this shopping category
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this shopping category.
	 *
	 * @return the user name of this shopping category
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this shopping category.
	 *
	 * @param userName the user name of this shopping category
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this shopping category.
	 *
	 * @return the create date of this shopping category
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this shopping category.
	 *
	 * @param createDate the create date of this shopping category
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this shopping category.
	 *
	 * @return the modified date of this shopping category
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this shopping category.
	 *
	 * @param modifiedDate the modified date of this shopping category
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the parent category ID of this shopping category.
	 *
	 * @return the parent category ID of this shopping category
	 */
	public long getParentCategoryId();

	/**
	 * Sets the parent category ID of this shopping category.
	 *
	 * @param parentCategoryId the parent category ID of this shopping category
	 */
	public void setParentCategoryId(long parentCategoryId);

	/**
	 * Returns the name of this shopping category.
	 *
	 * @return the name of this shopping category
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this shopping category.
	 *
	 * @param name the name of this shopping category
	 */
	public void setName(String name);

	/**
	 * Returns the description of this shopping category.
	 *
	 * @return the description of this shopping category
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this shopping category.
	 *
	 * @param description the description of this shopping category
	 */
	public void setDescription(String description);

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

	public int compareTo(ShoppingCategory shoppingCategory);

	public int hashCode();

	public CacheModel<ShoppingCategory> toCacheModel();

	public ShoppingCategory toEscapedModel();

	public String toString();

	public String toXmlString();
}