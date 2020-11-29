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

import net.carlosduran.liferay.lim.model.Site;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the site service. This utility wraps <code>net.carlosduran.liferay.lim.service.persistence.impl.SitePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SitePersistence
 * @generated
 */
public class SiteUtil {

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
	public static void clearCache(Site site) {
		getPersistence().clearCache(site);
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
	public static Map<Serializable, Site> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Site> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Site> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Site> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Site> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Site update(Site site) {
		return getPersistence().update(site);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Site update(Site site, ServiceContext serviceContext) {
		return getPersistence().update(site, serviceContext);
	}

	/**
	 * Caches the site in the entity cache if it is enabled.
	 *
	 * @param site the site
	 */
	public static void cacheResult(Site site) {
		getPersistence().cacheResult(site);
	}

	/**
	 * Caches the sites in the entity cache if it is enabled.
	 *
	 * @param sites the sites
	 */
	public static void cacheResult(List<Site> sites) {
		getPersistence().cacheResult(sites);
	}

	/**
	 * Creates a new site with the primary key. Does not add the site to the database.
	 *
	 * @param siteId the primary key for the new site
	 * @return the new site
	 */
	public static Site create(long siteId) {
		return getPersistence().create(siteId);
	}

	/**
	 * Removes the site with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param siteId the primary key of the site
	 * @return the site that was removed
	 * @throws NoSuchSiteException if a site with the primary key could not be found
	 */
	public static Site remove(long siteId)
		throws net.carlosduran.liferay.lim.exception.NoSuchSiteException {

		return getPersistence().remove(siteId);
	}

	public static Site updateImpl(Site site) {
		return getPersistence().updateImpl(site);
	}

	/**
	 * Returns the site with the primary key or throws a <code>NoSuchSiteException</code> if it could not be found.
	 *
	 * @param siteId the primary key of the site
	 * @return the site
	 * @throws NoSuchSiteException if a site with the primary key could not be found
	 */
	public static Site findByPrimaryKey(long siteId)
		throws net.carlosduran.liferay.lim.exception.NoSuchSiteException {

		return getPersistence().findByPrimaryKey(siteId);
	}

	/**
	 * Returns the site with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param siteId the primary key of the site
	 * @return the site, or <code>null</code> if a site with the primary key could not be found
	 */
	public static Site fetchByPrimaryKey(long siteId) {
		return getPersistence().fetchByPrimaryKey(siteId);
	}

	/**
	 * Returns all the sites.
	 *
	 * @return the sites
	 */
	public static List<Site> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sites
	 * @param end the upper bound of the range of sites (not inclusive)
	 * @return the range of sites
	 */
	public static List<Site> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sites
	 * @param end the upper bound of the range of sites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sites
	 */
	public static List<Site> findAll(
		int start, int end, OrderByComparator<Site> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sites
	 * @param end the upper bound of the range of sites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sites
	 */
	public static List<Site> findAll(
		int start, int end, OrderByComparator<Site> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sites from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sites.
	 *
	 * @return the number of sites
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SitePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SitePersistence, SitePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SitePersistence.class);

		ServiceTracker<SitePersistence, SitePersistence> serviceTracker =
			new ServiceTracker<SitePersistence, SitePersistence>(
				bundle.getBundleContext(), SitePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}