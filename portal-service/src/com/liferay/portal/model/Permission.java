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

package com.liferay.portal.model;

import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Permission service. Represents a row in the &quot;Permission_&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PermissionModel
 * @see com.liferay.portal.model.impl.PermissionImpl
 * @see com.liferay.portal.model.impl.PermissionModelImpl
 * @generated
 */
public interface Permission extends PermissionModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.PermissionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Permission, Long> PERMISSION_ID_ACCESSOR = new Accessor<Permission, Long>() {
			public Long get(Permission permission) {
				return permission.getPermissionId();
			}
		};

	public java.lang.String getName();

	public java.lang.String getPrimKey();

	public int getScope();

	public void setName(java.lang.String name);

	public void setPrimKey(java.lang.String primKey);

	public void setScope(int scope);
}