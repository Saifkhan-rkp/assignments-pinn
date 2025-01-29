package com.pinnacle.social.post;

import org.springframework.web.bind.annotation.RestController;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getMethodName() {
        return postService.getAllPosts();
    }

    @GetMapping("/post/{id}")
    public Post getUserById(@PathVariable("id") String id) {
        return postService.getPostById(Integer.parseInt(id));
    }
}