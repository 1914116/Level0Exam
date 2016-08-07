
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		// 3. ask the user what color they would like the Robot to draw
		Robot n = new Robot();
		String c = JOptionPane.showInputDialog("What color do you want the robot to draw?");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if (c.equalsIgnoreCase("yellow")) {
			n.setPenColor(255, 0, 0);
		} else if (c.equalsIgnoreCase("blue")) {
			n.setPenColor(0, 0, 255);
		} else if (c.equalsIgnoreCase("green")) {
			n.setPenColor(Color.green);
		} else if (c.equalsIgnoreCase("red")) {
			n.setPenColor(Color.red);
		} else {
			JOptionPane.showMessageDialog(null, "Color Unavailable");
			n.setPenColor(0, 0, 0);
		}
		// 2. set the pen width to 10

		// 1. make the Robot draw a shape

		n.penDown();
		n.setPenWidth(10);
		for (int i = 0; i < 3; i++) {
			n.move(150);
			n.turn(120);
		}
	}

}
