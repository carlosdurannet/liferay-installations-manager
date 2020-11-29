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

import net.carlosduran.liferay.lim.model.Module;

/**
 * The cache model class for representing Module in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ModuleCacheModel implements CacheModel<Module>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ModuleCacheModel)) {
			return false;
		}

		ModuleCacheModel moduleCacheModel = (ModuleCacheModel)object;

		if (moduleId == moduleCacheModel.moduleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, moduleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", moduleId=");
		sb.append(moduleId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", type=");
		sb.append(type);
		sb.append(", description=");
		sb.append(description);
		sb.append(", gitlabUrl=");
		sb.append(gitlabUrl);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Module toEntityModel() {
		ModuleImpl moduleImpl = new ModuleImpl();

		if (uuid == null) {
			moduleImpl.setUuid("");
		}
		else {
			moduleImpl.setUuid(uuid);
		}

		moduleImpl.setModuleId(moduleId);

		if (name == null) {
			moduleImpl.setName("");
		}
		else {
			moduleImpl.setName(name);
		}

		moduleImpl.setType(type);

		if (description == null) {
			moduleImpl.setDescription("");
		}
		else {
			moduleImpl.setDescription(description);
		}

		if (gitlabUrl == null) {
			moduleImpl.setGitlabUrl("");
		}
		else {
			moduleImpl.setGitlabUrl(gitlabUrl);
		}

		moduleImpl.resetOriginalValues();

		return moduleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		moduleId = objectInput.readLong();
		name = objectInput.readUTF();

		type = objectInput.readInt();
		description = objectInput.readUTF();
		gitlabUrl = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(moduleId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(type);

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (gitlabUrl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gitlabUrl);
		}
	}

	public String uuid;
	public long moduleId;
	public String name;
	public int type;
	public String description;
	public String gitlabUrl;

}