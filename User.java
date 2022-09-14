import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.*;
import java.awt.*;

public class User implements ActionListener{
   static JTextField user = new JTextField(15);
   static JPasswordField pass = new JPasswordField(15);
   static JLabel label = new JLabel("Enter Username");
   static JLabel label2 = new JLabel("Enter Password");
   static JButton button = new JButton("Login");
	JFrame frame1 = new JFrame();
	
	
public void	UserData(){
	
	frame1.setTitle("User Data");
	frame1.setSize(300,300);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame1.setLayout(new FlowLayout());

	frame1.add(label);
	frame1.add(user);
	frame1.add(label2);
	frame1.add(pass);
	frame1.add(button);
	
	
	frame1.setVisible(true);
	
	
	
}
    
User(){
	button.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
   String userfield = user.getText();
	String passfield = pass.getText();
	if(userfield.equals("Jawad")&& passfield.equals("12345") ) {
		frame1.setVisible(false);
		GPA.Gpamethod();
	}else {
		JLabel label3;
		label3 = new JLabel("You Dont Have An Account");
		frame1.add(label3);
		frame1.setVisible(true);
	}
}


}
