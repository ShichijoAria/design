package org.yorha.design.decorator.beverage.condiment;

import org.yorha.design.decorator.beverage.Beverage;

/**
 * @author 15608
 */
public class Soy extends CondimentDecorator {

	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return 2.20 + beverage.cost();
	}
}
