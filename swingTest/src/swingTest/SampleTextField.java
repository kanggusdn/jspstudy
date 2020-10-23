package swingTest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SampleTextField extends JFrame {
	public static void main(String[] args) {
		SampleTextField f = new SampleTextField();
		f.setTitle("SampleTextField");
		f.setBounds(550, 350, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	SampleTextField() {
		JTextField text = new JTextField();
		text.setColumns(25);
		text.setText("Raspberry PI");
		JPanel p = new JPanel();
		p.add(text);
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}
}
