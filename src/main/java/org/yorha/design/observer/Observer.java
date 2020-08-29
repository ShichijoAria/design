package org.yorha.design.observer;

/**
 * 观察者
 */
public interface Observer {
	/**
	 * 当气象观测值发生改变时，将以下值传递给观察者
	 *
	 * @param: temp
	 * @param: humidity
	 * @param: pressure
	 */
	void update(float temp,float humidity,float pressure);

}
