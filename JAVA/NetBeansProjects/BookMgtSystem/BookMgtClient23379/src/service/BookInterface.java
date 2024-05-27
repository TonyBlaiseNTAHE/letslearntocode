/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Book;

/**
 *
 * @author Mhz
 */
public interface BookInterface extends Remote{
    public String createBook(Book book) throws RemoteException;
    public String updateBook(Book book) throws RemoteException;
    public String deleteBook(Book book) throws RemoteException;
    public List<Book> allBook() throws RemoteException;
    public Book getBookById(Book book) throws RemoteException;
}
