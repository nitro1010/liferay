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
 * The utility for the portlet preferences local service. This utility wraps {@link com.liferay.portal.service.impl.PortletPreferencesLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PortletPreferencesLocalService
 * @see com.liferay.portal.service.base.PortletPreferencesLocalServiceBaseImpl
 * @see com.liferay.portal.service.impl.PortletPreferencesLocalServiceImpl
 * @generated
 */
public class PortletPreferencesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.PortletPreferencesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the portlet preferences to the database. Also notifies the appropriate model listeners.
	*
	* @param portletPreferences the portlet preferences
	* @return the portlet preferences that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.PortletPreferences addPortletPreferences(
		com.liferay.portal.model.PortletPreferences portletPreferences)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPortletPreferences(portletPreferences);
	}

	/**
	* Creates a new portlet preferences with the primary key. Does not add the portlet preferences to the database.
	*
	* @param portletPreferencesId the primary key for the new portlet preferences
	* @return the new portlet preferences
	*/
	public static com.liferay.portal.model.PortletPreferences createPortletPreferences(
		long portletPreferencesId) {
		return getService().createPortletPreferences(portletPreferencesId);
	}

	/**
	* Deletes the portlet preferences with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param portletPreferencesId the primary key of the portlet preferences
	* @throws PortalException if a portlet preferences with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deletePortletPreferences(long portletPreferencesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deletePortletPreferences(portletPreferencesId);
	}

	/**
	* Deletes the portlet preferences from the database. Also notifies the appropriate model listeners.
	*
	* @param portletPreferences the portlet preferences
	* @throws SystemException if a system exception occurred
	*/
	public static void deletePortletPreferences(
		com.liferay.portal.model.PortletPreferences portletPreferences)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deletePortletPreferences(portletPreferences);
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

	public static com.liferay.portal.model.PortletPreferences fetchPortletPreferences(
		long portletPreferencesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPortletPreferences(portletPreferencesId);
	}

	/**
	* Returns the portlet preferences with the primary key.
	*
	* @param portletPreferencesId the primary key of the portlet preferences
	* @return the portlet preferences
	* @throws PortalException if a portlet preferences with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.PortletPreferences getPortletPreferences(
		long portletPreferencesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortletPreferences(portletPreferencesId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the portlet preferenceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of portlet preferenceses
	* @param end the upper bound of the range of portlet preferenceses (not inclusive)
	* @return the range of portlet preferenceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.PortletPreferences> getPortletPreferenceses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortletPreferenceses(start, end);
	}

	/**
	* Returns the number of portlet preferenceses.
	*
	* @return the number of portlet preferenceses
	* @throws SystemException if a system exception occurred
	*/
	public static int getPortletPreferencesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortletPreferencesesCount();
	}

	/**
	* Updates the portlet preferences in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param portletPreferences the portlet preferences
	* @return the portlet preferences that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.PortletPreferences updatePortletPreferences(
		com.liferay.portal.model.PortletPreferences portletPreferences)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePortletPreferences(portletPreferences);
	}

	/**
	* Updates the portlet preferences in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param portletPreferences the portlet preferences
	* @param merge whether to merge the portlet preferences with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the portlet preferences that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.PortletPreferences updatePortletPreferences(
		com.liferay.portal.model.PortletPreferences portletPreferences,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePortletPreferences(portletPreferences, merge);
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

	public static com.liferay.portal.model.PortletPreferences addPortletPreferences(
		long companyId, long ownerId, int ownerType, long plid,
		java.lang.String portletId, com.liferay.portal.model.Portlet portlet,
		java.lang.String defaultPreferences)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addPortletPreferences(companyId, ownerId, ownerType, plid,
			portletId, portlet, defaultPreferences);
	}

	public static void deletePortletPreferences(long ownerId, int ownerType,
		long plid) throws com.liferay.portal.kernel.exception.SystemException {
		getService().deletePortletPreferences(ownerId, ownerType, plid);
	}

	public static void deletePortletPreferences(long ownerId, int ownerType,
		long plid, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deletePortletPreferences(ownerId, ownerType, plid, portletId);
	}

	public static javax.portlet.PortletPreferences getDefaultPreferences(
		long companyId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDefaultPreferences(companyId, portletId);
	}

	public static java.util.List<com.liferay.portal.model.PortletPreferences> getPortletPreferences()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortletPreferences();
	}

	public static java.util.List<com.liferay.portal.model.PortletPreferences> getPortletPreferences(
		int ownerType, long plid, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortletPreferences(ownerType, plid, portletId);
	}

	public static java.util.List<com.liferay.portal.model.PortletPreferences> getPortletPreferences(
		long ownerId, int ownerType, long plid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortletPreferences(ownerId, ownerType, plid);
	}

	public static com.liferay.portal.model.PortletPreferences getPortletPreferences(
		long ownerId, int ownerType, long plid, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getPortletPreferences(ownerId, ownerType, plid, portletId);
	}

	public static java.util.List<com.liferay.portal.model.PortletPreferences> getPortletPreferences(
		long companyId, long groupId, long ownerId, int ownerType,
		java.lang.String portletId, boolean privateLayout)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getPortletPreferences(companyId, groupId, ownerId,
			ownerType, portletId, privateLayout);
	}

	public static java.util.List<com.liferay.portal.model.PortletPreferences> getPortletPreferences(
		long plid, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortletPreferences(plid, portletId);
	}

	public static java.util.List<com.liferay.portal.model.PortletPreferences> getPortletPreferencesByPlid(
		long plid) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPortletPreferencesByPlid(plid);
	}

	public static javax.portlet.PortletPreferences getPreferences(
		long companyId, long ownerId, int ownerType, long plid,
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getPreferences(companyId, ownerId, ownerType, plid,
			portletId);
	}

	public static javax.portlet.PortletPreferences getPreferences(
		long companyId, long ownerId, int ownerType, long plid,
		java.lang.String portletId, java.lang.String defaultPreferences)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getPreferences(companyId, ownerId, ownerType, plid,
			portletId, defaultPreferences);
	}

	public static javax.portlet.PortletPreferences getPreferences(
		com.liferay.portal.model.PortletPreferencesIds portletPreferencesIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPreferences(portletPreferencesIds);
	}

	public static javax.portlet.PortletPreferences getStrictPreferences(
		long companyId, long ownerId, int ownerType, long plid,
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getStrictPreferences(companyId, ownerId, ownerType, plid,
			portletId);
	}

	public static javax.portlet.PortletPreferences getStrictPreferences(
		com.liferay.portal.model.PortletPreferencesIds portletPreferencesIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStrictPreferences(portletPreferencesIds);
	}

	public static com.liferay.portal.model.PortletPreferences updatePreferences(
		long ownerId, int ownerType, long plid, java.lang.String portletId,
		javax.portlet.PortletPreferences portletPreferences)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatePreferences(ownerId, ownerType, plid, portletId,
			portletPreferences);
	}

	public static com.liferay.portal.model.PortletPreferences updatePreferences(
		long ownerId, int ownerType, long plid, java.lang.String portletId,
		java.lang.String xml)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatePreferences(ownerId, ownerType, plid, portletId, xml);
	}

	public static PortletPreferencesLocalService getService() {
		if (_service == null) {
			_service = (PortletPreferencesLocalService)PortalBeanLocatorUtil.locate(PortletPreferencesLocalService.class.getName());

			ReferenceRegistry.registerReference(PortletPreferencesLocalServiceUtil.class,
				"_service");
			MethodCache.remove(PortletPreferencesLocalService.class);
		}

		return _service;
	}

	public void setService(PortletPreferencesLocalService service) {
		MethodCache.remove(PortletPreferencesLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(PortletPreferencesLocalServiceUtil.class,
			"_service");
		MethodCache.remove(PortletPreferencesLocalService.class);
	}

	private static PortletPreferencesLocalService _service;
}