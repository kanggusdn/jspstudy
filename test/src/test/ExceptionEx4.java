package test;

public class ExceptionEx4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.printf("%d / %d : %d\n", a, b, c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("0으로 나눗셈 불가능!");
		}
	}
}
