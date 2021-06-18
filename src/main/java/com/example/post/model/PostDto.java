package com.example.post.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PostDto {
    private Long id;
    private String content;
    private Timestamp date;
    private Long userId;
    private List<Long> likes;
    private List<Long>  reposts;
    private String media;
    private List<String> threads;

    public PostDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getLikes() {
        return likes;
    }

    public void setLikes(List<Long> likes) {
        this.likes = likes;
    }

    public List<Long> getReposts() {
        return reposts;
    }

    public void setReposts(List<Long> reposts) {
        this.reposts = reposts;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public List<String> getThreads() {
        return threads;
    }

    public void setThreads(List<String> threads) {
        this.threads = threads;
    }


}
