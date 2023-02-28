package gui;
//lidhet me klasen MyLine.java

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;
import javax.swing.JFrame;


public class DrawPanel1 extends JPanel {
    private SecureRandom r = new SecureRandom();
    private MyLine[] lines;//array me vija

    public DrawPanel1() {
        setBackground(Color.WHITE);

        lines = new MyLine[5 + r.nextInt(5)];

        //krijimi i vijave
        for(int i = 0; i < lines.length; i++) {
            //gjenerimi i koordinatave random
            int x1 = r.nextInt(300);
            int x2 = r.nextInt(300);
            int y1 = r.nextInt(300);
            int y2 = r.nextInt(300);

            //gjenerimi rastesor i ngjyrave
            Color color = new Color(r.nextInt(256),r.nextInt(256),
            r.nextInt(256));

            //shtimi i vijes ne vektorin qe permban vijat gati per tu paraqitur
            lines[i] = new MyLine(x1, y1, x2, y2, color);

        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //vizatimi i vijave
        for(MyLine line:lines) {
            line.draw(g);
        }

    }

    public static void main(String[] args) {
        DrawPanel1 panel = new DrawPanel1();

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300,300);
        app.setVisible(true);
    }
    
}
