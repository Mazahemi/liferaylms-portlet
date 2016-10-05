/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.lms.service.base;

import com.liferay.lms.service.ModuleServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class ModuleServiceClpInvoker {
	public ModuleServiceClpInvoker() {
		_methodName132 = "getBeanIdentifier";

		_methodParameterTypes132 = new String[] {  };

		_methodName133 = "setBeanIdentifier";

		_methodParameterTypes133 = new String[] { "java.lang.String" };

		_methodName138 = "findAllInGroup";

		_methodParameterTypes138 = new String[] { "long" };

		_methodName139 = "findAllInCourse";

		_methodParameterTypes139 = new String[] { "long" };

		_methodName140 = "isLocked";

		_methodParameterTypes140 = new String[] { "long" };

		_methodName141 = "PassedByMe";

		_methodParameterTypes141 = new String[] { "long" };

		_methodName142 = "isUserPassed";

		_methodParameterTypes142 = new String[] { "long", "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName132.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
			return ModuleServiceUtil.getBeanIdentifier();
		}

		if (_methodName133.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
			ModuleServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName138.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes138, parameterTypes)) {
			return ModuleServiceUtil.findAllInGroup(((Long)arguments[0]).longValue());
		}

		if (_methodName139.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes139, parameterTypes)) {
			return ModuleServiceUtil.findAllInCourse(((Long)arguments[0]).longValue());
		}

		if (_methodName140.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes140, parameterTypes)) {
			return ModuleServiceUtil.isLocked(((Long)arguments[0]).longValue());
		}

		if (_methodName141.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes141, parameterTypes)) {
			return ModuleServiceUtil.PassedByMe(((Long)arguments[0]).longValue());
		}

		if (_methodName142.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes142, parameterTypes)) {
			return ModuleServiceUtil.isUserPassed(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName132;
	private String[] _methodParameterTypes132;
	private String _methodName133;
	private String[] _methodParameterTypes133;
	private String _methodName138;
	private String[] _methodParameterTypes138;
	private String _methodName139;
	private String[] _methodParameterTypes139;
	private String _methodName140;
	private String[] _methodParameterTypes140;
	private String _methodName141;
	private String[] _methodParameterTypes141;
	private String _methodName142;
	private String[] _methodParameterTypes142;
}