package org.yorha.design.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	//温度
	private float temperature;
	//湿度
	private float humidity;
	//气压
	private Subject subject;

	public CurrentConditionsDisplay(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "fF degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = pressure;
		display();
	}
}
