package computer;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import util.IncompatibleProgram;
import util.OperationalSystem;
import util.Program;

public abstract class Computer {
	
	@Setter
	protected OperationalSystem os;
	
	@Getter
	private List<Program> programs = new ArrayList<>();
	
	public final OperationalSystem getOperationalSystem() {
		return os;
	}
	
	public void installProgram(Program program) throws IncompatibleProgram {
		if(validateProgram(program)) {
			programs.add(program);
		}
	}
	
	public abstract boolean validateProgram(Program program) throws IncompatibleProgram;

}
