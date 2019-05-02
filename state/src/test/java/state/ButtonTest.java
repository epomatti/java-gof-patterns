package state;

import org.junit.Assert;
import org.junit.Test;

import state.Button;

public class ButtonTest {

	@Test
	public void testPush() {

		String on = "On";
		String off = "Off";
		
		Button button = new Button();
		Assert.assertEquals(on, button.push());
		Assert.assertEquals(off, button.push());
		
	}

}
