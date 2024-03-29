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
import com.liferay.portal.model.UserIdMapper;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the user ID mapper service. This utility wraps {@link UserIdMapperPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserIdMapperPersistence
 * @see UserIdMapperPersistenceImpl
 * @generated
 */
public class UserIdMapperUtil {
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
	public static void clearCache(UserIdMapper userIdMapper) {
		getPersistence().clearCache(userIdMapper);
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
	public static List<UserIdMapper> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserIdMapper> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserIdMapper> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static UserIdMapper update(UserIdMapper userIdMapper, boolean merge)
		throws SystemException {
		return getPersistence().update(userIdMapper, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static UserIdMapper update(UserIdMapper userIdMapper, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(userIdMapper, merge, serviceContext);
	}

	/**
	* Caches the user ID mapper in the entity cache if it is enabled.
	*
	* @param userIdMapper the user ID mapper
	*/
	public static void cacheResult(
		com.liferay.portal.model.UserIdMapper userIdMapper) {
		getPersistence().cacheResult(userIdMapper);
	}

	/**
	* Caches the user ID mappers in the entity cache if it is enabled.
	*
	* @param userIdMappers the user ID mappers
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portal.model.UserIdMapper> userIdMappers) {
		getPersistence().cacheResult(userIdMappers);
	}

	/**
	* Creates a new user ID mapper with the primary key. Does not add the user ID mapper to the database.
	*
	* @param userIdMapperId the primary key for the new user ID mapper
	* @return the new user ID mapper
	*/
	public static com.liferay.portal.model.UserIdMapper create(
		long userIdMapperId) {
		return getPersistence().create(userIdMapperId);
	}

	/**
	* Removes the user ID mapper with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userIdMapperId the primary key of the user ID mapper
	* @return the user ID mapper that was removed
	* @throws com.liferay.portal.NoSuchUserIdMapperException if a user ID mapper with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.UserIdMapper remove(
		long userIdMapperId)
		throws com.liferay.portal.NoSuchUserIdMapperException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(userIdMapperId);
	}

	public static com.liferay.portal.model.UserIdMapper updateImpl(
		com.liferay.portal.model.UserIdMapper userIdMapper, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userIdMapper, merge);
	}

	/**
	* Returns the user ID mapper with the primary key or throws a {@link com.liferay.portal.NoSuchUserIdMapperException} if it could not be found.
	*
	* @param userIdMapperId the primary key of the user ID mapper
	* @return the user ID mapper
	* @throws com.liferay.portal.NoSuchUserIdMapperException if a user ID mapper with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.UserIdMapper findByPrimaryKey(
		long userIdMapperId)
		throws com.liferay.portal.NoSuchUserIdMapperException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(userIdMapperId);
	}

	/**
	* Returns the user ID mapper with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userIdMapperId the primary key of the user ID mapper
	* @return the user ID mapper, or <code>null</code> if a user ID mapper with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.UserIdMapper fetchByPrimaryKey(
		long userIdMapperId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(userIdMapperId);
	}

	/**
	* Returns all the user ID mappers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user ID mappers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.UserIdMapper> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the user ID mappers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user ID mappers
	* @param end the upper bound of the range of user ID mappers (not inclusive)
	* @return the range of matching user ID mappers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.UserIdMapper> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the user ID mappers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user ID mappers
	* @param end the upper bound of the range of user ID mappers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user ID mappers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.UserIdMapper> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first user ID mapper in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user ID mapper
	* @throws com.liferay.portal.NoSuchUserIdMapperException if a matching user ID mapper could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.UserIdMapper findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserIdMapperException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last user ID mapper in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user ID mapper
	* @throws com.liferay.portal.NoSuchUserIdMapperException if a matching user ID mapper could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.UserIdMapper findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserIdMapperException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the user ID mappers before and after the current user ID mapper in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userIdMapperId the primary key of the current user ID mapper
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user ID mapper
	* @throws com.liferay.portal.NoSuchUserIdMapperException if a user ID mapper with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.UserIdMapper[] findByUserId_PrevAndNext(
		long userIdMapperId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserIdMapperException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId_PrevAndNext(userIdMapperId, userId,
			orderByComparator);
	}

	/**
	* Returns the user ID mapper where userId = &#63; and type = &#63; or throws a {@link com.liferay.portal.NoSuchUserIdMapperException} if it could not be found.
	*
	* @param userId the user ID
	* @param type the type
	* @return the matching user ID mapper
	* @throws com.liferay.portal.NoSuchUserIdMapperException if a matching user ID mapper could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.UserIdMapper findByU_T(long userId,
		java.lang.String type)
		throws com.liferay.portal.NoSuchUserIdMapperException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_T(userId, type);
	}

	/**
	* Returns the user ID mapper where userId = &#63; and type = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param type the type
	* @return the matching user ID mapper, or <code>null</code> if a matching user ID mapper could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.UserIdMapper fetchByU_T(
		long userId, java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_T(userId, type);
	}

	/**
	* Returns the user ID mapper where userId = &#63; and type = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param type the type
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user ID mapper, or <code>null</code> if a matching user ID mapper could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.UserIdMapper fetchByU_T(
		long userId, java.lang.String type, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_T(userId, type, retrieveFromCache);
	}

	/**
	* Returns the user ID mapper where type = &#63; and externalUserId = &#63; or throws a {@link com.liferay.portal.NoSuchUserIdMapperException} if it could not be found.
	*
	* @param type the type
	* @param externalUserId the external user ID
	* @return the matching user ID mapper
	* @throws com.liferay.portal.NoSuchUserIdMapperException if a matching user ID mapper could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.UserIdMapper findByT_E(
		java.lang.String type, java.lang.String externalUserId)
		throws com.liferay.portal.NoSuchUserIdMapperException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_E(type, externalUserId);
	}

	/**
	* Returns the user ID mapper where type = &#63; and externalUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param type the type
	* @param externalUserId the external user ID
	* @return the matching user ID mapper, or <code>null</code> if a matching user ID mapper could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.UserIdMapper fetchByT_E(
		java.lang.String type, java.lang.String externalUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT_E(type, externalUserId);
	}

	/**
	* Returns the user ID mapper where type = &#63; and externalUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param type the type
	* @param externalUserId the external user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user ID mapper, or <code>null</code> if a matching user ID mapper could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.UserIdMapper fetchByT_E(
		java.lang.String type, java.lang.String externalUserId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_E(type, externalUserId, retrieveFromCache);
	}

	/**
	* Returns all the user ID mappers.
	*
	* @return the user ID mappers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.UserIdMapper> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the user ID mappers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of user ID mappers
	* @param end the upper bound of the range of user ID mappers (not inclusive)
	* @return the range of user ID mappers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.UserIdMapper> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the user ID mappers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of user ID mappers
	* @param end the upper bound of the range of user ID mappers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user ID mappers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.UserIdMapper> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the user ID mappers where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Removes the user ID mapper where userId = &#63; and type = &#63; from the database.
	*
	* @param userId the user ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU_T(long userId, java.lang.String type)
		throws com.liferay.portal.NoSuchUserIdMapperException,
			com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU_T(userId, type);
	}

	/**
	* Removes the user ID mapper where type = &#63; and externalUserId = &#63; from the database.
	*
	* @param type the type
	* @param externalUserId the external user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_E(java.lang.String type,
		java.lang.String externalUserId)
		throws com.liferay.portal.NoSuchUserIdMapperException,
			com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_E(type, externalUserId);
	}

	/**
	* Removes all the user ID mappers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user ID mappers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user ID mappers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns the number of user ID mappers where userId = &#63; and type = &#63;.
	*
	* @param userId the user ID
	* @param type the type
	* @return the number of matching user ID mappers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU_T(long userId, java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU_T(userId, type);
	}

	/**
	* Returns the number of user ID mappers where type = &#63; and externalUserId = &#63;.
	*
	* @param type the type
	* @param externalUserId the external user ID
	* @return the number of matching user ID mappers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_E(java.lang.String type,
		java.lang.String externalUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_E(type, externalUserId);
	}

	/**
	* Returns the number of user ID mappers.
	*
	* @return the number of user ID mappers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserIdMapperPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserIdMapperPersistence)PortalBeanLocatorUtil.locate(UserIdMapperPersistence.class.getName());

			ReferenceRegistry.registerReference(UserIdMapperUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(UserIdMapperPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(UserIdMapperUtil.class,
			"_persistence");
	}

	private static UserIdMapperPersistence _persistence;
}