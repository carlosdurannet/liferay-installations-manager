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
 * This class is a wrapper for {@link Site}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Site
 * @generated
 */
public class SiteWrapper
	extends BaseModelWrapper<Site> implements ModelWrapper<Site>, Site {

	public SiteWrapper(Site site) {
		super(site);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("siteId", getSiteId());
		attributes.put("name", getName());
		attributes.put("privateSite", isPrivateSite());
		attributes.put("friendlyUrl", getFriendlyUrl());
		attributes.put("virtualhost", getVirtualhost());
		attributes.put("description", getDescription());
		attributes.put("installationId", getInstallationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long siteId = (Long)attributes.get("siteId");

		if (siteId != null) {
			setSiteId(siteId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Boolean privateSite = (Boolean)attributes.get("privateSite");

		if (privateSite != null) {
			setPrivateSite(privateSite);
		}

		String friendlyUrl = (String)attributes.get("friendlyUrl");

		if (friendlyUrl != null) {
			setFriendlyUrl(friendlyUrl);
		}

		String virtualhost = (String)attributes.get("virtualhost");

		if (virtualhost != null) {
			setVirtualhost(virtualhost);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long installationId = (Long)attributes.get("installationId");

		if (installationId != null) {
			setInstallationId(installationId);
		}
	}

	/**
	 * Returns the description of this site.
	 *
	 * @return the description of this site
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the friendly url of this site.
	 *
	 * @return the friendly url of this site
	 */
	@Override
	public String getFriendlyUrl() {
		return model.getFriendlyUrl();
	}

	/**
	 * Returns the installation ID of this site.
	 *
	 * @return the installation ID of this site
	 */
	@Override
	public long getInstallationId() {
		return model.getInstallationId();
	}

	/**
	 * Returns the name of this site.
	 *
	 * @return the name of this site
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this site.
	 *
	 * @return the primary key of this site
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the private site of this site.
	 *
	 * @return the private site of this site
	 */
	@Override
	public boolean getPrivateSite() {
		return model.getPrivateSite();
	}

	/**
	 * Returns the site ID of this site.
	 *
	 * @return the site ID of this site
	 */
	@Override
	public long getSiteId() {
		return model.getSiteId();
	}

	/**
	 * Returns the virtualhost of this site.
	 *
	 * @return the virtualhost of this site
	 */
	@Override
	public String getVirtualhost() {
		return model.getVirtualhost();
	}

	/**
	 * Returns <code>true</code> if this site is private site.
	 *
	 * @return <code>true</code> if this site is private site; <code>false</code> otherwise
	 */
	@Override
	public boolean isPrivateSite() {
		return model.isPrivateSite();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the description of this site.
	 *
	 * @param description the description of this site
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the friendly url of this site.
	 *
	 * @param friendlyUrl the friendly url of this site
	 */
	@Override
	public void setFriendlyUrl(String friendlyUrl) {
		model.setFriendlyUrl(friendlyUrl);
	}

	/**
	 * Sets the installation ID of this site.
	 *
	 * @param installationId the installation ID of this site
	 */
	@Override
	public void setInstallationId(long installationId) {
		model.setInstallationId(installationId);
	}

	/**
	 * Sets the name of this site.
	 *
	 * @param name the name of this site
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this site.
	 *
	 * @param primaryKey the primary key of this site
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets whether this site is private site.
	 *
	 * @param privateSite the private site of this site
	 */
	@Override
	public void setPrivateSite(boolean privateSite) {
		model.setPrivateSite(privateSite);
	}

	/**
	 * Sets the site ID of this site.
	 *
	 * @param siteId the site ID of this site
	 */
	@Override
	public void setSiteId(long siteId) {
		model.setSiteId(siteId);
	}

	/**
	 * Sets the virtualhost of this site.
	 *
	 * @param virtualhost the virtualhost of this site
	 */
	@Override
	public void setVirtualhost(String virtualhost) {
		model.setVirtualhost(virtualhost);
	}

	@Override
	protected SiteWrapper wrap(Site site) {
		return new SiteWrapper(site);
	}

}