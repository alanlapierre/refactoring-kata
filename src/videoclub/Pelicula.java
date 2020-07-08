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
		return precio.calcularImporte(diasRentada);
	}

	public int calcularPuntosClienteFrecuente(Integer diasRentada) {
		return precio.calcularPuntosClienteFrecuente(diasRentada);
	}

}
