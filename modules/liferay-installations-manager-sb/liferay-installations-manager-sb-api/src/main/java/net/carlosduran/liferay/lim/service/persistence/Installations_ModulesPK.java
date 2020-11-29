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

package net.carlosduran.liferay.lim.service.persistence;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Installations_ModulesPK
	implements Comparable<Installations_ModulesPK>, Serializable {

	public long installationId;
	public long moduleId;

	public Installations_ModulesPK() {
	}

	public Installations_ModulesPK(long installationId, long moduleId) {
		this.installationId = installationId;
		this.moduleId = moduleId;
	}

	public long getInstallationId() {
		return installationId;
	}

	public void setInstallationId(long installationId) {
		this.installationId = installationId;
	}

	public long getModuleId() {
		return moduleId;
	}

	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
	}

	@Override
	public int compareTo(Installations_ModulesPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (installationId < pk.installationId) {
			value = -1;
		}
		else if (installationId > pk.installationId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (moduleId < pk.moduleId) {
			value = -1;
		}
		else if (moduleId > pk.moduleId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Installations_ModulesPK)) {
			return false;
		}

		Installations_ModulesPK pk = (Installations_ModulesPK)object;

		if ((installationId == pk.installationId) &&
			(moduleId == pk.moduleId)) {

			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, installationId);
		hashCode = HashUtil.hash(hashCode, moduleId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("installationId=");

		sb.append(installationId);
		sb.append(", moduleId=");

		sb.append(moduleId);

		sb.append("}");

		return sb.toString();
	}

}