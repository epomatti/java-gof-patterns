package computer.concrete;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import util.IncompatibleProgram;
import util.Program;

public class MacTest {

	@Test
	public void testInstallProgramException() throws IncompatibleProgram{
		assertThrows(IncompatibleProgram.class, () -> {
			Mac mac = new Mac();
			mac.installProgram(Program.Office);
		});		
	}
	
	@Test
	public void testInstallProgramSucess() throws IncompatibleProgram{		
		Mac mac = new Mac();
		assertEquals(0, mac.getPrograms().size());
		mac.installProgram(Program.iTunes);
		assertEquals(1, mac.getPrograms().size());
	}

}
