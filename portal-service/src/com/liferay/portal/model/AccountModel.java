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
 * The base model interface for the Account service. Represents a row in the &quot;Account_&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.AccountModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.AccountImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Account
 * @see com.liferay.portal.model.impl.AccountImpl
 * @see com.liferay.portal.model.impl.AccountModelImpl
 * @generated
 */
public interface AccountModel extends AuditedModel, BaseModel<Account> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a account model instance should use the {@link Account} interface instead.
	 */

	/**
	 * Returns the primary key of this account.
	 *
	 * @return the primary key of this account
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this account.
	 *
	 * @param primaryKey the primary key of this account
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the account ID of this account.
	 *
	 * @return the account ID of this account
	 */
	public long getAccountId();

	/**
	 * Sets the account ID of this account.
	 *
	 * @param accountId the account ID of this account
	 */
	public void setAccountId(long accountId);

	/**
	 * Returns the company ID of this account.
	 *
	 * @return the company ID of this account
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this account.
	 *
	 * @param companyId the company ID of this account
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this account.
	 *
	 * @return the user ID of this account
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this account.
	 *
	 * @param userId the user ID of this account
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this account.
	 *
	 * @return the user uuid of this account
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this account.
	 *
	 * @param userUuid the user uuid of this account
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this account.
	 *
	 * @return the user name of this account
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this account.
	 *
	 * @param userName the user name of this account
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this account.
	 *
	 * @return the create date of this account
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this account.
	 *
	 * @param createDate the create date of this account
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this account.
	 *
	 * @return the modified date of this account
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this account.
	 *
	 * @param modifiedDate the modified date of this account
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the parent account ID of this account.
	 *
	 * @return the parent account ID of this account
	 */
	public long getParentAccountId();

	/**
	 * Sets the parent account ID of this account.
	 *
	 * @param parentAccountId the parent account ID of this account
	 */
	public void setParentAccountId(long parentAccountId);

	/**
	 * Returns the name of this account.
	 *
	 * @return the name of this account
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this account.
	 *
	 * @param name the name of this account
	 */
	public void setName(String name);

	/**
	 * Returns the legal name of this account.
	 *
	 * @return the legal name of this account
	 */
	@AutoEscape
	public String getLegalName();

	/**
	 * Sets the legal name of this account.
	 *
	 * @param legalName the legal name of this account
	 */
	public void setLegalName(String legalName);

	/**
	 * Returns the legal ID of this account.
	 *
	 * @return the legal ID of this account
	 */
	@AutoEscape
	public String getLegalId();

	/**
	 * Sets the legal ID of this account.
	 *
	 * @param legalId the legal ID of this account
	 */
	public void setLegalId(String legalId);

	/**
	 * Returns the legal type of this account.
	 *
	 * @return the legal type of this account
	 */
	@AutoEscape
	public String getLegalType();

	/**
	 * Sets the legal type of this account.
	 *
	 * @param legalType the legal type of this account
	 */
	public void setLegalType(String legalType);

	/**
	 * Returns the sic code of this account.
	 *
	 * @return the sic code of this account
	 */
	@AutoEscape
	public String getSicCode();

	/**
	 * Sets the sic code of this account.
	 *
	 * @param sicCode the sic code of this account
	 */
	public void setSicCode(String sicCode);

	/**
	 * Returns the ticker symbol of this account.
	 *
	 * @return the ticker symbol of this account
	 */
	@AutoEscape
	public String getTickerSymbol();

	/**
	 * Sets the ticker symbol of this account.
	 *
	 * @param tickerSymbol the ticker symbol of this account
	 */
	public void setTickerSymbol(String tickerSymbol);

	/**
	 * Returns the industry of this account.
	 *
	 * @return the industry of this account
	 */
	@AutoEscape
	public String getIndustry();

	/**
	 * Sets the industry of this account.
	 *
	 * @param industry the industry of this account
	 */
	public void setIndustry(String industry);

	/**
	 * Returns the type of this account.
	 *
	 * @return the type of this account
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this account.
	 *
	 * @param type the type of this account
	 */
	public void setType(String type);

	/**
	 * Returns the size of this account.
	 *
	 * @return the size of this account
	 */
	@AutoEscape
	public String getSize();

	/**
	 * Sets the size of this account.
	 *
	 * @param size the size of this account
	 */
	public void setSize(String size);

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

	public int compareTo(Account account);

	public int hashCode();

	public CacheModel<Account> toCacheModel();

	public Account toEscapedModel();

	public String toString();

	public String toXmlString();
}