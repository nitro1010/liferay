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
 * The utility for the portlet local service. This utility wraps {@link com.liferay.portal.service.impl.PortletLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PortletLocalService
 * @see com.liferay.portal.service.base.PortletLocalServiceBaseImpl
 * @see com.liferay.portal.service.impl.PortletLocalServiceImpl
 * @generated
 */
public class PortletLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.PortletLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the portlet to the database. Also notifies the appropriate model listeners.
	*
	* @param portlet the portlet
	* @return the portlet that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Portlet addPortlet(
		com.liferay.portal.model.Portlet portlet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPortlet(portlet);
	}

	/**
	* Creates a new portlet with the primary key. Does not add the portlet to the database.
	*
	* @param id the primary key for the new portlet
	* @return the new portlet
	*/
	public static com.liferay.portal.model.Portlet createPortlet(long id) {
		return getService().createPortlet(id);
	}

	/**
	* Deletes the portlet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the portlet
	* @throws PortalException if a portlet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deletePortlet(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deletePortlet(id);
	}

	/**
	* Deletes the portlet from the database. Also notifies the appropriate model listeners.
	*
	* @param portlet the portlet
	* @throws SystemException if a system exception occurred
	*/
	public static void deletePortlet(com.liferay.portal.model.Portlet portlet)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deletePortlet(portlet);
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

	public static com.liferay.portal.model.Portlet fetchPortlet(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPortlet(id);
	}

	/**
	* Returns the portlet with the primary key.
	*
	* @param id the primary key of the portlet
	* @return the portlet
	* @throws PortalException if a portlet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Portlet getPortlet(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortlet(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the portlets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of portlets
	* @param end the upper bound of the range of portlets (not inclusive)
	* @return the range of portlets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.Portlet> getPortlets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortlets(start, end);
	}

	/**
	* Returns the number of portlets.
	*
	* @return the number of portlets
	* @throws SystemException if a system exception occurred
	*/
	public static int getPortletsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortletsCount();
	}

	/**
	* Updates the portlet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param portlet the portlet
	* @return the portlet that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Portlet updatePortlet(
		com.liferay.portal.model.Portlet portlet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePortlet(portlet);
	}

	/**
	* Updates the portlet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param portlet the portlet
	* @param merge whether to merge the portlet with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the portlet that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Portlet updatePortlet(
		com.liferay.portal.model.Portlet portlet, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePortlet(portlet, merge);
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

	public static void addPortletCategory(long companyId,
		java.lang.String categoryName) {
		getService().addPortletCategory(companyId, categoryName);
	}

	public static void checkPortlet(com.liferay.portal.model.Portlet portlet)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().checkPortlet(portlet);
	}

	public static void checkPortlets(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().checkPortlets(companyId);
	}

	public static void clearCache() {
		getService().clearCache();
	}

	public static void clearCompanyPortletsPool() {
		getService().clearCompanyPortletsPool();
	}

	/**
	* @deprecated {@link #clonePortlet(String)}
	*/
	public static com.liferay.portal.model.Portlet clonePortlet(
		long companyId, java.lang.String portletId) {
		return getService().clonePortlet(companyId, portletId);
	}

	public static com.liferay.portal.model.Portlet clonePortlet(
		java.lang.String portletId) {
		return getService().clonePortlet(portletId);
	}

	public static com.liferay.portal.model.Portlet deployRemotePortlet(
		com.liferay.portal.model.Portlet portlet, java.lang.String categoryName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deployRemotePortlet(portlet, categoryName);
	}

	public static com.liferay.portal.model.Portlet deployRemotePortlet(
		com.liferay.portal.model.Portlet portlet,
		java.lang.String[] categoryNames)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deployRemotePortlet(portlet, categoryNames);
	}

	public static void destroyPortlet(com.liferay.portal.model.Portlet portlet) {
		getService().destroyPortlet(portlet);
	}

	public static void destroyRemotePortlet(
		com.liferay.portal.model.Portlet portlet) {
		getService().destroyRemotePortlet(portlet);
	}

	public static java.util.List<com.liferay.portlet.expando.model.CustomAttributesDisplay> getCustomAttributesDisplays() {
		return getService().getCustomAttributesDisplays();
	}

	public static com.liferay.portal.model.PortletCategory getEARDisplay(
		java.lang.String xml)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEARDisplay(xml);
	}

	public static java.util.List<com.liferay.portal.model.Portlet> getFriendlyURLMapperPortlets() {
		return getService().getFriendlyURLMapperPortlets();
	}

	public static java.util.List<com.liferay.portal.kernel.portlet.FriendlyURLMapper> getFriendlyURLMappers() {
		return getService().getFriendlyURLMappers();
	}

	public static com.liferay.portal.model.PortletApp getPortletApp(
		java.lang.String servletContextName) {
		return getService().getPortletApp(servletContextName);
	}

	public static com.liferay.portal.model.Portlet getPortletById(
		long companyId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortletById(companyId, portletId);
	}

	public static com.liferay.portal.model.Portlet getPortletById(
		java.lang.String portletId) {
		return getService().getPortletById(portletId);
	}

	public static com.liferay.portal.model.Portlet getPortletByStrutsPath(
		long companyId, java.lang.String strutsPath)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortletByStrutsPath(companyId, strutsPath);
	}

	public static java.util.List<com.liferay.portal.model.Portlet> getPortlets() {
		return getService().getPortlets();
	}

	public static java.util.List<com.liferay.portal.model.Portlet> getPortlets(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortlets(companyId);
	}

	public static java.util.List<com.liferay.portal.model.Portlet> getPortlets(
		long companyId, boolean showSystem, boolean showPortal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortlets(companyId, showSystem, showPortal);
	}

	public static java.util.List<com.liferay.portal.model.Portlet> getScopablePortlets() {
		return getService().getScopablePortlets();
	}

	public static com.liferay.portal.model.PortletCategory getWARDisplay(
		java.lang.String servletContextName, java.lang.String xml)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getWARDisplay(servletContextName, xml);
	}

	public static boolean hasPortlet(long companyId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasPortlet(companyId, portletId);
	}

	public static void initEAR(javax.servlet.ServletContext servletContext,
		java.lang.String[] xmls,
		com.liferay.portal.kernel.plugin.PluginPackage pluginPackage) {
		getService().initEAR(servletContext, xmls, pluginPackage);
	}

	public static java.util.List<com.liferay.portal.model.Portlet> initWAR(
		java.lang.String servletContextName,
		javax.servlet.ServletContext servletContext, java.lang.String[] xmls,
		com.liferay.portal.kernel.plugin.PluginPackage pluginPackage) {
		return getService()
				   .initWAR(servletContextName, servletContext, xmls,
			pluginPackage);
	}

	public static java.util.Map<java.lang.String, com.liferay.portal.model.Portlet> loadGetPortletsPool(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().loadGetPortletsPool(companyId);
	}

	public static void removeCompanyPortletsPool(long companyId) {
		getService().removeCompanyPortletsPool(companyId);
	}

	public static com.liferay.portal.model.Portlet updatePortlet(
		long companyId, java.lang.String portletId, java.lang.String roles,
		boolean active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePortlet(companyId, portletId, roles, active);
	}

	public static PortletLocalService getService() {
		if (_service == null) {
			_service = (PortletLocalService)PortalBeanLocatorUtil.locate(PortletLocalService.class.getName());

			ReferenceRegistry.registerReference(PortletLocalServiceUtil.class,
				"_service");
			MethodCache.remove(PortletLocalService.class);
		}

		return _service;
	}

	public void setService(PortletLocalService service) {
		MethodCache.remove(PortletLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(PortletLocalServiceUtil.class,
			"_service");
		MethodCache.remove(PortletLocalService.class);
	}

	private static PortletLocalService _service;
}