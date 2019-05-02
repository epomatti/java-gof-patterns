package org.bonanzaone.state;

public class OnButtonState implements ButtonState{
	
	private static final OnButtonState INSTANCE = new OnButtonState();

	@Override
	public String push(Button button) {
		button.setState(OffButtonState.instance());
		return "Desligado";
	}

	public static ButtonState instance() {
		return INSTANCE;
	}

}
