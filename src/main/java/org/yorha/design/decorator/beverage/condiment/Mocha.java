package org.yorha.design.decorator.beverage.condiment;

import org.yorha.design.decorator.beverage.Beverage;

/**
 * @author 15608
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}
}
