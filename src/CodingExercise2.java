
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they were born. If they are over 30, tell them
 * they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("How old are you?");
		int g = Integer.parseInt(a);
		int n = 2016 - g;
		if (n <= 1986) {
			JOptionPane.showMessageDialog(null, "You are too old for this game");
		} else {
			JOptionPane.showMessageDialog(null, "You were born in " + n);
		}

	}
}
