import org.jointheleague.graphical.robot.Robot;

public class octgon {
	public static void main(String[] args) {
		Robot bub = new Robot();
	bub.penDown();
	bub.setSpeed(100);
		bub.turn(60);
	for (int i = 0; i < 7; i++) {
		bub.move(200);
	bub.turn(60);
	}
		
	
	}
	
}
