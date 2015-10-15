
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class TortoiseColorChooser
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++)
		{

			// 3. ask the user what color they would like the tortoise to draw
			String dino = JOptionPane.showInputDialog("what color u like");
			// 4. use an if/else statement to set the pen color that the user requested
			if (dino.equals("red"))
			{
				Tortoise.setPenColor(Color.red);
			} else
			{
				Tortoise.setPenColor(Colors.getRandomColor());
			}
			// 5. if the user doesn’t enter anything, choose a random color
Tortoise.setAnimal(Animals.Spider);
			// 6. put a loop around your code so that you keep asking the user for more colors & drawing them

			// 2. set the pen width to 10
			Tortoise.setPenWidth(10);
			// 1. make the tortoise draw a shape (this will take more than one line of code)
			Tortoise.move(100);
			Tortoise.turn(140);
			Tortoise.move(120);
			Tortoise.turn(120);
			Tortoise.move(90);
		}
	}
}
