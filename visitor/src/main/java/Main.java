import java.util.ArrayList;
import java.util.List;

import visitor.HealthVisitor;
import visitor.Student;
import visitor.Teatcher;
import visitor.Visitor;

public class Main {

	public static void main(String[] args) {
		
		Visitor visitor = new HealthVisitor();		
		
		List<Student> students = new ArrayList<>();
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		
		for (Student student : students) {
			student.accept(visitor);
		}
		
		List<Teatcher> teatchers = new ArrayList<>();
		teatchers.add(new Teatcher());
		teatchers.add(new Teatcher());
		teatchers.add(new Teatcher());
		
		for (Teatcher teatcher : teatchers) {
			teatcher.accept(visitor);
		}
	}
}
