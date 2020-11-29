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

import net.carlosduran.liferay.lim.model.Site;

/**
 * The cache model class for representing Site in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SiteCacheModel implements CacheModel<Site>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SiteCacheModel)) {
			return false;
		}

		SiteCacheModel siteCacheModel = (SiteCacheModel)object;

		if (siteId == siteCacheModel.siteId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, siteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{siteId=");
		sb.append(siteId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", privateSite=");
		sb.append(privateSite);
		sb.append(", friendlyUrl=");
		sb.append(friendlyUrl);
		sb.append(", virtualhost=");
		sb.append(virtualhost);
		sb.append(", description=");
		sb.append(description);
		sb.append(", installationId=");
		sb.append(installationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Site toEntityModel() {
		SiteImpl siteImpl = new SiteImpl();

		siteImpl.setSiteId(siteId);

		if (name == null) {
			siteImpl.setName("");
		}
		else {
			siteImpl.setName(name);
		}

		siteImpl.setPrivateSite(privateSite);

		if (friendlyUrl == null) {
			siteImpl.setFriendlyUrl("");
		}
		else {
			siteImpl.setFriendlyUrl(friendlyUrl);
		}

		if (virtualhost == null) {
			siteImpl.setVirtualhost("");
		}
		else {
			siteImpl.setVirtualhost(virtualhost);
		}

		if (description == null) {
			siteImpl.setDescription("");
		}
		else {
			siteImpl.setDescription(description);
		}

		siteImpl.setInstallationId(installationId);

		siteImpl.resetOriginalValues();

		return siteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		siteId = objectInput.readLong();
		name = objectInput.readUTF();

		privateSite = objectInput.readBoolean();
		friendlyUrl = objectInput.readUTF();
		virtualhost = objectInput.readUTF();
		description = objectInput.readUTF();

		installationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(siteId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeBoolean(privateSite);

		if (friendlyUrl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(friendlyUrl);
		}

		if (virtualhost == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(virtualhost);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(installationId);
	}

	public long siteId;
	public String name;
	public boolean privateSite;
	public String friendlyUrl;
	public String virtualhost;
	public String description;
	public long installationId;

}