package concretes;
import abstracts.IComponent;

public class LeatherCoverOption extends Cover{

	public static final double LEATHER_COVER_PRICE = 6.00;
	public LeatherCoverOption(IComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculateCost() {
		return super.calculateCost() + LEATHER_COVER_PRICE;
		
	}

}
