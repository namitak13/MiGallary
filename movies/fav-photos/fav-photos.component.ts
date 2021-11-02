import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fav-photos',
  templateUrl: './fav-photos.component.html',
  styleUrls: ['./fav-photos.component.scss']
})
export class FavPhotosComponent implements OnInit {

  imageUrl:string[] = ['assets/img1.jpg', 'assets/img2.jfif', 'assets/img3.jfif'];
 
  constructor() { }

  ngOnInit(): void {
  }

}
