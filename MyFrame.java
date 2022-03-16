import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JTextField textField;
	private JTextField outputTextField = new JTextField(20);
	
	
	public MyFrame() {
		
		//Step 1.Creation of container
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		ImageIcon icon = new ImageIcon("u.gif");
		JLabel label = new JLabel(icon);
	
	    //Step 2.Creation of graphical substances
		textField = new JTextField(10);
		JButton button = new JButton("May the force be with you");
		
		//Step 3.Put graphical substances to container
		panel.add(textField);
		panel.add(button);
		panel.add(outputTextField);
		panel.add(label);
		
		
		//Step 4.Adapt the container to window
		this.setContentPane(panel);
		
		
		//Step 3.
		ButtonListener listener = new ButtonListener();

		
		//Step 4.Connect listener with event source
		button.addActionListener(listener);
	}
	
	//Step 1.Creation of listener's class
	class ButtonListener implements ActionListener{
		
		
		//Step 2.Write running code
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String userName = textField.getText();
			outputTextField.setText("Hello my friend " + userName);
			//this prints in console and not in the open user's window
			//System.out.println("Hello my friend " + userName);
		}
	}
	
	
	
}
