package com.springjpa.onetomany.controller;

import com.springjpa.onetomany.model.Post;
import com.springjpa.onetomany.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController
{
    @Autowired
    private PostService postService;

    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post post)
    {
        return postService.addPost(post);
    }

    @GetMapping("/getAllPosts")
    public List<Post> getAll()
    {
        return postService.getAllPosts();
    }

    @GetMapping("/byId/{id}")
    public Post findById(@PathVariable Long id)
    {
        return postService.findById(id);
    }

    @PutMapping("/updatePost/{id}")
    public Post updatePost(@PathVariable Long id,@RequestBody Post post)
    {
        return postService.updatePost(id,post);
    }

    @DeleteMapping("/deletePost/{id}")
    public String deletePost(@PathVariable Long id)
    {
        return postService.deletePost(id);
    }
}
