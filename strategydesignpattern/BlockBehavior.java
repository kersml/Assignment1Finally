package strategydesignpattern;
import java.util.Random;
public class BlockBehavior implements DefenceBehavior{

	
	public String play() {
		// TODO Auto-generated method stub
		String sentence = "block a ";
		String[] options = {"kick", "punt", "pass", "catch"};
		Random r = new Random();
		int randomizer = r.nextInt(3);
		return sentence + options[randomizer];
	}
	


}
