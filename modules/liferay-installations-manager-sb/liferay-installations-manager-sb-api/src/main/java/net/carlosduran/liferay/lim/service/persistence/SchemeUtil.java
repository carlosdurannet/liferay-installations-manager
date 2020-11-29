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

import net.carlosduran.liferay.lim.model.Scheme;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the scheme service. This utility wraps <code>net.carlosduran.liferay.lim.service.persistence.impl.SchemePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SchemePersistence
 * @generated
 */
public class SchemeUtil {

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
	public static void clearCache(Scheme scheme) {
		getPersistence().clearCache(scheme);
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
	public static Map<Serializable, Scheme> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Scheme> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Scheme> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Scheme> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Scheme> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Scheme update(Scheme scheme) {
		return getPersistence().update(scheme);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Scheme update(Scheme scheme, ServiceContext serviceContext) {
		return getPersistence().update(scheme, serviceContext);
	}

	/**
	 * Returns all the schemes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching schemes
	 */
	public static List<Scheme> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the schemes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @return the range of matching schemes
	 */
	public static List<Scheme> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the schemes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching schemes
	 */
	public static List<Scheme> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Scheme> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the schemes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching schemes
	 */
	public static List<Scheme> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Scheme> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first scheme in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching scheme
	 * @throws NoSuchSchemeException if a matching scheme could not be found
	 */
	public static Scheme findByUuid_First(
			String uuid, OrderByComparator<Scheme> orderByComparator)
		throws net.carlosduran.liferay.lim.exception.NoSuchSchemeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first scheme in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching scheme, or <code>null</code> if a matching scheme could not be found
	 */
	public static Scheme fetchByUuid_First(
		String uuid, OrderByComparator<Scheme> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last scheme in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching scheme
	 * @throws NoSuchSchemeException if a matching scheme could not be found
	 */
	public static Scheme findByUuid_Last(
			String uuid, OrderByComparator<Scheme> orderByComparator)
		throws net.carlosduran.liferay.lim.exception.NoSuchSchemeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last scheme in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching scheme, or <code>null</code> if a matching scheme could not be found
	 */
	public static Scheme fetchByUuid_Last(
		String uuid, OrderByComparator<Scheme> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the schemes before and after the current scheme in the ordered set where uuid = &#63;.
	 *
	 * @param schemeId the primary key of the current scheme
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next scheme
	 * @throws NoSuchSchemeException if a scheme with the primary key could not be found
	 */
	public static Scheme[] findByUuid_PrevAndNext(
			long schemeId, String uuid,
			OrderByComparator<Scheme> orderByComparator)
		throws net.carlosduran.liferay.lim.exception.NoSuchSchemeException {

		return getPersistence().findByUuid_PrevAndNext(
			schemeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the schemes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of schemes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching schemes
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the scheme in the entity cache if it is enabled.
	 *
	 * @param scheme the scheme
	 */
	public static void cacheResult(Scheme scheme) {
		getPersistence().cacheResult(scheme);
	}

	/**
	 * Caches the schemes in the entity cache if it is enabled.
	 *
	 * @param schemes the schemes
	 */
	public static void cacheResult(List<Scheme> schemes) {
		getPersistence().cacheResult(schemes);
	}

	/**
	 * Creates a new scheme with the primary key. Does not add the scheme to the database.
	 *
	 * @param schemeId the primary key for the new scheme
	 * @return the new scheme
	 */
	public static Scheme create(long schemeId) {
		return getPersistence().create(schemeId);
	}

	/**
	 * Removes the scheme with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param schemeId the primary key of the scheme
	 * @return the scheme that was removed
	 * @throws NoSuchSchemeException if a scheme with the primary key could not be found
	 */
	public static Scheme remove(long schemeId)
		throws net.carlosduran.liferay.lim.exception.NoSuchSchemeException {

		return getPersistence().remove(schemeId);
	}

	public static Scheme updateImpl(Scheme scheme) {
		return getPersistence().updateImpl(scheme);
	}

	/**
	 * Returns the scheme with the primary key or throws a <code>NoSuchSchemeException</code> if it could not be found.
	 *
	 * @param schemeId the primary key of the scheme
	 * @return the scheme
	 * @throws NoSuchSchemeException if a scheme with the primary key could not be found
	 */
	public static Scheme findByPrimaryKey(long schemeId)
		throws net.carlosduran.liferay.lim.exception.NoSuchSchemeException {

		return getPersistence().findByPrimaryKey(schemeId);
	}

	/**
	 * Returns the scheme with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param schemeId the primary key of the scheme
	 * @return the scheme, or <code>null</code> if a scheme with the primary key could not be found
	 */
	public static Scheme fetchByPrimaryKey(long schemeId) {
		return getPersistence().fetchByPrimaryKey(schemeId);
	}

	/**
	 * Returns all the schemes.
	 *
	 * @return the schemes
	 */
	public static List<Scheme> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the schemes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @return the range of schemes
	 */
	public static List<Scheme> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the schemes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of schemes
	 */
	public static List<Scheme> findAll(
		int start, int end, OrderByComparator<Scheme> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the schemes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of schemes
	 */
	public static List<Scheme> findAll(
		int start, int end, OrderByComparator<Scheme> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the schemes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of schemes.
	 *
	 * @return the number of schemes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SchemePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SchemePersistence, SchemePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SchemePersistence.class);

		ServiceTracker<SchemePersistence, SchemePersistence> serviceTracker =
			new ServiceTracker<SchemePersistence, SchemePersistence>(
				bundle.getBundleContext(), SchemePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}