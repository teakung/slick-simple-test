package flappydot;

import java.util.Random;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class PillarPair {
	private Image topPillar;
	  private Image bottomPillar;
	  private float x;
	  private float y;
	  private float vx;
	  static public final int WIDTH = 80; 
	  static public final int IMAGE_HEIGHT = 600;
	  static public final int PILLAR_SPACE = 200;
	  Random random = new Random();
	 
	  public PillarPair(float x, float y,float vx) throws SlickException {
	    this.x = x;
	    this.y = this.randomY();
	    this.vx = vx;
	    topPillar = new Image("res/pillar-top.png");
	    bottomPillar = new Image("res/pillar-bottom.png");
	  }
	 
	  public void render() {
	    topPillar.draw(x - 40, 
	        FlappyDotGame.GAME_HEIGHT - (y + (PILLAR_SPACE/2)+IMAGE_HEIGHT));
	    bottomPillar.draw(x - 40, 
	        FlappyDotGame.GAME_HEIGHT - (y - PILLAR_SPACE/2));
	  }
	  
	  public void update() {
		    x += vx;
		    if(x<-WIDTH/2){
		    	x = 640+WIDTH/2;
		    	y = this.randomY();
		    }
	  }
	  
	  public float randomY() {
		    return 70+random.nextInt(340);
	  }
	  
	  public float getX() { return x; }
	  public float getY() { return y; }
	  
}
