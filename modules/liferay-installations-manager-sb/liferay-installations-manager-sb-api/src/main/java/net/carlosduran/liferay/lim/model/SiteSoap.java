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
 * This class is used by SOAP remote services, specifically {@link net.carlosduran.liferay.lim.service.http.SiteServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class SiteSoap implements Serializable {

	public static SiteSoap toSoapModel(Site model) {
		SiteSoap soapModel = new SiteSoap();

		soapModel.setSiteId(model.getSiteId());
		soapModel.setName(model.getName());
		soapModel.setPrivateSite(model.isPrivateSite());
		soapModel.setFriendlyUrl(model.getFriendlyUrl());
		soapModel.setVirtualhost(model.getVirtualhost());
		soapModel.setDescription(model.getDescription());
		soapModel.setInstallationId(model.getInstallationId());

		return soapModel;
	}

	public static SiteSoap[] toSoapModels(Site[] models) {
		SiteSoap[] soapModels = new SiteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SiteSoap[][] toSoapModels(Site[][] models) {
		SiteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SiteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SiteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SiteSoap[] toSoapModels(List<Site> models) {
		List<SiteSoap> soapModels = new ArrayList<SiteSoap>(models.size());

		for (Site model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SiteSoap[soapModels.size()]);
	}

	public SiteSoap() {
	}

	public long getPrimaryKey() {
		return _siteId;
	}

	public void setPrimaryKey(long pk) {
		setSiteId(pk);
	}

	public long getSiteId() {
		return _siteId;
	}

	public void setSiteId(long siteId) {
		_siteId = siteId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public boolean getPrivateSite() {
		return _privateSite;
	}

	public boolean isPrivateSite() {
		return _privateSite;
	}

	public void setPrivateSite(boolean privateSite) {
		_privateSite = privateSite;
	}

	public String getFriendlyUrl() {
		return _friendlyUrl;
	}

	public void setFriendlyUrl(String friendlyUrl) {
		_friendlyUrl = friendlyUrl;
	}

	public String getVirtualhost() {
		return _virtualhost;
	}

	public void setVirtualhost(String virtualhost) {
		_virtualhost = virtualhost;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getInstallationId() {
		return _installationId;
	}

	public void setInstallationId(long installationId) {
		_installationId = installationId;
	}

	private long _siteId;
	private String _name;
	private boolean _privateSite;
	private String _friendlyUrl;
	private String _virtualhost;
	private String _description;
	private long _installationId;

}