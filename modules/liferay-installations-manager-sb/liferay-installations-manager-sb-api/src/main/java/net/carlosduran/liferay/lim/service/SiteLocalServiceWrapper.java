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

package net.carlosduran.liferay.lim.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SiteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SiteLocalService
 * @generated
 */
public class SiteLocalServiceWrapper
	implements ServiceWrapper<SiteLocalService>, SiteLocalService {

	public SiteLocalServiceWrapper(SiteLocalService siteLocalService) {
		_siteLocalService = siteLocalService;
	}

	/**
	 * Adds the site to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SiteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param site the site
	 * @return the site that was added
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Site addSite(
		net.carlosduran.liferay.lim.model.Site site) {

		return _siteLocalService.addSite(site);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _siteLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new site with the primary key. Does not add the site to the database.
	 *
	 * @param siteId the primary key for the new site
	 * @return the new site
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Site createSite(long siteId) {
		return _siteLocalService.createSite(siteId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _siteLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the site with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SiteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param siteId the primary key of the site
	 * @return the site that was removed
	 * @throws PortalException if a site with the primary key could not be found
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Site deleteSite(long siteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _siteLocalService.deleteSite(siteId);
	}

	/**
	 * Deletes the site from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SiteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param site the site
	 * @return the site that was removed
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Site deleteSite(
		net.carlosduran.liferay.lim.model.Site site) {

		return _siteLocalService.deleteSite(site);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _siteLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _siteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.SiteModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _siteLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.SiteModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _siteLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _siteLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _siteLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public net.carlosduran.liferay.lim.model.Site fetchSite(long siteId) {
		return _siteLocalService.fetchSite(siteId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _siteLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _siteLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _siteLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _siteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the site with the primary key.
	 *
	 * @param siteId the primary key of the site
	 * @return the site
	 * @throws PortalException if a site with the primary key could not be found
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Site getSite(long siteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _siteLocalService.getSite(siteId);
	}

	/**
	 * Returns a range of all the sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.SiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sites
	 * @param end the upper bound of the range of sites (not inclusive)
	 * @return the range of sites
	 */
	@Override
	public java.util.List<net.carlosduran.liferay.lim.model.Site> getSites(
		int start, int end) {

		return _siteLocalService.getSites(start, end);
	}

	/**
	 * Returns the number of sites.
	 *
	 * @return the number of sites
	 */
	@Override
	public int getSitesCount() {
		return _siteLocalService.getSitesCount();
	}

	/**
	 * Updates the site in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SiteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param site the site
	 * @return the site that was updated
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Site updateSite(
		net.carlosduran.liferay.lim.model.Site site) {

		return _siteLocalService.updateSite(site);
	}

	@Override
	public SiteLocalService getWrappedService() {
		return _siteLocalService;
	}

	@Override
	public void setWrappedService(SiteLocalService siteLocalService) {
		_siteLocalService = siteLocalService;
	}

	private SiteLocalService _siteLocalService;

}