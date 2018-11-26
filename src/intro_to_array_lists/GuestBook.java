package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	public static void main(String[] args) {
		new GuestBook().start();
	}
	
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton view;
	
	ArrayList<String> names = new ArrayList<String>();
	
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
		add.addActionListener(this);
		panel.add(add);
		view.addActionListener(this);
		panel.add(view);
		frame.pack();
		
		
		
		
		
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonClicked=(JButton)arg0.getSource();
		
		if(add==buttonClicked){
			String person = JOptionPane.showInputDialog("Enter a guest.");
			//System.out.println(person);
			names.add(person);
			//System.out.println(names);
			
		} if(view==buttonClicked){
			String fin ="";
			for (int i = 0; i < names.size(); i++) {
			String s=names.get(i);	
			fin += "Guest #" + i + ": "+s + "\n";
			
		}
			JOptionPane.showMessageDialog(null, fin);
		}
	}
}
