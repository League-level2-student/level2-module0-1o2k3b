package arrays;

import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	
	public static void main(String[] args) throws InterruptedException {
		//2. create an array of 5 robots.
		int w = 800;
		Robot[] five = new Robot[5];
		Robot.setWindowImage("races.jpeg");
		Random ran = new Random();
	

		//3. use a for loop to initialize the robots.
for(int r = 0; r<5; r++) {

	if(r == 0) {
		five[r] = new Robot();
		five[r].setY(r*100+100);
		five[r].setX(10);
		five[r].setAngle(90);
		five[r].setSpeed(30);
	}
	if(r == 2) {
		five[r] = new Robot("vic");
		five[r].setY(r*100+100);
		five[r].setX(10);
		five[r].setAngle(90);
		five[r].setSpeed(30);
	}
	if(r == 4) {
		five[r] = new Robot("batman");
		five[r].setY(r*100+100);
		five[r].setX(10);
		five[r].setAngle(90);
		five[r].setSpeed(20);
		}
	
}

	while(true) {
		five[4].move(ran.nextInt(100-30));
		five[2].move(ran.nextInt(100-30));
		five[0].move(ran.nextInt(100-30));
		Thread.sleep(1000);
		
		if(five[4].getX()>w) {
			JOptionPane.showInputDialog("bat-thing wins");
			break;
		}
		if(five[2].getX()>w) {
			JOptionPane.showInputDialog("vic-thing wins");
			break;
		}
		if(five[0].getX()>w) {
			JOptionPane.showInputDialog("robot-thing works");
			break;
		}
	}
	
	
	
	


}
			//4. make each robot start at the bottom of the screen, side by side, facing up

		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.

		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!

		//8. try different races with different amounts of robots.

		//9. make the robots race around a circular track.
	}


