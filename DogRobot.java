//Camryn Reid
public class DogRobot extends Robot {
	//sets the name, move, and talk behavior
	public DogRobot(String name) {
		super(name);
		moveBehavior = new CrawlBehavior();
		talkBehavior = new BarkBehavior();
	}
	//returns the name and is a happy dpg robot
	public String toString() {
		return name + " is a happy dog robot";
	}
	
	
}
