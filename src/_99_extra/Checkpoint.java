package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = JOptionPane.showInputDialog("What is your favorite color?");	

		JOptionPane.showMessageDialog(null,input+" Is also my favorite color  ");
		
		Robot Mike = new Robot();
				 
		Mike.penDown();
		
		Mike.setSpeed(80);
		Mike.turn(40);
		Mike.move(150);
		Mike.turn(120);
		Mike.move(150);
		Mike.turn(120);
		Mike.move(170);
		
		
		 
		
		
		
		
	}

}
