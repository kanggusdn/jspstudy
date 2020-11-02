package test;

class Number {
	private int x;

	void setX(int i) {
		x = i;
	}

	int getX() {
		return x;
	}
}

public class ClassEx2 {
	public static void main(String[] args) {
		Number obj = new Number();
		obj.setX(100);
		System.out.println(obj.getX());
	}
}
