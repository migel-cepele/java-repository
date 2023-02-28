package gui;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.security.SecureRandom;

public class CaseStudy6_1 extends JPanel{
	
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		
		//ngjyrat rgb qe duhen per vizatimet
		int red1;
		int green1;
		int blue1;
		
		
		//objekt qe gjeneron nr nga 1 - 255 qe na duhen per RGB
		SecureRandom rgb = new SecureRandom();
						
		for(int i = 5; i >= 1; i--) {
			
			red1 = rgb.nextInt(256);
			green1 = rgb.nextInt(256);
			blue1 = rgb.nextInt(256);
			
			
			g.setColor(new Color(red1,green1,blue1)); 
			
			
			if (i % 2 == 1) {
				//perdorimi i 
				//konstruktorit te klases color pa krijuar adrese per ruajtjen
                // e objektit
				
				g.fillOval(width/2- 2*i*10, height/2-2*i*10, 4*i * 10, 4*i * 10);
				
			} else {
				
				g.fillOval(width/2-2*i*10, height/2-2*i*10, 4*i * 10, 4*i * 10);
			}
			
				
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame application = new JFrame();
		CaseStudy6_1 panel = new CaseStudy6_1();
		
		application.add(panel);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(300, 300);
		application.setVisible(true);

	}

}
