package main;

import edu.wpi.first.wpilibj.Encoder;
import hardware.HardwareInterface;

public class ModularHardwareAdapter {
	
	public ModularHardwareAdapter(HardwareInterface... input) {
		for(HardwareInterface i: input) {
			i.selfTest();
		}
	}
		
}