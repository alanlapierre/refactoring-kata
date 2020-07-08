package videoclub;

public class PrecioPeliculaInfantil extends PrecioPelicula{
    @Override
    public Integer getTipoPelicula() {
        return Pelicula.INFANTIL;
    }
}
