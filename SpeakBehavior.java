//Camryn Reid
public class SpeakBehavior implements TalkBehavior {
	public String talk () {
		//randomly picks a number that will determine what is printed out 
		double rand = (int)(Math.random() * ((3-1)+1));
		if (rand == 1) {
			return "Hello";
		}
		else if (rand == 2) {
			return "How are you?";
		}
		else {
			return "Good day";
		}
	}
}
