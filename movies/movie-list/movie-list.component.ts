import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.scss']
})
export class MovieListComponent implements OnInit {

  movies:string[] = ['The Manchurian Candidates', 'Ocean 8', 'Terminator', 'Free Guy']

  constructor() { }

  ngOnInit(): void {
  }

}
