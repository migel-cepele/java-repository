package gui;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes_5 extends JPanel {
	
	private int choice; //user choice for which shape to draw
	
	//constructor sets user choice
	public Shapes_5(int userChoice) {
		choice = userChoice;
	}
	
	//draws a cascade of shapes starting from the origin
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int i = 0; i < 10; i++) {
			switch(choice) {
			case 1:
				//draw rectangles
				g.drawRect(10+ i*10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
				
			case 2: //draw ovals
				g.drawOval(10 + 10 * i, 10 + 10 * i, 50 + 10 * i, 50 + 10 * i);
				break;
			
				
			}
		}
	}

}
