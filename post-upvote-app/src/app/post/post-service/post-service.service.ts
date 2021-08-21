import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Post } from './model-post';

const api = environment.api;

@Injectable({
  providedIn: 'root'
})
export class PostServiceService {

  constructor(private http: HttpClient) { }

  findAllPost(): Observable<Post[]> {
    const url = `${api}`;
    
    return this.http.get<Post[]>(url);
  }

  createPost(post: Post): Observable<Post> {
    const url = `${api}`;
    return this.http.post<Post>(url, post);
  }

  upvoteAdd(postId: number): Observable<Post> {
    const url = `${api}/${postId}/upvote`;
    return this.http.put<Post>(url, '');
  }
}
