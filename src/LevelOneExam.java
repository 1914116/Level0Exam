import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LevelOneExam implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();

	public LevelOneExam() {
		frame.setVisible(true);
		frame.setTitle("Color Teacher");
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		b1.setBackground(Color.YELLOW);
		b1.setOpaque(true);
		b2.setBackground(Color.RED);
		b2.setOpaque(true);
		b3.setBackground(Color.BLUE);
		b3.setOpaque(true);
		b4.setBackground(Color.GREEN);
		b4.setOpaque(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		frame.pack();

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		LevelOneExam Eli = new LevelOneExam();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Performed");
		if (b1 == e.getSource()) {
			speak("Yellow");
		} else if (b2 == e.getSource()) {
			speak("Red");
		} else if (b3 == e.getSource()) {
			speak("Blue");
		} else if (b4 == e.getSource()) {
			speak("Green");
		}

	}

}
