import java.util.Objects;

public class Color {
	
	private long id;
	private String desc;
	private boolean isCold;
	
	private int r;
	private int g;
	private int b;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Color color = (Color) o;
		return id == color.id && isCold == color.isCold && r == color.r && g == color.g && b == color.b && Float.compare(color.greyGamma, greyGamma) == 0 && desc.equals(color.desc);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, desc, isCold, r, g, b, greyGamma);
	}

	private float greyGamma;
	
	public Color(long id, String desc, boolean isCold, int r, int g, int b, float greyGamma) {
		super();
		this.id = id;
		this.desc = desc;
		this.isCold = isCold;
		this.r = r;
		this.g = g;
		this.b = b;
		this.greyGamma = greyGamma;
	}

	public String getDesc() {
		return desc;
	}
}
