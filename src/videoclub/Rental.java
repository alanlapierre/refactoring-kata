package videoclub;

public class Rental {
	private Movie movie;
	private int daysOfRent;
	
	public Rental(Movie movie, int daysOfRent ) {
		this.movie = movie;
		this.daysOfRent = daysOfRent;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysOfRent() {
		return daysOfRent;
	}

    public double calculatePrice() {
        return getMovie().calculatePrice(getDaysOfRent());
    }

	public int calculateLoyaltyPoints() {
		return getMovie().calculateLoyaltyPoints(getDaysOfRent());
	}
}
