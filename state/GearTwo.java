package com.cs525.lab6;

public class GearTwo implements GearState {
	
	@Override
	public void handle(CarContext carContext,int speed) {
		if(speed<11){
			carContext.setCurrentState(new GearOne());
		}else if(speed>20){
			carContext.setCurrentState(new GearThree());
		}
		
	}

	@Override
	public int value() {
		// TODO Auto-generated method stub
		return 2;
	}

}
