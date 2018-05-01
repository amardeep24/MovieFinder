import { Component, OnInit } from '@angular/core';
import { MovieService } from "../movie.service";
import { Movie } from "../movie";

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {

  movie: Movie;
  
  constructor(private movieService: MovieService) { }

  ngOnInit() {
  }
  getMovieByTitle(title: string){
    this.movieService.getMovieByTitle(title).subscribe(data=>{
      this.movie = data;
    });
  }

}
