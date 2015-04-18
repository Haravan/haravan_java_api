package com.haravan.api.endpoints;

import java.util.ArrayList;
import java.util.HashMap;

import com.haravan.api.APIAuthorization;
import com.haravan.api.resources.HaravanResource;


public abstract class APIPageable extends API {
	public APIPageable(APIAuthorization auth) { super(auth); }
	private static final String PAGE = "page";
	//private static final String 
	
	private static final int DEFAULT_PAGE_SIZE = 50;
	
	private int pageSize = DEFAULT_PAGE_SIZE;
	
	public int getPageCount() {
		return -1;
	}
	
	public ArrayList<HaravanResource> resourcesForPage(int page){
		return resourcesForPage(page, new HashMap<String, String>());
	}
	
	public ArrayList<HaravanResource> resourcesForPage(int page, HashMap<String, String> additionalParams){
		//additionalParams.put(key, value)
		return null;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
