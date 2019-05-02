package org.bonanzaone.state;

import org.junit.Assert;
import org.junit.Test;

public class ButtonTest {

	@Test
	public void testPush() {

		String ligado = "Ligado";
		String desligado = "Desligado";
		
		Button button = new Button();
		Assert.assertEquals(ligado, button.push());
		Assert.assertEquals(desligado, button.push());
		
	}

}
