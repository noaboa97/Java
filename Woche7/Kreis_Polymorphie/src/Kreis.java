
public class Kreis {

	private double radius;

	public Kreis() {
		this.radius = 1;
	}
	public Kreis(double radius) {
		this.radius = 1;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getFlaeche() {

		return this.radius * this.radius * Math.PI;
	}
}
