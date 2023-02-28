package gui;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CaseStudy9 extends DrawPanel3_8_1{
	
	public CaseStudy9() {
		
	}
	
	public String toString() {
		return String.format("Rectangles: %d, Ovals: %d%n", rectangles.length, ovals.length);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaseStudy9 r = new CaseStudy9();
		
		//krijimi i nje JLabel me argument ne konstruktor metoden qe jep nr e figurave nga DrawPanel3_8_1
		JLabel k = new JLabel(r.toString());
		
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(k, BorderLayout.SOUTH);
		app.add(r);
		app.setSize(300, 300);
		app.setVisible(true);
		
		
		

	}
	



}
