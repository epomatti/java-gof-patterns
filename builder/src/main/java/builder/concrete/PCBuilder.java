package builder.concrete;

import lombok.Getter;
import util.OperationalSystem;
import builder.ComputerBuilder;

import computer.concrete.PC;

public class PCBuilder extends ComputerBuilder {
	
	@Getter
	private PC pc;
	
	public PCBuilder(){
		this.pc = new PC();
	}

	@Override
	public void installOS() {
		pc.setOs(OperationalSystem.Windows);

	}

}
