package util;

@SuppressWarnings("serial")
public class IncompatibleProgram extends Exception {

	public IncompatibleProgram(Program program, OperationalSystem os) {
		super(String.format("The program %s is not compatible with the OS %s", program, os));
	}
	
}
