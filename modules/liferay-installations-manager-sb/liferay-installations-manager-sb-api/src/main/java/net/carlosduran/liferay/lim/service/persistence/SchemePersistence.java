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

import net.carlosduran.liferay.lim.exception.NoSuchSchemeException;
import net.carlosduran.liferay.lim.model.Scheme;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the scheme service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SchemeUtil
 * @generated
 */
@ProviderType
public interface SchemePersistence extends BasePersistence<Scheme> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SchemeUtil} to access the scheme persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the schemes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching schemes
	 */
	public java.util.List<Scheme> findByUuid(String uuid);

	/**
	 * Returns a range of all the schemes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @return the range of matching schemes
	 */
	public java.util.List<Scheme> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the schemes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching schemes
	 */
	public java.util.List<Scheme> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Scheme>
			orderByComparator);

	/**
	 * Returns an ordered range of all the schemes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching schemes
	 */
	public java.util.List<Scheme> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Scheme>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first scheme in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching scheme
	 * @throws NoSuchSchemeException if a matching scheme could not be found
	 */
	public Scheme findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Scheme>
				orderByComparator)
		throws NoSuchSchemeException;

	/**
	 * Returns the first scheme in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching scheme, or <code>null</code> if a matching scheme could not be found
	 */
	public Scheme fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Scheme>
			orderByComparator);

	/**
	 * Returns the last scheme in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching scheme
	 * @throws NoSuchSchemeException if a matching scheme could not be found
	 */
	public Scheme findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Scheme>
				orderByComparator)
		throws NoSuchSchemeException;

	/**
	 * Returns the last scheme in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching scheme, or <code>null</code> if a matching scheme could not be found
	 */
	public Scheme fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Scheme>
			orderByComparator);

	/**
	 * Returns the schemes before and after the current scheme in the ordered set where uuid = &#63;.
	 *
	 * @param schemeId the primary key of the current scheme
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next scheme
	 * @throws NoSuchSchemeException if a scheme with the primary key could not be found
	 */
	public Scheme[] findByUuid_PrevAndNext(
			long schemeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Scheme>
				orderByComparator)
		throws NoSuchSchemeException;

	/**
	 * Removes all the schemes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of schemes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching schemes
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the scheme in the entity cache if it is enabled.
	 *
	 * @param scheme the scheme
	 */
	public void cacheResult(Scheme scheme);

	/**
	 * Caches the schemes in the entity cache if it is enabled.
	 *
	 * @param schemes the schemes
	 */
	public void cacheResult(java.util.List<Scheme> schemes);

	/**
	 * Creates a new scheme with the primary key. Does not add the scheme to the database.
	 *
	 * @param schemeId the primary key for the new scheme
	 * @return the new scheme
	 */
	public Scheme create(long schemeId);

	/**
	 * Removes the scheme with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param schemeId the primary key of the scheme
	 * @return the scheme that was removed
	 * @throws NoSuchSchemeException if a scheme with the primary key could not be found
	 */
	public Scheme remove(long schemeId) throws NoSuchSchemeException;

	public Scheme updateImpl(Scheme scheme);

	/**
	 * Returns the scheme with the primary key or throws a <code>NoSuchSchemeException</code> if it could not be found.
	 *
	 * @param schemeId the primary key of the scheme
	 * @return the scheme
	 * @throws NoSuchSchemeException if a scheme with the primary key could not be found
	 */
	public Scheme findByPrimaryKey(long schemeId) throws NoSuchSchemeException;

	/**
	 * Returns the scheme with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param schemeId the primary key of the scheme
	 * @return the scheme, or <code>null</code> if a scheme with the primary key could not be found
	 */
	public Scheme fetchByPrimaryKey(long schemeId);

	/**
	 * Returns all the schemes.
	 *
	 * @return the schemes
	 */
	public java.util.List<Scheme> findAll();

	/**
	 * Returns a range of all the schemes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @return the range of schemes
	 */
	public java.util.List<Scheme> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the schemes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of schemes
	 */
	public java.util.List<Scheme> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Scheme>
			orderByComparator);

	/**
	 * Returns an ordered range of all the schemes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchemeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schemes
	 * @param end the upper bound of the range of schemes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of schemes
	 */
	public java.util.List<Scheme> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Scheme>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the schemes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of schemes.
	 *
	 * @return the number of schemes
	 */
	public int countAll();

}