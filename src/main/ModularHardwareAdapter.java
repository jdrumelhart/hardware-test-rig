package main;

public class ModularHardwareAdapter {
	
	private static final ModularHardwareAdapter instance = new ModularHardwareAdapter();

	public static ModularHardwareAdapter getInstance() {
		return instance;
	}
}