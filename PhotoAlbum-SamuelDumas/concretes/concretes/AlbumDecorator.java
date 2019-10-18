package concretes;
import abstracts.IPhotoAlbum;

public class AlbumDecorator implements IPhotoAlbum {

	protected IPhotoAlbum component;

	public AlbumDecorator(IPhotoAlbum component) {
		this.component = component;
	}


	@Override
	public double calculateCost() {
		return this.component.calculateCost() + getOptionCost();
	}

	public double getOptionCost() {
		return 0;
	}
	
	
}
