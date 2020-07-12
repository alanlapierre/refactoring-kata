package videoclub;

public class Rental {
	private Movie movie;
	private int daysOfRent;
	
	public Rental(Movie movie, int daysOfRent ) {
		setMovie(movie);
		setDaysOfRent(daysOfRent);
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getDaysOfRent() {
		return daysOfRent;
	}

	public void setDaysOfRent(int daysOfRent) {
		this.daysOfRent = daysOfRent;
	}

    public double calculatePrice() {
        return getMovie().calculatePrice(getDaysOfRent());
    }

	public int calculateLoyaltyPoints() {
		return getMovie().calculateLoyaltyPoints(getDaysOfRent());
	}
}
