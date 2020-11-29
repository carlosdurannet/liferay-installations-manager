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

package net.carlosduran.liferay.lim.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import net.carlosduran.liferay.lim.exception.NoSuchInstallations_ModulesException;
import net.carlosduran.liferay.lim.model.Installations_Modules;
import net.carlosduran.liferay.lim.model.impl.Installations_ModulesImpl;
import net.carlosduran.liferay.lim.model.impl.Installations_ModulesModelImpl;
import net.carlosduran.liferay.lim.service.persistence.Installations_ModulesPK;
import net.carlosduran.liferay.lim.service.persistence.Installations_ModulesPersistence;
import net.carlosduran.liferay.lim.service.persistence.impl.constants.LIMPersistenceConstants;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the installations_ modules service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = Installations_ModulesPersistence.class)
public class Installations_ModulesPersistenceImpl
	extends BasePersistenceImpl<Installations_Modules>
	implements Installations_ModulesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Installations_ModulesUtil</code> to access the installations_ modules persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Installations_ModulesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the installations_ moduleses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching installations_ moduleses
	 */
	@Override
	public List<Installations_Modules> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Installations_Modules> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<Installations_Modules> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Installations_Modules> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Installations_Modules> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Installations_Modules> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Installations_Modules> list = null;

		if (useFinderCache) {
			list = (List<Installations_Modules>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Installations_Modules installations_Modules : list) {
					if (!uuid.equals(installations_Modules.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_INSTALLATIONS_MODULES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Installations_ModulesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Installations_Modules>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a matching installations_ modules could not be found
	 */
	@Override
	public Installations_Modules findByUuid_First(
			String uuid,
			OrderByComparator<Installations_Modules> orderByComparator)
		throws NoSuchInstallations_ModulesException {

		Installations_Modules installations_Modules = fetchByUuid_First(
			uuid, orderByComparator);

		if (installations_Modules != null) {
			return installations_Modules;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchInstallations_ModulesException(sb.toString());
	}

	/**
	 * Returns the first installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installations_ modules, or <code>null</code> if a matching installations_ modules could not be found
	 */
	@Override
	public Installations_Modules fetchByUuid_First(
		String uuid,
		OrderByComparator<Installations_Modules> orderByComparator) {

		List<Installations_Modules> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a matching installations_ modules could not be found
	 */
	@Override
	public Installations_Modules findByUuid_Last(
			String uuid,
			OrderByComparator<Installations_Modules> orderByComparator)
		throws NoSuchInstallations_ModulesException {

		Installations_Modules installations_Modules = fetchByUuid_Last(
			uuid, orderByComparator);

		if (installations_Modules != null) {
			return installations_Modules;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchInstallations_ModulesException(sb.toString());
	}

	/**
	 * Returns the last installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching installations_ modules, or <code>null</code> if a matching installations_ modules could not be found
	 */
	@Override
	public Installations_Modules fetchByUuid_Last(
		String uuid,
		OrderByComparator<Installations_Modules> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Installations_Modules> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the installations_ moduleses before and after the current installations_ modules in the ordered set where uuid = &#63;.
	 *
	 * @param installations_ModulesPK the primary key of the current installations_ modules
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a installations_ modules with the primary key could not be found
	 */
	@Override
	public Installations_Modules[] findByUuid_PrevAndNext(
			Installations_ModulesPK installations_ModulesPK, String uuid,
			OrderByComparator<Installations_Modules> orderByComparator)
		throws NoSuchInstallations_ModulesException {

		uuid = Objects.toString(uuid, "");

		Installations_Modules installations_Modules = findByPrimaryKey(
			installations_ModulesPK);

		Session session = null;

		try {
			session = openSession();

			Installations_Modules[] array = new Installations_ModulesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, installations_Modules, uuid, orderByComparator, true);

			array[1] = installations_Modules;

			array[2] = getByUuid_PrevAndNext(
				session, installations_Modules, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Installations_Modules getByUuid_PrevAndNext(
		Session session, Installations_Modules installations_Modules,
		String uuid, OrderByComparator<Installations_Modules> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_INSTALLATIONS_MODULES_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(Installations_ModulesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						installations_Modules)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Installations_Modules> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the installations_ moduleses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Installations_Modules installations_Modules :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(installations_Modules);
		}
	}

	/**
	 * Returns the number of installations_ moduleses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching installations_ moduleses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_INSTALLATIONS_MODULES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"installations_Modules.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(installations_Modules.uuid IS NULL OR installations_Modules.uuid = '')";

	public Installations_ModulesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Installations_Modules.class);

		setModelImplClass(Installations_ModulesImpl.class);
		setModelPKClass(Installations_ModulesPK.class);
	}

	/**
	 * Caches the installations_ modules in the entity cache if it is enabled.
	 *
	 * @param installations_Modules the installations_ modules
	 */
	@Override
	public void cacheResult(Installations_Modules installations_Modules) {
		entityCache.putResult(
			Installations_ModulesImpl.class,
			installations_Modules.getPrimaryKey(), installations_Modules);
	}

	/**
	 * Caches the installations_ moduleses in the entity cache if it is enabled.
	 *
	 * @param installations_Moduleses the installations_ moduleses
	 */
	@Override
	public void cacheResult(
		List<Installations_Modules> installations_Moduleses) {

		for (Installations_Modules installations_Modules :
				installations_Moduleses) {

			if (entityCache.getResult(
					Installations_ModulesImpl.class,
					installations_Modules.getPrimaryKey()) == null) {

				cacheResult(installations_Modules);
			}
		}
	}

	/**
	 * Clears the cache for all installations_ moduleses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Installations_ModulesImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the installations_ modules.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Installations_Modules installations_Modules) {
		entityCache.removeResult(
			Installations_ModulesImpl.class, installations_Modules);
	}

	@Override
	public void clearCache(
		List<Installations_Modules> installations_Moduleses) {

		for (Installations_Modules installations_Modules :
				installations_Moduleses) {

			entityCache.removeResult(
				Installations_ModulesImpl.class, installations_Modules);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				Installations_ModulesImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new installations_ modules with the primary key. Does not add the installations_ modules to the database.
	 *
	 * @param installations_ModulesPK the primary key for the new installations_ modules
	 * @return the new installations_ modules
	 */
	@Override
	public Installations_Modules create(
		Installations_ModulesPK installations_ModulesPK) {

		Installations_Modules installations_Modules =
			new Installations_ModulesImpl();

		installations_Modules.setNew(true);
		installations_Modules.setPrimaryKey(installations_ModulesPK);

		String uuid = PortalUUIDUtil.generate();

		installations_Modules.setUuid(uuid);

		return installations_Modules;
	}

	/**
	 * Removes the installations_ modules with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param installations_ModulesPK the primary key of the installations_ modules
	 * @return the installations_ modules that was removed
	 * @throws NoSuchInstallations_ModulesException if a installations_ modules with the primary key could not be found
	 */
	@Override
	public Installations_Modules remove(
			Installations_ModulesPK installations_ModulesPK)
		throws NoSuchInstallations_ModulesException {

		return remove((Serializable)installations_ModulesPK);
	}

	/**
	 * Removes the installations_ modules with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the installations_ modules
	 * @return the installations_ modules that was removed
	 * @throws NoSuchInstallations_ModulesException if a installations_ modules with the primary key could not be found
	 */
	@Override
	public Installations_Modules remove(Serializable primaryKey)
		throws NoSuchInstallations_ModulesException {

		Session session = null;

		try {
			session = openSession();

			Installations_Modules installations_Modules =
				(Installations_Modules)session.get(
					Installations_ModulesImpl.class, primaryKey);

			if (installations_Modules == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInstallations_ModulesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(installations_Modules);
		}
		catch (NoSuchInstallations_ModulesException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Installations_Modules removeImpl(
		Installations_Modules installations_Modules) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(installations_Modules)) {
				installations_Modules = (Installations_Modules)session.get(
					Installations_ModulesImpl.class,
					installations_Modules.getPrimaryKeyObj());
			}

			if (installations_Modules != null) {
				session.delete(installations_Modules);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (installations_Modules != null) {
			clearCache(installations_Modules);
		}

		return installations_Modules;
	}

	@Override
	public Installations_Modules updateImpl(
		Installations_Modules installations_Modules) {

		boolean isNew = installations_Modules.isNew();

		if (!(installations_Modules instanceof
				Installations_ModulesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(installations_Modules.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					installations_Modules);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in installations_Modules proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Installations_Modules implementation " +
					installations_Modules.getClass());
		}

		Installations_ModulesModelImpl installations_ModulesModelImpl =
			(Installations_ModulesModelImpl)installations_Modules;

		if (Validator.isNull(installations_Modules.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			installations_Modules.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(installations_Modules);
			}
			else {
				installations_Modules = (Installations_Modules)session.merge(
					installations_Modules);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			Installations_ModulesImpl.class, installations_ModulesModelImpl,
			false, true);

		if (isNew) {
			installations_Modules.setNew(false);
		}

		installations_Modules.resetOriginalValues();

		return installations_Modules;
	}

	/**
	 * Returns the installations_ modules with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the installations_ modules
	 * @return the installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a installations_ modules with the primary key could not be found
	 */
	@Override
	public Installations_Modules findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInstallations_ModulesException {

		Installations_Modules installations_Modules = fetchByPrimaryKey(
			primaryKey);

		if (installations_Modules == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInstallations_ModulesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return installations_Modules;
	}

	/**
	 * Returns the installations_ modules with the primary key or throws a <code>NoSuchInstallations_ModulesException</code> if it could not be found.
	 *
	 * @param installations_ModulesPK the primary key of the installations_ modules
	 * @return the installations_ modules
	 * @throws NoSuchInstallations_ModulesException if a installations_ modules with the primary key could not be found
	 */
	@Override
	public Installations_Modules findByPrimaryKey(
			Installations_ModulesPK installations_ModulesPK)
		throws NoSuchInstallations_ModulesException {

		return findByPrimaryKey((Serializable)installations_ModulesPK);
	}

	/**
	 * Returns the installations_ modules with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param installations_ModulesPK the primary key of the installations_ modules
	 * @return the installations_ modules, or <code>null</code> if a installations_ modules with the primary key could not be found
	 */
	@Override
	public Installations_Modules fetchByPrimaryKey(
		Installations_ModulesPK installations_ModulesPK) {

		return fetchByPrimaryKey((Serializable)installations_ModulesPK);
	}

	/**
	 * Returns all the installations_ moduleses.
	 *
	 * @return the installations_ moduleses
	 */
	@Override
	public List<Installations_Modules> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Installations_Modules> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Installations_Modules> findAll(
		int start, int end,
		OrderByComparator<Installations_Modules> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Installations_Modules> findAll(
		int start, int end,
		OrderByComparator<Installations_Modules> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Installations_Modules> list = null;

		if (useFinderCache) {
			list = (List<Installations_Modules>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_INSTALLATIONS_MODULES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_INSTALLATIONS_MODULES;

				sql = sql.concat(Installations_ModulesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Installations_Modules>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the installations_ moduleses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Installations_Modules installations_Modules : findAll()) {
			remove(installations_Modules);
		}
	}

	/**
	 * Returns the number of installations_ moduleses.
	 *
	 * @return the number of installations_ moduleses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_INSTALLATIONS_MODULES);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "installations_ModulesPK";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_INSTALLATIONS_MODULES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Installations_ModulesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the installations_ modules persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new Installations_ModulesModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Installations_Modules.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(Installations_ModulesImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = LIMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = LIMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = LIMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_INSTALLATIONS_MODULES =
		"SELECT installations_Modules FROM Installations_Modules installations_Modules";

	private static final String _SQL_SELECT_INSTALLATIONS_MODULES_WHERE =
		"SELECT installations_Modules FROM Installations_Modules installations_Modules WHERE ";

	private static final String _SQL_COUNT_INSTALLATIONS_MODULES =
		"SELECT COUNT(installations_Modules) FROM Installations_Modules installations_Modules";

	private static final String _SQL_COUNT_INSTALLATIONS_MODULES_WHERE =
		"SELECT COUNT(installations_Modules) FROM Installations_Modules installations_Modules WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"installations_Modules.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Installations_Modules exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Installations_Modules exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		Installations_ModulesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});
	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(
		new String[] {"installationId", "moduleId"});

	static {
		try {
			Class.forName(LIMPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;
	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();

	private static class Installations_ModulesModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			Installations_ModulesModelImpl installations_ModulesModelImpl =
				(Installations_ModulesModelImpl)baseModel;

			long columnBitmask =
				installations_ModulesModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					installations_ModulesModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						installations_ModulesModelImpl.getColumnBitmask(
							columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					installations_ModulesModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			Installations_ModulesModelImpl installations_ModulesModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						installations_ModulesModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] =
						installations_ModulesModelImpl.getColumnValue(
							columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}