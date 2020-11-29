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

import net.carlosduran.liferay.lim.exception.NoSuchInstallationException;
import net.carlosduran.liferay.lim.model.Installation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the installation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InstallationUtil
 * @generated
 */
@ProviderType
public interface InstallationPersistence extends BasePersistence<Installation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InstallationUtil} to access the installation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the installations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching installations
	 */
	public java.util.List<Installation> findByUuid(String uuid);

	/**
	 * Returns a range of all the installations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @return the range of matching installations
	 */
	public java.util.List<Installation> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the installations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching installations
	 */
	public java.util.List<Installation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Installation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the installations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching installations
	 */
	public java.util.List<Installation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Installation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first installation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installation
	 * @throws NoSuchInstallationException if a matching installation could not be found
	 */
	public Installation findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Installation>
				orderByComparator)
		throws NoSuchInstallationException;

	/**
	 * Returns the first installation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installation, or <code>null</code> if a matching installation could not be found
	 */
	public Installation fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Installation>
			orderByComparator);

	/**
	 * Returns the last installation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching installation
	 * @throws NoSuchInstallationException if a matching installation could not be found
	 */
	public Installation findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Installation>
				orderByComparator)
		throws NoSuchInstallationException;

	/**
	 * Returns the last installation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching installation, or <code>null</code> if a matching installation could not be found
	 */
	public Installation fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Installation>
			orderByComparator);

	/**
	 * Returns the installations before and after the current installation in the ordered set where uuid = &#63;.
	 *
	 * @param installationId the primary key of the current installation
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next installation
	 * @throws NoSuchInstallationException if a installation with the primary key could not be found
	 */
	public Installation[] findByUuid_PrevAndNext(
			long installationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Installation>
				orderByComparator)
		throws NoSuchInstallationException;

	/**
	 * Removes all the installations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of installations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching installations
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the installation in the entity cache if it is enabled.
	 *
	 * @param installation the installation
	 */
	public void cacheResult(Installation installation);

	/**
	 * Caches the installations in the entity cache if it is enabled.
	 *
	 * @param installations the installations
	 */
	public void cacheResult(java.util.List<Installation> installations);

	/**
	 * Creates a new installation with the primary key. Does not add the installation to the database.
	 *
	 * @param installationId the primary key for the new installation
	 * @return the new installation
	 */
	public Installation create(long installationId);

	/**
	 * Removes the installation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param installationId the primary key of the installation
	 * @return the installation that was removed
	 * @throws NoSuchInstallationException if a installation with the primary key could not be found
	 */
	public Installation remove(long installationId)
		throws NoSuchInstallationException;

	public Installation updateImpl(Installation installation);

	/**
	 * Returns the installation with the primary key or throws a <code>NoSuchInstallationException</code> if it could not be found.
	 *
	 * @param installationId the primary key of the installation
	 * @return the installation
	 * @throws NoSuchInstallationException if a installation with the primary key could not be found
	 */
	public Installation findByPrimaryKey(long installationId)
		throws NoSuchInstallationException;

	/**
	 * Returns the installation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param installationId the primary key of the installation
	 * @return the installation, or <code>null</code> if a installation with the primary key could not be found
	 */
	public Installation fetchByPrimaryKey(long installationId);

	/**
	 * Returns all the installations.
	 *
	 * @return the installations
	 */
	public java.util.List<Installation> findAll();

	/**
	 * Returns a range of all the installations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @return the range of installations
	 */
	public java.util.List<Installation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the installations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of installations
	 */
	public java.util.List<Installation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Installation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the installations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstallationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations
	 * @param end the upper bound of the range of installations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of installations
	 */
	public java.util.List<Installation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Installation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the installations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of installations.
	 *
	 * @return the number of installations
	 */
	public int countAll();

}