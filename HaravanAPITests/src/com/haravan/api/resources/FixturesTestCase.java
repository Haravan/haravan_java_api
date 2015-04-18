package com.haravan.api.resources;

import com.haravan.api.resources.json.HaravanRequestWriter;
import com.haravan.api.resources.json.HaravanResponseReader;
import com.haravan.assets.AssetLoader;

import android.test.InstrumentationTestCase;

public class FixturesTestCase extends InstrumentationTestCase {
	protected String fixturesDir = "fixtures/";
	protected HaravanResponseReader reader;
	protected HaravanRequestWriter  writer;
	
	public void setUp() throws Exception {
		super.setUp();
		AssetLoader.instrumentation = getInstrumentation();
		reader = new HaravanResponseReader();
		writer = new HaravanRequestWriter();
	}

}
