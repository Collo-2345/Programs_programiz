import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textfield;
	MyFrame()
	{
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton("Submit");
		button.addActionListener(this);
	
		textfield = new JTextField();
		textfield.setPreferredSize(new Dimension(250,40));
		textfield.setFont(new Font("Consolas",Font.PLAIN,21));
		textfield.setForeground(new Color(0x00FF00));
		textfield.setBackground(Color.black);
		textfield.setCaretColor(Color.white);
		textfield.setText("Type your username");
		
		this.add(button);
		this.add(textfield);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button)
		{
			System.out.println("Welcome "+textfield.getText());
			
			button.setEnabled(false);
			textfield.setEditable(false);
			
		}
		
	}

}
