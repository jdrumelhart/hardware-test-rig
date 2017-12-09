package main;

import edu.wpi.first.wpilibj.Encoder;

public class ModularHardwareAdapter {
	
	public ModularHardwareAdapter(Class<?>... input) {
		for(Class<?> i: input) {
			createHardware(i);
		}
	}
	
	private void createHardware(Class<?> input) {
		if(input.isInstance(new Encoder(0, 0))) {
			try {
				Class<?> cls = Class.forName("Encoder");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}