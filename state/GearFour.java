package com.cs525.lab6;

public class GearFour implements GearState {

	@Override
	public void handle(CarContext carContext,int speed) {
		if(speed<41){
			carContext.setCurrentState(new GearThree());
		}else if(speed>60){
			carContext.setCurrentState(new GearFive());
		}
		
	}
	@Override
	public int value() {
		// TODO Auto-generated method stub
		return 4;
	}
}