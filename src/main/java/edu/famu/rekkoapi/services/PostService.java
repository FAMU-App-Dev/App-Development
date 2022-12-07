package edu.famu.rekkoapi.services;

import edu.famu.rekkoapi.models.serializable.SerializablePost;
import edu.famu.rekkoapi.models.parse.Post;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseQuery;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PostService {
    protected final Log logger = LogFactory.getLog(this.getClass()); //used to write to the console
    public ArrayList<Post> retrievePosts(String sort)
    {

        logger.info(Parse.isIsRootMode());
        final ArrayList<Post> posts = new ArrayList<>();
        List<Post> list;
        ParseQuery<Post> query = ParseQuery.getQuery(Post.class);
        try {
            if(sort.equals("asc")){
                list = query.orderByAscending("Like").find();
            }else{
                list = query.orderByDescending("Like").find();
            }

            for (Post p : list) {
                posts.add(p);
            }
        }
        catch(Exception e)
        {
            logger.error("Error occurred", e);
        }
        logger.info(posts.size());
        return posts;
    }

    public Post getPostById(String id)
    {
        Post post = null;

        ParseQuery<Post> query = ParseQuery.getQuery(Post.class);

        try{
            post = query.get(id); //gets a single record based on objectId
        }catch (ParseException e)
        {
            e.printStackTrace();
        }

        return post;
    }

    public ArrayList<Post> getPostByMovieId(int MovieId)
    {
        final ArrayList<Post> posts = new ArrayList<>();

        ParseQuery<Post> query = ParseQuery.getQuery(Post.class);
        query.whereEqualTo("MovieId", MovieId);
        List<Post> list;
        try{
            list = query.find();
            for (Post p : list) {
                posts.add(p);
            }
        }catch (ParseException e)
        {
            e.printStackTrace();
        }

        return posts;
    }

    public String addPost(SerializablePost post)
    {
        String message; //message we will return to the user

        Post parsePost = new Post(); //Parse Post Object

        //set the value of each of the fields
        parsePost.setNAME(post.getName());
        parsePost.setDESC(post.getDescription());
        parsePost.setTEST(post.getTestimonial());
        parsePost.setTYPE(post.getType());
        parsePost.setPOSTER(post.getPoster().getId());
        parsePost.setMOVIEID(post.getMovieId());


        try {
            parsePost.save(); //runs the query to insert the new value
            message = "Post Created"; //set success the return message
        } catch (ParseException e) {
            e.printStackTrace(); //print the error to the console
            //set the error return message
            message = "Error creating product. " + e.getMessage();
        }

        return message;
    }

    public String updatePost(String id, Map<String, Object> post)
    {
        String message;

        String[] strList = {"name", "Description", "Testimonial", "Type", "Poster"};

        //defines the query for the post class
        ParseQuery<Post> query = ParseQuery.getQuery(Post.class);

        try{
            Post use = query.get(id); //retrieves the product by it's objectid
            post.forEach((k,v) -> {
                if (Arrays.asList(strList).contains(k))
                    use.put(k,(String)v);
            });
            use.save(); //execute update query
            message = "Post Updated."; //success message
        } catch (ParseException e) {
            e.printStackTrace();
            message = "Error updating post. " + e.getMessage(); //failure message
        }

        return message;
    }

    public String removePost(String id)
    {
        String message;

        //defines the query for the post class
        ParseQuery<Post> query = ParseQuery.getQuery(Post.class);

        try
        {
            Post post = query.get(id); //get post by id
            post.delete(); //delete post
            message = "Post" + id + "deleted."; //success message
        } catch (ParseException e) {
            e.printStackTrace();
            message = "Error while deleting post. " + e.getMessage(); //error message
        }

        return message;
    }
}
