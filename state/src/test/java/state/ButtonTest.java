package state;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ButtonTest {

	@Test
	public void testPush() {

		String on = "On";
		String off = "Off";

		Button button = new Button();
		assertEquals(on, button.push());
		assertEquals(off, button.push());

	}

}
