package com.nasduck.duckpermission.result.strategy;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * All the permission result strategies should implement this interface.
 */
public interface IPermissionResultStrategy {

    /**
     *
     *
     * @param context
     * @param permissions
     * @param grantResults
     * @return True if all permissions are granted
     */
    void onPermissionsResult(Context context, int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults);

}