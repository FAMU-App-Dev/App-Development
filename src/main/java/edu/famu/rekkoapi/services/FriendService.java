package edu.famu.rekkoapi.services;

import edu.famu.rekkoapi.models.parse.Friends;
import edu.famu.rekkoapi.models.serializable.SerializableFriends;

import java.util.ArrayList;
import java.util.Map;

public class FriendService {
    public static String updateFriend(String id, Map<String, Object> friend) {
        return id;
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
