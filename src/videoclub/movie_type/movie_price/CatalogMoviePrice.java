package videoclub.movie_type.movie_price;


public class CatalogMoviePrice extends MoviePrice {

    @Override
    public Double calculatePrice(Integer daysOfRent) {
        Double rentalPrice = 2D;
        if (daysOfRent > 2) {
            rentalPrice += (daysOfRent - 2) * 1.5;
        }
        return rentalPrice;
    }
}