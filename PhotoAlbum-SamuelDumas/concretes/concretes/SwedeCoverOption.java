package concretes;
import abstracts.IComponent;

public class SwedeCoverOption extends Cover{

	public static final double SWEDE_COVER_PRICE = 4.00;
	public SwedeCoverOption(IComponent component) {
		super(component);
		
	}
	@Override
	public double calculateCost() {
		return super.calculateCost() + SWEDE_COVER_PRICE;
		
	}
	

}
