package gui;
import java.awt.*;
import javax.swing.*;

public class CaseStudy4_2 extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); //therret paintComponent dhe ensures qe paneli shfaqet si duhet
		
		int width = getWidth(); //total width
		int height = getHeight(); //total height
		
		//draw a line from the upper left to lower right
		
		/*g.drawLine(0, 0, 15, height-15);
		g.drawLine(0, 0, 30, height-30);*/
		int i = 0;
		int linesToDraw = 15;
		int x = width / linesToDraw;
		int y = height/linesToDraw;
		
		
		while (i < 15) {
			
			
			
			g.drawLine(0, 0 + (i * y), 0 + (i * x), height); // top left corner
			
			g.drawLine(0, height - (i*y), 0 + (i * x), 0); //bottom left corner
			
			g.drawLine(width, 0 + (i*y), width - (i * x), height); // top right corner
			
			g.drawLine(width, height - (i * y), width - (i*x), 0); // bottom right corner
			
			
			++i;
			
		}
		
		//kjo sepse sistemi koordinativ ktu e ka origjinen ne cepin lart majtas te dritares
		
	}
	
	public static void main(String[] args) {
		//creates a panel that contains our drawing
		CaseStudy4_2 panel = new CaseStudy4_2();
				
		//create a new frame to hold the panel
		JFrame application = new JFrame();
				
		//set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		application.add(panel); //add the panel to the frame
		application.setSize(250,250); //set the size of the frame
		application.setVisible(true);//make the frame visible
		
	}

}

