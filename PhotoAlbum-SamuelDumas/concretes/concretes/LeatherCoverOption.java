package concretes;
import abstracts.IPhotoAlbum;

public class LeatherCoverOption extends Cover{

	public static final double LEATHER_COVER_PRICE = 6.00;
	public LeatherCoverOption(IPhotoAlbum component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getOptionCost() {
		
		return LEATHER_COVER_PRICE;
	}
}
