package logic;

import java.util.ArrayList;

import data.Storage;
import data.StudentDAO;
import data.StudentDAODB;
import data.StudentDAOMemory;
import data.StudentDAOXML;
import entity.Student;

public class StudentFacade {

	private StudentDAO dao;

	public StudentFacade() {
		this.setDAO(Storage.XML);
	}
	public ArrayList<Student> getAllStudents()  {
		return this.dao.getStudents();
	}
	
	public void addStudent(Student s) {
		this.dao.saveStudent(s);
	}
	
	private void setDAO(Storage storage) {
		switch (storage) {
		case XML:
			dao = new StudentDAOXML();
			break;

		case DB:
			dao = new StudentDAODB();
			break;

		default:
			dao = new StudentDAOMemory();
			break;
		}
	}
}
