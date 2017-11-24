package main;

import types.InputObject;

public class ModularHardwareAdapter {
	
	public ModularHardwareAdapter(InputObject... input) {
		for(InputObject i: input) {
			createHardware(i);
		}
	}
	
	private void createHardware(InputObject input) {
	
	}
}