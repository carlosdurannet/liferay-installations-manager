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
 * Provides a wrapper for {@link Installations_ModulesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Installations_ModulesLocalService
 * @generated
 */
public class Installations_ModulesLocalServiceWrapper
	implements Installations_ModulesLocalService,
			   ServiceWrapper<Installations_ModulesLocalService> {

	public Installations_ModulesLocalServiceWrapper(
		Installations_ModulesLocalService installations_ModulesLocalService) {

		_installations_ModulesLocalService = installations_ModulesLocalService;
	}

	/**
	 * Adds the installations_ modules to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Installations_ModulesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param installations_Modules the installations_ modules
	 * @return the installations_ modules that was added
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Installations_Modules
		addInstallations_Modules(
			net.carlosduran.liferay.lim.model.Installations_Modules
				installations_Modules) {

		return _installations_ModulesLocalService.addInstallations_Modules(
			installations_Modules);
	}

	/**
	 * Creates a new installations_ modules with the primary key. Does not add the installations_ modules to the database.
	 *
	 * @param installations_ModulesPK the primary key for the new installations_ modules
	 * @return the new installations_ modules
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Installations_Modules
		createInstallations_Modules(
			net.carlosduran.liferay.lim.service.persistence.
				Installations_ModulesPK installations_ModulesPK) {

		return _installations_ModulesLocalService.createInstallations_Modules(
			installations_ModulesPK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _installations_ModulesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the installations_ modules from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Installations_ModulesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param installations_Modules the installations_ modules
	 * @return the installations_ modules that was removed
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Installations_Modules
		deleteInstallations_Modules(
			net.carlosduran.liferay.lim.model.Installations_Modules
				installations_Modules) {

		return _installations_ModulesLocalService.deleteInstallations_Modules(
			installations_Modules);
	}

	/**
	 * Deletes the installations_ modules with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Installations_ModulesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param installations_ModulesPK the primary key of the installations_ modules
	 * @return the installations_ modules that was removed
	 * @throws PortalException if a installations_ modules with the primary key could not be found
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Installations_Modules
			deleteInstallations_Modules(
				net.carlosduran.liferay.lim.service.persistence.
					Installations_ModulesPK installations_ModulesPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _installations_ModulesLocalService.deleteInstallations_Modules(
			installations_ModulesPK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _installations_ModulesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _installations_ModulesLocalService.dynamicQuery();
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

		return _installations_ModulesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.Installations_ModulesModelImpl</code>.
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

		return _installations_ModulesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.Installations_ModulesModelImpl</code>.
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

		return _installations_ModulesLocalService.dynamicQuery(
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

		return _installations_ModulesLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _installations_ModulesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public net.carlosduran.liferay.lim.model.Installations_Modules
		fetchInstallations_Modules(
			net.carlosduran.liferay.lim.service.persistence.
				Installations_ModulesPK installations_ModulesPK) {

		return _installations_ModulesLocalService.fetchInstallations_Modules(
			installations_ModulesPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _installations_ModulesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _installations_ModulesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the installations_ modules with the primary key.
	 *
	 * @param installations_ModulesPK the primary key of the installations_ modules
	 * @return the installations_ modules
	 * @throws PortalException if a installations_ modules with the primary key could not be found
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Installations_Modules
			getInstallations_Modules(
				net.carlosduran.liferay.lim.service.persistence.
					Installations_ModulesPK installations_ModulesPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _installations_ModulesLocalService.getInstallations_Modules(
			installations_ModulesPK);
	}

	/**
	 * Returns a range of all the installations_ moduleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @return the range of installations_ moduleses
	 */
	@Override
	public java.util.List
		<net.carlosduran.liferay.lim.model.Installations_Modules>
			getInstallations_Moduleses(int start, int end) {

		return _installations_ModulesLocalService.getInstallations_Moduleses(
			start, end);
	}

	/**
	 * Returns the number of installations_ moduleses.
	 *
	 * @return the number of installations_ moduleses
	 */
	@Override
	public int getInstallations_ModulesesCount() {
		return _installations_ModulesLocalService.
			getInstallations_ModulesesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _installations_ModulesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _installations_ModulesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the installations_ modules in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Installations_ModulesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param installations_Modules the installations_ modules
	 * @return the installations_ modules that was updated
	 */
	@Override
	public net.carlosduran.liferay.lim.model.Installations_Modules
		updateInstallations_Modules(
			net.carlosduran.liferay.lim.model.Installations_Modules
				installations_Modules) {

		return _installations_ModulesLocalService.updateInstallations_Modules(
			installations_Modules);
	}

	@Override
	public Installations_ModulesLocalService getWrappedService() {
		return _installations_ModulesLocalService;
	}

	@Override
	public void setWrappedService(
		Installations_ModulesLocalService installations_ModulesLocalService) {

		_installations_ModulesLocalService = installations_ModulesLocalService;
	}

	private Installations_ModulesLocalService
		_installations_ModulesLocalService;

}