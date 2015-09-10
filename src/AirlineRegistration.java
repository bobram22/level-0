import javax.swing.JOptionPane;

/* Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
	String turtle =	JOptionPane.showInputDialog(null, "first name please");
	String hi = JOptionPane.showInputDialog("last name aswell");
	String bub =	JOptionPane.showInputDialog(null, "travleing to");
	String dino =	JOptionPane.showInputDialog(null, "birthday");
	String jeff =	JOptionPane.showInputDialog(null, "male or feamale");
	JOptionPane.showMessageDialog(null, hi + turtle + dino + jeff + " \\ " + bub );
	}
}

	