package edu.famu.rekkoapi.controllers;

import edu.famu.rekkoapi.models.serializable.SerializableFriends;
import edu.famu.rekkoapi.models.parse.Friends;
import edu.famu.rekkoapi.services.FriendService;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;


public class FriendController {
    private FriendService friendService;

    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @GetMapping("/") //sets the path to this method
    public ArrayList<SerializableFriends> getFriend(@RequestParam(name = "sort" , required = false, defaultValue = "asc") String sort) {
        ArrayList<SerializableFriends> friends = new ArrayList<>();

        //Convert the Parse Product object to a POJO Product object that can be serialized by Spring
        ArrayList<Friends> list = friendService.retrieveFriends(sort);
        for(Friends p : list)
        {
            friends.add(p.getSerializable());
        }
        return friends;
    }

    //get only one based on object id
    @GetMapping("/find/{id}")
    public SerializableFriends getFriendById(@PathVariable String id){
        return friendService.getFriendById(id).getSerializable();
    }

    @PostMapping("/")
    public String createFriend(@RequestBody SerializableFriends friend){
        return friendService.addFriend(friend);
    }

    @DeleteMapping("/{id}")
    public String deleteFriend(@PathVariable String id)
    {
        return friendService.removeFriend(id);
    }

}
