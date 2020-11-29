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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import net.carlosduran.liferay.lim.exception.NoSuchSiteException;
import net.carlosduran.liferay.lim.model.Site;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the site service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SiteUtil
 * @generated
 */
@ProviderType
public interface SitePersistence extends BasePersistence<Site> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SiteUtil} to access the site persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the site in the entity cache if it is enabled.
	 *
	 * @param site the site
	 */
	public void cacheResult(Site site);

	/**
	 * Caches the sites in the entity cache if it is enabled.
	 *
	 * @param sites the sites
	 */
	public void cacheResult(java.util.List<Site> sites);

	/**
	 * Creates a new site with the primary key. Does not add the site to the database.
	 *
	 * @param siteId the primary key for the new site
	 * @return the new site
	 */
	public Site create(long siteId);

	/**
	 * Removes the site with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param siteId the primary key of the site
	 * @return the site that was removed
	 * @throws NoSuchSiteException if a site with the primary key could not be found
	 */
	public Site remove(long siteId) throws NoSuchSiteException;

	public Site updateImpl(Site site);

	/**
	 * Returns the site with the primary key or throws a <code>NoSuchSiteException</code> if it could not be found.
	 *
	 * @param siteId the primary key of the site
	 * @return the site
	 * @throws NoSuchSiteException if a site with the primary key could not be found
	 */
	public Site findByPrimaryKey(long siteId) throws NoSuchSiteException;

	/**
	 * Returns the site with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param siteId the primary key of the site
	 * @return the site, or <code>null</code> if a site with the primary key could not be found
	 */
	public Site fetchByPrimaryKey(long siteId);

	/**
	 * Returns all the sites.
	 *
	 * @return the sites
	 */
	public java.util.List<Site> findAll();

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
	public java.util.List<Site> findAll(int start, int end);

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
	public java.util.List<Site> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Site>
			orderByComparator);

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
	public java.util.List<Site> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Site>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sites from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sites.
	 *
	 * @return the number of sites
	 */
	public int countAll();

}