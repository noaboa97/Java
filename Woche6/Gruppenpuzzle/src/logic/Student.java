package logic;

public class Student extends HFMitglied {

	private String matrikelNr;
	
	public Student(String login, String matrikelNr) {
		super(login);
		this.matrikelNr = matrikelNr;
		System.out.println("Ende Konstruktor Student");
	}

	public String getMatrikelNr() {
		return matrikelNr;
	}

	public void setMatrikelNr(String matrikelNr) {
		this.matrikelNr = matrikelNr;
	}
}

