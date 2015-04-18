package com.haravan.api.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;

import org.apache.http.client.HttpClient;
import org.codegist.crest.CRest;
import org.codegist.crest.CRestBuilder;
import org.codegist.crest.HttpClientRestService;

import com.haravan.api.APIAuthorization;
import com.haravan.api.credentials.Credential;
import com.haravan.api.endpoints.BaseHaravanService;
import com.haravan.api.endpoints.EndpointImpl;
import com.haravan.api.resources.HaravanResource;
import com.haravan.api.resources.json.HaravanRequestWriter;
import com.haravan.api.resources.json.HaravanResponseReader;


public class HaravanClient {
	private CRest crestClient;
	private APIAuthorization auth;
	private Credential creds;
	private HaravanResponseReader reader = new HaravanResponseReader();
	private HaravanRequestWriter writer = new HaravanRequestWriter();
	
	public HaravanClient(Credential creds) {
		this.creds = creds;
		this.auth = new APIAuthorization(this.creds);
		crestClient = new CRestBuilder()
						.expectsJson()
						.setRestService(constructClientRestService())
						.overrideDefaultConfigWith(constructConfiguration())
						.build();
	}

	private HashMap<String, String> constructConfiguration(){
		return new HashMap<String, String>(){{
			put("service.end-point", getEndpoint());
		}};
	}
	
	private String getEndpoint() {
		return "https://"+creds.getShopName()+".myharavan.com";
	}
	
	private HttpClientRestService constructClientRestService() {
		return new HttpClientRestService(auth.getAuthorizedClient());
	}
	
	public <T extends BaseHaravanService> T constructService(Class<T> interfaze){
		if(interfaze.isInterface()) {
			return constructInterface(interfaze);
		} else {
			return constructEndpointImpl(interfaze);
		}
	}
	
	public <T extends BaseHaravanService> T constructInterface(Class<T> interfaze){
		return crestClient.build(interfaze);
	}
	
	public <T extends BaseHaravanService> T constructEndpointImpl(Class<T> clazz) {
		try {
			EndpointImpl instance = (EndpointImpl)clazz.newInstance();
			instance.setEndpoint(getEndpoint());
			instance.setHttpClient(auth.getAuthorizedClient());
			
			T service = constructService((Class<T>)instance.getServiceClass());
			instance.setServiceInterface(service);
			
			return (T) instance;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public <T extends HaravanResource> List<T> handleResponse(InputStream in, Class<T> resource){
		return reader.read(new InputStreamReader(in), resource);
	}
	
	public <T extends HaravanResource> String convertToJson(T object) throws IOException {
		StringWriter w = new StringWriter();
		writer.write(w, object);
		return w.toString();
	}

}
