import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox extends JFrame implements ActionListener {
	
	JButton button;
	JCheckBox checkbox;
	
	CheckBox ()
	{   

		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		
		checkbox = new JCheckBox();
		checkbox.setVisible(true);
		checkbox.setText("I am not a Robot");
		checkbox.setFocusable(false);
		checkbox.setFont(new Font("Consolas", Font.PLAIN,28));
		
		this.add(button);
		this.add(checkbox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button)
		{
			
			System.out.println(checkbox.isSelected());
		}
	}
   
}
