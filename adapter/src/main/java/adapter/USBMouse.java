package adapter;

public class USBMouse {
	
	public void move(USBCommand command) {
		System.out.println(command.getCommand());
	}

}
