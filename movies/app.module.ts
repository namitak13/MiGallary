import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { MovieListComponent } from './movie-list/movie-list.component';
import { ChoresListComponent } from './chores-list/chores-list.component';
import { FavPhotosComponent } from './fav-photos/fav-photos.component';
import { FavLinksComponent } from './fav-links/fav-links.component';

@NgModule({
  declarations: [ //collection of component will be added automatically while genrating component
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    MovieListComponent,
    ChoresListComponent,
    FavPhotosComponent,
    FavLinksComponent
  ],
  imports: [
    BrowserModule, //configure your application to browse into different platform
    AppRoutingModule
  ],
  providers: [], //collection of services which will acssible in all parts on application
  bootstrap: [AppComponent] //root components from where execution will start
})
export class AppModule { }
