package visitor;

public class Student implements Element{

	@Override
	public void accept(Visitor visitor) {

		visitor.visit(this);
		
	}

}
