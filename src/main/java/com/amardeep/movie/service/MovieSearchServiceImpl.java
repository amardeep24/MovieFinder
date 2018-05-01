package com.amardeep.movie.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.amardeep.movie.entity.Movie;

@Service
public class MovieSearchServiceImpl implements MovieSearchService{
	
	@Value("${omdb.api.key}")
	private String omdbApiKey;
	
	@Value("${omdb.api.url}")
	private String omdbUrl;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Optional<Movie> getMovieByTitle(String title) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(this.omdbUrl)
									.queryParam("apikey",this.omdbApiKey)
								    .queryParam("t", title);
		String url = builder.build().toUriString();
		ResponseEntity<Movie> movieResponse = restTemplate.getForEntity(url, Movie.class);
		Movie movie = movieResponse.getBody();
		return Optional.ofNullable(movie);
	}

	@Override
	public Optional<Movie> getMovieByImdbId(String id) {
		return null;
	}

}
