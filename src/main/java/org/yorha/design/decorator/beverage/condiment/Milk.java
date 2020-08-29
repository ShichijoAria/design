package org.yorha.design.decorator.beverage.condiment;

import org.yorha.design.decorator.beverage.Beverage;

/**
 * @author 15608
 */
public class Milk extends CondimentDecorator {

	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return 1.20 + beverage.cost();
	}
}
