package intro_to_array_lists;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {

	int speed;
	boolean right = false;
	boolean left = false;
	boolean up = false;
	boolean down = false;
	
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		speed =5;
	}

	void update(){
		super.update();
		if(right == true){
			x += speed;
		}
		if(left == true){
			x -= speed;
		}
		if(up == true){
			y -= speed;
		}
		if(down == true){
			y += speed;
		}
		
	}
	
	void draw(Graphics g){
	g.setColor(Color.BLUE);
    g.fillRect(x, y, width, height);
}
}