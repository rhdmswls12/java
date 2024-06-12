package day0612;

public class NameMenu {
	String names[] = new String[5];
	void add(String name) {
		for (int i=0; i<names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}
	String[] search() {
		return names;
	}
	void update(String oldName, String newName) {
		for (int i=0; i<names.length; i++) {
			if (names[i].equals(oldName)) {
				names[i] = newName;
				break;
			}
		}
	}
	void delete(String name) {
		for (int i=0; i<names.length; i++) {
			if (names[i].equals(name)) {
				names[i] = null;
				break;
			}
		}
	}
}
