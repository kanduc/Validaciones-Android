package com.kadroid.utilitarios.android.util;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Validaciones {
	
	public static boolean isOnline(Application app) {
		ConnectivityManager manager = (ConnectivityManager) app
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = manager.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) {
			return true;
		}
		return false;
	}

}
