package gui;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//krijon nje label me tekst
		JLabel northLabel = new JLabel("North");

		//krijon nje ikone nga nje imazh qe mund ta perdorim ne JLabel
		ImageIcon labelIcon = new ImageIcon("/Users/USER/OneDrive/Pictures/breaking-bad-walter.gif");

		

		//krijon nje label me nje ikon ne vend te tekstit
		JLabel centerLabel = new JLabel(labelIcon);

		//krijon nje tjeter label qe te shfaqi tekst (gjithashtu dhe ikone)
		JLabel southLabel = new JLabel(labelIcon);

		//set the label to display text (gjithashtu dhe ikone)
		southLabel.setText("south");

		//krjimi i nje frame per te mbajtur labels
		JFrame app = new JFrame();

		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//shtimi i labels ne frame. argumenti i dyte specifikon se ku do te shtohet label ne 
		//frame

		app.add(northLabel, BorderLayout.NORTH);
		app.add(centerLabel, BorderLayout.CENTER);
		app.add(southLabel, BorderLayout.SOUTH);

		app.setSize(300, 300);
		app.setVisible(true);

	}

}
