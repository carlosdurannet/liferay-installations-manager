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
 * This class is a wrapper for {@link VM}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VM
 * @generated
 */
public class VMWrapper
	extends BaseModelWrapper<VM> implements ModelWrapper<VM>, VM {

	public VMWrapper(VM vm) {
		super(vm);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("vmId", getVmId());
		attributes.put("hostname", getHostname());
		attributes.put("ip", getIp());
		attributes.put("so", getSo());
		attributes.put("vcpus", getVcpus());
		attributes.put("ram", getRam());
		attributes.put("storage", getStorage());
		attributes.put("jdk", getJdk());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long vmId = (Long)attributes.get("vmId");

		if (vmId != null) {
			setVmId(vmId);
		}

		String hostname = (String)attributes.get("hostname");

		if (hostname != null) {
			setHostname(hostname);
		}

		String ip = (String)attributes.get("ip");

		if (ip != null) {
			setIp(ip);
		}

		String so = (String)attributes.get("so");

		if (so != null) {
			setSo(so);
		}

		Integer vcpus = (Integer)attributes.get("vcpus");

		if (vcpus != null) {
			setVcpus(vcpus);
		}

		Integer ram = (Integer)attributes.get("ram");

		if (ram != null) {
			setRam(ram);
		}

		Integer storage = (Integer)attributes.get("storage");

		if (storage != null) {
			setStorage(storage);
		}

		Integer jdk = (Integer)attributes.get("jdk");

		if (jdk != null) {
			setJdk(jdk);
		}
	}

	/**
	 * Returns the hostname of this vm.
	 *
	 * @return the hostname of this vm
	 */
	@Override
	public String getHostname() {
		return model.getHostname();
	}

	/**
	 * Returns the ip of this vm.
	 *
	 * @return the ip of this vm
	 */
	@Override
	public String getIp() {
		return model.getIp();
	}

	/**
	 * Returns the jdk of this vm.
	 *
	 * @return the jdk of this vm
	 */
	@Override
	public int getJdk() {
		return model.getJdk();
	}

	/**
	 * Returns the primary key of this vm.
	 *
	 * @return the primary key of this vm
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the ram of this vm.
	 *
	 * @return the ram of this vm
	 */
	@Override
	public int getRam() {
		return model.getRam();
	}

	/**
	 * Returns the so of this vm.
	 *
	 * @return the so of this vm
	 */
	@Override
	public String getSo() {
		return model.getSo();
	}

	/**
	 * Returns the storage of this vm.
	 *
	 * @return the storage of this vm
	 */
	@Override
	public int getStorage() {
		return model.getStorage();
	}

	/**
	 * Returns the uuid of this vm.
	 *
	 * @return the uuid of this vm
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the vcpus of this vm.
	 *
	 * @return the vcpus of this vm
	 */
	@Override
	public int getVcpus() {
		return model.getVcpus();
	}

	/**
	 * Returns the vm ID of this vm.
	 *
	 * @return the vm ID of this vm
	 */
	@Override
	public long getVmId() {
		return model.getVmId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the hostname of this vm.
	 *
	 * @param hostname the hostname of this vm
	 */
	@Override
	public void setHostname(String hostname) {
		model.setHostname(hostname);
	}

	/**
	 * Sets the ip of this vm.
	 *
	 * @param ip the ip of this vm
	 */
	@Override
	public void setIp(String ip) {
		model.setIp(ip);
	}

	/**
	 * Sets the jdk of this vm.
	 *
	 * @param jdk the jdk of this vm
	 */
	@Override
	public void setJdk(int jdk) {
		model.setJdk(jdk);
	}

	/**
	 * Sets the primary key of this vm.
	 *
	 * @param primaryKey the primary key of this vm
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the ram of this vm.
	 *
	 * @param ram the ram of this vm
	 */
	@Override
	public void setRam(int ram) {
		model.setRam(ram);
	}

	/**
	 * Sets the so of this vm.
	 *
	 * @param so the so of this vm
	 */
	@Override
	public void setSo(String so) {
		model.setSo(so);
	}

	/**
	 * Sets the storage of this vm.
	 *
	 * @param storage the storage of this vm
	 */
	@Override
	public void setStorage(int storage) {
		model.setStorage(storage);
	}

	/**
	 * Sets the uuid of this vm.
	 *
	 * @param uuid the uuid of this vm
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the vcpus of this vm.
	 *
	 * @param vcpus the vcpus of this vm
	 */
	@Override
	public void setVcpus(int vcpus) {
		model.setVcpus(vcpus);
	}

	/**
	 * Sets the vm ID of this vm.
	 *
	 * @param vmId the vm ID of this vm
	 */
	@Override
	public void setVmId(long vmId) {
		model.setVmId(vmId);
	}

	@Override
	protected VMWrapper wrap(VM vm) {
		return new VMWrapper(vm);
	}

}