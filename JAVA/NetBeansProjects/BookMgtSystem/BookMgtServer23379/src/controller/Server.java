/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import service.Implementation.BookImpl;
import service.Implementation.RentalImpl;
import service.Implementation.UserImpl;

/**
 *
 * @author Mhz
 */
public class Server  {
    
    public UserImpl userImpl;
    public BookImpl bookImpl;
    public RentalImpl rentalImpl;
    public Server() throws RemoteException{
        this.userImpl = new UserImpl();
        this.bookImpl = new BookImpl();
        this.rentalImpl = new RentalImpl();
    }
    public static void main(String [] args){
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry registry = LocateRegistry.createRegistry(81);
            registry.bind("user", new Server().userImpl);
            registry.bind("book", new Server().bookImpl);
            registry.bind("rental", new Server().rentalImpl);
            System.out.println("Server is running on port 81");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
