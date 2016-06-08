/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/ 

public class CodingExercise2 {
	public static void main(String[] args) {
String answer =JOptionPane.showInputDialog("what is your year of birth?");
int birthYear =Integer.parseInt(answer);

if (birthYear < 1986) {
	System.out.println("your to old to play this game!");
}
}
}