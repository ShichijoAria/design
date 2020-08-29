package org.yorha.design.decorator.beverage;

/**
 * 浓缩咖啡
 *
 * @author 15608
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public double cost() {
		return 3.99;
	}
}
