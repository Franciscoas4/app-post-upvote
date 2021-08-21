package com.project.apipostupvote.api.modeldto;

import com.project.apipostupvote.domain.model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResume {

    private Long postId;
    private String text;
    private String user;
    private Integer upvote;
    private LocalDateTime registerTime;


    public PostResume(Post post) {
        this.postId = post.getPostId();
        this.text = post.getPostText();
        this.user = post.getUser();
        this.upvote = post.getUpvote() != null ? post.getUpvote().intValue() : 0;
        this.registerTime = post.getRegisterTime();
    }

    public PostResume(String text, String user) {
        this.text = text;
        this.user = user;
    }

    public PostResume(long postId, String text, String user) {
        this.postId = postId;
        this.text = text;
        this.user = user;
    }
}
