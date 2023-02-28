package gui;
import javax.swing.*;


public class Shapes_5Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = JOptionPane.showInputDialog(
				"Enter 1 to draw rectangles\n" + "Enter 2 to draw ovals");
		
		int choice = Integer.parseInt(input); // conver input to int
		
		//create the panel with the user input
		Shapes_5 panel = new Shapes_5(choice);
		
		JFrame application = new JFrame(); // creates a new jframe (window)
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
		
		

	}

}
