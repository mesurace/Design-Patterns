package com.cs525.lab6;

public class GearThree implements GearState {

	@Override
	public void handle(CarContext carContext,int speed) {
		if(speed<21){
			carContext.setCurrentState(new GearTwo());
		}else if(speed>40){
			carContext.setCurrentState(new GearFour());
		}
		
	}

	@Override
	public int value() {
		// TODO Auto-generated method stub
		return 3;
	}

}
