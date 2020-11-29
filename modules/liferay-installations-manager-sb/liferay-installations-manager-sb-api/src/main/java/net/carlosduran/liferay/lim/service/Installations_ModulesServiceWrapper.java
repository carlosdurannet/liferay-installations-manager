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
 * Provides a wrapper for {@link Installations_ModulesService}.
 *
 * @author Brian Wing Shun Chan
 * @see Installations_ModulesService
 * @generated
 */
public class Installations_ModulesServiceWrapper
	implements Installations_ModulesService,
			   ServiceWrapper<Installations_ModulesService> {

	public Installations_ModulesServiceWrapper(
		Installations_ModulesService installations_ModulesService) {

		_installations_ModulesService = installations_ModulesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _installations_ModulesService.getOSGiServiceIdentifier();
	}

	@Override
	public Installations_ModulesService getWrappedService() {
		return _installations_ModulesService;
	}

	@Override
	public void setWrappedService(
		Installations_ModulesService installations_ModulesService) {

		_installations_ModulesService = installations_ModulesService;
	}

	private Installations_ModulesService _installations_ModulesService;

}