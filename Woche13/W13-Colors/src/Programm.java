
public class Programm {

	public static void main(String[] args) {
		ColorSet cs = new ColorSet();
		
		Color c1 = new Color(1,"Color1", true, 200, 0, 0, 2.2F);
		Color c2 = new Color(2,"Color2", false, 0, 200, 0, 2.2F);
		Color c3 = new Color(2,"Color3", false, 200, 0, 0, 1.8F);

		cs.addColor(c1);
		cs.addColor(c2);
		boolean ret = cs.addColor(c3);
		if(!ret) {
			System.out.println(c3.getDesc() + " konnte nicht hinzugef�gt werden");
		}
		System.out.println("Anzahl Elemente in HashSet: " + cs.getColorSize());
		
		
		System.out.println("Vergleiche:");
		System.out.println("c1->c2:" + c1.equals(c2));
		System.out.println("c2->c3:" + c2.equals(c3));
		System.out.println("c1->c3:" + c1.equals(c3));
	}
}
