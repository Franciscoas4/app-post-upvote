import { Component, Input, OnInit } from '@angular/core';
import { Post } from '../post-service/model-post';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent{

  @Input() posts: Post[];

}
