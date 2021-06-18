package com.example.post.model;

import java.util.List;

public class PageablePostDto {
    List<Long> userIds;
    Integer pageNumber;

    public PageablePostDto(List<Long> userIds, Integer pageNumber) {
        this.userIds = userIds;
        this.pageNumber = pageNumber;
    }

    public PageablePostDto() {
    }

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
