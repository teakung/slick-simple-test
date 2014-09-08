package flappydot;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;


public class FlappyDotGame extends BasicGame{
	
	//isGameover boolean is reversed//
	private int score =0;
	private boolean isStarted;
	public static final float PILLAR_VX = -4;
	public static final int GAME_WIDTH = 640;
	public static final int GAME_HEIGHT = 480;
	public static final float DOT_JUMP_VY = 10;
	public static final float G = (float) 0.5;
	private Dot dot;
	private PillarPair[] pillars;
	public static final int PILLAR_COUNT = 3;
	private boolean isGameOver;
	public FlappyDotGame(String title) {
		super(title);
	}

	public static void main(String[] args) {
		try {
		      FlappyDotGame game = new FlappyDotGame("FlappyD");
		      AppGameContainer container = new AppGameContainer(game);
		      container.setDisplayMode(GAME_WIDTH, GAME_HEIGHT, false); 	
		      container.start();
		    } catch (SlickException e) {
		      e.printStackTrace();
		    }
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		for (PillarPair pillar : pillars) {
		      pillar.render();
		}
		dot.render();
		g.drawString("score " +score, 320, 0);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		Color background = new Color(128, 128, 128);
	    container.getGraphics().setBackground(background);
	    isStarted = false;
	    container.setVSync(true);
	    container.setTargetFrameRate(60);
	    dot = new Dot(GAME_WIDTH/2, GAME_HEIGHT/2, DOT_JUMP_VY);
	    isGameOver= true;
	    initPillars();
	}

	private void initPillars() throws SlickException {
		pillars = new PillarPair[PILLAR_COUNT];
	    for (int i = 0; i < PILLAR_COUNT; i++) {
	      pillars[i] = new PillarPair(GAME_WIDTH + 100 + 250*i, GAME_HEIGHT/2, PILLAR_VX);
	    }
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		if(isGameOver&&isStarted){
		dot.update();
			for (int i =0; i<PILLAR_COUNT;i++)
			{
				pillars[i].update();
				if(dot.isCollide(pillars[i]))
				{
					System.out.println("Collision!");
					isGameOver=false;
				}
			}
		}
	}
	@Override
	  public void keyPressed(int key, char c) {
	    if (key == Input.KEY_SPACE) {
	    	dot.jump();
	    }
	    if( key == Input.KEY_Z){
	    	isStarted=true;
	    }
	 }
}
