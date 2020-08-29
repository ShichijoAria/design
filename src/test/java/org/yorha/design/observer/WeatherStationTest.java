package org.yorha.design.observer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WeatherStationTest {

	@Test
	public void test() {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(0f, 1f, 2f);
		weatherData.setMeasurements(786587f, 3f, 2f);
	}

}
