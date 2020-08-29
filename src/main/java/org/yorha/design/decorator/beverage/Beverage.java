package org.yorha.design.decorator.beverage;


/**
 * 饮料
 *
 * @author 15608
 */
public abstract class Beverage {

	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	/**
	 * 饮料的价格
	 *
	 * @return cost
	 */
	public abstract double cost();
}
