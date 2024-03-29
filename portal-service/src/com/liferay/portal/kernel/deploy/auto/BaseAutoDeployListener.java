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

package com.liferay.portal.kernel.deploy.auto;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.File;
import java.io.IOException;

import java.util.zip.ZipFile;

/**
 * @author Ivica Cardic
 * @author Brian Wing Shun Chan
 * @author Ryan Park
 */
public abstract class BaseAutoDeployListener implements AutoDeployListener {

	public boolean isExtPlugin(File file) {
		String fileName = file.getName();

		if (fileName.contains("-ext")) {
			return true;
		}

		return false;
	}

	public boolean isHookPlugin(File file) throws AutoDeployException {
		String fileName = file.getName();

		if (isMatchingFile(file, "WEB-INF/liferay-plugin-package.properties") &&
			fileName.contains("-hook") && !fileName.contains("-portlet")) {

			return true;
		}

		return false;
	}

	public boolean isLiferayPackage(File file) {
		String fileName = file.getName();

		if (fileName.endsWith(".lpkg")) {
			return true;
		}

		return false;
	}

	public boolean isMatchingFile(File file, String checkXmlFile)
		throws AutoDeployException {

		if (!isMatchingFileExtension(file)) {
			return false;
		}

		ZipFile zipFile = null;

		try {
			zipFile = new ZipFile(file);

			if (zipFile.getEntry(checkXmlFile) == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(
						file.getPath() + " does not have " + checkXmlFile);
				}

				return false;
			}
			else {
				return true;
			}
		}
		catch (IOException ioe) {
			throw new AutoDeployException(ioe);
		}
		finally {
			if (zipFile != null) {
				try {
					zipFile.close();
				}
				catch (IOException ioe) {
				}
			}
		}
	}

	public boolean isMatchingFileExtension(File file) {
		String fileName = file.getName().toLowerCase();

		if (fileName.endsWith(".war") || fileName.endsWith(".zip")) {
			if (_log.isDebugEnabled()) {
				_log.debug(file.getPath() + " has a matching extension");
			}

			return true;
		}
		else {
			if (_log.isDebugEnabled()) {
				_log.debug(
					file.getPath() + " does not have a matching extension");
			}

			return false;
		}
	}

	public boolean isThemePlugin(File file) throws AutoDeployException {
		if (isMatchingFile(file, "WEB-INF/liferay-look-and-feel.xml")) {
			return true;
		}

		String fileName = file.getName();

		if (isMatchingFile(file, "WEB-INF/liferay-plugin-package.properties") &&
			fileName.contains("-theme")) {

			return true;
		}

		return false;
	}

	public boolean isWebPlugin(File file) throws AutoDeployException {
		String fileName = file.getName();

		if (isMatchingFile(file, "WEB-INF/liferay-plugin-package.properties") &&
			fileName.contains("-web")) {

			return true;
		}

		return false;
	}

	private static Log _log = LogFactoryUtil.getLog(
		BaseAutoDeployListener.class);

}