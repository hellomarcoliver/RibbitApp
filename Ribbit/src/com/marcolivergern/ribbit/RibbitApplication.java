package com.marcolivergern.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		  Parse.initialize(this, "LSUQQJhoIvosjgevP4dP918yaavygI8Nbg7ihIMV", "hYhDVuYcurqlqmGuSm1y0PFZLfvrXkBeIBfLU3eL");
		}

}
