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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PasswordTracker service. Represents a row in the &quot;PasswordTracker&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.PasswordTrackerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.PasswordTrackerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PasswordTracker
 * @see com.liferay.portal.model.impl.PasswordTrackerImpl
 * @see com.liferay.portal.model.impl.PasswordTrackerModelImpl
 * @generated
 */
public interface PasswordTrackerModel extends BaseModel<PasswordTracker> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a password tracker model instance should use the {@link PasswordTracker} interface instead.
	 */

	/**
	 * Returns the primary key of this password tracker.
	 *
	 * @return the primary key of this password tracker
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this password tracker.
	 *
	 * @param primaryKey the primary key of this password tracker
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the password tracker ID of this password tracker.
	 *
	 * @return the password tracker ID of this password tracker
	 */
	public long getPasswordTrackerId();

	/**
	 * Sets the password tracker ID of this password tracker.
	 *
	 * @param passwordTrackerId the password tracker ID of this password tracker
	 */
	public void setPasswordTrackerId(long passwordTrackerId);

	/**
	 * Returns the user ID of this password tracker.
	 *
	 * @return the user ID of this password tracker
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this password tracker.
	 *
	 * @param userId the user ID of this password tracker
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this password tracker.
	 *
	 * @return the user uuid of this password tracker
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this password tracker.
	 *
	 * @param userUuid the user uuid of this password tracker
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this password tracker.
	 *
	 * @return the create date of this password tracker
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this password tracker.
	 *
	 * @param createDate the create date of this password tracker
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the password of this password tracker.
	 *
	 * @return the password of this password tracker
	 */
	@AutoEscape
	public String getPassword();

	/**
	 * Sets the password of this password tracker.
	 *
	 * @param password the password of this password tracker
	 */
	public void setPassword(String password);

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

	public int compareTo(PasswordTracker passwordTracker);

	public int hashCode();

	public CacheModel<PasswordTracker> toCacheModel();

	public PasswordTracker toEscapedModel();

	public String toString();

	public String toXmlString();
}