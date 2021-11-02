import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-chores-list',
  templateUrl: './chores-list.component.html',
  styleUrls: ['./chores-list.component.scss']
})
export class ChoresListComponent implements OnInit {

  chores: string[]= ['Empty diswasher', 'Complete LaunchCode prep work', 'Buy groceries']
  constructor() { }

  ngOnInit(): void {
  }

}
