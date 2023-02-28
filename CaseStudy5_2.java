//Modify Exercise 5.16 from the end-of-chapter exercises to read
//input using dialogs and to
//display the bar chart using rectangles of varying lengths.

package gui;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CaseStudy5_2 extends JPanel {
    private int choice; //user choice for which shape to draw
	
	//constructor sets user choice
	public CaseStudy5_2(int userChoice) {
		choice = userChoice;
	}
	
	//draws a cascade of shapes starting from the origin
	//vizaton aq drejtkendesha sa thote perdoruesi nga 1-30
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		
		for (int i = 0; i < choice; i++) {
			
			g.drawRect(width/2 - i*10, height/2 - i * 10, 10 + 2*i * 10, 10 + 2*i * 10);
				
				
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog(
				"Shkruaj nr e drejtkendeshave qe do te vizatohen nga 1-30");
		
		int choice = Integer.parseInt(input); // conver input to int
		
		//create the panel with the user input
		CaseStudy5_2 panel = new CaseStudy5_2(choice);
		
		JFrame application = new JFrame(); // creates a new jframe (window)
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(700, 700);
		application.setVisible(true);

	}

}
