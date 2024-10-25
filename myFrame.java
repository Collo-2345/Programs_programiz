import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class myFrame extends JFrame implements ActionListener {
	 JButton button;//making our Button Global Var
	myFrame()
	{
		 //create button and add it to Our JFrame
		//we need also To implement Class listener to make our button acative
	      button = new JButton();//create Button using Jbutton 
	      button.setBounds(100,100,250,50);//set position for our button
	      button.addActionListener(this);//Make our Button Active
	      button.setText("Button");//name our button
	      
	      //modify Button
	      button.setFocusable(false);// remove border line sorrounding the button
	      button.setHorizontalTextPosition(JButton.CENTER);
	      button.setVerticalTextPosition(JButton.CENTER);
	      button.setFont(new Font("Comic sans",Font.BOLD,25));
	      button.setForeground(Color.BLACK);
	      button.setBackground(Color.LIGHT_GRAY);
	      button.setBorder(BorderFactory.createEtchedBorder());
	      //button.setEnabled(false);//for disable a button
	      
	      
	      
			this.setTitle("This Is GUI Interface");
			this.setVisible(true);
			this.setSize(500, 500);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(null);// create Jframe without anything
			this.add(button); //add button to frame
			
	}
 // this method is Generate by Acompiler once you implement class ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
	  // create a event that will tell as the action perform is cause by our button	
		
	  if(e.getSource() == button)
	  {
		  System.out.println("You Click Button");
		  //button.setEnabled(false); //disable after click
	  }
	}
}
