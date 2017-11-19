package main;

import java.util.ArrayList;

public class InputObject implements Comparable<InputObject>{
	private Object classType = null;
	private ArrayList<?> fields = null;
	
	public InputObject(Object type, ArrayList<?> in) {
		classType = type;
		fields = in;
	}
	
	public Object getClassType() {
		return classType;
	}
	
	public ArrayList<?> getFields() {
		return fields;
	}
	
	@Override
	public int compareTo(InputObject o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return classType.toString() + "/n" + fields.toString();
	}
}