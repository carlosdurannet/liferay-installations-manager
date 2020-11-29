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
 * This class is used by SOAP remote services, specifically {@link net.carlosduran.liferay.lim.service.http.InstallationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class InstallationSoap implements Serializable {

	public static InstallationSoap toSoapModel(Installation model) {
		InstallationSoap soapModel = new InstallationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setInstallationId(model.getInstallationId());
		soapModel.setDescription(model.getDescription());
		soapModel.setPath(model.getPath());
		soapModel.setVersion(model.getVersion());
		soapModel.setVmId(model.getVmId());
		soapModel.setSchemeId(model.getSchemeId());

		return soapModel;
	}

	public static InstallationSoap[] toSoapModels(Installation[] models) {
		InstallationSoap[] soapModels = new InstallationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InstallationSoap[][] toSoapModels(Installation[][] models) {
		InstallationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InstallationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InstallationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InstallationSoap[] toSoapModels(List<Installation> models) {
		List<InstallationSoap> soapModels = new ArrayList<InstallationSoap>(
			models.size());

		for (Installation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InstallationSoap[soapModels.size()]);
	}

	public InstallationSoap() {
	}

	public long getPrimaryKey() {
		return _installationId;
	}

	public void setPrimaryKey(long pk) {
		setInstallationId(pk);
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

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getPath() {
		return _path;
	}

	public void setPath(String path) {
		_path = path;
	}

	public String getVersion() {
		return _version;
	}

	public void setVersion(String version) {
		_version = version;
	}

	public long getVmId() {
		return _vmId;
	}

	public void setVmId(long vmId) {
		_vmId = vmId;
	}

	public long getSchemeId() {
		return _schemeId;
	}

	public void setSchemeId(long schemeId) {
		_schemeId = schemeId;
	}

	private String _uuid;
	private long _installationId;
	private String _description;
	private String _path;
	private String _version;
	private long _vmId;
	private long _schemeId;

}