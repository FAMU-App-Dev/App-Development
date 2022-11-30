package edu.famu.rekkoapi.services;

import edu.famu.rekkoapi.models.parse.Friends;
import edu.famu.rekkoapi.models.parse.Post;
import edu.famu.rekkoapi.models.serializable.SerializableFriends;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.parse4j.ParseException;
import org.parse4j.ParseQuery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public class FriendService {

    protected final Log logger = LogFactory.getLog(this.getClass()); //used to write to the console
    public static String updateFriend(String id, Map<String, Object> friend) {

        String message;

        String[] strList = {"img", "name", "recommendation"};

        //defines the query for the product class
        ParseQuery<Post> query = ParseQuery.getQuery(Post.class);

        try{
            Post use = query.get(id); //retrieves the product by it's objectid
            post.forEach((k,v) -> {
                if(Objects.equals(k, "isAdmin"))
                    use.put(k,(Boolean)v);
                else if (Arrays.asList(strList).contains(k))
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

    public ArrayList<Friends> retrieveFriends(String sort) {
        return null;
    }

    public Friends getFriendById(String id) {
        return null;
    }

    public String removeFriend(String id) {
        return id;
    }

    public String addFriend(SerializableFriends friend) {
        return null;
    }
}
