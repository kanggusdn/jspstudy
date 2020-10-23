package swingTest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SampleButton extends JFrame {
	public static void main(String[] args) {
		SampleButton f = new SampleButton();
		f.setTitle("SampleButton");
		f.setBounds(550, 350, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	SampleButton() {
		JButton button = new JButton();
		button.setText("Raspberry PI");
		JPanel p = new JPanel();
		p.add(button);
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}
}
