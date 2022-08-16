package com.tkc.spring.crud.service;

import com.tkc.spring.crud.entity.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);
    List<User> getAllUsers();
    public User getUser(int id);
    public void deleteUser(User user);
}
