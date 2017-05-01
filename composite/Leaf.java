package com.cs525.lab4;


import java.util.List;

public class Leaf implements Component {

	
	@Override
	public List<Component> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addComponent(Component c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeComponent(Component c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double netPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double discountPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double computePrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
