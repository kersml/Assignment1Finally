package strategydesignpattern;
import java.util.Random;
public class QuarterBack extends Player {
	
	public QuarterBack(String playerName) {
		super(playerName);
		this.defence = false;
		Random r = new Random();
		int randomizer = r.nextInt(1);
		if (randomizer == 0)
		{
			RunBehavior run = new RunBehavior();
			this.setOffenceBehavior(run);
		}
		else
		{
			PassBehavior pass = new PassBehavior();
			this.setOffenceBehavior(pass);
		}
		setDefenceBehavior(null);
		this.turnover();
	}

	
		
	
}
