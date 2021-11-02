import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'My First Angular Application ';
  msg:string = 'Hello from angular';
  getTitle():string{
    return this.title;
  }
  imageUrl:string = 'assets/img.jpg';
}
