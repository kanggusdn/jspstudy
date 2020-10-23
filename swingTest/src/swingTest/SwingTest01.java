package swingTest;

import javax.swing.JFrame;

public class SwingTest01 {
	public static void main(String[] args) {
		JFrame f = new JFrame("응용프로그램");
//		f.setTitle(title);
//		f.setSize(400, 300);
//		f.setLocation(300, 300);
		f.setBounds(200, 200, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
