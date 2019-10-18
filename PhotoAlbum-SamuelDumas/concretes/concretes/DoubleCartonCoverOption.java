package concretes;
import abstracts.IComponent;

public class DoubleCartonCoverOption extends Cover{

	private static final double DOUBLE_CARTON_COVER_PRICE = 3.00;

	public DoubleCartonCoverOption(IComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculateCost() {
		return super.calculateCost() + DOUBLE_CARTON_COVER_PRICE;
		
	}

}
