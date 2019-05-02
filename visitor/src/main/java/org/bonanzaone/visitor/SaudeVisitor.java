package org.bonanzaone.visitor;

public class SaudeVisitor implements Visitor{

	@Override
	public void visit(Aluno aluno) {
		System.out.println("Visitou saúde do aluno.");
	}

	@Override
	public void visit(Professor professor) {
		System.out.println("Visitou saúde do professor.");
		
	}

}
