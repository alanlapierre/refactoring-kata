package videoclub.movie_price;

import videoclub.Movie;

public class PremiereMoviePrice extends MoviePrice {

    @Override
    public Integer getMovieType() {
        return Movie.PREMIERE;
    }

    @Override
    public Double calculatePrice(Integer daysOfRent) {
        return daysOfRent * 3D;
    }


    public Integer calculateLoyaltyPoints(Integer daysOfRent) {
        return daysOfRent > 1 ? 2 : 1;
    }
}
