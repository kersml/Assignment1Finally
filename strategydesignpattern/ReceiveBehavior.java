package strategydesignpattern;

import java.util.Random;

public class ReceiveBehavior implements OffenceBehavior {

	
	public String play() {
		
		String sentence = "runs a ";
		String[] options = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
		Random r = new Random();
		int randomizer = r.nextInt(4);
		return sentence + options[randomizer];
	}
	
}
