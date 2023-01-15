package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
   List<User> getAllUsers();
   void addUser(User user);
   void updateUser(User user);
   User getUser(long id);
   void deleteUser(long id);
}
