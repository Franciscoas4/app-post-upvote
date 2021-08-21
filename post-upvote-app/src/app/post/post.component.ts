import { Component, OnInit } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { ModalPostComponent } from './modal-post/modal-post.component';
import { Post } from './post-service/model-post';
import { PostServiceService } from './post-service/post-service.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  posts: Post[];
  more: boolean = true;

  constructor(private postService: PostServiceService,
              private modalServ: NgbModal
              ) { }

  ngOnInit() {
    this.getPosts();
  }

  private getPosts() {
    this.postService.findAllPost().subscribe(data => {
      this.posts = data
    });
  }

  morePost() {
    this.postService.findAllPost().subscribe(
      resp => {
        this.posts = this.posts.concat(resp);
        if (!resp.length) {
          this.more = false;
        }
      }
    );
  }

  postAdd() {
    const modalRef = this.modalServ.open(ModalPostComponent);
    modalRef.result.then(
      result => {
        this.postService.findAllPost().subscribe(resp => this.posts = resp);
        this.more = true;
      },
      error => console.log('Fechado sem inclusão de pots.', error)
    )
  }

}
