package edu.famu.rekkoapi.services;

import edu.famu.rekkoapi.models.parse.Friends;
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
