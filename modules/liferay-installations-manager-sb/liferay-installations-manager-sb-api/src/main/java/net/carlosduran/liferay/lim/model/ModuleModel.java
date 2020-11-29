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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Module service. Represents a row in the &quot;LIM_Module&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>net.carlosduran.liferay.lim.model.impl.ModuleModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>net.carlosduran.liferay.lim.model.impl.ModuleImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Module
 * @generated
 */
@ProviderType
public interface ModuleModel extends BaseModel<Module> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a module model instance should use the {@link Module} interface instead.
	 */

	/**
	 * Returns the primary key of this module.
	 *
	 * @return the primary key of this module
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this module.
	 *
	 * @param primaryKey the primary key of this module
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this module.
	 *
	 * @return the uuid of this module
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this module.
	 *
	 * @param uuid the uuid of this module
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the module ID of this module.
	 *
	 * @return the module ID of this module
	 */
	public long getModuleId();

	/**
	 * Sets the module ID of this module.
	 *
	 * @param moduleId the module ID of this module
	 */
	public void setModuleId(long moduleId);

	/**
	 * Returns the name of this module.
	 *
	 * @return the name of this module
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this module.
	 *
	 * @param name the name of this module
	 */
	public void setName(String name);

	/**
	 * Returns the type of this module.
	 *
	 * @return the type of this module
	 */
	public int getType();

	/**
	 * Sets the type of this module.
	 *
	 * @param type the type of this module
	 */
	public void setType(int type);

	/**
	 * Returns the description of this module.
	 *
	 * @return the description of this module
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this module.
	 *
	 * @param description the description of this module
	 */
	public void setDescription(String description);

	/**
	 * Returns the gitlab url of this module.
	 *
	 * @return the gitlab url of this module
	 */
	@AutoEscape
	public String getGitlabUrl();

	/**
	 * Sets the gitlab url of this module.
	 *
	 * @param gitlabUrl the gitlab url of this module
	 */
	public void setGitlabUrl(String gitlabUrl);

}