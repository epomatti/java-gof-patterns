package visitor;

public class Professor implements Element{

	@Override
	public void accept(Visitor visitor) {
		
		visitor.visit(this);
		
	}

}
