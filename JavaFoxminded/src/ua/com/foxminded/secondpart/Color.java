package ua.com.foxminded.secondpart;

public enum Color {
	BLACK("Black"), WHITE("White"), ORANGE("Orange"), GREEN("Green");

	private final String name;

	private Color(String s) {
		name = s;
	}

	public String toString() {
		return this.name;
	}

}
