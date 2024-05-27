/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Rental;

/**
 *
 * @author Mhz
 */
public interface RentalInterface extends Remote{
    public String createRental(Rental rental) throws RemoteException;
    public String updateRental(Rental rental) throws RemoteException;
    public String deleteRental(Rental rental) throws RemoteException;
    public List<Rental> allRental() throws RemoteException;
    public Rental getRentalById(Rental rental) throws RemoteException;
}
