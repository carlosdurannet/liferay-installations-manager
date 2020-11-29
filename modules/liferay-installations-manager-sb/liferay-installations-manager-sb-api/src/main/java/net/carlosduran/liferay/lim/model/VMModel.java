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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the VM service. Represents a row in the &quot;LIM_VM&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>net.carlosduran.liferay.lim.model.impl.VMModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>net.carlosduran.liferay.lim.model.impl.VMImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VM
 * @generated
 */
@ProviderType
public interface VMModel extends BaseModel<VM> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vm model instance should use the {@link VM} interface instead.
	 */

	/**
	 * Returns the primary key of this vm.
	 *
	 * @return the primary key of this vm
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vm.
	 *
	 * @param primaryKey the primary key of this vm
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this vm.
	 *
	 * @return the uuid of this vm
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this vm.
	 *
	 * @param uuid the uuid of this vm
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the vm ID of this vm.
	 *
	 * @return the vm ID of this vm
	 */
	public long getVmId();

	/**
	 * Sets the vm ID of this vm.
	 *
	 * @param vmId the vm ID of this vm
	 */
	public void setVmId(long vmId);

	/**
	 * Returns the hostname of this vm.
	 *
	 * @return the hostname of this vm
	 */
	@AutoEscape
	public String getHostname();

	/**
	 * Sets the hostname of this vm.
	 *
	 * @param hostname the hostname of this vm
	 */
	public void setHostname(String hostname);

	/**
	 * Returns the ip of this vm.
	 *
	 * @return the ip of this vm
	 */
	@AutoEscape
	public String getIp();

	/**
	 * Sets the ip of this vm.
	 *
	 * @param ip the ip of this vm
	 */
	public void setIp(String ip);

	/**
	 * Returns the so of this vm.
	 *
	 * @return the so of this vm
	 */
	@AutoEscape
	public String getSo();

	/**
	 * Sets the so of this vm.
	 *
	 * @param so the so of this vm
	 */
	public void setSo(String so);

	/**
	 * Returns the vcpus of this vm.
	 *
	 * @return the vcpus of this vm
	 */
	public int getVcpus();

	/**
	 * Sets the vcpus of this vm.
	 *
	 * @param vcpus the vcpus of this vm
	 */
	public void setVcpus(int vcpus);

	/**
	 * Returns the ram of this vm.
	 *
	 * @return the ram of this vm
	 */
	public int getRam();

	/**
	 * Sets the ram of this vm.
	 *
	 * @param ram the ram of this vm
	 */
	public void setRam(int ram);

	/**
	 * Returns the storage of this vm.
	 *
	 * @return the storage of this vm
	 */
	public int getStorage();

	/**
	 * Sets the storage of this vm.
	 *
	 * @param storage the storage of this vm
	 */
	public void setStorage(int storage);

	/**
	 * Returns the jdk of this vm.
	 *
	 * @return the jdk of this vm
	 */
	public int getJdk();

	/**
	 * Sets the jdk of this vm.
	 *
	 * @param jdk the jdk of this vm
	 */
	public void setJdk(int jdk);

}