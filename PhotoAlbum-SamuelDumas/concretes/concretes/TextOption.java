package concretes;
import abstracts.IComponent;
import exceptions.IllegalTextToAddException;

public class TextOption extends Decorator{

	public static final double TEXT_OPTION_PRICE = 3.00;
	private static final int MAX_CHARACTER_TO_ADD = 80;
	String textToAdd;
	
	
	public TextOption(IComponent component, String textToAdd) {
		super(component);
		validateTextToAdd(textToAdd);
	
	}
	
	private void validateTextToAdd(String textToAdd) {
		if(textToAdd.length() > MAX_CHARACTER_TO_ADD) throw new IllegalTextToAddException();
		
	}

	@Override
	public double calculateCost() {
		return super.calculateCost() + TEXT_OPTION_PRICE;
	}

}
