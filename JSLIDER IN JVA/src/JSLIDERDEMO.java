import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSLIDERDEMO implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	JSLIDERDEMO()
	{
		    frame = new JFrame("Slider track");
		    panel = new JPanel();
		    label = new JLabel();
		    //set slider min,max and initial pointer value within the slider round brackets
		    slider =new JSlider(0,100,50);
		    
		   slider.setPreferredSize(new Dimension(420,200));
		   
		   slider.setPaintTicks(true);
		   slider.setMinorTickSpacing(10);//add dimension ticks at interval of 10 units within our slider.
		   
		   slider.setPaintTrack(true);
		   slider.setMajorTickSpacing(25);//set bigger Ticks at interval of 25
		   
		   slider.setPaintLabels(true);//add number to our bigger ticks
		   slider.setFont(new Font("MV BOLI",Font.PLAIN,15));// Change the font of the number in our slider
		   
		   slider.setOrientation(SwingConstants.VERTICAL); //change slider to vertical
		   slider.addChangeListener(this);//To give the current value every time we adjust our knob
		   slider.setBackground(Color.CYAN);
		   
		   label.setText("°C ="+slider.getValue());
		   label.setFont(new Font("MV BOLI",Font.PLAIN,20));
		   
		   panel.setBackground(Color.CYAN);
		   
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setSize(450,450);
		   frame.setVisible(true);
		   
		   panel.add(slider);
		   panel.add(label);
		   frame.add(panel);
	}
	

	@Override
	public void stateChanged(ChangeEvent e) {
		
		label.setText("°C ="+slider.getValue());//Execute this block and return current value every time we Adjust our knob. 
		
	}

}
