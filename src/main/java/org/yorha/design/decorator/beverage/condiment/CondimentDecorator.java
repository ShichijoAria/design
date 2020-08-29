package org.yorha.design.decorator.beverage.condiment;

import org.yorha.design.decorator.beverage.Beverage;

/**
 * 调料
 *
 * @author 15608
 */
public abstract class CondimentDecorator extends Beverage {

	/**
	 * 饮料的描述
	 *
	 * @return
	 */
	@Override
	public abstract String getDescription();

	@Override
	public double cost() {
		return 0;
	}
}
