//Camryn Reid
public class HumanRobot extends Robot {
	//sets name, and move and talk behavior
	public HumanRobot(String name) {
		super(name);
		moveBehavior = new WalkBehavior();
		talkBehavior = new SpeakBehavior();
	}
	//returns name and is a typical human robot
	public String toString() {
		return name + " is a typical human robot";
	}
}
