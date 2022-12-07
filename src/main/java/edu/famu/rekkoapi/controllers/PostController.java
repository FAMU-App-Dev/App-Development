package edu.famu.rekkoapi.controllers;

import edu.famu.rekkoapi.models.serializable.SerializablePost;
import edu.famu.rekkoapi.models.parse.Post;
import edu.famu.rekkoapi.services.PostService;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/api/v1/post")

public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/") //sets the path to this method
    public ArrayList<SerializablePost> getPost(@RequestParam(name = "sort" , required = false, defaultValue = "asc") String sort) {
        ArrayList<SerializablePost> post = new ArrayList<>();

        //Convert the Parse Product object to a POJO Product object that can be serialized by Spring
        ArrayList<Post> list = postService.retrievePosts(sort);
        for(Post p : list)
        {
            post.add(p.getSerializable());
        }
        return post;
    }

    //get only one based on object id
    @GetMapping("/find/{id}")
    public SerializablePost getPostById(@PathVariable String id){
        return postService.getPostById(id).getSerializable();
    }
    @GetMapping("/movie/{MovieId}")
    public ArrayList<SerializablePost> getPostByMovieId(@PathVariable int MovieId)
    {
        ArrayList<SerializablePost> post = new ArrayList<>();
        ArrayList<Post> list = postService.getPostByMovieId(MovieId);
        for(Post p : list)
        {
            post.add(p.getSerializable());
        }
        return post;
    }
    @PostMapping("/")
    public String createPost(@RequestBody SerializablePost post){
        return postService.addPost(post);
    }

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable String id)
    {
        return postService.removePost(id);
    }

}
