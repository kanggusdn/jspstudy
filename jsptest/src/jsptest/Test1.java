package jsptest;

public class Test1 {
	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int k : n) {
			sum += k;
			if (k != n.length)
				System.out.print(k + "+");
			else
				System.out.print(k + "=");
		}
		System.out.println(sum);
	}

}
