import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutManager {
	 public static void main(String[] args) {
	/*
	 * Layout Manager... Define Natural layout for component withing a container
	 * FlowLayout ...Place component in a row,sized at their preferred size
	 * if the horinzontal space int the container is too small ,
	 * the flowlayout class use the next avaiblerow. 
	 * */
	 //create Jframe
	 JFrame frame = new JFrame();
	 frame.setVisible(true);
	 frame.setTitle("This is GUI interface");
	 frame.setSize(500, 500);
	 frame.setLayout(new FlowLayout());  
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 // create some component to demonstrate the Effect of FlowLayout
	/* JButton button1 = new JButton();
	 button1.setText("1");
	 
	 frame.add(button1);*/
	 
	 // we can create  panel the add button to a panel and then we add panel to frame
	 //create Panel
	 JPanel panel = new JPanel();
	 panel.setLayout(new FlowLayout());
	 panel.setPreferredSize(new Dimension(250,250));
	 panel.setBackground(Color.gray);
	 panel.setVisible(true);
	 
	 //create several button  using this syntax and adding the to panel
	
	 panel.add( new JButton("1"));
	 panel.add( new JButton("2"));
	 panel.add( new JButton("3"));
	 panel.add( new JButton("4"));
	 panel.add( new JButton("5"));
	 panel.add( new JButton("6"));
	 panel.add( new JButton("7"));
	 panel.add( new JButton("8"));
	 panel.add( new JButton("9"));
	 
	 //add panel to frame
	 frame.add(panel);
}
}