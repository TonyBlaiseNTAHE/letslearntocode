/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.Implementation;

import dao.RentalDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Rental;
import service.RentalInterface;

/**
 *
 * @author Mhz
 */
public class RentalImpl extends UnicastRemoteObject implements RentalInterface{

    public RentalImpl() throws RemoteException{
        super();
    }
    public RentalDao dao = new RentalDao();
    
    @Override
    public String createRental(Rental rental) throws RemoteException {
        return dao.createRental(rental);
    }

    @Override
    public String updateRental(Rental rental) throws RemoteException {
        return dao.updateRental(rental);
    }

    @Override
    public String deleteRental(Rental rental) throws RemoteException {
        return dao.deleteRental(rental);
    }

    @Override
    public List<Rental> allRental() throws RemoteException {
        return dao.allUser();
    }

    @Override
    public Rental getRentalById(Rental rental) throws RemoteException {
        return dao.getRentalById(rental);
    }
    
}
