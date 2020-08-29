package org.yorha.design.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	//记录观察者
	private List<Observer> observers;
	//温度
	private float temperature;
	//湿度
	private float humidity;
	//气压
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		observers.stream().forEach(observer -> observer.update(temperature, humidity, pressure));
	}

	public void measurementsChanged() {
		this.notifyObserver();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}
}
