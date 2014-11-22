package com.andy.safe;

import java.util.ArrayList;

public class Composite implements IComponent {

	private ArrayList<IComponent> list = new ArrayList<IComponent>();

	private String name;

	public Composite(String name) {
		super();
		this.name = name;
	}

	public ArrayList<IComponent> getList() {
		return list;
	}

	public void setList(ArrayList<IComponent> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addChild(IComponent leaf){
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
			
			for (IComponent object : this.list) {
				object.printStruct(preStr);
			}
			
		}

	}

}
