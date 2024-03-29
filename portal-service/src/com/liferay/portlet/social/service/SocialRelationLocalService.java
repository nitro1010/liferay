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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the social relation local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SocialRelationLocalServiceUtil
 * @see com.liferay.portlet.social.service.base.SocialRelationLocalServiceBaseImpl
 * @see com.liferay.portlet.social.service.impl.SocialRelationLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface SocialRelationLocalService extends PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SocialRelationLocalServiceUtil} to access the social relation local service. Add custom service methods to {@link com.liferay.portlet.social.service.impl.SocialRelationLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the social relation to the database. Also notifies the appropriate model listeners.
	*
	* @param socialRelation the social relation
	* @return the social relation that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.social.model.SocialRelation addSocialRelation(
		com.liferay.portlet.social.model.SocialRelation socialRelation)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new social relation with the primary key. Does not add the social relation to the database.
	*
	* @param relationId the primary key for the new social relation
	* @return the new social relation
	*/
	public com.liferay.portlet.social.model.SocialRelation createSocialRelation(
		long relationId);

	/**
	* Deletes the social relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param relationId the primary key of the social relation
	* @throws PortalException if a social relation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSocialRelation(long relationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the social relation from the database. Also notifies the appropriate model listeners.
	*
	* @param socialRelation the social relation
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSocialRelation(
		com.liferay.portlet.social.model.SocialRelation socialRelation)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.social.model.SocialRelation fetchSocialRelation(
		long relationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the social relation with the primary key.
	*
	* @param relationId the primary key of the social relation
	* @return the social relation
	* @throws PortalException if a social relation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.social.model.SocialRelation getSocialRelation(
		long relationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the social relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of social relations
	* @param end the upper bound of the range of social relations (not inclusive)
	* @return the range of social relations
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.social.model.SocialRelation> getSocialRelations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of social relations.
	*
	* @return the number of social relations
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSocialRelationsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the social relation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param socialRelation the social relation
	* @return the social relation that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.social.model.SocialRelation updateSocialRelation(
		com.liferay.portlet.social.model.SocialRelation socialRelation)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the social relation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param socialRelation the social relation
	* @param merge whether to merge the social relation with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the social relation that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.social.model.SocialRelation updateSocialRelation(
		com.liferay.portlet.social.model.SocialRelation socialRelation,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	/**
	* Adds a social relation between the two users to the database.
	*
	* @param userId1 the user that is the subject of the relation
	* @param userId2 the user at the other end of the relation
	* @param type the type of the relation
	* @return the social relation
	* @throws PortalException if the users could not be found, if the users
	were not from the same company, or if either of the users was the
	default user
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.social.model.SocialRelation addRelation(
		long userId1, long userId2, int type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the relation (and its inverse in case of a bidirectional
	* relation) from the database.
	*
	* @param relationId the primary key of the relation
	* @throws PortalException if the relation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteRelation(long relationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the matching relation (and its inverse in case of a bidirectional
	* relation) from the database.
	*
	* @param userId1 the user that is the subject of the relation
	* @param userId2 the user at the other end of the relation
	* @param type the relation's type
	* @throws PortalException if the relation or its inverse relation (if
	applicable) could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteRelation(long userId1, long userId2, int type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the relation (and its inverse in case of a bidirectional
	* relation) from the database.
	*
	* @param relation the relation to be removed
	* @throws PortalException if the relation is bidirectional and its inverse
	relation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteRelation(
		com.liferay.portlet.social.model.SocialRelation relation)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all relations involving the user from the database.
	*
	* @param userId the primary key of the user
	* @throws SystemException if a system exception occurred
	*/
	public void deleteRelations(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all relations between User1 and User2.
	*
	* @param userId1 the user that is the subject of the relation
	* @param userId2 the user at the other end of the relation
	* @throws PortalException if the inverse relation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteRelations(long userId1, long userId2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the inverse relations of the given type for which
	* the user is User2 of the relation.
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
	* @param type the relation's type
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of matching relations
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.social.model.SocialRelation> getInverseRelations(
		long userId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of inverse relations of the given type for which the
	* user is User2 of the relation.
	*
	* @param userId the primary key of the user
	* @param type the relation's type
	* @return the number of matching relations
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getInverseRelationsCount(long userId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the relation identified by its primary key.
	*
	* @param relationId the primary key of the relation
	* @return Returns the relation
	* @throws PortalException if the relation could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.social.model.SocialRelation getRelation(
		long relationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the relation of the given type between User1 and User2.
	*
	* @param userId1 the user that is the subject of the relation
	* @param userId2 the user at the other end of the relation
	* @param type the relation's type
	* @return Returns the relation
	* @throws PortalException if the relation could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.social.model.SocialRelation getRelation(
		long userId1, long userId2, int type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the relations of the given type where the user is
	* the subject of the relation.
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
	* @param type the relation's type
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of relations
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.social.model.SocialRelation> getRelations(
		long userId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the relations between User1 and User2.
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
	* @param userId1 the user that is the subject of the relation
	* @param userId2 the user at the other end of the relation
	* @param start the lower bound of the range of results
	* @param end the upper bound of the range of results (not inclusive)
	* @return the range of relations
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.social.model.SocialRelation> getRelations(
		long userId1, long userId2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of relations of the given type where the user is the
	* subject of the relation.
	*
	* @param userId the primary key of the user
	* @param type the relation's type
	* @return the number of relations
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getRelationsCount(long userId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of relations between User1 and User2.
	*
	* @param userId1 the user that is the subject of the relation
	* @param userId2 the user at the other end of the relation
	* @return the number of relations
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getRelationsCount(long userId1, long userId2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if a relation of the given type exists where
	* the user with primary key <code>userId1</code> is User1 of the relation
	* and the user with the primary key <code>userId2</code> is User2 of the
	* relation.
	*
	* @param userId1 the user that is the subject of the relation
	* @param userId2 the user at the other end of the relation
	* @param type the relation's type
	* @return <code>true</code> if the relation exists; <code>false</code>
	otherwise
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasRelation(long userId1, long userId2, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the users can be in a relation of the given
	* type where the user with primary key <code>userId1</code> is User1 of the
	* relation and the user with the primary key <code>userId2</code> is User2
	* of the relation.
	*
	* <p>
	* This method returns <code>false</code> if User1 and User2 are the same,
	* if either user is the default user, or if a matching relation already
	* exists.
	* </p>
	*
	* @param userId1 the user that is the subject of the relation
	* @param userId2 the user at the other end of the relation
	* @param type the relation's type
	* @return <code>true</code> if the two users can be in a new relation of
	the given type; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean isRelatable(long userId1, long userId2, int type)
		throws com.liferay.portal.kernel.exception.SystemException;
}