package videoclub;

public class Pelicula {
	public static final int CATALOGO = 0;
	public static final int ESTRENO = 1;
	public static final int INFANTIL = 2;
	
	private String titulo;
	private PrecioPelicula precio;
	
	public Pelicula(String titulo, int tipo) {
		setTitulo(titulo);
		setTipo(tipo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTipo() {
		return precio.getTipoPelicula();
	}

	public void setTipo(int tipo) {

		switch (tipo) {
			case CATALOGO:
				precio  = new PrecioPeliculaCatalogo();
				break;
			case ESTRENO:
				precio = new PrecioPeliculaEstreno();
				break;
			case INFANTIL:
				precio = new PrecioPeliculaInfantil();
				break;
			default:
				throw new IllegalArgumentException("Tipo de película no es correcto");
		}

	}

	public double calcularImporte(Integer diasRentada) {
		Double monto = 0D;
		switch (getTipo()) {
			case Pelicula.CATALOGO:
				monto += 2;
				if (diasRentada > 2) {
					monto += (diasRentada - 2) * 1.5;
				}
				break;
			case Pelicula.ESTRENO:
				monto += diasRentada * 3;
				break;
			case Pelicula.INFANTIL:
				monto += 1.5;
				if (diasRentada > 3) {
					monto += (diasRentada - 3) * 1.5;
				}
				break;
			default:
				break;
		}
		return monto;
	}

	public int calcularPuntosClienteFrecuente(Integer diasRentada) {
		Integer puntosClienteFrecuente = 1;
		// Agregar bono por renta de dos días en películas de estreno
		if ((getTipo() == Pelicula.ESTRENO) && diasRentada > 1) {
			puntosClienteFrecuente++;
		}
		return puntosClienteFrecuente;
	}

}
