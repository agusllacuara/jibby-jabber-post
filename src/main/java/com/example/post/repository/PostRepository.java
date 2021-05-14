package com.example.post.repository;
import com.example.post.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Posts, Long> {

    public List<Posts> findAllByUserInfo(String userInfo);
}
