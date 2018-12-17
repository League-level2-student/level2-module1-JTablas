package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	
	
	Timer time;
	
	GamePanel(){
	time = new Timer(1000/60, this);
	}
	
	void startGame(){
		
		timer.start();
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
	
		System.out.println("Something");
	
	}	
	
}
	


