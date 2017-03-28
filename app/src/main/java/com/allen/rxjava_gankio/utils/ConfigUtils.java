package com.allen.rxjava_gankio.utils;

import android.content.Context;
import android.content.res.Configuration;

/**
 * 判断横屏和竖屏工具类
 * Created by Allen on 2017/3/27.
 */
public class ConfigUtils {
    public static boolean isOrientationPortrait(Context context) {
        if (context.getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_PORTRAIT) {
            return true;
        }
        return false;
    }

    public static boolean isOrientationLandscape(Context context) {
        if (context.getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            return true;
        }
        return false;
    }
}
