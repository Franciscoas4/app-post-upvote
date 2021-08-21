package com.project.apipostupvote.domain.service;

import com.project.apipostupvote.api.assemble.PostAssemble;
import com.project.apipostupvote.api.modeldto.PostResume;
import com.project.apipostupvote.api.modeldto.input.PostInput;
import com.project.apipostupvote.domain.exception.PostNotFound;
import com.project.apipostupvote.domain.model.Post;
import com.project.apipostupvote.domain.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostService {

    private PostRepository postRepository;

    private PostAssemble postAssemble;

    public List<PostResume> listAllPosts() {
        return postRepository.findAll(Sort.by("registerTime").descending())
                .stream()
                .map(postAssemble::toModel)
                .collect(Collectors.toList());
    }



    public PostResume createPost(PostInput input) {
        Post post = new Post();
        post.setPostText(input.getPostText());
        post.setUser(input.getUser());
        post = postRepository.save(post);

        return postAssemble.toModel(post);
    }

    public PostResume upvoteAdd(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new PostNotFound("Post not found"));
        post.upvoteAdd();
        post = postRepository.save(post);
        return new PostResume(post);
    }

}
