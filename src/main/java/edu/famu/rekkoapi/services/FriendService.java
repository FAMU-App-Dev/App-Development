package edu.famu.rekkoapi.services;

import edu.famu.rekkoapi.models.parse.Friends;
import edu.famu.rekkoapi.models.parse.User;
import edu.famu.rekkoapi.models.serializable.SerializableFriends;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseQuery;

import java.util.*;

public class FriendService {

    protected final Log logger = LogFactory.getLog(this.getClass()); //used to write to the console

    public ArrayList<Friends> retrieveFriends(String sort) {

        logger.info(Parse.isIsRootMode());
        final ArrayList<Friends> friends = new ArrayList<>();
        List<Friends> list;
        ParseQuery<Friends> query = ParseQuery.getQuery(Friends.class);
        try {
            if(sort.equals("asc")){
                list = query.orderByAscending("username").find();
            }else{
                list = query.orderByDescending("username").find();
            }

            for (Friends p : list) {
                friends.add(p);
            }
        }
        catch(Exception e)
        {
            logger.error("Error occurred", e);
        }
        logger.info(friends.size());
        return friends;
    }

    public Friends getFriendById(String id) {

        Friends friend = null;

        ParseQuery<Friends> query = ParseQuery.getQuery(Friends.class);

        try{
            friend = query.get(id); //gets a single record based on objectId
        }catch (ParseException e)
        {
            e.printStackTrace();
        }

        return friend;
    }

    public String removeFriend(String id) {
        String message;

        //defines the query for the product class
        ParseQuery<Friends> query = ParseQuery.getQuery(Friends.class);

        try
        {
            Friends friend = query.get(id); //get friend by id
            friend.delete(); //delete use
            message = "Friends" + id + "deleted."; //success message
        } catch (ParseException e) {
            e.printStackTrace();
            message = "Error while deleting friend. " + e.getMessage(); //error message
        }
        return message;
    }


    public String addFriend(SerializableFriends friend) {

        String message; //message we will return to the user

        Friends parseFriends = new Friends(); //Parse Product Object

        //set the value of each of the fields
        parseFriends.setName(friend.getName());
        parseFriends.setPicture(friend.getPicture());
        parseFriends.setSender(friend.getSender());
        parseFriends.setReceiver(friend.getReceiver());


        try {
            parseFriends.save(); //runs the query to insert the new value
            message = "Friend Created"; //set success the return message
        } catch (ParseException e) {
            e.printStackTrace(); //print the error to the console
            //set the error return message
            message = "Error creating friend. " + e.getMessage();
        }

        return message;
    }
}
