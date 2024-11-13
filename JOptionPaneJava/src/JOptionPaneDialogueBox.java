import javax.swing.JOptionPane;

public class JOptionPaneDialogueBox {
	 public static void main(String[] args) {
		 
	/*JOptionPane ...pop up a standard dialogue box that prompt,
	 * User for some Value or output some Information
	 * Thier are several JoptionPane (dialogue boxes) we can use in java
	  */
 /*First Type...*/
	//JOptionPane.showMessageDialog(null, "Hello.", "Message", JOptionPane.PLAIN_MESSAGE);
     // JOptionPane.showMessageDialog(null, "Here is some more useless info.", "Information", JOptionPane.INFORMATION_MESSAGE);
     //JOptionPane.showMessageDialog(null, "Can't Connect to network.", "Error Message", JOptionPane.ERROR_MESSAGE);
     // JOptionPane.showMessageDialog(null, "How Old are you?.", "Question", JOptionPane.QUESTION_MESSAGE);
     //JOptionPane.showMessageDialog(null, "Don't Do It!!!", "Warning", JOptionPane.WARNING_MESSAGE);
		 
/*Second Type...*/	
// Helps us to select Kind Of response available i.e yes,no,cancel e.t.c
//JOptionPane.showConfirmDialog(null, "You're Awesome.", "message", JOptionPane.YES_NO_CANCEL_OPTION);

/*Second Type...*/	
//Helps user to input some information
 //String name =JOptionPane.showInputDialog("What is your Name?");
 //System.out.println("You are "+name);	
		 
// last One Combine Both of Three
//set our own response
// the 3rd last null is  for upload our icon
String[] response = {"No,You are Awesome","Thank you!","Blush!"};
JOptionPane.showOptionDialog(null,
"You're awesome", "Information", 
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.INFORMATION_MESSAGE, 
null, response, 0);
}
}