/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package net.carlosduran.liferay.lim.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Installations_Modules service. Represents a row in the &quot;LIM_Installations_Modules&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see Installations_ModulesModel
 * @generated
 */
@ImplementationClassName(
	"net.carlosduran.liferay.lim.model.impl.Installations_ModulesImpl"
)
@ProviderType
public interface Installations_Modules
	extends Installations_ModulesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>net.carlosduran.liferay.lim.model.impl.Installations_ModulesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Installations_Modules, Long>
		INSTALLATION_ID_ACCESSOR = new Accessor<Installations_Modules, Long>() {

			@Override
			public Long get(Installations_Modules installations_Modules) {
				return installations_Modules.getInstallationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Installations_Modules> getTypeClass() {
				return Installations_Modules.class;
			}

		};
	public static final Accessor<Installations_Modules, Long>
		MODULE_ID_ACCESSOR = new Accessor<Installations_Modules, Long>() {

			@Override
			public Long get(Installations_Modules installations_Modules) {
				return installations_Modules.getModuleId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Installations_Modules> getTypeClass() {
				return Installations_Modules.class;
			}

		};

}