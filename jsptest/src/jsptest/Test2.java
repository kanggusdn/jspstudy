package jsptest;

public class Test2 {
	public static void main(String[] args) {
		double score[][] = { { 80, 90 }, { 70, 80 }, { 60, 100 } };
		double sum = 0;
		for (int year = 0; year < score.length; year++) {
			for (int s = 0; s < score[year].length; s++) {
				sum += score[year][s];
			}
		}
		int row = score.length;
		int col = score[0].length;
		System.out.println(sum / (row * col));
	}
}
