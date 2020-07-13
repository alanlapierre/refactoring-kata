package videoclub.movie_type.loyalty_calculator;

public class PremiereLoyaltyCalculator extends LoyaltyCalculator{

    @Override
    public Integer calculateLoyaltyPoints(Integer daysOfRent) {
        return daysOfRent > 1 ? 2 : 1;
    }
}
