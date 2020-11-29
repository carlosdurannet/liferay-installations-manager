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

import net.carlosduran.liferay.lim.model.VM;
import net.carlosduran.liferay.lim.model.VMModel;
import net.carlosduran.liferay.lim.model.VMSoap;

/**
 * The base model implementation for the VM service. Represents a row in the &quot;LIM_VM&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>VMModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VMImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VMImpl
 * @generated
 */
@JSON(strict = true)
public class VMModelImpl extends BaseModelImpl<VM> implements VMModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vm model instance should use the <code>VM</code> interface instead.
	 */
	public static final String TABLE_NAME = "LIM_VM";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"vmId", Types.BIGINT},
		{"hostname", Types.VARCHAR}, {"ip", Types.VARCHAR},
		{"so", Types.VARCHAR}, {"vcpus", Types.INTEGER}, {"ram", Types.INTEGER},
		{"storage", Types.INTEGER}, {"jdk", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("vmId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("hostname", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ip", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("so", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("vcpus", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("ram", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("storage", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("jdk", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table LIM_VM (uuid_ VARCHAR(75) null,vmId LONG not null primary key,hostname VARCHAR(75) null,ip VARCHAR(75) null,so VARCHAR(75) null,vcpus INTEGER,ram INTEGER,storage INTEGER,jdk INTEGER)";

	public static final String TABLE_SQL_DROP = "drop table LIM_VM";

	public static final String ORDER_BY_JPQL = " ORDER BY vm.vmId ASC";

	public static final String ORDER_BY_SQL = " ORDER BY LIM_VM.vmId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)
	 */
	@Deprecated
	public static final long VMID_COLUMN_BITMASK = 2L;

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
	public static VM toModel(VMSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		VM model = new VMImpl();

		model.setUuid(soapModel.getUuid());
		model.setVmId(soapModel.getVmId());
		model.setHostname(soapModel.getHostname());
		model.setIp(soapModel.getIp());
		model.setSo(soapModel.getSo());
		model.setVcpus(soapModel.getVcpus());
		model.setRam(soapModel.getRam());
		model.setStorage(soapModel.getStorage());
		model.setJdk(soapModel.getJdk());

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
	public static List<VM> toModels(VMSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<VM> models = new ArrayList<VM>(soapModels.length);

		for (VMSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public VMModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _vmId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setVmId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vmId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return VM.class;
	}

	@Override
	public String getModelClassName() {
		return VM.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<VM, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<VM, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<VM, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((VM)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<VM, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<VM, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((VM)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<VM, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<VM, Object>> getAttributeSetterBiConsumers() {
		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, VM> _getProxyProviderFunction() {
		Class<?> proxyClass = ProxyUtil.getProxyClass(
			VM.class.getClassLoader(), VM.class, ModelWrapper.class);

		try {
			Constructor<VM> constructor =
				(Constructor<VM>)proxyClass.getConstructor(
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

	private static final Map<String, Function<VM, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<VM, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<VM, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<VM, Object>>();
		Map<String, BiConsumer<VM, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<VM, ?>>();

		attributeGetterFunctions.put("uuid", VM::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<VM, String>)VM::setUuid);
		attributeGetterFunctions.put("vmId", VM::getVmId);
		attributeSetterBiConsumers.put(
			"vmId", (BiConsumer<VM, Long>)VM::setVmId);
		attributeGetterFunctions.put("hostname", VM::getHostname);
		attributeSetterBiConsumers.put(
			"hostname", (BiConsumer<VM, String>)VM::setHostname);
		attributeGetterFunctions.put("ip", VM::getIp);
		attributeSetterBiConsumers.put("ip", (BiConsumer<VM, String>)VM::setIp);
		attributeGetterFunctions.put("so", VM::getSo);
		attributeSetterBiConsumers.put("so", (BiConsumer<VM, String>)VM::setSo);
		attributeGetterFunctions.put("vcpus", VM::getVcpus);
		attributeSetterBiConsumers.put(
			"vcpus", (BiConsumer<VM, Integer>)VM::setVcpus);
		attributeGetterFunctions.put("ram", VM::getRam);
		attributeSetterBiConsumers.put(
			"ram", (BiConsumer<VM, Integer>)VM::setRam);
		attributeGetterFunctions.put("storage", VM::getStorage);
		attributeSetterBiConsumers.put(
			"storage", (BiConsumer<VM, Integer>)VM::setStorage);
		attributeGetterFunctions.put("jdk", VM::getJdk);
		attributeSetterBiConsumers.put(
			"jdk", (BiConsumer<VM, Integer>)VM::setJdk);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getVmId() {
		return _vmId;
	}

	@Override
	public void setVmId(long vmId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_vmId = vmId;
	}

	@JSON
	@Override
	public String getHostname() {
		if (_hostname == null) {
			return "";
		}
		else {
			return _hostname;
		}
	}

	@Override
	public void setHostname(String hostname) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_hostname = hostname;
	}

	@JSON
	@Override
	public String getIp() {
		if (_ip == null) {
			return "";
		}
		else {
			return _ip;
		}
	}

	@Override
	public void setIp(String ip) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ip = ip;
	}

	@JSON
	@Override
	public String getSo() {
		if (_so == null) {
			return "";
		}
		else {
			return _so;
		}
	}

	@Override
	public void setSo(String so) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_so = so;
	}

	@JSON
	@Override
	public int getVcpus() {
		return _vcpus;
	}

	@Override
	public void setVcpus(int vcpus) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_vcpus = vcpus;
	}

	@JSON
	@Override
	public int getRam() {
		return _ram;
	}

	@Override
	public void setRam(int ram) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ram = ram;
	}

	@JSON
	@Override
	public int getStorage() {
		return _storage;
	}

	@Override
	public void setStorage(int storage) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_storage = storage;
	}

	@JSON
	@Override
	public int getJdk() {
		return _jdk;
	}

	@Override
	public void setJdk(int jdk) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_jdk = jdk;
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
			0, VM.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VM toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, VM> escapedModelProxyProviderFunction =
				EscapedModelProxyProviderFunctionHolder.
					_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VMImpl vmImpl = new VMImpl();

		vmImpl.setUuid(getUuid());
		vmImpl.setVmId(getVmId());
		vmImpl.setHostname(getHostname());
		vmImpl.setIp(getIp());
		vmImpl.setSo(getSo());
		vmImpl.setVcpus(getVcpus());
		vmImpl.setRam(getRam());
		vmImpl.setStorage(getStorage());
		vmImpl.setJdk(getJdk());

		vmImpl.resetOriginalValues();

		return vmImpl;
	}

	@Override
	public int compareTo(VM vm) {
		long primaryKey = vm.getPrimaryKey();

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

		if (!(object instanceof VM)) {
			return false;
		}

		VM vm = (VM)object;

		long primaryKey = vm.getPrimaryKey();

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
	public CacheModel<VM> toCacheModel() {
		VMCacheModel vmCacheModel = new VMCacheModel();

		vmCacheModel.uuid = getUuid();

		String uuid = vmCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			vmCacheModel.uuid = null;
		}

		vmCacheModel.vmId = getVmId();

		vmCacheModel.hostname = getHostname();

		String hostname = vmCacheModel.hostname;

		if ((hostname != null) && (hostname.length() == 0)) {
			vmCacheModel.hostname = null;
		}

		vmCacheModel.ip = getIp();

		String ip = vmCacheModel.ip;

		if ((ip != null) && (ip.length() == 0)) {
			vmCacheModel.ip = null;
		}

		vmCacheModel.so = getSo();

		String so = vmCacheModel.so;

		if ((so != null) && (so.length() == 0)) {
			vmCacheModel.so = null;
		}

		vmCacheModel.vcpus = getVcpus();

		vmCacheModel.ram = getRam();

		vmCacheModel.storage = getStorage();

		vmCacheModel.jdk = getJdk();

		return vmCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<VM, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<VM, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<VM, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((VM)this));
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
		Map<String, Function<VM, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<VM, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<VM, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((VM)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, VM>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

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

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<VM, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((VM)this);
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

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("vmId", _vmId);
		_columnOriginalValues.put("hostname", _hostname);
		_columnOriginalValues.put("ip", _ip);
		_columnOriginalValues.put("so", _so);
		_columnOriginalValues.put("vcpus", _vcpus);
		_columnOriginalValues.put("ram", _ram);
		_columnOriginalValues.put("storage", _storage);
		_columnOriginalValues.put("jdk", _jdk);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("vmId", 2L);

		columnBitmasks.put("hostname", 4L);

		columnBitmasks.put("ip", 8L);

		columnBitmasks.put("so", 16L);

		columnBitmasks.put("vcpus", 32L);

		columnBitmasks.put("ram", 64L);

		columnBitmasks.put("storage", 128L);

		columnBitmasks.put("jdk", 256L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private VM _escapedModel;

}