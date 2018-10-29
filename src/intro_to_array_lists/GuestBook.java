package intro_to_array_lists;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton view;
	
	public void start(){
		 frame = new JFrame();
		 panel = new JPanel();
		 add = new JButton();
		 view = new JButton();
		
		frame.setVisible(true);
		panel.setVisible(true);
		add.setVisible(true);
		view.setVisible(true);
	
		frame.setTitle("Guest Book");
		add.setText("Add Name");
		view.setText("View Names");
	
		frame.add(panel);
		panel.add(add);
		//add.addActionListener();
		panel.add(view);
		//view.addActionListener(this);
		frame.pack();
		
		//if(ButtonPressed==add){
		
		
		
		
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
