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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import net.carlosduran.liferay.lim.model.VM;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the vm service. This utility wraps <code>net.carlosduran.liferay.lim.service.persistence.impl.VMPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VMPersistence
 * @generated
 */
public class VMUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(VM vm) {
		getPersistence().clearCache(vm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, VM> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VM> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VM> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VM> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VM> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VM update(VM vm) {
		return getPersistence().update(vm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VM update(VM vm, ServiceContext serviceContext) {
		return getPersistence().update(vm, serviceContext);
	}

	/**
	 * Returns all the vms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching vms
	 */
	public static List<VM> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the vms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VMModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @return the range of matching vms
	 */
	public static List<VM> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the vms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VMModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vms
	 */
	public static List<VM> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<VM> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the vms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VMModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching vms
	 */
	public static List<VM> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<VM> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first vm in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vm
	 * @throws NoSuchVMException if a matching vm could not be found
	 */
	public static VM findByUuid_First(
			String uuid, OrderByComparator<VM> orderByComparator)
		throws net.carlosduran.liferay.lim.exception.NoSuchVMException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first vm in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vm, or <code>null</code> if a matching vm could not be found
	 */
	public static VM fetchByUuid_First(
		String uuid, OrderByComparator<VM> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last vm in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vm
	 * @throws NoSuchVMException if a matching vm could not be found
	 */
	public static VM findByUuid_Last(
			String uuid, OrderByComparator<VM> orderByComparator)
		throws net.carlosduran.liferay.lim.exception.NoSuchVMException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last vm in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vm, or <code>null</code> if a matching vm could not be found
	 */
	public static VM fetchByUuid_Last(
		String uuid, OrderByComparator<VM> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the vms before and after the current vm in the ordered set where uuid = &#63;.
	 *
	 * @param vmId the primary key of the current vm
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vm
	 * @throws NoSuchVMException if a vm with the primary key could not be found
	 */
	public static VM[] findByUuid_PrevAndNext(
			long vmId, String uuid, OrderByComparator<VM> orderByComparator)
		throws net.carlosduran.liferay.lim.exception.NoSuchVMException {

		return getPersistence().findByUuid_PrevAndNext(
			vmId, uuid, orderByComparator);
	}

	/**
	 * Removes all the vms where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of vms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching vms
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the vm in the entity cache if it is enabled.
	 *
	 * @param vm the vm
	 */
	public static void cacheResult(VM vm) {
		getPersistence().cacheResult(vm);
	}

	/**
	 * Caches the vms in the entity cache if it is enabled.
	 *
	 * @param vms the vms
	 */
	public static void cacheResult(List<VM> vms) {
		getPersistence().cacheResult(vms);
	}

	/**
	 * Creates a new vm with the primary key. Does not add the vm to the database.
	 *
	 * @param vmId the primary key for the new vm
	 * @return the new vm
	 */
	public static VM create(long vmId) {
		return getPersistence().create(vmId);
	}

	/**
	 * Removes the vm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vmId the primary key of the vm
	 * @return the vm that was removed
	 * @throws NoSuchVMException if a vm with the primary key could not be found
	 */
	public static VM remove(long vmId)
		throws net.carlosduran.liferay.lim.exception.NoSuchVMException {

		return getPersistence().remove(vmId);
	}

	public static VM updateImpl(VM vm) {
		return getPersistence().updateImpl(vm);
	}

	/**
	 * Returns the vm with the primary key or throws a <code>NoSuchVMException</code> if it could not be found.
	 *
	 * @param vmId the primary key of the vm
	 * @return the vm
	 * @throws NoSuchVMException if a vm with the primary key could not be found
	 */
	public static VM findByPrimaryKey(long vmId)
		throws net.carlosduran.liferay.lim.exception.NoSuchVMException {

		return getPersistence().findByPrimaryKey(vmId);
	}

	/**
	 * Returns the vm with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vmId the primary key of the vm
	 * @return the vm, or <code>null</code> if a vm with the primary key could not be found
	 */
	public static VM fetchByPrimaryKey(long vmId) {
		return getPersistence().fetchByPrimaryKey(vmId);
	}

	/**
	 * Returns all the vms.
	 *
	 * @return the vms
	 */
	public static List<VM> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the vms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VMModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @return the range of vms
	 */
	public static List<VM> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the vms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VMModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vms
	 */
	public static List<VM> findAll(
		int start, int end, OrderByComparator<VM> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the vms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VMModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of vms
	 */
	public static List<VM> findAll(
		int start, int end, OrderByComparator<VM> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the vms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of vms.
	 *
	 * @return the number of vms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VMPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VMPersistence, VMPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(VMPersistence.class);

		ServiceTracker<VMPersistence, VMPersistence> serviceTracker =
			new ServiceTracker<VMPersistence, VMPersistence>(
				bundle.getBundleContext(), VMPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}