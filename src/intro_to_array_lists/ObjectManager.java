package intro_to_array_lists;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

	Rocketship rocket;
	
	long enemyTimer = 0;
	int enemySpawnTime = 1000;
	
	int score = 0;
	
	ObjectManager(Rocketship rocket){
		this.rocket = rocket;
		
	}
	
	
	
	ArrayList<Projectile> project = new ArrayList<Projectile>();
	
	void addProjectile(Projectile jectile){
		project.add(jectile);
	}
	
	ArrayList<Alien> ali = new ArrayList<Alien>();
	
	void addAlien(Alien al){
		ali.add(al);
	}
	
	void update(){
		for(int i = 0; i<project.size();i++){
			project.get(i).update();
			
		}
		
		for(int i = 0; i<ali.size();i++){
			ali.get(i).update();
			
		}
		
		rocket.update();
	}
	
	public void manageEnemies(){
		
        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
        addAlien(new Alien(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));
        enemyTimer = System.currentTimeMillis();
        }
}
	
	void purgeObjects(){
		for(int i = 0; i<project.size();i++){
			if(project.get(i).isAlive==false){
				project.remove(i);
			}
		}
		for(int i = 0; i<ali.size();i++){
			if(ali.get(i).isAlive==false){
			ali.remove(i);
				}
			
		}
		}
		
	
	
	void draw(Graphics g){
		rocket.draw(g);
		
		for(int i = 0; i<project.size();i++){
			project.get(i).draw(g);
			
		}
		
		for(int i = 0; i<ali.size();i++){
			ali.get(i).draw(g);
			
		}
	}
	
	void checkCollision(){
		for(Alien a : ali){

	        if(rocket.collisionBox.intersects(a.collisionBox)){

	                rocket.isAlive = false;

	        }

	}
		for(int i = 0; i<ali.size();i++){
			for(int u = 0; u<project.size();u++){
				if(ali.get(i).collisionBox.intersects(project.get(u).collisionBox)){
					ali.get(i).isAlive=false;
					score++;
				}
			}
		}
	}
	
	int getScore(){
		return score;
	}
	
	}
	
	
