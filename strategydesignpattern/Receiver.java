package strategydesignpattern;

public class Receiver extends Player {

	public Receiver(String playerName) {
		super(playerName);
		this.defence = false;
		// TODO Auto-generated constructor stub
		ReceiveBehavior wr = new ReceiveBehavior();
		setOffenceBehavior(wr);
		setDefenceBehavior(null);
		this.turnover();
	}
	
}
