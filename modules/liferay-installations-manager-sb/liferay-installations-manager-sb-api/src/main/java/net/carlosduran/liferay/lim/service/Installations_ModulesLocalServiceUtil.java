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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Installations_Modules. This utility wraps
 * <code>net.carlosduran.liferay.lim.service.impl.Installations_ModulesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see Installations_ModulesLocalService
 * @generated
 */
public class Installations_ModulesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>net.carlosduran.liferay.lim.service.impl.Installations_ModulesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static net.carlosduran.liferay.lim.model.Installations_Modules
		addInstallations_Modules(
			net.carlosduran.liferay.lim.model.Installations_Modules
				installations_Modules) {

		return getService().addInstallations_Modules(installations_Modules);
	}

	/**
	 * Creates a new installations_ modules with the primary key. Does not add the installations_ modules to the database.
	 *
	 * @param installations_ModulesPK the primary key for the new installations_ modules
	 * @return the new installations_ modules
	 */
	public static net.carlosduran.liferay.lim.model.Installations_Modules
		createInstallations_Modules(
			net.carlosduran.liferay.lim.service.persistence.
				Installations_ModulesPK installations_ModulesPK) {

		return getService().createInstallations_Modules(
			installations_ModulesPK);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static net.carlosduran.liferay.lim.model.Installations_Modules
		deleteInstallations_Modules(
			net.carlosduran.liferay.lim.model.Installations_Modules
				installations_Modules) {

		return getService().deleteInstallations_Modules(installations_Modules);
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
	public static net.carlosduran.liferay.lim.model.Installations_Modules
			deleteInstallations_Modules(
				net.carlosduran.liferay.lim.service.persistence.
					Installations_ModulesPK installations_ModulesPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteInstallations_Modules(
			installations_ModulesPK);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static net.carlosduran.liferay.lim.model.Installations_Modules
		fetchInstallations_Modules(
			net.carlosduran.liferay.lim.service.persistence.
				Installations_ModulesPK installations_ModulesPK) {

		return getService().fetchInstallations_Modules(installations_ModulesPK);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the installations_ modules with the primary key.
	 *
	 * @param installations_ModulesPK the primary key of the installations_ modules
	 * @return the installations_ modules
	 * @throws PortalException if a installations_ modules with the primary key could not be found
	 */
	public static net.carlosduran.liferay.lim.model.Installations_Modules
			getInstallations_Modules(
				net.carlosduran.liferay.lim.service.persistence.
					Installations_ModulesPK installations_ModulesPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getInstallations_Modules(installations_ModulesPK);
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
	public static java.util.List
		<net.carlosduran.liferay.lim.model.Installations_Modules>
			getInstallations_Moduleses(int start, int end) {

		return getService().getInstallations_Moduleses(start, end);
	}

	/**
	 * Returns the number of installations_ moduleses.
	 *
	 * @return the number of installations_ moduleses
	 */
	public static int getInstallations_ModulesesCount() {
		return getService().getInstallations_ModulesesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static net.carlosduran.liferay.lim.model.Installations_Modules
		updateInstallations_Modules(
			net.carlosduran.liferay.lim.model.Installations_Modules
				installations_Modules) {

		return getService().updateInstallations_Modules(installations_Modules);
	}

	public static Installations_ModulesLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<Installations_ModulesLocalService, Installations_ModulesLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			Installations_ModulesLocalService.class);

		ServiceTracker
			<Installations_ModulesLocalService,
			 Installations_ModulesLocalService> serviceTracker =
				new ServiceTracker
					<Installations_ModulesLocalService,
					 Installations_ModulesLocalService>(
						 bundle.getBundleContext(),
						 Installations_ModulesLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}