package videoclub.movie_price;

import videoclub.Movie;

public class ChildMoviePrice extends MoviePrice {
    @Override
    public Integer getMovieType() {
        return Movie.CHILD;
    }

    @Override
    public Double calculatePrice(Integer daysOfRent) {
        Double rentalPrice = 1.5D;
        if (daysOfRent > 3) {
            rentalPrice += (daysOfRent - 3) * 1.5;
        }
        return rentalPrice;
    }
}
