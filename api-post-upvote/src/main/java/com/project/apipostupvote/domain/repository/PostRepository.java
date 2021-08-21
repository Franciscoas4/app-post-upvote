package com.project.apipostupvote.domain.repository;

import com.project.apipostupvote.domain.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
