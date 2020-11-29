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

import net.carlosduran.liferay.lim.exception.NoSuchVMException;
import net.carlosduran.liferay.lim.model.VM;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the vm service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VMUtil
 * @generated
 */
@ProviderType
public interface VMPersistence extends BasePersistence<VM> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VMUtil} to access the vm persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the vms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching vms
	 */
	public java.util.List<VM> findByUuid(String uuid);

	/**
	 * Returns a range of all the vms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VMModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @return the range of matching vms
	 */
	public java.util.List<VM> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the vms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VMModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vms
	 */
	public java.util.List<VM> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VM> orderByComparator);

	/**
	 * Returns an ordered range of all the vms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VMModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching vms
	 */
	public java.util.List<VM> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VM> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first vm in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vm
	 * @throws NoSuchVMException if a matching vm could not be found
	 */
	public VM findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<VM>
				orderByComparator)
		throws NoSuchVMException;

	/**
	 * Returns the first vm in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vm, or <code>null</code> if a matching vm could not be found
	 */
	public VM fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VM> orderByComparator);

	/**
	 * Returns the last vm in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vm
	 * @throws NoSuchVMException if a matching vm could not be found
	 */
	public VM findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<VM>
				orderByComparator)
		throws NoSuchVMException;

	/**
	 * Returns the last vm in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vm, or <code>null</code> if a matching vm could not be found
	 */
	public VM fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VM> orderByComparator);

	/**
	 * Returns the vms before and after the current vm in the ordered set where uuid = &#63;.
	 *
	 * @param vmId the primary key of the current vm
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vm
	 * @throws NoSuchVMException if a vm with the primary key could not be found
	 */
	public VM[] findByUuid_PrevAndNext(
			long vmId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<VM>
				orderByComparator)
		throws NoSuchVMException;

	/**
	 * Removes all the vms where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of vms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching vms
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the vm in the entity cache if it is enabled.
	 *
	 * @param vm the vm
	 */
	public void cacheResult(VM vm);

	/**
	 * Caches the vms in the entity cache if it is enabled.
	 *
	 * @param vms the vms
	 */
	public void cacheResult(java.util.List<VM> vms);

	/**
	 * Creates a new vm with the primary key. Does not add the vm to the database.
	 *
	 * @param vmId the primary key for the new vm
	 * @return the new vm
	 */
	public VM create(long vmId);

	/**
	 * Removes the vm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vmId the primary key of the vm
	 * @return the vm that was removed
	 * @throws NoSuchVMException if a vm with the primary key could not be found
	 */
	public VM remove(long vmId) throws NoSuchVMException;

	public VM updateImpl(VM vm);

	/**
	 * Returns the vm with the primary key or throws a <code>NoSuchVMException</code> if it could not be found.
	 *
	 * @param vmId the primary key of the vm
	 * @return the vm
	 * @throws NoSuchVMException if a vm with the primary key could not be found
	 */
	public VM findByPrimaryKey(long vmId) throws NoSuchVMException;

	/**
	 * Returns the vm with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vmId the primary key of the vm
	 * @return the vm, or <code>null</code> if a vm with the primary key could not be found
	 */
	public VM fetchByPrimaryKey(long vmId);

	/**
	 * Returns all the vms.
	 *
	 * @return the vms
	 */
	public java.util.List<VM> findAll();

	/**
	 * Returns a range of all the vms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VMModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @return the range of vms
	 */
	public java.util.List<VM> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the vms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VMModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vms
	 */
	public java.util.List<VM> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VM> orderByComparator);

	/**
	 * Returns an ordered range of all the vms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VMModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vms
	 * @param end the upper bound of the range of vms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of vms
	 */
	public java.util.List<VM> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VM> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the vms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of vms.
	 *
	 * @return the number of vms
	 */
	public int countAll();

}