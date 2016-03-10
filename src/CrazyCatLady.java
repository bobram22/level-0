import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
 String cats =  JOptionPane.showInputDialog("how many cats do you have");
		// 2. Convert their answer into an int
 int Gatos =	Integer.parseInt(cats);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if(Gatos > 3){
	JOptionPane.showMessageDialog(null, "What Are YOU A Crazy Cat Lady");
}
		// 4. If they have 3 or less, call the method below to show them a cat video
else if (Gatos < 3 && Gatos > 0){
	playVideo("https://www.youtube.com/watch?v=uEYRZE9JcFA");
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
else if (Gatos == 0){
	playVideo("https://www.youtube.com/watch?v=dMZjJ0803pM");
}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


