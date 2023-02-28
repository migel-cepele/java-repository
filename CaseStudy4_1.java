package gui;
import java.awt.*;
import javax.swing.*;

public class CaseStudy4_1 extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); //therret paintComponent dhe ensures qe paneli shfaqet si duhet
		
		int width = getWidth(); //total width
		int height = getHeight(); //total height
		
		//draw a line from the upper left to lower right
		
		/*g.drawLine(0, 0, 15, height-15);
		g.drawLine(0, 0, 30, height-30);*/
		int i = 0;
		int x = width / 15; // 15 eshte vijat qe duhen vizatuar
		int y = height / 15;
		
		while (i < 15) {
			
			g.drawLine(0, 0, width - (i * x), 0 + (i * y)); // top left corner
			
			g.drawLine(width, height, 0 + (i * x), height - (i*y)); //bottom right corner
			
			g.drawLine(width, 0, 0 + (i * x), 0 + (i * y)); // top right corner
			
			g.drawLine(0, height, width - (i*x), height - (i * y)); // bottom left corner
			
			
			++i;
			
		}
		
		//kjo sepse sistemi koordinativ ktu e ka origjinen ne cepin lart majtas te dritares
		
	}
	
	public static void main(String[] args) {
		//creates a panel that contains our drawing
		CaseStudy4_1 panel = new CaseStudy4_1();
				
		//create a new frame to hold the panel
		JFrame application = new JFrame();
				
		//set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		application.add(panel); //add the panel to the frame
		application.setSize(250,250); //set the size of the frame
		application.setVisible(true);//make the frame visible
		
	}

}
