package swingTest;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SamplePane extends JFrame {
	public static void main(String[] args) {
		SamplePane f = new SamplePane("Swing");
		f.setVisible(true);
	}
	
	public SamplePane(String title) {
		setTitle(title);
		setBounds(550, 350, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JButton btn1 = new JButton("YES");
		JButton btn2 = new JButton("NO");
		p.add(btn1);
		p.add(btn2);
		Container c = getContentPane();
		c.add(p, BorderLayout.CENTER);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("YES 클릭");
			}
		});
		}
	}
/*
 	public SamplePane(String title) {
		setTitle(title);
		setBounds(550, 350, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JButton btn1 = new JButton("YES");
		JButton btn2 = new JButton("NO");
		p.add(btn1);
		p.add(btn2);
		Container c = getContentPane();
		c.add(p, BorderLayout.CENTER);
		btn1.addActionListener(e -> System.out.println("YES 클릭"));
*/