package com.springjpa.onetomany.service;

import com.springjpa.onetomany.model.Post;
import com.springjpa.onetomany.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService
{
    @Autowired
    private PostRepository repository;

    public Post addPost(Post post)
    {
        return repository.save(post);
    }

    public List<Post> getAllPosts()
    {
        return repository.findAll();
    }

    public Post findById(Long id)
    {
        return repository.findById(id).orElseThrow(()->new RuntimeException("Not found"));
    }

    public Post updatePost(Long id,Post fetchPost)
    {
        Post post=findById(id);
        post.setTitle(fetchPost.getTitle());
        post.setComments(fetchPost.getComments());
        post.setDescription(fetchPost.getDescription());
        return repository.save(post);
    }

    public String deletePost(Long id)
    {
        Post post=findById(id);
        repository.delete(post);
        return "Post with id "+id+" has been deleted from DataBase";
    }
}
