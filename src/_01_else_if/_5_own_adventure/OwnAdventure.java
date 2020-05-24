package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		String story = JOptionPane.showInputDialog("Would you like to hear a story?");
		if(story.equals("no")) {
			JOptionPane.showMessageDialog(null, "Goodbye!");}
			else if(story.equals("yes")) {
		String trail = JOptionPane.showInputDialog("Little red riding hood was on her way to visit her grandma when she came upon a trail that split at a big oak tree."
				+ "Which way should she go? Right or left?");
		if(trail.equals("right")) {
		String lake = JOptionPane.showInputDialog("Little red riding hood comes across a wide river with a strong current. She decides that there are only two ways to cross the river: to swim or to try to build a bridge. "
				+ "Which should she do?" );
		if(lake.equals("swim")) {
			JOptionPane.showMessageDialog(null, "Uh oh! Little red riding hood drowned.The end.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Oh no! While little red riding hood was looking for wood to build a bridge the big bad wolf found her and ate her!"
					+ " The end.");
		}}
		else if(trail.equals("left")) {
			String wolf = JOptionPane.showInputDialog("Uh oh! A little while down the trail little red riding hood comes across the big bad wolf!" 
					+ " She wonders whether she should make a run for it or try to trick the wolf to get away. What do you think?");
			if(wolf.equals("make a run for it")) {
				JOptionPane.showMessageDialog(null, "The wolf is too quick! Little red riding hood gets eaten :(. The end.");
			}
			else {
				String fruit = JOptionPane.showInputDialog("Little red riding hood tells the wolf that there is a juicier, fatter little girl on the trail behind her and the trick works!"
						+ "The wolf decides to wait for the made up second girl and eat her instead."
						+ "Little red riding hood makes a quick escape and a few minutes down the trail comes across a large apple tree. She wonders if she should stop and pick some apples for her fruit basket for grandma, as apples are grandma's favorite fruit."
						+  "Should she pick some apples or continue down the trail?");
				if(fruit.equals("pick some apples")){
					JOptionPane.showMessageDialog(null, "Little red riding hood decides to pick a couple apples for her grandmother. As she's picking the apples the big bad wolf comes down the trail," 
							+ "angry that little red riding hood lied to him. Little red riding hood tries to run but the wolf is too quick and eats her. Oopsie! The end.");
				}
				else {
					JOptionPane.showMessageDialog(null, "Little red riding hood decides to continue down the trail and soon arrives at grandma's house. When she arrives, her grandma answers the door and gives her a big hug."
							+ "It's been a dangerous journey, but little red riding hood made it to her grandma's house safely. The end :)");
				}
			}
		}
	}
}}
