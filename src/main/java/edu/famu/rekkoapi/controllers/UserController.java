package edu.famu.rekkoapi.controllers;

import edu.famu.rekkoapi.models.serializable.SerializableUser;
import edu.famu.rekkoapi.models.parse.User;
import edu.famu.rekkoapi.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;
@RestController
@RequestMapping("/api/v1/user")

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //get all
    @GetMapping("/") //sets the path to this method
    public ArrayList<SerializableUser> getUser(@RequestParam(name = "sort" , required = false, defaultValue = "asc") String sort) {
        ArrayList<SerializableUser> users = new ArrayList<>();

        //Convert the Parse Product object to a POJO Product object that can be serialized by Spring
        ArrayList<User> list = userService.retrieveUsers(sort);
        for(User p : list)
        {
            users.add(p.getSerializable());
        }
        return users;
    }

    //get only one based on object id
    @GetMapping("/find/{id}")
    public SerializableUser getHotelById(@PathVariable String id){
        return userService.getUserById(id).getSerializable();
    }

    @PostMapping("/")
    public String createUser(@RequestBody SerializableUser user){
        return userService.addUser(user);
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable String id, @RequestBody Map<String, Object> user)
    {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id)
    {
        return userService.removeUser(id);
    }
}
