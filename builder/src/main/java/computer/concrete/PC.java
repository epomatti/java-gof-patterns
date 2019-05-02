package computer.concrete;

import util.IncompatibleProgram;
import util.Program;
import computer.Computer;

public class PC extends Computer {

	@Override
	public boolean validateProgram(Program program) throws IncompatibleProgram {

		if (program == Program.iTunes) {
			throw new IncompatibleProgram(program, os);
		}
		return true;
	}

}
