package me.fsd.ass.mod.controller;


import me.fsd.ass.mod.dao.UserRepository;
import me.fsd.ass.mod.entity.User;
import me.fsd.ass.mod.model.UserDTO;
import me.fsd.ass.mod.model.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository usersRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User optionalUser = usersRepository.findByUserName(userName);



        if (optionalUser == null) {
            throw new UsernameNotFoundException("User not found with username: " + userName);
        }
        return new org.springframework.security.core.userdetails.User(optionalUser.getUserName(), optionalUser.getPassword(),
                new ArrayList<>());
    }


    public User save(UserDTO user){
        User newUser = new User();
        newUser.setUserName(user.getUsername());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        return usersRepository.save(newUser);
    }
}
