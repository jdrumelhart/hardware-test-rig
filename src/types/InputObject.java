package types;


public abstract class InputObject implements Comparable<InputObject>{
	protected Object hardwareType;
	protected Object[] fields;
	
	public abstract Object getHardwareType();
	
	public abstract Object[] getFields();
	
	@Override
	public abstract int compareTo(InputObject o);	
	
	@Override
	public String toString() {
		return hardwareType.toString() + "/n" + fields.toString();
	}
}