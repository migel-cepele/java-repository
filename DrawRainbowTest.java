package gui;
import javax.swing.JFrame;

public class DrawRainbowTest {
    public static void main(String[] args) {

        DrawRainbow panel = new DrawRainbow();
        JFrame a = new JFrame();

        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.add(panel);
        a.setSize(400, 250);
        a.setVisible(true);
        
    }
}
