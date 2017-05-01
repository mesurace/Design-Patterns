package com.cs525.lab5;

public class PushCommand implements Command {

	
	Receiver receiver;
	PushCommand(Receiver receiver){
		this.receiver=receiver;
	}
	
	@Override
	public void execute() {
		receiver.pushMethod();
		
	}

}
