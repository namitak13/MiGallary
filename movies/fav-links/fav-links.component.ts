import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fav-links',
  templateUrl: './fav-links.component.html',
  styleUrls: ['./fav-links.component.scss']
})
export class FavLinksComponent implements OnInit {

  links : string[]= ['https://www.w3schools.com/', 'https://webelements.com/'];
  constructor() { }

  ngOnInit(): void {
  }

}
