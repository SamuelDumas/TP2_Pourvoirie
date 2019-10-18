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
	
}
