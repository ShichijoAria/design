package org.yorha.design.decorator.beverage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yorha.design.decorator.beverage.condiment.Mocha;
import org.yorha.design.decorator.beverage.condiment.Soy;
import org.yorha.design.decorator.beverage.condiment.Whip;

/**
 * @author 15608
 */
public class StarbuzzCoffee {

	private static final Logger logger = LoggerFactory.getLogger(StarbuzzCoffee.class);

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		logger.info("{}${}",beverage.getDescription(),beverage.cost());

		Beverage beverage1 = new DarkRoast();
		beverage1 = new Mocha(beverage1);
		beverage1 = new Mocha(beverage1);
		beverage1 = new Whip(beverage1);
		logger.info("{}${}",beverage1.getDescription(),beverage1.cost());

		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		logger.info("{}${}",beverage2.getDescription(),beverage2.cost());
	}

}
