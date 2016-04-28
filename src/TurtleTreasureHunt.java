import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/** Note: You will need the latest version of the TKP jar: http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar **/

public class TurtleTreasureHunt implements KeyEventDispatcher {

	int tortoiseSpeed = 5;

	private void goUp() {
		// 1. Make the tortoise move up the screen
Tortoise.setAngle(0);
Tortoise.move(3);
	}

	private void goDown() {
		// 2. make the tortoise move down the screen
Tortoise.setAngle(180);
Tortoise.move(3);
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		// Hint: the turn() method lags more than setAngle()
Tortoise.setAngle(270);
	Tortoise.move(3);
	
	}

	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.setAngle(90);
	Tortoise.move(3);
	}

	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 5. Print out the variables for tortoiseLocationX and tortoiseLocationY
System.out.println(tortoiseLocationX);
System.out.println(tortoiseLocationY);
		// 6. If tortoise is at same location as the little girl,
		// 			make a pop-up tell the Tortoise where to go next
if (tortoiseLocationX == 482 && tortoiseLocationY == 303){
	JOptionPane.showMessageDialog(null, "The Girl: Hey I need help get rid of this lock, the fish in the swamp knows where the key is");
}
	
		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)
else if (tortoiseLocationX == 353 && tortoiseLocationY == 408){
	JOptionPane.showMessageDialog(null, "Fishy: Oh hey there you scared me...");
	JOptionPane.showMessageDialog(null, "Fishy: Huh the key the robo pirate had it when I cheked");
}
else if (tortoiseLocationX == 383 && tortoiseLocationY == 267){
	JOptionPane.showMessageDialog(null, "Robo Pirate: -_-");
	JOptionPane.showMessageDialog(null, "(Mabye the birds know what happen)");
}
	
	else if (tortoiseLocationX == 392 && tortoiseLocationY == 105){
		JOptionPane.showMessageDialog(null, "The Bird: Hey *squack do you mind we are trying to find food");
		JOptionPane.showMessageDialog(null, "(Mabye the boy has some bird food)");
	}
	else if (tortoiseLocationX == 170 && tortoiseLocationY == 291){
		JOptionPane.showMessageDialog(null, "The Boy: Hey there how are you");
		JOptionPane.showMessageDialog(null, "Huh, bird food sure here");
	}
	else if (tortoiseLocationX == 389 && tortoiseLocationY == 102){
		JOptionPane.showMessageDialog(null, "The Bird: What do you ... ");
		JOptionPane.showMessageDialog(null, "Oh food thanks");
		JOptionPane.showMessageDialog(null, "Huh the robot he's mad because he shoot his voice box in the cannon you can get it at the skull");
	}
	else if (tortoiseLocationX == 197 && tortoiseLocationY == 87){
		JOptionPane.showMessageDialog(null, "(You got a voice box)");
	}
	
	else if (tortoiseLocationX == 383  && tortoiseLocationY == 279){
		JOptionPane.showMessageDialog(null, "Robo Pirate: Thank you");
	JOptionPane.showMessageDialog(null, "The key oh i put in a bottle, why? ^_^");
	}
	else if (tortoiseLocationX == 284  && tortoiseLocationY == 360){
		JOptionPane.showMessageDialog(null, "(You got a key)");
	}
	else if (tortoiseLocationX == 479  && tortoiseLocationY == 300){
		JOptionPane.showMessageDialog(null, "Thank you now I give you a prize...");
		JOptionPane.showMessageDialog(null, "All You Can Eat Pizza");
	}

	}
	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want, and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground("file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null, "Ask the little girl for help with your quest. Press the space bar to ask.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new TurtleTreasureHunt().go();
	}
}



