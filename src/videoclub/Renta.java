package videoclub;

public class Renta {
	private Pelicula pelicula;
	private int diasRentada;
	
	public Renta(Pelicula pelicula, int diasRentada ) {
		setPelicula(pelicula);
		setDiasRentada(diasRentada);
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public int getDiasRentada() {
		return diasRentada;
	}

	public void setDiasRentada(int diasRentada) {
		this.diasRentada = diasRentada;
	}

    public double calcularImporte() {
        Double monto = 0D;
        switch (getPelicula().getTipo()) {
			case Pelicula.CATALOGO:
				monto += 2;
				if (getDiasRentada() > 2) {
					monto += (getDiasRentada() - 2) * 1.5;
				}
				break;
			case Pelicula.ESTRENO:
				monto += getDiasRentada() * 3;
				break;
			case Pelicula.INFANTIL:
				monto += 1.5;
				if (getDiasRentada() > 3) {
				monto += (getDiasRentada() - 3) * 1.5;
				}
				break;
			default:
				break;
			}
			return monto;
    }
}
