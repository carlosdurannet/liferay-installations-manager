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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Installations_Modules}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Installations_Modules
 * @generated
 */
public class Installations_ModulesWrapper
	extends BaseModelWrapper<Installations_Modules>
	implements Installations_Modules, ModelWrapper<Installations_Modules> {

	public Installations_ModulesWrapper(
		Installations_Modules installations_Modules) {

		super(installations_Modules);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("installationId", getInstallationId());
		attributes.put("moduleId", getModuleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long installationId = (Long)attributes.get("installationId");

		if (installationId != null) {
			setInstallationId(installationId);
		}

		Long moduleId = (Long)attributes.get("moduleId");

		if (moduleId != null) {
			setModuleId(moduleId);
		}
	}

	/**
	 * Returns the installation ID of this installations_ modules.
	 *
	 * @return the installation ID of this installations_ modules
	 */
	@Override
	public long getInstallationId() {
		return model.getInstallationId();
	}

	/**
	 * Returns the module ID of this installations_ modules.
	 *
	 * @return the module ID of this installations_ modules
	 */
	@Override
	public long getModuleId() {
		return model.getModuleId();
	}

	/**
	 * Returns the primary key of this installations_ modules.
	 *
	 * @return the primary key of this installations_ modules
	 */
	@Override
	public
		net.carlosduran.liferay.lim.service.persistence.Installations_ModulesPK
			getPrimaryKey() {

		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this installations_ modules.
	 *
	 * @return the uuid of this installations_ modules
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the installation ID of this installations_ modules.
	 *
	 * @param installationId the installation ID of this installations_ modules
	 */
	@Override
	public void setInstallationId(long installationId) {
		model.setInstallationId(installationId);
	}

	/**
	 * Sets the module ID of this installations_ modules.
	 *
	 * @param moduleId the module ID of this installations_ modules
	 */
	@Override
	public void setModuleId(long moduleId) {
		model.setModuleId(moduleId);
	}

	/**
	 * Sets the primary key of this installations_ modules.
	 *
	 * @param primaryKey the primary key of this installations_ modules
	 */
	@Override
	public void setPrimaryKey(
		net.carlosduran.liferay.lim.service.persistence.Installations_ModulesPK
			primaryKey) {

		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this installations_ modules.
	 *
	 * @param uuid the uuid of this installations_ modules
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected Installations_ModulesWrapper wrap(
		Installations_Modules installations_Modules) {

		return new Installations_ModulesWrapper(installations_Modules);
	}

}