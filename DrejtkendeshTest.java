package gui;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class DrejtkendeshTest extends JPanel{
	
	public static Drejtkendesh d[] = new Drejtkendesh[4]; //krijimi i vektorit me 4 objekte
	
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		   
		super.setBackground(Color.DARK_GRAY);
		   
		
		int x = 20;
		
		//afishimi i objekteve se bashku me atributet ne dritare
        for(int i = 0; i < 4; i++) {
        	
        	
        	
        	g.setColor(Color.WHITE);
        	g.drawString("Objekti: " + (i+1), 100, x+=40);
 		    g.drawString("Gjatesia: " + d[i].getGjatesia(), 100, x+=20);
 		    g.drawString("Gjeresia: " + d[i].getGjeresia(), 100, x+=20);
 		    g.drawString("Eshte katror: " + d[i].eshteKatror(), 100, x+=20);
 		    g.drawString("Sip: " + d[i].siperfaqa(), 100, x+=20);
 		    g.drawString("Per: " + d[i].perimetri(), 100, x+=20);

            
        }						   		  
		   
	   }
	
    public static void main(String[] args) {
    	
    	//plotesimi i objekteve te vektorit
        for(int i = 0; i < 4; i++) {
        	
        	boolean k = true; //variabel qe kontrollon ciklin e meposhtem
        	
        	while(k) { //cikel qe siguron qe vlerat te jene te vlefshme
        		double gjatesia;
                double gjeresia;
                gjatesia = Double.parseDouble(JOptionPane.showInputDialog("vendos gjatesine per objektin" + (i+1)));
                gjeresia = Double.parseDouble(JOptionPane.showInputDialog("vendos gjeresine per objektin" + (i+1))); 
                
                d[i] = new Drejtkendesh(gjatesia,gjeresia);
                if((d[i].getGjatesia() <= 0.0) && (d[i].getGjeresia() <= 0.0))
                	k= true;
                else
                	k = false;
                
        	}
        	        	
            System.out.printf("Objejkti %d%n%s%n%n", i+1, d[i].toString()); //gjithashtu atributet do te afishohen ne konsole
            
        }
    	
    	JFrame app = new JFrame();
       
        
        DrejtkendeshTest c = new DrejtkendeshTest();

        
        app.add(c);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(500,700);
        app.setVisible(true);
    }
}
