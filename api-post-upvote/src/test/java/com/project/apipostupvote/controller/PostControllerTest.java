package com.project.apipostupvote.controller;

import com.project.apipostupvote.api.modeldto.PostResume;
import com.project.apipostupvote.api.modeldto.input.PostInput;
import com.project.apipostupvote.domain.service.PostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
public class PostControllerTest {

    @MockBean
    private PostService postService;

    @Test
    public void testIfCreatePost() {
        PostInput input = new PostInput("Test of post", "Francisco");
        PostResume resume = new PostResume(1L, "Test of post", "Francisco");

        BDDMockito.when(postService.createPost(input)).thenReturn(resume);

        PostResume postResume = postService.createPost(input);
        assertTrue(resume.equals(postResume));
    }

    @Test
    public void testIfReturnListOfPosts() {
        List<PostResume> postList = Arrays.asList(new PostResume(1L, "Test one", "Francisco"),
                new PostResume(1L, "Test two", "Francisco"), new PostResume(1L, "Test three", "Francisco"),
                new PostResume(1L, "Test four", "Francisco"));

        BDDMockito.when(postService.listAllPosts()).thenReturn(postList);

        List<PostResume> postReturn = postService.listAllPosts();
        assertTrue(postList.equals(postReturn));
    }
}
