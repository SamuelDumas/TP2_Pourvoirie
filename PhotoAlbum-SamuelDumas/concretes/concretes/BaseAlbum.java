package concretes;

import abstracts.IPhotoAlbum;

public abstract class BaseAlbum implements IPhotoAlbum{

	public static final int DEFAULT_PAGE_NUMBER = 24;
	//public static final double DEFAULT_PRICE = 19.99;
	private double price;
	int numPages;
	BookColor color;
	
	public BaseAlbum (BookColor color) {
		this.numPages = DEFAULT_PAGE_NUMBER;
		this.color = color;
		
		
	}
	
	public int getNumberOfPages() {
		return this.numPages;
	}
	public BookColor getBookColor() {
		return this.color;
	}
	
	public double calculateCost() {
		return this.price;
	}

	public double getOptionCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
