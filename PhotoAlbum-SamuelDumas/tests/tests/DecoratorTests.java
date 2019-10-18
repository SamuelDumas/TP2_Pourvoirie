package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import abstracts.IPhotoAlbum;
import abstracts.IPhotoAlbum.BookColor;
import concretes.A5;
import concretes.DoubleCartonCoverOption;
import concretes.ExtraPagesOption;
import concretes.LeatherCoverOption;
import concretes.SwedeCoverOption;
import concretes.TextOption;
import exceptions.IllegalTextToAddException;

class DecoratorTests {

	private IPhotoAlbum anAlbum;
	private BookColor GREY;
	@BeforeEach
	public void setUpAnAlbum() {
		  anAlbum = new A5(GREY);
	}
	@Test
	void WHEN_albumIsCreated_THEN_extraPagesAreAdded_RETURNS_priceWithExtraPages() {
		//arrange
		int numberOfPageToAdd = 5;
		ExtraPagesOption newAlbum = new ExtraPagesOption(anAlbum, numberOfPageToAdd);
		//action
		double newPrice = newAlbum.calculateCost();
		//assert
		assertEquals(anAlbum.calculateCost() + numberOfPageToAdd*ExtraPagesOption.PAGE_PRICE,newPrice);
	}
	@Test
	void WHEN_albumIsCreated_THEN_TextIsAdded_RETURNS_priceWithTextOption() {
		//arrange
		String TextToAdd = "Allo";
		TextOption newAlbum = new TextOption(anAlbum, TextToAdd);
		//action
		double newPrice = newAlbum.calculateCost();
		//assert
		assertEquals(anAlbum.calculateCost() + TextOption.TEXT_OPTION_PRICE,newPrice);
	}
	@Test
	void WHEN_albumIsCreated_THEN_addDoubleCartonCoverOption_RETURNS_priceWithOption() {
		//arrange
		DoubleCartonCoverOption newAlbum = new DoubleCartonCoverOption(anAlbum);
		//action
		double newPrice = newAlbum.calculateCost();
		//assert
		assertEquals(anAlbum.calculateCost() + DoubleCartonCoverOption.DOUBLE_CARTON_COVER_PRICE,newPrice);
	}
	@Test
	void WHEN_albumIsCreated_THEN_addLeatherCoverOption_RETURNS_priceWithOption() {
		//arrange
		LeatherCoverOption newAlbum = new LeatherCoverOption(anAlbum);
		//action
		double newPrice = newAlbum.calculateCost();
		//assert
		assertEquals(anAlbum.calculateCost() + LeatherCoverOption.LEATHER_COVER_PRICE,newPrice);
	}
	@Test
	void WHEN_albumIsCreated_THEN_addSwedeCoverOption_RETURNS_priceWithOption() {
		//arrange
		SwedeCoverOption newAlbum = new SwedeCoverOption(anAlbum);
		//action
		double newPrice = newAlbum.calculateCost();
		//assert
		assertEquals(anAlbum.calculateCost() + SwedeCoverOption.SWEDE_COVER_PRICE,newPrice);
	}
	@Test
	void WHEN_albumIsCreated_THEN_addMultipleOptions_RETURNS_priceWithOptions() {
		//arrange
		SwedeCoverOption newAlbum = new SwedeCoverOption(anAlbum);
		String TextToAdd = "Allo";
		TextOption newAlbum2 = new TextOption(newAlbum, TextToAdd);
		//action
		double newPrice = newAlbum2.calculateCost();
		//assert
		assertEquals(anAlbum.calculateCost() + SwedeCoverOption.SWEDE_COVER_PRICE + TextOption.TEXT_OPTION_PRICE,newPrice);
	}
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void createEmployee_whenInitialAnnualSalaryIsInferiorToMin_shouldRaiseIllegalInitialAnnualSalaryExceptionWithRightMessage() {
		thrown.expect(IllegalTextToAddException.class);
		String illegalTextToAdd = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		
		new TextOption(anAlbum, illegalTextToAdd);	
	}
}
