package videoclub.receipt_printer;

import videoclub.Rental;

import java.util.ArrayList;

public interface ReceiptPrinter {

    public String generateRentalsReceipt(String clientName, ArrayList<Rental> rentals);
}
