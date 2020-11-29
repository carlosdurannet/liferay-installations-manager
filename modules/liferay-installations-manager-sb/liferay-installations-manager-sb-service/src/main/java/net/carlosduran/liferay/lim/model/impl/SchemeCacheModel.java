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

package net.carlosduran.liferay.lim.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import net.carlosduran.liferay.lim.model.Scheme;

/**
 * The cache model class for representing Scheme in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SchemeCacheModel implements CacheModel<Scheme>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SchemeCacheModel)) {
			return false;
		}

		SchemeCacheModel schemeCacheModel = (SchemeCacheModel)object;

		if (schemeId == schemeCacheModel.schemeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, schemeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", schemeId=");
		sb.append(schemeId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", serverHostname=");
		sb.append(serverHostname);
		sb.append(", serverIP=");
		sb.append(serverIP);
		sb.append(", dbUser=");
		sb.append(dbUser);
		sb.append(", dbPass=");
		sb.append(dbPass);
		sb.append(", dbName=");
		sb.append(dbName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Scheme toEntityModel() {
		SchemeImpl schemeImpl = new SchemeImpl();

		if (uuid == null) {
			schemeImpl.setUuid("");
		}
		else {
			schemeImpl.setUuid(uuid);
		}

		schemeImpl.setSchemeId(schemeId);

		if (name == null) {
			schemeImpl.setName("");
		}
		else {
			schemeImpl.setName(name);
		}

		if (serverHostname == null) {
			schemeImpl.setServerHostname("");
		}
		else {
			schemeImpl.setServerHostname(serverHostname);
		}

		if (serverIP == null) {
			schemeImpl.setServerIP("");
		}
		else {
			schemeImpl.setServerIP(serverIP);
		}

		if (dbUser == null) {
			schemeImpl.setDbUser("");
		}
		else {
			schemeImpl.setDbUser(dbUser);
		}

		if (dbPass == null) {
			schemeImpl.setDbPass("");
		}
		else {
			schemeImpl.setDbPass(dbPass);
		}

		if (dbName == null) {
			schemeImpl.setDbName("");
		}
		else {
			schemeImpl.setDbName(dbName);
		}

		schemeImpl.resetOriginalValues();

		return schemeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		schemeId = objectInput.readLong();
		name = objectInput.readUTF();
		serverHostname = objectInput.readUTF();
		serverIP = objectInput.readUTF();
		dbUser = objectInput.readUTF();
		dbPass = objectInput.readUTF();
		dbName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(schemeId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (serverHostname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serverHostname);
		}

		if (serverIP == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serverIP);
		}

		if (dbUser == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dbUser);
		}

		if (dbPass == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dbPass);
		}

		if (dbName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dbName);
		}
	}

	public String uuid;
	public long schemeId;
	public String name;
	public String serverHostname;
	public String serverIP;
	public String dbUser;
	public String dbPass;
	public String dbName;

}