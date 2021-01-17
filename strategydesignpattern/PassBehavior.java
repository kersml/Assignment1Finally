package strategydesignpattern;

import java.util.Random;

public class PassBehavior implements OffenceBehavior{


	public String play() {
		String sentence = "throws a ";
		String[] options = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
		Random r = new Random();
		int randomizer = r.nextInt(4);
		return sentence + options[randomizer];
	}

}
