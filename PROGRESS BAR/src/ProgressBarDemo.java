import java.awt.Color;
import java.awt.Font;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame("Progress Bar");
	JProgressBar bar = new JProgressBar(0,100);// set the limit 
	
	ProgressBarDemo()
	{
		bar.setValue(0);
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true);//add a percentage bar or logo.
		bar.setFont(new Font("MV BOLI",Font.BOLD,20));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		// set out frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(450, 450);
	    frame.setLayout(null);
	    frame.setVisible(true);
	    
	    frame.add(bar);
	    
	    fill();
	}
	
  public void fill()
  {
	  //bar.setValue(10);
	  int counter = 0;
	  
	  while(counter <= 100)
	  {
		  bar.setValue(counter); 
		  // add exception
		  try {
		       Thread.sleep(100L);//The L suffix make the thread.sleep() a long millis which is recognize by sleep method
		  }
		  catch(InterruptedException e) {
			  e.printStackTrace();
		  }
		  
		  counter +=1;
	  }
	  bar.setString("Done");
  }
}
