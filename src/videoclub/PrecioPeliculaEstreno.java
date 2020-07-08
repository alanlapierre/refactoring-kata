package videoclub;

public class PrecioPeliculaEstreno extends PrecioPelicula{

    @Override
    public Integer getTipoPelicula() {
        return Pelicula.ESTRENO;
    }
}
