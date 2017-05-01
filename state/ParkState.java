package com.cs525.lab6;

public class ParkState implements GearState {

	@Override
	public void handle(CarContext carContext,int speed) {
		if(speed>0){
			carContext.setCurrentState(new GearOne());
		}
		
	}

	@Override
	public int value() {
		// TODO Auto-generated method stub
		return 0;
	}

}
