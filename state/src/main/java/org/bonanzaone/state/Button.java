package org.bonanzaone.state;

public class Button {

	private ButtonState state = new OffButtonState();
	
	public String push() {
		return state.push(this);
	}
	
	public void setState(ButtonState state) {
		this.state = state;
	}
	
}
