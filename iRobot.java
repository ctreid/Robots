//Camryn Reid
public class iRobot extends Robot {
	//sets name, and move and talk behavior
	public iRobot(String name) {
		super(name);
		moveBehavior = new RunBehavior();
		talkBehavior = new SpeakBehavior();
	}
	//returns name of robot and is a scary iRobot
	public String toString() {
		return name + " is a scary iRobot!!!";
	}

}
