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
 * Provides a wrapper for {@link SchemeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SchemeLocalService
 * @generated
 */
public class SchemeLocalServiceWrapper
	implements SchemeLocalService, ServiceWrapper<SchemeLocalService> {

	public SchemeLocalServiceWrapper(SchemeLocalService schemeLocalService) {
		_schemeLocalService = schemeLocalService;
	}

	/**
	 * Adds the scheme to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SchemeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param scheme the scheme
	 * @return the scheme that was added
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Scheme addScheme(
		net.carlosduran.liferay.lim.model.Scheme scheme) {

		return _schemeLocalService.addScheme(scheme);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _schemeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new scheme with the primary key. Does not add the scheme to the database.
	 *
	 * @param schemeId the primary key for the new scheme
	 * @return the new scheme
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Scheme createScheme(
		long schemeId) {

		return _schemeLocalService.createScheme(schemeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _schemeLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the scheme with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SchemeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param schemeId the primary key of the scheme
	 * @return the scheme that was removed
	 * @throws PortalException if a scheme with the primary key could not be found
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Scheme deleteScheme(long schemeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _schemeLocalService.deleteScheme(schemeId);
	}

	/**
	 * Deletes the scheme from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SchemeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param scheme the scheme
	 * @return the scheme that was removed
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Scheme deleteScheme(
		net.carlosduran.liferay.lim.model.Scheme scheme) {

		return _schemeLocalService.deleteScheme(scheme);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _schemeLocalService.dynamicQuery();
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

		return _schemeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.SchemeModelImpl</code>.
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

		return _schemeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.SchemeModelImpl</code>.
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

		return _schemeLocalService.dynamicQuery(
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

		return _schemeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _schemeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public net.carlosduran.liferay.lim.model.Scheme fetchScheme(long schemeId) {
		return _schemeLocalService.fetchScheme(schemeId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _schemeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _schemeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _schemeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _schemeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the scheme with the primary key.
	 *
	 * @param schemeId the primary key of the scheme
	 * @return the scheme
	 * @throws PortalException if a scheme with the primary key could not be found
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Scheme getScheme(long schemeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _schemeLocalService.getScheme(schemeId);
	}

	/**
	 * Returns a range of all the schemes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @return the range of schemes
	 */
	@Override
	public java.util.List<net.carlosduran.liferay.lim.model.Scheme> getSchemes(
		int start, int end) {

		return _schemeLocalService.getSchemes(start, end);
	}

	/**
	 * Returns the number of schemes.
	 *
	 * @return the number of schemes
	 */
	@Override
	public int getSchemesCount() {
		return _schemeLocalService.getSchemesCount();
	}

	/**
	 * Updates the scheme in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SchemeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param scheme the scheme
	 * @return the scheme that was updated
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Scheme updateScheme(
		net.carlosduran.liferay.lim.model.Scheme scheme) {

		return _schemeLocalService.updateScheme(scheme);
	}

	@Override
	public SchemeLocalService getWrappedService() {
		return _schemeLocalService;
	}

	@Override
	public void setWrappedService(SchemeLocalService schemeLocalService) {
		_schemeLocalService = schemeLocalService;
	}

	private SchemeLocalService _schemeLocalService;

}