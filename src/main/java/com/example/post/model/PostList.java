package com.example.post.model;

import java.util.List;

public class PostList {

    List<Posts> postsList;

    public PostList(List<Posts> postsList) {
        this.postsList = postsList;
    }

    public List<Posts> getPostsList() {
        return postsList;
    }

    public void setPostsList(List<Posts> postsList) {
        this.postsList = postsList;
    }
}
