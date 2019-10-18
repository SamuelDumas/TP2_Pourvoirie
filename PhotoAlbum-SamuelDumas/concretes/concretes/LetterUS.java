package concretes;

public class LetterUS extends BaseAlbum{

	private static final double LETTERUS_FORMAT_PRICE = 24.99;
	public LetterUS(BookColor color) {
		super(color);

	}
	
	@Override
	public double getOptionCost() {
		
		return LETTERUS_FORMAT_PRICE;
	}

}
