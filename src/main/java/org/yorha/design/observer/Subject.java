package org.yorha.design.observer;

/**
 * 主题
 */
public interface Subject {

	/**
	 * 注册观察者
	 *
	 * @param: observer
	 */
	void registerObserver(Observer observer);

	/**
	 * 移除观察者
	 *
	 * @param: observer
	 */
	void removeObserver(Observer observer);

	/**
	 * 当观测值改变时，调用此方法，通知所有观察者
	 */
	void notifyObserver();

}
