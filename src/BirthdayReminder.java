
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder
{

	public static void main(String[] args)
	{

		// 1. correct the birthdays for your family below
		String momsBirthday = "March 13th";
		String dadsBirthday = "November 21th";
		String myBirthday = "May 1st";

		// 2. Find out which birthday the user wants and and store their response in a variable

		// 3. Print out what the user typed
		String bub = JOptionPane.showInputDialog("please enter code");
		// 4. if user asked for "mom"
		// print mom's birthday
		if (bub.equals("mum"))
		{
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		else if (bub.equals("dada"))
		{
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
		// print myBirthday
		else if (bub.equals("bub"))
		{
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}
	}
}
