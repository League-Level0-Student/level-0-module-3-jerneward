
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Set;public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	Robot nate = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		//3. Set the pen width to 10
	nate.setPenWidth(10);
	nate.penDown();
	for (int i = 0; i < 10; i++) {
		
		//4. Ask the user what color pen they would like the robot to draw with
	String color = JOptionPane.showInputDialog("What color would you like nate the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
	if (color.equals("red")) {
		nate.setPenColor(Color.red);
	}
	else if(color.equals("orange")) {
		nate.setPenColor(Color.orange);
	}
	else if (color.equals("yellow")) {
		nate.setPenColor(Color.YELLOW);
	}
	else if (color.equals("green")) {
		nate.setPenColor(Color.green);
	}
	else if (color.equals("blue")) {
		nate.setPenColor(Color.blue);
	}
	else if (color.equals("pink")) {
		nate.setPenColor(Color.PINK);
	}
	else if (color.equals("black")) {
		nate.setPenColor(Color.black);
	}
	else {
		nate.setRandomPenColor();
	}
	
	for(int j=1; j<4; j++) {
		nate.move(100);
		nate.turn(90);
	}
	}
        //6. If the user doesn’t enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	

		



	}
}
