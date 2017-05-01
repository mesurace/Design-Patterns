package com.cs525.lab4;

import java.util.List;

public interface Component {

	public double netPrice();

	public double discountPrice();

	public double computePrice();

	public List<Component> getChildren();

	public boolean addComponent(Component c);

	public boolean removeComponent(Component c);

}
