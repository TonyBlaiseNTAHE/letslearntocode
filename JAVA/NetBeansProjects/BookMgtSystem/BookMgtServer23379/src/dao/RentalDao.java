/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Rental;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Mhz
 */
public class RentalDao {
    // CRUD
    public String createRental(Rental rental) {
        Session ss  = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(rental);
        tr.commit();
        ss.close();
        return "Data saved Successfully";
    }
    public String updateRental(Rental rental) {
        Session ss  = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.update(rental);
        tr.commit();
        ss.close();
        return "Data updated Successfully";
    }
    public String deleteRental(Rental rental) {
        Session ss  = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.delete(rental);
        tr.commit();
        ss.close();
        return "Rental deleted Successfully";
    }
    
    public List<Rental> allUser(){
        Session  ss  = HibernateUtil.getSessionFactory().openSession();
        List<Rental> rentalList = (List<Rental>) ss.createQuery("select rental from Rental rental").list();
        ss.close();
        return rentalList;
    }
    
    public Rental getRentalById(Rental rental) {
        Session ss  = HibernateUtil.getSessionFactory().openSession();
        Rental r = (Rental) ss.get(Rental.class, rental.getId());
        ss.close();
        return r;
    }
}
