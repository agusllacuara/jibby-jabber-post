package com.example.post.model;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "posts")
public class Posts {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String text;

    @NotNull
    private Timestamp date;

    @NotNull
    private long userId;

    public Posts() {

    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
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

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
