//Camryn Reid
public abstract class Robot {
	//protected 
	protected String name;
	MoveBehavior moveBehavior;
	TalkBehavior talkBehavior;
	//sets name
	public Robot (String name) {
		this.name = name;
	}
	//defines toString function
	public abstract String toString();
	//returns move behavior
	public String move() {
		return moveBehavior.move();
	}
	//returns talk behavior
	public String talk() {
		return talkBehavior.talk();
	}
	//sets move behavior
	public void setMoveBehavior(MoveBehavior mb) {
		moveBehavior = mb;
	}
	//sets talk behavior
	public void setTalkBehavior(TalkBehavior tb) {
		talkBehavior = tb;
	}
}
