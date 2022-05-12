package com.example.usersystem.security;

import com.example.usersystem.exception.UserAlreadyExistException;
import com.example.usersystem.exception.UserNotFoundException;
import com.example.usersystem.model.User;
import com.example.usersystem.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsSvcImpl implements UserDetailsService {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserRepository userRepository;

    /**
     * 1. given user name , return user and password
     * 2. user found do not return password
     * 3. user found and do not return userName
     * 3. no use found
     *
     * @param username
     * @return
     * @throws UserNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UserNotFoundException {
        try {
            return getUserDetailsInternal(username);
        } catch (Exception e) {
            logger.error("loadUserByUsername:returned user not found", e);
            throw e;
        }
    }

    private UserDetails getUserDetailsInternal(String username) {
        List<User> users = userRepository.findByUserName(username);
        System.out.println("users.size() == " + users.size());
        if (users.size() == 0) {
            throw new UserNotFoundException("User '" + username + "' not found");
        }
        User user = users.get(0);
        System.out.println("username: " + user.getUserName());
        System.out.println("password: " + user.getPassword());
        UserDetails userDetails = org.springframework.security.core.userdetails.User.withUsername(user.getUserName()).password(user.getPassword()).authorities("USER").build();
        return userDetails;
    }
}
