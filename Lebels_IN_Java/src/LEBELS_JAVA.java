
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LEBELS_JAVA {
	
	LEBELS_JAVA ()
	{
		//JLebel ..are GUI disolays AREA for a string text ,image or both
		ImageIcon icon = new ImageIcon("chris-kursikowski-ze5wHM9kplc-unsplash~2.jpg");
		JLabel label =new JLabel(); // create a label
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		label.setText("This is a string of Text"); //set text as label
		label.setIcon(icon); //set Icon or image as a label
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(250,70,125));
		label.setFont(new Font("MV Boli",Font.PLAIN,22));
		label.setIconTextGap(-21);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBorder(border);
		//label.setBounds(0, 0,250,250);
		
		JFrame frame = new JFrame();
		frame.setTitle("This Is GUI Interface");
		frame.setVisible(true);
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		//frame.setLayout(null);
		frame.pack();
	}
	
	 public static void main(String[] args) {
     
		new LEBELS_JAVA(); 
}
	 }