package main;

import com.ctre.MotorControl.CANTalon;

public class ModularHardwareAdapter {
	public ModularHardwareAdapter(InputObject... input) {
		for(InputObject i: input) {
			createHardware(i);
		}
	}
	
	private void createHardware(InputObject input) {
		Object oType = input.getClassType();
	}
}