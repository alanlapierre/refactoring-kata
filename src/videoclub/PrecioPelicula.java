package videoclub;

public abstract class PrecioPelicula {

    public abstract Integer getTipoPelicula();

    public abstract Double calcularImporte(Integer diasRentada);

    public Integer calcularPuntosClienteFrecuente(Integer diasRentada) {
        return 1;
    }

}

