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
 * Provides a wrapper for {@link VMService}.
 *
 * @author Brian Wing Shun Chan
 * @see VMService
 * @generated
 */
public class VMServiceWrapper implements ServiceWrapper<VMService>, VMService {

	public VMServiceWrapper(VMService vmService) {
		_vmService = vmService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _vmService.getOSGiServiceIdentifier();
	}

	@Override
	public VMService getWrappedService() {
		return _vmService;
	}

	@Override
	public void setWrappedService(VMService vmService) {
		_vmService = vmService;
	}

	private VMService _vmService;

}