package computer.concrete;

import util.IncompatibleProgram;
import util.Program;
import computer.Computer;

public class Mac extends Computer {

	@Override
	public boolean validateProgram(Program program) throws IncompatibleProgram {

		if (program == Program.Office) {
			throw new IncompatibleProgram(program, os);
		}
		return true;
	}

}
