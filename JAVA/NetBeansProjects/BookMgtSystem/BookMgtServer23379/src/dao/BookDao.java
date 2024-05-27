/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Mhz
 */
public class BookDao {
    // CRUD
    public String createBook(Book book) {
        Session ss  = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(book);
        tr.commit();
        ss.close();
        return "Data saved Successfully";
    }
    public String updateBook(Book book) {
        Session ss  = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.update(book);
        tr.commit();
        ss.close();
        return "Data Updated Successfully";
    }
    public String deleteBook(Book book) {
        Session ss  = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.delete(book);
        tr.commit();
        ss.close();
        return "User deleted Successfully";
    }
    
    public List<Book> allBook(){
        Session  ss  = HibernateUtil.getSessionFactory().openSession();
        List<Book> bookList = (List<Book>) ss.createQuery("select book from Book book").list();
        ss.close();
        return bookList;
    }
    
    public Book getBookById(Book book) {
        Session ss  = HibernateUtil.getSessionFactory().openSession();
        Book blue = (Book) ss.get(Book.class, book.getBookId());
        ss.close();
        return blue;
    }
}
