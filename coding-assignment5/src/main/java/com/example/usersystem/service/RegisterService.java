package com.example.usersystem.service;

import com.example.usersystem.model.User;

public interface RegisterService {
    public User addUser(User user);
    public User getUser(String userName);
}
