package concretes;

public class A5 extends BaseAlbum{

	
	public static double A5_FORMAT_PRICE = 9.99;
	public A5(BookColor color) {
		super(color);
		
	}
	
	@Override
	public double calculateCost() {
		
		return A5_FORMAT_PRICE;
	}
}
