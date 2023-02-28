package gui;
import java.awt.*;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // ensures qe paneli shfaqet si duhet
		
		int width = getWidth(); //total width
		int height = getHeight(); //total height
		
		//draw a line from the upper left to lower right
		g.drawLine(0, 0, width, height);
		
		//draw line from the lower left to upper right
		g.drawLine(0, height, width, 0);
	}

}
