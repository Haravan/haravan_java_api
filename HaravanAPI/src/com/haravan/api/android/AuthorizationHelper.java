package com.haravan.api.android;

import java.net.URI;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.haravan.api.APIAuthorization;
import com.haravan.api.credentials.Credential;
import com.haravan.api.credentials.HaravanCredentialsStore;

public class AuthorizationHelper {
	HaravanCredentialsStore store;
	String apiKey, sharedSecret;
	
	public AuthorizationHelper(Context ctx, HaravanCredentialsStore store, int apiKeyId, int apiSecretId) {
		this(ctx, store, ctx.getString(apiKeyId), ctx.getString(apiSecretId));
	}
	
	public AuthorizationHelper(Context ctx, HaravanCredentialsStore store, String apiKey, String apiSecret) {
		this.apiKey = apiKey;
		this.sharedSecret = apiSecret;
		this.store = store;
	}
	
	public void sendAuthRequest(Context ctx, String shopname) throws Exception{
		Credential cred = new Credential(apiKey, sharedSecret, shopname);
		store.saveCredential(cred);
		
		APIAuthorization auth = new APIAuthorization(cred);
		URI authRequest = auth.generateAuthRequest();
		Intent launchBrowser = new Intent(Intent.ACTION_VIEW);
		launchBrowser.setData(Uri.parse(authRequest.toString()));
		ctx.startActivity(launchBrowser);
	}
}
