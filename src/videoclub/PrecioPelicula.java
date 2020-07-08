package videoclub;

public abstract class PrecioPelicula {

    public abstract Integer getTipoPelicula();

    public abstract Double calcularImporte(Integer diasRentada);

    public Integer calcularPuntosClienteFrecuente(Integer diasRentada) {
        Integer puntosClienteFrecuente = 1;
        // Agregar bono por renta de dos días en películas de estreno
        if ((getTipoPelicula() == Pelicula.ESTRENO) && diasRentada > 1) {
            puntosClienteFrecuente++;
        }
        return puntosClienteFrecuente;
    }

}

