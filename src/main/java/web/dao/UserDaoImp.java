package web.dao;

import web.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.print.DocFlavor;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {


   private EntityManager entityManager;

   @PersistenceContext
   private void setEntityManager(EntityManager entityManager) {
      this.entityManager = entityManager;
   }

   @Override
   public List<User> getAllUsers() {
      return entityManager.createQuery("FROM User ", User.class).getResultList();
   }

   @Override
   public void updateUser(User user) {
      entityManager.merge(user);
   }

   @Override
   public void addUser(User user) {
      entityManager.persist(user);
   }

   @Override
   public User getUser(long id) {
      return entityManager.find(User.class, id);
   }

   @Override
   public void deleteUser(long id) {
      entityManager.remove(getUser(id));
   }
}
