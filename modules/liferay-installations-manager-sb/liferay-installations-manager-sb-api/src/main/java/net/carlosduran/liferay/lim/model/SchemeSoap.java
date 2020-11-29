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
 * This class is used by SOAP remote services, specifically {@link net.carlosduran.liferay.lim.service.http.SchemeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class SchemeSoap implements Serializable {

	public static SchemeSoap toSoapModel(Scheme model) {
		SchemeSoap soapModel = new SchemeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setSchemeId(model.getSchemeId());
		soapModel.setName(model.getName());
		soapModel.setServerHostname(model.getServerHostname());
		soapModel.setServerIP(model.getServerIP());
		soapModel.setDbUser(model.getDbUser());
		soapModel.setDbPass(model.getDbPass());
		soapModel.setDbName(model.getDbName());

		return soapModel;
	}

	public static SchemeSoap[] toSoapModels(Scheme[] models) {
		SchemeSoap[] soapModels = new SchemeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SchemeSoap[][] toSoapModels(Scheme[][] models) {
		SchemeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SchemeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SchemeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SchemeSoap[] toSoapModels(List<Scheme> models) {
		List<SchemeSoap> soapModels = new ArrayList<SchemeSoap>(models.size());

		for (Scheme model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SchemeSoap[soapModels.size()]);
	}

	public SchemeSoap() {
	}

	public long getPrimaryKey() {
		return _schemeId;
	}

	public void setPrimaryKey(long pk) {
		setSchemeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getSchemeId() {
		return _schemeId;
	}

	public void setSchemeId(long schemeId) {
		_schemeId = schemeId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getServerHostname() {
		return _serverHostname;
	}

	public void setServerHostname(String serverHostname) {
		_serverHostname = serverHostname;
	}

	public String getServerIP() {
		return _serverIP;
	}

	public void setServerIP(String serverIP) {
		_serverIP = serverIP;
	}

	public String getDbUser() {
		return _dbUser;
	}

	public void setDbUser(String dbUser) {
		_dbUser = dbUser;
	}

	public String getDbPass() {
		return _dbPass;
	}

	public void setDbPass(String dbPass) {
		_dbPass = dbPass;
	}

	public String getDbName() {
		return _dbName;
	}

	public void setDbName(String dbName) {
		_dbName = dbName;
	}

	private String _uuid;
	private long _schemeId;
	private String _name;
	private String _serverHostname;
	private String _serverIP;
	private String _dbUser;
	private String _dbPass;
	private String _dbName;

}