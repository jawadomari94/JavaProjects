import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;

public class GPA extends User implements ActionListener  {
	static JFrame frame = new JFrame();
	 static JLabel welcoming = new JLabel();
	 static JLabel Asking = new JLabel();
	 static JButton start = new JButton("Start");
	 static JPanel panel2 = new JPanel(new FlowLayout());
     static JPanel panel3 = new JPanel();
     static JPanel panel4 = new JPanel();
     static Color color1 = new Color(77,100,255);
	 static Font font = new Font("Font",Font.PLAIN,30);
	 static JTextField opfield = new JTextField();
// opfield is an object added to showinputdialouge as an hours field
		static Object[] implentation = {"Enter Number of houres",opfield,
				                  "Mark of Subject", };
	public static void Gpamethod(){
		
		frame.setSize(300,300);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		welcoming.setForeground(color1);
		welcoming.setFont(font);
		Asking.setText("Calculate GPA");
		welcoming.setText("Welcome "+ user.getText());
		panel2.add(Asking);
		panel2.add(welcoming);
		panel2.add(start);
		panel4.add(Asking);
		panel3.add(welcoming);
		
		
		
		frame.add(panel2,BorderLayout.SOUTH);
		frame.add(panel4,BorderLayout.CENTER);
		frame.add(panel3,BorderLayout.NORTH);
		frame.setVisible(true);
		
		 start.addActionListener(new GPA());

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == start) {
			frame.setVisible(false);
			 String subjectnumber = 
	       JOptionPane.showInputDialog("Enter the Number of Subjects");
			 int op = JOptionPane.OK_OPTION;
			 int subnum2 = Integer.parseInt(subjectnumber);
			 
			 String hours[] = new String[subnum2];
			 int hoursint[] = new int[subnum2];
			 int sumhours = 0;
			 Integer FinalResult = 0;
			 if(op == 0) {
				 					 
				 int intarrmarks[] = new int[subnum2];
				 String arrayMarks[] = new String[subnum2];
			
				 int hoursmultiplysum = 0;
			
				 for(int i =0; i < subnum2; i++) {
					 frame.setVisible(false);
					  arrayMarks[i] = 
					 JOptionPane.showInputDialog(implentation);
					  hours[i] = opfield.getText();
					  hoursint[i] = Integer.parseInt(hours[i]);
					  
					 
					  intarrmarks[i] = Integer.parseInt(arrayMarks[i]);
					  
					
					  // (subject A * subject B) + (subject A * subject B)
					  hoursmultiplysum +=  intarrmarks[i]* hoursint[i];
					  
					  sumhours += hoursint[i];
					  
					  FinalResult = hoursmultiplysum/sumhours;
					  
					String FinalResulttext =  FinalResult.toString();
					
					Asking.setBackground(new Color(77,100,255));
					Asking.setForeground(new Color(255,0,0));
					Asking.setFont(new Font("Font",Font.BOLD,20));
					Asking.setText("Your GPA IS: "+FinalResulttext);
					
				 }
				 
				 frame.setVisible(true); 
				 
			 }
							
		}
		
	
	}
	

	
	
}
