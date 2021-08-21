import { Component, Input } from '@angular/core';
import { Post } from '../post-service/model-post';
import { PostServiceService } from '../post-service/post-service.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent{

  @Input() post: Post;

  constructor(private postService: PostServiceService) { }

  upvoteAdd() {
    this.postService.upvoteAdd(this.post.postId).subscribe(
      resp => this.post = resp
    );
  }

}
