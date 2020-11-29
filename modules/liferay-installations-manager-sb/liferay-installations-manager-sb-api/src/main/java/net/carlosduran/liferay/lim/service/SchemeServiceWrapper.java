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
 * Provides a wrapper for {@link SchemeService}.
 *
 * @author Brian Wing Shun Chan
 * @see SchemeService
 * @generated
 */
public class SchemeServiceWrapper
	implements SchemeService, ServiceWrapper<SchemeService> {

	public SchemeServiceWrapper(SchemeService schemeService) {
		_schemeService = schemeService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _schemeService.getOSGiServiceIdentifier();
	}

	@Override
	public SchemeService getWrappedService() {
		return _schemeService;
	}

	@Override
	public void setWrappedService(SchemeService schemeService) {
		_schemeService = schemeService;
	}

	private SchemeService _schemeService;

}