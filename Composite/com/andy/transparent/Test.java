package com.andy.transparent;

public class Test {

	public static void main(String[] args) {
		AComponent root = new Composite("root");
		
		AComponent c1 = new Composite("c1");
		
		AComponent c2 = new Composite("c2");
		
		AComponent l1 = new Leaf("l1");
		
		AComponent l2 = new Leaf("l2");
		
		AComponent l3 = new Leaf("l3");
		
		root.addChild(c1);
		root.addChild(c2);
		root.addChild(l1);
		c1.addChild(l2);
		c2.addChild(l3);
		
		root.printStruct(" ");
		
	}

}
