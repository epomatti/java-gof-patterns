package adapter;

public class Main {
	
	public static void main(String[] args) {

		PS2Adapter ps2 = new PS2Adapter(new USBMouse());
		ps2.command("moved");
		
	}

}
