package concretes;

import abstracts.IComponent;

public class BaseAlbum implements IComponent{

	private static final int DEFAULT_PAGE_NUMBER = 24;
	private static final double DEFAULT_PRICE = 19.99;
	int numPages;
	Format format;
	Orientation orientation;
	BookColor color;
	
	public BaseAlbum (BookColor color) {
		this.numPages = DEFAULT_PAGE_NUMBER;
		
	}
	
	public double calculateCost() {
		return DEFAULT_PRICE;
	}
	
	
}
