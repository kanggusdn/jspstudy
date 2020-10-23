package swingTest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class SampleProgressBar extends JFrame {
	public static void main(String[] args) {
		SampleProgressBar f = new SampleProgressBar();
		f.setTitle("SampleProgressBar");
		f.setBounds(550, 350, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	SampleProgressBar() {
		JProgressBar bar = new JProgressBar(0, 200);
		bar.setStringPainted(true);
		bar.setValue(50);
		JPanel p = new JPanel();
		p.add(bar);
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}
}