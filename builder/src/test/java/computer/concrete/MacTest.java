package computer.concrete;

import org.junit.Assert;
import org.junit.Test;

import util.IncompatibleProgram;
import util.Program;

public class MacTest {

	@Test(expected=IncompatibleProgram.class)
	public void testInstallProgramException() throws IncompatibleProgram{		
		Mac mac = new Mac();
		mac.installProgram(Program.Office);
	}
	
	@Test
	public void testInstallProgramSucess() throws IncompatibleProgram{		
		Mac mac = new Mac();
		Assert.assertEquals(0, mac.getPrograms().size());
		mac.installProgram(Program.iTunes);
		Assert.assertEquals(1, mac.getPrograms().size());
	}

}
