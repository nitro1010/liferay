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
 * The utility for the image local service. This utility wraps {@link com.liferay.portal.service.impl.ImageLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ImageLocalService
 * @see com.liferay.portal.service.base.ImageLocalServiceBaseImpl
 * @see com.liferay.portal.service.impl.ImageLocalServiceImpl
 * @generated
 */
public class ImageLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.ImageLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the image to the database. Also notifies the appropriate model listeners.
	*
	* @param image the image
	* @return the image that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Image addImage(
		com.liferay.portal.model.Image image)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addImage(image);
	}

	/**
	* Creates a new image with the primary key. Does not add the image to the database.
	*
	* @param imageId the primary key for the new image
	* @return the new image
	*/
	public static com.liferay.portal.model.Image createImage(long imageId) {
		return getService().createImage(imageId);
	}

	/**
	* Deletes the image with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param imageId the primary key of the image
	* @throws PortalException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteImage(long imageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteImage(imageId);
	}

	/**
	* Deletes the image from the database. Also notifies the appropriate model listeners.
	*
	* @param image the image
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteImage(com.liferay.portal.model.Image image)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteImage(image);
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

	public static com.liferay.portal.model.Image fetchImage(long imageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchImage(imageId);
	}

	/**
	* Returns the image with the primary key.
	*
	* @param imageId the primary key of the image
	* @return the image
	* @throws PortalException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Image getImage(long imageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getImage(imageId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the images.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.Image> getImages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getImages(start, end);
	}

	/**
	* Returns the number of images.
	*
	* @return the number of images
	* @throws SystemException if a system exception occurred
	*/
	public static int getImagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getImagesCount();
	}

	/**
	* Updates the image in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param image the image
	* @return the image that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Image updateImage(
		com.liferay.portal.model.Image image)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImage(image);
	}

	/**
	* Updates the image in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param image the image
	* @param merge whether to merge the image with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the image that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.Image updateImage(
		com.liferay.portal.model.Image image, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImage(image, merge);
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

	public static com.liferay.portal.model.Image getCompanyLogo(long imageId) {
		return getService().getCompanyLogo(imageId);
	}

	public static com.liferay.portal.model.Image getDefaultCompanyLogo() {
		return getService().getDefaultCompanyLogo();
	}

	public static com.liferay.portal.model.Image getDefaultOrganizationLogo() {
		return getService().getDefaultOrganizationLogo();
	}

	public static com.liferay.portal.model.Image getDefaultSpacer() {
		return getService().getDefaultSpacer();
	}

	public static com.liferay.portal.model.Image getDefaultUserFemalePortrait() {
		return getService().getDefaultUserFemalePortrait();
	}

	public static com.liferay.portal.model.Image getDefaultUserMalePortrait() {
		return getService().getDefaultUserMalePortrait();
	}

	public static com.liferay.portal.model.Image getImage(byte[] bytes)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getImage(bytes);
	}

	public static com.liferay.portal.model.Image getImage(java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getImage(file);
	}

	public static com.liferay.portal.model.Image getImage(
		java.io.InputStream is)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getImage(is);
	}

	public static com.liferay.portal.model.Image getImage(
		java.io.InputStream is, boolean cleanUpStream)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getImage(is, cleanUpStream);
	}

	public static com.liferay.portal.model.Image getImageOrDefault(long imageId) {
		return getService().getImageOrDefault(imageId);
	}

	public static java.util.List<com.liferay.portal.model.Image> getImages()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getImages();
	}

	public static java.util.List<com.liferay.portal.model.Image> getImagesBySize(
		int size) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getImagesBySize(size);
	}

	public static boolean isNullOrDefaultSpacer(byte[] bytes) {
		return getService().isNullOrDefaultSpacer(bytes);
	}

	public static com.liferay.portal.model.Image updateImage(long imageId,
		byte[] bytes)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImage(imageId, bytes);
	}

	public static com.liferay.portal.model.Image updateImage(long imageId,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImage(imageId, file);
	}

	public static com.liferay.portal.model.Image updateImage(long imageId,
		java.io.InputStream is)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImage(imageId, is);
	}

	public static com.liferay.portal.model.Image updateImage(long imageId,
		java.io.InputStream is, boolean cleanUpStream)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImage(imageId, is, cleanUpStream);
	}

	public static com.liferay.portal.model.Image updateImage(long imageId,
		byte[] bytes, java.lang.String type, int height, int width, int size)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateImage(imageId, bytes, type, height, width, size);
	}

	public static ImageLocalService getService() {
		if (_service == null) {
			_service = (ImageLocalService)PortalBeanLocatorUtil.locate(ImageLocalService.class.getName());

			ReferenceRegistry.registerReference(ImageLocalServiceUtil.class,
				"_service");
			MethodCache.remove(ImageLocalService.class);
		}

		return _service;
	}

	public void setService(ImageLocalService service) {
		MethodCache.remove(ImageLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(ImageLocalServiceUtil.class,
			"_service");
		MethodCache.remove(ImageLocalService.class);
	}

	private static ImageLocalService _service;
}