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
 * The utility for the company local service. This utility wraps {@link com.liferay.portal.service.impl.CompanyLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyLocalService
 * @see com.liferay.portal.service.base.CompanyLocalServiceBaseImpl
 * @see com.liferay.portal.service.impl.CompanyLocalServiceImpl
 * @generated
 */
public class CompanyLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.CompanyLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the company to the database. Also notifies the appropriate model listeners.
	*
	* @param company the company
	* @return the company that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company addCompany(
		com.liferay.portal.model.Company company)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCompany(company);
	}

	/**
	* Creates a new company with the primary key. Does not add the company to the database.
	*
	* @param companyId the primary key for the new company
	* @return the new company
	*/
	public static com.liferay.portal.model.Company createCompany(long companyId) {
		return getService().createCompany(companyId);
	}

	/**
	* Deletes the company with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param companyId the primary key of the company
	* @throws PortalException if a company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteCompany(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCompany(companyId);
	}

	/**
	* Deletes the company from the database. Also notifies the appropriate model listeners.
	*
	* @param company the company
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteCompany(com.liferay.portal.model.Company company)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCompany(company);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.liferay.portal.model.Company fetchCompany(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCompany(companyId);
	}

	/**
	* Returns the company with the primary key.
	*
	* @param companyId the primary key of the company
	* @return the company
	* @throws PortalException if a company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company getCompany(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompany(companyId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the companies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of companies
	* @param end the upper bound of the range of companies (not inclusive)
	* @return the range of companies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.Company> getCompanies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanies(start, end);
	}

	/**
	* Returns the number of companies.
	*
	* @return the number of companies
	* @throws SystemException if a system exception occurred
	*/
	public static int getCompaniesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompaniesCount();
	}

	/**
	* Updates the company in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param company the company
	* @return the company that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company updateCompany(
		com.liferay.portal.model.Company company)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCompany(company);
	}

	/**
	* Updates the company in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param company the company
	* @param merge whether to merge the company with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the company that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company updateCompany(
		com.liferay.portal.model.Company company, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCompany(company, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	/**
	* Adds a company.
	*
	* @param webId the the company's web domain
	* @param virtualHostname the company's virtual host name
	* @param mx the company's mail domain
	* @param shardName the company's shard
	* @param system whether the company is the very first company (i.e., the
	super company)
	* @param maxUsers the max number of company users (optionally
	<code>0</code>)
	* @param active whether the company is active
	* @return the company
	* @throws PortalException if the web domain, virtual host name, or mail
	domain was invalid
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company addCompany(
		java.lang.String webId, java.lang.String virtualHostname,
		java.lang.String mx, java.lang.String shardName, boolean system,
		int maxUsers, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCompany(webId, virtualHostname, mx, shardName, system,
			maxUsers, active);
	}

	/**
	* Returns the company with the web domain.
	*
	* The method sets mail domain to the web domain, and the shard name to
	* the default name set in portal.properties
	*
	* @param webId the company's web domain
	* @return the company with the web domain
	* @throws PortalException if a portal exception occurred
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company checkCompany(
		java.lang.String webId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().checkCompany(webId);
	}

	/**
	* Returns the company with the web domain, mail domain, and shard. If no
	* such company exits, the method will create a new company.
	*
	* The method goes through a series of checks to ensure that the company
	* contains default users, groups, etc.
	*
	* @param webId the company's web domain
	* @param mx the company's mail domain
	* @param shardName the company's shard
	* @return the company with the web domain, mail domain, and shard
	* @throws PortalException if a portal exception occurred
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company checkCompany(
		java.lang.String webId, java.lang.String mx, java.lang.String shardName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().checkCompany(webId, mx, shardName);
	}

	/**
	* Checks if the company has an encryption key. It will create a key if one
	* does not exist.
	*
	* @param companyId the primary key of the company
	* @throws PortalException if a company with the primary key could not be
	found
	* @throws SystemException if a system exception occurred
	*/
	public static void checkCompanyKey(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().checkCompanyKey(companyId);
	}

	/**
	* Deletes the company's logo.
	*
	* @param companyId the primary key of the company
	* @throws PortalException if the company with the primary key could not be
	found or if the company's logo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLogo(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLogo(companyId);
	}

	/**
	* Returns the company with the primary key.
	*
	* @param companyId the primary key of the company
	* @return the company with the primary key, <code>null</code> if a company
	with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company fetchCompanyById(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCompanyById(companyId);
	}

	/**
	* Returns the company with the virtual host name.
	*
	* @param virtualHostname the virtual host name
	* @return the company with the virtual host name, <code>null</code> if a
	company with the virtual host could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company fetchCompanyByVirtualHost(
		java.lang.String virtualHostname)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCompanyByVirtualHost(virtualHostname);
	}

	/**
	* Returns all the companies.
	*
	* @return the companies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.Company> getCompanies()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanies();
	}

	/**
	* Returns all the companies used by WSRP.
	*
	* @param system whether the company is the very first company (i.e., the
	super company)
	* @return the companies used by WSRP
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.Company> getCompanies(
		boolean system)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanies(system);
	}

	/**
	* Returns the number of companies used by WSRP.
	*
	* @param system whether the company is the very first company (i.e., the
	super company)
	* @return the number of companies used by WSRP
	* @throws SystemException if a system exception occurred
	*/
	public static int getCompaniesCount(boolean system)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompaniesCount(system);
	}

	/**
	* Returns the company with the primary key.
	*
	* @param companyId the primary key of the company
	* @return the company with the primary key
	* @throws PortalException if a company with the primary key could not be
	found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company getCompanyById(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyById(companyId);
	}

	/**
	* Returns the company with the logo.
	*
	* @param logoId the ID of the company's logo
	* @return the company with the logo
	* @throws PortalException if the company with the logo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company getCompanyByLogoId(
		long logoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyByLogoId(logoId);
	}

	/**
	* Returns the company with the mail domain.
	*
	* @param mx the company's mail domain
	* @return the company with the mail domain
	* @throws PortalException if the company with the mail domain could not be
	found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company getCompanyByMx(
		java.lang.String mx)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyByMx(mx);
	}

	/**
	* Returns the company with the virtual host name.
	*
	* @param virtualHostname the company's virtual host name
	* @return the company with the virtual host name
	* @throws PortalException if the company with the virtual host name could
	not be found or if the virtual host was not associated with a
	company
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company getCompanyByVirtualHost(
		java.lang.String virtualHostname)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyByVirtualHost(virtualHostname);
	}

	/**
	* Returns the company with the web domain.
	*
	* @param webId the company's web domain
	* @return the company with the web domain
	* @throws PortalException if the company with the web domain could not be
	found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company getCompanyByWebId(
		java.lang.String webId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyByWebId(webId);
	}

	/**
	* Returns the user's company.
	*
	* @param userId the primary key of the user
	* @return Returns the first company if there is only one company or the
	user's company if there are more than one company; <code>0</code>
	otherwise
	* @throws Exception if a user with the primary key could not be found
	*/
	public static long getCompanyIdByUserId(long userId)
		throws java.lang.Exception {
		return getService().getCompanyIdByUserId(userId);
	}

	/**
	* Removes the values that match the keys of the company's preferences.
	*
	* This method is called by {@link
	* com.liferay.portlet.portalsettings.action.EditLDAPServerAction} remotely
	* through {@link com.liferay.portal.service.CompanyService}.
	*
	* @param companyId the primary key of the company
	* @param keys the company's preferences keys to be remove
	* @throws SystemException if a system exception occurred
	*/
	public static void removePreferences(long companyId, java.lang.String[] keys)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removePreferences(companyId, keys);
	}

	/**
	* Returns an ordered range of all assets that match the keywords in the
	* company.
	*
	* The method is called in {@link
	* com.liferay.portal.search.PortalOpenSearchImpl} which is not longer used
	* by the Search portlet.
	*
	* @param companyId the primary key of the company
	* @param userId the primary key of the user
	* @param keywords the keywords (space separated),which may occur in assets
	in the company (optionally <code>null</code>)
	* @param start the lower bound of the range of assets to return
	* @param end the upper bound of the range of assets to return (not
	inclusive)
	* @return the matching assets in the company
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.kernel.search.Hits search(long companyId,
		long userId, java.lang.String keywords, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().search(companyId, userId, keywords, start, end);
	}

	/**
	* Returns an ordered range of all assets that match the keywords in the
	* portlet within the company.
	*
	* @param companyId the primary key of the company
	* @param userId the primary key of the user
	* @param portletId the primary key of the portlet (optionally
	<code>null</code>)
	* @param groupId the primary key of the group (optionally <code>0</code>)
	* @param type the mime type of assets to return(optionally
	<code>null</code>)
	* @param keywords the keywords (space separated), which may occur in any
	assets in the portlet (optionally <code>null</code>)
	* @param start the lower bound of the range of assets to return
	* @param end the upper bound of the range of assets to return (not
	inclusive)
	* @return the matching assets in the portlet within the company
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.kernel.search.Hits search(long companyId,
		long userId, java.lang.String portletId, long groupId,
		java.lang.String type, java.lang.String keywords, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .search(companyId, userId, portletId, groupId, type,
			keywords, start, end);
	}

	/**
	* Updates the company.
	*
	* @param companyId the primary key of the company
	* @param virtualHostname the company's virtual host name
	* @param mx the company's mail domain
	* @param maxUsers the max number of company users (optionally
	<code>0</code>)
	* @param active whether the company is active
	* @return the company with the primary key
	* @throws PortalException if a company with primary key could not be found
	or if the new information was invalid
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company updateCompany(
		long companyId, java.lang.String virtualHostname, java.lang.String mx,
		int maxUsers, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateCompany(companyId, virtualHostname, mx, maxUsers,
			active);
	}

	/**
	* Update the company with additional account information.
	*
	* @param companyId the primary key of the company
	* @param virtualHostname the company's virtual host name
	* @param mx the company's mail domain
	* @param homeURL the company's home URL (optionally <code>null</code>)
	* @param name the company's account name(optionally <code>null</code>)
	* @param legalName the company's account legal name (optionally
	<code>null</code>)
	* @param legalId the company's account legal ID (optionally
	<code>null</code>)
	* @param legalType the company's account legal type (optionally
	<code>null</code>)
	* @param sicCode the company's account SIC code (optionally
	<code>null</code>)
	* @param tickerSymbol the company's account ticker symbol (optionally
	<code>null</code>)
	* @param industry the company's account industry (optionally
	<code>null</code>)
	* @param type the company's account type (optionally <code>null</code>)
	* @param size the company's account size (optionally <code>null</code>)
	* @return the company with the primary key
	* @throws PortalException if a company with the primary key could not be
	found or if the new information was invalid
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company updateCompany(
		long companyId, java.lang.String virtualHostname, java.lang.String mx,
		java.lang.String homeURL, java.lang.String name,
		java.lang.String legalName, java.lang.String legalId,
		java.lang.String legalType, java.lang.String sicCode,
		java.lang.String tickerSymbol, java.lang.String industry,
		java.lang.String type, java.lang.String size)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateCompany(companyId, virtualHostname, mx, homeURL,
			name, legalName, legalId, legalType, sicCode, tickerSymbol,
			industry, type, size);
	}

	/**
	* Update the company's display.
	*
	* @param companyId the primary key of the company
	* @param languageId the ID of the company's default user's language
	* @param timeZoneId the ID of the company's default user's time zone
	* @throws PortalException if the company's default user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void updateDisplay(long companyId,
		java.lang.String languageId, java.lang.String timeZoneId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().updateDisplay(companyId, languageId, timeZoneId);
	}

	/**
	* Updates the company's logo.
	*
	* @param companyId the primary key of the company
	* @param bytes the bytes of the company's logo image
	* @return the company with the primary key
	* @throws PortalException if the company's logo ID could not be found or if
	the logo's image was corrupted
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company updateLogo(long companyId,
		byte[] bytes)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLogo(companyId, bytes);
	}

	/**
	* Updates the company's logo.
	*
	* @param companyId the primary key of the company
	* @param file the file of the company's logo image
	* @return the company with the primary key
	* @throws PortalException the company's logo ID could not be found or if
	the logo's image was corrupted
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company updateLogo(long companyId,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLogo(companyId, file);
	}

	/**
	* Update the company's logo.
	*
	* @param companyId the primary key of the company
	* @param is the input stream of the company's logo image
	* @return the company with the primary key
	* @throws PortalException if the company's logo ID could not be found or if
	the company's logo image was corrupted
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Company updateLogo(long companyId,
		java.io.InputStream is)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLogo(companyId, is);
	}

	/**
	* Updates the company's preferences. The company's default properties are
	* found in portal.properties.
	*
	* @param companyId the primary key of the company
	* @param properties the company's properties. See {@link
	com.liferay.portal.kernel.util.UnicodeProperties}
	* @throws PortalException if the properties contained new locales that were
	not supported
	* @throws SystemException if a system exception occurred
	*/
	public static void updatePreferences(long companyId,
		com.liferay.portal.kernel.util.UnicodeProperties properties)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().updatePreferences(companyId, properties);
	}

	/**
	* Updates the company's security properties.
	*
	* @param companyId the primary key of the company
	* @param authType the company's method of authenticating users
	* @param autoLogin whether to allow users to select the "remember me"
	feature
	* @param sendPassword whether to allow users to ask the company to send
	their password
	* @param strangers whether to allow strangers to create accounts register
	themselves in the company
	* @param strangersWithMx whether to allow strangers to create accounts
	with email addresses that match the company mail suffix
	* @param strangersVerify whether to require strangers who create accounts
	to be verified via email
	* @param siteLogo whether to allow site administrators to use their own
	logo instead of the enterprise logo
	* @throws SystemException if a system exception occurred
	*/
	public static void updateSecurity(long companyId,
		java.lang.String authType, boolean autoLogin, boolean sendPassword,
		boolean strangers, boolean strangersWithMx, boolean strangersVerify,
		boolean siteLogo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateSecurity(companyId, authType, autoLogin, sendPassword,
			strangers, strangersWithMx, strangersVerify, siteLogo);
	}

	public static CompanyLocalService getService() {
		if (_service == null) {
			_service = (CompanyLocalService)PortalBeanLocatorUtil.locate(CompanyLocalService.class.getName());

			ReferenceRegistry.registerReference(CompanyLocalServiceUtil.class,
				"_service");
			MethodCache.remove(CompanyLocalService.class);
		}

		return _service;
	}

	public void setService(CompanyLocalService service) {
		MethodCache.remove(CompanyLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(CompanyLocalServiceUtil.class,
			"_service");
		MethodCache.remove(CompanyLocalService.class);
	}

	private static CompanyLocalService _service;
}