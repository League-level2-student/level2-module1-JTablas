package intro_to_array_lists;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {

	Rectangle collisionBox;
	int x;
	int y;
	int width;
	int height;
	boolean isAlive = true;
	
GameObject(int x, int y, int width, int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		
		collisionBox = new Rectangle(x,y,width,height);
	}
	
	

	void update (){
		
		collisionBox.setBounds(x, y, width, height);
			
			
		}		
	
		
	

	void draw(Graphics g) {
	

	
	}
	
}
