package ua.com.foxminded;

public enum Color { ORANGE ("Orange"),

WHITE ("Wite"),

YELLOW ("Yellow"),

BLUE ("Blue"),

GREEN ("Green"), BLACK ("Black");
	
	

	private final String name;

	private Color (String s) {
		name = s;
	}

	public String toString() {
		return this.name;
	}

}
