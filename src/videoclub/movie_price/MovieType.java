package videoclub.movie_price;

public enum MovieType {
    CATALOG(new CatalogMoviePrice()),
    PREMIERE(new PremiereMoviePrice()),
    CHILD(new ChildMoviePrice());

    private MoviePrice moviePrice;

    MovieType(MoviePrice moviePrice){
        this.moviePrice = moviePrice;
    }

    public MoviePrice getMoviePrice(){
        return moviePrice;
    }
}
