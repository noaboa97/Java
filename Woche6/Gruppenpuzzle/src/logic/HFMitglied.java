package logic;

public class HFMitglied extends Person {

	private String login;

	public HFMitglied(String login) {
		super();
		this.login = login;
		System.out.println("Ende Konstruktor HFMitglied");
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
}
