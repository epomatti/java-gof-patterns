package prototype;

import lombok.Data;

public @Data class Car implements Cloneable{
	
	private String name;
	private String cor;
	
	@Override	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
