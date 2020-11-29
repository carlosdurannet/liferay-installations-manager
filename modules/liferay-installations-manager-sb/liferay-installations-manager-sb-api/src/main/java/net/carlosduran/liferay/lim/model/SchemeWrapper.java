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
 * This class is a wrapper for {@link Scheme}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Scheme
 * @generated
 */
public class SchemeWrapper
	extends BaseModelWrapper<Scheme> implements ModelWrapper<Scheme>, Scheme {

	public SchemeWrapper(Scheme scheme) {
		super(scheme);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("schemeId", getSchemeId());
		attributes.put("name", getName());
		attributes.put("serverHostname", getServerHostname());
		attributes.put("serverIP", getServerIP());
		attributes.put("dbUser", getDbUser());
		attributes.put("dbPass", getDbPass());
		attributes.put("dbName", getDbName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long schemeId = (Long)attributes.get("schemeId");

		if (schemeId != null) {
			setSchemeId(schemeId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String serverHostname = (String)attributes.get("serverHostname");

		if (serverHostname != null) {
			setServerHostname(serverHostname);
		}

		String serverIP = (String)attributes.get("serverIP");

		if (serverIP != null) {
			setServerIP(serverIP);
		}

		String dbUser = (String)attributes.get("dbUser");

		if (dbUser != null) {
			setDbUser(dbUser);
		}

		String dbPass = (String)attributes.get("dbPass");

		if (dbPass != null) {
			setDbPass(dbPass);
		}

		String dbName = (String)attributes.get("dbName");

		if (dbName != null) {
			setDbName(dbName);
		}
	}

	/**
	 * Returns the db name of this scheme.
	 *
	 * @return the db name of this scheme
	 */
	@Override
	public String getDbName() {
		return model.getDbName();
	}

	/**
	 * Returns the db pass of this scheme.
	 *
	 * @return the db pass of this scheme
	 */
	@Override
	public String getDbPass() {
		return model.getDbPass();
	}

	/**
	 * Returns the db user of this scheme.
	 *
	 * @return the db user of this scheme
	 */
	@Override
	public String getDbUser() {
		return model.getDbUser();
	}

	/**
	 * Returns the name of this scheme.
	 *
	 * @return the name of this scheme
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this scheme.
	 *
	 * @return the primary key of this scheme
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the scheme ID of this scheme.
	 *
	 * @return the scheme ID of this scheme
	 */
	@Override
	public long getSchemeId() {
		return model.getSchemeId();
	}

	/**
	 * Returns the server hostname of this scheme.
	 *
	 * @return the server hostname of this scheme
	 */
	@Override
	public String getServerHostname() {
		return model.getServerHostname();
	}

	/**
	 * Returns the server ip of this scheme.
	 *
	 * @return the server ip of this scheme
	 */
	@Override
	public String getServerIP() {
		return model.getServerIP();
	}

	/**
	 * Returns the uuid of this scheme.
	 *
	 * @return the uuid of this scheme
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
	 * Sets the db name of this scheme.
	 *
	 * @param dbName the db name of this scheme
	 */
	@Override
	public void setDbName(String dbName) {
		model.setDbName(dbName);
	}

	/**
	 * Sets the db pass of this scheme.
	 *
	 * @param dbPass the db pass of this scheme
	 */
	@Override
	public void setDbPass(String dbPass) {
		model.setDbPass(dbPass);
	}

	/**
	 * Sets the db user of this scheme.
	 *
	 * @param dbUser the db user of this scheme
	 */
	@Override
	public void setDbUser(String dbUser) {
		model.setDbUser(dbUser);
	}

	/**
	 * Sets the name of this scheme.
	 *
	 * @param name the name of this scheme
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this scheme.
	 *
	 * @param primaryKey the primary key of this scheme
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the scheme ID of this scheme.
	 *
	 * @param schemeId the scheme ID of this scheme
	 */
	@Override
	public void setSchemeId(long schemeId) {
		model.setSchemeId(schemeId);
	}

	/**
	 * Sets the server hostname of this scheme.
	 *
	 * @param serverHostname the server hostname of this scheme
	 */
	@Override
	public void setServerHostname(String serverHostname) {
		model.setServerHostname(serverHostname);
	}

	/**
	 * Sets the server ip of this scheme.
	 *
	 * @param serverIP the server ip of this scheme
	 */
	@Override
	public void setServerIP(String serverIP) {
		model.setServerIP(serverIP);
	}

	/**
	 * Sets the uuid of this scheme.
	 *
	 * @param uuid the uuid of this scheme
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected SchemeWrapper wrap(Scheme scheme) {
		return new SchemeWrapper(scheme);
	}

}