package gui;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.security.SecureRandom;

public class CaseStudy6_2 extends JPanel{
	
		
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		
		//ngjyrat rgb qe duhen per vizatimet
		int red1;
		int green1;
		int blue1;
		
		//permasat e figurave qe do vizatohen
		int gjatesia;
		int gjeresia;
		
		//koordinatat e fillestare te figurave
		int x;
		int y;
		
		//objekt qe gjeneron nr random qe na duhen per RGB dhe permasat e figurave
		
		SecureRandom r = new SecureRandom();
		
		
		
		
		for(int i = 1; i <= 10; i++) {
			//ngjyra rgb
			red1 = r.nextInt(256);
			green1 = r.nextInt(256);
			blue1 = r.nextInt(256);
			
			//permasat
			gjatesia = r.nextInt(width/2);
			gjeresia = r.nextInt(height/2);
			
			//koordinatat fillestare
			x = r.nextInt(width - gjatesia);
			y = r.nextInt(height - gjeresia);
			
			g.setColor(new Color(red1,green1,blue1)); //perdorimi i 
			//konstruktorit te klases color pa krijuar adrese per ruajtjen
            // e objektit
			
			
			if (i % 2 == 1) {
				
				g.fillRect(x, y, gjatesia, gjeresia);
				
			} else {
				
				g.fillOval(x, y, gjatesia, gjeresia);
			}
			
				
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame application = new JFrame();
		CaseStudy6_2 panel = new CaseStudy6_2();
		
		application.add(panel);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(300, 300);
		application.setVisible(true);

	}

}