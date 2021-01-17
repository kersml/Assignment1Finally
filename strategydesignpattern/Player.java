package strategydesignpattern;

public class Player {
	String name;
	boolean defence;
	DefenceBehavior defenceBehavior;
	OffenceBehavior offenceBehavior;
	public Player(String playerName)
	{
		name = playerName;
	}
	public String play()
	{
		if(defenceBehavior == null)
		{
			return offenceBehavior.play();
		}
		else
		{
			return defenceBehavior.play();
		}
	}
	public void setDefenceBehavior(DefenceBehavior behavior) {
		defenceBehavior = behavior;
	}
	public void setOffenceBehavior(OffenceBehavior behavior) {
		offenceBehavior = behavior;
	}
	void turnover()
	{
		if (defence == true)
		{
			defence = false;
		}
		else
		{
			defence = true;
		}
	}
}
