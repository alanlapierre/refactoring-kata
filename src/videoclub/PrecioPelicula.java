package videoclub;

public abstract class PrecioPelicula {

    public abstract Integer getTipoPelicula();

    public double calcularImporte(Integer diasRentada) {
        Double monto = 0D;
        switch (getTipoPelicula()) {
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

