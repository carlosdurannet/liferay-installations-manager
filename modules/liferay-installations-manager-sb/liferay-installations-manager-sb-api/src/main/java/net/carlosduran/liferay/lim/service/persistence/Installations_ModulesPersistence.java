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

import java.util.Set;

import net.carlosduran.liferay.lim.exception.NoSuchInstallations_ModulesException;
import net.carlosduran.liferay.lim.model.Installations_Modules;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the installations_ modules service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Installations_ModulesUtil
 * @generated
 */
@ProviderType
public interface Installations_ModulesPersistence
	extends BasePersistence<Installations_Modules> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Installations_ModulesUtil} to access the installations_ modules persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the installations_ moduleses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching installations_ moduleses
	 */
	public java.util.List<Installations_Modules> findByUuid(String uuid);

	/**
	 * Returns a range of all the installations_ moduleses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @return the range of matching installations_ moduleses
	 */
	public java.util.List<Installations_Modules> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the installations_ moduleses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching installations_ moduleses
	 */
	public java.util.List<Installations_Modules> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Installations_Modules>
			orderByComparator);

	/**
	 * Returns an ordered range of all the installations_ moduleses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching installations_ moduleses
	 */
	public java.util.List<Installations_Modules> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Installations_Modules>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a matching installations_ modules could not be found
	 */
	public Installations_Modules findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<Installations_Modules> orderByComparator)
		throws NoSuchInstallations_ModulesException;

	/**
	 * Returns the first installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installations_ modules, or <code>null</code> if a matching installations_ modules could not be found
	 */
	public Installations_Modules fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Installations_Modules>
			orderByComparator);

	/**
	 * Returns the last installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a matching installations_ modules could not be found
	 */
	public Installations_Modules findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<Installations_Modules> orderByComparator)
		throws NoSuchInstallations_ModulesException;

	/**
	 * Returns the last installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching installations_ modules, or <code>null</code> if a matching installations_ modules could not be found
	 */
	public Installations_Modules fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Installations_Modules>
			orderByComparator);

	/**
	 * Returns the installations_ moduleses before and after the current installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param installations_ModulesPK the primary key of the current installations_ modules
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a installations_ modules with the primary key could not be found
	 */
	public Installations_Modules[] findByUuid_PrevAndNext(
			net.carlosduran.liferay.lim.service.persistence.
				Installations_ModulesPK installations_ModulesPK,
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<Installations_Modules> orderByComparator)
		throws NoSuchInstallations_ModulesException;

	/**
	 * Removes all the installations_ moduleses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of installations_ moduleses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching installations_ moduleses
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the installations_ modules in the entity cache if it is enabled.
	 *
	 * @param installations_Modules the installations_ modules
	 */
	public void cacheResult(Installations_Modules installations_Modules);

	/**
	 * Caches the installations_ moduleses in the entity cache if it is enabled.
	 *
	 * @param installations_Moduleses the installations_ moduleses
	 */
	public void cacheResult(
		java.util.List<Installations_Modules> installations_Moduleses);

	/**
	 * Creates a new installations_ modules with the primary key. Does not add the installations_ modules to the database.
	 *
	 * @param installations_ModulesPK the primary key for the new installations_ modules
	 * @return the new installations_ modules
	 */
	public Installations_Modules create(
		net.carlosduran.liferay.lim.service.persistence.Installations_ModulesPK
			installations_ModulesPK);

	/**
	 * Removes the installations_ modules with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param installations_ModulesPK the primary key of the installations_ modules
	 * @return the installations_ modules that was removed
	 * @throws NoSuchInstallations_ModulesException if a installations_ modules with the primary key could not be found
	 */
	public Installations_Modules remove(
			net.carlosduran.liferay.lim.service.persistence.
				Installations_ModulesPK installations_ModulesPK)
		throws NoSuchInstallations_ModulesException;

	public Installations_Modules updateImpl(
		Installations_Modules installations_Modules);

	/**
	 * Returns the installations_ modules with the primary key or throws a <code>NoSuchInstallations_ModulesException</code> if it could not be found.
	 *
	 * @param installations_ModulesPK the primary key of the installations_ modules
	 * @return the installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a installations_ modules with the primary key could not be found
	 */
	public Installations_Modules findByPrimaryKey(
			net.carlosduran.liferay.lim.service.persistence.
				Installations_ModulesPK installations_ModulesPK)
		throws NoSuchInstallations_ModulesException;

	/**
	 * Returns the installations_ modules with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param installations_ModulesPK the primary key of the installations_ modules
	 * @return the installations_ modules, or <code>null</code> if a installations_ modules with the primary key could not be found
	 */
	public Installations_Modules fetchByPrimaryKey(
		net.carlosduran.liferay.lim.service.persistence.Installations_ModulesPK
			installations_ModulesPK);

	/**
	 * Returns all the installations_ moduleses.
	 *
	 * @return the installations_ moduleses
	 */
	public java.util.List<Installations_Modules> findAll();

	/**
	 * Returns a range of all the installations_ moduleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @return the range of installations_ moduleses
	 */
	public java.util.List<Installations_Modules> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the installations_ moduleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of installations_ moduleses
	 */
	public java.util.List<Installations_Modules> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Installations_Modules>
			orderByComparator);

	/**
	 * Returns an ordered range of all the installations_ moduleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Installations_ModulesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of installations_ moduleses
	 * @param end the upper bound of the range of installations_ moduleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of installations_ moduleses
	 */
	public java.util.List<Installations_Modules> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Installations_Modules>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the installations_ moduleses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of installations_ moduleses.
	 *
	 * @return the number of installations_ moduleses
	 */
	public int countAll();

	public Set<String> getCompoundPKColumnNames();

}