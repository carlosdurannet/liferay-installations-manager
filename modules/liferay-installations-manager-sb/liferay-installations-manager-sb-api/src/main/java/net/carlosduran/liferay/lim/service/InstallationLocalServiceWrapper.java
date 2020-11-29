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
 * Provides a wrapper for {@link InstallationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see InstallationLocalService
 * @generated
 */
public class InstallationLocalServiceWrapper
	implements InstallationLocalService,
			   ServiceWrapper<InstallationLocalService> {

	public InstallationLocalServiceWrapper(
		InstallationLocalService installationLocalService) {

		_installationLocalService = installationLocalService;
	}

	/**
	 * Adds the installation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstallationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param installation the installation
	 * @return the installation that was added
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Installation addInstallation(
		net.carlosduran.liferay.lim.model.Installation installation) {

		return _installationLocalService.addInstallation(installation);
	}

	/**
	 * Creates a new installation with the primary key. Does not add the installation to the database.
	 *
	 * @param installationId the primary key for the new installation
	 * @return the new installation
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Installation createInstallation(
		long installationId) {

		return _installationLocalService.createInstallation(installationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _installationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the installation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstallationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param installation the installation
	 * @return the installation that was removed
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Installation deleteInstallation(
		net.carlosduran.liferay.lim.model.Installation installation) {

		return _installationLocalService.deleteInstallation(installation);
	}

	/**
	 * Deletes the installation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstallationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param installationId the primary key of the installation
	 * @return the installation that was removed
	 * @throws PortalException if a installation with the primary key could not be found
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Installation deleteInstallation(
			long installationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _installationLocalService.deleteInstallation(installationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _installationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _installationLocalService.dynamicQuery();
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

		return _installationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.InstallationModelImpl</code>.
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

		return _installationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.InstallationModelImpl</code>.
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

		return _installationLocalService.dynamicQuery(
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

		return _installationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _installationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public net.carlosduran.liferay.lim.model.Installation fetchInstallation(
		long installationId) {

		return _installationLocalService.fetchInstallation(installationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _installationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _installationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the installation with the primary key.
	 *
	 * @param installationId the primary key of the installation
	 * @return the installation
	 * @throws PortalException if a installation with the primary key could not be found
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Installation getInstallation(
			long installationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _installationLocalService.getInstallation(installationId);
	}

	/**
	 * Returns a range of all the installations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @return the range of installations
	 */
	@Override
	public java.util.List<net.carlosduran.liferay.lim.model.Installation>
		getInstallations(int start, int end) {

		return _installationLocalService.getInstallations(start, end);
	}

	/**
	 * Returns the number of installations.
	 *
	 * @return the number of installations
	 */
	@Override
	public int getInstallationsCount() {
		return _installationLocalService.getInstallationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _installationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _installationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the installation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstallationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param installation the installation
	 * @return the installation that was updated
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Installation updateInstallation(
		net.carlosduran.liferay.lim.model.Installation installation) {

		return _installationLocalService.updateInstallation(installation);
	}

	@Override
	public InstallationLocalService getWrappedService() {
		return _installationLocalService;
	}

	@Override
	public void setWrappedService(
		InstallationLocalService installationLocalService) {

		_installationLocalService = installationLocalService;
	}

	private InstallationLocalService _installationLocalService;

}