package videoclub.movie_type;

import videoclub.movie_type.loyalty_calculator.CatalogLoyaltyCalculator;
import videoclub.movie_type.loyalty_calculator.ChildLoyaltyCalculator;
import videoclub.movie_type.loyalty_calculator.LoyaltyCalculator;
import videoclub.movie_type.loyalty_calculator.PremiereLoyaltyCalculator;
import videoclub.movie_type.movie_price.CatalogMoviePrice;
import videoclub.movie_type.movie_price.ChildMoviePrice;
import videoclub.movie_type.movie_price.MoviePrice;
import videoclub.movie_type.movie_price.PremiereMoviePrice;

public enum MovieType {
    CATALOG(new CatalogMoviePrice(), new CatalogLoyaltyCalculator()),
    PREMIERE(new PremiereMoviePrice(), new PremiereLoyaltyCalculator()),
    CHILD(new ChildMoviePrice(), new ChildLoyaltyCalculator());

    private MoviePrice moviePrice;
    private LoyaltyCalculator loyaltyCalculator;

    MovieType(MoviePrice moviePrice, LoyaltyCalculator loyaltyCalculator){

        this.moviePrice = moviePrice;
        this.loyaltyCalculator = loyaltyCalculator;
    }

    public MoviePrice getMoviePrice(){
        return moviePrice;
    }

    public LoyaltyCalculator getLoyaltyCalculator() { return loyaltyCalculator; }
}
