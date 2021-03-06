package com.allen.rxjava_gankio.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * 网络检查工具类
 * Created by Allen on 2017/3/27.
 */
public class NetUtils {
    public static boolean checkNet(Context context) {
        boolean mWifiConnected = isWifiConnected(context);

        boolean mMobileConnected = isMobileConnected(context);

        if (mWifiConnected == false && mMobileConnected == false) {

            return false;
        }
        return true;
    }

    private static boolean isWifiConnected(Context context) {
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(
                Context.CONNECTIVITY_SERVICE);

        NetworkInfo info = manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (info != null && info.isConnected()) {
            return true;
        }

        return false;

    }

    private static boolean isMobileConnected(Context context) {
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(
                Context.CONNECTIVITY_SERVICE);

        NetworkInfo info = manager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        if (info != null && info.isConnected()) {
            return true;
        }

        return false;
    }
}
