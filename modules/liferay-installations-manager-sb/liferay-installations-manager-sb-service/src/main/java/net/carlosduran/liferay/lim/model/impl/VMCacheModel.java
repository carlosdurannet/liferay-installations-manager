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

import net.carlosduran.liferay.lim.model.VM;

/**
 * The cache model class for representing VM in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VMCacheModel implements CacheModel<VM>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof VMCacheModel)) {
			return false;
		}

		VMCacheModel vmCacheModel = (VMCacheModel)object;

		if (vmId == vmCacheModel.vmId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vmId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", vmId=");
		sb.append(vmId);
		sb.append(", hostname=");
		sb.append(hostname);
		sb.append(", ip=");
		sb.append(ip);
		sb.append(", so=");
		sb.append(so);
		sb.append(", vcpus=");
		sb.append(vcpus);
		sb.append(", ram=");
		sb.append(ram);
		sb.append(", storage=");
		sb.append(storage);
		sb.append(", jdk=");
		sb.append(jdk);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VM toEntityModel() {
		VMImpl vmImpl = new VMImpl();

		if (uuid == null) {
			vmImpl.setUuid("");
		}
		else {
			vmImpl.setUuid(uuid);
		}

		vmImpl.setVmId(vmId);

		if (hostname == null) {
			vmImpl.setHostname("");
		}
		else {
			vmImpl.setHostname(hostname);
		}

		if (ip == null) {
			vmImpl.setIp("");
		}
		else {
			vmImpl.setIp(ip);
		}

		if (so == null) {
			vmImpl.setSo("");
		}
		else {
			vmImpl.setSo(so);
		}

		vmImpl.setVcpus(vcpus);
		vmImpl.setRam(ram);
		vmImpl.setStorage(storage);
		vmImpl.setJdk(jdk);

		vmImpl.resetOriginalValues();

		return vmImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		vmId = objectInput.readLong();
		hostname = objectInput.readUTF();
		ip = objectInput.readUTF();
		so = objectInput.readUTF();

		vcpus = objectInput.readInt();

		ram = objectInput.readInt();

		storage = objectInput.readInt();

		jdk = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(vmId);

		if (hostname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hostname);
		}

		if (ip == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ip);
		}

		if (so == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(so);
		}

		objectOutput.writeInt(vcpus);

		objectOutput.writeInt(ram);

		objectOutput.writeInt(storage);

		objectOutput.writeInt(jdk);
	}

	public String uuid;
	public long vmId;
	public String hostname;
	public String ip;
	public String so;
	public int vcpus;
	public int ram;
	public int storage;
	public int jdk;

}