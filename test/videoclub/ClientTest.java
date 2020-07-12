package videoclub;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClientTest {

	@Test
	public void generate_receipt_without_previous_rent() {
		// arrange
		Client client = new Client("Juan Perez");
		String expectedReceipt = "Rentas del Cliente: Juan Perez\nCantidad a pagar: 0.0\nHas acumulado 0 puntos adicionales a tu cuenta.";
		
		// act
		String actualReceipt = client.generateRentalsReceipt();
		
		// assert
		assertEquals("Sin recibo de rentas", expectedReceipt, actualReceipt);
	}


	@Test
	public void generate_receipt_for_rent_catalog_movie_for_two_days() {
		// arrange
		Client client = new Client("Juan Perez");
		Movie savingPrivateRyan = new Movie("Salvando al Soldado Ryan", Movie.CATALOG);
		String expectedReceipt = "Rentas del Cliente: Juan Perez\n\tSalvando al Soldado Ryan\t2.0\nCantidad a pagar: 2.0\nHas acumulado 1 puntos adicionales a tu cuenta.";
		
		// act
		client.addRental(new Rental(savingPrivateRyan, 2));
		String actualReceipt = client.generateRentalsReceipt();
		
		// assert
		assertEquals("Con una renta", expectedReceipt, actualReceipt);
	}

	@Test
	public void generate_receipt_for_rent_catalog_movie_for_more_than_two_days() {
		// arrange
		Client client = new Client("Juan Perez");
		Movie savingPrivateRyan = new Movie("Salvando al Soldado Ryan", Movie.CATALOG);
		String expectedReceipt = "Rentas del Cliente: Juan Perez\n\tSalvando al Soldado Ryan\t5.0\nCantidad a pagar: 5.0\nHas acumulado 1 puntos adicionales a tu cuenta.";
		
		// act
		client.addRental(new Rental(savingPrivateRyan, 4));
		String actualReceipt = client.generateRentalsReceipt();
		
		// assert
		assertEquals("Con una renta", expectedReceipt, actualReceipt);
	}
	
	@Test
	public void generate_receipt_for_rent_premiere_movie() {
		// arrange
		Client client = new Client("Juan Perez");
		Movie savingPrivateRyan = new Movie("Salvando al Soldado Ryan", Movie.PREMIERE);
		String expectedReceipt = "Rentas del Cliente: Juan Perez\n\tSalvando al Soldado Ryan\t3.0\nCantidad a pagar: 3.0\nHas acumulado 1 puntos adicionales a tu cuenta.";
		
		// act
		client.addRental(new Rental(savingPrivateRyan, 1));
		String actualReceipt = client.generateRentalsReceipt();
		
		// assert
		assertEquals("Con una renta", expectedReceipt, actualReceipt);
	}
	
	@Test
	public void generate_receipt_for_rent_movie_for_children() {
		// arrange
		Client client = new Client("Juan Perez");
		Movie toyStory = new Movie("Toy Story", Movie.CHILD);
		String expectedReceipt = "Rentas del Cliente: Juan Perez\n\tToy Story\t1.5\nCantidad a pagar: 1.5\nHas acumulado 1 puntos adicionales a tu cuenta.";
		
		// act
		client.addRental(new Rental(toyStory, 1));
		String actualReceipt = client.generateRentalsReceipt();
		
		// assert
		assertEquals("Con una renta", expectedReceipt, actualReceipt);
	}
	
	@Test
	public void generate_receipt_for_several_movies() {
		// arrange
		Client client = new Client("Juan Perez");
		Movie savingPrivateRyan = new Movie("Salvando al Soldado Ryan", Movie.CATALOG);
		Movie kong = new Movie("Kong", Movie.PREMIERE);
		Movie toyStory = new Movie("Toy Story", Movie.CHILD);
		String expectedReceipt = "Rentas del Cliente: Juan Perez\n\tSalvando al Soldado Ryan\t2.0\n\tKong\t3.0\n" +
				"\tToy Story\t1.5\nCantidad a pagar: 6.5\nHas acumulado 3 puntos adicionales a tu cuenta.";
		
		// act
		client.addRental(new Rental(savingPrivateRyan, 1));
		client.addRental(new Rental(kong, 1));
		client.addRental(new Rental(toyStory, 1));
		String actualReceipt = client.generateRentalsReceipt();
		
		// assert
		assertEquals("Con una renta", expectedReceipt, actualReceipt);
	}
}

