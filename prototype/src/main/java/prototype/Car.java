package prototype;

import lombok.Data;

public @Data class Car implements Cloneable{
	
	private String name;
	private String color;
	
	@Override	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
