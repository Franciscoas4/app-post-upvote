package com.project.apipostupvote.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Post {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @NotBlank
    @Size(max = 255)
    private String postText;

    @NotBlank
    @Size(min = 3, max = 60)
    private String user;

    private Integer upvote;

    private LocalDateTime registerTime;

    @PrePersist
    private void takeRegisterTime() {
        this.registerTime = LocalDateTime.now();
    }

    public void upvoteAdd() {
        if (this.upvote == null) {
            this.upvote = 0;
        }
        ++this.upvote;
    }
}
