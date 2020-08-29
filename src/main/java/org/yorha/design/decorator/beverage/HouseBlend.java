package org.yorha.design.decorator.beverage;

/**
 * 浓缩咖啡
 *
 * @author 15608
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return .89;
	}
}
