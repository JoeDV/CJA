package com.joedv.cja;

import com.joedv.cja.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.KeyEvent;
import org.apache.cordova.*;

@SuppressWarnings("unused")
public class CJAActivity extends DroidGap {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				 WindowManager.LayoutParams.FLAG_FULLSCREEN | 
				 WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
		
		super.setIntegerProperty("splashscreen", R.drawable.splash);
		//super.loadUrl("file:///android_asset/www/index.html",3000);
		super.loadUrl("http://www.jdvhosting.com/CJA/index2.html",3500);
	}
}
