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

package net.carlosduran.liferay.lim.service.impl;

import com.liferay.portal.aop.AopService;

import net.carlosduran.liferay.lim.service.base.SchemeLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the scheme local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>net.carlosduran.liferay.lim.service.SchemeLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SchemeLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=net.carlosduran.liferay.lim.model.Scheme",
	service = AopService.class
)
public class SchemeLocalServiceImpl extends SchemeLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>net.carlosduran.liferay.lim.service.SchemeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>net.carlosduran.liferay.lim.service.SchemeLocalServiceUtil</code>.
	 */
}