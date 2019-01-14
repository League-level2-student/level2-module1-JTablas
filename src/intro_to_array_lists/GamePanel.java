package intro_to_array_lists;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	
	Timer time;
	
	GamePanel(){
	time = new Timer(1000/60, this);
	
	
	
	}
	
	@Override

	
	
	public void paintComponent(Graphics g){
		
		
	        }
	
	void startGame(){
		
		time.start();
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
	
	repaint();
	
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Yes");
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("No");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Maybe");
		
		//Part 6
	}	
	
}
	


