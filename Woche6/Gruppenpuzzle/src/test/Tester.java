package test;
import logic.Student;

public class Tester {

	public static void main(String[] args) {
	
		Student student = new Student("a.muster","07-758-345");
	
		System.out.println(student.getName());
		System.out.println(student.getLogin());
		System.out.println(student.getMatrikelNr());
	}
}
