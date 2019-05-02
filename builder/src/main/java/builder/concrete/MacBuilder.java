package builder.concrete;

import lombok.Getter;
import util.OperationalSystem;
import builder.ComputerBuilder;

import computer.concrete.Mac;

public class MacBuilder extends ComputerBuilder {

	@Getter
	private Mac mac;

	public MacBuilder() {
		this.mac = new Mac();
	}

	@Override
	public void installOS() {
		mac.setOs(OperationalSystem.iOS);
	}

}
