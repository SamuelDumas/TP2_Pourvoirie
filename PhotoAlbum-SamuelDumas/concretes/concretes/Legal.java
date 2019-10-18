package concretes;

public class Legal extends BaseAlbum{

	
	private double LEGAL_FORMAT_PRICE = 24.99 ;
	public Legal(BookColor color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateCost() {
		return LEGAL_FORMAT_PRICE;
		
	}
}
