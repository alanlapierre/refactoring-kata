package videoclub;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente {
	private String nombre;
	private ArrayList<Renta> rentas = new ArrayList<>();
	
	public Cliente(String nombre) {
		this.setNombre(nombre);
	}
	
	public void agregarRenta(Renta renta) {
		rentas.add(renta);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String emitirReciboRenta() {
		double montoTotal = 0;
		int puntosClienteFrecuente = 0;
		StringBuilder resultado = new StringBuilder();
		resultado.append("Rentas del Cliente: " + getNombre() + "\n");
		Iterator<Renta> listaRentas = this.rentas.iterator();
		
		while (listaRentas.hasNext()) {

			Renta renta = listaRentas.next();
			Double monto = renta.calcularImporte();

			// Agregar puntos de cliente frecuente
			puntosClienteFrecuente++;
			
			// Agregar bono por renta de dos días en películas de estreno
			if ((renta.getPelicula().getTipo() == Pelicula.ESTRENO) && renta.getDiasRentada() > 1) {
				puntosClienteFrecuente++;
			}
			
			// Muestra detalle de la renta
			resultado.append("\t" + renta.getPelicula().getTitulo() + "\t" + monto + "\n");
			montoTotal += monto;
		}
		
		// Agregar totales
		resultado.append("Cantidad a pagar: " + montoTotal + "\n");
		resultado.append("Has acumulado " + puntosClienteFrecuente + " puntos adicionales a tu cuenta.");
		
		return resultado.toString();
	}

}
