package concretes;
import abstracts.IPhotoAlbum;

public class SwedeCoverOption extends Cover{

	public static final double SWEDE_COVER_PRICE = 4.00;
	public SwedeCoverOption(IPhotoAlbum component) {
		super(component);
		
	}

	@Override
	public double getOptionCost() {
		
		return SWEDE_COVER_PRICE;
	}

}
