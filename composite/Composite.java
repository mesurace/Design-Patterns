package com.cs525.lab4;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Composite implements Component {

	List<Component> components;
	double netPrice;
	double discountPrice;

	public Composite(double netPrice, double discountPrice) {
		this.netPrice = netPrice;
		this.discountPrice = discountPrice;
		components = new Vector<>();
	}

	@Override
	public List<Component> getChildren() {
		return null;
	}

	@Override
	public boolean addComponent(Component c) {
		return components.add(c);
	}

	@Override
	public boolean removeComponent(Component c) {
		return components.remove(c);
	}

	@Override
	public double netPrice() {
		return netPrice;
	}

	@Override
	public double discountPrice() {
		return discountPrice;
	}

	@Override
	public double computePrice() {
		double result = discountPrice();
		Iterator<Component> componentIterator = components.iterator();
		while (componentIterator.hasNext()) {
			result += componentIterator.next().netPrice();
		}
		return result;
	}

}
