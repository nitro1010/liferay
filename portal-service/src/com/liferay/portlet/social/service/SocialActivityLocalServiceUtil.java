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

package com.liferay.portlet.social.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the social activity local service. This utility wraps {@link com.liferay.portlet.social.service.impl.SocialActivityLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SocialActivityLocalService
 * @see com.liferay.portlet.social.service.base.SocialActivityLocalServiceBaseImpl
 * @see com.liferay.portlet.social.service.impl.SocialActivityLocalServiceImpl
 * @generated
 */
public class SocialActivityLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.social.service.impl.SocialActivityLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the social activity to the database. Also notifies the appropriate model listeners.
	*
	* @param socialActivity the social activity
	* @return the social activity that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.social.model.SocialActivity addSocialActivity(
		com.liferay.portlet.social.model.SocialActivity socialActivity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSocialActivity(socialActivity);
	}

	/**
	* Creates a new social activity with the primary key. Does not add the social activity to the database.
	*
	* @param activityId the primary key for the new social activity
	* @return the new social activity
	*/
	public static com.liferay.portlet.social.model.SocialActivity createSocialActivity(
		long activityId) {
		return getService().createSocialActivity(activityId);
	}

	/**
	* Deletes the social activity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param activityId the primary key of the social activity
	* @throws PortalException if a social activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSocialActivity(long activityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSocialActivity(activityId);
	}

	/**
	* Deletes the social activity from the database. Also notifies the appropriate model listeners.
	*
	* @param socialActivity the social activity
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSocialActivity(
		com.liferay.portlet.social.model.SocialActivity socialActivity)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSocialActivity(socialActivity);
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

	public static com.liferay.portlet.social.model.SocialActivity fetchSocialActivity(
		long activityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSocialActivity(activityId);
	}

	/**
	* Returns the social activity with the primary key.
	*
	* @param activityId the primary key of the social activity
	* @return the social activity
	* @throws PortalException if a social activity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.social.model.SocialActivity getSocialActivity(
		long activityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSocialActivity(activityId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the social activities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of social activities
	* @param end the upper bound of the range of social activities (not inclusive)
	* @return the range of social activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getSocialActivities(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSocialActivities(start, end);
	}

	/**
	* Returns the number of social activities.
	*
	* @return the number of social activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getSocialActivitiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSocialActivitiesCount();
	}

	/**
	* Updates the social activity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param socialActivity the social activity
	* @return the social activity that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.social.model.SocialActivity updateSocialActivity(
		com.liferay.portlet.social.model.SocialActivity socialActivity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSocialActivity(socialActivity);
	}

	/**
	* Updates the social activity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param socialActivity the social activity
	* @param merge whether to merge the social activity with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the social activity that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.social.model.SocialActivity updateSocialActivity(
		com.liferay.portlet.social.model.SocialActivity socialActivity,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSocialActivity(socialActivity, merge);
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
	* Records an activity with the given time in the database.
	*
	* <p>
	* This method records a social activity done on an asset, identified by its
	* class name and class primary key, in the database. Additional information
	* (such as the original message ID for a reply to a forum post) is passed
	* in via the <code>extraData</code> in JSON format. For activities
	* affecting another user, a mirror activity is generated that describes the
	* action from the user's point of view. The target user's ID is passed in
	* via the <code>receiverUserId</code>.
	* </p>
	*
	* <p>
	* Example for a mirrored activity:<br> When a user replies to a message
	* boards post, the reply action is stored in the database with the
	* <code>receiverUserId</code> being the ID of the author of the original
	* message. The <code>extraData</code> contains the ID of the original
	* message in JSON format. A mirror activity is generated with the values of
	* the <code>userId</code> and the <code>receiverUserId</code> swapped. This
	* mirror activity basically describes a "replied to" event.
	* </p>
	*
	* <p>
	* Mirror activities are most often used in relation to friend requests and
	* activities.
	* </p>
	*
	* @param userId the primary key of the acting user
	* @param groupId the primary key of the group
	* @param createDate the activity's date
	* @param className the target asset's class name
	* @param classPK the primary key of the target asset
	* @param type the activity's type
	* @param extraData any extra data regarding the activity
	* @param receiverUserId the primary key of the receiving user
	* @throws PortalException if the user or group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void addActivity(long userId, long groupId,
		java.util.Date createDate, java.lang.String className, long classPK,
		int type, java.lang.String extraData, long receiverUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addActivity(userId, groupId, createDate, className, classPK, type,
			extraData, receiverUserId);
	}

	/**
	* Records an activity in the database, using a time based on the current
	* time in an attempt to make the activity's time unique.
	*
	* @param userId the primary key of the acting user
	* @param groupId the primary key of the group
	* @param className the target asset's class name
	* @param classPK the primary key of the target asset
	* @param type the activity's type
	* @param extraData any extra data regarding the activity
	* @param receiverUserId the primary key of the receiving user
	* @throws PortalException if the user or group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void addActivity(long userId, long groupId,
		java.lang.String className, long classPK, int type,
		java.lang.String extraData, long receiverUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addActivity(userId, groupId, className, classPK, type, extraData,
			receiverUserId);
	}

	public static void addActivity(
		com.liferay.portlet.social.model.SocialActivity activity,
		com.liferay.portlet.social.model.SocialActivity mirrorActivity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().addActivity(activity, mirrorActivity);
	}

	/**
	* Records an activity in the database, but only if there isn't already an
	* activity with the same parameters.
	*
	* <p>
	* For the main functionality see {@link #addActivity(long, long, Date,
	* String, long, int, String, long)}
	* </p>
	*
	* @param userId the primary key of the acting user
	* @param groupId the primary key of the group
	* @param createDate the activity's date
	* @param className the target asset's class name
	* @param classPK the primary key of the target asset
	* @param type the activity's type
	* @param extraData any extra data regarding the activity
	* @param receiverUserId the primary key of the receiving user
	* @throws PortalException if the user or group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void addUniqueActivity(long userId, long groupId,
		java.util.Date createDate, java.lang.String className, long classPK,
		int type, java.lang.String extraData, long receiverUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addUniqueActivity(userId, groupId, createDate, className, classPK,
			type, extraData, receiverUserId);
	}

	/**
	* Records an activity with the current time in the database, but only if
	* there isn't one with the same parameters.
	*
	* <p>
	* For the main functionality see {@link #addActivity(long, long, Date,
	* String, long, int, String, long)}
	* </p>
	*
	* @param userId the primary key of the acting user
	* @param groupId the primary key of the group
	* @param className the target asset's class name
	* @param classPK the primary key of the target asset
	* @param type the activity's type
	* @param extraData any extra data regarding the activity
	* @param receiverUserId the primary key of the receiving user
	* @throws PortalException if the user or group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void addUniqueActivity(long userId, long groupId,
		java.lang.String className, long classPK, int type,
		java.lang.String extraData, long receiverUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addUniqueActivity(userId, groupId, className, classPK, type,
			extraData, receiverUserId);
	}

	/**
	* Removes stored activities for the asset identified by the class name ID
	* and class primary key.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteActivities(
		com.liferay.portlet.asset.model.AssetEntry assetEntry)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteActivities(assetEntry);
	}

	/**
	* Removes stored activities for the asset identified by the class name and
	* class primary key.
	*
	* @param className the target asset's class name
	* @param classPK the primary key of the target asset
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteActivities(java.lang.String className, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteActivities(className, classPK);
	}

	/**
	* Removes the stored activity from the database.
	*
	* @param activityId the primary key of the stored activity
	* @throws PortalException if the activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteActivity(long activityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteActivity(activityId);
	}

	/**
	* Removes the stored activity and its mirror activity from the database.
	*
	* @param activity the activity to be removed
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteActivity(
		com.liferay.portlet.social.model.SocialActivity activity)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteActivity(activity);
	}

	/**
	* Removes the user's stored activities from the database.
	*
	* <p>
	* This method removes all activities where the user is either the actor or
	* the receiver.
	* </p>
	*
	* @param userId the primary key of the user
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteUserActivities(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteUserActivities(userId);
	}

	/**
	* Returns a range of all the activities done on assets identified by the
	* class name ID.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param classNameId the target asset's class name ID
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getActivities(
		long classNameId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getActivities(classNameId, start, end);
	}

	/**
	* Returns a range of all the activities done on the asset identified by the
	* class name ID and class primary key that are mirrors of the activity
	* identified by the mirror activity ID.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param mirrorActivityId the primary key of the mirror activity
	* @param classNameId the target asset's class name ID
	* @param classPK the primary key of the target asset
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getActivities(
		long mirrorActivityId, long classNameId, long classPK, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getActivities(mirrorActivityId, classNameId, classPK,
			start, end);
	}

	/**
	* Returns a range of all the activities done on the asset identified by the
	* class name and the class primary key that are mirrors of the activity
	* identified by the mirror activity ID.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param mirrorActivityId the primary key of the mirror activity
	* @param className the target asset's class name
	* @param classPK the primary key of the target asset
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getActivities(
		long mirrorActivityId, java.lang.String className, long classPK,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getActivities(mirrorActivityId, className, classPK, start,
			end);
	}

	/**
	* Returns a range of all the activities done on assets identified by the
	* class name.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param className the target asset's class name
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getActivities(
		java.lang.String className, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getActivities(className, start, end);
	}

	/**
	* Returns the number of activities done on assets identified by the class
	* name ID.
	*
	* @param classNameId the target asset's class name ID
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getActivitiesCount(long classNameId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getActivitiesCount(classNameId);
	}

	/**
	* Returns the number of activities done on the asset identified by the
	* class name ID and class primary key that are mirrors of the activity
	* identified by the mirror activity ID.
	*
	* @param mirrorActivityId the primary key of the mirror activity
	* @param classNameId the target asset's class name ID
	* @param classPK the primary key of the target asset
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getActivitiesCount(long mirrorActivityId,
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getActivitiesCount(mirrorActivityId, classNameId, classPK);
	}

	/**
	* Returns the number of activities done on the asset identified by the
	* class name and class primary key that are mirrors of the activity
	* identified by the mirror activity ID.
	*
	* @param mirrorActivityId the primary key of the mirror activity
	* @param className the target asset's class name
	* @param classPK the primary key of the target asset
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getActivitiesCount(long mirrorActivityId,
		java.lang.String className, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getActivitiesCount(mirrorActivityId, className, classPK);
	}

	/**
	* Returns the number of activities done on assets identified by class name.
	*
	* @param className the target asset's class name
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getActivitiesCount(java.lang.String className)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getActivitiesCount(className);
	}

	/**
	* Returns the activity identified by its primary key.
	*
	* @param activityId the primary key of the activity
	* @return Returns the activity
	* @throws PortalException if the activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.social.model.SocialActivity getActivity(
		long activityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getActivity(activityId);
	}

	/**
	* Returns a range of all the activities done in the group.
	*
	* <p>
	* This method only finds activities without mirrors.
	* </p>
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param groupId the primary key of the group
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getGroupActivities(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupActivities(groupId, start, end);
	}

	/**
	* Returns the number of activities done in the group.
	*
	* <p>
	* This method only counts activities without mirrors.
	* </p>
	*
	* @param groupId the primary key of the group
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getGroupActivitiesCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupActivitiesCount(groupId);
	}

	/**
	* Returns a range of activities done by users that are members of the
	* group.
	*
	* <p>
	* This method only finds activities without mirrors.
	* </p>
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param groupId the primary key of the group
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getGroupUsersActivities(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupUsersActivities(groupId, start, end);
	}

	/**
	* Returns the number of activities done by users that are members of the
	* group.
	*
	* <p>
	* This method only counts activities without mirrors.
	* </p>
	*
	* @param groupId the primary key of the group
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getGroupUsersActivitiesCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupUsersActivitiesCount(groupId);
	}

	/**
	* Returns the activity that has the mirror activity.
	*
	* @param mirrorActivityId the primary key of the mirror activity
	* @return Returns the mirror activity
	* @throws PortalException if the mirror activity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.social.model.SocialActivity getMirrorActivity(
		long mirrorActivityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMirrorActivity(mirrorActivityId);
	}

	/**
	* Returns a range of all the activities done in the organization. This
	* method only finds activities without mirrors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param organizationId the primary key of the organization
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getOrganizationActivities(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrganizationActivities(organizationId, start, end);
	}

	/**
	* Returns the number of activities done in the organization. This method
	* only counts activities without mirrors.
	*
	* @param organizationId the primary key of the organization
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getOrganizationActivitiesCount(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrganizationActivitiesCount(organizationId);
	}

	/**
	* Returns a range of all the activities done by users of the organization.
	* This method only finds activities without mirrors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param organizationId the primary key of the organization
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getOrganizationUsersActivities(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOrganizationUsersActivities(organizationId, start, end);
	}

	/**
	* Returns the number of activities done by users of the organization. This
	* method only counts activities without mirrors.
	*
	* @param organizationId the primary key of the organization
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getOrganizationUsersActivitiesCount(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrganizationUsersActivitiesCount(organizationId);
	}

	/**
	* Returns a range of all the activities done by users in a relationship
	* with the user identified by the user ID.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <>0</code> refers
	* to the first result in the set. Setting both <code>start</code> and
	* <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param userId the primary key of the user
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getRelationActivities(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRelationActivities(userId, start, end);
	}

	/**
	* Returns a range of all the activities done by users in a relationship of
	* type <code>type</code> with the user identified by <code>userId</code>.
	* This method only finds activities without mirrors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param userId the primary key of the user
	* @param type the relationship type
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getRelationActivities(
		long userId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRelationActivities(userId, type, start, end);
	}

	/**
	* Returns the number of activities done by users in a relationship with the
	* user identified by userId.
	*
	* @param userId the primary key of the user
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getRelationActivitiesCount(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRelationActivitiesCount(userId);
	}

	/**
	* Returns the number of activities done by users in a relationship of type
	* <code>type</code> with the user identified by <code>userId</code>. This
	* method only counts activities without mirrors.
	*
	* @param userId the primary key of the user
	* @param type the relationship type
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getRelationActivitiesCount(long userId, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRelationActivitiesCount(userId, type);
	}

	/**
	* Returns a range of all the activities done by the user.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param userId the primary key of the user
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getUserActivities(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserActivities(userId, start, end);
	}

	/**
	* Returns the number of activities done by the user.
	*
	* @param userId the primary key of the user
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getUserActivitiesCount(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserActivitiesCount(userId);
	}

	/**
	* Returns a range of all the activities done in the user's groups. This
	* method only finds activities without mirrors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param userId the primary key of the user
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getUserGroupsActivities(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserGroupsActivities(userId, start, end);
	}

	/**
	* Returns the number of activities done in user's groups. This method only
	* counts activities without mirrors.
	*
	* @param userId the primary key of the user
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getUserGroupsActivitiesCount(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserGroupsActivitiesCount(userId);
	}

	/**
	* Returns a range of all the activities done in the user's groups and
	* organizations. This method only finds activities without mirrors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param userId the primary key of the user
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getUserGroupsAndOrganizationsActivities(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getUserGroupsAndOrganizationsActivities(userId, start, end);
	}

	/**
	* Returns the number of activities done in user's groups and organizations.
	* This method only counts activities without mirrors.
	*
	* @param userId the primary key of the user
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getUserGroupsAndOrganizationsActivitiesCount(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserGroupsAndOrganizationsActivitiesCount(userId);
	}

	/**
	* Returns a range of all activities done in the user's organizations. This
	* method only finds activities without mirrors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param userId the primary key of the user
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialActivity> getUserOrganizationsActivities(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserOrganizationsActivities(userId, start, end);
	}

	/**
	* Returns the number of activities done in the user's organizations. This
	* method only counts activities without mirrors.
	*
	* @param userId the primary key of the user
	* @return the number of matching activities
	* @throws SystemException if a system exception occurred
	*/
	public static int getUserOrganizationsActivitiesCount(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserOrganizationsActivitiesCount(userId);
	}

	public static SocialActivityLocalService getService() {
		if (_service == null) {
			_service = (SocialActivityLocalService)PortalBeanLocatorUtil.locate(SocialActivityLocalService.class.getName());

			ReferenceRegistry.registerReference(SocialActivityLocalServiceUtil.class,
				"_service");
			MethodCache.remove(SocialActivityLocalService.class);
		}

		return _service;
	}

	public void setService(SocialActivityLocalService service) {
		MethodCache.remove(SocialActivityLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(SocialActivityLocalServiceUtil.class,
			"_service");
		MethodCache.remove(SocialActivityLocalService.class);
	}

	private static SocialActivityLocalService _service;
}