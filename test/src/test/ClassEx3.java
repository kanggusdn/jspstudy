package test;

public class ClassEx3 {
	static int fun1(int x) {
		return fun2(x + 2);
	}

	static int fun2(int x) {
		return fun3(x * 2);
	}

	static int fun3(int x) {
		return x / 2;
	}

	public static void main(String[] args) {
		int result = fun1(10);
		System.out.println(result);
	}
}
