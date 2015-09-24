import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int bub = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
String dino= JOptionPane.showInputDialog("This thing all things devours:\nBirds, beasts, trees, flowers;\nGnaws iron, bites steel;\nGrinds hard stones to meal;\nSlays king, ruins town,And beats high mountain down.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(dino.equals("time")){
	JOptionPane.showMessageDialog(null, "yeseses");
	bub++;
	//bub = bub + 1;
	//bub += 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else{
	JOptionPane.showMessageDialog(null, "wrong its a time");
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score adds up to " + bub);
	}
}

