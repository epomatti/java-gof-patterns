package visitor;

public class Aluno implements Element{

	@Override
	public void accept(Visitor visitor) {

		visitor.visit(this);
		
	}

}
