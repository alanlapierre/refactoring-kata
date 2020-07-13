package videoclub.movie_type.movie_price;

public class PremiereMoviePrice extends MoviePrice {

    @Override
    public Double calculatePrice(Integer daysOfRent) {
        return daysOfRent * 3D;
    }


    public Integer calculateLoyaltyPoints(Integer daysOfRent) {
        return daysOfRent > 1 ? 2 : 1;
    }
}
