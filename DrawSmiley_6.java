package gui;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawSmiley_6 extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//draw the face
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		
		//draw the eyes
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		//draw the mouth
		g.fillOval(50, 110, 120, 60);
		
		//touch up - the mouth into a smile
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
	}
//krijon framen ku do vendoset paneli i krijuar
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawSmiley_6 panel = new DrawSmiley_6();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);

	}

}
