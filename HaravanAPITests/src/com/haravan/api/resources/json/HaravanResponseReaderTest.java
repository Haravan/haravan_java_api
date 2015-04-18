package com.haravan.api.resources.json;

import java.io.StringReader;
import java.util.List;

import android.test.InstrumentationTestCase;

import com.haravan.api.test.mocks.MyHaravanResource;
import com.haravan.assets.AssetLoader;

public class HaravanResponseReaderTest extends InstrumentationTestCase {
	private HaravanResponseReader reader;
	private static String DIR = "fixtures/myharavanresources/"; 
	
	
	public void setUp() throws Exception {
		super.setUp();
		AssetLoader.instrumentation = getInstrumentation();
		reader = new HaravanResponseReader();
	}
	
	public void testResponseReaderReadsOne() {
		StringReader data = new StringReader(AssetLoader.loadAsset(DIR, "myHaravanResource.json"));
		List<MyHaravanResource> myResources = reader.read(data, MyHaravanResource.class);
		
		assertEquals(1, myResources.size());
		
		MyHaravanResource res = myResources.get(0);
		{
			assertEquals("foo", res.getA());
		}
	}
	
	public void testResponseReaderReadsAll() {
		StringReader data = new StringReader(AssetLoader.loadAsset(DIR, "severalHaravanResources.json"));
		List<MyHaravanResource> myResources = reader.read(data, MyHaravanResource.class);
		
		assertEquals(3, myResources.size());
		for(MyHaravanResource res : myResources) {
			switch(res.getId()) {
			case 1:
				assertEquals("foo", res.getA());
				break;
			case 2:
				assertEquals("bar", res.getA());
				break;
			case 3:
				assertEquals("baz", res.getA());
				break;
			default:
				fail("Encountered unexpected resource: " + res.getId());
			}
		}
	}
	
	public void testReturnsEmptyArrayOnEmptyInput() {
		List<MyHaravanResource> myResources = reader.read("", MyHaravanResource.class);
		
		assertEquals(0, myResources.size());
	}
	
}
