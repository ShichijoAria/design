package org.yorha.design.decorator.beverage;

/**
 * 浓缩咖啡
 *
 * @author 15608
 */
public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		return 2.99;
	}
}
