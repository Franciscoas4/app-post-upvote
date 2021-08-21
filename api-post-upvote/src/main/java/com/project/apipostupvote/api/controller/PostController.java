package com.project.apipostupvote.api.controller;

import com.project.apipostupvote.api.modeldto.PostResume;
import com.project.apipostupvote.api.modeldto.input.PostInput;
import com.project.apipostupvote.domain.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PostResume postAdd(@Valid @RequestBody PostInput postInput) {

        return postService.createPost(postInput);
    }

    @GetMapping
    public List<PostResume> listPosts() {
        return postService.listAllPosts();
    }

    @PutMapping("/{postId}/upvote")
    public PostResume upvoteAdd(@PathVariable Long postId) {
        return postService.upvoteAdd(postId);
    }


}
