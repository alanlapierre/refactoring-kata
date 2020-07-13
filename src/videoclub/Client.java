package videoclub;

import videoclub.receipt_printer.ReceiptPrinter;

import java.util.ArrayList;
import java.util.Iterator;

public class Client {
	private String name;
	private ReceiptPrinter receiptPrinter;
	private ArrayList<Rental> rentals = new ArrayList<>();
	
	public Client(String name, ReceiptPrinter receiptPrinter) {

		this.name = name;
		this.receiptPrinter = receiptPrinter;
	}
	
	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String generateRentalsReceipt() {
		return this.receiptPrinter.generateRentalsReceipt(name, rentals);
	}

}
