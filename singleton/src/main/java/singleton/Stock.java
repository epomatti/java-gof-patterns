package singleton;

import lombok.Getter;
import lombok.Setter;

public class Stock {
	
	private static Stock SINGLETON = new Stock();

	@Getter @Setter
	private Float dollar;

	protected Stock() {}
	
	public static Stock getInstance(){
		return SINGLETON;
	}

}
