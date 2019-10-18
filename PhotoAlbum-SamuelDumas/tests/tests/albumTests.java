package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import abstracts.IComponent;
import abstracts.IComponent.BookColor;
import concretes.A5;
import concretes.BaseAlbum;


class albumTests {

	private IComponent anAlbum;
	private BookColor GREY;
	@BeforeEach
	public void setUpAnAlbum() {
		  anAlbum = new A5(GREY);
	}
	@Test
	void WHEN_albumIsCreated_THEN_24PagesIsInitialized() {
	assertEquals(BaseAlbum.DEFAULT_PAGE_NUMBER,anAlbum.getNumberOfPages());
	}
	@Test
	void WHEN_albumIsCreated_THEN_defaultPriceIsInitialized() {
		assertEquals(A5.A5_FORMAT_PRICE,anAlbum.calculateCost());
	}
	@Test
	void WHEN_albumIsCreated_THEN_aColorIsInitialize() {
		assertEquals(GREY,anAlbum.getBookColor());
	}



}
