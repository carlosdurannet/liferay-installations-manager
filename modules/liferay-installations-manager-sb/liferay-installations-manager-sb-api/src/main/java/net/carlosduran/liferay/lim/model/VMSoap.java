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
 * This class is used by SOAP remote services, specifically {@link net.carlosduran.liferay.lim.service.http.VMServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class VMSoap implements Serializable {

	public static VMSoap toSoapModel(VM model) {
		VMSoap soapModel = new VMSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setVmId(model.getVmId());
		soapModel.setHostname(model.getHostname());
		soapModel.setIp(model.getIp());
		soapModel.setSo(model.getSo());
		soapModel.setVcpus(model.getVcpus());
		soapModel.setRam(model.getRam());
		soapModel.setStorage(model.getStorage());
		soapModel.setJdk(model.getJdk());

		return soapModel;
	}

	public static VMSoap[] toSoapModels(VM[] models) {
		VMSoap[] soapModels = new VMSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VMSoap[][] toSoapModels(VM[][] models) {
		VMSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VMSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VMSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VMSoap[] toSoapModels(List<VM> models) {
		List<VMSoap> soapModels = new ArrayList<VMSoap>(models.size());

		for (VM model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VMSoap[soapModels.size()]);
	}

	public VMSoap() {
	}

	public long getPrimaryKey() {
		return _vmId;
	}

	public void setPrimaryKey(long pk) {
		setVmId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getVmId() {
		return _vmId;
	}

	public void setVmId(long vmId) {
		_vmId = vmId;
	}

	public String getHostname() {
		return _hostname;
	}

	public void setHostname(String hostname) {
		_hostname = hostname;
	}

	public String getIp() {
		return _ip;
	}

	public void setIp(String ip) {
		_ip = ip;
	}

	public String getSo() {
		return _so;
	}

	public void setSo(String so) {
		_so = so;
	}

	public int getVcpus() {
		return _vcpus;
	}

	public void setVcpus(int vcpus) {
		_vcpus = vcpus;
	}

	public int getRam() {
		return _ram;
	}

	public void setRam(int ram) {
		_ram = ram;
	}

	public int getStorage() {
		return _storage;
	}

	public void setStorage(int storage) {
		_storage = storage;
	}

	public int getJdk() {
		return _jdk;
	}

	public void setJdk(int jdk) {
		_jdk = jdk;
	}

	private String _uuid;
	private long _vmId;
	private String _hostname;
	private String _ip;
	private String _so;
	private int _vcpus;
	private int _ram;
	private int _storage;
	private int _jdk;

}