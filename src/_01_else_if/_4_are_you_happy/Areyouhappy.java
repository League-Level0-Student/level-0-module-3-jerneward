package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Areyouhappy {

public static void main(String[] args) {
	
	
	String happy = JOptionPane.showInputDialog("Are you happy?");
		 if(happy.equals("yes")) {
			 JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
		 }
		 else if(happy.equals("no")) {
			 String nothappy =  JOptionPane.showInputDialog("Do you want to be happy?");
			 if(nothappy.equals("no")){
				 JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
			 }
			 else if(nothappy.equals("yes")) {
				 JOptionPane.showMessageDialog(null, "Change something.");
			 }
		 }}}
