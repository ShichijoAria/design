package org.yorha.design.decorator.beverage;

/**
 * 浓缩咖啡
 *
 * @author 15608
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
