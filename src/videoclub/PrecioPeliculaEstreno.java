package videoclub;

public class PrecioPeliculaEstreno extends PrecioPelicula{

    @Override
    public Integer getTipoPelicula() {
        return Pelicula.ESTRENO;
    }

    @Override
    public Double calcularImporte(Integer diasRentada) {
        return diasRentada * 3D;
    }


    public Integer calcularPuntosClienteFrecuente(Integer diasRentada) {
        return diasRentada > 1 ? 2 : 1;
    }
}
