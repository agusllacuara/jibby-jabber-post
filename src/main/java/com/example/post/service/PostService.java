package com.example.post.service;

import com.example.post.model.Posts;
import com.example.post.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Posts> getAllPosts() {
        return postRepository.findAll();
    }
}
