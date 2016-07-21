package com.lody.virtual.client.hook.patchs.user;

import com.lody.virtual.client.hook.base.Hook;
import com.lody.virtual.client.hook.utils.HookUtils;

import java.lang.reflect.Method;

/**
 * @author Lody
 *
 *
 * @see android.os.IUserManager#getApplicationRestrictions(String)
 */
/* package */ class Hook_GetApplicationRestrictions extends Hook {

	@Override
	public String getName() {
		return "getApplicationRestrictions";
	}

	@Override
	public Object onHook(Object who, Method method, Object... args) throws Throwable {
		HookUtils.replaceFirstAppPkg(args);
		return method.invoke(who, args);
	}
}
