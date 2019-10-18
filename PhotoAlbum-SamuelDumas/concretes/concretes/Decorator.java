package concretes;
import abstracts.IComponent;

public class Decorator implements IComponent {

	private IComponent component;

	public Decorator(IComponent component) {
		this.component = component;
	}


	@Override
	public double calculateCost() {
		return this.component.calculateCost();
	}


	@Override
	public int getNumberOfPages() {
		// TODO Auto-generated method stub
		return this.getNumberOfPages();
	}


	@Override
	public BookColor getBookColor() {
		// TODO Auto-generated method stub
		return this.getBookColor();
	}


	
	
}
