import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame implements ActionListener{
	
	JComboBox combobox;
	ComboBox()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		// create a wrapper class 
		String[] footballClub = {"Manchester United","Liverpool","Asernal","Chelsea","Manchester city"};
		//create a combo box and pass a wrapper class to it.
	    combobox = new JComboBox(footballClub);
	    // add actionalistener to our combobox
	    combobox.addActionListener(this);
	    /* Other action you can perform on combobox
	     * combobox.setEditable(true);
	     * System.out.println(combobox.getItemCount());
	     * combobox.addItem("Fulham");
	     * combobox.insertItemAt("Brendford", 1);
	     * combobox.removeItem("Asernal");
	     * combobox.removeItemAt(2);
	     * combobox.removeAllItems();
	    */
	   
	   		//add combo box to frame
		this.add(combobox);
		
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == combobox)
		{
			System.out.println(combobox.getSelectedItem());
		}
		
	}

}
