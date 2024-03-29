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

package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.model.Resource;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the resource service. This utility wraps {@link ResourcePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResourcePersistence
 * @see ResourcePersistenceImpl
 * @generated
 */
public class ResourceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Resource resource) {
		getPersistence().clearCache(resource);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Resource> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Resource> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Resource> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Resource update(Resource resource, boolean merge)
		throws SystemException {
		return getPersistence().update(resource, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Resource update(Resource resource, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(resource, merge, serviceContext);
	}

	/**
	* Caches the resource in the entity cache if it is enabled.
	*
	* @param resource the resource
	*/
	public static void cacheResult(com.liferay.portal.model.Resource resource) {
		getPersistence().cacheResult(resource);
	}

	/**
	* Caches the resources in the entity cache if it is enabled.
	*
	* @param resources the resources
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portal.model.Resource> resources) {
		getPersistence().cacheResult(resources);
	}

	/**
	* Creates a new resource with the primary key. Does not add the resource to the database.
	*
	* @param resourceId the primary key for the new resource
	* @return the new resource
	*/
	public static com.liferay.portal.model.Resource create(long resourceId) {
		return getPersistence().create(resourceId);
	}

	/**
	* Removes the resource with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resourceId the primary key of the resource
	* @return the resource that was removed
	* @throws com.liferay.portal.NoSuchResourceException if a resource with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Resource remove(long resourceId)
		throws com.liferay.portal.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(resourceId);
	}

	public static com.liferay.portal.model.Resource updateImpl(
		com.liferay.portal.model.Resource resource, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(resource, merge);
	}

	/**
	* Returns the resource with the primary key or throws a {@link com.liferay.portal.NoSuchResourceException} if it could not be found.
	*
	* @param resourceId the primary key of the resource
	* @return the resource
	* @throws com.liferay.portal.NoSuchResourceException if a resource with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Resource findByPrimaryKey(
		long resourceId)
		throws com.liferay.portal.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(resourceId);
	}

	/**
	* Returns the resource with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param resourceId the primary key of the resource
	* @return the resource, or <code>null</code> if a resource with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Resource fetchByPrimaryKey(
		long resourceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(resourceId);
	}

	/**
	* Returns all the resources where codeId = &#63;.
	*
	* @param codeId the code ID
	* @return the matching resources
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.Resource> findByCodeId(
		long codeId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCodeId(codeId);
	}

	/**
	* Returns a range of all the resources where codeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param codeId the code ID
	* @param start the lower bound of the range of resources
	* @param end the upper bound of the range of resources (not inclusive)
	* @return the range of matching resources
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.Resource> findByCodeId(
		long codeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCodeId(codeId, start, end);
	}

	/**
	* Returns an ordered range of all the resources where codeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param codeId the code ID
	* @param start the lower bound of the range of resources
	* @param end the upper bound of the range of resources (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching resources
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.Resource> findByCodeId(
		long codeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCodeId(codeId, start, end, orderByComparator);
	}

	/**
	* Returns the first resource in the ordered set where codeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param codeId the code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resource
	* @throws com.liferay.portal.NoSuchResourceException if a matching resource could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Resource findByCodeId_First(
		long codeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCodeId_First(codeId, orderByComparator);
	}

	/**
	* Returns the last resource in the ordered set where codeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param codeId the code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resource
	* @throws com.liferay.portal.NoSuchResourceException if a matching resource could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Resource findByCodeId_Last(
		long codeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCodeId_Last(codeId, orderByComparator);
	}

	/**
	* Returns the resources before and after the current resource in the ordered set where codeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param resourceId the primary key of the current resource
	* @param codeId the code ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next resource
	* @throws com.liferay.portal.NoSuchResourceException if a resource with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Resource[] findByCodeId_PrevAndNext(
		long resourceId, long codeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCodeId_PrevAndNext(resourceId, codeId,
			orderByComparator);
	}

	/**
	* Returns the resource where codeId = &#63; and primKey = &#63; or throws a {@link com.liferay.portal.NoSuchResourceException} if it could not be found.
	*
	* @param codeId the code ID
	* @param primKey the prim key
	* @return the matching resource
	* @throws com.liferay.portal.NoSuchResourceException if a matching resource could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Resource findByC_P(long codeId,
		java.lang.String primKey)
		throws com.liferay.portal.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_P(codeId, primKey);
	}

	/**
	* Returns the resource where codeId = &#63; and primKey = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param codeId the code ID
	* @param primKey the prim key
	* @return the matching resource, or <code>null</code> if a matching resource could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Resource fetchByC_P(long codeId,
		java.lang.String primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_P(codeId, primKey);
	}

	/**
	* Returns the resource where codeId = &#63; and primKey = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param codeId the code ID
	* @param primKey the prim key
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching resource, or <code>null</code> if a matching resource could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Resource fetchByC_P(long codeId,
		java.lang.String primKey, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_P(codeId, primKey, retrieveFromCache);
	}

	/**
	* Returns all the resources.
	*
	* @return the resources
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.Resource> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the resources.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of resources
	* @param end the upper bound of the range of resources (not inclusive)
	* @return the range of resources
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.Resource> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the resources.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of resources
	* @param end the upper bound of the range of resources (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of resources
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.Resource> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the resources where codeId = &#63; from the database.
	*
	* @param codeId the code ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCodeId(long codeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCodeId(codeId);
	}

	/**
	* Removes the resource where codeId = &#63; and primKey = &#63; from the database.
	*
	* @param codeId the code ID
	* @param primKey the prim key
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_P(long codeId, java.lang.String primKey)
		throws com.liferay.portal.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_P(codeId, primKey);
	}

	/**
	* Removes all the resources from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of resources where codeId = &#63;.
	*
	* @param codeId the code ID
	* @return the number of matching resources
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCodeId(long codeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCodeId(codeId);
	}

	/**
	* Returns the number of resources where codeId = &#63; and primKey = &#63;.
	*
	* @param codeId the code ID
	* @param primKey the prim key
	* @return the number of matching resources
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_P(long codeId, java.lang.String primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_P(codeId, primKey);
	}

	/**
	* Returns the number of resources.
	*
	* @return the number of resources
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ResourcePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ResourcePersistence)PortalBeanLocatorUtil.locate(ResourcePersistence.class.getName());

			ReferenceRegistry.registerReference(ResourceUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(ResourcePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(ResourceUtil.class, "_persistence");
	}

	private static ResourcePersistence _persistence;
}