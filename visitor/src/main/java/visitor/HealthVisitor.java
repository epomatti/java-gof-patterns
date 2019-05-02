package visitor;

public class HealthVisitor implements Visitor{

	@Override
	public void visit(Student student) {
		System.out.println("Visited student health.");
	}

	@Override
	public void visit(Teatcher teatcher) {
		System.out.println("Visited teatchers health.");
		
	}

}
