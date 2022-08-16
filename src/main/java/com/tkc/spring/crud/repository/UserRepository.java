package com.tkc.spring.crud.repository;

import com.tkc.spring.crud.entity.User;

import java.util.List;

public interface UserRepository {
   public void saveUser(User user);
   public List<User> getAllUsers();
   public User getUser(int id);
   public void deleteUser(User user);
}
