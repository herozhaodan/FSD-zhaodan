package me.fsd.ass.mod.controller;

import me.fsd.ass.mod.dao.UserRepository;
import me.fsd.ass.mod.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //@PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping
    public List<User> getUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }

    @PostMapping
    public void addUser(User user){
        userRepository.saveAndFlush(user);
    }

}
