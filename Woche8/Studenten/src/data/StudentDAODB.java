package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Student;

/**
 * Speichert und l�dt Studenten von einer DB.
 * Daf�r muss die DB inkl. Tabelle bereits existieren.
 * Daf�r existiert ein Skript im Projekt. (student-table.txt)
 * Unsch�n an dieser Klasse: die Connection wird pro Aktion
 * ge�ffnet bzw. geschlossen.
 */
public class StudentDAODB implements StudentDAO {

	// attributes used for data connection
	private String conStr = "jdbc:mysql://localhost/studentdb?user=root";

	public StudentDAODB() {

		// init data driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Student> getStudents() {
		ArrayList<Student> retval = new ArrayList<Student>();
		
		try (Connection con = DriverManager.getConnection(this.conStr)) {
			
			PreparedStatement ps = con.prepareStatement("select * from students");
			ResultSet rs =  ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String n = rs.getString("nachname");
				String v = rs.getString("vorname");
				Student s = new Student(id, n, v);
				retval.add(s);
			
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return retval;
	}

	@Override
	public void saveStudent(Student s) {
		try (Connection con = DriverManager.getConnection(this.conStr)) {
			String sql = 
					"insert into students" +
				    "(nachname, vorname)" +
				    "values (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s.getNachname());
			ps.setString(2, s.getVorname());
			ps.execute();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
