package visitor;

import java.util.ArrayList;
import java.util.List;

public class ClienteVisitor {

	public static void main(String[] args) {
		
		Visitor visitor = new SaudeVisitor();		
		
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno());
		alunos.add(new Aluno());
		alunos.add(new Aluno());
		
		for (Aluno aluno : alunos) {
			aluno.accept(visitor);
		}
		
		List<Professor> professores = new ArrayList<>();
		professores.add(new Professor());
		professores.add(new Professor());
		professores.add(new Professor());
		
		for (Professor professor : professores) {
			professor.accept(visitor);
		}
	}
}
