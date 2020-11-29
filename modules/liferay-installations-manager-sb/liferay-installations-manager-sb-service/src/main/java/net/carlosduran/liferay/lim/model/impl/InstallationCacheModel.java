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

import net.carlosduran.liferay.lim.model.Installation;

/**
 * The cache model class for representing Installation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class InstallationCacheModel
	implements CacheModel<Installation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof InstallationCacheModel)) {
			return false;
		}

		InstallationCacheModel installationCacheModel =
			(InstallationCacheModel)object;

		if (installationId == installationCacheModel.installationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, installationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", installationId=");
		sb.append(installationId);
		sb.append(", description=");
		sb.append(description);
		sb.append(", path=");
		sb.append(path);
		sb.append(", version=");
		sb.append(version);
		sb.append(", vmId=");
		sb.append(vmId);
		sb.append(", schemeId=");
		sb.append(schemeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Installation toEntityModel() {
		InstallationImpl installationImpl = new InstallationImpl();

		if (uuid == null) {
			installationImpl.setUuid("");
		}
		else {
			installationImpl.setUuid(uuid);
		}

		installationImpl.setInstallationId(installationId);

		if (description == null) {
			installationImpl.setDescription("");
		}
		else {
			installationImpl.setDescription(description);
		}

		if (path == null) {
			installationImpl.setPath("");
		}
		else {
			installationImpl.setPath(path);
		}

		if (version == null) {
			installationImpl.setVersion("");
		}
		else {
			installationImpl.setVersion(version);
		}

		installationImpl.setVmId(vmId);
		installationImpl.setSchemeId(schemeId);

		installationImpl.resetOriginalValues();

		return installationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		installationId = objectInput.readLong();
		description = objectInput.readUTF();
		path = objectInput.readUTF();
		version = objectInput.readUTF();

		vmId = objectInput.readLong();

		schemeId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(installationId);

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (path == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(path);
		}

		if (version == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(version);
		}

		objectOutput.writeLong(vmId);

		objectOutput.writeLong(schemeId);
	}

	public String uuid;
	public long installationId;
	public String description;
	public String path;
	public String version;
	public long vmId;
	public long schemeId;

}