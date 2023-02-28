package gui;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawPanel3_8_1 extends JPanel {
	
	protected SecureRandom r = new SecureRandom();
	protected MyRectangle8_1[] rectangles;
	protected MyOval8_1[] ovals;
	
	 //objekt qe gjeneron vlera rastesore
	
	public DrawPanel3_8_1() {
		rectangles = new MyRectangle8_1[1+r.nextInt(5)];
		ovals = new MyOval8_1[1 + r.nextInt(5)];
		
		for(int i = 0; i < rectangles.length; i++) {
			int x1 = r.nextInt(300);
			int x2 = r.nextInt(300);
			int y1 = r.nextInt(300);
			int y2 = r.nextInt(300);
			
			Color color = new Color(r.nextInt(256),
					r.nextInt(256),r.nextInt(256));
			
			int filled = r.nextInt(2);
			rectangles[i] = new MyRectangle8_1(x1,y1,x2,y2,color,filled);
		}
		
		for(int i = 0; i < ovals.length; i++) {
			int x1 = r.nextInt(300);
			int x2 = r.nextInt(300);
			int y1 = r.nextInt(300);
			int y2 = r.nextInt(300);
			
			Color color = new Color(r.nextInt(256),
					r.nextInt(256),r.nextInt(256));
			
			int filled = r.nextInt(2);
			ovals[i] = new MyOval8_1(x1,y1,x2,y2,color,filled);
		}
	}
	
	public void paintComponent(Graphics g) {
		for(MyRectangle8_1 rect:rectangles) {
			rect.drawRect(g);
			
		}
		for(MyOval8_1 oval:ovals) {
			oval.drawOval(g);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawPanel3_8_1 panel = new DrawPanel3_8_1();

	      JFrame app = new JFrame();

	      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      app.add(panel);
	      app.setSize(300,300);
	      app.setVisible(true);

	}

}
