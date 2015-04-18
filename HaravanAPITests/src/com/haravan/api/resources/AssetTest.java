package com.haravan.api.resources;

import com.haravan.assets.AssetLoader;

public class AssetTest extends FixturesTestCase {
	
	public void testReadingInSingleAsset() {
		String singleAsset = AssetLoader.loadAsset(fixturesDir, "Asset/singleAsset.json");
		
		Asset result = reader.read(singleAsset, Asset.class).get(0);
		{
			assertEquals("2010-07-12T15:31:50-04:00", result.getCreatedAt());
			assertEquals("2010-07-12T15:31:50-04:00", result.getUpdatedAt());
			assertEquals(null, result.getPublicUrl());
			assertTrue(result.getValue().startsWith("<!-- LIST 3 PER ROW -->"));
			assertEquals("templates/index.liquid", result.getKey());
		}
	}

}
