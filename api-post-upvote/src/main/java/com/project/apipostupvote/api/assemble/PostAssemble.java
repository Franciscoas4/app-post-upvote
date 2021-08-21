package com.project.apipostupvote.api.assemble;

import com.project.apipostupvote.api.modeldto.PostResume;
import com.project.apipostupvote.api.modeldto.input.PostInput;
import com.project.apipostupvote.domain.model.Post;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class PostAssemble {

    private ModelMapper modelMapper;

    public PostResume toModel(Post post) {
        return modelMapper.map(post, PostResume.class);
    }

    public List<PostResume> toCollectionModel(List<Post> posts) {
        return posts.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }

    public Post toEntity(PostInput postInput) {
        return modelMapper.map(postInput, Post.class);
    }
}
