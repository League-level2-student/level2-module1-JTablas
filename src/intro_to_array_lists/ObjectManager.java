package intro_to_array_lists;

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {

	Rocketship rocket;
	
	ObjectManager(Rocketship rocket){
		this.rocket = rocket;
		
	}
	
	ArrayList<Projectile> project = new ArrayList<Projectile>();
	
	void addProjectile(Projectile jectile){
		project.add(jectile);
	}
	
	void update(){
		for(int i = 0; i<project.size();i++){
			project.get(i).update();
			
		}
		
		rocket.update();
	}
	
	void draw(Graphics g){
		rocket.draw(g);
		
		for(int i = 0; i<project.size();i++){
			project.get(i).draw(g);
			
		}
	}
	
	
}
