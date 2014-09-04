package flappydot;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class PillarPair {
	private Image topPillar;
	  private Image bottomPillar;
	  private float x;
	  private float y;
	 
	  public PillarPair(float x, float y) throws SlickException {
	    this.x = x;
	    this.y = y;
	    topPillar = new Image("res/pillar-top.png");
	    bottomPillar = new Image("res/pillar-bottom.png");
	  }
	 
	  public void render() {
	    topPillar.draw(x - 40, 
	        FlappyDotGame.GAME_HEIGHT - (y + 700));
	    bottomPillar.draw(x - 40, 
	        FlappyDotGame.GAME_HEIGHT - (y - 100)); 
	  }
}
