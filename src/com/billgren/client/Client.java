package com.billgren.client;

import com.billgren.factory.AbstractFactory;
import com.billgren.factory.ConcreteFactory1;
import com.billgren.factory.ConcreteFactory2;
import com.billgren.product.AbstractProductA;
import com.billgren.product.AbstractProductB;

public class Client {
	
	public static void main(String[] args) {
		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractFactory factory2 = new ConcreteFactory2();
		
		AbstractProductA a1 = factory1.createProductA();
		AbstractProductA a2 = factory2.createProductA();
		AbstractProductB b1 = factory1.createProductB();
		AbstractProductB b2 = factory2.createProductB();
		
	}
	

	
	
	 

}
