package videoclub;

import videoclub.movie_price.CatalogMoviePrice;
import videoclub.movie_price.ChildMoviePrice;
import videoclub.movie_price.MoviePrice;
import videoclub.movie_price.PremiereMoviePrice;

public class Movie {
	public static final int CATALOG = 0;
	public static final int PREMIERE = 1;
	public static final int CHILD = 2;
	
	private String title;
	private MoviePrice moviePrice;
	
	public Movie(String title, int type) {
		setTitle(title);
		setType(type);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getType() {
		return moviePrice.getMovieType();
	}

	public void setType(int type) {

		switch (type) {
			case CATALOG:
				moviePrice = new CatalogMoviePrice();
				break;
			case PREMIERE:
				moviePrice = new PremiereMoviePrice();
				break;
			case CHILD:
				moviePrice = new ChildMoviePrice();
				break;
			default:
				throw new IllegalArgumentException("Tipo de película no es correcto");
		}

	}

	public double calculatePrice(Integer daysOfRent) {
		return moviePrice.calculatePrice(daysOfRent);
	}

	public int calculateLoyaltyPoints(Integer daysOfRent) {
		return moviePrice.calculateLoyaltyPoints(daysOfRent);
	}

}
