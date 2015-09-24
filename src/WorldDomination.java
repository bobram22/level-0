import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String bob = JOptionPane.showInputDialog("DO YOU KNOW HOW TO CODE");
		// 2. If they say "yes", tell them they will rule the world.
		if (bob.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Today the computer, tommorow the world");
		}else{
			JOptionPane.showMessageDialog(null, "today Mcdonald, tommorow Jack in the Box");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}
