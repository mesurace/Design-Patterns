package com.cs525.lab6;

public interface GearState {

	public void handle(CarContext carContext,int speed);
	public int value();
}
