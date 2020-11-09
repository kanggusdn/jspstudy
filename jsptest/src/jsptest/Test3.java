package jsptest;

public class Test3 {

	public static int decrement(int n) {
		n = n - 1;
		return n;
	}

	public static void main(String[] args) {
		int num = 10;
		num = decrement(num);
		System.out.println(num);
	}
}
