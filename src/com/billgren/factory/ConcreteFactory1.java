package com.billgren.factory;

import com.billgren.product.AbstractProductA;
import com.billgren.product.AbstractProductB;
import com.billgren.product.ProductA1;
import com.billgren.product.ProductB1;

public class ConcreteFactory1 extends AbstractFactory{

	@Override
	public AbstractProductA createProductA() {
		System.out.println("Product A1 created!");
		return new ProductA1();
			
	}

	@Override
	public AbstractProductB createProductB() {
		System.out.println("Product B1 created!");
		return new ProductB1();
	}



}
