package videoclub.movie_price;

public abstract class MoviePrice {

    public abstract Integer getMovieType();

    public abstract Double calculatePrice(Integer daysOfRent);

    public Integer calculateLoyaltyPoints(Integer daysOfRent) {
        return 1;
    }

}

