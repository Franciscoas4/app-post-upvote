import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Post } from '../post-service/model-post';
import { PostServiceService } from '../post-service/post-service.service';

@Component({
  selector: 'app-modal-post',
  templateUrl: './modal-post.component.html',
  styleUrls: ['./modal-post.component.css']
})
export class ModalPostComponent implements OnInit {

  postForm: FormGroup;

  constructor(private formBuilder: FormBuilder,
              private postService: PostServiceService,
              public modalact: NgbActiveModal
              ) { }

  ngOnInit(): void {
    this.postForm = this.formBuilder.group({
      user: ['', [Validators.required, Validators.maxLength(20)]],
      postText: ['', [Validators.required, Validators.maxLength(255)]]
    })
  }

  savePost() {
    let post = this.postForm.getRawValue() as Post;
    this.postService.createPost(post).subscribe(
      res => {
        post = res;
        this.postForm.reset();
        this.modalact.close(post);
      }
    )
  }

}
