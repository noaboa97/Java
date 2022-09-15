package entity;

public class Student {

	private int id;
	private String nachname;
	private String vorname;
	
	public Student() {
		this(0,"","");
	}
	
	public Student(String nachname, String vorname) {
		this(0, nachname, vorname);
		
	}
	public Student(int id, String nachname, String vorname) {
		this.id = id;
		this.nachname = nachname;
		this.vorname = vorname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
}
