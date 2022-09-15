package com.javafx.students.ui;

import entity.Student;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import logic.StudentFacade;

import java.util.ArrayList;

public class MainViewController {

    @FXML
    private TableView<?> Table;

    public void showStudents(){

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
