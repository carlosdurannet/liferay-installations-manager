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
 * Provides a wrapper for {@link VMLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VMLocalService
 * @generated
 */
public class VMLocalServiceWrapper
	implements ServiceWrapper<VMLocalService>, VMLocalService {

	public VMLocalServiceWrapper(VMLocalService vmLocalService) {
		_vmLocalService = vmLocalService;
	}

	/**
	 * Adds the vm to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VMLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param vm the vm
	 * @return the vm that was added
	 */
	@Override
	public net.carlosduran.liferay.lim.model.VM addVM(
		net.carlosduran.liferay.lim.model.VM vm) {

		return _vmLocalService.addVM(vm);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vmLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new vm with the primary key. Does not add the vm to the database.
	 *
	 * @param vmId the primary key for the new vm
	 * @return the new vm
	 */
	@Override
	public net.carlosduran.liferay.lim.model.VM createVM(long vmId) {
		return _vmLocalService.createVM(vmId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vmLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the vm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VMLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param vmId the primary key of the vm
	 * @return the vm that was removed
	 * @throws PortalException if a vm with the primary key could not be found
	 */
	@Override
	public net.carlosduran.liferay.lim.model.VM deleteVM(long vmId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vmLocalService.deleteVM(vmId);
	}

	/**
	 * Deletes the vm from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VMLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param vm the vm
	 * @return the vm that was removed
	 */
	@Override
	public net.carlosduran.liferay.lim.model.VM deleteVM(
		net.carlosduran.liferay.lim.model.VM vm) {

		return _vmLocalService.deleteVM(vm);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vmLocalService.dynamicQuery();
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

		return _vmLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.VMModelImpl</code>.
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

		return _vmLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.VMModelImpl</code>.
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

		return _vmLocalService.dynamicQuery(
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

		return _vmLocalService.dynamicQueryCount(dynamicQuery);
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

		return _vmLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public net.carlosduran.liferay.lim.model.VM fetchVM(long vmId) {
		return _vmLocalService.fetchVM(vmId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _vmLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _vmLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _vmLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vmLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the vm with the primary key.
	 *
	 * @param vmId the primary key of the vm
	 * @return the vm
	 * @throws PortalException if a vm with the primary key could not be found
	 */
	@Override
	public net.carlosduran.liferay.lim.model.VM getVM(long vmId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vmLocalService.getVM(vmId);
	}

	/**
	 * Returns a range of all the vms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.lim.model.impl.VMModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @return the range of vms
	 */
	@Override
	public java.util.List<net.carlosduran.liferay.lim.model.VM> getVMs(
		int start, int end) {

		return _vmLocalService.getVMs(start, end);
	}

	/**
	 * Returns the number of vms.
	 *
	 * @return the number of vms
	 */
	@Override
	public int getVMsCount() {
		return _vmLocalService.getVMsCount();
	}

	/**
	 * Updates the vm in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VMLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param vm the vm
	 * @return the vm that was updated
	 */
	@Override
	public net.carlosduran.liferay.lim.model.VM updateVM(
		net.carlosduran.liferay.lim.model.VM vm) {

		return _vmLocalService.updateVM(vm);
	}

	@Override
	public VMLocalService getWrappedService() {
		return _vmLocalService;
	}

	@Override
	public void setWrappedService(VMLocalService vmLocalService) {
		_vmLocalService = vmLocalService;
	}

	private VMLocalService _vmLocalService;

}