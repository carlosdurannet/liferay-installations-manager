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

import net.carlosduran.liferay.lim.service.persistence.Installations_ModulesPK;

/**
 * This class is used by SOAP remote services, specifically {@link net.carlosduran.liferay.lim.service.http.Installations_ModulesServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class Installations_ModulesSoap implements Serializable {

	public static Installations_ModulesSoap toSoapModel(
		Installations_Modules model) {

		Installations_ModulesSoap soapModel = new Installations_ModulesSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setInstallationId(model.getInstallationId());
		soapModel.setModuleId(model.getModuleId());

		return soapModel;
	}

	public static Installations_ModulesSoap[] toSoapModels(
		Installations_Modules[] models) {

		Installations_ModulesSoap[] soapModels =
			new Installations_ModulesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Installations_ModulesSoap[][] toSoapModels(
		Installations_Modules[][] models) {

		Installations_ModulesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new Installations_ModulesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Installations_ModulesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Installations_ModulesSoap[] toSoapModels(
		List<Installations_Modules> models) {

		List<Installations_ModulesSoap> soapModels =
			new ArrayList<Installations_ModulesSoap>(models.size());

		for (Installations_Modules model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new Installations_ModulesSoap[soapModels.size()]);
	}

	public Installations_ModulesSoap() {
	}

	public Installations_ModulesPK getPrimaryKey() {
		return new Installations_ModulesPK(_installationId, _moduleId);
	}

	public void setPrimaryKey(Installations_ModulesPK pk) {
		setInstallationId(pk.installationId);
		setModuleId(pk.moduleId);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getInstallationId() {
		return _installationId;
	}

	public void setInstallationId(long installationId) {
		_installationId = installationId;
	}

	public long getModuleId() {
		return _moduleId;
	}

	public void setModuleId(long moduleId) {
		_moduleId = moduleId;
	}

	private String _uuid;
	private long _installationId;
	private long _moduleId;

}