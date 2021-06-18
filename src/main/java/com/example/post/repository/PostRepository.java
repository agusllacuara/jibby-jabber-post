package com.example.post.repository;
import com.example.post.model.Posts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Posts, Long> {

    List<Posts> findAllByUserId(long userId);

    @Query( "select p from Posts p where p.userId in :userId" )
    Page<Posts> findByUserIds(@Param("userId") List<Long> userId, Pageable pageable);
}
