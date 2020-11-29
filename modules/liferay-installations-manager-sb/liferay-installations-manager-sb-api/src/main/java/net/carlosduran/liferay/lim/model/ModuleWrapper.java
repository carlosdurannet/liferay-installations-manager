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
 * This class is a wrapper for {@link Module}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Module
 * @generated
 */
public class ModuleWrapper
	extends BaseModelWrapper<Module> implements ModelWrapper<Module>, Module {

	public ModuleWrapper(Module module) {
		super(module);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("moduleId", getModuleId());
		attributes.put("name", getName());
		attributes.put("type", getType());
		attributes.put("description", getDescription());
		attributes.put("gitlabUrl", getGitlabUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long moduleId = (Long)attributes.get("moduleId");

		if (moduleId != null) {
			setModuleId(moduleId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String gitlabUrl = (String)attributes.get("gitlabUrl");

		if (gitlabUrl != null) {
			setGitlabUrl(gitlabUrl);
		}
	}

	/**
	 * Returns the description of this module.
	 *
	 * @return the description of this module
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the gitlab url of this module.
	 *
	 * @return the gitlab url of this module
	 */
	@Override
	public String getGitlabUrl() {
		return model.getGitlabUrl();
	}

	/**
	 * Returns the module ID of this module.
	 *
	 * @return the module ID of this module
	 */
	@Override
	public long getModuleId() {
		return model.getModuleId();
	}

	/**
	 * Returns the name of this module.
	 *
	 * @return the name of this module
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this module.
	 *
	 * @return the primary key of this module
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type of this module.
	 *
	 * @return the type of this module
	 */
	@Override
	public int getType() {
		return model.getType();
	}

	/**
	 * Returns the uuid of this module.
	 *
	 * @return the uuid of this module
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
	 * Sets the description of this module.
	 *
	 * @param description the description of this module
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the gitlab url of this module.
	 *
	 * @param gitlabUrl the gitlab url of this module
	 */
	@Override
	public void setGitlabUrl(String gitlabUrl) {
		model.setGitlabUrl(gitlabUrl);
	}

	/**
	 * Sets the module ID of this module.
	 *
	 * @param moduleId the module ID of this module
	 */
	@Override
	public void setModuleId(long moduleId) {
		model.setModuleId(moduleId);
	}

	/**
	 * Sets the name of this module.
	 *
	 * @param name the name of this module
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this module.
	 *
	 * @param primaryKey the primary key of this module
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type of this module.
	 *
	 * @param type the type of this module
	 */
	@Override
	public void setType(int type) {
		model.setType(type);
	}

	/**
	 * Sets the uuid of this module.
	 *
	 * @param uuid the uuid of this module
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected ModuleWrapper wrap(Module module) {
		return new ModuleWrapper(module);
	}

}