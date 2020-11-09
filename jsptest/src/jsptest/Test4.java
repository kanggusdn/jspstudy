package jsptest;

public class Test4 {

	public static int fun1(int n) {
		return fun2(n + 1);
	}

	public static int fun2(int n) {
		return fun3(n + 2);
	}

	public static int fun3(int n) {
		return n + 3;
	}

	public static void main(String[] args) {
		int num = 10;
		num = fun1(num);
		System.out.println(num);
	}
}
