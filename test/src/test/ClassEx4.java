package test;

public class ClassEx4 {
	static int add(int x, int y) {
		return x + y;
	}

	static double add(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println("두 정수의 덧셈: " + add(10, 20));
		System.out.println("두 실수의 덧셈: " + add(1.1, 2.2));
	}
}
