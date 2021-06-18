package com.example.post.model;

import java.util.List;

public class HomePosts {
    List<Long> userIds;

    public HomePosts(List<Long> userIds) {
        this.userIds = userIds;
    }

    public HomePosts() {
    }

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }
}
