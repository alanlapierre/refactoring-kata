package videoclub;

public class PrecioPeliculaInfantil extends PrecioPelicula{
    @Override
    public Integer getTipoPelicula() {
        return Pelicula.INFANTIL;
    }

    @Override
    public Double calcularImporte(Integer diasRentada) {
        Double monto = 1.5D;
        if (diasRentada > 3) {
            monto += (diasRentada - 3) * 1.5;
        }
        return monto;
    }
}
