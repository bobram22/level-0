// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {
		
		// 3. Make a variable to hold the number of sides and set it to 0
		int dino = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String himynameis = JOptionPane.showInputDialog("what spiral would you like? square, triangle, or pentogon");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if(himynameis .equals ("square")){
			dino = 360/4;
		}
		else if(himynameis .equals("triangle")){
			dino = 360/3;
		}
		else if(himynameis .equals("pentogon")){
			dino = 360/5;
			
		}
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		Tortoise.penDown();
		Tortoise.setSpeed(10);
		int bub = 5;
		for (int i = 0; i < 2000; i++) {
			Tortoise.move(i*2);
		Tortoise.turn(dino);
		bub= bub+5;
		}
		
		
				// 2. Change your code to turn the square spiral into a triangle spiral
		
	}

}


