 package flappydot;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Dot {
	
	private Image image;
	private float x;
	private float y;
	private float vy;
	public static final int WIDTH = 40;
	public static final int HEIGHT = 40;
	public Dot(int x, int y) throws SlickException {
		image = new Image("res/dot.png");
		this.x = x;
		this.y = y;
	} 
	public Dot(float x, float y, float vy) throws SlickException {
		image = new Image("res/dot.png");
		this.x = x;
		this.y = y;
	    this.vy = vy;
	 }
	 public void render() {
		    image.draw(x - WIDTH/2, FlappyDotGame.GAME_HEIGHT - y - (HEIGHT/2));
	 }
	public void update() {
		y += vy;
		vy -= FlappyDotGame.G;
	}
}
