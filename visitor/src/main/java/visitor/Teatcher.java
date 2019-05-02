package visitor;

public class Teatcher implements Element{

	@Override
	public void accept(Visitor visitor) {
		
		visitor.visit(this);
		
	}

}
