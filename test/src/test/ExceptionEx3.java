package test;

public class ExceptionEx3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 0;
		if (b == 0)
			System.out.println("0으로 나눗셈 불가능!");
		else {
			System.out.printf("%d / %d : %d\n", a, b, c);
		}
	}
}
