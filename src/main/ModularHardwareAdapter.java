package main;

import com.ctre.MotorControl.CANTalon;

import main.Robot.HardwareType;

public class ModularHardwareAdapter {
	public ModularHardwareAdapter(InputObject... input) {
		for(InputObject i: input) {
			createHardware(i);
		}
	}
	
	private void createHardware(InputObject input) {
		HardwareType oType = input.getHardwareType();
	}
}