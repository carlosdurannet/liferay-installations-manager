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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import net.carlosduran.liferay.lim.model.Site;
import net.carlosduran.liferay.lim.model.SiteModel;
import net.carlosduran.liferay.lim.model.SiteSoap;

/**
 * The base model implementation for the Site service. Represents a row in the &quot;LIM_Site&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SiteModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SiteImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SiteImpl
 * @generated
 */
@JSON(strict = true)
public class SiteModelImpl extends BaseModelImpl<Site> implements SiteModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a site model instance should use the <code>Site</code> interface instead.
	 */
	public static final String TABLE_NAME = "LIM_Site";

	public static final Object[][] TABLE_COLUMNS = {
		{"siteId", Types.BIGINT}, {"name", Types.VARCHAR},
		{"privateSite", Types.BOOLEAN}, {"friendlyUrl", Types.VARCHAR},
		{"virtualhost", Types.VARCHAR}, {"description", Types.VARCHAR},
		{"installationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("siteId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("privateSite", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("friendlyUrl", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("virtualhost", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("installationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table LIM_Site (siteId LONG not null primary key,name VARCHAR(75) null,privateSite BOOLEAN,friendlyUrl VARCHAR(75) null,virtualhost VARCHAR(75) null,description VARCHAR(75) null,installationId LONG)";

	public static final String TABLE_SQL_DROP = "drop table LIM_Site";

	public static final String ORDER_BY_JPQL = " ORDER BY site.siteId ASC";

	public static final String ORDER_BY_SQL = " ORDER BY LIM_Site.siteId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)
	 */
	@Deprecated
	public static final long SITEID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static Site toModel(SiteSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Site model = new SiteImpl();

		model.setSiteId(soapModel.getSiteId());
		model.setName(soapModel.getName());
		model.setPrivateSite(soapModel.isPrivateSite());
		model.setFriendlyUrl(soapModel.getFriendlyUrl());
		model.setVirtualhost(soapModel.getVirtualhost());
		model.setDescription(soapModel.getDescription());
		model.setInstallationId(soapModel.getInstallationId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<Site> toModels(SiteSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Site> models = new ArrayList<Site>(soapModels.length);

		for (SiteSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public SiteModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _siteId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSiteId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _siteId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Site.class;
	}

	@Override
	public String getModelClassName() {
		return Site.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Site, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Site, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Site, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Site)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Site, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Site, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((Site)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Site, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Site, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Site>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Site.class.getClassLoader(), Site.class, ModelWrapper.class);

		try {
			Constructor<Site> constructor =
				(Constructor<Site>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Site, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Site, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Site, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Site, Object>>();
		Map<String, BiConsumer<Site, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Site, ?>>();

		attributeGetterFunctions.put("siteId", Site::getSiteId);
		attributeSetterBiConsumers.put(
			"siteId", (BiConsumer<Site, Long>)Site::setSiteId);
		attributeGetterFunctions.put("name", Site::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<Site, String>)Site::setName);
		attributeGetterFunctions.put("privateSite", Site::getPrivateSite);
		attributeSetterBiConsumers.put(
			"privateSite", (BiConsumer<Site, Boolean>)Site::setPrivateSite);
		attributeGetterFunctions.put("friendlyUrl", Site::getFriendlyUrl);
		attributeSetterBiConsumers.put(
			"friendlyUrl", (BiConsumer<Site, String>)Site::setFriendlyUrl);
		attributeGetterFunctions.put("virtualhost", Site::getVirtualhost);
		attributeSetterBiConsumers.put(
			"virtualhost", (BiConsumer<Site, String>)Site::setVirtualhost);
		attributeGetterFunctions.put("description", Site::getDescription);
		attributeSetterBiConsumers.put(
			"description", (BiConsumer<Site, String>)Site::setDescription);
		attributeGetterFunctions.put("installationId", Site::getInstallationId);
		attributeSetterBiConsumers.put(
			"installationId", (BiConsumer<Site, Long>)Site::setInstallationId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getSiteId() {
		return _siteId;
	}

	@Override
	public void setSiteId(long siteId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_siteId = siteId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	@JSON
	@Override
	public boolean getPrivateSite() {
		return _privateSite;
	}

	@JSON
	@Override
	public boolean isPrivateSite() {
		return _privateSite;
	}

	@Override
	public void setPrivateSite(boolean privateSite) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_privateSite = privateSite;
	}

	@JSON
	@Override
	public String getFriendlyUrl() {
		if (_friendlyUrl == null) {
			return "";
		}
		else {
			return _friendlyUrl;
		}
	}

	@Override
	public void setFriendlyUrl(String friendlyUrl) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_friendlyUrl = friendlyUrl;
	}

	@JSON
	@Override
	public String getVirtualhost() {
		if (_virtualhost == null) {
			return "";
		}
		else {
			return _virtualhost;
		}
	}

	@Override
	public void setVirtualhost(String virtualhost) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_virtualhost = virtualhost;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return "";
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_description = description;
	}

	@JSON
	@Override
	public long getInstallationId() {
		return _installationId;
	}

	@Override
	public void setInstallationId(long installationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_installationId = installationId;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (entry.getValue() != getColumnValue(entry.getKey())) {
				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Site.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Site toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Site>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SiteImpl siteImpl = new SiteImpl();

		siteImpl.setSiteId(getSiteId());
		siteImpl.setName(getName());
		siteImpl.setPrivateSite(isPrivateSite());
		siteImpl.setFriendlyUrl(getFriendlyUrl());
		siteImpl.setVirtualhost(getVirtualhost());
		siteImpl.setDescription(getDescription());
		siteImpl.setInstallationId(getInstallationId());

		siteImpl.resetOriginalValues();

		return siteImpl;
	}

	@Override
	public int compareTo(Site site) {
		long primaryKey = site.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Site)) {
			return false;
		}

		Site site = (Site)object;

		long primaryKey = site.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Site> toCacheModel() {
		SiteCacheModel siteCacheModel = new SiteCacheModel();

		siteCacheModel.siteId = getSiteId();

		siteCacheModel.name = getName();

		String name = siteCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			siteCacheModel.name = null;
		}

		siteCacheModel.privateSite = isPrivateSite();

		siteCacheModel.friendlyUrl = getFriendlyUrl();

		String friendlyUrl = siteCacheModel.friendlyUrl;

		if ((friendlyUrl != null) && (friendlyUrl.length() == 0)) {
			siteCacheModel.friendlyUrl = null;
		}

		siteCacheModel.virtualhost = getVirtualhost();

		String virtualhost = siteCacheModel.virtualhost;

		if ((virtualhost != null) && (virtualhost.length() == 0)) {
			siteCacheModel.virtualhost = null;
		}

		siteCacheModel.description = getDescription();

		String description = siteCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			siteCacheModel.description = null;
		}

		siteCacheModel.installationId = getInstallationId();

		return siteCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Site, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Site, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Site, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Site)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Site, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Site, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Site, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Site)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Site>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private long _siteId;
	private String _name;
	private boolean _privateSite;
	private String _friendlyUrl;
	private String _virtualhost;
	private String _description;
	private long _installationId;

	public <T> T getColumnValue(String columnName) {
		Function<Site, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Site)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("siteId", _siteId);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("privateSite", _privateSite);
		_columnOriginalValues.put("friendlyUrl", _friendlyUrl);
		_columnOriginalValues.put("virtualhost", _virtualhost);
		_columnOriginalValues.put("description", _description);
		_columnOriginalValues.put("installationId", _installationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("siteId", 1L);

		columnBitmasks.put("name", 2L);

		columnBitmasks.put("privateSite", 4L);

		columnBitmasks.put("friendlyUrl", 8L);

		columnBitmasks.put("virtualhost", 16L);

		columnBitmasks.put("description", 32L);

		columnBitmasks.put("installationId", 64L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Site _escapedModel;

}