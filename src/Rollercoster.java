import javax.swing.JOptionPane;

public class Rollercoster {
	public static void main(String[] args) {
		String tallness = JOptionPane.showInputDialog("How tall are you");
		int tallnezz = Integer.parseInt(tallness);
		if(tallnezz > 4){
			JOptionPane.showMessageDialog(null, "Get on and don't ask questions");
		}
		else{
			JOptionPane.showMessageDialog(null, "Go back to seas");
		}
	}
}
