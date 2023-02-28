package gui;
import javax.swing.*;
import java.awt.Graphics;

public class CaseStudy5_1 extends JPanel{
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		for (int i = 0; i < 12; ++i) {
			
			g.drawOval(width / 2 - i * 10, height / 2 - i * 10, 10 + 2*i * 10, 10 +2* i * 10);
			//pika fillestare eshte sa gjysma e gjatesise dhe lartesise
			//me pas pika ne top - left zvogelohet me i * 10, ndersa width dhe length 
			//zmadhohen me 20 * i
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaseStudy5_1 shape = new CaseStudy5_1();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(shape);
		application.setSize(300, 300);
		application.setVisible(true);

	}

}
