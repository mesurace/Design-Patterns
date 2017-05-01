package com.cs525.lab6;

public class GearFive implements GearState {

	@Override
	public void handle(CarContext carContext,int speed) {
		if(speed<56)
		carContext.setCurrentState(new GearFour());
		
	}

	@Override
	public int value() {
		return 5;
	}

}