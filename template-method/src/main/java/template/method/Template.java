package template.method;

public abstract class Template {

	private boolean var;

	public void execute() {
		part1();
		part2();
		if (var) {
			part3();
		}
	}

	protected abstract void part3();

	protected abstract void part2();

	protected abstract void part1();

}
