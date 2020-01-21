//Camryn Reid
public class WallERobot extends Robot {
	//sets name and move and talk behavior 
	public WallERobot(String name) {
		super(name);
		moveBehavior = new WalkBehavior();
		talkBehavior = new SimpleSpeakBehavior();
	}
	//returns name of robot and is an environmentally friendly Wall-E robot
	public String toString() {
		return name + " is an environmentally friendly Wall-E Robot";
	}

}
