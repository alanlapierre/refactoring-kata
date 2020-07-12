package videoclub;

import java.util.ArrayList;
import java.util.Iterator;

public class Client {
	private String name;
	private ArrayList<Rental> rentals = new ArrayList<>();
	
	public Client(String nombre) {
		this.setName(nombre);
	}
	
	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String generateRentalsReceipt() {
		double totalPrice = 0;
		int loyaltyPoints = 0;
		StringBuilder result = new StringBuilder();
		result.append("Rentas del Cliente: " + getName() + "\n");
		Iterator<Rental> rentalsIterator = this.rentals.iterator();
		
		while (rentalsIterator.hasNext()) {

			Rental rental = rentalsIterator.next();
			Double rentalPrice = rental.calculatePrice();

			// Calcular puntos de cliente frecuente
			loyaltyPoints += rental.calculateLoyaltyPoints();
			
			// Muestra detalle de la renta
			result.append("\t" + rental.getMovie().getTitle() + "\t" + rentalPrice + "\n");
			totalPrice += rentalPrice;
		}
		
		// Agregar totales
		result.append("Cantidad a pagar: " + totalPrice + "\n");
		result.append("Has acumulado " + loyaltyPoints + " puntos adicionales a tu cuenta.");
		
		return result.toString();
	}

}
