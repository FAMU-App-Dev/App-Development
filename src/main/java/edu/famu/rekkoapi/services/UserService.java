package edu.famu.rekkoapi.services;
import edu.famu.rekkoapi.models.serializable.SerializableUser;
import edu.famu.rekkoapi.models.parse.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseQuery;
import org.parse4j.ParseUser;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {
    protected final Log logger = LogFactory.getLog(this.getClass()); //used to write to the console

    public ArrayList<SerializableUser> retrieveUsers(String sort)
    {

        logger.info(Parse.isIsRootMode());
        final ArrayList<SerializableUser> users = new ArrayList<>();
        List<ParseUser> list;
        ParseQuery<ParseUser> query = ParseQuery.getQuery(ParseUser.class);
        try {
            if(sort.equals("asc")){
                list = query.orderByAscending("username").find();
            }else{
                list = query.orderByDescending("username").find();
            }

            for (ParseUser p : list) {
                users.add(new SerializableUser(p.getObjectId(), p.getUsername(), p.getString("password"), "email", p.getString("Bio"), p.getString("Picture"), p.getString("city")));
            }
        }
        catch(Exception e)
        {
            logger.error("Error occurred", e);
        }
        logger.info(users.size());
        return users;
    }

    public User getUserById(String id)
    {
        User user = null;

        ParseQuery<User> query = ParseQuery.getQuery(User.class);

        try{
            user = query.get(id); //gets a single record based on objectId
        }catch (ParseException e)
        {
            e.printStackTrace();
        }

        return user;
    }

    public String addUser(SerializableUser user)
    {
        String message; //message we will return to the user

        User parseUser = new User(); //Parse Product Object

        //set the value of each of the fields
        parseUser.setUsername(user.getUsername());
        parseUser.setPassword(user.getPassword());
        parseUser.setEmail(user.getEmail());
        parseUser.setBio(user.getBio());
        parseUser.setPicture(user.getPicture());
        parseUser.setCity(user.getCity());

        try {
            parseUser.save(); //runs the query to insert the new value
            message = "User Created"; //set success the return message
        } catch (ParseException e) {
            e.printStackTrace(); //print the error to the console
            //set the error return message
            message = "Error creating user. " + e.getMessage();
        }

        return message;
    }

    public String updateUser(String id, Map<String, Object> user)
    {
        String message;

        String[] strList = {"username", "password", "email", "Bio", "img", "city"};

        //defines the query for the product class
        ParseQuery<User> query = ParseQuery.getQuery(User.class);

        try{
            User use = query.get(id); //retrieves the product by it's objectid
            user.forEach((k,v) -> {
                if(Objects.equals(k, "isAdmin"))
                    use.put(k,(Boolean)v);
                else if (Arrays.asList(strList).contains(k))
                    use.put(k,(String)v);
            });
            use.save(); //execute update query
            message = "User Updated."; //success message
        } catch (ParseException e) {
            e.printStackTrace();
            message = "Error updating user. " + e.getMessage(); //failure message
        }

        return message;
    }

    public String removeUser(String id)
    {
        String message;

        //defines the query for the product class
        ParseQuery<User> query = ParseQuery.getQuery(User.class);

        try
        {
            User user = query.get(id); //get user by id
            user.delete(); //delete use
            message = "User" + id + "deleted."; //success message
        } catch (ParseException e) {
            e.printStackTrace();
            message = "Error while deleting user. " + e.getMessage(); //error message
        }

        return message;
    }
}