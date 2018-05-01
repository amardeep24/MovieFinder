package com.amardeep.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amardeep.movie.entity.Movie;
import com.amardeep.movie.service.MovieSearchService;

@RestController
public class MovieController {
	
	@Autowired
	MovieSearchService movieSearchService;
	
	@GetMapping(value = "/getMovieByTitle",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Movie> getMovieByTitle(@RequestParam("title") String title){
		Movie movie = movieSearchService.getMovieByTitle(title).orElse(new Movie());
		return new ResponseEntity<>(movie,HttpStatus.OK);
	}

}
