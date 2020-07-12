package videoclub.movie_price;

import videoclub.Movie;

public class CatalogMoviePrice extends MoviePrice {

    @Override
    public Integer getMovieType() {
        return Movie.CATALOG;
    }

    @Override
    public Double calculatePrice(Integer daysOfRent) {
        Double rentalPrice = 2D;
        if (daysOfRent > 2) {
            rentalPrice += (daysOfRent - 2) * 1.5;
        }
        return rentalPrice;
    }
}