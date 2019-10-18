package concretes;
import abstracts.IPhotoAlbum;

public class DoubleCartonCoverOption extends Cover{

	public static final double DOUBLE_CARTON_COVER_PRICE = 3.00;

	public DoubleCartonCoverOption(IPhotoAlbum component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getOptionCost() {
		
		return DOUBLE_CARTON_COVER_PRICE;
	}

}
