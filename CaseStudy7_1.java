package gui;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class CaseStudy7_1 extends JPanel {

	private String[] directions = {"down", "left", "up", "right"}; //drejtimet e vijave qe do vizatojme spiralet
	private int nivelet = 0; //sa nivele spiralesh do te vizatojme
	private int spiralen = 0; //cila lloj spirale do vizatohet (1-drejkendore, 2-rrethore)
    
    
	
	public CaseStudy7_1(int nivelet, int spirale) {
		this.nivelet = nivelet;
		spiralen = spirale;
		setBackground(Color.WHITE);
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();

		//gjatesia e dy vijave fillestare
		int gj = (height - 20) / nivelet; //-20 sepse duam te leme nje pjese te window bosh

		//gjatesia e rrezes fillestare
		int radius = width/nivelet;

		//loop qe vizaton spiralen
		g.setColor(Color.BLUE);

		

		if (spiralen == 1) { //vizatimi i spirales drejtkendore

			//variabla ndihmes per vazatimin
		    int x = width/2;
		    int y = height/2;


			for(int i = 0; i < 4*nivelet; i++) {

				
	
				//percaktimi i drejtimi ne te cilin do te vizatojme vijen
				switch(directions[i%4]) {
	
					case "down":
					g.drawLine(x, y, x , y + (i/2 + 1)* gj);
					y+=(i/2 + 1)* gj;
					break;
	
					case "left":
					g.drawLine(x, y, x- (i/2 + 1)*gj, y);
					x-=(i/2 + 1)*gj;
					break;
	
					case "up":
					g.drawLine(x, y, x, y - (i/2 + 1)*gj);
					y-=(i/2 + 1)*gj;
					break;
	
					case "right" :
					g.drawLine(x, y, x + (i/2 + 1) * gj, y);
					x+=(i/2 + 1) * gj;
					break;
				}
			}			

		} else { //vizatimi i spirales rrethore

			//variabla ndihmes per vazatimin
		    int x1 = width/2;
		    int x = 0;
		    int y1 = height/2;
			for(int i = 1; i <= 4*nivelet; i++) {

					
				//spiralet rrethore perbehen nga dy lloje gjysmerrathes: lart ose poshte

				if(i%2 == 1) { //vizatojme gjysmerrethin lart
					x = x1-radius*(i - 1);
					g.drawArc(x, y1-radius*i/2, radius +2*radius*i, radius +2*radius*i , 0, 180);
					
					

				} else {//gjysmerrethi poshte
					g.drawArc(x, y1 - radius*i/2, radius +2*radius*i , radius +2*radius*i, 0, -180);
					
				}

		    }

		}
		

	}
	
	
	//perafershisht si program
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CaseStudy7_1 panel = new CaseStudy7_1(50,2);
		JFrame app = new JFrame();

		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(300,300);
		app.setVisible(true);

	}

}
