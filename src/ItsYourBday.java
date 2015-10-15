import javax.swing.JOptionPane;

public class ItsYourBday
{

	public static void main(String[] args)
	{
String bub = JOptionPane.showInputDialog("When is your birthday?");
if (bub .equals("10/13") )
{
 JOptionPane.showMessageDialog(null, "Happy Birthday");
}
else {
	JOptionPane.showMessageDialog(null, "");
}
	}

}
