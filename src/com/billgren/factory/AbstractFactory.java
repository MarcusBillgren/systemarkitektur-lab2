package com.billgren.factory;

import com.billgren.product.AbstractProductA;
import com.billgren.product.AbstractProductB;

public abstract class AbstractFactory {
	
	public abstract AbstractProductA createProductA();
	public abstract AbstractProductB createProductB();

}
