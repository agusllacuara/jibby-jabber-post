package com.example.post.controller;

import com.example.post.mapper.PostMapper;
import com.example.post.model.HomePosts;
import com.example.post.model.PostDto;
import com.example.post.model.PostList;
import com.example.post.model.Posts;
import com.example.post.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;
    private final PostMapper postMapper;

    public PostController(PostService postService, PostMapper postMapper) {
        this.postService = postService;
        this.postMapper = postMapper;
    }

    @GetMapping("/getAll")
    public List<Posts> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/getAll/{userId}")
    public PostList getAllPostsByUserId (@PathVariable long userId){return postService.getAllPostsForUserId(userId);}

    @PostMapping("/getHomePosts")
    public PostList getAllHomeTweets (@RequestBody HomePosts homePosts) {
        return postService.findByUserIds(homePosts);}

    @PostMapping("/create")
    public Posts createPost(@RequestBody PostDto postDto) {
        Posts post = postMapper.postDtoToPost(postDto);
        return postService.createPost(post);
    }

    @PostMapping("/{id}/like")
    public Integer createPost(@PathVariable Long id, @RequestBody Long userId ) throws Exception {
        return postService.likePost(id, userId);
    }

    @DeleteMapping("{id}")
    public long deletePost(@PathVariable long id) {
        return postService.deletePost(id);
    }
}
