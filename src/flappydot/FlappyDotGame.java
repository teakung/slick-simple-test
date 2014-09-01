package flappydot;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;


public class FlappyDotGame extends BasicGame{
	
	public static final int GAME_WIDTH = 640;
	public static final int GAME_HEIGHT = 480;
	public static final float DOT_INITIAL_VY = 10;
	public static final float G = (float) -0.5;
	private Dot dot;
	public FlappyDotGame(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
		      FlappyDotGame game = new FlappyDotGame("FlappyD");
		      AppGameContainer container = new AppGameContainer(game);
		      container.setDisplayMode(GAME_WIDTH, GAME_HEIGHT, false);
		      container.setMinimumLogicUpdateInterval(1000 / 60); 	
		      container.start();
		    } catch (SlickException e) {
		      e.printStackTrace();
		    }
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		 dot.render();
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		Color background = new Color(128, 128, 128);
	    container.getGraphics().setBackground(background);        
	    dot = new Dot(GAME_WIDTH/2, GAME_HEIGHT/2, DOT_INITIAL_VY);
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		dot.update();
		
	}
}
