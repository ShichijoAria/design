package org.yorha.design.decorator.beverage.condiment;

import org.yorha.design.decorator.beverage.Beverage;

/**
 * @author 15608
 */
public class Whip extends CondimentDecorator {

	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 3.20 + beverage.cost();
	}
}
