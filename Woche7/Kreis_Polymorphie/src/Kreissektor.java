
public class Kreissektor extends Kreis {

	private double alpha;

	public Kreissektor() {
		super();
		this.alpha = alpha;
	}
	
	public Kreissektor(double radius, double alpha) {
		super(radius);
		this.alpha = alpha;
	}
	
	public double getAlpha() {

		return alpha;
	}

	public double getFlaeche(){

		return super.getFlaeche() * alpha / 360;

		// not nice because code duplication
		//return this.getRadius() * this.getRadius() * Math.PI * alpha / 360;
	};
}
