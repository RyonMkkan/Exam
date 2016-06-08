import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw
String answer = JOptionPane.showInputDialog("what color do you want?");
// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)

// 2. set the pen width to 10
  
   	 // 1. make the Robot draw a shape
Robot bill = new Robot();
bill.penDown();
bill.setPenWidth(10);

if (answer.equals("blue")) {
	bill.setPenColor(Color.blue);
}
else if (answer.equals("green")) {
	bill.setPenColor(Color.GREEN);
}
else {
	bill.setPenColor(Color.BLACK);
}
for (int i = 0; i < 4; i++) {
	bill.move(90);
	bill.turn(90);
}
    }

}
