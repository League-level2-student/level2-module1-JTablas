package intro_to_array_lists;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {

	JFrame frame;
	public final static int width= 500;
	public final static int height= 800;
	
	GamePanel game = new GamePanel();
	
	public static void main(String[] args) {
	LeagueInvaders league = new LeagueInvaders();
	
	
	
	league.setup();
	}
	
	LeagueInvaders(){
	frame = new JFrame();
	}
	
	void setup() {
	frame.add(game);
	frame.getContentPane().setPreferredSize(new Dimension(width, height));
	frame.addKeyListener(game);
	
    frame.pack();
    frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	game.startGame();
	}
}
