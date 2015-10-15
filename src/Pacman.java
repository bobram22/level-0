import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class Pacman
{
	public static void main(String[] args)
	{
		Robot Tortoise = new Robot();
		Tortoise.changeRobot("/Users/league/Desktop/level-0/src/pacman.robi");
		for (int i = 0; i < 10; i++)
		{

			// 3. ask the user what color they would like the tortoise to draw
			String dino = JOptionPane.showInputDialog("what color u like");
			Tortoise.penDown();
			// 4. use an if/else statement to set the pen color that the user requested
			if (dino.equals("red"))
			{
				Tortoise.setPenColor(Color.red);
			} else
			{
				Tortoise.setPenColor(Colors.getRandomColor());
			}
			// 5. if the user doesn’t enter anything, choose a random color

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
