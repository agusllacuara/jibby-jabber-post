package com.example.post.model;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "posts")
public class Posts {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String content;

    @NotNull
    private Timestamp date;

    @NotNull
    private Long userId;

    @NotNull
    @ElementCollection
    private List<Long> likes;

    @NotNull
    @ElementCollection
    private List<Long>  reposts;

    @Column(columnDefinition = "TEXT")
    public String media;

    @NotNull
    @ElementCollection
    public List<String> threads;

    public Posts() {

    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getDate() {
        return date;
    }

    public long getUserId() {
        return userId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setUserId(long user) {
        this.userId = user;
    }

    public void setLikes(List<Long> likes) {
        this.likes = likes;
    }

    public void setReposts(List<Long> reposts) {
        this.reposts = reposts;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public void setThreads(List<String> threads) {
        this.threads = threads;
    }

    public List<Long> getLikes() {
        return likes;
    }

    public List<Long> getReposts() {
        return reposts;
    }

    public String getMedia() {
        return media;
    }

    public List<String> getThreads() {
        return threads;
    }
}
