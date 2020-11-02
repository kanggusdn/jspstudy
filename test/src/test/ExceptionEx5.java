package test;

public class ExceptionEx5 {
	public static void main(String[] args) {
		int a, b, result;
		a = 5;
		b = 0;
		try {
			result = a / b;
			System.out.println("A");
		} catch (ArithmeticException e) {
			System.out.println("B");
		} finally {
			System.out.println("C");
		}
		System.out.println("D");
	}
}
