// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String Diego = "good with Videogames";
String Nancy = "good social skills";
String Khia = "invisibility";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String dino = JOptionPane.showInputDialog("What is your name");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if(dino .equals("Khia")){
	JOptionPane.showMessageDialog(null, Khia);
}
else if (dino .equals("Nancy")){
	JOptionPane.showMessageDialog(null, Nancy);
}
else if (dino .equals("Diego")){
	JOptionPane.showMessageDialog(null, Diego);
}
	}
}

