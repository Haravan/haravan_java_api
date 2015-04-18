package com.haravan.api.resources.json;

import com.haravan.api.test.mocks.MyHaravanResource;
import com.haravan.assets.AssetLoader;

import android.test.InstrumentationTestCase;
import android.util.Log;

public class HaravanRequestWriterTest extends InstrumentationTestCase {
	private static String DIR = "fixtures/myharavanresources/";
	
	public void setUp() throws Exception {
		super.setUp();
		AssetLoader.instrumentation = getInstrumentation();
	}
	
	public void testRequestWriterOutput() throws Exception{
		MyHaravanResource res = new MyHaravanResource();
		res.setA("gaz");

		String result = res.toString();
		Log.d("RAWR!!!!!", result);

		String expected = AssetLoader.loadAsset(DIR, "expectedMyHaravanRequest.json").replaceAll("\\s+", "");
		assertEquals(expected, result);
	}
}
