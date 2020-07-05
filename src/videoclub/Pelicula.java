package videoclub;

public class Pelicula {
	public static final int CATALOGO = 0;
	public static final int ESTRENO = 1;
	public static final int INFANTIL = 2;
	
	private String titulo;
	private int tipo;
	
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
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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

}
