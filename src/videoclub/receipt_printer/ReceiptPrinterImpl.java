package videoclub.receipt_printer;

import videoclub.Rental;

import java.util.ArrayList;
import java.util.Iterator;

public class ReceiptPrinterImpl implements ReceiptPrinter{

    @Override
    public String generateRentalsReceipt(String clientName, ArrayList<Rental> rentals){

        double totalPrice = 0;
        int loyaltyPoints = 0;
        StringBuilder result = new StringBuilder();
        result.append("Rentas del Cliente: " + clientName + "\n");
        Iterator<Rental> rentalsIterator = rentals.iterator();

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
