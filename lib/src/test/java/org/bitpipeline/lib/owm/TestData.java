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

public class TestData {
	static final String CURRENT_WEATHER_CITY = "{\n" + 
			"	\"id\": 7325,\n" + 
			"	\"dt\": 1359979200,\n" + 
			"	\"name\": \"UUMO\",\n" + 
			"	\"type\": 1,\n" + 
			"	\"coord\": {\n" + 
			"		\"lat\": 55.5,\n" + 
			"		\"lon\": 37.5\n" + 
			"	},\n" + 
			"	\"distance\": 63.995,\n" + 
			"	\"main\": {\n" + 
			"		\"temp\": 272.15,\n" + 
			"		\"humidity\": 100\n" + 
			"	},\n" + 
			"	\"wind\": {\n" + 
			"		\"speed\": 7,\n" + 
			"		\"deg\": 340\n" + 
			"	},\n" + 
			"	\"rang\": 50,\n" + 
			"	\"clouds\": [\n" + 
			"		{\n" + 
			"			\"distance\": 91,\n" + 
			"			\"condition\": \"BKN\"\n" + 
			"		},\n" + 
			"		{\n" + 
			"			\"distance\": 305,\n" + 
			"			\"condition\": \"OVC\",\n" + 
			"			\"cumulus\": \"CB\"\n" + 
			"		}\n" + 
			"	]\n" + 
			"}\n" + 
			""; 

	static String CURRENT_WEATHER_POINT = "        {\n" + 
			"            \"id\": 5106529,\n" + 
			"            \"name\": \"Woodbridge\",\n" + 
			"            \"coord\": {\n" + 
			"                \"lon\": -74.284592,\n" + 
			"                \"lat\": 40.557598\n" + 
			"            },\n" + 
			"            \"distance\": 0.814,\n" + 
			"            \"main\": {\n" + 
			"                \"temp\": 267.97,\n" + 
			"                \"pressure\": 1026,\n" + 
			"                \"humidity\": 45,\n" + 
			"                \"temp_min\": 267.15,\n" + 
			"                \"temp_max\": 269.15\n" + 
			"            },\n" + 
			"            \"dt\": 1359818400,\n" + 
			"            \"wind\": {\n" + 
			"                \"speed\": 3.1,\n" + 
			"                \"deg\": 260\n" + 
			"            },\n" + 
			"            \"clouds\": {\n" + 
			"                \"all\": 40\n" + 
			"            },\n" + 
			"            \"weather\": [\n" + 
			"                {\n" + 
			"                    \"id\": 802,\n" + 
			"                    \"main\": \"Clouds\",\n" + 
			"                    \"description\": \"scattered clouds\",\n" + 
			"                    \"icon\": \"03d\"\n" + 
			"                }\n" + 
			"            ]\n" + 
			"        }";

