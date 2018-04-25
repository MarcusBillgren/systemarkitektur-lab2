package com.billgren.factory;

import com.billgren.product.AbstractProductA;
import com.billgren.product.AbstractProductB;
import com.billgren.product.ProductA2;
import com.billgren.product.ProductB2;

public class ConcreteFactory2 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		System.out.println("Product A2 created!");
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		System.out.println("Product B2 created!");
		return new ProductB2();
	}



}
