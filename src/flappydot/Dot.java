 package flappydot;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Dot {
	
	private Image image;
	private float x;
	private float y;
	public static final int WIDTH = 40;
	public static final int HEIGHT = 40;
	public Dot(int x, int y) throws SlickException {
		image = new Image("res/dot.png");
		this.x = x;
		this.y = y;
	}
	 public void render() {
		    image.draw(x - WIDTH/2, FlappyDotGame.GAME_HEIGHT - y - (HEIGHT/2));
	 }
}
