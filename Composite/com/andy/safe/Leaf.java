package com.andy.safe;

public class Leaf implements IComponent {
	
	private String name;

	public Leaf(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr + "" + this.name);

	}

}
