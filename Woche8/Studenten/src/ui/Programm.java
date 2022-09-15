package ui;

import java.util.ArrayList;

import entity.Student;
import logic.StudentFacade;

public class Programm {

	public static void main(String[] args) {
		StudentFacade sf = new StudentFacade();
		
		Student s1 = new Student("Muster", "Hans");
		sf.addStudent(s1);
		Student s2 = new Student("Mustermann", "Max");
		sf.addStudent(s2);
		
		ArrayList<Student> students = sf.getAllStudents();
		for(Student s : students) {
			System.out.println(s.getId() + ": " + s.getNachname() + " " + s.getVorname());
		}
	}
}
