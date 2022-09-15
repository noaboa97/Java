package logic;

public class Person {

	private String name;

	public Person() {
		this.name = "no name";
		System.out.println("Ende Konstruktor Person");
	}
	
	public String getName() {
		return name;
	}
}

