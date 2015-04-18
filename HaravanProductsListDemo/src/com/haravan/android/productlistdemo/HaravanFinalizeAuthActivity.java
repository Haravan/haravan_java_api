package com.haravan.android.productlistdemo;

import java.io.IOException;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.haravan.api.APIAuthorization;
import com.haravan.api.android.GenericHaravanCallbackActivity;
import com.haravan.api.credentials.JsonDirectoryCredentialsStore;

public class HaravanFinalizeAuthActivity extends GenericHaravanCallbackActivity {
	
	@Override
	public Class<?> getOnSuccessActivity(){
		return HaravanProductListDemoActivity.class;
	}

}
