package adapter;

public class PS2Adapter {

	private USBMouse usbMouse;
	
	public PS2Adapter(USBMouse usbMouse) {
		this.usbMouse = usbMouse;
	}
	
	public void command(String command) {
		USBCommand usbCommand = new USBCommand();
		usbCommand.setCommand(command + " USB");
		usbMouse.move(usbCommand);
	}
	
}
