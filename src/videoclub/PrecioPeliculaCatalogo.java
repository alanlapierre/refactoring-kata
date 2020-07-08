package videoclub;

public class PrecioPeliculaCatalogo extends PrecioPelicula{

    @Override
    public Integer getTipoPelicula() {
        return Pelicula.CATALOGO;
    }
}
