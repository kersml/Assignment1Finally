package strategydesignpattern;

import java.util.Random;

public class RunBehavior implements OffenceBehavior{

	
	public String play() {
		
		String sentence = "runs a ";
		String[] options = {"dive", "draw", "pitch", "reverse"};
		Random r = new Random();
		int randomizer = r.nextInt(3);
		return sentence + options[randomizer];
	}

}
