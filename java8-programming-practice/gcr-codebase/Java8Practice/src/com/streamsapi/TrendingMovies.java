package com.streamsapi;

/*Top 5 Trending Movies
○ Scenario: From a huge movie list, find the top 5 based on rating and release
year.
○ Task: Use filter(), sorted(), limit().*/
import java.time.LocalDate;
import java.util.List;

public class TrendingMovies {
	record Movie(String name, double rating, LocalDate releaseDate) {}
	
	List<Movie> movies = List.of(
	    new Movie("Sholay", 8.2, LocalDate.of(1975, 8, 15)),
	    new Movie("Mughal-E-Azam", 8.1, LocalDate.of(1960, 8, 5)),
	    new Movie("Mother India", 8.1, LocalDate.of(1957, 2, 25)),
	    new Movie("Pyaasa", 8.4, LocalDate.of(1957, 2, 19)),
	    new Movie("Guide", 8.4, LocalDate.of(1965, 2, 6)),
	    new Movie("Lagaan", 8.1, LocalDate.of(2001, 6, 15)),
	    new Movie("Swades", 8.2, LocalDate.of(2004, 12, 17)),
	    new Movie("Dil Chahta Hai", 8.1, LocalDate.of(2001, 8, 10)),
	    new Movie("Rang De Basanti", 8.1, LocalDate.of(2006, 1, 26)),
	    new Movie("Taare Zameen Par", 8.4, LocalDate.of(2007, 12, 21)),
	    new Movie("3 Idiots", 8.4, LocalDate.of(2009, 12, 25)),
	    new Movie("Andhadhun", 8.2, LocalDate.of(2018, 10, 5)),
	    new Movie("Drishyam", 8.2, LocalDate.of(2015, 7, 31)),
	    new Movie("Dangal", 8.3, LocalDate.of(2016, 12, 23)),
	    new Movie("PK", 8.1, LocalDate.of(2014, 12, 19)),
	    new Movie("Bajrangi Bhaijaan", 8.1, LocalDate.of(2015, 7, 17)),
	    new Movie("Black", 8.2, LocalDate.of(2005, 2, 4)),
	    new Movie("Gangs of Wasseypur", 8.2, LocalDate.of(2012, 6, 22)),
	    new Movie("Barfi!", 8.1, LocalDate.of(2012, 9, 14)),
	    new Movie("Udaan", 8.1, LocalDate.of(2010, 7, 16))
	);
	
	public static void main(String[] args) {
			    TrendingMovies app = new TrendingMovies();
	    
	    app.movies.stream()
	        .sorted((m1, m2) -> {
	            int ratingCompare = Double.compare(m2.rating(), m1.rating());
	            if (ratingCompare != 0) {
	                return ratingCompare;
	            } else {
	                return m2.releaseDate().compareTo(m1.releaseDate());
	            }
	        })
	        .limit(5)
	        .forEach(movie -> 
	            System.out.println("Name: " + movie.name() + ", Rating: " + movie.rating() + ", Release Date: " + movie.releaseDate())
	        );
		
	}
}
