package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Movie[] movies = new Movie[10];
		initializeMovies(movies, random);

		displayAllMovieTitlesWithHighestRating(movies);
	}

	public static void initializeMovies(Movie[] movieArray, Random randomRating) {
		for (int i = 0; i < movieArray.length; i++) {
			Movie movie = new Movie();
			movie.setTitle("Movie " + i);
			movie.setRating(randomRating.nextInt(10));
			movieArray[i] = movie;
		}
	}

	public static int findHighestRating(Movie[] moviesArray) {
		int maximum = 0;
		for (Movie movie : moviesArray) {
			if (movie.getRating() > maximum) {
				maximum = movie.getRating();
			}
		}
		return maximum;
	}

	public static void displayAllMovieTitlesWithHighestRating(Movie[] moviesArray) {
		int highestRating = findHighestRating(moviesArray);
		ArrayList<String> moviesWithHighestRating = new ArrayList<>(10);
		for (Movie movie : moviesArray) {
			if (movie.getRating() == highestRating) {
				moviesWithHighestRating.add("Movie Title: " + movie.getTitle() + " | Rating: " + movie.getRating());
			}
		}
		System.out.println(moviesWithHighestRating);
	}
}