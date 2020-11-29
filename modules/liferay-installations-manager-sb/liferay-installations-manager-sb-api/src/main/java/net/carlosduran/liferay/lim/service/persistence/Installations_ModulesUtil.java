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

import net.carlosduran.liferay.lim.model.Installations_Modules;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the installations_ modules service. This utility wraps <code>net.carlosduran.liferay.lim.service.persistence.impl.Installations_ModulesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Installations_ModulesPersistence
 * @generated
 */
public class Installations_ModulesUtil {

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
	public static void clearCache(Installations_Modules installations_Modules) {
		getPersistence().clearCache(installations_Modules);
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
	public static Map<Serializable, Installations_Modules> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Installations_Modules> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Installations_Modules> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Installations_Modules> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Installations_Modules> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Installations_Modules update(
		Installations_Modules installations_Modules) {

		return getPersistence().update(installations_Modules);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Installations_Modules update(
		Installations_Modules installations_Modules,
		ServiceContext serviceContext) {

		return getPersistence().update(installations_Modules, serviceContext);
	}

	/**
	 * Returns all the installations_ moduleses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching installations_ moduleses
	 */
	public static List<Installations_Modules> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the installations_ moduleses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @return the range of matching installations_ moduleses
	 */
	public static List<Installations_Modules> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the installations_ moduleses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching installations_ moduleses
	 */
	public static List<Installations_Modules> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Installations_Modules> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the installations_ moduleses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching installations_ moduleses
	 */
	public static List<Installations_Modules> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Installations_Modules> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a matching installations_ modules could not be found
	 */
	public static Installations_Modules findByUuid_First(
			String uuid,
			OrderByComparator<Installations_Modules> orderByComparator)
		throws net.carlosduran.liferay.lim.exception.
			NoSuchInstallations_ModulesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installations_ modules, or <code>null</code> if a matching installations_ modules could not be found
	 */
	public static Installations_Modules fetchByUuid_First(
		String uuid,
		OrderByComparator<Installations_Modules> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a matching installations_ modules could not be found
	 */
	public static Installations_Modules findByUuid_Last(
			String uuid,
			OrderByComparator<Installations_Modules> orderByComparator)
		throws net.carlosduran.liferay.lim.exception.
			NoSuchInstallations_ModulesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching installations_ modules, or <code>null</code> if a matching installations_ modules could not be found
	 */
	public static Installations_Modules fetchByUuid_Last(
		String uuid,
		OrderByComparator<Installations_Modules> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the installations_ moduleses before and after the current installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param installations_ModulesPK the primary key of the current installations_ modules
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a installations_ modules with the primary key could not be found
	 */
	public static Installations_Modules[] findByUuid_PrevAndNext(
			net.carlosduran.liferay.lim.service.persistence.
				Installations_ModulesPK installations_ModulesPK,
			String uuid,
			OrderByComparator<Installations_Modules> orderByComparator)
		throws net.carlosduran.liferay.lim.exception.
			NoSuchInstallations_ModulesException {

		return getPersistence().findByUuid_PrevAndNext(
			installations_ModulesPK, uuid, orderByComparator);
	}

	/**
	 * Removes all the installations_ moduleses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of installations_ moduleses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching installations_ moduleses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the installations_ modules in the entity cache if it is enabled.
	 *
	 * @param installations_Modules the installations_ modules
	 */
	public static void cacheResult(
		Installations_Modules installations_Modules) {

		getPersistence().cacheResult(installations_Modules);
	}

	/**
	 * Caches the installations_ moduleses in the entity cache if it is enabled.
	 *
	 * @param installations_Moduleses the installations_ moduleses
	 */
	public static void cacheResult(
		List<Installations_Modules> installations_Moduleses) {

		getPersistence().cacheResult(installations_Moduleses);
	}

	/**
	 * Creates a new installations_ modules with the primary key. Does not add the installations_ modules to the database.
	 *
	 * @param installations_ModulesPK the primary key for the new installations_ modules
	 * @return the new installations_ modules
	 */
	public static Installations_Modules create(
		net.carlosduran.liferay.lim.service.persistence.Installations_ModulesPK
			installations_ModulesPK) {

		return getPersistence().create(installations_ModulesPK);
	}

	/**
	 * Removes the installations_ modules with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param installations_ModulesPK the primary key of the installations_ modules
	 * @return the installations_ modules that was removed
	 * @throws NoSuchInstallations_ModulesException if a installations_ modules with the primary key could not be found
	 */
	public static Installations_Modules remove(
			net.carlosduran.liferay.lim.service.persistence.
				Installations_ModulesPK installations_ModulesPK)
		throws net.carlosduran.liferay.lim.exception.
			NoSuchInstallations_ModulesException {

		return getPersistence().remove(installations_ModulesPK);
	}

	public static Installations_Modules updateImpl(
		Installations_Modules installations_Modules) {

		return getPersistence().updateImpl(installations_Modules);
	}

	/**
	 * Returns the installations_ modules with the primary key or throws a <code>NoSuchInstallations_ModulesException</code> if it could not be found.
	 *
	 * @param installations_ModulesPK the primary key of the installations_ modules
	 * @return the installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a installations_ modules with the primary key could not be found
	 */
	public static Installations_Modules findByPrimaryKey(
			net.carlosduran.liferay.lim.service.persistence.
				Installations_ModulesPK installations_ModulesPK)
		throws net.carlosduran.liferay.lim.exception.
			NoSuchInstallations_ModulesException {

		return getPersistence().findByPrimaryKey(installations_ModulesPK);
	}

	/**
	 * Returns the installations_ modules with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param installations_ModulesPK the primary key of the installations_ modules
	 * @return the installations_ modules, or <code>null</code> if a installations_ modules with the primary key could not be found
	 */
	public static Installations_Modules fetchByPrimaryKey(
		net.carlosduran.liferay.lim.service.persistence.Installations_ModulesPK
			installations_ModulesPK) {

		return getPersistence().fetchByPrimaryKey(installations_ModulesPK);
	}

	/**
	 * Returns all the installations_ moduleses.
	 *
	 * @return the installations_ moduleses
	 */
	public static List<Installations_Modules> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the installations_ moduleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @return the range of installations_ moduleses
	 */
	public static List<Installations_Modules> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the installations_ moduleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of installations_ moduleses
	 */
	public static List<Installations_Modules> findAll(
		int start, int end,
		OrderByComparator<Installations_Modules> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the installations_ moduleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of installations_ moduleses
	 */
	public static List<Installations_Modules> findAll(
		int start, int end,
		OrderByComparator<Installations_Modules> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the installations_ moduleses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of installations_ moduleses.
	 *
	 * @return the number of installations_ moduleses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static Installations_ModulesPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<Installations_ModulesPersistence, Installations_ModulesPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			Installations_ModulesPersistence.class);

		ServiceTracker
			<Installations_ModulesPersistence, Installations_ModulesPersistence>
				serviceTracker =
					new ServiceTracker
						<Installations_ModulesPersistence,
						 Installations_ModulesPersistence>(
							 bundle.getBundleContext(),
							 Installations_ModulesPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}