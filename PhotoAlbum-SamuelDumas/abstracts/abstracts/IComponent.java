package abstracts;

public interface IComponent {
	public double calculateCost();
	public int getNumberOfPages();
	public BookColor getBookColor();
	public enum BookColor{
		GREY,
		BLUE,
		RED,
		BLACK
	}
}
