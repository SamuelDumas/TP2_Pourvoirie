package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import abstracts.IPhotoAlbum;
import abstracts.IPhotoAlbum.BookColor;
import concretes.A5;



class albumTests {

	private IPhotoAlbum anAlbum;
	private BookColor GREY;
	@BeforeEach
	public void setUpAnAlbum() {
		  anAlbum = new A5(GREY);
	}
	
	@Test
	void WHEN_albumIsCreated_THEN_defaultPriceIsInitialized() {
		assertEquals(A5.A5_FORMAT_PRICE,anAlbum.calculateCost());
	}
	



}
