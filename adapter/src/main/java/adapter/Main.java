package adapter;

public class Main {
	
	public static void main(String[] args) {

		AdaptadorPS2 ps2 = new AdaptadorPS2(new MouseUSB());
		ps2.comando("moveu");
		
	}

}
