/**
 * Copyright 2012 J. Miguel P. Tavares
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package org.bitpipeline.lib.owm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.json.JSONException;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 * 
 * @author mtavares */
public class CurrentWeatherTest {

	private HttpClient createHttpClientThatRespondsWith (final String response) throws HttpException, IOException {
		HttpClient mockHttpClient = mock (HttpClient.class);
		when (mockHttpClient.executeMethod (any (HttpMethod.class))).then (new Answer<Integer>() {
			@Override
			public Integer answer (InvocationOnMock invocation) throws Throwable {
				GetMethod getMethod = (GetMethod) invocation.getArguments ()[0];
				Method setResponseStream = HttpMethodBase.class.getDeclaredMethod ("setResponseStream", InputStream.class);
				setResponseStream.setAccessible (true);
				setResponseStream.invoke (getMethod, new ByteArrayInputStream (response.getBytes ()));
				return HttpStatus.SC_OK;
			}
		});
		return mockHttpClient;
	}

	private static void assertWeatherData (WeatherData weatherData) {
		assertNotNull (weatherData);
		assertNotNull (weatherData.getName ());
		assertFalse (weatherData.getId () == Long.MIN_VALUE);
		assertFalse (weatherData.getDateTime () == Long.MIN_VALUE);
		assertTrue (weatherData.hasMain ());
	}

	private static void assertWeatherDataList (List<WeatherData> weatherDataList, int maxData) {
		assertNotNull (weatherDataList);
		assertTrue (weatherDataList.size () <= maxData);
		for (WeatherData weatherData : weatherDataList) {
			CurrentWeatherTest.assertWeatherData (weatherData);
		}
	}

	@Test
	public void testCurrentWeatherAroundPoint () throws HttpException, IOException, JSONException {
		HttpClient mockHttpClient = createHttpClientThatRespondsWith (TestData.CURRENT_WEATHER_AROUND_POINT);
		OwmClient owm = new OwmClient (mockHttpClient, new SysErrLog ());
		List<WeatherData> weatherDataList = owm.currentWeatherAroundPoint (55f, 37f, 10);
		CurrentWeatherTest.assertWeatherDataList (weatherDataList, 10);
	}

	@Test
	public void testCurrentWeatherAroundCity () throws HttpException, IOException, JSONException {
		HttpClient mockHttpClient = createHttpClientThatRespondsWith (TestData.CURRENT_WEATHER_AROUND_CITY);
		OwmClient owm = new OwmClient (mockHttpClient, new SysErrLog ());
		List<WeatherData> weatherDataList = owm.currentWeatherAtCity (55f, 37f, 10);
		CurrentWeatherTest.assertWeatherDataList (weatherDataList, 10);
	}

	@Test
	public void testCurrentWeatherInBoundingBox () throws HttpException, IOException, JSONException {
		HttpClient mockHttpClient = createHttpClientThatRespondsWith (TestData.CURRENT_WEATHER_IN_BBOX);
		OwmClient owm = new OwmClient (mockHttpClient, new SysErrLog ());
		List<WeatherData> weatherDataList = owm.currentWeatherInBoundingBox (12f, 32f, 15f, 37f);
		CurrentWeatherTest.assertWeatherDataList (weatherDataList, Integer.MAX_VALUE);
	}

	@Test
	public void testCurrentWeatherAtCityBoundingBox () throws HttpException, IOException, JSONException {
		HttpClient mockHttpClient = createHttpClientThatRespondsWith (TestData.CURRENT_WEATHER_IN_CITY_BBOX);
		OwmClient owm = new OwmClient (mockHttpClient, new SysErrLog ());
		List<WeatherData> weatherDataList = owm.currentWeatherAtCityBoundingBox (12f, 32f, 15f, 37f);
		CurrentWeatherTest.assertWeatherDataList (weatherDataList, Integer.MAX_VALUE);
	}

	@Test
	public void testCurrentWeatherInCircle () throws HttpException, IOException, JSONException {
		HttpClient mockHttpClient = createHttpClientThatRespondsWith (TestData.CURRENT_WEATHER_IN_CIRCLE);
		OwmClient owm = new OwmClient (mockHttpClient, new SysErrLog ());
		List<WeatherData> weatherDataList = owm.currentWeatherInCircle (55.5f, 37.5f, 40f);
		CurrentWeatherTest.assertWeatherDataList (weatherDataList, Integer.MAX_VALUE);
	}

	@Test
	public void testCurrentWeatherAtCityInCircle () throws HttpException, IOException, JSONException {
		HttpClient mockHttpClient = createHttpClientThatRespondsWith (TestData.CURRENT_WEATHER_IN_CIRCLE);
		OwmClient owm = new OwmClient (mockHttpClient, new SysErrLog ());
		List<WeatherData> weatherDataList = owm.currentWeatherAtCityCircle (55.5f, 37.5f, 40f);
		CurrentWeatherTest.assertWeatherDataList (weatherDataList, Integer.MAX_VALUE);
	}

	@Test
	public void testCurrentWeatherAtCityId () throws HttpException, IOException, JSONException {
		HttpClient mockHttpClient = createHttpClientThatRespondsWith (TestData.CURRENT_WEATHER_AT_CITY_MOSKOW);
		OwmClient owm = new OwmClient (mockHttpClient, new SysErrLog ());
		WeatherData weatherData = owm.currentWeatherAtCity (524901);
		CurrentWeatherTest.assertWeatherData (weatherData);
		assertEquals ("Moscow", weatherData.getName ());
	}
}
