 package flappydot;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Dot {
	
	private Image image;
	private float x;
	private float y;
	public Dot(int x, int y) throws SlickException {
		image = new Image("res/dot.png");
		this.x = x;
		this.y = y;
	}
	 public void render() {
		    image.draw(x - 20, 480 - (y + 20));
	 }
}
