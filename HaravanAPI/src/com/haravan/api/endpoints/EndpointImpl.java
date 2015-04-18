package com.haravan.api.endpoints;

import org.apache.http.client.HttpClient;

public interface EndpointImpl extends BaseHaravanService{
	
	public void setEndpoint(String endpoint);
	
	public void setHttpClient(HttpClient client);
	
	public void setServiceInterface(BaseHaravanService service);
	
	public Class<?> getServiceClass();
}
