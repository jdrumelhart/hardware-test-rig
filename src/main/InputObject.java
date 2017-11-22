package main;

import main.Robot.HardwareType;

public class InputObject implements Comparable<InputObject>{
	private HardwareType hardware = null;
	private String[] fields = null;
	
	public InputObject(HardwareType type, String... in) {
		hardware = type;
		fields = in;
	}
	
	public HardwareType getHardwareType() {
		return hardware;
	}
	
	public String[] getFields() {
		return fields;
	}
	
	@Override
	public int compareTo(InputObject o) {
		return getHardwareType().compareTo(o.getHardwareType());
	}
	
	@Override
	public String toString() {
		return hardware.toString() + "/n" + fields.toString();
	}
}