	static final public String CURRENT_WEATHER_AROUND_POINT = "{\"message\":\"\",\"cod\":\"200\",\"calctime\":\"\",\"cnt\":8,\"list\":[{\"id\":7325,\"dt\":1360074600,\"name\":\"UUMO\",\"type\":1,\"coord\":{\"lat\":55.5,\"lon\":37.5},\"distance\":63.995,\"main\":{\"temp\":271.15,\"pressure\":1001,\"humidity\":92},\"wind\":{\"speed\":3,\"deg\":180},\"rang\":50,\"clouds\":[{\"distance\":396,\"condition\":\"BKN\",\"cumulus\":\"CB\"},{\"distance\":1219,\"condition\":\"BKN\"}]},{\"id\":37653,\"dt\":1360078209,\"name\":\"UUWW\",\"type\":2,\"coord\":{\"lat\":55.5862,\"lon\":37.2445},\"distance\":66.995,\"main\":{\"temp\":270.37,\"pressure\":1000,\"humidity\":93},\"wind\":{\"speed\":4.63,\"deg\":158},\"rang\":0},{\"id\":7329,\"dt\":1360074600,\"name\":\"UUWW\",\"type\":1,\"coord\":{\"lat\":55.5915,\"lon\":37.2615},\"distance\":67.823,\"main\":{\"temp\":270.15,\"pressure\":1000,\"humidity\":92},\"wind\":{\"speed\":5,\"deg\":160},\"rang\":50,\"clouds\":[{\"distance\":244,\"condition\":\"BKN\"},{\"distance\":640,\"condition\":\"OVC\",\"cumulus\":\"CB\"}]},{\"id\":37768,\"dt\":1360078022,\"name\":\"UUDD\",\"type\":2,\"coord\":{\"lat\":55.4,\"lon\":37.9167},\"distance\":73.228,\"main\":{\"temp\":270.37,\"pressure\":1001,\"humidity\":99},\"wind\":{\"speed\":5.65,\"deg\":180},\"rang\":30},{\"id\":7322,\"dt\":1360074600,\"name\":\"UUDD\",\"type\":1,\"coord\":{\"lat\":55.4088,\"lon\":37.9063},\"distance\":73.303,\"main\":{\"temp\":270.15,\"pressure\":1001,\"humidity\":100},\"wind\":{\"speed\":5,\"deg\":170},\"rang\":50,\"rain\":{\"6h\":1},\"clouds\":[{\"distance\":488,\"condition\":\"BKN\"},{\"distance\":3048,\"condition\":\"OVC\"}]},{\"id\":43600,\"dt\":1360078337,\"name\":\"ankuch\",\"type\":5,\"coord\":{\"lat\":55.5522,\"lon\":37.7078},\"distance\":76.026,\"main\":{\"temp\":298.95,\"pressure\":980.9,\"humidity\":41},\"rang\":20},{\"id\":45148,\"dt\":1360078201,\"name\":\"EvgeshaS\",\"type\":5,\"coord\":{\"lat\":55.6567,\"lon\":37.5711},\"distance\":81.468,\"main\":{\"temp\":273.15},\"rang\":20},{\"id\":39277,\"dt\":1360078310,\"name\":\"st2340\",\"type\":5,\"coord\":{\"lat\":55.5966,\"lon\":38.1115},\"distance\":96.702,\"main\":{\"temp\":270.75},\"rang\":30}]}";
	static final public String CURRENT_WEATHER_AROUND_CITY = "{\"message\":\"\",\"cod\":\"200\",\"calctime\":\"\",\"cnt\":10,\"list\":[{\"id\":6730265,\"name\":\"Obolensk\",\"coord\":{\"lon\":37.224483,\"lat\":54.977409},\"distance\":14.54,\"main\":{\"temp\":270.73,\"temp_min\":270.25,\"temp_max\":270.75,\"pressure\":994.42,\"humidity\":95.3},\"dt\":1360077964,\"wind\":{\"speed\":4.35,\"deg\":198,\"gust\":11.9},\"clouds\":{\"all\":92},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":541235,\"name\":\"Kremenki\",\"coord\":{\"lon\":37.12611,\"lat\":54.884998},\"distance\":15.113,\"main\":{\"temp\":270.73,\"temp_min\":270.25,\"temp_max\":270.75,\"pressure\":994.42,\"humidity\":95.3},\"dt\":1360074546,\"wind\":{\"speed\":4.35,\"deg\":198,\"gust\":11.9},\"clouds\":{\"all\":92},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":462792,\"name\":\"Zhukovo\",\"coord\":{\"lon\":36.744019,\"lat\":55.03178},\"distance\":16.698,\"main\":{\"temp\":271.01,\"temp_min\":270.49,\"temp_max\":271.02,\"pressure\":993.77,\"humidity\":95.5},\"dt\":1360074550,\"wind\":{\"speed\":4.38,\"deg\":203,\"gust\":11.6},\"clouds\":{\"all\":99},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":504576,\"name\":\"Protvino\",\"coord\":{\"lon\":37.217781,\"lat\":54.86639},\"distance\":20.354,\"main\":{\"temp\":270.73,\"temp_min\":270.25,\"temp_max\":270.75,\"pressure\":994.42,\"humidity\":95.3},\"dt\":1360074814,\"wind\":{\"speed\":4.35,\"deg\":198,\"gust\":11.9},\"clouds\":{\"all\":92},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":577856,\"name\":\"Belousovo\",\"coord\":{\"lon\":36.673199,\"lat\":55.095001},\"distance\":23.345,\"main\":{\"temp\":271.01,\"temp_min\":270.49,\"temp_max\":271.02,\"pressure\":993.77,\"humidity\":95.5},\"dt\":1360078177,\"wind\":{\"speed\":4.38,\"deg\":203,\"gust\":11.6},\"clouds\":{\"all\":99},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":504798,\"name\":\"Proletarskiy\",\"coord\":{\"lon\":37.39019,\"lat\":55.02219},\"distance\":25.001,\"main\":{\"temp\":270.38,\"temp_min\":270.09,\"temp_max\":270.42,\"pressure\":994.09,\"humidity\":95},\"dt\":1360077820,\"wind\":{\"speed\":4.59,\"deg\":195,\"gust\":12},\"clouds\":{\"all\":89},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":516436,\"name\":\"Obninsk\",\"coord\":{\"lon\":36.610279,\"lat\":55.096943},\"distance\":27.065,\"main\":{\"temp\":271.01,\"temp_min\":270.49,\"temp_max\":271.02,\"pressure\":993.77,\"humidity\":95.5},\"dt\":1360074932,\"wind\":{\"speed\":4.38,\"deg\":203,\"gust\":11.6},\"clouds\":{\"all\":99},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":496527,\"name\":\"Serpukhov\",\"coord\":{\"lon\":37.410831,\"lat\":54.921391},\"distance\":27.646,\"main\":{\"temp\":270.38,\"temp_min\":270.09,\"temp_max\":270.42,\"pressure\":994.09,\"humidity\":95},\"dt\":1360074946,\"wind\":{\"speed\":4.59,\"deg\":195,\"gust\":12},\"clouds\":{\"all\":89},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":579529,\"name\":\"Balabanovo\",\"coord\":{\"lon\":36.660599,\"lat\":55.18161},\"distance\":29.568,\"main\":{\"temp\":271.01,\"temp_min\":270.49,\"temp_max\":271.02,\"pressure\":993.77,\"humidity\":95.5},\"dt\":1360074730,\"wind\":{\"speed\":4.38,\"deg\":203,\"gust\":11.6},\"clouds\":{\"all\":99},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":484287,\"name\":\"Tarusa\",\"coord\":{\"lon\":37.176666,\"lat\":54.723331},\"distance\":32.776,\"main\":{\"temp\":270.7,\"temp_min\":270.59,\"temp_max\":271,\"pressure\":991.49,\"humidity\":96.2},\"dt\":1360078265,\"wind\":{\"speed\":5.02,\"deg\":227,\"gust\":12},\"clouds\":{\"all\":95},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]}]}";
	static final public String CURRENT_WEATHER_IN_BBOX = "{\"message\":\"\",\"cod\":\"200\",\"calctime\":\"\",\"cnt\":2,\"list\":[{\"id\":5761,\"dt\":1360072200,\"name\":\"LICD\",\"type\":1,\"coord\":{\"lat\":35.4979,\"lon\":12.6181},\"main\":{\"temp\":287.15,\"pressure\":1019,\"humidity\":82},\"wind\":{\"speed\":6.7,\"deg\":300},\"rang\":3,\"clouds\":[{\"distance\":1494,\"condition\":\"BKN\"}]},{\"id\":6441,\"dt\":1360075800,\"name\":\"HLLT\",\"type\":1,\"coord\":{\"lat\":32.6635,\"lon\":13.159},\"main\":{\"temp\":285.15,\"pressure\":1020,\"humidity\":87},\"wind\":{\"speed\":6.2,\"deg\":290},\"rang\":50,\"clouds\":[{\"distance\":488,\"condition\":\"SCT\"},{\"distance\":762,\"condition\":\"BKN\"}]}]}";
	static final public String CURRENT_WEATHER_IN_CITY_BBOX = "{\"message\":\"\",\"cod\":\"200\",\"calctime\":\"\",\"cnt\":1,\"list\":[{\"id\":2210247,\"name\":\"Tripoli\",\"coord\":{\"lon\":13.18746,\"lat\":32.875191},\"main\":{\"temp\":285.15,\"pressure\":1020,\"humidity\":87,\"temp_min\":285.15,\"temp_max\":288.14},\"dt\":1360075800,\"wind\":{\"speed\":6.2,\"deg\":290},\"clouds\":{\"all\":75},\"weather\":[{\"id\":803,\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}]}]}";
	static final public String CURRENT_WEATHER_IN_CIRCLE = "{\"message\":\"\",\"cod\":\"200\",\"calctime\":\"\",\"cnt\":61,\"list\":[{\"id\":495260,\"name\":\"Shcherbinka\",\"coord\":{\"lon\":37.559719,\"lat\":55.499722},\"distance\":3.761,\"main\":{\"temp\":270.57,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074708,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":564517,\"name\":\"Dubrovitsy\",\"coord\":{\"lon\":37.486698,\"lat\":55.43969},\"distance\":6.758,\"main\":{\"temp\":270.51,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077302,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"},{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"}]},{\"id\":545782,\"name\":\"Kommunarka\",\"coord\":{\"lon\":37.489319,\"lat\":55.569519},\"distance\":7.759,\"main\":{\"temp\":270.55,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077889,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"},{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"}]},{\"id\":508101,\"name\":\"Podolsk\",\"coord\":{\"lon\":37.554722,\"lat\":55.424179},\"distance\":9.109,\"main\":{\"temp\":270.54,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074949,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":476372,\"name\":\"Vatutinki\",\"coord\":{\"lon\":37.3325,\"lat\":55.498333},\"distance\":10.551,\"main\":{\"temp\":270.49,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074422,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":481608,\"name\":\"Troitsk\",\"coord\":{\"lon\":37.307362,\"lat\":55.484982},\"distance\":12.249,\"main\":{\"temp\":270.49,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074422,\"wind\":{\"speed\":4,\"deg\":140},\"clouds\":{\"all\":90},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":6417535,\"name\":\"Mosrentgen\",\"coord\":{\"lon\":37.471111,\"lat\":55.618332},\"distance\":13.283,\"main\":{\"temp\":270.6,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077302,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"},{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"}]},{\"id\":857690,\"name\":\"Moskovskiy\",\"coord\":{\"lon\":37.35495,\"lat\":55.59911},\"distance\":14.307,\"main\":{\"temp\":270.44,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360071000,\"wind\":{\"speed\":4,\"deg\":140},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}]},{\"id\":473778,\"name\":\"Vidnoye\",\"coord\":{\"lon\":37.70966,\"lat\":55.552391},\"distance\":14.425,\"main\":{\"temp\":270.56,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074768,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":547560,\"name\":\"Klimovsk\",\"coord\":{\"lon\":37.525002,\"lat\":55.364723},\"distance\":15.125,\"main\":{\"temp\":270.48,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074422,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":469341,\"name\":\"Yam\",\"coord\":{\"lon\":37.749168,\"lat\":55.484444},\"distance\":15.791,\"main\":{\"temp\":270.54,\"pressure\":1001,\"humidity\":100,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077589,\"wind\":{\"speed\":5,\"deg\":170},\"rain\":{\"6h\":1},\"clouds\":{\"all\":90},\"weather\":[{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"},{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"}]},{\"id\":565381,\"name\":\"Domodedovo\",\"coord\":{\"lon\":37.758331,\"lat\":55.442223},\"distance\":17.504,\"main\":{\"temp\":270.55,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074768,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":857689,\"name\":\"Vnukovo\",\"coord\":{\"lon\":37.296108,\"lat\":55.611938},\"distance\":17.871,\"main\":{\"temp\":270.3,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360071000,\"wind\":{\"speed\":4,\"deg\":140},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}]},{\"id\":819827,\"name\":\"Razvilka\",\"coord\":{\"lon\":37.740833,\"lat\":55.591667},\"distance\":18.26,\"main\":{\"temp\":270.57,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074422,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":533008,\"name\":\"Lvovskiy\",\"coord\":{\"lon\":37.515831,\"lat\":55.314171},\"distance\":20.687,\"main\":{\"temp\":270.48,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074422,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":473021,\"name\":\"Vnukovo\",\"coord\":{\"lon\":37.219166,\"lat\":55.615002},\"distance\":21.805,\"main\":{\"temp\":270.3,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360071000,\"wind\":{\"speed\":4,\"deg\":140},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}]},{\"id\":471457,\"name\":\"Vostryakovo\",\"coord\":{\"lon\":37.811111,\"lat\":55.400555},\"distance\":22.521,\"main\":{\"temp\":270.58,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074588,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":546606,\"name\":\"Kokoshkino\",\"coord\":{\"lon\":37.169498,\"lat\":55.597691},\"distance\":23.457,\"main\":{\"temp\":270.35,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360071000,\"wind\":{\"speed\":4,\"deg\":140},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}]},{\"id\":529368,\"name\":\"Marfino\",\"coord\":{\"lon\":37.382221,\"lat\":55.702778},\"distance\":23.731,\"main\":{\"temp\":270.81,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077050,\"wind\":{\"speed\":5,\"deg\":160},\"clouds\":{\"all\":90},\"weather\":[{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"},{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"}]},{\"id\":535695,\"name\":\"Lesnoy Gorodok\",\"coord\":{\"lon\":37.208302,\"lat\":55.638931},\"distance\":23.979,\"main\":{\"temp\":270.69,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074600,\"wind\":{\"speed\":5,\"deg\":160},\"clouds\":{\"all\":90},\"weather\":[{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"},{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"}]},{\"id\":516215,\"name\":\"Odintsovo\",\"coord\":{\"lon\":37.277729,\"lat\":55.677979},\"distance\":24.223,\"main\":{\"temp\":270.8,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074888,\"wind\":{\"speed\":4,\"deg\":140},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":563705,\"name\":\"Dzerzhinskiy\",\"coord\":{\"lon\":37.846943,\"lat\":55.628613},\"distance\":26.085,\"main\":{\"temp\":270.57,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074768,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":522730,\"name\":\"Nemchinovka\",\"coord\":{\"lon\":37.36639,\"lat\":55.722778},\"distance\":26.154,\"main\":{\"temp\":270.82,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077767,\"wind\":{\"speed\":5,\"deg\":160},\"clouds\":{\"all\":90},\"weather\":[{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"},{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"}]},{\"id\":543731,\"name\":\"Kotelniki\",\"coord\":{\"lon\":37.844501,\"lat\":55.63546},\"distance\":26.382,\"main\":{\"temp\":270.57,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074648,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":581321,\"name\":\"Aprelevka\",\"coord\":{\"lon\":37.080101,\"lat\":55.551941},\"distance\":27.052,\"main\":{\"temp\":270.46,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360071000,\"wind\":{\"speed\":4,\"deg\":140},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}]},{\"id\":532657,\"name\":\"Lytkarino\",\"coord\":{\"lon\":37.905834,\"lat\":55.58139},\"distance\":27.09,\"main\":{\"temp\":270.65,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074768,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":487441,\"name\":\"Stolbovaya\",\"coord\":{\"lon\":37.485279,\"lat\":55.252777},\"distance\":27.506,\"main\":{\"temp\":270.57,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077302,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"},{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"}]},{\"id\":532477,\"name\":\"Lyubuchany\",\"coord\":{\"lon\":37.545555,\"lat\":55.25111},\"distance\":27.825,\"main\":{\"temp\":270.56,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077302,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"},{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"}]},{\"id\":524901,\"name\":\"Moscow\",\"coord\":{\"lon\":37.615555,\"lat\":55.75222},\"distance\":28.969,\"main\":{\"temp\":270.83,\"pressure\":1000,\"humidity\":86,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360076987,\"wind\":{\"speed\":3,\"deg\":170},\"clouds\":{\"all\":90},\"weather\":[{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":469533,\"name\":\"Yakovlevskoye\",\"coord\":{\"lon\":37.950558,\"lat\":55.441944},\"distance\":29.122,\"main\":{\"temp\":270.54,\"pressure\":1001,\"humidity\":100,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077827,\"wind\":{\"speed\":5,\"deg\":170},\"rain\":{\"6h\":1},\"clouds\":{\"all\":90},\"weather\":[{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":577551,\"name\":\"Belyye Stolby\",\"coord\":{\"lon\":37.854,\"lat\":55.33136},\"distance\":29.169,\"main\":{\"temp\":270.56,\"pressure\":1001,\"humidity\":100,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077889,\"wind\":{\"speed\":5,\"deg\":170},\"rain\":{\"6h\":1},\"clouds\":{\"all\":90},\"weather\":[{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":463465,\"name\":\"Zhavoronki\",\"coord\":{\"lon\":37.104168,\"lat\":55.649723},\"distance\":29.939,\"main\":{\"temp\":270.43,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074600,\"wind\":{\"speed\":5,\"deg\":160},\"clouds\":{\"all\":90},\"weather\":[{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":578953,\"name\":\"Barvikha\",\"coord\":{\"lon\":37.27,\"lat\":55.740002},\"distance\":30.344,\"main\":{\"temp\":270.82,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077767,\"wind\":{\"speed\":5,\"deg\":160},\"clouds\":{\"all\":90},\"weather\":[{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":6417459,\"name\":\"Krasnoznamensk\",\"coord\":{\"lon\":37.038609,\"lat\":55.599442},\"distance\":31.057,\"main\":{\"temp\":270.46,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360071000,\"wind\":{\"speed\":4,\"deg\":140},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}]},{\"id\":532615,\"name\":\"Lyubertsy\",\"coord\":{\"lon\":37.883331,\"lat\":55.677776},\"distance\":31.161,\"main\":{\"temp\":270.64,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074949,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":857691,\"name\":\"Zhitnevo\",\"coord\":{\"lon\":37.914639,\"lat\":55.342331},\"distance\":31.497,\"main\":{\"temp\":270.55,\"pressure\":1001,\"humidity\":100,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077589,\"wind\":{\"speed\":5,\"deg\":170},\"rain\":{\"6h\":1},\"clouds\":{\"all\":90},\"weather\":[{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":482260,\"name\":\"Tomilino\",\"coord\":{\"lon\":37.925278,\"lat\":55.655277},\"distance\":31.823,\"main\":{\"temp\":270.66,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074708,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":515873,\"name\":\"Oktyabrskiy\",\"coord\":{\"lon\":37.977379,\"lat\":55.608059},\"distance\":32.34,\"main\":{\"temp\":270.65,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074470,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":514042,\"name\":\"Ostrovtsy\",\"coord\":{\"lon\":37.99361,\"lat\":55.593887},\"distance\":32.759,\"main\":{\"temp\":270.62,\"pressure\":1001,\"humidity\":100,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077710,\"wind\":{\"speed\":5,\"deg\":170},\"rain\":{\"6h\":1},\"clouds\":{\"all\":90},\"weather\":[{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":559853,\"name\":\"Gorki Vtoryye\",\"coord\":{\"lon\":37.163502,\"lat\":55.725651},\"distance\":32.805,\"main\":{\"temp\":270.81,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077050,\"wind\":{\"speed\":5,\"deg\":160},\"clouds\":{\"all\":90},\"weather\":[{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":497534,\"name\":\"Selyatino\",\"coord\":{\"lon\":36.977459,\"lat\":55.515141},\"distance\":32.947,\"main\":{\"temp\":270.53,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360071000,\"wind\":{\"speed\":4,\"deg\":140},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}]},{\"id\":500843,\"name\":\"Rublevo\",\"coord\":{\"lon\":37.355831,\"lat\":55.785557},\"distance\":33.016,\"main\":{\"temp\":270.84,\"pressure\":1000,\"humidity\":79,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074168,\"wind\":{\"speed\":3,\"deg\":160},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":522839,\"name\":\"Nekrasovka\",\"coord\":{\"lon\":37.91148,\"lat\":55.693279},\"distance\":33.619,\"main\":{\"temp\":270.67,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074349,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":509998,\"name\":\"Petrovo-Dalneye\",\"coord\":{\"lon\":37.18111,\"lat\":55.746113},\"distance\":33.908,\"main\":{\"temp\":270.82,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077050,\"wind\":{\"speed\":5,\"deg\":160},\"clouds\":{\"all\":90},\"weather\":[{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":580994,\"name\":\"Arkhangelskoye\",\"coord\":{\"lon\":37.299839,\"lat\":55.78791},\"distance\":34.39,\"main\":{\"temp\":270.83,\"pressure\":1000,\"humidity\":86,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077050,\"wind\":{\"speed\":3,\"deg\":170},\"clouds\":{\"all\":90},\"weather\":[{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":479640,\"name\":\"Udelnaya\",\"coord\":{\"lon\":38.002838,\"lat\":55.625359},\"distance\":34.555,\"main\":{\"temp\":270.66,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074470,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":560756,\"name\":\"Golitsyno\",\"coord\":{\"lon\":36.983334,\"lat\":55.612221},\"distance\":34.808,\"main\":{\"temp\":270.49,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360071000,\"wind\":{\"speed\":4,\"deg\":140},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}]},{\"id\":542841,\"name\":\"Kraskovo\",\"coord\":{\"lon\":37.987782,\"lat\":55.649719},\"distance\":34.891,\"main\":{\"temp\":270.66,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074470,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":573922,\"name\":\"Bolshiye Vyazemy\",\"coord\":{\"lon\":36.983334,\"lat\":55.633331},\"distance\":35.708,\"main\":{\"temp\":270.49,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074600,\"wind\":{\"speed\":5,\"deg\":160},\"clouds\":{\"all\":90},\"weather\":[{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":578940,\"name\":\"Barybino\",\"coord\":{\"lon\":37.89333,\"lat\":55.267681},\"distance\":35.842,\"main\":{\"temp\":270.58,\"pressure\":1001,\"humidity\":100,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077710,\"wind\":{\"speed\":5,\"deg\":170},\"rain\":{\"6h\":1},\"clouds\":{\"all\":90},\"weather\":[{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":475700,\"name\":\"Vereya\",\"coord\":{\"lon\":38.039169,\"lat\":55.614719},\"distance\":36.228,\"main\":{\"temp\":270.62,\"pressure\":1001,\"humidity\":100,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077710,\"wind\":{\"speed\":5,\"deg\":170},\"rain\":{\"6h\":1},\"clouds\":{\"all\":90},\"weather\":[{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":502018,\"name\":\"Reutov\",\"coord\":{\"lon\":37.861668,\"lat\":55.759445},\"distance\":36.711,\"main\":{\"temp\":270.85,\"pressure\":1000,\"humidity\":79,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074889,\"wind\":{\"speed\":3,\"deg\":160},\"clouds\":{\"all\":90},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":531820,\"name\":\"Malakhovka\",\"coord\":{\"lon\":38.02486,\"lat\":55.647758},\"distance\":36.859,\"main\":{\"temp\":270.66,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074648,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":544904,\"name\":\"Korenevo\",\"coord\":{\"lon\":38.007778,\"lat\":55.67194},\"distance\":37.2,\"main\":{\"temp\":270.66,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074349,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":542374,\"name\":\"Krasnogorsk\",\"coord\":{\"lon\":37.318054,\"lat\":55.822498},\"distance\":37.632,\"main\":{\"temp\":270.84,\"pressure\":1000,\"humidity\":79,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074888,\"wind\":{\"speed\":3,\"deg\":160},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":6697077,\"name\":\"Kievskij\",\"coord\":{\"lon\":36.89827,\"lat\":55.436417},\"distance\":38.582,\"main\":{\"temp\":270.58,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360071000,\"wind\":{\"speed\":4,\"deg\":140},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}]},{\"id\":521821,\"name\":\"Nikolina Gora\",\"coord\":{\"lon\":37.041389,\"lat\":55.734444},\"distance\":38.845,\"main\":{\"temp\":270.82,\"pressure\":1000,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074168,\"wind\":{\"speed\":4,\"deg\":140},\"clouds\":{\"all\":90},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}]},{\"id\":501732,\"name\":\"Rodniki\",\"coord\":{\"lon\":38.066849,\"lat\":55.652039},\"distance\":39.439,\"main\":{\"temp\":270.63,\"pressure\":1001,\"humidity\":100,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077710,\"wind\":{\"speed\":5,\"deg\":170},\"rain\":{\"6h\":1},\"clouds\":{\"all\":90},\"weather\":[{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":570298,\"name\":\"Bykovo\",\"coord\":{\"lon\":38.080269,\"lat\":55.636139},\"distance\":39.499,\"main\":{\"temp\":270.66,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360074422,\"wind\":{\"speed\":4,\"deg\":180},\"rain\":{\"6h\":1},\"clouds\":{\"all\":75},\"weather\":[{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":515186,\"name\":\"Opalikha\",\"coord\":{\"lon\":37.255001,\"lat\":55.827499},\"distance\":39.525,\"main\":{\"temp\":270.84,\"pressure\":1000,\"humidity\":86,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360077767,\"wind\":{\"speed\":3,\"deg\":170},\"clouds\":{\"all\":90},\"weather\":[{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}]},{\"id\":569591,\"name\":\"Chekhov\",\"coord\":{\"lon\":37.471111,\"lat\":55.143055},\"distance\":39.733,\"main\":{\"temp\":271.15,\"pressure\":1001,\"humidity\":92,\"temp_min\":270.09,\"temp_max\":271.15},\"dt\":1360071000,\"wind\":{\"speed\":3,\"deg\":180},\"clouds\":{\"all\":75},\"weather\":[{\"id\":803,\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}]}]}";
	static final public String CURRENT_WEATHER_AT_CITY_MOSKOW = "{\"id\":524901,\"coord\":{\"lat\":55.75222,\"lon\":37.615555},\"name\":\"Moscow\",\"main\":{\"temp\":270.83,\"pressure\":1000,\"humidity\":86,\"temp_min\":270.15,\"temp_max\":271.15},\"dt\":1360076987,\"date\":\"2013-02-05 15:09:47\",\"wind\":{\"speed\":3,\"deg\":170},\"clouds\":{\"all\":90},\"weather\":[{\"id\":602,\"main\":\"Snow\",\"description\":\"heavy snow\",\"icon\":\"13n\"},{\"id\":621,\"main\":\"Snow\",\"description\":\"shower snow\",\"icon\":\"13n\"},{\"id\":622,\"main\":\"Snow\",\"description\":\"heavy shower snow\",\"icon\":\"13n\"}],\"sys\":{\"id\":7323,\"country\":\"RU\"},\"url\":\"http:\\/\\/openweathermap.org\\/city\\/524901\",\"cod\":200}";
}
