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

import net.carlosduran.liferay.lim.model.Installation;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the installation service. This utility wraps <code>net.carlosduran.liferay.lim.service.persistence.impl.InstallationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InstallationPersistence
 * @generated
 */
public class InstallationUtil {

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
	public static void clearCache(Installation installation) {
		getPersistence().clearCache(installation);
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
	public static Map<Serializable, Installation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Installation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Installation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Installation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Installation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Installation update(Installation installation) {
		return getPersistence().update(installation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Installation update(
		Installation installation, ServiceContext serviceContext) {

		return getPersistence().update(installation, serviceContext);
	}

	/**
	 * Returns all the installations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching installations
	 */
	public static List<Installation> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the installations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @return the range of matching installations
	 */
	public static List<Installation> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the installations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching installations
	 */
	public static List<Installation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Installation> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the installations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching installations
	 */
	public static List<Installation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Installation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first installation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installation
	 * @throws NoSuchInstallationException if a matching installation could not be found
	 */
	public static Installation findByUuid_First(
			String uuid, OrderByComparator<Installation> orderByComparator)
		throws net.carlosduran.liferay.lim.exception.
			NoSuchInstallationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first installation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installation, or <code>null</code> if a matching installation could not be found
	 */
	public static Installation fetchByUuid_First(
		String uuid, OrderByComparator<Installation> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last installation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching installation
	 * @throws NoSuchInstallationException if a matching installation could not be found
	 */
	public static Installation findByUuid_Last(
			String uuid, OrderByComparator<Installation> orderByComparator)
		throws net.carlosduran.liferay.lim.exception.
			NoSuchInstallationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last installation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching installation, or <code>null</code> if a matching installation could not be found
	 */
	public static Installation fetchByUuid_Last(
		String uuid, OrderByComparator<Installation> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the installations before and after the current installation in the ordered set where uuid = &#63;.
	 *
	 * @param installationId the primary key of the current installation
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next installation
	 * @throws NoSuchInstallationException if a installation with the primary key could not be found
	 */
	public static Installation[] findByUuid_PrevAndNext(
			long installationId, String uuid,
			OrderByComparator<Installation> orderByComparator)
		throws net.carlosduran.liferay.lim.exception.
			NoSuchInstallationException {

		return getPersistence().findByUuid_PrevAndNext(
			installationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the installations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of installations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching installations
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the installation in the entity cache if it is enabled.
	 *
	 * @param installation the installation
	 */
	public static void cacheResult(Installation installation) {
		getPersistence().cacheResult(installation);
	}

	/**
	 * Caches the installations in the entity cache if it is enabled.
	 *
	 * @param installations the installations
	 */
	public static void cacheResult(List<Installation> installations) {
		getPersistence().cacheResult(installations);
	}

	/**
	 * Creates a new installation with the primary key. Does not add the installation to the database.
	 *
	 * @param installationId the primary key for the new installation
	 * @return the new installation
	 */
	public static Installation create(long installationId) {
		return getPersistence().create(installationId);
	}

	/**
	 * Removes the installation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param installationId the primary key of the installation
	 * @return the installation that was removed
	 * @throws NoSuchInstallationException if a installation with the primary key could not be found
	 */
	public static Installation remove(long installationId)
		throws net.carlosduran.liferay.lim.exception.
			NoSuchInstallationException {

		return getPersistence().remove(installationId);
	}

	public static Installation updateImpl(Installation installation) {
		return getPersistence().updateImpl(installation);
	}

	/**
	 * Returns the installation with the primary key or throws a <code>NoSuchInstallationException</code> if it could not be found.
	 *
	 * @param installationId the primary key of the installation
	 * @return the installation
	 * @throws NoSuchInstallationException if a installation with the primary key could not be found
	 */
	public static Installation findByPrimaryKey(long installationId)
		throws net.carlosduran.liferay.lim.exception.
			NoSuchInstallationException {

		return getPersistence().findByPrimaryKey(installationId);
	}

	/**
	 * Returns the installation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param installationId the primary key of the installation
	 * @return the installation, or <code>null</code> if a installation with the primary key could not be found
	 */
	public static Installation fetchByPrimaryKey(long installationId) {
		return getPersistence().fetchByPrimaryKey(installationId);
	}

	/**
	 * Returns all the installations.
	 *
	 * @return the installations
	 */
	public static List<Installation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the installations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @return the range of installations
	 */
	public static List<Installation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the installations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of installations
	 */
	public static List<Installation> findAll(
		int start, int end, OrderByComparator<Installation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the installations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of installations
	 */
	public static List<Installation> findAll(
		int start, int end, OrderByComparator<Installation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the installations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of installations.
	 *
	 * @return the number of installations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static InstallationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<InstallationPersistence, InstallationPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(InstallationPersistence.class);

		ServiceTracker<InstallationPersistence, InstallationPersistence>
			serviceTracker =
				new ServiceTracker
					<InstallationPersistence, InstallationPersistence>(
						bundle.getBundleContext(),
						InstallationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}