package intro_to_array_lists;

import java.awt.Color;
import java.awt.Font;
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
	
	Font titleFont=new Font("Arial",Font.PLAIN,48);
	Font instruction=new Font("Arial",Font.PLAIN,24);
	
	GamePanel(){
	time = new Timer(1000/60, this);
	
	
	}
	
	@Override

	
	
	public void paintComponent(Graphics g){
		if(currentState==MENU_STATE){
			drawMenuState(g);
		}else if(currentState==GAME_STATE){
			drawGameState(g);
		}else if(currentState==END_STATE){
			drawEndState(g);
		}
		
	        }
	
	void startGame(){
		
		time.start();
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
	if(currentState==MENU_STATE){
		updateMenuState();
	}else if(currentState==GAME_STATE){
		updateGameState();
	}else if(currentState==END_STATE){
		updateEndState();
	}
	repaint();
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			currentState++;
			if(currentState > END_STATE){

                currentState = MENU_STATE;

        }


		}
		System.out.println("Yes");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("No");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Maybe");
		
		//Part 6
	}	
	
	void updateMenuState(){
		
	}
	
	void drawMenuState(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		g.drawString("LEAGUE INVADERS", 25, 250);
		g.setFont(instruction);
		g.drawString("Press Enter to start", 150, 400);
		g.drawString("Press SPACE for instructions", 100, 450);
	}
	
	void updateGameState(){
		
	}
	
	void drawGameState(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
	}
	
	void updateEndState(){
		
	}
	
	void drawEndState(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		g.drawString("GAME OVER", 125, 250);
		g.setFont(instruction);
		g.drawString("You killed " + " enemies", 150,300);
		g.drawString("Press Enter to restart", 150, 400);
	}
	
	
}
	


