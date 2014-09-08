package flappydot;

public class CollisionDetector {
	static boolean isCollide(float dotX, float dotY, float pX, float pY) {
		if(Math.abs(dotX - pX) < PillarPair.WIDTH/2)
		{
			if((dotY>=pY+PillarPair.PILLAR_SPACE/2)||(dotY<=pY-PillarPair.PILLAR_SPACE/2)){
				return true;
			}
		}
	    return false;
	}
}
