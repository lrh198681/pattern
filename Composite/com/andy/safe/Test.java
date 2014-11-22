package com.andy.safe;

public class Test {

	public static void main(String[] args) {
		Composite root = new Composite("root");
		
		Composite c1 = new Composite("c1");
		
		Composite c2 = new Composite("c2");
		
		Leaf l1 = new Leaf("l1");
		
		Leaf l2 = new Leaf("l2");
		
		Leaf l3 = new Leaf("l3");
		
		root.addChild(c1);
		root.addChild(c2);
		root.addChild(l1);
		c1.addChild(l2);
		c2.addChild(l3);
		
		root.printStruct(" ");
		
	}

}
