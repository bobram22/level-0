 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		JOptionPane.showMessageDialog(null, random);
		// 11. do the following 10 times
		for (int i = 0; i < 11.; i++) {
			
			// 1. ask the user for a guess using a pop-up window, and save their response 
String pop = JOptionPane.showInputDialog("Guess a number from "); 
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
		int POP =	Integer.parseInt(pop);
			// 5. if the guess is correct
			if (POP == random){
				JOptionPane.showMessageDialog(null, "YOU WIN!!!!");
			}
				// 6. win
			// 7. if the guess is high
			
			 if (POP > random  ) {
				JOptionPane.showMessageDialog(null, "its too high");
			}
				// 8. tell them it's too high
			// 9. if the guess is low
			else if (POP < random){
				JOptionPane.showMessageDialog(null, "Too Low,");
			}
			
				// 10. tell them it's too low
		}
		// 12. tell them they lose
		JOptionPane.showMessageDialog(null, "You lose!!!");
	}

}


