package videoclub;

import videoclub.movie_price.MovieType;

public class Movie {

	private String title;
	private MovieType movieType;
	
	public Movie(String title, MovieType movieType) {
		this.title = title;
		this.movieType = movieType;
	}

	public String getTitle() {
		return title;
	}

	public double calculatePrice(Integer daysOfRent) {
		return movieType.getMoviePrice().calculatePrice(daysOfRent);
	}

	public int calculateLoyaltyPoints(Integer daysOfRent) {
		return movieType.getMoviePrice().calculateLoyaltyPoints(daysOfRent);
	}

}
