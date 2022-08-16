package com.tkc.spring.crud.repository;

import com.tkc.spring.crud.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
public class UserRepositoryImpl implements UserRepository {

   @PersistenceContext
   private EntityManager entityManager;

   @Override
   public void saveUser(User user) {
      User user1 = entityManager.merge(user);
      entityManager.persist(user1);
   }

   @Override
   public List<User> getAllUsers() {
      return entityManager.createQuery("select u from User u", User.class).getResultList();
   }

   @Override
   public User getUser(int id) {
      return entityManager.find(User.class, id);
   }

   @Override
   public void deleteUser(User user) {
      User jUser = entityManager.merge(user);
      if (user == null) {
         throw new NullPointerException("User not found");
      }
      entityManager.remove(jUser);
      entityManager.flush();
   }
}
