package com.example.post.mapper;

import com.example.post.model.PostDto;
import com.example.post.model.Posts;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {

    public PostMapper() {
    }

    public Posts postDtoToPost(PostDto postDto) {
        Posts post =  new Posts();
        post.setContent(postDto.getContent());
        post.setDate(postDto.getDate());
        post.setLikes(postDto.getLikes());
        post.setMedia(postDto.getMedia());
        post.setThreads(postDto.getThreads());
        post.setUserId(postDto.getUserId());
        post.setReposts(postDto.getReposts());
        return post;
    }
}
