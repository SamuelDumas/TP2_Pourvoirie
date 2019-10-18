package concretes;
import abstracts.IComponent;

public class ExtraPagesOption extends Decorator{
	
	private static final double PAGE_PRICE = 0.90;
	private int numberOfPagesToAdd;

	public ExtraPagesOption(IComponent component, int numberOfPagesToAdd) {
		super(component);
		this.numberOfPagesToAdd = numberOfPagesToAdd;
	}
	@Override
	public double calculateCost() {
		return super.calculateCost() + (PAGE_PRICE*numberOfPagesToAdd);
	}
	
	
	
}
