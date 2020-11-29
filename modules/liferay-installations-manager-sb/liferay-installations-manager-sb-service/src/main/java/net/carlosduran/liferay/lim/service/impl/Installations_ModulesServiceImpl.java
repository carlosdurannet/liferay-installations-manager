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

import net.carlosduran.liferay.lim.service.base.Installations_ModulesServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the installations_ modules remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>net.carlosduran.liferay.lim.service.Installations_ModulesService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Installations_ModulesServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=lim",
		"json.web.service.context.path=Installations_Modules"
	},
	service = AopService.class
)
public class Installations_ModulesServiceImpl
	extends Installations_ModulesServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>net.carlosduran.liferay.lim.service.Installations_ModulesServiceUtil</code> to access the installations_ modules remote service.
	 */
}