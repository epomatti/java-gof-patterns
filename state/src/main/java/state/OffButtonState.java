package state;

public class OffButtonState implements ButtonState{
	
	private static final OffButtonState INSTANCE = new OffButtonState();

	@Override
	public String push(Button button) {
		button.setState(OnButtonState.instance());
		return "On";
	}

	public static ButtonState instance() {
		return INSTANCE;
	}

}
