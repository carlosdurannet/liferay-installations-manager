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

import net.carlosduran.liferay.lim.model.Installations_Modules;
import net.carlosduran.liferay.lim.service.persistence.Installations_ModulesPK;

/**
 * The cache model class for representing Installations_Modules in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Installations_ModulesCacheModel
	implements CacheModel<Installations_Modules>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Installations_ModulesCacheModel)) {
			return false;
		}

		Installations_ModulesCacheModel installations_ModulesCacheModel =
			(Installations_ModulesCacheModel)object;

		if (installations_ModulesPK.equals(
				installations_ModulesCacheModel.installations_ModulesPK)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, installations_ModulesPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", installationId=");
		sb.append(installationId);
		sb.append(", moduleId=");
		sb.append(moduleId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Installations_Modules toEntityModel() {
		Installations_ModulesImpl installations_ModulesImpl =
			new Installations_ModulesImpl();

		if (uuid == null) {
			installations_ModulesImpl.setUuid("");
		}
		else {
			installations_ModulesImpl.setUuid(uuid);
		}

		installations_ModulesImpl.setInstallationId(installationId);
		installations_ModulesImpl.setModuleId(moduleId);

		installations_ModulesImpl.resetOriginalValues();

		return installations_ModulesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		installationId = objectInput.readLong();

		moduleId = objectInput.readLong();

		installations_ModulesPK = new Installations_ModulesPK(
			installationId, moduleId);
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

		objectOutput.writeLong(moduleId);
	}

	public String uuid;
	public long installationId;
	public long moduleId;
	public transient Installations_ModulesPK installations_ModulesPK;

}