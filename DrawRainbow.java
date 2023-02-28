package gui;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel {
	
	//deklarimi i indigo dhe violet
	private final static Color VIOLET = new Color(128,0,128);
	private final static Color INDIGO = new Color(75,0,130);
	
	//ngjyrat qe permban nje ylber duke u nisur nga rrethi me i brendshem
	private Color[] colors = {Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
			Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
	
	//konstruktori
	public DrawRainbow() {
		setBackground(Color.WHITE); //backgroundi eshte white
	}
	
	//vizaton ylberin npm concentric arcs
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int radius = 20; // radius of an arc
		//vizaton ylberin ne bottom-center
		int centerX = getWidth() / 2;
		int centerY = getHeight() - 10;

		for(int i = colors.length; i > 0; i--) {

			g.setColor(colors[i - 1]);

			g.fillArc(centerX - i * radius, centerY - i*radius, i * radius * 2, i* radius * 2, 0, 180);
		}
		
	}
	

}
