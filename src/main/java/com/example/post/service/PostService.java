package com.example.post.service;

import com.example.post.model.HomePosts;
import com.example.post.model.PostList;
import com.example.post.model.Posts;
import com.example.post.repository.PostRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Posts> getAllPosts() {
        return postRepository.findAll();
    }

    public PostList getAllPostsForUserId(long userId) {
        return new PostList(postRepository.findAllByUserId(userId));
    }


    public PostList findByUserIds(HomePosts homePosts) {
//        Pageable pageable =  PageRequest.of(pageablePostDto.getPageNumber(), 50);
        return new PostList(postRepository.findByUserIds(homePosts.getUserIds()));
    }

    public PostList getAllWithPagination(int pageNumber) {
        return new PostList(postRepository.findAll(PageRequest.of(pageNumber, 50)).toList());
    }

    public Posts createPost(Posts post) {
        return postRepository.save(post);
    }

    public long deletePost(long id) {
        postRepository.deleteById(id);
        return id;
    }

    public Integer likePost(Long id, Long userId) throws Exception {
        Optional<Posts> optionalPost = postRepository.findById(id);
        if (optionalPost.isPresent()) {
            Posts post = optionalPost.get();
            List<Long> likes = post.getLikes();
            if(likes.contains(userId)) likes.remove(userId);
            else likes.add(userId);
            post.setLikes(likes);
            postRepository.save(post);
            return likes.size();
        } throw new Exception("Post not found");
    }
}
