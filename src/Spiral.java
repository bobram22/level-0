import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot hi = new Robot();
		// 5. Set your robot's pen to the down position
hi.penDown();
		// 3. Set the robot to go at max speed (10)
hi.setSpeed(10);
		// 4. Do the following (steps 7-9) 75 times
for (int i = 0; i < 75; i++) {
	hi.turn(360/7);
	hi.setRandomPenColor();
	hi.move(5*i);
	hi.setPenWidth(i);
}
			// 7. Change the pen color to random
	
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	
			
	
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i

	}
}

