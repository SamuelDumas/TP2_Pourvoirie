package concretes;
import abstracts.IPhotoAlbum;

public class ExtraPagesOption extends AlbumDecorator{
	
	public static final double PAGE_PRICE = 0.90;
	private int numberOfPagesToAdd;

	public ExtraPagesOption(IPhotoAlbum component, int numberOfPagesToAdd) {
		super(component);
		this.numberOfPagesToAdd = numberOfPagesToAdd;
	}
	
	@Override
	public double getOptionCost() {
		
		return this.numberOfPagesToAdd*PAGE_PRICE;
	}
	
	
	
	
}
