import builder.concrete.MacBuilder;
import builder.concrete.PCBuilder;
import computer.concrete.Mac;
import computer.concrete.PC;
import director.ComputerDirector;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		MacBuilder macBuilder = new MacBuilder();
		ComputerDirector macDirector = new ComputerDirector(macBuilder);
		macDirector.construct();
		Mac mac = macBuilder.getMac();
		System.out.println(mac.getOperationalSystem());

		PCBuilder pcBuilder = new PCBuilder();
		ComputerDirector pcDirector = new ComputerDirector(pcBuilder);
		pcDirector.construct();
		PC pc = pcBuilder.getPc();
		System.out.println(pc.getOperationalSystem());

	}

}
