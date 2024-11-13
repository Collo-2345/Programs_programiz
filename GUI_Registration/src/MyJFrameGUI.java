import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class MyJFrameGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField email;
	private JPasswordField password;
	private JTextField user_id;
	private JLabel lblUserid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyJFrameGUI frame = new MyJFrameGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyJFrameGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setSize(390,400);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.setBounds(141, 74, 191, 29);
		contentPane.add(username);
		username.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(141, 129, 191, 29);
		contentPane.add(email);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(10, 83, 106, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(10, 133, 106, 20);
		contentPane.add(lblNewLabel_1);
		
		password = new JPasswordField();
		password.setBounds(141, 188, 191, 29);
		contentPane.add(password);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setBounds(10, 192, 106, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		// add a try and catch for exception purposes
		  try
		  { //Ensure you load the class of our database
			  Class.forName("com.mysql.cj.jdbc.Driver");
			// do connection with our db
			 Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/guidb234", "root", "@Collo_2543");
			 PreparedStatement ps = connect.prepareStatement("insert into  Registration(user_id,username,email,password) values(?,?,?,?)");
			 // replace each question mark with their respective value
			 ps.setString(1,user_id.getText());
			 ps.setString(2,username.getText());
			 ps.setString(3,email.getText());
			 //Retrieve the password as a char[] for security reason,,,then you have to convert it to string
			 char[] Charpassword = password.getPassword();
			 String passwordText = new String(Charpassword);
			 ps.setString(4, passwordText);
			 //this will return number row affect in our db
			 int RowAffect_Db = ps.executeUpdate();
			 //create a condition
			 if(RowAffect_Db > 0)
			 {
				 JOptionPane.showMessageDialog(null, "Registration done sucessfully...");
				 
			 }else { JOptionPane.showMessageDialog(null,"Registration failed...");}
			  
		  }catch(Exception collo)
		  {
			 System.out.println(collo); 
		  }
			}
		});
		button.setBounds(170, 257, 129, 29);
		contentPane.add(button);
		
		user_id = new JTextField();
		user_id.setColumns(10);
		user_id.setBounds(141, 24, 191, 29);
		contentPane.add(user_id);
		
		lblUserid = new JLabel("User_ID");
		lblUserid.setBounds(10, 28, 106, 20);
		contentPane.add(lblUserid);
	}
}
