package director;

import builder.ComputerBuilder;

public class ComputerDirector {
	
	private ComputerBuilder builder;
	
	public ComputerDirector(ComputerBuilder builder) {
		this.builder = builder;
	}
	
	public void construct() {				
		builder.installOS();
	}

}
