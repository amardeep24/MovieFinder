package com.amardeep.movie.service;

import java.util.Optional;

import com.amardeep.movie.entity.Movie;

public interface MovieSearchService {
	public Optional<Movie> getMovieByTitle(String title);
	public Optional<Movie> getMovieByImdbId(String id);

}
