//Camryn Reid
public class SimpleSpeakBehavior implements TalkBehavior {
	public String talk() {
		//random number generator that picks a number to determine what is returned for the WallERobot speak behavior
		double rand = (int)(Math.random() * ((5-1)+1));
		if (rand == 1) {
			return "Wall-E";
		}
		else if (rand == 2) {
			return "EVA!";
		}
		else if (rand == 3) {
			return "Pop";
		}
		else if (rand == 4) {
			return "Eva?";
		}
		else {
			return "Eee-va?";
		}
	}
}
