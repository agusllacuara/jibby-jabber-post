package com.example.post.controller;

import com.example.post.model.Posts;
import com.example.post.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/getAll")
    public List<Posts> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/getAll/{user}")
    public List<Posts> getAllPostsByUserId (@PathVariable String user){return postService.getAllPostsForUserId(user);}

    @GetMapping("/create")
    public Posts getAllPosts(@RequestBody Posts post) {
        return postService.createPost(post);
    }
}
