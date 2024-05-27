/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.Implementation;

import dao.BookDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Book;
import service.BookInterface;

/**
 *
 * @author Mhz
 */
public class BookImpl extends UnicastRemoteObject implements BookInterface{

    public BookDao dao = new BookDao();
    
    public BookImpl() throws RemoteException{
        super();
    }
    
    
    @Override
    public String createBook(Book book) throws RemoteException {
        return dao.createBook(book);
    }

    @Override
    public String updateBook(Book book) throws RemoteException {
        return dao.updateBook(book);
    }

    @Override
    public String deleteBook(Book book) throws RemoteException {
        return dao.deleteBook(book);
    }

    @Override
    public List<Book> allBook() throws RemoteException {
        return dao.allBook();
    }

    @Override
    public Book getBookById(Book book) throws RemoteException {
        return dao.getBookById(book);
    }
    
}
