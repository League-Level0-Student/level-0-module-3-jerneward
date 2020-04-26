
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Set;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	Robot nate = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
	for(int i=1; i<4; i++) {
		nate.move(100);
		nate.turn(90);
	}
		//3. Set the pen width to 10
	nate.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
	String color = JOptionPane.showInputDialog("What color would you like nate the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
	if (color)
        //6. If the user doesn’t enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
