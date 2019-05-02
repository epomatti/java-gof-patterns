package template.method;

public class ConcreteClass extends Template {

	@Override
	protected void part3() {
		System.out.println("Part 3 executed");
	}

	@Override
	protected void part2() {
		System.out.println("Part 2 executed");
	}

	@Override
	protected void part1() {
		System.out.println("Part 1 executada");
	}

}
