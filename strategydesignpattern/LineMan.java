package strategydesignpattern;

import java.util.Random;

public class LineMan extends Player{

	public LineMan(String playerName) {
		super(playerName);
		OBlockBehavior obehav = new OBlockBehavior();
		if (this.defence == false)
			setOffenceBehavior(obehav);
		Random r = new Random();
		int randomizer = r.nextInt(2);
		if (this.defence == true)
		{
		if (randomizer == 0)
		{
			SackBehavior sack = new SackBehavior();
			setDefenceBehavior(sack);
		}
		else if (randomizer == 1)
		{
			StripBehavior strip = new StripBehavior();
			setDefenceBehavior(strip);
		}
		else
		{
			BlockBehavior block = new BlockBehavior();
			setDefenceBehavior(block);
		}
		}
		this.turnover();
		// TODO Auto-generated constructor stub
	}
	
		
	
	
		
	
	
}
