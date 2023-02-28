package gui;
import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle8_1 {
	
	 private int x1;
	    private int x2;
	    private int y1;
	    private int y2;
	    private boolean filled;
	    private Color color; //ngjyra e figures gjeometrike

	    //konstruktori
	    public MyRectangle8_1(int x1, int y1, int x2, int y2,
	    		Color color, int filled) {
	        this.x1 = x1;
	        this.y1 = y1;
	        this.color = color;
	        this.x2 = x2;
	        this.y2 = y2;
            if((filled == 1)||(filled==0)) {
	        	
	        	if(filled==1)
	        		this.filled = true;
	        	else
	        		this.filled = false;
	        }else
	        	this.filled = false;
	    }
	    
	    public int getUpperLeftY() {
	    	return Math.min(y1, y2);
	    }
	    
	    public int getUpperLeftX() {
	    	return Math.min(x1, x2);
	    }
	    
	    public int getWidhth() {
	    	return Math.max(x2, x1) - Math.min(x2, x1);
	    }
	    
	    public int getHeight() {
	    	return Math.max(y2, y1) - Math.min(y2, y1);
	    }

	    //vizatimi i vijes ne ngjyren e specifikuar
	    public void drawRect(Graphics g) {
	    	g.setColor(color);
	        if(filled == true) {
	        	
	        	g.fillRect(getUpperLeftX(), getUpperLeftY(),
	        			getWidhth(), getHeight());
	        } else {
	        	g.drawRect(getUpperLeftX(), getUpperLeftY(),
	        			getWidhth(), getHeight());
	        }
	    }

}
