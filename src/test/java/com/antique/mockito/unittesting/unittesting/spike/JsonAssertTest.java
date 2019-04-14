package com.antique.mockito.unittesting.unittesting.spike;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {
	
	String actual = "{\"quantity\":100,\"price\":10,\"name\":\"Ball\",\"id\":1}";
	@Test
	public void jsonAssert_strictTrue() throws JSONException {
		String expected = "{\"quantity\":100,\"price\": 10,\"name\":\"Ball\",\"id\":1}";
		JSONAssert.assertEquals(expected , actual, true);
	}
	
	@Test
	public void jsonAssert_strictFalse() throws JSONException {
		String expected = "{\"quantity\":100,\"name\":\"Ball\",\"id\":1}";
		JSONAssert.assertEquals(expected , actual, false);
	}
	
	@Test
	public void jsonAssert_withoutEscapeCharacter() throws JSONException {
		String expected = "{quantity:100,price: 10,name:Ball,id:1}";
		JSONAssert.assertEquals(expected , actual, true);
	}

}
