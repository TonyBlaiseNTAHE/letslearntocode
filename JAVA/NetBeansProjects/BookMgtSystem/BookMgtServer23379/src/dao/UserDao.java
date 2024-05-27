/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.User;
import org.hibernate.*;

/**
 *
 * @author Mhz
 */
public class UserDao {
    // CRUD
    public String createUser(User user) {
        Session ss  = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(user);
        tr.commit();
        ss.close();
        return "Data saved Successfully";
    }
    public String updateUser(User user) {
        Session ss  = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.update(user);
        tr.commit();
        ss.close();
        return "User updated Successfully";
    }
    public String deleteUser(User user) {
        Session ss  = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.delete(user);
        tr.commit();
        ss.close();
        return "User deleted Successfully";
    }
    
    public List<User> allUser(){
        Session  ss  = HibernateUtil.getSessionFactory().openSession();
        List<User> userList = (List<User>) ss.createQuery("select user from User user").list();
        ss.close();
        return userList;
    }
    
    public User getUserById(User user) {
        Session ss  = HibernateUtil.getSessionFactory().openSession();
        User tony = (User) ss.get(User.class, user.getUserId());
        ss.close();
        return tony;
    }
}
