package videoclub.movie_type.loyalty_calculator;

public class ChildLoyaltyCalculator extends LoyaltyCalculator{

    @Override
    public Integer calculateLoyaltyPoints(Integer daysOfRent) {
        return 1;
    }
}
