package com.haravan.api.test.mocks;

import org.codehaus.jackson.annotate.JsonProperty;

import com.haravan.api.resources.HaravanResource;

public class MyHaravanResource extends HaravanResource {
	@JsonProperty("a")
	public String getA() { return (String)getAttribute("a"); }
	@JsonProperty("a")
	public void setA(String newA) { setAttribute("a", newA); }
}
