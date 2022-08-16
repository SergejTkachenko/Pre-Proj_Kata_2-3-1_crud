package com.tkc.spring.crud.service;

import com.tkc.spring.crud.entity.User;
import com.tkc.spring.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

   private final UserRepository userRepository;

   @Autowired
   public UserServiceImp(UserRepository userRepository) {
      this.userRepository = userRepository;
   }

   @Override
   public void saveUser(User user) {
      userRepository.saveUser(user);
   }

   @Override
   public List<User> getAllUsers() {
      return userRepository.getAllUsers();
   }

   @Override
   public User getUser(int id) {
      return userRepository.getUser(id);
   }

   @Override
   public void deleteUser(User user) {
      userRepository.deleteUser(user);
   }
}
