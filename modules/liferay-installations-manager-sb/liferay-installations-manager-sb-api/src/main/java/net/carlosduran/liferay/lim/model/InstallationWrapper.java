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
 * This class is a wrapper for {@link Installation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Installation
 * @generated
 */
public class InstallationWrapper
	extends BaseModelWrapper<Installation>
	implements Installation, ModelWrapper<Installation> {

	public InstallationWrapper(Installation installation) {
		super(installation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("installationId", getInstallationId());
		attributes.put("description", getDescription());
		attributes.put("path", getPath());
		attributes.put("version", getVersion());
		attributes.put("vmId", getVmId());
		attributes.put("schemeId", getSchemeId());

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

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String path = (String)attributes.get("path");

		if (path != null) {
			setPath(path);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		Long vmId = (Long)attributes.get("vmId");

		if (vmId != null) {
			setVmId(vmId);
		}

		Long schemeId = (Long)attributes.get("schemeId");

		if (schemeId != null) {
			setSchemeId(schemeId);
		}
	}

	/**
	 * Returns the description of this installation.
	 *
	 * @return the description of this installation
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the installation ID of this installation.
	 *
	 * @return the installation ID of this installation
	 */
	@Override
	public long getInstallationId() {
		return model.getInstallationId();
	}

	/**
	 * Returns the path of this installation.
	 *
	 * @return the path of this installation
	 */
	@Override
	public String getPath() {
		return model.getPath();
	}

	/**
	 * Returns the primary key of this installation.
	 *
	 * @return the primary key of this installation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the scheme ID of this installation.
	 *
	 * @return the scheme ID of this installation
	 */
	@Override
	public long getSchemeId() {
		return model.getSchemeId();
	}

	/**
	 * Returns the uuid of this installation.
	 *
	 * @return the uuid of this installation
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the version of this installation.
	 *
	 * @return the version of this installation
	 */
	@Override
	public String getVersion() {
		return model.getVersion();
	}

	/**
	 * Returns the vm ID of this installation.
	 *
	 * @return the vm ID of this installation
	 */
	@Override
	public long getVmId() {
		return model.getVmId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the description of this installation.
	 *
	 * @param description the description of this installation
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the installation ID of this installation.
	 *
	 * @param installationId the installation ID of this installation
	 */
	@Override
	public void setInstallationId(long installationId) {
		model.setInstallationId(installationId);
	}

	/**
	 * Sets the path of this installation.
	 *
	 * @param path the path of this installation
	 */
	@Override
	public void setPath(String path) {
		model.setPath(path);
	}

	/**
	 * Sets the primary key of this installation.
	 *
	 * @param primaryKey the primary key of this installation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the scheme ID of this installation.
	 *
	 * @param schemeId the scheme ID of this installation
	 */
	@Override
	public void setSchemeId(long schemeId) {
		model.setSchemeId(schemeId);
	}

	/**
	 * Sets the uuid of this installation.
	 *
	 * @param uuid the uuid of this installation
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the version of this installation.
	 *
	 * @param version the version of this installation
	 */
	@Override
	public void setVersion(String version) {
		model.setVersion(version);
	}

	/**
	 * Sets the vm ID of this installation.
	 *
	 * @param vmId the vm ID of this installation
	 */
	@Override
	public void setVmId(long vmId) {
		model.setVmId(vmId);
	}

	@Override
	protected InstallationWrapper wrap(Installation installation) {
		return new InstallationWrapper(installation);
	}

}