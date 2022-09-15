import java.util.HashSet;
import java.util.Set;

public class ColorSet {

	private Set<Color> colors = new HashSet<Color>();

	public boolean addColor(Color c) {
		boolean success = colors.add(c);
		return success;
	}

	public int getColorSize() {
		return colors.size();
	}
}
