import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JbuttonDemo extends JFrame implements ActionListener{

	JButton button;
	JbuttonDemo()
	{
		  button = new JButton("submit");
		  button.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(450,450);
		
		this.add(button);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button)
		{
			System.out.println("Button pressed.");
		}
	}
}
