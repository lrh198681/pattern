package com.andy.transparent;

import java.util.ArrayList;

public class Composite extends AComponent {

	private ArrayList<AComponent> list = new ArrayList<AComponent>();

	private String name;

	public Composite(String name) {
		super();
		this.name = name;
	}

	public ArrayList<AComponent> getList() {
		return list;
	}

	public void setList(ArrayList<AComponent> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addChild(AComponent leaf){
		list.add(leaf);
	}
	
	public void removeChild(int index){
		list.remove(index);
	}
	
	
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr + " " + this.name);
		
		if(this.list != null){
			preStr += "  ";
			
			for (AComponent object : this.list) {
				object.printStruct(preStr);
			}
			
		}

	}

}
