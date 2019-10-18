package concretes;
import abstracts.IPhotoAlbum;
import exceptions.IllegalTextToAddException;

public class TextOption extends AlbumDecorator{

	public static final double TEXT_OPTION_PRICE = 3.00;
	private static final int MAX_CHARACTER_TO_ADD = 80;
	String textToAdd;
	
	
	public TextOption(IPhotoAlbum component, String textToAdd) {
		super(component);
		validateTextToAdd(textToAdd);
	
	}
	
	private void validateTextToAdd(String textToAdd) {
		if(textToAdd.length() > MAX_CHARACTER_TO_ADD) throw new IllegalTextToAddException();
		
	}

	@Override
	public double getOptionCost() {
		
		return TEXT_OPTION_PRICE;
	}
}
