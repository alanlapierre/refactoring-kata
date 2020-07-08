package videoclub;

public class PrecioPeliculaCatalogo extends PrecioPelicula {

    @Override
    public Integer getTipoPelicula() {
        return Pelicula.CATALOGO;
    }

    @Override
    public Double calcularImporte(Integer diasRentada) {
        Double monto = 2D;
        if (diasRentada > 2) {
            monto += (diasRentada - 2) * 1.5;
        }
        return monto;
    }
}