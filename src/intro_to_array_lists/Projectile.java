package intro_to_array_lists;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {

	int speed;
	
	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		speed = 10;
	}
	
	void update(){
		super.update();
		y-=speed;
	if(y<=0){
	isAlive=false;
	}
		
	}
	
	void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(x, y, 10, 5);
		
	}

}
