import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JlayeredPane {
	 public static void main(String[] args) {
		 
	/* JLayeredPane ..swing container that provide ,
	 * third dimention for positioning components i.e depth,Z-index
	 */
    //create some label and add them to our Layeredpane
	JLabel label1 = new JLabel();
	label1.setOpaque(true);
	label1.setBackground(Color.RED);
	label1.setBounds(50, 50, 200, 200);
	
	JLabel label2 = new JLabel();
	label2.setOpaque(true);
	label2.setBackground(Color.GREEN);
	label2.setBounds(100, 100, 200, 200);
	
	JLabel label3 = new JLabel();
	label3.setOpaque(true);
	label3.setBackground(Color.YELLOW);
	label3.setBounds(150, 150, 200, 200);
	
	//create a layeredpane
    JLayeredPane layeredpane = new JLayeredPane();
    layeredpane.setBounds(0, 0, 500, 500);
    layeredpane.add(label1,Integer.valueOf(0));//wrapper Integer help to position Label.
    layeredpane.add(label2,Integer.valueOf(1));
    layeredpane.add(label3,Integer.valueOf(2));
    
    // create Frame
    JFrame frame = new JFrame();
     frame.add(layeredpane);//add layeredpane to a frame
	 frame.setVisible(true);
	 frame.setTitle("This is GUI interface");
	 frame.setSize(500, 500);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// frame.setLayout(null);  
}
}