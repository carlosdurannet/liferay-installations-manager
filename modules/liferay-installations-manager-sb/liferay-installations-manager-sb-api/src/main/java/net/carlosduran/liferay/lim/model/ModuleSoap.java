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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.carlosduran.liferay.lim.service.http.ModuleServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ModuleSoap implements Serializable {

	public static ModuleSoap toSoapModel(Module model) {
		ModuleSoap soapModel = new ModuleSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setModuleId(model.getModuleId());
		soapModel.setName(model.getName());
		soapModel.setType(model.getType());
		soapModel.setDescription(model.getDescription());
		soapModel.setGitlabUrl(model.getGitlabUrl());

		return soapModel;
	}

	public static ModuleSoap[] toSoapModels(Module[] models) {
		ModuleSoap[] soapModels = new ModuleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ModuleSoap[][] toSoapModels(Module[][] models) {
		ModuleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ModuleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ModuleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ModuleSoap[] toSoapModels(List<Module> models) {
		List<ModuleSoap> soapModels = new ArrayList<ModuleSoap>(models.size());

		for (Module model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ModuleSoap[soapModels.size()]);
	}

	public ModuleSoap() {
	}

	public long getPrimaryKey() {
		return _moduleId;
	}

	public void setPrimaryKey(long pk) {
		setModuleId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getModuleId() {
		return _moduleId;
	}

	public void setModuleId(long moduleId) {
		_moduleId = moduleId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_type = type;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getGitlabUrl() {
		return _gitlabUrl;
	}

	public void setGitlabUrl(String gitlabUrl) {
		_gitlabUrl = gitlabUrl;
	}

	private String _uuid;
	private long _moduleId;
	private String _name;
	private int _type;
	private String _description;
	private String _gitlabUrl;

}