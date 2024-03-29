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

package com.liferay.portlet.blogs.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.blogs.model.BlogsStatsUser;

import java.util.List;

/**
 * The persistence utility for the blogs stats user service. This utility wraps {@link BlogsStatsUserPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BlogsStatsUserPersistence
 * @see BlogsStatsUserPersistenceImpl
 * @generated
 */
public class BlogsStatsUserUtil {
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
	public static void clearCache(BlogsStatsUser blogsStatsUser) {
		getPersistence().clearCache(blogsStatsUser);
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
	public static List<BlogsStatsUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BlogsStatsUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BlogsStatsUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static BlogsStatsUser update(BlogsStatsUser blogsStatsUser,
		boolean merge) throws SystemException {
		return getPersistence().update(blogsStatsUser, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static BlogsStatsUser update(BlogsStatsUser blogsStatsUser,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(blogsStatsUser, merge, serviceContext);
	}

	/**
	* Caches the blogs stats user in the entity cache if it is enabled.
	*
	* @param blogsStatsUser the blogs stats user
	*/
	public static void cacheResult(
		com.liferay.portlet.blogs.model.BlogsStatsUser blogsStatsUser) {
		getPersistence().cacheResult(blogsStatsUser);
	}

	/**
	* Caches the blogs stats users in the entity cache if it is enabled.
	*
	* @param blogsStatsUsers the blogs stats users
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> blogsStatsUsers) {
		getPersistence().cacheResult(blogsStatsUsers);
	}

	/**
	* Creates a new blogs stats user with the primary key. Does not add the blogs stats user to the database.
	*
	* @param statsUserId the primary key for the new blogs stats user
	* @return the new blogs stats user
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser create(
		long statsUserId) {
		return getPersistence().create(statsUserId);
	}

	/**
	* Removes the blogs stats user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statsUserId the primary key of the blogs stats user
	* @return the blogs stats user that was removed
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a blogs stats user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser remove(
		long statsUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence().remove(statsUserId);
	}

	public static com.liferay.portlet.blogs.model.BlogsStatsUser updateImpl(
		com.liferay.portlet.blogs.model.BlogsStatsUser blogsStatsUser,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(blogsStatsUser, merge);
	}

	/**
	* Returns the blogs stats user with the primary key or throws a {@link com.liferay.portlet.blogs.NoSuchStatsUserException} if it could not be found.
	*
	* @param statsUserId the primary key of the blogs stats user
	* @return the blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a blogs stats user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser findByPrimaryKey(
		long statsUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence().findByPrimaryKey(statsUserId);
	}

	/**
	* Returns the blogs stats user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statsUserId the primary key of the blogs stats user
	* @return the blogs stats user, or <code>null</code> if a blogs stats user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser fetchByPrimaryKey(
		long statsUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(statsUserId);
	}

	/**
	* Returns all the blogs stats users where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the blogs stats users where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of blogs stats users
	* @param end the upper bound of the range of blogs stats users (not inclusive)
	* @return the range of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the blogs stats users where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of blogs stats users
	* @param end the upper bound of the range of blogs stats users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first blogs stats user in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last blogs stats user in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the blogs stats users before and after the current blogs stats user in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statsUserId the primary key of the current blogs stats user
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a blogs stats user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser[] findByGroupId_PrevAndNext(
		long statsUserId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(statsUserId, groupId,
			orderByComparator);
	}

	/**
	* Returns all the blogs stats users where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the blogs stats users where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of blogs stats users
	* @param end the upper bound of the range of blogs stats users (not inclusive)
	* @return the range of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the blogs stats users where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of blogs stats users
	* @param end the upper bound of the range of blogs stats users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first blogs stats user in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last blogs stats user in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the blogs stats users before and after the current blogs stats user in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statsUserId the primary key of the current blogs stats user
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a blogs stats user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser[] findByUserId_PrevAndNext(
		long statsUserId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence()
				   .findByUserId_PrevAndNext(statsUserId, userId,
			orderByComparator);
	}

	/**
	* Returns the blogs stats user where groupId = &#63; and userId = &#63; or throws a {@link com.liferay.portlet.blogs.NoSuchStatsUserException} if it could not be found.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser findByG_U(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence().findByG_U(groupId, userId);
	}

	/**
	* Returns the blogs stats user where groupId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching blogs stats user, or <code>null</code> if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser fetchByG_U(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_U(groupId, userId);
	}

	/**
	* Returns the blogs stats user where groupId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching blogs stats user, or <code>null</code> if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser fetchByG_U(
		long groupId, long userId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_U(groupId, userId, retrieveFromCache);
	}

	/**
	* Returns all the blogs stats users where groupId = &#63; and entryCount &ne; &#63;.
	*
	* @param groupId the group ID
	* @param entryCount the entry count
	* @return the matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByG_NotE(
		long groupId, int entryCount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_NotE(groupId, entryCount);
	}

	/**
	* Returns a range of all the blogs stats users where groupId = &#63; and entryCount &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param entryCount the entry count
	* @param start the lower bound of the range of blogs stats users
	* @param end the upper bound of the range of blogs stats users (not inclusive)
	* @return the range of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByG_NotE(
		long groupId, int entryCount, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_NotE(groupId, entryCount, start, end);
	}

	/**
	* Returns an ordered range of all the blogs stats users where groupId = &#63; and entryCount &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param entryCount the entry count
	* @param start the lower bound of the range of blogs stats users
	* @param end the upper bound of the range of blogs stats users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByG_NotE(
		long groupId, int entryCount, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_NotE(groupId, entryCount, start, end,
			orderByComparator);
	}

	/**
	* Returns the first blogs stats user in the ordered set where groupId = &#63; and entryCount &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param entryCount the entry count
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser findByG_NotE_First(
		long groupId, int entryCount,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence()
				   .findByG_NotE_First(groupId, entryCount, orderByComparator);
	}

	/**
	* Returns the last blogs stats user in the ordered set where groupId = &#63; and entryCount &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param entryCount the entry count
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser findByG_NotE_Last(
		long groupId, int entryCount,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence()
				   .findByG_NotE_Last(groupId, entryCount, orderByComparator);
	}

	/**
	* Returns the blogs stats users before and after the current blogs stats user in the ordered set where groupId = &#63; and entryCount &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statsUserId the primary key of the current blogs stats user
	* @param groupId the group ID
	* @param entryCount the entry count
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a blogs stats user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser[] findByG_NotE_PrevAndNext(
		long statsUserId, long groupId, int entryCount,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence()
				   .findByG_NotE_PrevAndNext(statsUserId, groupId, entryCount,
			orderByComparator);
	}

	/**
	* Returns all the blogs stats users where companyId = &#63; and entryCount &ne; &#63;.
	*
	* @param companyId the company ID
	* @param entryCount the entry count
	* @return the matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByC_NotE(
		long companyId, int entryCount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_NotE(companyId, entryCount);
	}

	/**
	* Returns a range of all the blogs stats users where companyId = &#63; and entryCount &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company ID
	* @param entryCount the entry count
	* @param start the lower bound of the range of blogs stats users
	* @param end the upper bound of the range of blogs stats users (not inclusive)
	* @return the range of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByC_NotE(
		long companyId, int entryCount, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_NotE(companyId, entryCount, start, end);
	}

	/**
	* Returns an ordered range of all the blogs stats users where companyId = &#63; and entryCount &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company ID
	* @param entryCount the entry count
	* @param start the lower bound of the range of blogs stats users
	* @param end the upper bound of the range of blogs stats users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByC_NotE(
		long companyId, int entryCount, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_NotE(companyId, entryCount, start, end,
			orderByComparator);
	}

	/**
	* Returns the first blogs stats user in the ordered set where companyId = &#63; and entryCount &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company ID
	* @param entryCount the entry count
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser findByC_NotE_First(
		long companyId, int entryCount,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence()
				   .findByC_NotE_First(companyId, entryCount, orderByComparator);
	}

	/**
	* Returns the last blogs stats user in the ordered set where companyId = &#63; and entryCount &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company ID
	* @param entryCount the entry count
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser findByC_NotE_Last(
		long companyId, int entryCount,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence()
				   .findByC_NotE_Last(companyId, entryCount, orderByComparator);
	}

	/**
	* Returns the blogs stats users before and after the current blogs stats user in the ordered set where companyId = &#63; and entryCount &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statsUserId the primary key of the current blogs stats user
	* @param companyId the company ID
	* @param entryCount the entry count
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a blogs stats user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser[] findByC_NotE_PrevAndNext(
		long statsUserId, long companyId, int entryCount,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence()
				   .findByC_NotE_PrevAndNext(statsUserId, companyId,
			entryCount, orderByComparator);
	}

	/**
	* Returns all the blogs stats users where userId = &#63; and lastPostDate = &#63;.
	*
	* @param userId the user ID
	* @param lastPostDate the last post date
	* @return the matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByU_L(
		long userId, java.util.Date lastPostDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_L(userId, lastPostDate);
	}

	/**
	* Returns a range of all the blogs stats users where userId = &#63; and lastPostDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param lastPostDate the last post date
	* @param start the lower bound of the range of blogs stats users
	* @param end the upper bound of the range of blogs stats users (not inclusive)
	* @return the range of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByU_L(
		long userId, java.util.Date lastPostDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_L(userId, lastPostDate, start, end);
	}

	/**
	* Returns an ordered range of all the blogs stats users where userId = &#63; and lastPostDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param lastPostDate the last post date
	* @param start the lower bound of the range of blogs stats users
	* @param end the upper bound of the range of blogs stats users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByU_L(
		long userId, java.util.Date lastPostDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_L(userId, lastPostDate, start, end,
			orderByComparator);
	}

	/**
	* Returns the first blogs stats user in the ordered set where userId = &#63; and lastPostDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param lastPostDate the last post date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser findByU_L_First(
		long userId, java.util.Date lastPostDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence()
				   .findByU_L_First(userId, lastPostDate, orderByComparator);
	}

	/**
	* Returns the last blogs stats user in the ordered set where userId = &#63; and lastPostDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param lastPostDate the last post date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a matching blogs stats user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser findByU_L_Last(
		long userId, java.util.Date lastPostDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence()
				   .findByU_L_Last(userId, lastPostDate, orderByComparator);
	}

	/**
	* Returns the blogs stats users before and after the current blogs stats user in the ordered set where userId = &#63; and lastPostDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statsUserId the primary key of the current blogs stats user
	* @param userId the user ID
	* @param lastPostDate the last post date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next blogs stats user
	* @throws com.liferay.portlet.blogs.NoSuchStatsUserException if a blogs stats user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.blogs.model.BlogsStatsUser[] findByU_L_PrevAndNext(
		long statsUserId, long userId, java.util.Date lastPostDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		return getPersistence()
				   .findByU_L_PrevAndNext(statsUserId, userId, lastPostDate,
			orderByComparator);
	}

	/**
	* Returns all the blogs stats users.
	*
	* @return the blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the blogs stats users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of blogs stats users
	* @param end the upper bound of the range of blogs stats users (not inclusive)
	* @return the range of blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the blogs stats users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of blogs stats users
	* @param end the upper bound of the range of blogs stats users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the blogs stats users where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the blogs stats users where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Removes the blogs stats user where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException {
		getPersistence().removeByG_U(groupId, userId);
	}

	/**
	* Removes all the blogs stats users where groupId = &#63; and entryCount &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param entryCount the entry count
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_NotE(long groupId, int entryCount)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_NotE(groupId, entryCount);
	}

	/**
	* Removes all the blogs stats users where companyId = &#63; and entryCount &ne; &#63; from the database.
	*
	* @param companyId the company ID
	* @param entryCount the entry count
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_NotE(long companyId, int entryCount)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_NotE(companyId, entryCount);
	}

	/**
	* Removes all the blogs stats users where userId = &#63; and lastPostDate = &#63; from the database.
	*
	* @param userId the user ID
	* @param lastPostDate the last post date
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU_L(long userId, java.util.Date lastPostDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU_L(userId, lastPostDate);
	}

	/**
	* Removes all the blogs stats users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of blogs stats users where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns the number of blogs stats users where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns the number of blogs stats users where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_U(groupId, userId);
	}

	/**
	* Returns the number of blogs stats users where groupId = &#63; and entryCount &ne; &#63;.
	*
	* @param groupId the group ID
	* @param entryCount the entry count
	* @return the number of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_NotE(long groupId, int entryCount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_NotE(groupId, entryCount);
	}

	/**
	* Returns the number of blogs stats users where companyId = &#63; and entryCount &ne; &#63;.
	*
	* @param companyId the company ID
	* @param entryCount the entry count
	* @return the number of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_NotE(long companyId, int entryCount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_NotE(companyId, entryCount);
	}

	/**
	* Returns the number of blogs stats users where userId = &#63; and lastPostDate = &#63;.
	*
	* @param userId the user ID
	* @param lastPostDate the last post date
	* @return the number of matching blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU_L(long userId, java.util.Date lastPostDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU_L(userId, lastPostDate);
	}

	/**
	* Returns the number of blogs stats users.
	*
	* @return the number of blogs stats users
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BlogsStatsUserPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BlogsStatsUserPersistence)PortalBeanLocatorUtil.locate(BlogsStatsUserPersistence.class.getName());

			ReferenceRegistry.registerReference(BlogsStatsUserUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(BlogsStatsUserPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(BlogsStatsUserUtil.class,
			"_persistence");
	}

	private static BlogsStatsUserPersistence _persistence;
}