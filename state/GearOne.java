package com.cs525.lab6;

public class GearOne implements GearState {

	@Override
	public void handle(CarContext carContext,int speed) {
		if(speed<1){
			carContext.setCurrentState(new ParkState());
		}else if(speed>10){
			carContext.setCurrentState(new GearTwo());
		}
		
	}
	@Override
	public int value() {
		// TODO Auto-generated method stub
		return 1;
	}

}
