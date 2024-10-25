package com.springjpa.onetomany.repository;

import com.springjpa.onetomany.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long>
{

}
