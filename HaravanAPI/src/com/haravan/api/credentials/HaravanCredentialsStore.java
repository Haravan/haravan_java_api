package com.haravan.api.credentials;

import java.util.Set;

public interface HaravanCredentialsStore {
	public Credential loadCredential(String shop) throws Exception;
	public void saveCredential(Credential credential) throws Exception;
	public Set<String> getAvailableShops() throws Exception;
}
